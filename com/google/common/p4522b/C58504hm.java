package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.hm */
/* compiled from: PG */
final class C58504hm extends C58800sl {

    /* renamed from: a */
    final Iterator f156140a;

    /* renamed from: b */
    Object f156141b = null;

    /* renamed from: c */
    Iterator f156142c = C58566ju.f156231a;

    /* renamed from: d */
    final /* synthetic */ C58512hu f156143d;

    public C58504hm(C58512hu huVar) {
        this.f156143d = huVar;
        this.f156140a = huVar.map.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.f156142c.hasNext() || this.f156140a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f156142c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f156140a.next();
            this.f156141b = entry.getKey();
            this.f156142c = ((C58471gg) entry.getValue()).iterator();
        }
        return new C58472gh(Objects.requireNonNull(this.f156141b), this.f156142c.next());
    }
}
