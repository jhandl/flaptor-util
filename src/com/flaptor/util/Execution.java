package com.flaptor.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;

/**
 * Represents the execution of a group of tasks. Maintains a list of 
 * tasks to be executed (executionQueue) and a list of
 * results from tasks already executed (resultsList).
 * 
 * If the task of the execution are no longer meant to be executed, the 
 * execution can be "forgotten" 
 * 
 * @param <T> the type of the results
 */
public class Execution<T> {
    
    protected Queue<Callable<T>> executionQueue = new LinkedList<Callable<T>>();
    protected List<Results<T>> resultsList = new ArrayList<Results<T>>();
    protected boolean forgotten = false;
    
    public Queue<Callable<T>> getTaskQueue() {
        return executionQueue;
    }

    public List<Results<T>> getResultsList() {
        return resultsList;
    }

    public boolean isForgotten() {
        return forgotten;
    }

    /**
     * No more tasks will be executed and the execution will be removed
     * of the execution list
     */
    public void forget() {
        forgotten = true;
    }
   
    /**
     * represents the outcome of the execution of a task, which can 
     * finish ok or not (with exceptions). It holds the results or 
     * the exception thrown
     * 
     * @param <T> the type of the result
     */
    public static class Results<T> {
        private boolean finishedOk = false;
        private T results = null;
        private Throwable exception = null;
        
        public boolean isFinishedOk() {
            return finishedOk;
        }
        public void setFinishedOk(boolean finishedOk) {
            this.finishedOk = finishedOk;
        }
        public Throwable getException() {
            return exception;
        }
        public void setException(Throwable exception) {
            this.exception = exception;
        }
        public T getResults() {
            return results;
        }
        public void setResults(T results) {
            this.results = results;
        }
    }
}
