package com.google.android.material.internal;

import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.internal.bj */
/* compiled from: PG */
final class C44738bj implements View.OnAttachStateChangeListener {
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        C2043bi.m5524R(view);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
