package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88066nx;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88068nz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.search.core.ba */
/* compiled from: PG */
public final /* synthetic */ class C85650ba implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C85650ba f231488a = new C85650ba();

    private /* synthetic */ C85650ba() {
    }

    public final Object apply(Object obj) {
        ServiceEventData serviceEventData = (ServiceEventData) obj;
        C62940bt btVar = C88066nx.f238115a;
        C88246uo uoVar = serviceEventData.f236959a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        uoVar.mo58887l(r0);
        return Integer.valueOf(uoVar.f169962ag.mo58857o(r0.f169971d) ? ((C88068nz) serviceEventData.mo81918e(C88066nx.f238115a)).f238119b : 3);
    }
}
