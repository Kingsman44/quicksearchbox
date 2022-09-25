package com.google.common.p4526f.p4528b;

import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.f.b.x */
/* compiled from: PG */
final class C59049x implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C59050y f156970a;

    /* renamed from: b */
    private int f156971b = 0;

    public C59049x(C59050y yVar) {
        this.f156970a = yVar;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156971b < this.f156970a.f156972a.f156896b;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C59006aa aaVar = this.f156970a.f156972a;
        int[] iArr = aaVar.f156895a;
        int i = this.f156971b;
        this.f156971b = i + 1;
        return aaVar.mo56275e(iArr[i] & 31);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
