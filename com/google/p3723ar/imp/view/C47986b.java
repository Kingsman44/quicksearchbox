package com.google.p3723ar.imp.view;

import android.view.Choreographer;

/* renamed from: com.google.ar.imp.view.b */
/* compiled from: PG */
public final /* synthetic */ class C47986b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47993i f124197a;

    /* renamed from: b */
    public final /* synthetic */ C48011u f124198b;

    public /* synthetic */ C47986b(C47993i iVar, C48011u uVar) {
        this.f124197a = iVar;
        this.f124198b = uVar;
    }

    public final void run() {
        C47993i iVar = this.f124197a;
        C48011u uVar = this.f124198b;
        iVar.mo53098d();
        Choreographer.getInstance().postFrameCallback(iVar.f124206b);
        iVar.f124209e = uVar;
    }
}
