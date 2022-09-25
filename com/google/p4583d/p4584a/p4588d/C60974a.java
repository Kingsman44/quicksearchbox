package com.google.p4583d.p4584a.p4588d;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.d.a.d.a */
/* compiled from: PG */
final class C60974a implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f165097a;

    /* renamed from: b */
    final /* synthetic */ Iterator f165098b;

    public C60974a(Iterator it, Iterator it2) {
        this.f165097a = it;
        this.f165098b = it2;
    }

    public final boolean hasNext() {
        if (this.f165097a.hasNext()) {
            return true;
        }
        return this.f165098b.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f165097a.hasNext()) {
            return new C60991r(((Integer) this.f165097a.next()).toString());
        }
        if (this.f165098b.hasNext()) {
            return new C60991r((String) this.f165098b.next());
        }
        throw new NoSuchElementException();
    }
}
