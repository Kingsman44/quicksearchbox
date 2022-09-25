package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cv */
/* compiled from: PG */
public final /* synthetic */ class C112531cv implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C112548dl f312100a;

    /* renamed from: b */
    public final /* synthetic */ C86124t f312101b;

    /* renamed from: c */
    public final /* synthetic */ Map f312102c;

    /* renamed from: d */
    public final /* synthetic */ C86054o f312103d;

    /* renamed from: e */
    public final /* synthetic */ Executor f312104e;

    public /* synthetic */ C112531cv(C112548dl dlVar, C86124t tVar, Map map, C86054o oVar, Executor executor) {
        this.f312100a = dlVar;
        this.f312101b = tVar;
        this.f312102c = map;
        this.f312103d = oVar;
        this.f312104e = executor;
    }

    public final void run() {
        C112548dl dlVar = this.f312100a;
        C86124t tVar = this.f312101b;
        Map map = this.f312102c;
        C86054o oVar = this.f312103d;
        Executor executor = this.f312104e;
        dlVar.f312132d = (C58495hd) Collection.EL.stream(map.entrySet()).filter(new C112532cw(tVar.mo79745c(C90063do.f249594gV))).collect(C58370cn.m89403c(C112533cx.f312106a, new C112534cy(dlVar), C112522cm.f312087a));
        dlVar.f312137i = Optional.ofNullable(oVar.mo79659F());
        C60856cj.m92911t(dlVar.mo99584f(), C47810es.m84974n(new C112535cz()), executor);
    }
}
