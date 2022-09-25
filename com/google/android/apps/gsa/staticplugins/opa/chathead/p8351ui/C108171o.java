package com.google.android.apps.gsa.staticplugins.opa.chathead.p8351ui;

import android.view.ViewPropertyAnimator;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chathead.ui.o */
/* compiled from: PG */
public final /* synthetic */ class C108171o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108185z f300832a;

    /* renamed from: b */
    public final /* synthetic */ boolean f300833b;

    public /* synthetic */ C108171o(C108185z zVar, boolean z) {
        this.f300832a = zVar;
        this.f300833b = z;
    }

    public final void run() {
        long j;
        C108185z zVar = this.f300832a;
        boolean z = this.f300833b;
        zVar.mo96529k();
        if (zVar.f300869f.getAndSet(false)) {
            zVar.f300865b.mo28213m("ChatHead.resetPosition", 10, new C108158b(zVar));
        }
        if (zVar.f300873j == 2) {
            zVar.f300873j = 3;
            zVar.mo96520b().setX((float) ((zVar.mo96523e().getWidth() / 2) - (zVar.mo96520b().getWidth() / 2)));
            zVar.mo96520b().setAlpha(1.0f);
            zVar.mo96523e().setVisibility(0);
            zVar.mo96523e().setAlpha(0.0f);
            ViewPropertyAnimator alpha = zVar.mo96523e().animate().alpha(1.0f);
            if (zVar.f300870g) {
                j = 0;
            } else {
                j = C108185z.f300855a.toMillis();
            }
            alpha.setDuration(j).withEndAction(new C108169m(zVar)).start();
        }
        zVar.mo96532q(false);
        zVar.mo96534s(z);
    }
}
