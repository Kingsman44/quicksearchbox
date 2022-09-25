package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: com.google.android.material.textfield.ab */
/* compiled from: PG */
final class C44921ab extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ int f117334a;

    /* renamed from: b */
    final /* synthetic */ TextView f117335b;

    /* renamed from: c */
    final /* synthetic */ int f117336c;

    /* renamed from: d */
    final /* synthetic */ TextView f117337d;

    /* renamed from: e */
    final /* synthetic */ C44923ad f117338e;

    public C44921ab(C44923ad adVar, int i, TextView textView, int i2, TextView textView2) {
        this.f117338e = adVar;
        this.f117334a = i;
        this.f117335b = textView;
        this.f117336c = i2;
        this.f117337d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        TextView textView;
        C44923ad adVar = this.f117338e;
        adVar.f117342c = this.f117334a;
        adVar.f117341b = null;
        TextView textView2 = this.f117335b;
        if (textView2 != null) {
            textView2.setVisibility(4);
            if (this.f117336c == 1 && (textView = this.f117338e.f117346g) != null) {
                textView.setText((CharSequence) null);
            }
        }
        TextView textView3 = this.f117337d;
        if (textView3 != null) {
            textView3.setTranslationY(0.0f);
            this.f117337d.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f117337d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
