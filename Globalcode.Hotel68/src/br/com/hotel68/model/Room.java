package br.com.hotel68.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Room
 *
 */
@SuppressWarnings("serial")
@Entity
public class Room implements Serializable {

	@Id    
	private Integer id;
	private String name;
	/*
	 * Se usado @Enumerated(EnumType.ORDINAL), podemos usar coluna do tipo int que o JPA
	 * mapeara com os valores do Enum na ordem que forem declarados.
	 */
	@Enumerated(EnumType.STRING)
	private RoomType type;
	

	public Room() {
		super();
	}   

	public Room(int _id, String _name, RoomType _type) {
		this.id = _id;
		this.name = _name;
		this.type = _type;
	}

	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public RoomType getType() {
		return this.type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
   
}
