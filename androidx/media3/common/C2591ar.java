package androidx.media3.common;

import java.util.HashSet;

/* renamed from: androidx.media3.common.ar */
/* compiled from: PG */
public final class C2591ar {

    /* renamed from: a */
    private static final HashSet f7160a = new HashSet();

    /* renamed from: b */
    private static String f7161b = "media3.common";

    /* renamed from: a */
    public static synchronized String m6796a() {
        String str;
        synchronized (C2591ar.class) {
            str = f7161b;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized void m6797b(String str) {
        synchronized (C2591ar.class) {
            if (f7160a.add(str)) {
                String str2 = f7161b;
                f7161b = str2 + ", " + str;
            }
        }
    }
}
