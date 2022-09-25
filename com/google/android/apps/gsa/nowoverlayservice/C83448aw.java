package com.google.android.apps.gsa.nowoverlayservice;

import android.view.View;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.aw */
/* compiled from: PG */
final class C83448aw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C83468bb f227479a;

    public C83448aw(C83468bb bbVar) {
        this.f227479a = bbVar;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        this.f227479a.f227554e.mo81810ar();
        LauncherPreviewBitmapView launcherPreviewBitmapView = this.f227479a.f227536B;
        if (launcherPreviewBitmapView != null) {
            launcherPreviewBitmapView.setVisibility(8);
        }
        C83468bb bbVar = this.f227479a;
        bbVar.f227536B = null;
        C83475bi biVar = bbVar.f227569t;
        biVar.getClass();
        View view = biVar.f227605h;
        if (view != null) {
            view.setVisibility(8);
        }
        biVar.f227603f = null;
        biVar.f227604g = null;
        biVar.f227601d = 0.0f;
        biVar.f227602e = 0.0f;
        biVar.f227605h = null;
        Runnable runnable = this.f227479a.f227568s;
        if (runnable != null) {
            ((C83538k) runnable).f227764a.post(new C83536i(((C83538k) runnable).f227764a));
        }
    }
}
