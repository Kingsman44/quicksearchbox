package com.google.common.p4536h;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: com.google.common.h.ae */
/* compiled from: PG */
final class C59238ae implements Iterable {

    /* renamed from: a */
    final /* synthetic */ C58528ij f157347a;

    /* renamed from: b */
    final /* synthetic */ C59242ai f157348b;

    public C59238ae(C59242ai aiVar, C58528ij ijVar) {
        this.f157348b = aiVar;
        this.f157347a = ijVar;
    }

    public final Iterator iterator() {
        C59241ah a = this.f157348b.mo56704a();
        C58800sl lA = this.f157347a.iterator();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.add(lA);
        return new C59240ag(a, arrayDeque2, arrayDeque);
    }
}
