package com.google.android.material.bottomsheet;

import android.view.View;

/* renamed from: com.google.android.material.bottomsheet.a */
/* compiled from: PG */
final class C44550a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f115930a;

    /* renamed from: b */
    final /* synthetic */ int f115931b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f115932c;

    public C44550a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f115932c = bottomSheetBehavior;
        this.f115930a = view;
        this.f115931b = i;
    }

    public final void run() {
        this.f115932c.mo47513K(this.f115930a, this.f115931b, false);
    }
}
