package com.google.common.p4523c;

import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.t */
/* compiled from: PG */
final class C58945t extends C58934i {

    /* renamed from: c */
    public final int f156789c;

    /* renamed from: d */
    private final int f156790d;

    /* renamed from: e */
    private final C58881cr f156791e = C58886cw.m90973a(new C58944s(this));

    /* renamed from: f */
    private C58934i f156792f = null;

    public C58945t(C60755l lVar, int i) {
        super(lVar);
        this.f156789c = i;
        this.f156790d = this.f156777b.f164798c;
    }

    /* renamed from: a */
    public final int mo56202a(C60755l lVar, int i) {
        int i2 = lVar.f164798c;
        int abs = Math.abs(this.f156790d - i2);
        if (i < abs) {
            return abs;
        }
        if (i <= 0) {
            if (this.f156777b.equals(lVar)) {
                return 0;
            }
            return 1;
        } else if (i <= 1) {
            return new C58928c(this.f156777b).mo56202a(lVar, 1);
        } else {
            C58934i iVar = this.f156792f;
            if (iVar == null) {
                C58921ad adVar = new C58921ad(this.f156777b);
                this.f156792f = adVar;
                return adVar.mo56202a(lVar, i);
            } else if (this.f156790d <= 64 || i >= i2 / 10) {
                return ((C58934i) this.f156791e.mo6453a()).mo56202a(lVar, i);
            } else {
                return iVar.mo56202a(lVar, i);
            }
        }
    }

    /* renamed from: b */
    public final double mo56203b(C60755l lVar) {
        return C58927b.m91078a(this, lVar);
    }
}
