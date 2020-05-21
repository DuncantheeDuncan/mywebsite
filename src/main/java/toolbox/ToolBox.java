package toolbox;

/**
 * this code is being re-used. some of methods found here are tested already
 * in another project and made sure they behave accordingly.
 */

public class ToolBox {

    public boolean isParagraphGreaterOrSmaller(String findMinAndMax) {
        String[] S = findMinAndMax.split(" ");

        return S.length <= 10 | S.length >= 70;
    }

    public String capitaliseFirstLetter(String capitalise) {
        String[] splitting = capitalise.split(" ");
        capitalise = "";

        for (String S : splitting)
            capitalise += " " + S.substring(0, 1).toUpperCase() + S.substring(1).toLowerCase();

        return capitalise.trim();
    }


    public boolean hasNumber(String check) {

        char[] splitUp = check.toCharArray();

        for (char c : splitUp) {
            for (int j = 0; j <= 9; j++)
                if (String.valueOf(c).equals(String.valueOf(j)))
                    return true;
        }
        return false;
    }

    public String stringShorten(String shorten) {

        String[] stringSplitter = shorten.split(" ");

        StringBuilder firstsLetters = new StringBuilder();

        for (String S : stringSplitter) {

            if ("in".equals(S) | "of".equals(S)) continue;

            firstsLetters.append(S.substring(0, 1).toUpperCase());
        }

        return firstsLetters.toString();
    }
}
