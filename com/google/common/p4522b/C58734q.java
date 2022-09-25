package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.q */
/* compiled from: PG */
final class C58734q implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    Map.Entry f156503a;

    /* renamed from: b */
    final /* synthetic */ Iterator f156504b;

    /* renamed from: c */
    final /* synthetic */ C58761r f156505c;

    public C58734q(C58761r rVar, Iterator it) {
        this.f156505c = rVar;
        this.f156504b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156504b.hasNext();
    }

    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f156504b.next();
        this.f156503a = entry;
        return entry.getKey();
    }

    public final void remove() {
        C58838bb.m90884s(this.f156503a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f156503a.getValue();
        this.f156504b.remove();
        this.f156505c.f156538a.f155874b -= collection.size();
        collection.clear();
        this.f156503a = null;
    }
}
