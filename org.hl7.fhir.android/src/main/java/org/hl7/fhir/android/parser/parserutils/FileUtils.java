package org.hl7.fhir.android.parser.parserutils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {

  /**
   * Returns a list of all java files within the passed in directory path, without extension.
   *
   * @param path {@link String} filepath
   * @return {@link List < String >} of all filenames
   */
  public static List<String> listAllJavaFilesInDirectory(String path) {
    List<String> result = new ArrayList<>();
    try (Stream<Path> walk = Files.walk(Paths.get(path))) {
      walk.map(Path::toString)
        .filter(f -> f.endsWith(".java"))
        .map(FileUtils::pullFileNameFromPath)
        .collect(Collectors.toCollection(() -> result));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }

  /**
   * Takes the passed in file path and extracts the filename without extension.
   *
   * @param path
   * @return
   */
  protected static String pullFileNameFromPath(String path) {
    int lastSlashIndex = path.lastIndexOf('/');
    int lastPeriodIndex = path.lastIndexOf('.');
    return path.substring(lastSlashIndex + 1, lastPeriodIndex);
  }

  /**
   * Writes the passed in String to the file at the given filepath.
   *
   * @param string   File content to write
   * @param filepath Absolute path to the file
   * @throws IOException
   */
  public static void writeStringToFile(String string, String filepath) throws IOException {
    File f = new File(filepath);
    if (!f.exists()) {
      try {
        f.createNewFile();
      }catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
    writer.write(string);
    writer.close();
  }

  /**
   * Creates a directory at the given path. Exits if path invalid.
   *
   * @param path Full path of directory to create.
   */
  public static void createDirectory(String path) {
    File file = new File(path);
    if (!file.mkdir()) {
      System.out.println("Could not create directory <" + path + "> ...terminating parser.");
      System.exit(0);
    }
  }

  /**
   * Deletes the directory at the give path.
   * @param path
   * @throws IOException
   */
  public static void deleteDirectory(String path) throws IOException {
    File file = new File(path);
    org.apache.commons.io.FileUtils.deleteDirectory(file);
  }

  /**
   * Attempts to delete the file at the given path.
   *
   * @param path
   */
  public static void deleteFile(String path) {
    File file = new File(path);
    if (!file.delete()) {
      System.out.println("Failed to delete the file <" + path + "> ...terminating parser.");
      System.exit(0);
    }
  }
}