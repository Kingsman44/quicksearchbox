package com.google.android.apps.search.googleapp.launcher.minusone;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.googleapp.discover.streamui.p10231g.C134748a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136526d;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136532j;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.C136533k;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136492a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136499b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a.C136512o;
import com.google.android.apps.search.googleapp.restrictedwidthlayout.RestrictedWidthLayout;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.m */
/* compiled from: PG */
final class C136658m implements C134748a {

    /* renamed from: a */
    final /* synthetic */ RestrictedWidthLayout f372013a;

    /* renamed from: b */
    final /* synthetic */ C136652i f372014b;

    /* renamed from: c */
    final /* synthetic */ ViewGroup f372015c;

    public C136658m(RestrictedWidthLayout restrictedWidthLayout, C136652i iVar, ViewGroup viewGroup) {
        this.f372013a = restrictedWidthLayout;
        this.f372014b = iVar;
        this.f372015c = viewGroup;
    }

    /* renamed from: a */
    public final void mo111560a(int i, int i2) {
        View view;
        float f = (float) i2;
        this.f372013a.setTranslationY(f);
        C136532j jVar = this.f372014b.f371979B;
        if (jVar != null) {
            int height = this.f372013a.getHeight();
            C136533k kVar = jVar.f371727a;
            if (height != 0) {
                kVar.f371735h = Math.min(1.0f, Math.abs(f / ((float) height)));
                kVar.mo113164c(1.0f);
                C136526d dVar = kVar.f371737j;
                if (dVar != null) {
                    float f2 = kVar.f371735h;
                    C136512o c = dVar.f371696a.mo113104c();
                    if (!(c == null || (view = c.mo17754z().f371669f) == null)) {
                        C136499b a = ((C136492a) view).mo17754z();
                        if (a.f371614e != f2) {
                            a.f371614e = f2;
                            a.mo113098b();
                            a.f371610a.invalidate();
                        }
                    }
                }
            }
        }
        if (i2 > Integer.MIN_VALUE) {
            C136580ao aoVar = this.f372014b.f372004w;
            ViewGroup viewGroup = this.f372015c;
            RestrictedWidthLayout restrictedWidthLayout = this.f372013a;
            restrictedWidthLayout.getHeight();
            aoVar.mo113249i(viewGroup, restrictedWidthLayout, i2, this.f372014b.mo113306b());
        }
    }
}
