package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp;

import android.view.ViewGroup;
import androidx.lifecycle.C2332ag;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.C106830j;
import com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel.TopLevelRendererHelper;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.pcp.m */
/* compiled from: PG */
public final class C106816m {

    /* renamed from: a */
    public final C58974d f297670a;

    /* renamed from: b */
    public final C118339a f297671b;

    /* renamed from: c */
    public final C60888db f297672c;

    /* renamed from: d */
    public final Optional f297673d;

    /* renamed from: e */
    public final C2332ag f297674e = new C2332ag();

    /* renamed from: f */
    public C123598n f297675f;

    /* renamed from: g */
    public final C60870cx f297676g;

    /* renamed from: h */
    private final C60836bq f297677h = new C60836bq();

    public C106816m(C118339a aVar, TopLevelRendererHelper topLevelRendererHelper, C60888db dbVar, Optional optional, C50701am amVar, ViewGroup viewGroup, C83564a aVar2) {
        this.f297671b = aVar;
        this.f297672c = dbVar;
        this.f297673d = optional;
        C60870cx a = topLevelRendererHelper.mo95682a(amVar, viewGroup);
        C106830j jVar = new C106830j(topLevelRendererHelper);
        this.f297676g = C60922j.m93044g(a, C47810es.m84963c(jVar), topLevelRendererHelper.f297685b);
        this.f297670a = aVar2.mo76900a("PcpConnHelper");
    }

    /* renamed from: a */
    public final void mo95676a(C60870cx cxVar) {
        C60870cx b = this.f297677h.mo57305b(new C106810g(this, cxVar), this.f297672c);
        C106812i iVar = new C106812i(this);
        C60856cj.m92911t(b, C47810es.m84974n(iVar), this.f297672c);
        mo95677b(cxVar);
    }

    /* renamed from: b */
    public final void mo95677b(C60870cx cxVar) {
        ((C58970a) ((C58970a) this.f297670a.mo56224b()).mo56372aa(23307)).mo56386p("requestProactiveData");
        C106815l lVar = new C106815l(this);
        C60856cj.m92911t(cxVar, C47810es.m84974n(lVar), this.f297672c);
    }

    /* renamed from: c */
    public final void mo95678c() {
        C60870cx a = this.f297677h.mo57304a(new C106805b(this), this.f297672c);
        C106813j jVar = new C106813j(this);
        C60856cj.m92911t(a, C47810es.m84974n(jVar), this.f297672c);
    }
}
