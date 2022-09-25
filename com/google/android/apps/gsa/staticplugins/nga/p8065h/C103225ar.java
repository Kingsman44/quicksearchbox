package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.ar */
/* compiled from: PG */
public final class C103225ar {

    /* renamed from: a */
    private final C103274cm f287990a;

    /* renamed from: b */
    private final C86124t f287991b;

    /* renamed from: c */
    private final C85664bo f287992c;

    /* renamed from: d */
    private final C74713bn f287993d;

    public C103225ar(C103274cm cmVar, C86124t tVar, C85664bo boVar, C74713bn bnVar) {
        this.f287990a = cmVar;
        this.f287991b = tVar;
        this.f287992c = boVar;
        this.f287993d = bnVar;
    }

    /* renamed from: a */
    public final C60870cx mo93717a() {
        if (!mo93718b()) {
            return C60856cj.m92900i(C80456d.f220820b);
        }
        C103274cm cmVar = this.f287990a;
        return C60922j.m93044g(C60838bs.m92859i(C60922j.m93045h(C60922j.m93044g(C60922j.m93044g(C60838bs.m92859i(cmVar.f288062d.mo37974b()), C103268cg.f288052a, C60826bg.f164896a), new C103269ch(cmVar), C60826bg.f164896a), new C103270ci(cmVar), C60826bg.f164896a)), C103221an.f287986a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final boolean mo93718b() {
        return this.f287992c.mo79197l(C85662bm.WEB_AND_APP_HISTORY) && (this.f287991b.mo79746e(C90126fx.f251266fa) && this.f287991b.mo79746e(C90126fx.f251233eu) && this.f287991b.mo79746e(C90126fx.f251234ev)) && this.f287993d.mo71078c();
    }
}
