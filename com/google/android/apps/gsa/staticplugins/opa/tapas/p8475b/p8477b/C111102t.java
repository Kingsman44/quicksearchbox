package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.t */
/* compiled from: PG */
public final class C111102t extends C112473ar {

    /* renamed from: a */
    public final Context f309340a;

    /* renamed from: b */
    public final C21370a f309341b;

    /* renamed from: c */
    public final C86124t f309342c;

    /* renamed from: d */
    private final C22871g f309343d;

    /* renamed from: e */
    private final C113425ff f309344e;

    public C111102t(C22871g gVar, Context context, C21370a aVar, C113425ff ffVar, C86124t tVar) {
        this.f309343d = gVar;
        this.f309340a = context;
        this.f309341b = aVar;
        this.f309344e = ffVar;
        this.f309342c = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        if (this.f309344e.mo100139e()) {
            return this.f309343d.mo28201a("RecentEventsFetcher#queryAndTranslateUsage", new C111100r(this));
        }
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309341b.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
