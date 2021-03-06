package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
   String separator = "\r\n";
   int position = lines.indexOf(separator);
   //if there is a separator \r\n we return the next line 
   if( position != -1)
      return new String[] { lines.substring(0,position + separator.length() ),lines.substring(position + separator.length())};
   separator = "\r";
   position = lines.indexOf(separator);
   //if there is a separator \r we return the next line
   if( position != -1)
      return new String[] { lines.substring(0,position + separator.length() ),lines.substring(position + separator.length())};
   separator = "\n";
   position = lines.indexOf(separator);
   //if there is a separator \n we return the next line
   if( position != -1)
      return new String[] { lines.substring(0,position + separator.length() ),lines.substring(position + separator.length())};
     
   //if threre is no separator 
   return new String[]{"",lines};
           
  }


}
