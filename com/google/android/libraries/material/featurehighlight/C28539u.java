package com.google.android.libraries.material.featurehighlight;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.libraries.material.featurehighlight.u */
/* compiled from: PG */
final class C28539u extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ C28512ac f77573a;

    public C28539u(C28512ac acVar) {
        this.f77573a = acVar;
    }

    public final void getOutline(View view, Outline outline) {
        this.f77573a.f77415h.getOutlineProvider().getOutline(this.f77573a.f77415h, outline);
    }
}
