class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isAlnum(ch: string): boolean {

        let code = ch.charCodeAt(0);

        // A-Z
        if (code >= 65 && code <= 90) return true;

        // a-z
        if (code >= 97 && code <= 122) return true;

        // 0-9
        if (code >= 48 && code <= 57) return true;

        return false;
    }

    isPalindrome(s: string): boolean {
        let start:number=0,end:number=s.length-1;
        while(start<end){
            if(!this.isAlnum(s[start])) start++;
            else if(!this.isAlnum(s[end])) end--;
            else{
                if(s[start].toLowerCase() != s[end].toLowerCase()) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
