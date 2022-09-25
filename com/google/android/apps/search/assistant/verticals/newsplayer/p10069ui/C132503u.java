package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.u */
/* compiled from: PG */
public final /* synthetic */ class C132503u {
    /* renamed from: a */
    public static /* synthetic */ boolean m215419a(String str) {
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
