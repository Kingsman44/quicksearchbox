package com.google.android.libraries.lens.view.filters;

import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.carousel.C25961q;
import com.google.android.libraries.lens.view.filters.carousel.FilterCarouselView;

/* renamed from: com.google.android.libraries.lens.view.filters.d */
/* compiled from: PG */
public final /* synthetic */ class C25971d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C26012i f70588a;

    public /* synthetic */ C25971d(C26012i iVar) {
        this.f70588a = iVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C26012i iVar = this.f70588a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        FilterCarouselView filterCarouselView = iVar.f70687l;
        filterCarouselView.getClass();
        C25961q a = filterCarouselView.mo17754z();
        a.f70555h = booleanValue;
        a.f70549b.setImportantForAccessibility(true != booleanValue ? 4 : 0);
        a.f70553f.setAlpha(true != booleanValue ? 0.5f : 1.0f);
        iVar.mo31219e();
    }
}
