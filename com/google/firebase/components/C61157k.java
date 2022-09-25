package com.google.firebase.components;

import com.google.firebase.p4611d.C61174a;

/* renamed from: com.google.firebase.components.k */
/* compiled from: PG */
public final /* synthetic */ class C61157k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61144ad f165485a;

    /* renamed from: b */
    public final /* synthetic */ C61174a f165486b;

    public /* synthetic */ C61157k(C61144ad adVar, C61174a aVar) {
        this.f165485a = adVar;
        this.f165486b = aVar;
    }

    public final void run() {
        C61144ad adVar = this.f165485a;
        C61174a aVar = this.f165486b;
        if (adVar.f165465b == C61144ad.f165464a) {
            synchronized (adVar) {
                adVar.f165465b = aVar;
            }
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
