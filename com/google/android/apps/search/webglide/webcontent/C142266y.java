package com.google.android.apps.search.webglide.webcontent;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import androidx.viewpager2.widget.C4313p;
import com.google.android.apps.search.webglide.p10699b.C142185p;

/* renamed from: com.google.android.apps.search.webglide.webcontent.y */
/* compiled from: PG */
final class C142266y extends C4313p {

    /* renamed from: a */
    final /* synthetic */ C142267z f385963a;

    public C142266y(C142267z zVar) {
        this.f385963a = zVar;
    }

    /* renamed from: b */
    public final void mo9202b(int i) {
        C142267z zVar = this.f385963a;
        C142185p pVar = zVar.f385965b;
        pVar.getClass();
        if (i != pVar.f385735k) {
            Fragment c = zVar.f385964a.getChildFragmentManager().f634a.mo671c("WebGlideWebCoordinatorFragment");
            if (c != null) {
                C0154a aVar = new C0154a(zVar.f385964a.getChildFragmentManager());
                aVar.mo516m(c);
                aVar.mo509f();
                return;
            }
            return;
        }
        zVar.mo117098b();
    }
}
