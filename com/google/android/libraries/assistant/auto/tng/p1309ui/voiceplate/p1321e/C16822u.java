package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.u */
/* compiled from: PG */
public final /* synthetic */ class C16822u implements View.OnScrollChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C16826y f49260a;

    /* renamed from: b */
    public final /* synthetic */ View f49261b;

    /* renamed from: c */
    public final /* synthetic */ View f49262c;

    public /* synthetic */ C16822u(C16826y yVar, View view, View view2) {
        this.f49260a = yVar;
        this.f49261b = view;
        this.f49262c = view2;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        C16826y yVar = this.f49260a;
        View view2 = this.f49261b;
        View view3 = this.f49262c;
        if (yVar.f49267a.canScrollVertically(1)) {
            view2.setAlpha(yVar.f49269c);
        } else {
            view2.setAlpha(yVar.f49270d);
        }
        if (yVar.f49267a.canScrollVertically(-1)) {
            view3.setAlpha(yVar.f49269c);
        } else {
            view3.setAlpha(yVar.f49270d);
        }
    }
}
