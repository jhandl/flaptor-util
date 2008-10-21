/*
Copyright 2008 Flaptor (flaptor.com) 

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

    http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
*/

package com.flaptor.util.sort;

import java.io.File;
import java.io.IOException;

/**
 * An interface encapsulating Record information.
 * 
 * This code is based on the code found in the book
 * "Developing Java Software" by Winder and Roberts
 */
public interface RecordInformation {

    /**
     * Return a comparator for the Record so it can be sorted.
     * @return a comparator for the Record.
     */
    public Comparator getComparator();

    /**
     * Returns a BufferedReader so that Records can be read from a file.
     * @param filein the file from which the records will be read.
     */
    public RecordReader newRecordReader(File filein) throws IOException;

    /**
     * Returns a BufferedWriter so that Records can be written to a file.
     * @param fileout the file to which the records will be written.
     */
    public RecordWriter newRecordWriter(File fileout) throws IOException;


}

