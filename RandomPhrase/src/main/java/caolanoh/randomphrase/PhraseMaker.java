/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caolanoh.randomphrase;

/**
 *
 * @author caolanohagan
 */
public class PhraseMaker {
    public static void main (String [] args){
    
    // Three sets of words to choose from
    String [] listOne = {"24/7","multi-tier","30,000 foot","B to B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical path","dynamic"};
    String [] listTwo = {"empower","sticky","value-added","orientated","centric","distributed","clustered","branded","outside-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
    String [] listThree = {"process","tipping-point","solution","architecture","core competency","paradigm","strategy","mindshare","portal","space","vision","mission"};
    
    
    //find out how many are in each list
    int listOneLength = listOne.length;
    int listTwoLength = listTwo.length;
    int listThreeLength = listThree.length;
    
    
    //generate three random numbers
    int randomOne = (int) (Math.random() * listOneLength);
    int randomTwo = (int) (Math.random() * listTwoLength);
    int randomThree = (int) (Math.random() * listThreeLength);
    
    //build phrase
    String phrase = listOne[randomOne] + " " + listTwo[randomTwo] + " " + listThree[randomThree];
    
    //print out the phrase
    System.out.println("What we need is a " + phrase);
    }
}
