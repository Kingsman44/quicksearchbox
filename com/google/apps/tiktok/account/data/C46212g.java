package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.data.g */
/* compiled from: PG */
public final class C46212g extends C46175b {

    /* renamed from: a */
    public final C46325t f121150a;

    /* renamed from: b */
    public final C46321p f121151b;

    /* renamed from: c */
    private final C46723bg f121152c;

    /* renamed from: d */
    private final C69464a f121153d;

    public C46212g(C46325t tVar, C46321p pVar, C46723bg bgVar, C69464a aVar) {
        this.f121150a = tVar;
        this.f121151b = pVar;
        this.f121152c = bgVar;
        this.f121153d = aVar;
    }

    /* renamed from: a */
    public final C46689ag mo50244a(AccountId accountId) {
        return new C46719bc(this.f121152c, new C46211f(this, accountId), "com.google.apps.tiktok.account.data.AllAccounts");
    }

    /* renamed from: c */
    public final C60870cx mo50246c(AccountId accountId) {
        return C60922j.m93044g(this.f121150a.mo50284d(accountId), C46189c.f121122a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo50247d() {
        return this.f121150a.mo50287g();
    }

    /* renamed from: e */
    public final C60870cx mo50248e() {
        return this.f121150a.mo50288h();
    }

    /* renamed from: f */
    public final C60870cx mo50249f() {
        return this.f121151b.mo50317a();
    }

    /* renamed from: g */
    public final C60870cx mo50250g(AccountId accountId) {
        return C60922j.m93044g(this.f121150a.mo50284d(accountId), C46210e.f121147a, C60826bg.f164896a);
    }

    /* renamed from: h */
    public final C46323r mo50245b() {
        return (C46323r) this.f121153d.mo17428b();
    }
}
