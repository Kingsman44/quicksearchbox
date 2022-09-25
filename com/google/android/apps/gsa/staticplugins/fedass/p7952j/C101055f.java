package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.f */
/* compiled from: PG */
public final /* synthetic */ class C101055f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101058i f282194a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282195b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f282196c;

    /* renamed from: d */
    public final /* synthetic */ Account f282197d;

    public /* synthetic */ C101055f(C101058i iVar, C60870cx cxVar, C60870cx cxVar2, Account account) {
        this.f282194a = iVar;
        this.f282195b = cxVar;
        this.f282196c = cxVar2;
        this.f282197d = account;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101058i iVar = this.f282194a;
        C60870cx cxVar = this.f282195b;
        C60870cx cxVar2 = this.f282196c;
        Account account = this.f282197d;
        Boolean bool = (Boolean) C60856cj.m92909r(cxVar);
        if (bool.equals(Boolean.valueOf(((C132798f) C60856cj.m92909r(cxVar2)).f362320d))) {
            return C60866ct.f164955a;
        }
        C59104x b = C101058i.f282203a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccStatusSyncManager");
        ((C59052c) ((C59052c) b).mo56372aa(19727)).mo56386p("Account eligibility changed.");
        String str = account.name;
        boolean booleanValue = bool.booleanValue();
        C59104x b2 = C101058i.f282203a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AccStatusSyncManager");
        ((C59052c) ((C59052c) b2).mo56372aa(19729)).mo56386p("Updating the account eligibility.");
        Optional optional = (Optional) iVar.f282206d.mo27525b();
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new IllegalStateException("TrainingCacheEntryPoint cannot be absent"));
        }
        return C100742h.m166943a(new C101014a(iVar, str, booleanValue)).mo92036f(new C101041b(optional)).f281631a;
    }
}
