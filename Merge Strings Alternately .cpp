class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string result;
        result.reserve(word1.size() + word2.size()); 
        size_t i = 0, j = 0;

      
        while (i < word1.size() && j < word2.size()) {
            result.push_back(word1[i]); 
            ++i;
            result.push_back(word2[j]); 
            ++j;
        }

        
        while (i < word1.size()) {
            result.push_back(word1[i]);
            ++i;
        }

      
        while (j < word2.size()) {
            result.push_back(word2[j]);
            ++j;
        }

        return result;
    }
};
