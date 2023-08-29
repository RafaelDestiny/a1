package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.record.EnderecoRecord;
import model.record.UsuarioRecord;

@Entity
@Table(name ="usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String nome;
    @Column(name= "sobreNome")
   private  String sobreNome;
    @Column(name = "dataDeCriacao")
   private String dataDeCriacao;

   private String numero;

   private String email;


    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Endereco endereco;

    public Usuario(UsuarioRecord dados) {

        nome = dados.nome();
        sobreNome = dados.sobreNome();
        dataDeCriacao = dados.dataDeCriacao();
        numero = dados.numero();
        email = dados.email();
        endereco = new Endereco(dados.endereco());
    }
}
