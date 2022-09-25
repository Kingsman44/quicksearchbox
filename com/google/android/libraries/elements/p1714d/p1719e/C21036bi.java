package com.google.android.libraries.elements.p1714d.p1719e;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.libraries.elements.d.e.bi */
/* compiled from: PG */
final class C21036bi extends ViewOutlineProvider {

    /* renamed from: a */
    private final int f58947a;

    public C21036bi(int i) {
        this.f58947a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f58947a);
    }
}
