package com.google.android.apps.search.googleapp.accounts.p10126ui;

import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.u */
/* compiled from: PG */
public final class C133364u implements C46792di {

    /* renamed from: b */
    private static final C59071e f363398b = C59071e.m91332i("com.google.android.apps.search.googleapp.accounts.ui.u");

    /* renamed from: a */
    public final AccountId f363399a;

    /* renamed from: c */
    private final C30306o f363400c;

    public C133364u(AccountId accountId, C30306o oVar) {
        this.f363399a = accountId;
        this.f363400c = oVar;
    }

    /* renamed from: d */
    public static boolean m216440d(C46108a aVar) {
        String str = aVar.mo50210b().f121165j;
        return !str.equals("pseudonymous") && !str.equals("incognito");
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f363398b.mo56225c()).mo56382g(th)).mo56372aa(40012)).mo56386p("Error getting TikTok accounts list.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        List list = (List) obj;
        this.f363400c.f81934a.mo35795d((C58485gu) Collection.EL.stream(list).filter(C133362s.f363396a).collect(C58370cn.f155946a));
        C46108a aVar = (C46108a) Collection.EL.stream(list).filter(new C133363t(this)).findFirst().orElse(null);
        if (aVar == null || !m216440d(aVar)) {
            this.f363400c.f81934a.mo35796e((Object) null);
        } else {
            this.f363400c.f81934a.mo35796e(aVar);
        }
        ((C59052c) ((C59052c) f363398b.mo56224b()).mo56372aa(40013)).mo56386p("#accountsLoaded");
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
