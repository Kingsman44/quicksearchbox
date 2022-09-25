package com.google.android.apps.gsa.staticplugins.smartspace.p8763d;

import com.google.android.apps.gsa.opa.smartspace.p6455d.C83762e;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83763f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.d.e */
/* compiled from: PG */
public final /* synthetic */ class C117376e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f325844a;

    /* renamed from: b */
    public final /* synthetic */ long f325845b;

    public /* synthetic */ C117376e(long j, long j2) {
        this.f325844a = j;
        this.f325845b = j2;
    }

    public final Object apply(Object obj) {
        long j = this.f325844a;
        long j2 = this.f325845b;
        C83762e eVar = (C83762e) ((C83763f) obj).toBuilder();
        eVar.copyOnWrite();
        C83763f fVar = (C83763f) eVar.instance;
        fVar.f228307a |= 1;
        fVar.f228308b = j;
        eVar.copyOnWrite();
        C83763f fVar2 = (C83763f) eVar.instance;
        fVar2.f228307a |= 2;
        fVar2.f228309c = j2;
        return (C83763f) eVar.build();
    }
}
