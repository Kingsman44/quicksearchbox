package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a */
/* compiled from: PG */
public enum C122301a {
    UNKNOWN_DIFFERENCE(-1),
    NO_SUCH_GROUP(0),
    DIFFERENT_ACCOUNT(1),
    NO_ACCOUNT(2),
    DIFFERENT_LOCALE(4),
    INCOMPATIBLE_MIN_APK(8),
    PENDING_DOWNLOAD(16);
    

    /* renamed from: h */
    public final int f339151h;

    private C122301a(int i) {
        this.f339151h = i;
    }

    /* renamed from: a */
    public static final int m201821a(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((C122301a) it.next()).f339151h;
        }
        return i;
    }
}
