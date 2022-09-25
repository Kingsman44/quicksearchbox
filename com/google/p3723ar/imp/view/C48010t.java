package com.google.p3723ar.imp.view;

/* renamed from: com.google.ar.imp.view.t */
/* compiled from: PG */
public final /* synthetic */ class C48010t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C47981aa f124246a;

    /* renamed from: b */
    public final /* synthetic */ int f124247b;

    public /* synthetic */ C48010t(C47981aa aaVar, int i) {
        this.f124246a = aaVar;
        this.f124247b = i;
    }

    public final void run() {
        C47981aa aaVar = this.f124246a;
        int i = this.f124247b;
        View view = aaVar.f124185b;
        if (view.f124182d != i) {
            view.f124182d = i;
            View.nSetDisplayRotation(view.f124179a, i);
        }
    }
}
