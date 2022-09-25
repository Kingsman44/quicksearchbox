package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.kj */
/* compiled from: PG */
final class C58582kj implements ListIterator, Iterator {

    /* renamed from: a */
    int f156263a;

    /* renamed from: b */
    C58581ki f156264b;

    /* renamed from: c */
    C58581ki f156265c;

    /* renamed from: d */
    C58581ki f156266d;

    /* renamed from: e */
    int f156267e;

    /* renamed from: f */
    final /* synthetic */ C58584kl f156268f;

    public C58582kj(C58584kl klVar, int i) {
        this.f156268f = klVar;
        this.f156267e = klVar.f156279f;
        int i2 = klVar.f156278e;
        C58838bb.m90864E(i, i2);
        if (i < i2 / 2) {
            this.f156264b = klVar.f156275a;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                next();
                i = i3;
            }
        } else {
            this.f156266d = klVar.f156276b;
            this.f156263a = i2;
            while (true) {
                int i4 = i + 1;
                if (i >= i2) {
                    break;
                }
                previous();
                i = i4;
            }
        }
        this.f156265c = null;
    }

    /* renamed from: c */
    private final void m90176c() {
        if (this.f156268f.f156279f != this.f156267e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public final C58581ki next() {
        m90176c();
        C58581ki kiVar = this.f156264b;
        if (kiVar != null) {
            this.f156265c = kiVar;
            this.f156266d = kiVar;
            this.f156264b = kiVar.f156259c;
            this.f156263a++;
            return this.f156265c;
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final C58581ki previous() {
        m90176c();
        C58581ki kiVar = this.f156266d;
        if (kiVar != null) {
            this.f156265c = kiVar;
            this.f156264b = kiVar;
            this.f156266d = kiVar.f156260d;
            this.f156263a--;
            return this.f156265c;
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        m90176c();
        return this.f156264b != null;
    }

    public final boolean hasPrevious() {
        m90176c();
        return this.f156266d != null;
    }

    public final int nextIndex() {
        return this.f156263a;
    }

    public final int previousIndex() {
        return this.f156263a - 1;
    }

    public final void remove() {
        m90176c();
        C58838bb.m90884s(this.f156265c != null, "no calls to next() since the last call to remove()");
        C58581ki kiVar = this.f156265c;
        if (kiVar != this.f156264b) {
            this.f156266d = kiVar.f156260d;
            this.f156263a--;
        } else {
            this.f156264b = kiVar.f156259c;
        }
        this.f156268f.mo55588p(kiVar);
        this.f156265c = null;
        this.f156267e = this.f156268f.f156279f;
    }

    public final /* synthetic */ void set(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }
}
