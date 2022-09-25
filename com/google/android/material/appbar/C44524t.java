package com.google.android.material.appbar;

import android.view.View;
import androidx.core.p092d.C1886a;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2082cp;
import com.google.android.material.internal.C44747g;

/* renamed from: com.google.android.material.appbar.t */
/* compiled from: PG */
final class C44524t implements C44520p {

    /* renamed from: a */
    final /* synthetic */ CollapsingToolbarLayout f115757a;

    public C44524t(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f115757a = collapsingToolbarLayout;
    }

    /* renamed from: a */
    public final void mo18107a(AppBarLayout appBarLayout, int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f115757a;
        collapsingToolbarLayout.f115702d = i;
        C2082cp cpVar = collapsingToolbarLayout.f115703e;
        int d = cpVar != null ? cpVar.mo5242d() : 0;
        int childCount = this.f115757a.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f115757a.getChildAt(i2);
            C44523s sVar = (C44523s) childAt.getLayoutParams();
            C44530z c = CollapsingToolbarLayout.m78664c(childAt);
            int i3 = sVar.f115755a;
            if (i3 == 1) {
                c.mo47469c(C1886a.m5145c(-i, 0, this.f115757a.mo47431a(childAt)));
            } else if (i3 == 2) {
                c.mo47469c(Math.round(((float) (-i)) * sVar.f115756b));
            }
        }
        this.f115757a.mo47440g();
        CollapsingToolbarLayout collapsingToolbarLayout2 = this.f115757a;
        if (collapsingToolbarLayout2.f115701c != null && d > 0) {
            C2043bi.m5519M(collapsingToolbarLayout2);
        }
        int height = this.f115757a.getHeight();
        int h = (height - C2043bi.m5579h(this.f115757a)) - d;
        int b = this.f115757a.mo47432b();
        C44747g gVar = this.f115757a.f115699a;
        float f = (float) h;
        gVar.f116652c = Math.min(1.0f, ((float) (height - b)) / f);
        gVar.f116653d = gVar.mo48056a();
        CollapsingToolbarLayout collapsingToolbarLayout3 = this.f115757a;
        C44747g gVar2 = collapsingToolbarLayout3.f115699a;
        gVar2.f116654e = collapsingToolbarLayout3.f115702d + h;
        gVar2.mo48071p(((float) Math.abs(i)) / f);
    }
}
