import org.eclipse.jetty.util.IO;

import java.io.IOException;

public class Lab1 {
    /**
     * An exception is an unexpected event that occurs during our program, which we generally
     * should be prepared to handle. You can think of an exception as a way that a method
     * communicates that something has gone wrong- for instance, a user tries to access data
     * that they don't have permission for, our connection to the database has been severed,
     * or a file that we've received over the internet is corrupted. In any of these cases, we
     * can not allow the application to proceed normally, but we would also like to avoid a total
     * crash.
     *
     * Most likely, you have already encountered an Exception before (ArrayIndexOutOfBounds, etc).
     * In many cases, we're required to throw an exception ourselves, the code is as follows:
     *
     *      throw new Exception();
     *
     * Notice that "Exception()" is actually just a new Object - Exception itself is an Object
     * descended from "Throwable", which also includes Errors, which are largely unrecoverable and
     * hardware-related (such as running out of memory). You should also notice that the method
     * return type is void - you can think of throwing an Exception to be an alternative to
     * returning a value.
     *
     * A "throws Exception" declaration has already been added to the method signature. Java
     * requires a method which throws an exception to notify other methods that this is possible -
     * hence exceptions are "checked" at "compile time" and can be referred to as "checked exceptions".
     *
     * TODO: using the line provided above, throw a new Exception in the method below.
     */
    public void mustThrowException() throws Exception{

    }
    /**
     * Exceptions, generally, follow a hierarchy that allows the developer to communicate clearly
     * what types of Exceptions were thrown - the rest of the application would need to react
     * differently to, let's say, a security-related exception as opposed to a network-related
     * exception. This means, for example, a FileNotFoundException is a type of IOException, and
     * IOException is a type of Exception. The process for throwing any other exception is the same
     * as a general Exception:
     *
     *      throw new FileNotFoundException();
     *
     * This time, you'll also need to provide the "throws" clause to the method yourself. If a method
     * is capable of throwing an exception, you generally need to add the throws clause as well.
     *
     * TODO: Make this method throw an IOException, and add the matching 'throws' declaration.
     */
    public void mustThrowIOException(){

    }
}
