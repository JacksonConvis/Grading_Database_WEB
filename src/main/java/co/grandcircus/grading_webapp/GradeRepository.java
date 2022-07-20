package co.grandcircus.grading_webapp;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.yaml.snakeyaml.events.Event.ID;

public interface GradeRepository<T> extends MongoRepository<T, ID> {

}
