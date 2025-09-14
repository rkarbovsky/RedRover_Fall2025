package HomeWork.HW_9_1;

//Write a class Block that creates a block (Duh..)
//
//Requirements
//The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
//
//Define these methods:
//
//`getWidth()` return the width of the `Block`
//
//`getLength()` return the length of the `Block`
//
//`getHeight()` return the height of the `Block`
//
//`getVolume()` return the volume of the `Block`
//
//`getSurfaceArea()` return the surface area of the `Block`
//Examples
//    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
//    b.getWidth() // -> 2
//
//    b.getLength() // -> 4
//
//    b.getHeight() // -> 6
//
//    b.getVolume() // -> 48
//
//    b.getSurfaceArea() // -> 88
//Note: no error checking is needed
//
//Any feedback would be much appreciated

//https://www.codewars.com/kata/building-blocks/train/java

public class Block {

    int width, length, height, volume, surfaceArea;

    int[] Block = new int[3];

    public void block() {
        Block[0] = getWidth();
        Block[1] = getLength();
        Block[2] = getHeight();
    }

    public int getWidth() {
        return Block[width];
    }

    public int getLength() {
        return Block[length];
    }

    public int getHeight() {
        return Block[height];
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Good Luck!
    public int getVolume() {
        return volume;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
}
