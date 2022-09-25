package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.account.api.controller.al */
/* compiled from: PG */
public final class C45974al implements C45966ad {

    /* renamed from: a */
    public static final C59071e f120810a = C59071e.m91332i("com.google.apps.tiktok.account.api.controller.al");

    /* renamed from: b */
    public final List f120811b = new ArrayList();

    /* renamed from: c */
    private final C46050r f120812c;

    /* renamed from: d */
    private final C69464a f120813d;

    /* renamed from: e */
    private final C60887da f120814e;

    public C45974al(C46050r rVar, C58833ax axVar, C60887da daVar) {
        this.f120812c = rVar;
        this.f120813d = (C69464a) axVar.mo56111f();
        this.f120814e = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo50117a() {
        return C60856cj.m92905n(C47810es.m84965e(new C45967ae(this)), this.f120814e);
    }

    /* renamed from: b */
    public final C60870cx mo50118b(AccountId accountId) {
        return mo50124h(accountId);
    }

    /* renamed from: c */
    public final void mo50119c(C45965ac acVar) {
        C19559g.m37304c();
        synchronized (this.f120811b) {
            this.f120811b.add(acVar);
        }
    }

    /* renamed from: d */
    public final void mo50120d(C45965ac acVar) {
        C19559g.m37304c();
        synchronized (this.f120811b) {
            this.f120811b.remove(acVar);
        }
    }

    /* renamed from: e */
    public final C58485gu mo50121e() {
        C69464a aVar = this.f120813d;
        if (aVar == null) {
            return C58485gu.m89845m();
        }
        return (C58485gu) aVar.mo17428b();
    }

    /* renamed from: f */
    public final C60870cx mo50122f(AccountId accountId, C58485gu guVar) {
        return mo50125i(accountId, guVar);
    }

    /* renamed from: g */
    public final C60870cx mo50123g(AccountId accountId, List list, Intent intent) {
        C47558bi a = C47831fm.m85006a("Validate Requirements");
        try {
            C60870cx h = C60922j.m93045h(this.f120812c.mo37987a(accountId), C47810es.m84966f(new C45968af(list, accountId)), C60826bg.f164896a);
            a.mo51417a(h);
            a.close();
            return h;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: h */
    public final C60870cx mo50124h(AccountId accountId) {
        C58485gu m = C58485gu.m89845m();
        C69464a aVar = this.f120813d;
        if (aVar != null) {
            m = (C58485gu) aVar.mo17428b();
        }
        return mo50125i(accountId, m);
    }

    /* renamed from: i */
    public final C60870cx mo50125i(AccountId accountId, C58485gu guVar) {
        guVar.getClass();
        if (accountId == null) {
            return C60856cj.m92899h(new C46167as());
        }
        return C60922j.m93044g(C60846c.m92878g(mo50123g(accountId, guVar, (Intent) null), Throwable.class, C47810es.m84963c(C45972aj.f120808a), C60826bg.f164896a), C47810es.m84963c(new C45973ak(accountId)), C60826bg.f164896a);
    }
}
