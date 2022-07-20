package co.grandcircus.grading_webapp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("flowers") // Or whatever collection name you want

public class Grade {

	@Id
	private String id;
	private String name;
	private String type;
	private double score;
	private double total;
}
