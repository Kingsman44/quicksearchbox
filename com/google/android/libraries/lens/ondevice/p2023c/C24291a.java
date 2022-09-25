package com.google.android.libraries.lens.ondevice.p2023c;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19667e;
import com.google.android.libraries.p1657ba.p1664c.p1668c.C19668f;
import java.io.File;

/* renamed from: com.google.android.libraries.lens.ondevice.c.a */
/* compiled from: PG */
public final class C24291a {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r3.length == 1) goto L_0x000d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m45354a(java.io.File r3) {
        /*
            java.lang.String[] r3 = r3.list()
            r0 = 0
            if (r3 == 0) goto L_0x000c
            int r1 = r3.length
            r2 = 1
            if (r1 != r2) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            com.google.common.base.C58838bb.m90883r(r2)
            r3 = r3[r0]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2023c.C24291a.m45354a(java.io.File):java.lang.String");
    }

    /* renamed from: b */
    public static final C19668f m45355b(String str) {
        String str2;
        File file = new File(str);
        if (file.isFile()) {
            str2 = file.toString();
        } else {
            str2 = new File(file, m45354a(file)).toString();
        }
        C19667e eVar = (C19667e) C19668f.f54700c.createBuilder();
        eVar.copyOnWrite();
        C19668f fVar = (C19668f) eVar.instance;
        str2.getClass();
        fVar.f54702a |= 2;
        fVar.f54703b = str2;
        return (C19668f) eVar.build();
    }
}
