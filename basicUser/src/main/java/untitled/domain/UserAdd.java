package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.BasicUserApplication;
import untitled.domain.UserAdd;

@Entity
@Table(name = "UserAdd_table")
@Data
public class UserAdd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String tenantId;

    private String useStatus;

    private String userId;

    private String pass;

    private String userName;

    @PostPersist
    public void onPostPersist() {
        UserAdd userAdd = new UserAdd(this);
        userAdd.publishAfterCommit();
    }

    public static UserAddRepository repository() {
        UserAddRepository userAddRepository = BasicUserApplication.applicationContext.getBean(
            UserAddRepository.class
        );
        return userAddRepository;
    }
}
