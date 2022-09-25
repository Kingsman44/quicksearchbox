package com.google.android.libraries.assistant.auto.tng.common.p933q;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.a */
/* compiled from: PG */
public final class C13316a {
    /* renamed from: a */
    public static boolean m29572a(String str) {
        return str != null && str.contains("dev");
    }

    /* renamed from: b */
    public static boolean m29573b(String str) {
        if (m29572a(str)) {
            return false;
        }
        if (str == null || !str.contains("alpha")) {
            return str == null || !str.contains("gamma");
        }
        return false;
    }
}
