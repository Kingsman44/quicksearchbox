package com.google.android.libraries.componentview.components.elements;

import android.view.View;
import com.google.android.libraries.componentview.p1699f.p1700a.C20513b;

/* renamed from: com.google.android.libraries.componentview.components.elements.b */
/* compiled from: PG */
final class C20426b implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C20513b f57433a;

    /* renamed from: b */
    final /* synthetic */ C20446i f57434b;

    public C20426b(C20446i iVar, C20513b bVar) {
        this.f57434b = iVar;
        this.f57433a = bVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f57434b.f57494k.getViewTreeObserver().addOnPreDrawListener(this.f57433a);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f57434b.f57494k.getViewTreeObserver().removeOnPreDrawListener(this.f57433a);
    }
}
