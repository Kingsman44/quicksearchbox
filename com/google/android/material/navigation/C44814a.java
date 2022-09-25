package com.google.android.material.navigation;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.badge.C44538c;

/* renamed from: com.google.android.material.navigation.a */
/* compiled from: PG */
final class C44814a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ C44819f f116887a;

    public C44814a(C44819f fVar) {
        this.f116887a = fVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f116887a.f116904d.getVisibility() == 0) {
            C44819f fVar = this.f116887a;
            ImageView imageView = fVar.f116904d;
            if (fVar.mo48200B()) {
                C44538c.m78734a(fVar.f116908h, imageView);
            }
        }
    }
}
