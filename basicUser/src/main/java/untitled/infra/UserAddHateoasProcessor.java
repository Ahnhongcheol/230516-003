package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class UserAddHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserAdd>> {

    @Override
    public EntityModel<UserAdd> process(EntityModel<UserAdd> model) {
        return model;
    }
}
