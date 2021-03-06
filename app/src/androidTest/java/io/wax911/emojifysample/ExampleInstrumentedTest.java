package io.wax911.emojifysample;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.wax911.emojify.EmojiManager;
import io.wax911.emojify.EmojiUtils;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("io.wax911.emojify", appContext.getPackageName());
    }

    @Test
    public void readSmile() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        EmojiManager.initEmojiData(appContext);

        String emojiString = "\uD83D\uDE00 with \uD83D\uDE04";
        String result = EmojiUtils.shortCodify(emojiString);
        assertEquals(true, result.contains(":)"));
    }
}
