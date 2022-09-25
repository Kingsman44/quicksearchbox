package com.google.android.libraries.componentview.components.p1689c;

import com.google.android.libraries.componentview.components.base.C20015al;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20519g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.componentview.components.c.bn */
/* compiled from: PG */
final class C20221bn extends C20519g {

    /* renamed from: a */
    final /* synthetic */ C20470a f56784a;

    /* renamed from: b */
    final /* synthetic */ C20223bp f56785b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20221bn(C20223bp bpVar, C20601ca caVar, C19742a aVar, C20470a aVar2) {
        super(caVar, aVar);
        this.f56785b = bpVar;
        this.f56784a = aVar2;
    }

    /* renamed from: a */
    public final void mo25126a() {
        C20223bp bpVar = this.f56785b;
        C58485gu K = this.f56784a.mo25422K(C20015al.class);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            bpVar.f56787d.execute(new C20222bo(bpVar.f56152a, C19742a.IMAGE_LOADING_ERROR, (C20015al) K.get(i)));
        }
    }
}
