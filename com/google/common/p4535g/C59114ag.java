package com.google.common.p4535g;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.g.ag */
/* compiled from: PG */
public final class C59114ag implements C59112ae {

    /* renamed from: a */
    private int f157098a = 0;

    /* renamed from: b */
    private final int f157099b;

    public C59114ag(int i) {
        this.f157099b = i;
    }

    /* renamed from: a */
    public final int mo56427a() {
        C58838bb.m90884s(!mo56428b(), "Cannot call nextEdge() on empty Edges.");
        int i = this.f157098a;
        if (i >= this.f157099b) {
            return -1;
        }
        this.f157098a = i + 1;
        return i;
    }

    /* renamed from: b */
    public final boolean mo56428b() {
        return this.f157098a == this.f157099b;
    }
}
