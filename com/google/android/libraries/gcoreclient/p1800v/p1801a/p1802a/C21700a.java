package com.google.android.libraries.gcoreclient.p1800v.p1801a.p1802a;

import com.google.android.gms.people.internal.C145658b;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gcoreclient.v.a.a.a */
/* compiled from: PG */
final class C21700a implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    protected final Iterator f60018a;

    public C21700a(Iterator it) {
        this.f60018a = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f60018a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C21702c((C145658b) this.f60018a.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from this Iterator");
    }
}
