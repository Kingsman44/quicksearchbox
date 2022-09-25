package com.google.android.apps.search.googleapp.stampviewer.p10497i;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.i.b */
/* compiled from: PG */
public enum C139423b implements C62957cd {
    UNSPECIFIED(0),
    DISABLED(1),
    NO_SHARE_INTENT_DATA(2),
    INSECURE_URL(3),
    NOT_A_GOOGLE_URL(4),
    NOT_A_SHARE_URL(5),
    NO_PUBLISHER_URL(6),
    CANNOT_DERIVE_CACHE_URL(7),
    CANNOT_PARSE_DEEPLINK_DATA(8),
    STAMP_VIEWER_FAILED_TO_OPEN(9);
    

    /* renamed from: k */
    private final int f379112k;

    private C139423b(int i) {
        this.f379112k = i;
    }

    public final int getNumber() {
        return this.f379112k;
    }

    public final String toString() {
        return Integer.toString(this.f379112k);
    }
}
