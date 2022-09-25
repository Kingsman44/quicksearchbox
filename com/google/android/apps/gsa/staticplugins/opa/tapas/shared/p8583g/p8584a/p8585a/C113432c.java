package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a.p8585a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.search.assistant.surfaces.p9422d.p9423a.p9424a.p9425a.C125028a;
import com.google.android.apps.search.assistant.surfaces.p9422d.p9423a.p9424a.p9425a.C125031d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.a.a.c */
/* compiled from: PG */
public final class C113432c extends C68247h {

    /* renamed from: a */
    private final C68283d f314092a;

    /* renamed from: c */
    private final C68283d f314093c;

    /* renamed from: d */
    private final C69464a f314094d;

    /* renamed from: e */
    private final C68283d f314095e;

    /* renamed from: f */
    private final C68283d f314096f;

    public C113432c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C69464a aVar3, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C113432c.class), aVar);
        this.f314092a = C68236af.m98549d(dVar);
        this.f314093c = C68236af.m98549d(dVar2);
        this.f314094d = aVar3;
        this.f314095e = C68236af.m98549d(dVar3);
        this.f314096f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57981b bVar = (C57981b) list.get(0);
        C21370a aVar = (C21370a) list.get(1);
        C68214a a = C68219e.m98518a(this.f314094d);
        C125031d dVar = (C125031d) list.get(2);
        C58976aa aaVar = C58975e.f156826a;
        if (((C86124t) list.get(3)).mo79746e(C90063do.f249319bL) && ((C111248k) a.mo27525b()).mo99077b()) {
            ((C111248k) a.mo27525b()).mo99076a(C111255r.STREAMING, String.format(Locale.US, "Initial request sent at: %d\n", new Object[]{Long.valueOf(aVar.mo26870b())}));
        }
        return dVar.f344961b.mo19399b(C47810es.m84978r(new C125028a(dVar, bVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f314092a.mo60297gq(), this.f314093c.mo60297gq(), this.f314095e.mo60297gq(), this.f314096f.mo60297gq());
    }
}
