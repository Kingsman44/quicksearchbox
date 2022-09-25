package com.google.android.libraries.lens.view.filters.translation;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cu */
/* compiled from: PG */
public final /* synthetic */ class C26110cu implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C26114cy f70949a;

    public /* synthetic */ C26110cu(C26114cy cyVar) {
        this.f70949a = cyVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C26114cy cyVar = this.f70949a;
        ((View) cyVar.f70961i.getParent()).setTouchDelegate(new TouchDelegate(new Rect(Math.min(cyVar.f70962j.getLeft(), cyVar.f70961i.getLeft()), i2, Math.max(cyVar.f70962j.getRight(), cyVar.f70961i.getRight()), i4), cyVar.f70961i));
    }
}
