package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.p8244a;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.opa.smartspace.C83807w;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106728h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.a.h */
/* compiled from: PG */
public final class C106720h implements C106728h {

    /* renamed from: a */
    public final C83807w f297429a;

    /* renamed from: b */
    private final C86054o f297430b;

    /* renamed from: c */
    private final C86124t f297431c;

    /* renamed from: d */
    private final C9684l f297432d;

    /* renamed from: e */
    private final C68214a f297433e;

    /* renamed from: f */
    private final C60887da f297434f;

    public C106720h(C86054o oVar, C86124t tVar, C9684l lVar, C68214a aVar, C83807w wVar, C60887da daVar) {
        this.f297430b = oVar;
        this.f297431c = tVar;
        this.f297432d = lVar;
        this.f297433e = aVar;
        this.f297429a = wVar;
        this.f297434f = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo95626a() {
        C60870cx cxVar;
        Account a = this.f297430b.mo79668a();
        if (a == null) {
            cxVar = C60856cj.m92900i(false);
        } else if (!this.f297431c.mo79746e(C90017bw.f247915ad)) {
            cxVar = C60856cj.m92900i(false);
        } else if (this.f297431c.mo79746e(C90017bw.f248035l) && !((C85664bo) this.f297433e.mo27525b()).mo79197l(C85662bm.WEB_AND_APP_HISTORY)) {
            cxVar = C60856cj.m92900i(false);
        } else if (this.f297431c.mo79746e(C90017bw.f248034k)) {
            cxVar = this.f297432d.mo17952a(a);
        } else {
            cxVar = C60856cj.m92900i(true);
        }
        C106719g gVar = new C106719g(this);
        return C60922j.m93044g(cxVar, C47810es.m84963c(gVar), this.f297434f);
    }
}
