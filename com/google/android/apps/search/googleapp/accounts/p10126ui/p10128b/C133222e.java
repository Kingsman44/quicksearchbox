package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b;

import com.google.android.apps.search.googleapp.compliance.p10144a.C133562m;
import com.google.android.apps.search.googleapp.compliance.p10144a.C133567r;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.incognito.p10323d.C136243a;
import com.google.android.libraries.search.p2994f.p2995a.C38309b;
import com.google.android.libraries.search.p2994f.p2995a.C38310c;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.e */
/* compiled from: PG */
public final class C133222e implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C133231n f363109a;

    public C133222e(C133231n nVar) {
        this.f363109a = nVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C46691ai mo20330a() {
        return C133231n.f363121b;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C60870cx cxVar3;
        C133231n nVar = this.f363109a;
        C60870cx a = C136243a.m221369a();
        C60870cx c = nVar.f363125f.mo111335c(C133691m.f364149b);
        C60870cx d = nVar.f363126g.mo46042d();
        C60870cx d2 = nVar.f363128i.f371061a.mo46042d();
        if (nVar.f363130k) {
            C38310c cVar = nVar.f363132m;
            C60870cx d3 = cVar.f101484b.mo46042d();
            C38309b bVar = new C38309b(cVar);
            cxVar = C60922j.m93044g(d3, C47810es.m84963c(bVar), C60826bg.f164896a);
        } else {
            cxVar = C60856cj.m92900i(false);
        }
        C60870cx cxVar4 = cxVar;
        C60870cx a2 = nVar.f363131l.mo111027a();
        if (nVar.f363136q) {
            C133567r rVar = nVar.f363137r;
            if (!rVar.f363900e.isPresent()) {
                cxVar2 = C60856cj.m92900i(false);
            } else {
                cxVar2 = C47633f.m84733g(rVar.f363901f.mo111247c()).mo51516i(new C133562m(rVar), rVar.f363897b);
            }
        } else {
            cxVar2 = C60856cj.m92900i(false);
        }
        C60870cx cxVar5 = cxVar2;
        if (nVar.f363139t) {
            cxVar3 = C47633f.m84733g(nVar.f363140u.mo103984d()).mo51515h(C133205b.f363074a, nVar.f363127h);
        } else {
            cxVar3 = C60856cj.m92900i(false);
        }
        C60870cx cxVar6 = cxVar3;
        return C47636i.m84745d(C58597ky.m90212c(a, d2, c, d, a2, cxVar4, cxVar5, cxVar6)).mo51518a(new C133217c(a, c, d, d2, cxVar4, a2, cxVar5, cxVar6), nVar.f363127h);
    }
}
