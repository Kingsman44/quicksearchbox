package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.fs */
/* compiled from: PG */
final class C58456fs implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C58457ft f156065a;

    /* renamed from: b */
    private int f156066b;

    /* renamed from: c */
    private int f156067c = -1;

    /* renamed from: d */
    private int f156068d;

    /* renamed from: e */
    private int f156069e;

    public C58456fs(C58457ft ftVar) {
        this.f156065a = ftVar;
        C58458fu fuVar = ftVar.f156070b;
        this.f156066b = fuVar.f156075e;
        this.f156068d = fuVar.f156074d;
        this.f156069e = fuVar.f156073c;
    }

    /* renamed from: a */
    private final void m89731a() {
        if (this.f156065a.f156070b.f156074d != this.f156068d) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        m89731a();
        return this.f156066b != -2 && this.f156069e > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f156065a.mo55310a(this.f156066b);
            int i = this.f156066b;
            this.f156067c = i;
            this.f156066b = this.f156065a.f156070b.f156076f[i];
            this.f156069e--;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m89731a();
        C58838bb.m90884s(this.f156067c != -1, "no calls to next() since the last call to remove()");
        C58458fu fuVar = this.f156065a.f156070b;
        int i = this.f156067c;
        fuVar.mo55341g(i, C58462fy.m89758b(fuVar.f156071a[i]));
        int i2 = this.f156066b;
        C58458fu fuVar2 = this.f156065a.f156070b;
        if (i2 == fuVar2.f156073c) {
            this.f156066b = this.f156067c;
        }
        this.f156067c = -1;
        this.f156068d = fuVar2.f156074d;
    }
}
