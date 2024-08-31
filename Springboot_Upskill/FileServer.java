package Springboot_Upskill;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServer {
    private final Path win_rootLocation = Paths.get("");
    private final Path linux_rootLocation = Paths.get("");

    public String saveFile(File file)
    {
        String file_name = file.getName();
        //Files.copy(file.input)
        return ("");
    }
}
