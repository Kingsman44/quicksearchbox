package com.google.common.p4523c;

import com.google.common.base.C58881cr;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.s */
/* compiled from: PG */
final class C58944s implements C58881cr {

    /* renamed from: a */
    final /* synthetic */ C58945t f156788a;

    public C58944s(C58945t tVar) {
        this.f156788a = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Object afVar;
        C58945t tVar = this.f156788a;
        C60755l lVar = tVar.f156777b;
        int i = tVar.f156789c;
        int i2 = lVar.f164798c;
        if (i2 == 0) {
            return C58934i.f156776a;
        }
        if (i2 <= 32) {
            afVar = new C58924ag(lVar, i);
        } else if (i2 <= 64) {
            afVar = new C58925ah(lVar, i);
        } else {
            afVar = new C58923af(lVar, i);
        }
        return afVar;
    }
}
