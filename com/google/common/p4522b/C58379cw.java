package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.cw */
/* compiled from: PG */
abstract class C58379cw implements Iterator, p3186j$.util.Iterator {

    /* renamed from: b */
    int f155956b;

    /* renamed from: c */
    int f155957c;

    /* renamed from: d */
    int f155958d = -1;

    /* renamed from: e */
    final /* synthetic */ C58384da f155959e;

    public C58379cw(C58384da daVar) {
        this.f155959e = daVar;
        this.f155956b = daVar.f155970f;
        this.f155957c = daVar.mo55086c();
    }

    /* renamed from: b */
    private final void m89417b() {
        if (this.f155959e.f155970f != this.f155956b) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public abstract Object mo55067a(int i);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f155957c >= 0;
    }

    public final Object next() {
        m89417b();
        if (hasNext()) {
            int i = this.f155957c;
            this.f155958d = i;
            Object a = mo55067a(i);
            this.f155957c = this.f155959e.mo55090d(this.f155957c);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m89417b();
        C58838bb.m90884s(this.f155958d >= 0, "no calls to next() since the last call to remove()");
        this.f155956b += 32;
        C58384da daVar = this.f155959e;
        daVar.remove(daVar.mo55111s()[this.f155958d]);
        this.f155957c = this.f155959e.mo55084a(this.f155957c, this.f155958d);
        this.f155958d = -1;
    }
}
