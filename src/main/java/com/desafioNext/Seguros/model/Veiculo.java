package com.desafioNext.Seguros.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="Veiculo")
public class Veiculo {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String model;
    private int year;

    @ManyToAny
    @JoinColumn(name="Cliente_id")
    private Cliente cliente;
    
    
    
}
