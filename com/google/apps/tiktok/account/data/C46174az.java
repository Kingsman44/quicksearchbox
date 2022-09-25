package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.az */
/* compiled from: PG */
final class C46174az extends C46175b {

    /* renamed from: a */
    public final C46182ba f121101a;

    /* renamed from: b */
    public final C60887da f121102b;

    /* renamed from: c */
    private final C58881cr f121103c;

    public C46174az(C69464a aVar, C46182ba baVar, C46186be beVar, C60887da daVar) {
        this.f121101a = baVar;
        this.f121102b = daVar;
        this.f121103c = C58886cw.m90973a(new C46183bb(beVar, new C46171aw(aVar)));
    }

    /* renamed from: h */
    static /* synthetic */ C46212g m82400h(C69464a aVar) {
        return (C46212g) aVar.mo17428b();
    }

    /* renamed from: a */
    public final C46689ag mo50244a(AccountId accountId) {
        return ((C46212g) this.f121103c.mo6453a()).mo50244a(accountId);
    }

    /* renamed from: b */
    public final C46689ag mo50245b() {
        return new C46173ay(this, ((C46212g) this.f121103c.mo6453a()).mo50245b());
    }

    /* renamed from: c */
    public final C60870cx mo50246c(AccountId accountId) {
        return ((C46212g) this.f121103c.mo6453a()).mo50246c(accountId);
    }

    /* renamed from: d */
    public final C60870cx mo50247d() {
        return ((C46212g) this.f121103c.mo6453a()).f121150a.mo50287g();
    }

    /* renamed from: e */
    public final C60870cx mo50248e() {
        return ((C46212g) this.f121103c.mo6453a()).f121150a.mo50288h();
    }

    /* renamed from: f */
    public final C60870cx mo50249f() {
        return ((C46212g) this.f121103c.mo6453a()).f121151b.mo50317a();
    }

    /* renamed from: g */
    public final C60870cx mo50250g(AccountId accountId) {
        return ((C46212g) this.f121103c.mo6453a()).mo50250g(accountId);
    }
}
