package com.google.android.libraries.componentview.components.p1693e;

import com.google.android.libraries.componentview.components.base.C20015al;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1699f.C20519g;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.componentview.components.e.i */
/* compiled from: PG */
final class C20365i extends C20519g {

    /* renamed from: a */
    final /* synthetic */ int f57254a;

    /* renamed from: b */
    final /* synthetic */ C20366j f57255b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20365i(C20366j jVar, C20601ca caVar, C19742a aVar, int i) {
        super(caVar, aVar);
        this.f57255b = jVar;
        this.f57254a = i;
    }

    /* renamed from: a */
    public final void mo25126a() {
        C20369m mVar = this.f57255b.f57256a;
        C58485gu K = ((C20470a) C58485gu.m89842j(mVar.f56324d).get(this.f57254a)).mo25422K(C20015al.class);
        int size = K.size();
        for (int i = 0; i < size; i++) {
            mVar.f56325e.execute(new C20367k(mVar.f57267j, C19742a.IMAGE_LOADING_ERROR, (C20015al) K.get(i)));
        }
    }
}
