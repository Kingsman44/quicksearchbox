package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.apps.gsa.shared.p7148ui.header.LogoHeaderView;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.p */
/* compiled from: PG */
public final /* synthetic */ class C93992p implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C94001y f262515a;

    public /* synthetic */ C93992p(C94001y yVar) {
        this.f262515a = yVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        Interpolator interpolator;
        C94001y yVar = this.f262515a;
        Boolean bool = (Boolean) obj;
        LogoHeaderView logoHeaderView = yVar.f262531g;
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = ((Boolean) ((C23249a) yVar.f262526b.mo88248o()).mo28725a()).booleanValue();
        int i = 0;
        if (logoHeaderView.f253642n != booleanValue) {
            logoHeaderView.f253642n = booleanValue;
            logoHeaderView.f253629a.cancel();
            float f = 0.0f;
            if (booleanValue2) {
                if (true == booleanValue) {
                    f = 1.0f;
                }
                logoHeaderView.mo85000f(f, logoHeaderView.f253645q);
            } else {
                if (logoHeaderView.f253630b.isRunning()) {
                    logoHeaderView.f253630b.cancel();
                    logoHeaderView.mo85000f(logoHeaderView.f253644p, true != logoHeaderView.f253643o ? 0.0f : 1.0f);
                }
                ValueAnimator valueAnimator = logoHeaderView.f253629a;
                float[] fArr = new float[2];
                fArr[0] = logoHeaderView.f253644p;
                if (true == booleanValue) {
                    f = 1.0f;
                }
                fArr[1] = f;
                valueAnimator.setFloatValues(fArr);
                ValueAnimator valueAnimator2 = logoHeaderView.f253629a;
                if (booleanValue) {
                    interpolator = C91107f.f254406b;
                } else {
                    interpolator = C91107f.f254405a;
                }
                valueAnimator2.setInterpolator(interpolator);
                logoHeaderView.f253629a.start();
            }
            if (logoHeaderView.f253642n) {
                logoHeaderView.mo84998d();
            }
        }
        C94000x xVar = yVar.f262535k;
        if (xVar != null) {
            boolean booleanValue3 = bool.booleanValue();
            C22939d dVar = xVar.f262524a;
            if (dVar != null) {
                View il = dVar.mo28297il();
                if (true != booleanValue3) {
                    i = 4;
                }
                il.setVisibility(i);
            }
        }
    }
}
