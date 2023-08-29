package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import model.record.EnderecoRecord;
import model.record.UsuarioRecord;

@Entity
@Table(name = "endereco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  Long  id;


   @OneToOne
   @MapsId
   @JoinColumn(name = "usuario_id")
   private Usuario usuario;
   private String estado;

   private  String cidade;

   private String bairro;

    private String cep;

    private String rua;

   private String numero;

   private String complemento;


 public Endereco(EnderecoRecord dados) {
 }
}












