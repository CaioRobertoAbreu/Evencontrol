package br.com.fatec.evecontrol.validations;

import br.com.fatec.evecontrol.exception.ExceptionEvecontrolNotFound;
import br.com.fatec.evecontrol.model.DonoEvento;
import br.com.fatec.evecontrol.model.Evento;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventoValidation {

    public void existsEvento(Optional<Evento> evento){

        if(evento.isEmpty()){

            throw new ExceptionEvecontrolNotFound(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.toString(),
                    "Evento não encontrado");
        }
    }

    public void existsDonoEvento(Optional<DonoEvento> optional){

        if(optional.isEmpty()){
            throw new ExceptionEvecontrolNotFound(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.toString(),
                    "Dono do evento não encontrado");
        }

    }
}