package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.common.b.bh */
/* compiled from: PG */
final class C58337bh extends C58485gu {

    /* renamed from: a */
    final /* synthetic */ int f155907a;

    /* renamed from: b */
    final /* synthetic */ C58338bi f155908b;

    public C58337bh(C58338bi biVar, int i) {
        this.f155908b = biVar;
        this.f155907a = i;
    }

    /* renamed from: a */
    public final boolean mo55032a() {
        return true;
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, size(), "index");
        C58338bi biVar = this.f155908b;
        return ((List) this.f155908b.f155909a.get(i)).get((this.f155907a / biVar.f155910b[i + 1]) % ((List) biVar.f155909a.get(i)).size());
    }

    public final int size() {
        return ((C58724pq) this.f155908b.f155909a).f156474d;
    }
}
