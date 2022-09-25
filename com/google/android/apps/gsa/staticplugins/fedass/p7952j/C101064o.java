package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.o */
/* compiled from: PG */
public final class C101064o {

    /* renamed from: a */
    public static final C59071e f282221a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.j.o");

    /* renamed from: b */
    public final C68214a f282222b;

    /* renamed from: c */
    public final C68214a f282223c;

    /* renamed from: d */
    private final C68214a f282224d;

    /* renamed from: e */
    private final C68214a f282225e;

    /* renamed from: f */
    private final C60887da f282226f;

    public C101064o(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C60887da daVar) {
        this.f282226f = daVar;
        this.f282222b = aVar;
        this.f282223c = aVar2;
        this.f282224d = aVar3;
        this.f282225e = aVar4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo92134a(Account account) {
        C60870cx cxVar;
        String str = account == null ? BuildConfig.FLAVOR : account.name;
        if (account == null || TextUtils.isEmpty(account.name)) {
            C59104x b = f282221a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedAssAccDataUpdater");
            ((C59052c) ((C59052c) b).mo56372aa(19730)).mo56386p("Empty account. No sync.");
            cxVar = C60866ct.f164955a;
        } else {
            C60870cx a = ((C101071v) this.f282224d.mo27525b()).mo92135a(account);
            C60870cx b2 = ((C101050bi) this.f282225e.mo27525b()).mo92132b("fedass_policy_config_group");
            C60870cx a2 = ((C101050bi) this.f282225e.mo27525b()).mo92131a();
            cxVar = C60856cj.m92895d(a, b2, a2).mo57335b(new C101062m(this, a, b2, a2, account), this.f282226f);
        }
        C100742h e = C100742h.m166944c(cxVar).mo92035e(new C101060k(this, str));
        e.mo92039j(C101061l.f282211a);
        return e.f281631a;
    }
}
