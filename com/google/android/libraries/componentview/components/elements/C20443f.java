package com.google.android.libraries.componentview.components.elements;

import com.google.android.libraries.componentview.components.base.C20015al;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20519g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.componentview.components.elements.f */
/* compiled from: PG */
public final class C20443f extends C20519g {

    /* renamed from: a */
    final /* synthetic */ C20444g f57479a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20443f(C20444g gVar, C20601ca caVar, C19742a aVar) {
        super(caVar, aVar);
        this.f57479a = gVar;
    }

    /* renamed from: a */
    public final void mo25126a() {
        C20446i iVar = this.f57479a.f57482c;
        C58485gu K = iVar.mo25422K(C20015al.class);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            iVar.f56325e.execute(new C20445h(iVar.f57490g, C19742a.IMAGE_LOADING_ERROR, (C20015al) K.get(i)));
        }
    }
}
