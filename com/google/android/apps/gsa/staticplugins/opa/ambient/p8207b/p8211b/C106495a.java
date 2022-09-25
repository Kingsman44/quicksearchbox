package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8211b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106593e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C106495a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106511q f297008a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f297009b;

    public /* synthetic */ C106495a(C106511q qVar, C106596h hVar) {
        this.f297008a = qVar;
        this.f297009b = hVar;
    }

    public final Object apply(Object obj) {
        C106511q qVar = this.f297008a;
        C106596h hVar = (C106596h) obj;
        C106593e eVar = (C106593e) this.f297009b.toBuilder();
        C63042fg i = C62953e.m95484i(qVar.f297042h.mo26870b());
        eVar.copyOnWrite();
        C106596h hVar2 = (C106596h) eVar.instance;
        i.getClass();
        hVar2.f297217l = i;
        hVar2.f297206a |= 16384;
        return (C106596h) eVar.build();
    }
}
