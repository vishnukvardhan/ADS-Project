/**  
 * 
 * Copyright: Copyright (c) 2004 Carnegie Mellon University
 * 
 * This program is part of an implementation for the PARKR project which is 
 * about developing a search engine using efficient Datastructures.
 * 
 * Modified by Mahender on 12-10-2009
 */ 

package searchengine.indexer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

import searchengine.dictionary.AVLDictionary;
import searchengine.dictionary.BSTDictionary;
import searchengine.dictionary.DictionaryInterface;
import searchengine.dictionary.HashDictionary;
import searchengine.dictionary.ListDictionary;
import searchengine.dictionary.MyHashDictionary;
import searchengine.dictionary.ObjectIterator;
import searchengine.element.PageElementInterface;
import searchengine.element.PageWord;


/**
 * Web-indexing objects.  This class implements the Indexer interface
 * using a list-based index structure.

A Hash Map based implementation of Indexing 

 */
public class Indexer implements IndexerInterface
{
	/** The constructor for ListWebIndex.
	 */

	// Index Structure 
	DictionaryInterface index;

	// This is for calculating the term frequency
	HashMap<?,?> wordFrequency;

	public Indexer(String mode)
	{
		// hash - Dictionary Structure based on a Hashtable or HashMap from the Java collections 
		// list - Dictionary Structure based on Linked List 
		// myhash - Dictionary Structure based on a Hashtable implemented by the students
		// bst - Dictionary Structure based on a Binary Search Tree implemented by the students
		// avl - Dictionary Structure based on AVL Tree implemented by the students

		if (mode.equals("hash")) 
			index = new HashDictionary();
		else if(mode.equals("list"))
			index = new ListDictionary();
		else if(mode.equals("myhash"))
			index = new MyHashDictionary();
		else if(mode.equals("bst"))
			index = new BSTDictionary();
		else if(mode.equals("avl"))
			index = new AVLDictionary();
	}

	/** Add the given web page to the index.
	 *
	 * @param url The web page to add to the index
	 * @param keywords The keywords that are in the web page
	 * @param links The hyperlinks that are in the web page
	 */
	public void addPage(URL url, ObjectIterator<?> keywords)	
	{
	    ////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
	}

	/** Produce a printable representation of the index.
	 *
	 * @return a String representation of the index structure
	 */
	public String toString()
	{
		////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
		return "You dont need to implement it\n";
	}

	/** Retrieve all of the web pages that contain the given keyword.
	 *
	 * @param keyword The keyword to search on
	 * @return An iterator of the web pages that match.
	 */
	public ObjectIterator<?> retrievePages(PageWord keyword)
	{
		////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
		return new ObjectIterator<PageElementInterface>(new Vector<PageElementInterface>());
	}

	/** Retrieve all of the web pages that contain any of the given keywords.
	 *	
	 * @param keywords The keywords to search on
	 * @return An iterator of the web pages that match.
	 * 
	 * Calculating the Intersection of the pages here itself
	 **/
	public ObjectIterator<?> retrievePages(ObjectIterator<?> keywords)
	{
		////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
		return new ObjectIterator<PageElementInterface>(new Vector<PageElementInterface>());
	}

	/** Save the index to a file.
	 *
	 * @param stream The stream to write the index
	 */
	public void save(FileOutputStream stream) throws IOException
	{
		////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
	}

	/** Restore the index from a file.
	 *
	 * @param stream The stream to read the index
	 */
	public void restore(FileInputStream stream) throws IOException
	{
		////////////////////////////////////////////////////////////////////
	    //  Write your Code here as part of Integrating and Running Mini Google assignment
	    //  
	    ///////////////////////////////////////////////////////////////////
	}

	/* Remove Page method not implemented right now
	 * @see searchengine.indexer#removePage(java.net.URL)
	 */
	public void removePage(URL url) {
	}
};
