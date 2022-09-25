package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.content.C1878d;
import androidx.core.graphics.C1924a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.a */
/* compiled from: PG */
public final /* synthetic */ class C112080a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ C112101i f311261a;

    /* renamed from: b */
    public final /* synthetic */ View f311262b;

    public /* synthetic */ C112080a(C112101i iVar, View view) {
        this.f311261a = iVar;
        this.f311262b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C112101i iVar = this.f311261a;
        View view = this.f311262b;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        C58976aa aaVar = C58975e.f156826a;
        view.setAlpha(((float) intValue) / 255.0f);
        iVar.getActivity().getWindow().setStatusBarColor(C1924a.m5189h(C1878d.m5128a(iVar.getContext(), R.color.intent_launcher_background), intValue));
    }
}
