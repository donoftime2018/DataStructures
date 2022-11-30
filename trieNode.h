#ifndef TRIENODE_H
#define TRIENODE_H


#include <stdio.h>

#define MAX_WORD_LENGTH 22
#define ALPHABET_SIZE 26

struct trieNode
{
    int letterCount; //number of times a specific letter occurs
    int wordCount; //number of times a word occurs
    char letter; //letter being stored in the trieNode
    struct trieNode* children[ALPHABET_SIZE]; //an array containing pointers to all 26 of this trie node's children
};

void addWordOccurrence(char* word); //gets rid of all nonalphanumeric characters in 'word' and initializes 'root'
void addWord(int position, char letterofWord, char* word, struct trieNode* node); //actually adds each letter of word to an appropriate node
void display(); //displays all of root's children
void displayWord(int index, char letters[MAX_WORD_LENGTH], struct trieNode* node); //stores each letter in 'letters' and forms a complete word to display
void freeTrie(struct trieNode* node); //de-allocates a specific node then de-allocates all of said node's children
void preInitialization(struct trieNode* node); //initializes all children of 'node' to null and letterCount and wordCount to 0
struct trieNode* initializedNode(struct trieNode* node, char letter); //returns 1 (initialized) child node of 'node'
void initializeChild(struct trieNode* node, int position); //initializes 'children[position]' of 'node' if uninitialized
int isLeaf(struct trieNode* node); //determines if 'node' is a leaf or not

#endif
