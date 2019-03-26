package com.dolovers.springmvcrest.utilities;

import java.io.File;

public class FileManipulator {


        public static void giveWritePermissionToAFile(File file) {

            //-----------------------------------------------------
            //set write permission on file only for owner
            //-----------------------------------------------------

            if (file.exists()) {
                boolean bval = file.setWritable(true);
                System.out.println("set the owner's write permission: " + bval);
            } else {
                System.out.println("File cannot exists: ");
            }

            //-----------------------------------------------------
            //Set write permission on File for all.
            //-----------------------------------------------------

            /*if (file.exists()) {
                boolean bval = file.setWritable(true, false);
                System.out.println("set the every user write permission: " + bval);
            } else {
                System.out.println("File cannot exists: ");
            }*/
        }



}
