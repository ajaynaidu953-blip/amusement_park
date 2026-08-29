package com.ajay.amusezone.service;
import com.ajay.amusezone.dto.*; import com.ajay.amusezone.entity.User; import com.ajay.amusezone.repository.UserRepository; import com.ajay.amusezone.security.JwtService; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.stereotype.Service;
@Service public class AuthService { private final UserRepository users; private final PasswordEncoder encoder; private final JwtService jwt;
 public AuthService(UserRepository users,PasswordEncoder encoder,JwtService jwt){this.users=users;this.encoder=encoder;this.jwt=jwt;}
 public AuthResponse register(RegisterRequest r){if(users.findByEmail(r.email()).isPresent()) throw new RuntimeException("Email already registered"); User u=new User(r.name(),r.email(),encoder.encode(r.password()),r.phone()); u.setRole("USER"); users.save(u); return new AuthResponse(jwt.generateToken(u),u.getId(),u.getName(),u.getEmail(),u.getRole());}
 public AuthResponse login(LoginRequest r){User u=users.findByEmail(r.email()).orElseThrow(()->new RuntimeException("Invalid email or password")); if(!encoder.matches(r.password(),u.getPassword())) throw new RuntimeException("Invalid email or password"); return new AuthResponse(jwt.generateToken(u),u.getId(),u.getName(),u.getEmail(),u.getRole());}
}
