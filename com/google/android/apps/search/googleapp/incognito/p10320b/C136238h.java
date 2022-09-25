package com.google.android.apps.search.googleapp.incognito.p10320b;

import com.google.android.apps.search.googleapp.incognito.p10320b.p10321a.C136230a;
import com.google.android.apps.search.googleapp.incognito.p10320b.p10321a.C136231b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.googleapp.incognito.b.h */
/* compiled from: PG */
public final /* synthetic */ class C136238h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136240j f371023a;

    public /* synthetic */ C136238h(C136240j jVar) {
        this.f371023a = jVar;
    }

    public final Object apply(Object obj) {
        C136240j jVar = this.f371023a;
        C136230a aVar = (C136230a) ((C136231b) obj).toBuilder();
        long b = jVar.f371026b.mo26870b();
        aVar.copyOnWrite();
        C136231b bVar = (C136231b) aVar.instance;
        bVar.f371012a |= 1;
        bVar.f371013b = b;
        return (C136231b) aVar.build();
    }
}
