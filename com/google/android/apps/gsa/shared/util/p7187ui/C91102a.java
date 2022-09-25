package com.google.android.apps.gsa.shared.util.p7187ui;

import android.view.animation.Interpolator;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C91102a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TextView f254394a;

    /* renamed from: b */
    public final /* synthetic */ CharSequence f254395b;

    /* renamed from: c */
    public final /* synthetic */ float f254396c;

    public /* synthetic */ C91102a(TextView textView, CharSequence charSequence, float f) {
        this.f254394a = textView;
        this.f254395b = charSequence;
        this.f254396c = f;
    }

    public final void run() {
        TextView textView = this.f254394a;
        CharSequence charSequence = this.f254395b;
        float f = this.f254396c;
        Interpolator interpolator = C91104c.f254400a;
        textView.setText(charSequence);
        textView.setScaleX(f);
        textView.setScaleY(f);
        C91104c.m148853b(textView).alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
    }
}
