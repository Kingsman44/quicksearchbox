package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.as */
/* compiled from: PG */
public enum C119797as {
    PREFETCH,
    COMMIT,
    ABORT,
    REQUEST_NOT_SET;

    /* renamed from: a */
    public static C119797as m198711a(int i) {
        if (i == 0) {
            return REQUEST_NOT_SET;
        }
        if (i == 2) {
            return PREFETCH;
        }
        if (i == 3) {
            return COMMIT;
        }
        if (i != 4) {
            return null;
        }
        return ABORT;
    }
}
