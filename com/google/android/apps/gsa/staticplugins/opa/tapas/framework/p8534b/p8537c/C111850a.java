package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8537c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111585j;
import com.google.assistant.p3781ad.p3789d.p3790a.C48552e;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.a */
/* compiled from: PG */
public final class C111850a {

    /* renamed from: a */
    public static final C59071e f310829a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.c.a");

    /* renamed from: b */
    private final C86124t f310830b;

    /* renamed from: c */
    private final C111585j f310831c;

    public C111850a(C86124t tVar, C111585j jVar) {
        this.f310830b = tVar;
        this.f310831c = jVar;
    }

    /* renamed from: a */
    public final C48553f mo99267a(String str) {
        if (this.f310830b.mo79746e(C90063do.f249493ea)) {
            try {
                C48552e eVar = (C48552e) C48553f.f125431e.createBuilder();
                eVar.copyOnWrite();
                C48553f fVar = (C48553f) eVar.instance;
                fVar.f125436d = 1;
                fVar.f125433a |= 4;
                String e = this.f310831c.mo99183a(str).mo99942e();
                eVar.copyOnWrite();
                C48553f fVar2 = (C48553f) eVar.instance;
                e.getClass();
                fVar2.f125434b = 1;
                fVar2.f125435c = e;
                return (C48553f) eVar.build();
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f310829a.mo56225c()).mo56382g(th)).mo56372aa(27449)).mo56389s("Failed to load app icon: %s", str);
            }
        }
        C48552e eVar2 = (C48552e) C48553f.f125431e.createBuilder();
        eVar2.copyOnWrite();
        C48553f fVar3 = (C48553f) eVar2.instance;
        fVar3.f125436d = 3;
        fVar3.f125433a |= 4;
        eVar2.copyOnWrite();
        C48553f fVar4 = (C48553f) eVar2.instance;
        str.getClass();
        fVar4.f125434b = 2;
        fVar4.f125435c = str;
        return (C48553f) eVar2.build();
    }
}
