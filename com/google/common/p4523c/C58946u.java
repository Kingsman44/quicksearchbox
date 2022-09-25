package com.google.common.p4523c;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.u */
/* compiled from: PG */
final class C58946u extends C58935j {

    /* renamed from: a */
    static final C58946u f156793a = new C58946u();

    private C58946u() {
    }

    /* renamed from: a */
    public final C58934i mo56207a(C60755l lVar, int i) {
        int i2 = lVar.f164798c;
        if (i2 == 0) {
            return C58934i.f156776a;
        }
        boolean z = true;
        if (i2 != 1) {
            return new C58945t(lVar, i);
        }
        if (i2 != 1) {
            z = false;
        }
        C58838bb.m90873h(z, "Expected seq of length 1, found ", lVar);
        return new C58933h(lVar);
    }
}
