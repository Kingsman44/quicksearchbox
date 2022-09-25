package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.b.n */
/* compiled from: PG */
final class C58653n implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final Iterator f156381a;

    /* renamed from: b */
    Collection f156382b;

    /* renamed from: c */
    final /* synthetic */ C58680o f156383c;

    public C58653n(C58680o oVar) {
        this.f156383c = oVar;
        this.f156381a = oVar.f156406a.entrySet().iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156381a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f156381a.next();
        this.f156382b = (Collection) entry.getValue();
        return this.f156383c.mo55747a(entry);
    }

    public final void remove() {
        C58838bb.m90884s(this.f156382b != null, "no calls to next() since the last call to remove()");
        this.f156381a.remove();
        this.f156383c.f156407b.f155874b -= this.f156382b.size();
        this.f156382b.clear();
        this.f156382b = null;
    }
}
