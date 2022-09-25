package com.google.android.apps.search.assistant.verticals.ambient.p9905c.p9907b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.opa.smartspace.C83734af;
import com.google.android.apps.gsa.opa.smartspace.C83736ah;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.search.assistant.verticals.ambient.p9905c.C130551a;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131244m;
import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e.C131251t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63088z;
import java.net.URISyntaxException;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.c.b.s */
/* compiled from: PG */
public final class C130573s implements C130551a {

    /* renamed from: a */
    public final C60950i f357632a;

    /* renamed from: b */
    public final C130555a f357633b;

    /* renamed from: c */
    public final Context f357634c;

    /* renamed from: d */
    public final C131251t f357635d;

    /* renamed from: e */
    private final C58974d f357636e;

    /* renamed from: f */
    private final C131244m f357637f;

    /* renamed from: g */
    private final C60887da f357638g;

    /* renamed from: h */
    private final C60887da f357639h;

    public C130573s(C130603a aVar, C60950i iVar, C131244m mVar, C130555a aVar2, C60887da daVar, C60887da daVar2, Context context, C131251t tVar) {
        this.f357636e = aVar.mo109740b(this);
        this.f357632a = iVar;
        this.f357637f = mVar;
        this.f357633b = aVar2;
        this.f357638g = daVar;
        this.f357639h = daVar2;
        this.f357634c = context;
        this.f357635d = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo109724a(C83739ak akVar) {
        C60870cx cxVar;
        if (akVar.f228243l.isEmpty()) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            String str = ((C83734af) Collection.EL.stream(akVar.f228243l).filter(C130564j.f357622a).findFirst().orElseGet(new C130565k(akVar))).f228219b;
            cxVar = C47633f.m84733g(this.f357637f.mo110127a(str)).mo51515h(new C130566l(str), this.f357638g);
        }
        C83736ah ahVar = akVar.f228247p;
        if (ahVar == null) {
            ahVar = C83736ah.f228222c;
        }
        C60870cx f = C60856cj.m92897f(cxVar, mo109726b(ahVar), (C60870cx) Collection.EL.stream(akVar.f228246o).map(C130572r.f357631a).map(new C130557c(this)).findFirst().orElseGet(C130558d.f357615a));
        C130559e eVar = new C130559e(this, akVar);
        return C60922j.m93044g(f, C47810es.m84963c(eVar), this.f357638g);
    }

    /* renamed from: b */
    public final C60870cx mo109726b(C83736ah ahVar) {
        C60870cx cxVar;
        int i = ahVar.f228224a;
        if (i == 3) {
            cxVar = C60856cj.m92900i(Optional.m71637of((C63088z) ahVar.f228225b));
        } else if (i == 1) {
            cxVar = this.f357637f.mo110127a((String) ahVar.f228225b);
        } else if (i == 2) {
            C130567m mVar = new C130567m(this, ahVar);
            cxVar = C60856cj.m92904m(C47810es.m84978r(mVar), this.f357639h);
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C130556b bVar = new C130556b(ahVar);
        return C60922j.m93044g(cxVar, C47810es.m84963c(bVar), this.f357638g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Optional mo109727c(String str) {
        try {
            return Optional.m71637of(Intent.parseUri(str, 1).addFlags(268435456));
        } catch (URISyntaxException e) {
            ((C58970a) ((C58970a) ((C58970a) this.f357636e.mo56225c()).mo56382g(e)).mo56372aa(38920)).mo56386p("Error parsing intent.");
            return Optional.empty();
        }
    }
}
