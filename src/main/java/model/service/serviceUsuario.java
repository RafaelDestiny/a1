package model.service;


import model.Usuario;
import model.record.UsuarioRecord;
import model.repository.EnderecoRepository;
import model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceUsuario {
    @Autowired
    UsuarioRepository usuarioRepository;

    public void cadastrarUsuario(UsuarioRecord usuario){

        usuarioRepository.save(new Usuario(usuario));

    }



}
