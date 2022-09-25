package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.p1699f.p1700a.C20512a;
import com.google.android.libraries.componentview.services.application.C20601ca;

/* renamed from: com.google.android.libraries.componentview.components.elements.c */
/* compiled from: PG */
final class C20440c extends C20512a {

    /* renamed from: a */
    final /* synthetic */ C20446i f57475a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20440c(C20446i iVar, C20601ca caVar) {
        super(caVar, "AbsCarouselEager");
        this.f57475a = iVar;
    }

    /* renamed from: a */
    public final void mo25134a() {
        int width = (int) (((float) this.f57475a.f57494k.getWidth()) * 0.75f);
        C20446i iVar = this.f57475a;
        iVar.mo25394D(iVar.f57494k.getScrollX() - width);
        if (this.f57475a.f57487a.getVisibility() == 8) {
            width = this.f57475a.f57494k.getWidth();
        }
        this.f57475a.f57494k.smoothScrollBy(-width, 0);
    }
}
