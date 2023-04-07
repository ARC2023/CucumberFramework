package stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class DataTables {

	@Given("I want to show data table as list")
	public void i_want_to_show_data_table_as_list() {

	}

	@When("I recevie below mentioned data in table as list")
	public void i_recevie_below_mentioned_data_in_table_as_list(DataTable dataTable) {
		List<String> datatable = dataTable.asList();
		for (String str : datatable) {
			System.out.println("DataTable as List Only -->" + str);

		}

	}

	@Then("my list is iterated successfully")
	public void my_list_is_iterated_successfully() {

	}

	@Given("I want to show data table as list of list")
	public void i_want_to_show_data_table_as_list_of_list() {

	}

	@When("I recevie below mentioned data in table as list of list")
	public void i_recevie_below_mentioned_data_in_table_as_list_of_list(DataTable dataTable) {
		List<List<String>> datatable = dataTable.asLists(String.class);
		for (List<String> str : datatable) {
			for (String str1 : str) {
				System.out.println("DataTable as List of List -->" + str1);

			}

		}

	}

	@Given("I want to show data table as map")
	public void i_want_to_show_data_table_as_map() {

	}

	@When("I recevie below mentioned data in table as map")
	public void i_recevie_below_mentioned_data_in_table_as_map(DataTable dataTable) {
		int counter = 1;
		List<Map<String, String>> datatable = dataTable.asMaps(String.class, String.class);
		System.out.println("Traditional For Loop");
		for (int i = 0; i < datatable.size(); i++) {
			System.out.println("For index -->" + counter++);
			System.out.println("Name-->" + datatable.get(i).get("Name"));
			System.out.println("Email-->" + datatable.get(i).get("Email"));
			System.out.println("City-->" + datatable.get(i).get("City"));
			System.out.println("Number-->" + datatable.get(i).get("Number"));
		}
		System.out.println("For each For Loop");
		counter = 1;
		for (Map<String, String> str : datatable) {
			System.out.println("For index -->" + counter++);
			System.out.println("Name-->" + str.get("Name"));
			System.out.println("Email-->" + str.get("Email"));
			System.out.println("City-->" + str.get("City"));
			System.out.println("Number-->" + str.get("Number"));
		}
		System.out.println("For each Loop using keyset");
		counter = 1;
		for (Map<String, String> str : datatable) {
			System.out.println("For index -->" + counter++);
			for (String keys : str.keySet()) {
				System.out.println("Maps-->" + str.get(keys));

			}

		}

	}

	@Given("I want to show data table as map only")
	public void i_want_to_show_data_table_as_map_only() {

	}

	@When("I recevie below mentioned data in table as map only")
	public void i_recevie_below_mentioned_data_in_table_as_map_only(DataTable dataTable) {
		Map<String, String> dataAsMaps = dataTable.asMap(String.class, String.class);

	}
}
