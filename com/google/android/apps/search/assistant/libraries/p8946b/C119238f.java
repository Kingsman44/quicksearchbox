package com.google.android.apps.search.assistant.libraries.p8946b;

import com.google.android.apps.search.assistant.libraries.p8946b.C119245i;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.f */
/* compiled from: PG */
public final /* synthetic */ class C119238f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C119245i f332524a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f332525b;

    /* renamed from: c */
    public final /* synthetic */ Iterable f332526c;

    public /* synthetic */ C119238f(C119245i iVar, AccountId accountId, Iterable iterable) {
        this.f332524a = iVar;
        this.f332525b = accountId;
        this.f332526c = iterable;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C119245i iVar = this.f332524a;
        AccountId accountId = this.f332525b;
        Iterable<C65753ak> iterable = this.f332526c;
        ArrayList arrayList = new ArrayList();
        C38469m fM = ((C119245i.C119246a) C47245e.m84045a(iVar.f332544a, C119245i.C119246a.class, accountId)).mo104257fM();
        for (C65753ak f : iterable) {
            arrayList.add(fM.mo41435f(f));
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        C119225c cVar = C119225c.f332500a;
        return C60922j.m93044g(o, C47810es.m84963c(cVar), iVar.f332545b);
    }
}
