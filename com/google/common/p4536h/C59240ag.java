package com.google.common.p4536h;

import com.google.common.p4522b.C58518i;
import com.google.common.p4541l.C59313aa;
import java.io.File;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: com.google.common.h.ag */
/* compiled from: PG */
final class C59240ag extends C58518i {

    /* renamed from: b */
    final /* synthetic */ Deque f157349b;

    /* renamed from: c */
    final /* synthetic */ Deque f157350c;

    /* renamed from: d */
    final /* synthetic */ C59241ah f157351d;

    public C59240ag(C59241ah ahVar, Deque deque, Deque deque2) {
        this.f157351d = ahVar;
        this.f157349b = deque;
        this.f157350c = deque2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo55143a() {
        C59241ah ahVar = this.f157351d;
        Deque deque = this.f157349b;
        while (true) {
            Object a = ahVar.mo56706a(deque);
            if (a != null) {
                Iterator it = C59313aa.m92157a((File) a).iterator();
                if (!it.hasNext()) {
                    return a;
                }
                this.f157349b.addFirst(it);
                this.f157350c.push(a);
                ahVar = this.f157351d;
                deque = this.f157349b;
            } else if (!this.f157350c.isEmpty()) {
                return this.f157350c.pop();
            } else {
                this.f156164a = 3;
                return null;
            }
        }
    }
}
