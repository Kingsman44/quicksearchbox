package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.o */
/* compiled from: PG */
final class C27173o implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ MaterialButton f74265a;

    /* renamed from: b */
    final /* synthetic */ int f74266b;

    public C27173o(MaterialButton materialButton, int i) {
        this.f74265a = materialButton;
        this.f74266b = i;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Rect rect = new Rect();
        this.f74265a.getHitRect(rect);
        int height = (int) (((float) (this.f74266b - rect.height())) / 2.0f);
        rect.top -= height;
        rect.bottom += height;
        ((View) this.f74265a.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f74265a));
        this.f74265a.removeOnLayoutChangeListener(this);
    }
}
