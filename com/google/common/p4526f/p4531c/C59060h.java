package com.google.common.p4526f.p4531c;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.f.c.h */
/* compiled from: PG */
public final class C59060h implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C59061i f156979a;

    /* renamed from: b */
    private int f156980b = 0;

    public C59060h(C59061i iVar) {
        this.f156979a = iVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        int i = this.f156980b;
        C59061i iVar = this.f156979a;
        return i < iVar.mo56324a() - iVar.mo56325b();
    }

    public final Object next() {
        int i = this.f156980b;
        C59061i iVar = this.f156979a;
        if (i < iVar.mo56324a() - iVar.mo56325b()) {
            C59061i iVar2 = this.f156979a;
            Object obj = iVar2.f156982b.f156984b[iVar2.mo56325b() + i];
            this.f156980b = i + 1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
