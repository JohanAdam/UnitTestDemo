package io.reciteapp.androidtests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class FileReaderUtil {

  public static String readFile(ClassLoader classLoader, String fileName) {
    String result = "";

    try {
      URL resource = classLoader.getResource(fileName);
      File f = new File(resource.toURI());
      Scanner in = new Scanner(new FileReader(f));
      StringBuilder b = new StringBuilder();
      while (in.hasNextLine()) {
        b.append(in.nextLine());
      }
      result = b.toString();
    } catch (FileNotFoundException | URISyntaxException e) {
      e.printStackTrace();
    }

    return result;
  }

}
