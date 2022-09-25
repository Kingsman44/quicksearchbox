package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8599d;

import android.animation.ValueAnimator;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.d.m */
/* compiled from: PG */
public final /* synthetic */ class C114030m implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C114032o f315695a;

    public /* synthetic */ C114030m(C114032o oVar) {
        this.f315695a = oVar;
    }

    public final void run() {
        long j;
        C114032o oVar = this.f315695a;
        oVar.f315700d.measure(View.MeasureSpec.makeMeasureSpec(oVar.f315700d.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET));
        C114034q.m188814j(oVar.f315699c, oVar.f315705i);
        int measuredHeight = oVar.f315700d.getMeasuredHeight();
        int i = oVar.f315697a;
        if (i == measuredHeight) {
            oVar.mo100946a();
            return;
        }
        oVar.f315698b = ValueAnimator.ofInt(new int[]{i, measuredHeight});
        oVar.f315698b.addUpdateListener(new C114029l(oVar.f315700d));
        oVar.f315698b.addListener(new C114031n(oVar));
        ValueAnimator valueAnimator = oVar.f315698b;
        int i2 = oVar.f315706j;
        if (i2 > 0) {
            j = (long) i2;
        } else {
            j = C114034q.f315713a.toMillis();
        }
        valueAnimator.setDuration(j);
        oVar.f315698b.start();
    }
}
