package com.google.p386ak.p388b;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.ak.b.ai */
/* compiled from: PG */
abstract class C8335ai implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    C8336aj f29148a;

    /* renamed from: b */
    C8336aj f29149b = null;

    /* renamed from: c */
    int f29150c;

    /* renamed from: d */
    final /* synthetic */ C8337ak f29151d;

    public C8335ai(C8337ak akVar) {
        this.f29151d = akVar;
        this.f29148a = akVar.f29165e.f29155d;
        this.f29150c = akVar.f29164d;
    }

    /* renamed from: a */
    public final C8336aj mo17064a() {
        C8336aj ajVar = this.f29148a;
        C8337ak akVar = this.f29151d;
        if (ajVar == akVar.f29165e) {
            throw new NoSuchElementException();
        } else if (akVar.f29164d == this.f29150c) {
            this.f29148a = ajVar.f29155d;
            this.f29149b = ajVar;
            return ajVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f29148a != this.f29151d.f29165e;
    }

    public final void remove() {
        C8336aj ajVar = this.f29149b;
        if (ajVar != null) {
            this.f29151d.mo17077e(ajVar, true);
            this.f29149b = null;
            this.f29150c = this.f29151d.f29164d;
            return;
        }
        throw new IllegalStateException();
    }
}
