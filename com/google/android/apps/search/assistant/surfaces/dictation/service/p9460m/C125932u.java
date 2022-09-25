package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.android.apps.gsa.nga.api.a.af;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.u */
/* compiled from: PG */
public final class C125932u {
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m205969a(int r2) {
        /*
            r0 = r2 & 15
            r1 = 1
            if (r0 != 0) goto L_0x000a
            r2 = r2 & 4080(0xff0, float:5.717E-42)
            if (r2 == 0) goto L_0x000d
            goto L_0x000c
        L_0x000a:
            if (r0 != r1) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125932u.m205969a(int):boolean");
    }

    /* renamed from: b */
    static boolean m205970b(af afVar) {
        return afVar.h == 3;
    }

    /* renamed from: c */
    public static boolean m205971c(int i) {
        if (!m205969a(i)) {
            return false;
        }
        int i2 = i & 4080;
        return i2 == 32 || i2 == 208;
    }

    /* renamed from: d */
    public static boolean m205972d(int i) {
        return m205969a(i) && (i & 4080) == 48;
    }

    /* renamed from: e */
    public static boolean m205973e(int i) {
        return m205969a(i) && (i & 4080) == 0;
    }

    /* renamed from: f */
    public static boolean m205974f(int i) {
        return m205969a(i) && (i & 4080) == 160;
    }
}
