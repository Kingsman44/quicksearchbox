package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8488l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.l.a */
/* compiled from: PG */
public final class C111223a extends C112473ar {

    /* renamed from: a */
    private static final C59071e f309527a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.l.a");

    /* renamed from: b */
    private final C86124t f309528b;

    /* renamed from: c */
    private final C21370a f309529c;

    public C111223a(C86124t tVar, C21370a aVar) {
        this.f309528b = tVar;
        this.f309529c = aVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return this.f309528b.mo79743a(C90063do.f249511es);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        C59104x d = f309527a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "IcingSignalFetcher");
        ((C59052c) ((C59052c) d).mo56372aa(27137)).mo56386p("IcingSignalFetcher is a no-op.");
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309529c.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
