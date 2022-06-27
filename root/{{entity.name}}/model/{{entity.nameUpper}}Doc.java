package {{path}}.{{entity.name}}.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class {{entity.nameUpper}}Doc {

    @Id
    {{#entityProperties}}
            {{level}} {{type}} {{name}};
            {{/entityProperties}}
//    private ObjectId id;
//
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;
//
//    private Company company = new Company();
//    private Address address = new Address();




}
