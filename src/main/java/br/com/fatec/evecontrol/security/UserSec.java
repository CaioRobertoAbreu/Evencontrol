package br.com.fatec.evecontrol.security;

import br.com.fatec.evecontrol.model.PerfilUsuario;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
public class UserSec //implements UserDetails
                    {

    private Long id;
    private String email;
    private String senha;
    //private Collection<? extends GrantedAuthority> authorities;


    public UserSec(Long id, String email, String senha, Set<PerfilUsuario> perfis) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        //this.authorities = perfis.stream()
        //        .map(p -> new SimpleGrantedAuthority(p.getDescricao()))
        //        .collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    //@Override
    //public Collection<? extends GrantedAuthority> getAuthorities() {
    //    return authorities;
    //}

    //@Override
    public String getPassword() {
        return senha;
    }

    //@Override
    public String getUsername() {
        return email;
    }

    //@Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //@Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    //@Override
    public boolean isEnabled() {
        return true;
    }
}
