package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import com.google.common.p4575r.C60755l;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.assistant.c.b.f.am */
/* compiled from: PG */
public final class C17135am implements Comparator {

    /* renamed from: a */
    public static final Comparator f49820a = new C17135am();

    private C17135am() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean matches = C17136an.f49822b.matcher(str).matches();
        boolean matches2 = C17136an.f49822b.matcher(str2).matches();
        if (!matches) {
            if (matches2) {
                matches2 = true;
            }
            return 0;
        }
        if (!matches) {
            return -1;
        }
        if (!matches2) {
            return 1;
        }
        C60755l e = C17136an.m34270e(str);
        C60755l e2 = C17136an.m34270e(str2);
        int max = Math.max(e.f164798c, e2.f164798c);
        int i = 0;
        while (i < max) {
            int a = i < e.f164798c ? e.mo57181a(i) : 0;
            int a2 = i < e2.f164798c ? e2.mo57181a(i) : 0;
            int i2 = a == a2 ? 0 : a < a2 ? -1 : 1;
            if (i2 != 0) {
                return i2;
            }
            i++;
        }
        return 0;
    }
}
