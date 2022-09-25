package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.r */
/* compiled from: PG */
public final /* synthetic */ class C26191r implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C26186m f71170a;

    /* renamed from: b */
    public final /* synthetic */ int f71171b;

    public /* synthetic */ C26191r(C26186m mVar, int i) {
        this.f71170a = mVar;
        this.f71171b = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C26186m mVar = this.f71170a;
        int i9 = this.f71171b;
        int i10 = (i + i3) / 2;
        int i11 = (i2 + i4) / 2;
        mVar.f71162h.setTouchDelegate(new TouchDelegate(new Rect(i10 - i9, i11 - i9, i10 + i9, i11 + i9), mVar.f71163i));
    }
}
