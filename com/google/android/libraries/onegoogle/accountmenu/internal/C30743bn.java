package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bn */
/* compiled from: PG */
final class C30743bn implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30746bq f82977a;

    public C30743bn(C30746bq bqVar) {
        this.f82977a = bqVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f82977a.f82981c.getViewTreeObserver().addOnGlobalLayoutListener(this.f82977a.f82987i);
    }

    public final void onViewDetachedFromWindow(View view) {
        C30746bq bqVar = this.f82977a;
        MaterialCardView materialCardView = bqVar.f82981c;
        materialCardView.getViewTreeObserver().removeOnGlobalLayoutListener(bqVar.f82987i);
    }
}
