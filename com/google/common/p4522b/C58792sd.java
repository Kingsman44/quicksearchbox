package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.sd */
/* compiled from: PG */
final class C58792sd implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    C58795sg f156570a;

    /* renamed from: b */
    C58691ok f156571b;

    /* renamed from: c */
    final /* synthetic */ C58797si f156572c;

    public C58792sd(C58797si siVar) {
        C58795sg sgVar;
        this.f156572c = siVar;
        Object obj = siVar.rootReference.f156585a;
        C58795sg sgVar2 = null;
        if (obj != null) {
            C58447fj fjVar = siVar.range;
            if (fjVar.f156048b) {
                Object obj2 = fjVar.f156049c;
                sgVar = ((C58795sg) obj).mo56010c(siVar.comparator, obj2);
                if (sgVar != null) {
                    if (siVar.range.f156052f == 1 && siVar.comparator.compare(obj2, sgVar.f156576a) == 0) {
                        sgVar = sgVar.mo56014g();
                    }
                }
            } else {
                sgVar = siVar.header.mo56014g();
            }
            if (sgVar != siVar.header && siVar.range.mo55303c(sgVar.f156576a)) {
                sgVar2 = sgVar;
            }
        }
        this.f156570a = sgVar2;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        C58795sg sgVar = this.f156570a;
        if (sgVar == null) {
            return false;
        }
        if (!this.f156572c.range.mo55304d(sgVar.f156576a)) {
            return true;
        }
        this.f156570a = null;
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C58791sc scVar = new C58791sc(this.f156572c, (C58795sg) Objects.requireNonNull(this.f156570a));
            this.f156571b = scVar;
            if (this.f156570a.mo56014g() == this.f156572c.header) {
                this.f156570a = null;
            } else {
                this.f156570a = this.f156570a.mo56014g();
            }
            return scVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        C58838bb.m90884s(this.f156571b != null, "no calls to next() since the last call to remove()");
        this.f156572c.mo54928h(((C58791sc) this.f156571b).f156568a.f156576a, 0);
        this.f156571b = null;
    }
}
