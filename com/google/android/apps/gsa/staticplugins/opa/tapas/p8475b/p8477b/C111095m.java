package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8477b;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112473ar;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.m */
/* compiled from: PG */
public final class C111095m extends C112473ar {

    /* renamed from: a */
    public static final C59071e f309326a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.b.b.m");

    /* renamed from: b */
    public final Context f309327b;

    /* renamed from: c */
    public final C21370a f309328c;

    /* renamed from: d */
    public final C68214a f309329d;

    /* renamed from: e */
    public final C86124t f309330e;

    /* renamed from: f */
    private final C22871g f309331f;

    /* renamed from: g */
    private final C113425ff f309332g;

    public C111095m(C22871g gVar, Context context, C21370a aVar, C113425ff ffVar, C68214a aVar2, C86124t tVar) {
        this.f309331f = gVar;
        this.f309327b = context;
        this.f309328c = aVar;
        this.f309332g = ffVar;
        this.f309329d = aVar2;
        this.f309330e = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo99044b() {
        if (this.f309332g.mo100139e()) {
            return this.f309331f.mo28201a("AppUsageSignalFetcher#queryAndTranslateUsage", new C111094l(this));
        }
        C58976aa aaVar = C58975e.f156826a;
        C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
        long b = this.f309328c.mo26870b();
        bvVar.copyOnWrite();
        ((C48635bx) bvVar.instance).f125708c = b;
        return C60856cj.m92900i((C48635bx) bvVar.build());
    }
}
