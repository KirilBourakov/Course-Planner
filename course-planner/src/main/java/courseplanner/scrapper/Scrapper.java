package courseplanner.scrapper;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import courseplanner.shared.Course;

public class Scrapper {

	ArrayList<Course> fetch(String url) throws IOException {
		Document doc = Jsoup.connect(url).get();
			
		ArrayList<Element> tables = doc.select("table").asList();
		
		ArrayList<Course> courses = new ArrayList<>();
		for (Element table : tables) {
			ArrayList<Element> heads = table.select("th").asList();
			if (heads.size() >= 3) {
				courses.add(new Course(
					heads.getFirst().toString(),
					heads.get(1).toString(),
					"des",
					1
				));
			}
		}
		
		return courses;
	}
}
