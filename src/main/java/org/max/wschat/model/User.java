package org.max.wschat.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "username")
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotEmpty
    @Column(name = "password")
    private String password;

    @NotEmpty
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @NotEmpty
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;
}
