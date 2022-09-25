package com.google.common.p4523c;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.c */
/* compiled from: PG */
final class C58928c extends C58934i {
    public C58928c(C60755l lVar) {
        super(lVar);
    }

    /* renamed from: c */
    private static final int m91079c(C60755l lVar, C60755l lVar2) {
        int i = lVar.f164798c;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (lVar2.mo57181a(i2) == lVar.mo57181a(i2)) {
                i2++;
            } else {
                while (i2 < i) {
                    int i3 = i2 + 1;
                    if (lVar2.mo57181a(i3) != lVar.mo57181a(i2)) {
                        return 2;
                    }
                    i2 = i3;
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        C58838bb.m90871f(i <= 1, "Expected limit of at most 1, but found %s", i);
        C60755l lVar2 = this.f156777b;
        int i2 = lVar2.f164798c;
        int i3 = lVar.f164798c;
        int i4 = i3 - i2;
        if (i4 == -1) {
            return m91079c(lVar, lVar2);
        }
        if (i4 == 0) {
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (lVar.mo57181a(i6) != this.f156777b.mo57181a(i6)) {
                    int i7 = i5 + 1;
                    if (i5 != 0) {
                        return i7;
                    }
                    i5 = i7;
                }
            }
            return i5;
        } else if (i4 != 1) {
            return 2;
        } else {
            return m91079c(lVar2, lVar);
        }
    }

    /* renamed from: b */
    public final double mo56203b(C60755l lVar) {
        return C58927b.m91078a(this, lVar);
    }
}
