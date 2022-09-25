package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.ah */
/* compiled from: PG */
abstract class C58310ah implements Iterator, p3186j$.util.Iterator {

    /* renamed from: b */
    int f155877b;

    /* renamed from: c */
    int f155878c = -1;

    /* renamed from: d */
    int f155879d;

    /* renamed from: e */
    final /* synthetic */ C58311ai f155880e;

    public C58310ah(C58311ai aiVar) {
        this.f155880e = aiVar;
        this.f155877b = aiVar.f155881a.mo55792a();
        this.f155879d = aiVar.f155881a.f156440d;
    }

    /* renamed from: b */
    private final void m89310b() {
        if (this.f155880e.f155881a.f156440d != this.f155879d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public abstract Object mo54921a(int i);

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        m89310b();
        return this.f155877b >= 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = mo54921a(this.f155877b);
            int i = this.f155877b;
            this.f155878c = i;
            this.f155877b = this.f155880e.f155881a.mo55796e(i);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m89310b();
        C58838bb.m90884s(this.f155878c != -1, "no calls to next() since the last call to remove()");
        C58311ai aiVar = this.f155880e;
        aiVar.f155882b -= (long) aiVar.f155881a.mo55800i(this.f155878c);
        this.f155877b = this.f155880e.f155881a.mo55797f(this.f155877b, this.f155878c);
        this.f155878c = -1;
        this.f155879d = this.f155880e.f155881a.f156440d;
    }
}
