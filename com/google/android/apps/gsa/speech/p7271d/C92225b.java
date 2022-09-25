package com.google.android.apps.gsa.speech.p7271d;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.d.b */
/* compiled from: PG */
public final class C92225b extends C92229f {

    /* renamed from: c */
    private static final C59071e f257121c = C59071e.m91332i("com.google.android.apps.gsa.speech.d.b");

    /* renamed from: d */
    private final Account f257122d;

    /* renamed from: e */
    private final C86054o f257123e;

    /* renamed from: f */
    private final C90929bz f257124f;

    /* renamed from: g */
    private boolean f257125g = true;

    public C92225b(Account account, C86054o oVar, C90931ca caVar, C90021c cVar, C90929bz bzVar) {
        super(C92228e.AUTH_TOKEN, caVar, cVar);
        this.f257122d = account;
        this.f257123e = oVar;
        this.f257124f = bzVar;
    }

    /* renamed from: f */
    private final void m151434f() {
        C58976aa aaVar = C58975e.f156826a;
        Account account = this.f257122d;
        if (account == null) {
            C59104x d = f257121c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AuthTokenDepChecker");
            ((C59052c) ((C59052c) d).mo56372aa(12255)).mo56386p("No account name. Finishing.");
            mo86905e(false);
            return;
        }
        this.f257124f.mo85147l(this.f257123e.mo79672f("oauth2:https://www.google.com/accounts/OAuthLogin", account, false, new C91032p()), new C92224a(this));
    }

    /* renamed from: a */
    public final void mo86900a() {
        m151434f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo86901b() {
    }

    /* renamed from: c */
    public final void mo86902c() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f257125g) {
            this.f257125g = false;
            this.f257123e.mo79676j();
            m151434f();
            return;
        }
        mo86905e(false);
    }
}
