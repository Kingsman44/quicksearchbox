package com.google.android.apps.gsa.shared.p7066m.p7067a;

import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.p7066m.C90129h;
import com.google.common.p4522b.C58490gz;

/* renamed from: com.google.android.apps.gsa.shared.m.a.a */
/* compiled from: PG */
final class C89960a {
    /* renamed from: a */
    static final void m146543a(C90048d dVar, boolean z, C58490gz gzVar) {
        m146544b(dVar.f248757a, Boolean.valueOf(z), gzVar);
    }

    /* renamed from: b */
    public static final void m146544b(int i, Object obj, C58490gz gzVar) {
        gzVar.mo55429h(Integer.valueOf(i), obj);
    }

    /* renamed from: c */
    static final void m146545c(C90129h hVar, String[] strArr, C58490gz gzVar) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (str.indexOf(44) < 0) {
                i++;
            } else {
                int i2 = hVar.f251802a;
                throw new IllegalArgumentException("Illegal comma in " + str + " for flag " + i2);
            }
        }
        m146544b(hVar.f251802a, strArr, gzVar);
    }
}
