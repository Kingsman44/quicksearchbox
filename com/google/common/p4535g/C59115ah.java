package com.google.common.p4535g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.g.ah */
/* compiled from: PG */
final class C59115ah implements C59112ae {

    /* renamed from: a */
    int f157100a = 0;

    /* renamed from: b */
    final C59200dl f157101b;

    public C59115ah(C59200dl dlVar) {
        this.f157101b = dlVar;
    }

    /* renamed from: a */
    public final int mo56427a() {
        C58838bb.m90884s(!mo56428b(), "Cannot call nextEdge() on empty Edges.");
        if (this.f157100a == this.f157101b.mo56559f()) {
            return -1;
        }
        C59200dl dlVar = this.f157101b;
        int i = this.f157100a;
        this.f157100a = i + 1;
        return dlVar.mo56558e(i);
    }

    /* renamed from: b */
    public final boolean mo56428b() {
        return this.f157100a == this.f157101b.mo56559f();
    }
}
