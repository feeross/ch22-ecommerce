package org.generation.app.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data //Genera los setter and getter con lombok
@Table( name = "customer")
public class Customer {
	public static final int FIELD_MAX_LENGTH = 160;

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="id_customer")
	private long idCustomer;
	@Column(name="first_name", length = FIELD_MAX_LENGTH)
	private String firstName;
	@Column(name="last_name", length = FIELD_MAX_LENGTH)
	private String lastName;
	@Column(name="email", nullable = false, updatable = false, unique = true, length = FIELD_MAX_LENGTH)
	private String email;
	@Column(name="password", length = FIELD_MAX_LENGTH)
	private String password;
	@Column(name="avatar", length = FIELD_MAX_LENGTH)
	private String avatar;
	@Column(name="is_active")
	private boolean active;
	

}
