package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124116cn;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.ad */
/* compiled from: PG */
public final /* synthetic */ class C123831ad implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123841an f342088a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f342089b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f342090c;

    public /* synthetic */ C123831ad(C123841an anVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f342088a = anVar;
        this.f342089b = cxVar;
        this.f342090c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123841an anVar = this.f342088a;
        C60870cx cxVar = this.f342089b;
        C60870cx cxVar2 = this.f342090c;
        List<C123787p> list = (List) C60856cj.m92909r(cxVar);
        List list2 = (List) C60856cj.m92909r(cxVar2);
        int size = list2.size();
        int size2 = list.size();
        Integer valueOf = Integer.valueOf(C89885b.PCP_CALENDAR_MISMATCH_WITH_CONTENT_PROVIDER_VALUE);
        if (size != size2) {
            anVar.f342107d.f342762a.mo41703r();
            C95883aa.m158983d(anVar.f342109f.mo56226d(), "Calendar data mismatch between PCP and content provider.", 35286, C38505d.f101863a, valueOf);
            return C60866ct.f164955a;
        }
        Map map = (Map) Collection.EL.stream(list2).collect(Collectors.toMap(C123837aj.f342100a, C123838ak.f342101a, C123839al.f342102a, C123840am.f342103a));
        for (C123787p pVar : list) {
            Long valueOf2 = Long.valueOf(pVar.f341951b);
            if (map.containsKey(valueOf2)) {
                byte[] a = C124116cn.m203541a(pVar);
                C123787p pVar2 = (C123787p) map.get(valueOf2);
                pVar2.getClass();
                if (!Arrays.equals(a, C124116cn.m203541a(pVar2))) {
                }
            }
            anVar.f342107d.f342762a.mo41703r();
            C95883aa.m158983d(anVar.f342109f.mo56226d(), "Calendar data mismatch between PCP and content provider.", 35285, C38505d.f101863a, valueOf);
            return C60866ct.f164955a;
        }
        C59081b.m91349a(C38505d.f101863a, "metadata key");
        return C60866ct.f164955a;
    }
}
