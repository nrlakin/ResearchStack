package co.touchlab.touchkit.rk.common.answerformat;

import android.text.InputFilter;

import co.touchlab.touchkit.rk.common.result.TextQuestionResult;

/**
 * Created by bradleymcdermott on 10/13/15.
 */
public class TextAnswerFormat extends AnswerFormat
{
    public static final int UNLIMITED_LENGTH = 0;
    private int maximumLength;

    private boolean isMultipleLines = true;

    public TextAnswerFormat()
    {
        this(UNLIMITED_LENGTH);
    }

    public TextAnswerFormat(int maximumLength)
    {
        this.maximumLength = maximumLength;
    }

    @Override
    public QuestionType getQuestionType()
    {
        return QuestionType.Text;
    }

    public void setIsMultipleLines(boolean isMultipleLines)
    {
        this.isMultipleLines = isMultipleLines;
    }

    public InputFilter [] getInputFilters()
    {
        if (maximumLength > UNLIMITED_LENGTH)
        {
            return new InputFilter[] {new InputFilter.LengthFilter(maximumLength)};
        }
        else
        {
           return new InputFilter[0];
        }
    }

    public int getMaximumLength()
    {
        return maximumLength;
    }

    public boolean isMultipleLines()
    {
        return isMultipleLines;
    }

    @Override
    public Class getQuestionResultClass()
    {
        return TextQuestionResult.class;
    }

    public boolean isAnswerValidWithString(String text)
    {
        return text != null && text.length() > 0 &&
                (maximumLength == UNLIMITED_LENGTH || text.length() <= maximumLength);
    }



//    + (BOOL)supportsSecureCoding {
//    return YES;
//}

//    - (BOOL)isEqual:(id)object {
//    BOOL isParentSame = [super isEqual:object];
//
//    __typeof(self) castObject = object;
//    return (isParentSame &&
//            (self.maximumLength == castObject.maximumLength &&
//                    self.autocapitalizationType == castObject.autocapitalizationType &&
//                    self.autocorrectionType == castObject.autocorrectionType &&
//                    self.spellCheckingType == castObject.spellCheckingType &&
//                    self.multipleLines == castObject.multipleLines));
//}

//    - (BOOL)isAnswerValidWithString:(NSString *)text {
//    return (_maximumLength == 0 || [text length] <= _maximumLength);
//}

}
