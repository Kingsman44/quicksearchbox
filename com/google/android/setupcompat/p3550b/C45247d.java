package com.google.android.setupcompat.p3550b;

import android.view.View;

/* renamed from: com.google.android.setupcompat.b.d */
/* compiled from: PG */
final class C45247d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C45248e f118178a;

    public C45247d(C45248e eVar) {
        this.f118178a = eVar;
    }

    public final void run() {
        View peekDecorView = this.f118178a.f118180b.peekDecorView();
        if (peekDecorView != null) {
            C45249f.m80604b(peekDecorView);
            return;
        }
        C45248e eVar = this.f118178a;
        int i = eVar.f118181c - 1;
        eVar.f118181c = i;
        if (i >= 0) {
            eVar.f118179a.post(eVar.f118182d);
        } else {
            C45249f.f118183a.mo49113c("Cannot get decor view of window: ".concat(String.valueOf(String.valueOf(this.f118178a.f118180b))));
        }
    }
}
