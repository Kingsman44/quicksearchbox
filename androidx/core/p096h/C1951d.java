package androidx.core.p096h;

import android.text.Html;
import android.text.Spanned;

/* renamed from: androidx.core.h.d */
/* compiled from: PG */
public final class C1951d {
    /* renamed from: a */
    public static Spanned m5280a(String str, int i) {
        return Html.fromHtml(str, i);
    }

    /* renamed from: b */
    public static Spanned m5281b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i, imageGetter, tagHandler);
    }

    /* renamed from: c */
    public static String m5282c(Spanned spanned, int i) {
        return Html.toHtml(spanned, i);
    }
}
