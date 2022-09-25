package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.pt */
/* compiled from: PG */
final class C58727pt extends C58528ij {

    /* renamed from: a */
    private final transient C58495hd f156480a;

    /* renamed from: b */
    private final transient C58485gu f156481b;

    public C58727pt(C58495hd hdVar, C58485gu guVar) {
        this.f156480a = hdVar;
        this.f156481b = guVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final boolean contains(Object obj) {
        return this.f156480a.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f156481b.listIterator(0);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return this.f156481b.listIterator(0);
    }

    public final int size() {
        return this.f156480a.size();
    }

    /* renamed from: u */
    public final C58485gu mo55229u() {
        return this.f156481b;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        return this.f156481b.mo55383w(objArr, i);
    }
}
