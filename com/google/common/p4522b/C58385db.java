package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.db */
/* compiled from: PG */
final class C58385db implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    int f155975a;

    /* renamed from: b */
    int f155976b;

    /* renamed from: c */
    int f155977c = -1;

    /* renamed from: d */
    final /* synthetic */ C58386dc f155978d;

    public C58385db(C58386dc dcVar) {
        this.f155978d = dcVar;
        this.f155975a = dcVar.f155980b;
        this.f155976b = dcVar.mo55115a();
    }

    /* renamed from: a */
    private final void m89444a() {
        if (this.f155978d.f155980b != this.f155975a) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f155976b >= 0;
    }

    public final Object next() {
        m89444a();
        if (hasNext()) {
            int i = this.f155976b;
            this.f155977c = i;
            Object obj = this.f155978d.mo55124g()[i];
            this.f155976b = this.f155978d.mo55117b(this.f155976b);
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m89444a();
        C58838bb.m90884s(this.f155977c >= 0, "no calls to next() since the last call to remove()");
        this.f155975a += 32;
        C58386dc dcVar = this.f155978d;
        dcVar.remove(dcVar.mo55124g()[this.f155977c]);
        this.f155976b--;
        this.f155977c = -1;
    }
}
