package co.edu.usbcali.banco.modelo;
// Generated 13/04/2018 09:07:58 PM by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoUsuario generated by hbm2java
 */
@Entity
@Table(name = "tipo_usuario", schema = "public")
public class TipoUsuario implements java.io.Serializable {

	private long tiusId;
	private String nombre;
	private char activo;
	private Set<Usuario> usuarios = new HashSet<Usuario>(0);

	public TipoUsuario() {
	}

	public TipoUsuario(long tiusId, String nombre, char activo) {
		this.tiusId = tiusId;
		this.nombre = nombre;
		this.activo = activo;
	}

	public TipoUsuario(long tiusId, String nombre, char activo, Set<Usuario> usuarios) {
		this.tiusId = tiusId;
		this.nombre = nombre;
		this.activo = activo;
		this.usuarios = usuarios;
	}

	@Id

	@Column(name = "tius_id", unique = true, nullable = false)
	public long getTiusId() {
		return this.tiusId;
	}

	public void setTiusId(long tiusId) {
		this.tiusId = tiusId;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "activo", nullable = false, length = 1)
	public char getActivo() {
		return this.activo;
	}

	public void setActivo(char activo) {
		this.activo = activo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoUsuario")
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
