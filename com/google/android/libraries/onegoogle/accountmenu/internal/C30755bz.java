package com.google.android.libraries.onegoogle.accountmenu.internal;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bz */
/* compiled from: PG */
public final /* synthetic */ class C30755bz implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30759cc f83012a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f83013b;

    public /* synthetic */ C30755bz(C30759cc ccVar, C58485gu guVar) {
        this.f83012a = ccVar;
        this.f83013b = guVar;
    }

    public final void run() {
        C30759cc ccVar = this.f83012a;
        C58485gu guVar = this.f83013b;
        if (ccVar.isResumed()) {
            ccVar.mo36458f(guVar);
        }
    }
}
