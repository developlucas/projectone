package com.example.projetct.model;

import lombok.*;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class ClientModel {

    private int id;
    private String name;
    public static List<ClientModel> clientList;

    static {
        clientRepository();
    }

    private static void clientRepository(){
        clientList = new ArrayList<>(asList(new ClientModel(1, "Lucas"), new ClientModel(2, "Andre")));
    }
}
