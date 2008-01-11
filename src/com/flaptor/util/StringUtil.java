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

package com.flaptor.util;


/**
 * Helper class to manipulate strings.
 */
public final class StringUtil {
    
    /**
     * Private empty default constructor to prevent inheritance and instantiation.
     */
    private StringUtil() {}

    /**
     * Returns an empty string if a string variable null.
     * @param text the string to evaluate
     * @return "" if the argument is <code>null</code>
     */
    public static String nullToEmpty(final String text) {
        return (text == null) ? "" : text;
    }

    /**
     * Returns null if a string variable is empty.
     * @param text the string to evaluate
     * @param doTrim if true, the string variable is trimmed before comparison
     * @return null if the variable is empty
     */
    public static String emptyToNull(final String text, final boolean doTrim) {
        if (doTrim && (text != null)) {
            return ("".equals(text.trim())) ? null : text;
        } else {
            return ("".equals(text)) ? null : text;
        }
    }

    /**
     * Joins a collection of strings into one string using the given separator.
     * 
     * @param items an iterable with the items to be joined, in the order they should be joined
     * @param separator the separator to insert between items
     * @return a new string with joined items
     */
    public static String join(Iterable<String> items, String separator) {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            if (sb.length() > 0) sb.append(separator);
            sb.append(item);
        }
        return sb.toString();
    }

}

