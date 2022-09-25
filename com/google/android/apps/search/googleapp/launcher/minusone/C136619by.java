package com.google.android.apps.search.googleapp.launcher.minusone;

import android.view.View;
import com.google.android.apps.search.googleapp.launcher.minusone.p10354b.C136593a;
import com.google.common.p4535g.C59203do;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.by */
/* compiled from: PG */
public final class C136619by {

    /* renamed from: a */
    private final View f371906a;

    /* renamed from: b */
    private final View f371907b;

    /* renamed from: c */
    private float f371908c = -1.0f;

    public C136619by(View view, View view2) {
        C69664n.m101061g(view, "headerContainer");
        C69664n.m101061g(view2, "avatar");
        this.f371906a = view;
        this.f371907b = view2;
    }

    /* renamed from: a */
    public final void mo113272a(float f) {
        double d = (double) f;
        if (d >= C59203do.f157270a && d <= 1.0d && f != this.f371908c) {
            float f2 = 1.0f;
            this.f371906a.setAlpha(Math.min(1.0f, f + f));
            View view = this.f371907b;
            if (f < 0.25f) {
                f2 = 0.0f;
            } else if (f <= 0.5f) {
                f2 = (-0.25f + f) / 0.25f;
            }
            view.setAlpha(f2);
            view.setScaleX(C136593a.m221996b(f));
            view.setScaleY(C136593a.m221996b(f));
            this.f371908c = f;
        }
    }
}
