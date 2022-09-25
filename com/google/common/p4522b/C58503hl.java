package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.hl */
/* compiled from: PG */
final class C58503hl extends C58471gg {

    /* renamed from: a */
    public final C58495hd f156139a;

    public C58503hl(C58495hd hdVar) {
        this.f156139a = hdVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final boolean contains(Object obj) {
        return obj != null && C58570jy.m90164p(new C58500hi(this), obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58500hi(this);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return new C58500hi(this);
    }

    public final int size() {
        return this.f156139a.size();
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        return new C58501hj(this.f156139a.entrySet().mo55229u());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C58502hk(this.f156139a);
    }
}
