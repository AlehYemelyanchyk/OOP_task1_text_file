package by.epam.ayem.module5.service;

import by.epam.ayem.module5.model.Directory;
import by.epam.ayem.module5.model.File;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 9/25/2019.
 */

public class FileServiceTest {

    private static final String PATH = "Path";
    private static final String TITLE = "Title";
    private static final String TEXT = "Text";
    private FileService fileService = new FileService();
    private Directory directory = new Directory(PATH);
    private File file = new File(TITLE, directory, TEXT);

    @Test
    public void changeTitleDifferentDirectoriesTest() {
        String newTitle = "New Title";
        fileService.changeTitle(file, new Directory("wrong directory"), newTitle);
        Assert.assertEquals(TITLE, file.getTitle());
    }

    @Test
    public void changeTitleSameDirectoriesTest() {
        String newTitle = "New Title";
        fileService.changeTitle(file, directory, newTitle);
        Assert.assertEquals(newTitle, file.getTitle());
    }

    @Test
    public void createFileTest() {
        File file = fileService.createFile(TITLE, directory, TEXT);
        Assert.assertNotNull(file);
        Assert.assertEquals(TITLE, file.getTitle());
        Assert.assertEquals(directory, file.getDirectory());
        Assert.assertEquals(TEXT, file.getText());
    }

    @Test
    public void printTextTest() {
        fileService.printText(file, directory);
        Assert.assertEquals(TITLE, file.getTitle());
        Assert.assertEquals(TEXT, file.getText());
    }

    @Test
    public void addTextTest() {
        String textToAdd = TEXT + "Additional text";
        String newText = TEXT + textToAdd;
        fileService.addText(file, directory, textToAdd);
        Assert.assertEquals(newText, file.getText());
    }

    @Test
    public void deleteTextTest() {
        String newText = "";
        fileService.deleteText(file, directory);
        Assert.assertEquals(newText, file.getText());
    }


}
