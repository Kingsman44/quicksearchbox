package com.google.android.apps.gsa.staticplugins.p7415au;

/* renamed from: com.google.android.apps.gsa.staticplugins.au.c */
/* compiled from: PG */
public enum C94133c {
    TEXT_OR_VOICE_SEARCH("first_text_or_voice_search_of_day"),
    FEED_TAP_OR_SCROLL("first_feed_tap_or_scroll_of_day");
    

    /* renamed from: c */
    public final String f262985c;

    /* renamed from: d */
    public final String f262986d;

    /* renamed from: e */
    public final String f262987e;

    /* renamed from: f */
    public final String f262988f;

    private C94133c(String str) {
        this.f262985c = str;
        this.f262986d = "time_of_last_firebase_log_".concat(str);
        this.f262987e = "firebase_log_count_".concat(str);
        this.f262988f = str.concat("_count");
    }
}
