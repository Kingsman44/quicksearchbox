package com.google.common.p4523c;

import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.h */
/* compiled from: PG */
final class C58933h extends C58934i {
    public C58933h(C60755l lVar) {
        super(lVar);
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        int i2;
        if (lVar.mo57182d()) {
            return 1;
        }
        int i3 = 0;
        int a = this.f156777b.mo57181a(0);
        while (true) {
            i2 = lVar.f164798c;
            if (i3 >= i2) {
                break;
            } else if (lVar.f164797b[i3] != a) {
                i3++;
            } else if (i3 >= 0) {
                return i2 - 1;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public final double mo56203b(C60755l lVar) {
        return C58927b.m91078a(this, lVar);
    }
}
