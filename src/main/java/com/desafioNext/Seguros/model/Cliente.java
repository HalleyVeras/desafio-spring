package com.desafioNext.Seguros.model;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.mapping.List;
import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private int age;
    private int dependents;
    private int income;
    private String maritalStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    @OneToMany(mappedBy = "Cliente", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Casa> Casas=new ArrayList<>();
    @OneToMany(mappedBy = "Cliente",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Veiculo> veiculos= new ArrayList<>();
    
}
