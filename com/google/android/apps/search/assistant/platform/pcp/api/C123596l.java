package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.HashSet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.l */
/* compiled from: PG */
final class C123596l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C53306j f341491a;

    /* renamed from: b */
    final /* synthetic */ C123597m f341492b;

    public C123596l(C123597m mVar, C53306j jVar) {
        this.f341492b = mVar;
        this.f341491a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C123597m.f341493a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.DataQuery");
        C95883aa.m158984e(d, "Failed to get proactive content on PCP.", 35150, C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_GET_PROACTIVE_CONTENT_VALUE), th);
        if ((th instanceof TimeoutException) || (th.getCause() instanceof TimeoutException)) {
            C124100bz bzVar = this.f341492b.f341496d;
            C53306j jVar = this.f341491a;
            C39141kp kpVar = bzVar.f342762a;
            ((C19567d) kpVar.f102827aK.mo6453a()).mo24822a(1, jVar.name());
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C123746bm bmVar = (C123746bm) obj;
        if (bmVar != null) {
            HashSet hashSet = new HashSet();
            HashSet<Integer> hashSet2 = new HashSet<>();
            for (C123744bk bkVar : bmVar.f341820a) {
                int intValue = C124089bo.m203513a(Integer.valueOf(bkVar.f341810e)).intValue();
                hashSet2.add(Integer.valueOf(intValue));
                C124100bz bzVar = this.f341492b.f341496d;
                int a = C123774cn.m203111a(bkVar.f341815j);
                if (a == 0) {
                    a = 1;
                }
                int i = this.f341491a.f139793X;
                C39141kp kpVar = bzVar.f342762a;
                StringBuilder sb = new StringBuilder("DATA_QUERY_RESULT_FOR_DATA_TYPE_");
                sb.append(intValue);
                sb.append("_UPDATE_TYPE_");
                sb.append(a - 1);
                sb.append("_CLIENT_TYPE_");
                sb.append(i);
                kpVar.mo41704s(sb.toString());
                if (!hashSet.add(bkVar)) {
                    C124100bz bzVar2 = this.f341492b.f341496d;
                    int i2 = this.f341491a.f139793X;
                    C39141kp kpVar2 = bzVar2.f342762a;
                    kpVar2.mo41704s("DATA_QUERY_DUPLICATE_FOR_DATA_TYPE_" + intValue + "_CLIENT_TYPE_" + i2);
                }
            }
            C124100bz bzVar3 = this.f341492b.f341496d;
            int i3 = this.f341491a.f139793X;
            for (Integer intValue2 : hashSet2) {
                int intValue3 = intValue2.intValue();
                C39141kp kpVar3 = bzVar3.f342762a;
                kpVar3.mo41704s("DATA_QUERY_RESULT_FOR_DATA_TYPE_" + intValue3 + "_CLIENT_TYPE_" + i3);
            }
        }
    }
}
