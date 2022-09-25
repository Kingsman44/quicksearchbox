package com.google.android.apps.gsa.searchplate;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.searchplate.an */
/* compiled from: PG */
public final class C88912an extends View {

    /* renamed from: a */
    public StaticLayout f240863a;

    /* renamed from: b */
    public boolean f240864b;

    public C88912an(Context context, StaticLayout staticLayout, boolean z) {
        super(context);
        this.f240863a = staticLayout;
        this.f240864b = z;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f240863a.draw(canvas);
    }
}
