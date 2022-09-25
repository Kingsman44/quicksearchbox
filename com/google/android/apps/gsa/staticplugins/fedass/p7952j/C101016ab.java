package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84235h;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100759y;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.ab */
/* compiled from: PG */
public final /* synthetic */ class C101016ab implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101019ae f282118a;

    /* renamed from: b */
    public final /* synthetic */ Account[] f282119b;

    public /* synthetic */ C101016ab(C101019ae aeVar, Account[] accountArr) {
        this.f282118a = aeVar;
        this.f282119b = accountArr;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C101019ae aeVar = this.f282118a;
        Account[] accountArr = this.f282119b;
        C101058i iVar = (C101058i) aeVar.f282124b.mo17428b();
        Optional optional = (Optional) iVar.f282206d.mo27525b();
        if (!optional.isPresent()) {
            cxVar = C60856cj.m92899h(new IllegalStateException("TrainingCacheEntryPoint cannot be absent"));
        } else {
            ArrayList arrayList = new ArrayList();
            for (Account account : accountArr) {
                arrayList.add(account.name);
            }
            cxVar = C100742h.m166944c(C100742h.m166944c(C60922j.m93044g(((C42876ab) ((C100719ab) iVar.f282207e.mo27525b()).f281602a.mo27525b()).mo46042d(), C47810es.m84963c(C100759y.f281651a), C60826bg.f164896a)).mo92035e(new C101057h(arrayList, (C84235h) optional.get())).f281631a).mo92035e(new C101056g(iVar, arrayList, optional)).f281631a;
        }
        C100742h c = C100742h.m166944c(cxVar);
        c.mo92038i(C101073x.f282237a);
        return c.f281631a;
    }
}
