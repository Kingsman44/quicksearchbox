package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p813b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.b.f */
/* compiled from: PG */
public final /* synthetic */ class C12517f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12520i f39435a;

    /* renamed from: b */
    public final /* synthetic */ long f39436b;

    public /* synthetic */ C12517f(C12520i iVar, long j) {
        this.f39435a = iVar;
        this.f39436b = j;
    }

    public final void run() {
        C12520i iVar = this.f39435a;
        long j = this.f39436b;
        if (iVar.f39443d == 0) {
            iVar.f39444e = C58833ax.m90834k(Long.valueOf(j));
            C12526o oVar = iVar.f39441b;
            C58881cr crVar = iVar.f39442c;
            oVar.f39456b.put(Integer.valueOf(System.identityHashCode(crVar)), crVar);
        }
        iVar.f39443d++;
    }
}
