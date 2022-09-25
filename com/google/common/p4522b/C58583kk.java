package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.kk */
/* compiled from: PG */
final class C58583kk implements ListIterator, Iterator {

    /* renamed from: a */
    final Object f156269a;

    /* renamed from: b */
    int f156270b;

    /* renamed from: c */
    C58581ki f156271c;

    /* renamed from: d */
    C58581ki f156272d;

    /* renamed from: e */
    C58581ki f156273e;

    /* renamed from: f */
    final /* synthetic */ C58584kl f156274f;

    public C58583kk(C58584kl klVar, Object obj) {
        this.f156274f = klVar;
        this.f156269a = obj;
        C58580kh khVar = (C58580kh) klVar.f156277d.get(obj);
        this.f156271c = khVar == null ? null : khVar.f156254a;
    }

    public final void add(Object obj) {
        this.f156273e = this.f156274f.mo55583a(this.f156269a, obj, this.f156271c);
        this.f156270b++;
        this.f156272d = null;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156271c != null;
    }

    public final boolean hasPrevious() {
        return this.f156273e != null;
    }

    public final Object next() {
        C58581ki kiVar = this.f156271c;
        if (kiVar != null) {
            this.f156272d = kiVar;
            this.f156273e = kiVar;
            this.f156271c = kiVar.f156261e;
            this.f156270b++;
            return this.f156272d.f156258b;
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f156270b;
    }

    public final Object previous() {
        C58581ki kiVar = this.f156273e;
        if (kiVar != null) {
            this.f156272d = kiVar;
            this.f156271c = kiVar;
            this.f156273e = kiVar.f156262f;
            this.f156270b--;
            return this.f156272d.f156258b;
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f156270b - 1;
    }

    public final void remove() {
        C58838bb.m90884s(this.f156272d != null, "no calls to next() since the last call to remove()");
        C58581ki kiVar = this.f156272d;
        if (kiVar != this.f156271c) {
            this.f156273e = kiVar.f156262f;
            this.f156270b--;
        } else {
            this.f156271c = kiVar.f156261e;
        }
        this.f156274f.mo55588p(kiVar);
        this.f156272d = null;
    }

    public final void set(Object obj) {
        C58838bb.m90883r(this.f156272d != null);
        this.f156272d.f156258b = obj;
    }

    public C58583kk(C58584kl klVar, Object obj, int i) {
        int i2;
        C58581ki kiVar;
        C58581ki kiVar2;
        this.f156274f = klVar;
        C58580kh khVar = (C58580kh) klVar.f156277d.get(obj);
        if (khVar == null) {
            i2 = 0;
        } else {
            i2 = khVar.f156256c;
        }
        C58838bb.m90864E(i, i2);
        if (i < i2 / 2) {
            if (khVar == null) {
                kiVar = null;
            } else {
                kiVar = khVar.f156254a;
            }
            this.f156271c = kiVar;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            if (khVar == null) {
                kiVar2 = null;
            } else {
                kiVar2 = khVar.f156255b;
            }
            this.f156273e = kiVar2;
            this.f156270b = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.f156269a = obj;
        this.f156272d = null;
    }
}
