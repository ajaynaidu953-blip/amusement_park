package com.ajay.amusezone.security;
import com.ajay.amusezone.entity.User; import io.jsonwebtoken.*; import io.jsonwebtoken.security.Keys; import org.springframework.beans.factory.annotation.Value; import org.springframework.stereotype.Service; import java.nio.charset.StandardCharsets; import java.security.Key; import java.util.Date;
@Service public class JwtService {
 private final Key key; private final long expiration;
 public JwtService(@Value("${app.jwt.secret}") String secret,@Value("${app.jwt.expiration-ms}") long expiration){key=Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));this.expiration=expiration;}
 public String generateToken(User u){return Jwts.builder().subject(u.getEmail()).claim("role",u.getRole()).claim("userId",u.getId()).issuedAt(new Date()).expiration(new Date(System.currentTimeMillis()+expiration)).signWith(key).compact();}
 public String extractUsername(String token){return parse(token).getPayload().getSubject();}
 public String extractRole(String token){return parse(token).getPayload().get("role",String.class);}
 public boolean isValid(String token){try{parse(token);return true;}catch(JwtException|IllegalArgumentException e){return false;}}
 private Jws<Claims> parse(String token){return Jwts.parser().verifyWith((javax.crypto.SecretKey)key).build().parseSignedClaims(token);}
}
