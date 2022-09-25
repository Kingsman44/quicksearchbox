package com.google.android.libraries.search.p3005i.p3007b;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65813cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.i.b.g */
/* compiled from: PG */
public final /* synthetic */ class C38430g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38431h f101723a;

    public /* synthetic */ C38430g(C38431h hVar) {
        this.f101723a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C38431h hVar = this.f101723a;
        List<C46108a> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (C46108a aVar : list) {
            String str = aVar.mo50210b().f121165j;
            if (!"pseudonymous".equals(str) && !"incognito".equals(str)) {
                arrayList.add(hVar.f101726c.mo41418a(aVar.mo50209a(), hVar.f101724a, hVar.f101725b, C65813cq.PERIODIC));
            }
        }
        return C60856cj.m92906o(arrayList);
    }
}
