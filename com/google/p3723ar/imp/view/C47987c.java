package com.google.p3723ar.imp.view;

import android.view.Choreographer;

/* renamed from: com.google.ar.imp.view.c */
/* compiled from: PG */
public final /* synthetic */ class C47987c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47993i f124199a;

    public /* synthetic */ C47987c(C47993i iVar) {
        this.f124199a = iVar;
    }

    public final void run() {
        C47993i iVar = this.f124199a;
        iVar.f124205a.mo53092a().removeCallbacks(iVar.f124207c);
        Choreographer.getInstance().removeFrameCallback(iVar.f124206b);
        iVar.f124209e = null;
    }
}
