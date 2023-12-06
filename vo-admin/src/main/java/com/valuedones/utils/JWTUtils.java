package com.valuedones.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SecureDigestAlgorithm;

import javax.crypto.SecretKey;
import java.time.Instant;
import java.util.Date;
import java.util.Map;

public class JWTUtils {
    private static final String SECRET_KEY = "ValuedOnesValuedOnesValuedOnesValuedOnesValuedOnes";
    private static final SecretKey SECRET = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    private static final int ACCESS_EXPIRE = 3600;
    private static final SecureDigestAlgorithm<SecretKey, SecretKey> ALGORITHM = Jwts.SIG.HS256;


    public static String getJWT(Map<String, Object> claims) {
        return Jwts.builder()
                .header()
                .add("typ", "JWT")
                .add("alg", "HS256")
                .and()
                .claims(claims)
                .expiration(Date.from(Instant.now().plusSeconds(ACCESS_EXPIRE)))
                .signWith(SECRET, ALGORITHM)
                .compact();
    }
}
