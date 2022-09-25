package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8476a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111053cn;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.a.b */
/* compiled from: PG */
public final class C111079b extends C112473ar {

    /* renamed from: a */
    public final C21370a f309304a;

    /* renamed from: b */
    private final C86124t f309305b;

    /* renamed from: c */
    private final C86054o f309306c;

    /* renamed from: d */
    private final C111053cn f309307d;

    public C111079b(C86124t tVar, C86054o oVar, C21370a aVar, C111053cn cnVar) {
        this.f309305b = tVar;
        this.f309306c = oVar;
        this.f309304a = aVar;
        this.f309307d = cnVar;
    }

    /* renamed from: a */
    public final long mo99043a() {
        return this.f309305b.mo79743a(C90063do.f249234G);
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        C58976aa aaVar = C58975e.f156826a;
        long b = this.f309304a.mo26870b();
        if (!this.f309305b.mo79746e(C90063do.f249336bc)) {
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return C60856cj.m92900i((C48635bx) bvVar.build());
        }
        String F = this.f309306c.mo79659F();
        if (!TextUtils.isEmpty(F)) {
            return C60922j.m93044g(this.f309307d.mo99036a(F, Optional.empty()), new C111078a(this), C60826bg.f164896a);
        }
        C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
        bvVar2.copyOnWrite();
        ((C48635bx) bvVar2.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar2.build());
    }
}
