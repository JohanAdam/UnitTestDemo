package io.reciteapp.androidtests;

import static io.reciteapp.androidtests.FirstNameExtractor.extractFirstName;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExampleUnitTest {
  private static String NYAN = "Nyan";

  //methodName_Input_ResultItShouldGiveWithGivenInput
  @Test
  public void extractFirstName_NullInput_ReturnEmptyString() {
    assertThat(extractFirstName(null), is(""));
  }

  @Test
  public void extractFirstName_EmptyString_ReturnEmptyString() {
    assertThat(extractFirstName(""), is(""));
  }

  @Test
  public void extractFirstName_FullName_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan Pasus"), is(NYAN));
  }

  @Test
  public void extractFirstName_FullNameAroundWhiteSpaces_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan Pasus   "), is(NYAN));
    assertThat(extractFirstName("   Nyan Pasus"), is(NYAN));
    assertThat(extractFirstName("Nyan     Pasus"), is(NYAN));
    assertThat(extractFirstName("   Nyan Pasus    "), is(NYAN));
    assertThat(extractFirstName(" Nyan Pasus    "), is(NYAN));
  }

  @Test
  public void extractFirstName_FirstName_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan"), is(NYAN));
  }

  @Test
  public void extractFirstName_FirstNameAroundWhiteSpaces_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan "), is(NYAN));
    assertThat(extractFirstName(" Nyan"), is(NYAN));
    assertThat(extractFirstName(" Nyan "), is(NYAN));
    assertThat(extractFirstName("    Nyan   "), is(NYAN));
  }

  @Test
  public void extractFirstName_ThreeWords_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan Pasus Abdul"), is(NYAN));
  }

  @Test
  public void extractFirstName_ThreeWordsAroundWhiteSpaces_ReturnsCorrect() {
    assertThat(extractFirstName("Nyan Pasus Abdul "), is(NYAN));
    assertThat(extractFirstName(" Nyan Pasus Abdul"), is(NYAN));
    assertThat(extractFirstName(" Nyan Pasus Abdul "), is(NYAN));
    assertThat(extractFirstName("    Nyan Pasus Abdul   "), is(NYAN));
    assertThat(extractFirstName("Nyan     Pasus    Abdul"), is(NYAN));
    assertThat(extractFirstName(" Nyan      Pasus     Abdul "), is(NYAN));
    assertThat(extractFirstName("Nyan   Pasus   Abdul    "), is(NYAN));
  }

}