package com.google.common.p4522b;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: com.google.common.b.kf */
/* compiled from: PG */
final class C58578kf extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ C58584kl f156248a;

    public C58578kf(C58584kl klVar) {
        this.f156248a = klVar;
    }

    public final ListIterator listIterator(int i) {
        C58582kj kjVar = new C58582kj(this.f156248a, i);
        return new C58577ke(kjVar, kjVar);
    }

    public final int size() {
        return this.f156248a.f156278e;
    }
}
