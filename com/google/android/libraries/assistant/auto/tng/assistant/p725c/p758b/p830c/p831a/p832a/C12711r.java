package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C12711r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C12714u f39797a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f39798b;

    public /* synthetic */ C12711r(C12714u uVar, Throwable th) {
        this.f39797a = uVar;
        this.f39798b = th;
    }

    public final void run() {
        C12714u uVar = this.f39797a;
        Throwable th = this.f39798b;
        C2164c cVar = uVar.f39803c;
        if (cVar != null) {
            cVar.mo5439d(th);
            uVar.f39803c = null;
        }
    }
}
