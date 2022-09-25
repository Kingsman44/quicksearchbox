package com.google.common.p4523c;

import com.google.common.base.C58817ah;
import com.google.common.p4575r.C60754k;
import com.google.common.p4575r.C60755l;

/* renamed from: com.google.common.c.z */
/* compiled from: PG */
abstract class C58951z extends C58920ac {

    /* renamed from: a */
    protected final C58817ah f156802a;

    protected C58951z(C58817ah ahVar) {
        this.f156802a = ahVar;
    }

    /* renamed from: b */
    public final C60755l mo56201b(Object obj) {
        C60755l lVar = (C60755l) this.f156802a.apply(obj);
        C60754k c = C60755l.m92736c(lVar.f164798c);
        for (int i = 0; i < lVar.f164798c; i++) {
            c.mo57180b(mo56200c(lVar.mo57181a(i)));
        }
        return c.mo57179a();
    }

    /* renamed from: c */
    public abstract int mo56200c(int i);
}
