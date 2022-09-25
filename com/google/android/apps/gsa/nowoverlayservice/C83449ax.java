package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ax */
/* compiled from: PG */
final class C83449ax extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C83468bb f227480a;

    public C83449ax(C83468bb bbVar) {
        this.f227480a = bbVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C58976aa aaVar = C58975e.f156826a;
        C83468bb bbVar = this.f227480a;
        LauncherPreviewBitmapView launcherPreviewBitmapView = bbVar.f227536B;
        if (launcherPreviewBitmapView != null && !bbVar.f227562m) {
            launcherPreviewBitmapView.setVisibility(8);
        }
        C83468bb bbVar2 = this.f227480a;
        bbVar2.f227559j = true;
        bbVar2.mo76798g(false);
        this.f227480a.f227554e.mo81792Y(true);
        this.f227480a.f227554e.mo81820p(true);
    }
}
