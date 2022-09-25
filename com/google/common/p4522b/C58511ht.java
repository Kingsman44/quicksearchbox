package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.ht */
/* compiled from: PG */
final class C58511ht extends C58471gg {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient C58512hu f156153a;

    public C58511ht(C58512hu huVar) {
        this.f156153a = huVar;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final boolean contains(Object obj) {
        return this.f156153a.mo54953F(obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return new C58505hn(this.f156153a);
    }

    /* renamed from: lA */
    public final C58800sl mo55210lA() {
        return new C58505hn(this.f156153a);
    }

    public final int size() {
        return this.f156153a.size;
    }

    /* renamed from: w */
    public final int mo55383w(Object[] objArr, int i) {
        C58800sl lA = this.f156153a.map.values().iterator();
        while (lA.hasNext()) {
            i = ((C58471gg) lA.next()).mo55383w(objArr, i);
        }
        return i;
    }
}
