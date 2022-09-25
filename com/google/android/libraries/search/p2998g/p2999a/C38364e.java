package com.google.android.libraries.search.p2998g.p2999a;

/* renamed from: com.google.android.libraries.search.g.a.e */
/* compiled from: PG */
public enum C38364e {
    SESSION_DEEPLINK,
    CLIENT_EVENT_PROTO,
    LINKTYPE_NOT_SET;

    /* renamed from: a */
    public static C38364e m67654a(int i) {
        if (i == 0) {
            return LINKTYPE_NOT_SET;
        }
        if (i == 1) {
            return CLIENT_EVENT_PROTO;
        }
        if (i != 2) {
            return null;
        }
        return SESSION_DEEPLINK;
    }
}
