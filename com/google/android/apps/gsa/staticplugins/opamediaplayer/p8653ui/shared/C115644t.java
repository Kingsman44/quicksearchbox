package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.t */
/* compiled from: PG */
final class C115644t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C115645u f320809a;

    public C115644t(C115645u uVar) {
        this.f320809a = uVar;
    }

    public final void run() {
        int scrollX = this.f320809a.getScrollX();
        C115645u uVar = this.f320809a;
        if (uVar.f320812b == scrollX) {
            uVar.mo102166a(uVar.f320811a);
            return;
        }
        uVar.f320812b = uVar.getScrollX();
        C115645u uVar2 = this.f320809a;
        uVar2.postDelayed(uVar2.f320813c, 50);
    }
}
