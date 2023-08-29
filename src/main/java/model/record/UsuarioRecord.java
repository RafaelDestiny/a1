package model.record;


public record UsuarioRecord(String nome, String sobreNome, String dataDeCriacao,
                            String numero, String email, EnderecoRecord endereco) {
}
