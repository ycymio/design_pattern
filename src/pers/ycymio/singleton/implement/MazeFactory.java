package pers.ycymio.singleton.implement;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by ycy on 16/10/8.
 */
public class MazeFactory {

    // 无子�?
    private MazeFactory(){};
    private static class InnerMazeFactory{
        private static final MazeFactory maze = new MazeFactory();
    }
    public static MazeFactory getInstance(){
        return InnerMazeFactory.maze;
    }

//    // 有子�?
//    private static MazeFactory maze =  null;
//    private static Map<String, MazeFactory> registry = new HashMap<String, MazeFactory>();
//    private static ChildMazeFactory childMazeFactory;
//
//    protected MazeFactory() {
////        private static ChildMazeFactory childMazeFactory;
//        System.out.println("MazeFactory initiallized");
//    }
//    public static MazeFactory getInstance(){
////        return maze;
//        if( maze == null ){
//            String name = "child";
//            maze = lookUp(name);
//        }
//        return maze;
//    }
//    public static void register(String name, MazeFactory maze){
//        if (lookUp(name) != null ){
//            registry.put(name, maze);
//        }
//    }
//
//    protected static MazeFactory lookUp(String name){
//        return registry.get(name);
//    }

}
