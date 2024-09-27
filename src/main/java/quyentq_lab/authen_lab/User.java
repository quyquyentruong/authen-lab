package quyentq_lab.authen_lab;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;


//@Table(name = "users")
//@Entity
//@Data
//public class User implements UserDetails {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(nullable = false)
//    private Integer id;
//
//    @Column(nullable = false)
//    private String fullName;
//
//    @Column(unique = true, length = 100, nullable = false)
//    private String email;
//
//    @Column(nullable = false)
//    private String password;
//
//    @CreationTimestamp
//    @Column(updatable = false, name = "created_at")
//    private Date createdAt;
//
//    @UpdateTimestamp
//    @Column(name = "updated_at")
//    private Date updatedAt;
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return List.of();
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    // Getters and setters
//}


@Table(name = "users")
@Entity
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String email;
}
