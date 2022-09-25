package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.l */
/* compiled from: PG */
public final /* synthetic */ class C40231l {
    /* renamed from: a */
    public static /* synthetic */ boolean m69857a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }
}
