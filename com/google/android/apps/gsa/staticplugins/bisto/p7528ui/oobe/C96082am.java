package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90122ft;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.am */
/* compiled from: PG */
public final class C96082am extends C84036z {

    /* renamed from: a */
    public static final C59071e f269003a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.am");

    /* renamed from: b */
    public final C86054o f269004b;

    /* renamed from: c */
    public final C95299e f269005c;

    /* renamed from: d */
    public final C68214a f269006d;

    /* renamed from: e */
    public final C90851k f269007e;

    /* renamed from: f */
    private final C86124t f269008f;

    /* renamed from: g */
    private final C68214a f269009g;

    /* renamed from: h */
    private final C69464a f269010h;

    /* renamed from: i */
    private final C84026u f269011i;

    /* renamed from: j */
    private final boolean f269012j;

    public C96082am(C86124t tVar, C86054o oVar, C68214a aVar, C90851k kVar, C68214a aVar2, C84026u uVar, C69464a aVar3, C95299e eVar) {
        this.f269008f = tVar;
        this.f269012j = tVar.mo79746e(C90122ft.f250868g);
        this.f269004b = oVar;
        this.f269009g = aVar;
        this.f269007e = kVar;
        this.f269005c = eVar;
        this.f269011i = uVar;
        this.f269010h = aVar3;
        this.f269006d = aVar2;
    }

    /* renamed from: b */
    public final C60870cx mo89937b(Account account, String str, Duration duration) {
        return (C60838bs) C60856cj.m92908q(C60922j.m93044g(C60838bs.m92859i(this.f269004b.mo79672f(str, account, false, new C91032p())), C96078ai.f268997a, this.f269007e.mo85211d("bisto")), duration.toMillis(), TimeUnit.MILLISECONDS, this.f269007e.mo85210c("bisto"));
    }

    /* renamed from: h */
    public final C58485gu mo77495h() {
        Duration ofMillis = Duration.ofMillis(this.f269008f.mo79743a(C90014bt.f247333fF));
        if (ofMillis.isNegative() || ofMillis.isZero()) {
            return C58485gu.m89845m();
        }
        Account a = this.f269004b.mo79668a();
        if (a == null) {
            return C58485gu.m89845m();
        }
        String ag = ((C89994f) this.f269009g.mo27525b()).mo83887ag();
        C60870cx b = mo89937b(a, ag, ofMillis);
        if (this.f269012j) {
            b = C60922j.m93045h(b, new C96075af(this, a, ag, ofMillis), this.f269007e.mo85208a("bisto"));
        }
        return C58485gu.m89847o(this.f269011i.mo77487a(b, this.f269010h), C83875ai.m133536a(b, new C96076ag(this), C96077ah.f268996a));
    }
}
