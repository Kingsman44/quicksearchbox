package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.p1699f.p1700a.C20512a;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.elements.d */
/* compiled from: PG */
final class C20441d extends C20512a {

    /* renamed from: a */
    final /* synthetic */ C20446i f57476a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20441d(C20446i iVar, C20601ca caVar) {
        super(caVar, "AbsCarouselEager");
        this.f57476a = iVar;
    }

    /* renamed from: a */
    public final void mo25134a() {
        int width = (int) (((float) this.f57476a.f57494k.getWidth()) * 0.75f);
        C20446i iVar = this.f57476a;
        iVar.mo25394D(iVar.f57494k.getScrollX() + width);
        if (this.f57476a.f57488b.getVisibility() == 8) {
            width = this.f57476a.f57494k.getWidth();
        }
        this.f57476a.f57494k.smoothScrollBy(width, 0);
    }
}
