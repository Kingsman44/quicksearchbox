package com.google.android.libraries.search.p3005i.p3009d;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.android.libraries.search.p3005i.p3009d.C38446h;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.search.i.d.f */
/* compiled from: PG */
public final /* synthetic */ class C38444f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38446h f101751a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f101752b;

    /* renamed from: c */
    public final /* synthetic */ Iterable f101753c;

    public /* synthetic */ C38444f(C38446h hVar, AccountId accountId, Iterable iterable) {
        this.f101751a = hVar;
        this.f101752b = accountId;
        this.f101753c = iterable;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38446h hVar = this.f101751a;
        AccountId accountId = this.f101752b;
        Iterable<C65753ak> iterable = this.f101753c;
        ArrayList arrayList = new ArrayList();
        C38469m fM = ((C38446h.C38447a) C47245e.m84045a(hVar.f101758a, C38446h.C38447a.class, accountId)).mo41425fM();
        for (C65753ak f : iterable) {
            arrayList.add(fM.mo41435f(f));
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        C38442d dVar = C38442d.f101747a;
        return C60922j.m93044g(o, C47810es.m84963c(dVar), hVar.f101759b);
    }
}
