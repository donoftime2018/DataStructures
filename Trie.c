#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "trieNode.h"

struct trieNode* root; //root node of trie

int main()
{
    addWordOccurrence("Hiro");
    addWordOccurrence("Billy....Shoepack");
    addWordOccurrence("Hiro");
    addWordOccurrence("Bertie");
    addWordOccurrence("Big Mac");
    addWordOccurrence("Hiro");
    addWordOccurrence("OJ");
    addWordOccurrence(" Fearless..  Freddie ");
    addWordOccurrence("Bertram");
    addWordOccurrence("Mighty Mac ");
    addWordOccurrence("Mighty Mac");
    addWordOccurrence("O.J.");
    addWordOccurrence("Millie");
    addWordOccurrence("Big Mac ");
    addWordOccurrence("Billy &..Shoepack");
    addWordOccurrence("'Arry");
    addWordOccurrence("Diesel 10");
    addWordOccurrence("O. J. ");
    addWordOccurrence("Millie");
    addWordOccurrence("Mighty  Mac");
    addWordOccurrence("Bert");
    addWordOccurrence("Fearless Freddie");
    display();
    freeTrie(root); 
    return 0;
}

void addWordOccurrence(char* word)
{   
    if (root == NULL)
    {
        root = (struct trieNode*) malloc(sizeof(struct trieNode));
        preInitialization(root); //set all children of 'root' to NULL and initialize 'letterCount' and 'wordCount' to 0

        root->letter = ' '; //'letter' of 'root' is just white space
    }

    int length = strlen(word); //length of 'word'

    char lowerCaseWord[length]; //stores lower case version of 'word'

    strncpy(lowerCaseWord, word, length); //copy 'word' into 'lowerCaseWord'
    lowerCaseWord[length] = '\0'; //set null terminal to after last letter in 'lowerCaseWord'

    for (int p = 0; p < length; p++)
    {
        if ( isupper(lowerCaseWord[p]) ) //checks if current character is uppercase
            lowerCaseWord[p] = tolower(lowerCaseWord[p]); //make current character in 'lowerCaseWord' lower case if 'isupper' returns true
    }

    int i = 0;

    while (lowerCaseWord[i] != '\0')
    {
        if (!isalnum(lowerCaseWord[i])) //loop while current character is nonalphanumeric
        {
            memmove(&lowerCaseWord[i], &lowerCaseWord[i+1], length); //replace current character with next character
            lowerCaseWord[length--] = '\0'; //shift back null terminal and 'length' by 1 position length-1
            continue; //in case lowerCaseWord[i] is still nonalphanumeric
        }

        i++;
    }

    addWord(0, lowerCaseWord[0], lowerCaseWord, initializedNode(root, lowerCaseWord[0]) ); //call addWord function to actually add letters to trie
}

void addWord(int position, char letterofWord, char* word, struct trieNode* node)
{
    node->letter = letterofWord; //assign 'letterofWord' to 'letter' member of 'node'
    node->letterCount++; //increment 'letterCount' member of 'node'

    if (position+1 == strlen(word))
    {
        node->wordCount++; //increment 'wordCount' of 'node' once we have accounted for all letters
        return; //terminate function
    }
    
    ++position;

    addWord(position, word[position], word, initializedNode( node, word[position] ) );
}

void freeTrie(struct trieNode* node)
{
    if (node == NULL)
        return; //don't do anything if 'node' is null
    
    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        freeTrie(node->children[i]); //free all children of 'node'
    }

    free(node); //free 'node'
    
}

