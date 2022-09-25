package androidx.media3.common.p135a;

import android.text.Spannable;

/* renamed from: androidx.media3.common.a.h */
/* compiled from: PG */
public final class C2572h {
    /* renamed from: a */
    public static void m6791a(Spannable spannable, Object obj, int i, int i2) {
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, 33);
    }
}
