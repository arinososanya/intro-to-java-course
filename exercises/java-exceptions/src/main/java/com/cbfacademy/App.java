package com.cbfacademy;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
        FileExtension fe = new FileExtension(..)

        // System.out.println(args[0]);
        try {
            System.out.println("hello");
            Integer result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println(result);
        } catch(IndexOutOfBoundsException error) {
            System.out.println("No no you're being cheeky");
        } catch(ArithmeticException a) {
            System.out.println(a.getMessage());
        } catch (Exception e) {

        } finally {
            System.out.println("goodbye");
        }
    }
}