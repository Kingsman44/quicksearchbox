package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9359a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124204t;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124271b;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a.C124269c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a.C124270d;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124272a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124294b;
import com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a.C124331b;
import com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a.C124332c;
import com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a.C124333d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.assistant.p3741aa.C48175j;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.u */
/* compiled from: PG */
public final class C124293u implements C124294b {

    /* renamed from: a */
    public static final C59071e f343122a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.wholehome.a.b.h.a.u");

    /* renamed from: b */
    public final C124271b f343123b;

    /* renamed from: c */
    public final C58485gu f343124c;

    /* renamed from: d */
    public final C60870cx f343125d;

    /* renamed from: e */
    public final Executor f343126e;

    /* renamed from: f */
    public final AtomicBoolean f343127f = new AtomicBoolean(false);

    /* renamed from: g */
    private final C47632e f343128g = new C47632e();

    public C124293u(C124270d dVar, C124333d dVar2, Executor executor) {
        Set set = (Set) dVar.f343093a.mo17428b();
        set.getClass();
        Executor executor2 = (Executor) dVar.f343094b.mo17428b();
        executor2.getClass();
        this.f343123b = new C124269c(set, executor2);
        C60870cx a = dVar2.f343213c.mo106377a();
        C124332c cVar = new C124332c(dVar2);
        this.f343125d = C60922j.m93044g(a, C47810es.m84963c(cVar), dVar2.f343211a);
        C60870cx a2 = dVar2.f343213c.mo106377a();
        C124331b bVar = new C124331b(dVar2);
        C60870cx g = C60922j.m93044g(a2, C47810es.m84963c(bVar), dVar2.f343211a);
        C58480gp gpVar = new C58480gp(4);
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124283k(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124284l(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124285m(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124286n(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124287o(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124288p(this)), executor));
        gpVar.mo55395g(C60922j.m93044g(g, C47810es.m84963c(new C124289q(this)), executor));
        this.f343124c = gpVar.mo55394f();
        this.f343126e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo106360a(C124204t tVar) {
        return this.f343128g.mo51512b(new C124282j(this, tVar), this.f343126e);
    }

    /* renamed from: b */
    public final C60870cx mo106361b() {
        return this.f343128g.mo51512b(new C124277e(this), this.f343126e);
    }

    /* renamed from: c */
    public final C60870cx mo106362c() {
        ((C59052c) ((C59052c) f343122a.mo56224b()).mo56372aa(36147)).mo56386p("Starting Usonia gmscore.");
        return this.f343128g.mo51512b(new C124273a(this), this.f343126e);
    }

    /* renamed from: d */
    public final C60870cx mo106363d() {
        ((C59052c) ((C59052c) f343122a.mo56224b()).mo56372aa(36148)).mo56386p("Stopping Usonia gmscore.");
        return this.f343128g.mo51512b(new C124275c(this), this.f343126e);
    }

    /* renamed from: e */
    public final C60870cx mo106364e(C48175j jVar) {
        throw new UnsupportedOperationException("Server side logic is not available with gmscore implementation.");
    }

    /* renamed from: f */
    public final void mo106365f(C124272a aVar) {
        throw new UnsupportedOperationException("Server side logic is not available with gmscore implementation.");
    }
}
