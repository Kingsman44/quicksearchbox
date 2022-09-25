package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.hn */
/* compiled from: PG */
final class C58505hn extends C58800sl {

    /* renamed from: a */
    final Iterator f156144a;

    /* renamed from: b */
    Iterator f156145b = C58566ju.f156231a;

    /* renamed from: c */
    final /* synthetic */ C58512hu f156146c;

    public C58505hn(C58512hu huVar) {
        this.f156146c = huVar;
        this.f156144a = huVar.map.values().iterator();
    }

    public final boolean hasNext() {
        return this.f156145b.hasNext() || this.f156144a.hasNext();
    }

    public final Object next() {
        if (!this.f156145b.hasNext()) {
            this.f156145b = ((C58471gg) this.f156144a.next()).iterator();
        }
        return this.f156145b.next();
    }
}
