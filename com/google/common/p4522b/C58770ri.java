package com.google.common.p4522b;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.ri */
/* compiled from: PG */
final class C58770ri implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f156545a;

    /* renamed from: b */
    Map.Entry f156546b;

    /* renamed from: c */
    Iterator f156547c = C58568jw.f156237a;

    /* renamed from: d */
    final /* synthetic */ C58778rq f156548d;

    public C58770ri(C58778rq rqVar) {
        this.f156548d = rqVar;
        this.f156545a = rqVar.f156559a.entrySet().iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156545a.hasNext() || this.f156547c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f156547c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f156545a.next();
            this.f156546b = entry;
            this.f156547c = ((Map) entry.getValue()).entrySet().iterator();
        }
        Objects.requireNonNull(this.f156546b);
        Map.Entry entry2 = (Map.Entry) this.f156547c.next();
        return new C58787rz(this.f156546b.getKey(), entry2.getKey(), entry2.getValue());
    }

    public final void remove() {
        this.f156547c.remove();
        if (((Map) ((Map.Entry) Objects.requireNonNull(this.f156546b)).getValue()).isEmpty()) {
            this.f156545a.remove();
            this.f156546b = null;
        }
    }
}
