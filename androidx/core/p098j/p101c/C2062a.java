package androidx.core.p098j.p101c;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* renamed from: androidx.core.j.c.a */
/* compiled from: PG */
public final class C2062a {
    /* renamed from: a */
    public static void m5646a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: b */
    public static boolean m5647b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }
}
