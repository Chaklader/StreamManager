package exceptions;

import lombok.Getter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import javax.swing.plaf.SeparatorUI;

@Getter
@Slf4j
public class ParsingException extends BaseException {

//    private final String actualToken;

    private final String tokenName;

    public ParsingException(int lineNumber, String tokenName) {

        super("Invalid '" + tokenName + "' found on line " + lineNumber + " while parsing the token '" + "'.", lineNumber);

        this.tokenName = tokenName;
//        this.actualToken = actualToken;
    }
}