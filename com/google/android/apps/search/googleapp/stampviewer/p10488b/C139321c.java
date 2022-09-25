package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.c */
/* compiled from: PG */
public enum C139321c implements C62957cd {
    UNSPECIFIED(0),
    BAD_CACHE_REGEX(1),
    URL_DOES_NOT_MATCH_CACHE_REGEX(2),
    INSECURE_URL(3),
    DUPLICATE_CACHE_URLS(4),
    DUPLICATE_PUBLISHER_URLS(5),
    NO_STAMPS(6),
    INVALID_INDEX_TO_DISPLAY(7),
    NO_CACHE_URL(8),
    NO_PUBLISHER_URL(9),
    NON_STORY_AMP(10);
    

    /* renamed from: l */
    private final int f378924l;

    private C139321c(int i) {
        this.f378924l = i;
    }

    public final int getNumber() {
        return this.f378924l;
    }

    public final String toString() {
        return Integer.toString(this.f378924l);
    }
}
