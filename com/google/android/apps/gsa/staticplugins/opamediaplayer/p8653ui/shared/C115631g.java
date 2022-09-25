package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.g */
/* compiled from: PG */
final class C115631g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C115632h f320773a;

    public C115631g(C115632h hVar) {
        this.f320773a = hVar;
    }

    public final void run() {
        int scrollX = this.f320773a.getScrollX();
        C115632h hVar = this.f320773a;
        if (hVar.f320776b == scrollX) {
            hVar.mo102145a(hVar.f320775a);
            return;
        }
        hVar.f320776b = hVar.getScrollX();
        C115632h hVar2 = this.f320773a;
        hVar2.postDelayed(hVar2.f320777c, 50);
    }
}
