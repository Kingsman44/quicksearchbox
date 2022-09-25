package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C58976aa;
import java.util.Iterator;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.common.f.b.z */
/* compiled from: PG */
final class C59051z implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C59006aa f156973a;

    /* renamed from: b */
    private final C58976aa f156974b;

    /* renamed from: c */
    private int f156975c;

    /* renamed from: d */
    private int f156976d;

    public C59051z(C59006aa aaVar, C58976aa aaVar2, int i) {
        this.f156973a = aaVar;
        this.f156974b = aaVar2;
        int i2 = i & 31;
        this.f156975c = i2;
        this.f156976d = i >>> (i2 + 5);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f156975c >= 0;
    }

    public final Object next() {
        Object cast = this.f156974b.f156828b.cast(this.f156973a.mo56276f(this.f156975c));
        int i = this.f156976d;
        if (i != 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i) + 1;
            this.f156976d >>>= numberOfTrailingZeros;
            this.f156975c += numberOfTrailingZeros;
        } else {
            this.f156975c = -1;
        }
        return cast;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
