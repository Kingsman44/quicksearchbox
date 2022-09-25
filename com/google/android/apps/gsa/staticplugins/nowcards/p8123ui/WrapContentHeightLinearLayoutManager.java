package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.support.p033v7.widget.C0661fw;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.WrapContentHeightLinearLayoutManager */
/* compiled from: PG */
public class WrapContentHeightLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private int f292782a;

    public WrapContentHeightLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    public final void onMeasure(C0661fw fwVar, C0670ge geVar, int i, int i2) {
        if (this.f292782a <= 0 && geVar.mo3052a() > 0) {
            View p = fwVar.mo3039p(0);
            p.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f292782a = getDecoratedMeasuredHeight(p);
            fwVar.mo3033j(p);
        }
        super.onMeasure(fwVar, geVar, i, View.MeasureSpec.makeMeasureSpec(this.f292782a, 1073741824));
    }
}
