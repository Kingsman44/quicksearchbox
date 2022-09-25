package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.kg */
/* compiled from: PG */
final class C58579kg implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Set f156249a;

    /* renamed from: b */
    C58581ki f156250b;

    /* renamed from: c */
    C58581ki f156251c;

    /* renamed from: d */
    int f156252d;

    /* renamed from: e */
    final /* synthetic */ C58584kl f156253e;

    public C58579kg(C58584kl klVar) {
        this.f156253e = klVar;
        this.f156249a = C58758qx.m90649g(klVar.mo54951D().size());
        this.f156250b = klVar.f156275a;
        this.f156252d = klVar.f156279f;
    }

    /* renamed from: a */
    private final void m90175a() {
        if (this.f156253e.f156279f != this.f156252d) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        m90175a();
        return this.f156250b != null;
    }

    public final Object next() {
        C58581ki kiVar;
        m90175a();
        C58581ki kiVar2 = this.f156250b;
        if (kiVar2 != null) {
            this.f156251c = kiVar2;
            this.f156249a.add(kiVar2.f156257a);
            do {
                kiVar = this.f156250b.f156259c;
                this.f156250b = kiVar;
                if (kiVar == null || this.f156249a.add(kiVar.f156257a)) {
                }
                kiVar = this.f156250b.f156259c;
                this.f156250b = kiVar;
                break;
            } while (this.f156249a.add(kiVar.f156257a));
            return this.f156251c.f156257a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        m90175a();
        C58838bb.m90884s(this.f156251c != null, "no calls to next() since the last call to remove()");
        this.f156253e.mo55587f(this.f156251c.f156257a);
        this.f156251c = null;
        this.f156252d = this.f156253e.f156279f;
    }
}
