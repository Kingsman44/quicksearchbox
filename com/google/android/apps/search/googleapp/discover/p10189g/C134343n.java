package com.google.android.apps.search.googleapp.discover.p10189g;

import android.content.DialogInterface;
import android.view.View;
import com.facebook.litho.LithoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.n */
/* compiled from: PG */
public final class C134343n implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C134345p f365930a;

    /* renamed from: b */
    final /* synthetic */ LithoView f365931b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f365932c;

    public C134343n(C134345p pVar, LithoView lithoView, BottomSheetBehavior bottomSheetBehavior) {
        this.f365930a = pVar;
        this.f365931b = lithoView;
        this.f365932c = bottomSheetBehavior;
    }

    public final void onShow(DialogInterface dialogInterface) {
        View childAt;
        if (this.f365930a.f365943g && (childAt = this.f365931b.getChildAt(0)) != null) {
            this.f365932c.f115900k = childAt.getWidth();
        }
        this.f365932c.mo47516N(this.f365931b.getHeight());
    }
}
