package com.example.projetct.endpoint;
import com.example.projetct.model.ClientModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("clients")
public class ClientEndpoint {
    @RequestMapping(method = RequestMethod.GET)
        public ResponseEntity<?>listAll(){
            return new ResponseEntity<>(ClientModel.clientList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?>save(@RequestBody ClientModel clientModel){
        ClientModel.clientList.add(clientModel);
        return new ResponseEntity<>(clientModel, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?>delete(@RequestBody ClientModel clientModel){
        ClientModel.clientList.remove(clientModel);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?>update(@RequestBody ClientModel clientModel){
        ClientModel.clientList.remove(clientModel);
        ClientModel.clientList.add(clientModel);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
