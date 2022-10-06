package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Indenxed extends AbstractEvent {

    private Long id;

    public Indenxed(Index aggregate){
        super(aggregate);
    }
    public Indenxed(){
        super();
    }
}
