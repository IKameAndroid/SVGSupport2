package com.example.svgsupporter.richpath.pathparser;

import android.graphics.Path;



public class PathParser {

    /**
     * @param pathData The string representing a path, the same as "d" string in svg file.
     * @return the generated Path object.
     */
    public static Path createPathFromPathData(String pathData) {

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            return PathParserCompatApi21.createPathFromPathData(pathData);
        } else {
            return PathParserCompat.createPathFromPathData(pathData);
        }
    }

    public static void createPathFromPathData(Path path, String pathData) {
        PathParserCompat.createPathFromPathData(path, pathData);
    }

}
