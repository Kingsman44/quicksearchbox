package com.google.android.libraries.onegoogle.tooltip;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.onegoogle.tooltip.i */
/* compiled from: PG */
final class C31073i implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f83705a;

    /* renamed from: b */
    final /* synthetic */ C31075k f83706b;

    public C31073i(C31075k kVar, View view) {
        this.f83706b = kVar;
        this.f83705a = view;
    }

    public final void onGlobalLayout() {
        this.f83705a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        C2043bi.m5520N(this.f83705a, new C31072h(this));
    }
}
