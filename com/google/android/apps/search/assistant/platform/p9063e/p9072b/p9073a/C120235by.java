package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.gsa.binaries.satin.app.aen;
import com.google.android.apps.gsa.binaries.satin.app.ajk;
import com.google.android.apps.gsa.binaries.satin.app.aml;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120887b;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4462i.C58048g;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.by */
/* compiled from: PG */
public final class C120235by implements C120887b {

    /* renamed from: a */
    public final Executor f334583a;

    /* renamed from: b */
    public C120244cb f334584b;

    /* renamed from: c */
    public final aen f334585c;

    /* renamed from: d */
    public final ajk f334586d;

    /* renamed from: e */
    public final aml f334587e;

    /* renamed from: f */
    public final C58048g f334588f;

    /* renamed from: g */
    private final C33447g f334589g;

    public C120235by(aen aen, ajk ajk, aml aml, C58048g gVar, C33447g gVar2, Executor executor) {
        this.f334585c = aen;
        this.f334586d = ajk;
        this.f334587e = aml;
        this.f334588f = gVar;
        this.f334589g = gVar2;
        this.f334583a = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo104700a(C120244cb cbVar) {
        C60870cx d = cbVar.mo104704d();
        this.f334589g.mo38849b(new C120229bs(d));
        this.f334589g.mo38849b(new C120230bt(cbVar.mo104703c()));
        C120234bx bxVar = new C120234bx(cbVar.mo104702b());
        C60856cj.m92911t(d, C47810es.m84974n(bxVar), this.f334583a);
        return d;
    }

    /* renamed from: b */
    public final C60870cx mo104701b(C120816a aVar) {
        C120228br brVar = new C120228br(this, aVar);
        return C60856cj.m92905n(C47810es.m84965e(brVar), this.f334583a);
    }
}
