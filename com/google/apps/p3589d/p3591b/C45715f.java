package com.google.apps.p3589d.p3591b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.apps.d.b.f */
/* compiled from: PG */
final class C45715f implements Iterator {

    /* renamed from: a */
    private final C45716g f120218a;

    /* renamed from: b */
    private int f120219b;

    public C45715f(C45716g gVar) {
        this.f120218a = gVar;
        this.f120219b = gVar.f120220a.size();
    }

    public final boolean hasNext() {
        return this.f120219b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            C45716g gVar = this.f120218a;
            int i = this.f120219b - 1;
            this.f120219b = i;
            return gVar.mo49815d(i);
        }
        throw new NoSuchElementException();
    }
}
