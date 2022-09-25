package com.google.common.p4522b;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: com.google.common.b.kc */
/* compiled from: PG */
final class C58575kc extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ C58584kl f156245a;

    public C58575kc(C58584kl klVar) {
        this.f156245a = klVar;
    }

    public final ListIterator listIterator(int i) {
        return new C58582kj(this.f156245a, i);
    }

    public final int size() {
        return this.f156245a.f156278e;
    }
}
