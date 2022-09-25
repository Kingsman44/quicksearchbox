package com.google.android.apps.search.googleapp.discover.p10189g;

import android.view.View;
import com.facebook.litho.C6227ea;
import com.facebook.litho.LithoView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.google.android.apps.search.googleapp.discover.g.g */
/* compiled from: PG */
final class C134336g implements C6227ea {

    /* renamed from: a */
    final /* synthetic */ C134337h f365912a;

    /* renamed from: b */
    final /* synthetic */ LithoView f365913b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f365914c;

    public C134336g(C134337h hVar, LithoView lithoView, BottomSheetBehavior bottomSheetBehavior) {
        this.f365912a = hVar;
        this.f365913b = lithoView;
        this.f365914c = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final void mo13191a() {
        View childAt;
        if (this.f365912a.f365918c && (childAt = this.f365913b.getChildAt(0)) != null) {
            this.f365914c.f115900k = childAt.getWidth();
        }
        this.f365914c.mo47516N(this.f365913b.getHeight());
    }
}
