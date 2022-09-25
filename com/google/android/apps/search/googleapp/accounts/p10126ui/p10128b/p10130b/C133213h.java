package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b;

import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10130b.C133215j;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65798cb;
import java.util.HashMap;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.b.h */
/* compiled from: PG */
public final /* synthetic */ class C133213h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133215j f363081a;

    public /* synthetic */ C133213h(C133215j jVar) {
        this.f363081a = jVar;
    }

    public final Object apply(Object obj) {
        C133215j jVar = this.f363081a;
        C58485gu guVar = (C58485gu) obj;
        HashMap hashMap = new HashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C46108a aVar = (C46108a) guVar.get(i);
            hashMap.put(aVar.mo50209a(), C47633f.m84733g(((C133215j.C133216a) C47245e.m84045a(jVar.f363087e, C133215j.C133216a.class, aVar.mo50209a())).mo111025fM().mo41431b(C133215j.f363084b, C133215j.f363085c, C63662ac.f172144a, C65798cb.f178854e)).mo51515h(C133209d.f363077a, jVar.f363086d));
        }
        return hashMap;
    }
}
