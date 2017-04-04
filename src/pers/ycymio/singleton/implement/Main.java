package pers.ycymio.singleton.implement;

/**
 * Created by ycy on 16/10/8.
 */
public class Main {
//    private static ChildMazeFactory childMazeFactory;

    public static void main(String[] args){
        MazeFactory maze = MazeFactory.getInstance();
        System.out.println(maze.toString());
        MazeFactory maze2 = MazeFactory.getInstance();
        System.out.println(maze2.toString());
    }
}
