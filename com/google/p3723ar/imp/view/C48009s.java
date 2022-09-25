package com.google.p3723ar.imp.view;

/* renamed from: com.google.ar.imp.view.s */
/* compiled from: PG */
public final /* synthetic */ class C48009s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f124245a;

    public /* synthetic */ C48009s(View view) {
        this.f124245a = view;
    }

    public final void run() {
        View view = this.f124245a;
        View.nDestroyView(view.f124179a);
        view.f124179a = 0;
    }
}
