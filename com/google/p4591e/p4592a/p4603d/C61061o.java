package com.google.p4591e.p4592a.p4603d;

import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.e.a.d.o */
/* compiled from: PG */
final class C61061o implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    private boolean f165332a;

    /* renamed from: b */
    private final Iterator f165333b;

    /* renamed from: c */
    private final Iterator f165334c;

    public C61061o(C61064r rVar, C61057k kVar) {
        this.f165333b = kVar.iterator();
        this.f165334c = rVar.f165339b.entrySet().iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f165333b.hasNext() || this.f165334c.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.f165332a) {
            if (this.f165333b.hasNext()) {
                return ((C61056j) this.f165333b).next();
            }
            this.f165332a = true;
        }
        return (Map.Entry) this.f165334c.next();
    }

    public final void remove() {
        if (this.f165332a) {
            this.f165334c.remove();
        }
        this.f165333b.remove();
    }
}
