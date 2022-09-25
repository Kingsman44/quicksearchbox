package com.google.p3723ar.imp.view;

/* renamed from: com.google.ar.imp.view.w */
/* compiled from: PG */
public final /* synthetic */ class C48013w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f124251a;

    public /* synthetic */ C48013w(View view) {
        this.f124251a = view;
    }

    public final void run() {
        View view = this.f124251a;
        if (View.nHasSwapChain(view.f124179a)) {
            View.nDestroySwapChain(view.f124179a);
            View.nFlushAndWait(view.f124179a);
        }
    }
}
