package com.google.android.gms.car;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.gms.car.du */
/* compiled from: PG */
public final class C143204du implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f388302a;

    public C143204du(View view) {
        this.f388302a = view;
    }

    public final void onTouchModeChanged(boolean z) {
        this.f388302a.getViewTreeObserver().removeOnTouchModeChangeListener(this);
        this.f388302a.getViewTreeObserver().addOnPreDrawListener(new C143203dt(this));
    }
}
