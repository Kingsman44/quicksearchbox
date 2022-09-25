package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124551g;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60901do;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.q */
/* compiled from: PG */
public final class C96497q implements C89635f {

    /* renamed from: a */
    public static final C59071e f269967a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.q");

    /* renamed from: b */
    public final C68214a f269968b;

    /* renamed from: c */
    public final l f269969c;

    /* renamed from: d */
    public final Executor f269970d;

    /* renamed from: e */
    public final C124528i f269971e;

    /* renamed from: f */
    private final C89994f f269972f;

    public C96497q(C68214a aVar, Executor executor, l lVar, C96482bm bmVar, C89994f fVar) {
        this.f269968b = aVar;
        this.f269969c = lVar;
        this.f269970d = executor;
        this.f269971e = bmVar;
        this.f269972f = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo83517a(acv acv) {
        l lVar = this.f269969c;
        p pVar = new p();
        pVar.e(acv);
        return lVar.a(pVar, 10, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public final C60870cx mo83518b(String str) {
        C124528i iVar = this.f269971e;
        String Z = this.f269972f.mo83863Z();
        C96482bm bmVar = (C96482bm) iVar;
        return C60922j.m93045h(C60838bs.m92859i(C60846c.m92879h(C60922j.m93045h(C60838bs.m92859i(bmVar.f269934c.mo83482a()), new C96480bk(bmVar, str, Z), bmVar.f269936e), Exception.class, new C96481bl(bmVar, str, Z), C60826bg.f164896a)), new C96483c(this), this.f269970d);
    }

    /* renamed from: c */
    public final C60870cx mo83519c(Account account, String str) {
        return C60922j.m93045h(C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(((C89492cd) this.f269968b.mo27525b()).mo83408n(str)), new C96495o(account), this.f269970d), C124551g.class, C96442a.f269815a, this.f269970d), new C96469b(this, account, str), this.f269970d);
    }

    /* renamed from: d */
    public final C60870cx mo83520d(C58833ax axVar, String str, boolean z) {
        if (!axVar.mo56113h() || C58837ba.m90859h(((Account) axVar.mo56107c()).name)) {
            C59104x d = f269967a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17116)).mo56386p("Account unavailable");
            ((C89492cd) this.f269968b.mo27525b()).mo83377S(str, z);
            return C118826c.f331423b;
        }
        Account account = (Account) axVar.mo56107c();
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        int i = z ? 2 : 3;
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        cvVar.f129666d = i - 1;
        cvVar.f129663a = 2 | cvVar.f129663a;
        return C60846c.m92878g(mo90180g(account, str, (C49891cv) cnVar.build(), new C96489i(this, z, str, axVar)), C124551g.class, new C96490j(this, str, z), this.f269970d);
    }

    /* renamed from: e */
    public final C60870cx mo83521e(C58833ax axVar, String str, boolean z) {
        if (!axVar.mo56113h() || C58837ba.m90859h(((Account) axVar.mo56107c()).name)) {
            C59104x d = f269967a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoAssistantSettingsHelper");
            ((C59052c) ((C59052c) d).mo56372aa(17117)).mo56386p("Account unavailable");
            return C118826c.f331423b;
        }
        C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
        cnVar.copyOnWrite();
        C49891cv cvVar = (C49891cv) cnVar.instance;
        cvVar.f129663a |= 1024;
        cvVar.f129670h = z;
        return C60922j.m93044g(mo90180g((Account) axVar.mo56107c(), str, (C49891cv) cnVar.build(), C60901do.f165001a), new C96485e(this, z, str, axVar), this.f269970d);
    }

    /* renamed from: f */
    public final void mo83522f(C58833ax axVar, String str, boolean z) {
        C60856cj.m92911t(mo83521e(axVar, str, z), new C96496p(), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo90180g(Account account, String str, C49891cv cvVar, Runnable runnable) {
        return C60922j.m93044g(C60922j.m93045h(C60838bs.m92859i(C60922j.m93045h(((C89492cd) this.f269968b.mo27525b()).mo83408n(str), new C96491k(account, str), C60826bg.f164896a)), new C96493m(this, cvVar, account), this.f269970d), new C96494n(runnable), this.f269970d);
    }
}
