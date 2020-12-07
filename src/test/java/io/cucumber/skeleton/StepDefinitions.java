package io.cucumber.skeleton;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait 1 hour")
    public void iWait1Hour() {
//        List<String> list = dt.asList(String.class);
//        System.out.println("Username - " + list.get(0));
//        System.out.println("Password - " + list.get(1));
        System.out.println("Hello");
       // List<List<String>> data = dt.asLists(String.class);
        //List<String> list = dt.asList(String.class);
//        String buildingName = data.get(1).get(1);
//        String reference = data.get(2).get(1);
//        System.out.println(buildingName);
//        System.out.println(reference);
    }


    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
        System.out.println("Hello");
    }
}
