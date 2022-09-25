package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119865df;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.bi */
/* compiled from: PG */
public final class C119982bi {

    /* renamed from: a */
    private final C119966aw f334097a;

    /* renamed from: b */
    private final C119834cb f334098b;

    public C119982bi(C119966aw awVar, C119834cb cbVar) {
        this.f334097a = awVar;
        this.f334098b = cbVar;
    }

    /* renamed from: a */
    public final void mo104601a(int i, Duration duration) {
        C119966aw awVar = this.f334097a;
        C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
        C119865df dfVar = (C119865df) C119867dh.f333827d.createBuilder();
        dfVar.copyOnWrite();
        ((C119867dh) dfVar.instance).f333830b = i - 2;
        C119834cb cbVar = this.f334098b;
        dfVar.copyOnWrite();
        cbVar.getClass();
        ((C119867dh) dfVar.instance).f333829a = cbVar;
        C62910ar a = C62950b.m95470a(duration);
        dfVar.copyOnWrite();
        a.getClass();
        ((C119867dh) dfVar.instance).f333831c = a;
        dlVar.copyOnWrite();
        C119873dn dnVar = (C119873dn) dlVar.instance;
        C119867dh dhVar = (C119867dh) dfVar.build();
        dhVar.getClass();
        dnVar.f333839b = dhVar;
        dnVar.f333838a = 5;
        awVar.f334071f.execute(C47810es.m84977q(new C119960aq(awVar, (C119873dn) dlVar.build())));
    }
}
