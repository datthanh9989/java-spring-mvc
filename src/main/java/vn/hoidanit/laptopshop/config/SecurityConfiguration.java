package vn.hoidanit.laptopshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfiguration {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // ĐÂY LÀ ĐOẠN LỆNH ĐUỔI ÔNG BẢO VỆ ĐI CHƠI
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize
                .anyRequest().permitAll() // Lệnh 1: Cho phép tất cả các đường dẫn (URL) đi qua mà không cần hỏi pass
            )
            .csrf(csrf -> csrf.disable()); // Lệnh 2: Tắt khiên chống giả mạo để Form bấm Submit không bị lỗi 403
            
        return http.build();
    }
}