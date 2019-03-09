package org.max.wschat.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class ChatUpUserDetailsAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {


    @Override
    protected UserDetails retrieveUser(final String username, final UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        return null;
    }

    @Override
    protected final void additionalAuthenticationChecks(final UserDetails userDetails, final UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {

    }
}
