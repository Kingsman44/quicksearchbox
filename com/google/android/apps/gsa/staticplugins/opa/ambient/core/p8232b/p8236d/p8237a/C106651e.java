package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8236d.p8237a;

import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.C106617a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8236d.C106646a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8238e.C106672h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8242g.C106705b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8242g.C106710g;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h.C106722b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.d.a.e */
/* compiled from: PG */
public final class C106651e implements C106646a {

    /* renamed from: a */
    private final C106617a f297309a;

    /* renamed from: b */
    private final C106672h f297310b;

    /* renamed from: c */
    private final C106710g f297311c;

    /* renamed from: d */
    private final C60887da f297312d;

    public C106651e(C106617a aVar, C106672h hVar, C106710g gVar, C60887da daVar) {
        this.f297312d = daVar;
        this.f297309a = aVar;
        this.f297310b = hVar;
        this.f297311c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo95607a() {
        C60870cx cxVar;
        C60870cx a = this.f297309a.mo95601a();
        C60870cx c = this.f297310b.mo95610c();
        C106710g gVar = this.f297311c;
        C53691ap apVar = C53691ap.STORE;
        C106722b bVar = (C106722b) gVar.f297409c.get(apVar);
        if (bVar == null) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            cxVar = (C60870cx) bVar.mo95627a(new C106705b(gVar, apVar));
        }
        return C47638k.m84751b(a, c, cxVar).mo51521b(new C106647a(a, c, cxVar), this.f297312d);
    }
}
