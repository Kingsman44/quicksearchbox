package com.google.common.p4522b;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* renamed from: com.google.common.b.kb */
/* compiled from: PG */
public final class C58574kb extends AbstractSequentialList {

    /* renamed from: a */
    final /* synthetic */ Object f156243a;

    /* renamed from: b */
    final /* synthetic */ C58584kl f156244b;

    public C58574kb(C58584kl klVar, Object obj) {
        this.f156244b = klVar;
        this.f156243a = obj;
    }

    public final ListIterator listIterator(int i) {
        return new C58583kk(this.f156244b, this.f156243a, i);
    }

    public final int size() {
        C58580kh khVar = (C58580kh) this.f156244b.f156277d.get(this.f156243a);
        if (khVar == null) {
            return 0;
        }
        return khVar.f156256c;
    }
}
