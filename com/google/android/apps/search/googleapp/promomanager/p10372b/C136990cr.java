package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63909aw;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.cr */
/* compiled from: PG */
public final /* synthetic */ class C136990cr implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C137007dh f372811a;

    public /* synthetic */ C136990cr(C137007dh dhVar) {
        this.f372811a = dhVar;
    }

    public final Object apply(Object obj) {
        C137007dh dhVar = this.f372811a;
        C58970a aVar = (C58970a) ((C58970a) ((C58970a) C137003dd.f372837a.mo56225c()).mo56382g((RuntimeException) obj)).mo56372aa(40866);
        C63909aw awVar = dhVar.f372875e;
        if (awVar == null) {
            awVar = C63909aw.f172816e;
        }
        Integer valueOf = Integer.valueOf(awVar.f172819b);
        C63909aw awVar2 = dhVar.f372875e;
        Integer valueOf2 = Integer.valueOf((awVar2 == null ? C63909aw.f172816e : awVar2).f172820c);
        if (awVar2 == null) {
            awVar2 = C63909aw.f172816e;
        }
        aVar.mo56359L("Failed to reportAccept [campaignId %d, deploymentId %d, placementId %d]", valueOf, valueOf2, Integer.valueOf(awVar2.f172821d));
        return null;
    }
}
