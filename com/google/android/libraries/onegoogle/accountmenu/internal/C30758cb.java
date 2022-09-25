package com.google.android.libraries.onegoogle.accountmenu.internal;

import com.google.android.libraries.onegoogle.accountmanagement.C30281j;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.cb */
/* compiled from: PG */
public final /* synthetic */ class C30758cb implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30759cc f83018a;

    /* renamed from: b */
    public final /* synthetic */ C30753bx f83019b;

    public /* synthetic */ C30758cb(C30759cc ccVar, C30753bx bxVar) {
        this.f83018a = ccVar;
        this.f83019b = bxVar;
    }

    public final void run() {
        C30759cc ccVar = this.f83018a;
        C30753bx bxVar = this.f83019b;
        if (!ccVar.f83021f || C30281j.m56319c(ccVar.f82921b.mo35858i().f81934a.f81883d) == null) {
            bxVar.mo36416f();
            bxVar.f83001g.setOnClickListener(new C30757ca(ccVar));
        }
    }
}