struct trieNode* initializedNode(struct trieNode* node, char letter)
{
    switch(letter)
    {
        case 'a':
            initializeChild(node, 0);
            return node->children[0];
        
        case 'b':
            initializeChild(node, 1);
            return node->children[1];

        case 'c':
            initializeChild(node, 2);
            return node->children[2];
        
        case 'd':
            initializeChild(node, 3);
            return node->children[3];

        case 'e':
            initializeChild(node, 4);
            return node->children[4];
        
        case 'f':
            initializeChild(node, 5);
            return node->children[5];
        
        case 'g':
            initializeChild(node, 6);
            return node->children[6];
        
        case 'h':
            initializeChild(node, 7);
            return node->children[7];
        
        case 'i':
            initializeChild(node, 8);
            return node->children[8];
        
        case 'j':
            initializeChild(node, 9);
            return node->children[9];
        
        case 'k':
            initializeChild(node, 10);
            return node->children[10];

        case 'l':
            initializeChild(node, 11);
            return node->children[11];
        
        case 'm':
            initializeChild(node, 12);
            return node->children[12];
        
        case 'n':
            initializeChild(node, 13);
            return node->children[13];
        
        case 'o':
            initializeChild(node, 14);
            return node->children[14];

        case 'p':
            initializeChild(node, 15);
            return node->children[15];
        
        case 'q':
            initializeChild(node, 16);
            return node->children[16];
        
        case 'r':
            initializeChild(node, 17);
            return node->children[17];
        
        case 's':
            initializeChild(node, 18);
            return node->children[18];
        
        case 't':
            initializeChild(node, 19);
            return node->children[19];
        
        case 'u':
            initializeChild(node, 20);
            return node->children[20];
        
        case 'v':
            initializeChild(node, 21);
            return node->children[21];
        
        case 'w':
            initializeChild(node, 22);
            return node->children[22];
        
        case 'x':
            initializeChild(node, 23);
            return node->children[23];
        
        case 'y':
            initializeChild(node, 24);
            return node->children[24];

        default:
            initializeChild(node, 25);
            return node->children[25];
    }
}

void initializeChild(struct trieNode* node, int position)
{
    if (node->children[position] == NULL)
    {
        node->children[position] = (struct trieNode*) malloc(sizeof(struct trieNode)); //initialize children[position] of 'node' if it is null
        preInitialization(node->children[position]); 
    }

    else
        ; //do nothing if children[position] of 'node' is already initialized
}

void preInitialization(struct trieNode* node)
{
    node->letterCount = 0; //initialize letterCount to 0
    node->wordCount = 0; //initialize wordCount to 0

    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        node->children[i] = NULL; //set all of the children of 'node' to null
    }
}

void display()
{
    char letters[MAX_WORD_LENGTH]; //actual parameter for displayWord method

    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
       displayWord(0, letters, root->children[i]); //calls method to display all of trie contents
    }
}

void displayWord(int index, char letters[MAX_WORD_LENGTH], struct trieNode* node)
{
    if (node == NULL)
        return; //do nothing if 'node' is null
    
    if (node->letter != ' ' && node->letterCount > 0)
    {
        letters[index] = node->letter; //fill letters[index] with 'letter' of 'node' if it exists
        ++index;
    }

    if (node->wordCount > 0)
    {
        for (int n = index; n < MAX_WORD_LENGTH; n++) //get rid of remaining characters from previously displayed/completed words
        {
            if (letters[n] == ' ')
                break; //if letters[n] is already empty, break out of loop
            
            else
                letters[n] = ' '; //set letters[n] to empty character
        }

        char* word = letters; //assign 'letters' array to string variable 'word' 

        int firstBlankIndex = 0; //to store index that has first whitespace in 'word'

        for (int i = 0; i < strlen(word); i++)
        {
            if (word[i] == ' ')
            {
                firstBlankIndex = i; //set 'firstBlankIndex' to i
                break;
            }
        }  

        word[0] = toupper(word[0]); //capitalize first letter in word

        if (firstBlankIndex > 0) //only set null terminal if 'firstBlankIndex' is greater than 0
            word[firstBlankIndex] = '\0';

        printf("%s: %d\n", word, node->wordCount); //display occurrence of 'word' in the trie

        if (!isLeaf(node))
        {
            for (int i = 0; i < ALPHABET_SIZE; i++)
            {
                 displayWord(index, letters, node->children[i]); //continue recursing if 'node' isn't a leaf
            }
        }

        return;
    }

    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        displayWord(index, letters, node->children[i]); //recurse down all child nodes of 'node'
    }
}

int isLeaf(struct trieNode* node)
{
    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        if (node->children[i] != NULL)
            return 0; //if we come across non-null child node function returns 0 (false)
    }

    return 1; //if all child nodes of 'node' are null (i.e. no non-null child nodes), then return 1
}