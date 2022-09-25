package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a;

import android.content.Context;
import androidx.lifecycle.C2391v;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.binaries.satin.app.asx;
import com.google.android.apps.gsa.binaries.satin.app.asz;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b.C111846a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b.C111847b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8536b.C111848c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8545i.C112078c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113383dx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.h */
/* compiled from: PG */
public final class C111844h {

    /* renamed from: a */
    public static final C59071e f310814a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.h");

    /* renamed from: b */
    public final C22871g f310815b;

    /* renamed from: c */
    public final C22871g f310816c;

    /* renamed from: d */
    public final h f310817d;

    /* renamed from: e */
    public final Optional f310818e;

    /* renamed from: f */
    public final Optional f310819f;

    /* renamed from: g */
    public final C68214a f310820g;

    /* renamed from: h */
    public final boolean f310821h;

    /* renamed from: i */
    public final C68214a f310822i;

    /* renamed from: j */
    public final C111846a f310823j;

    public C111844h(C22871g gVar, C22871g gVar2, C111846a aVar, C86124t tVar, C111848c cVar, C68214a aVar2, C68214a aVar3) {
        Optional optional;
        this.f310815b = gVar;
        this.f310816c = gVar2;
        this.f310823j = aVar;
        C112078c cVar2 = new C112078c(new C111847b(), aVar, tVar, C48674ai.BLUE_CHIP);
        this.f310817d = cVar2;
        this.f310820g = aVar2;
        if (!cVar.f310826a.isPresent()) {
            optional = Optional.empty();
        } else {
            asx asx = (asx) cVar.f310826a.get();
            asx.f203991b = C113383dx.m187611b();
            C111846a aVar4 = cVar.f310828c;
            aVar4.getClass();
            asx.f203992c = aVar4;
            asx.f203993d = cVar2;
            Context context = cVar.f310827b;
            context.getClass();
            asx.f203994e = context;
            asx.f203991b = C113383dx.m187611b();
            C48674ai aiVar = C48674ai.GEMINI;
            aiVar.getClass();
            asx.f203995f = aiVar;
            C68225k.m98529a(asx.f203991b, l.class);
            C68225k.m98529a(asx.f203992c, C2391v.class);
            C68225k.m98529a(asx.f203993d, h.class);
            C68225k.m98529a(asx.f203994e, Context.class);
            C68225k.m98529a(asx.f203995f, C48674ai.class);
            optional = Optional.m71637of(new asz(asx.f203990a, asx.f203992c, asx.f203993d, asx.f203994e, asx.f203995f));
        }
        this.f310818e = optional.map(C111842f.f310812a);
        this.f310819f = optional.map(C111843g.f310813a);
        this.f310821h = tVar.mo79746e(C90063do.f249319bL);
        this.f310822i = aVar3;
    }
}
