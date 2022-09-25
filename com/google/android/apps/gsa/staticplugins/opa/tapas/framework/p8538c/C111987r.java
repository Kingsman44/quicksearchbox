package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.r */
/* compiled from: PG */
public final /* synthetic */ class C111987r implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111993x f311108a;

    /* renamed from: b */
    public final /* synthetic */ C48672ag f311109b;

    /* renamed from: c */
    public final /* synthetic */ C69464a f311110c;

    /* renamed from: d */
    public final /* synthetic */ C113405ep f311111d;

    /* renamed from: e */
    public final /* synthetic */ C58490gz f311112e;

    public /* synthetic */ C111987r(C111993x xVar, C48672ag agVar, C69464a aVar, C113405ep epVar, C58490gz gzVar) {
        this.f311108a = xVar;
        this.f311109b = agVar;
        this.f311110c = aVar;
        this.f311111d = epVar;
        this.f311112e = gzVar;
    }

    public final Object call() {
        C111993x xVar = this.f311108a;
        C48672ag agVar = this.f311109b;
        C69464a aVar = this.f311110c;
        C113405ep epVar = this.f311111d;
        C58490gz gzVar = this.f311112e;
        long c = xVar.f311136m.mo26871c();
        C113409et etVar = (C113409et) aVar.mo17428b();
        C58976aa aaVar = C58975e.f156826a;
        etVar.mo99101a().name();
        C121537f fVar = C111993x.f311125b;
        String name = etVar.mo99101a().name();
        C60870cx e = C90877ak.m148471e(fVar.mo105234c("SourceFetch_".concat(String.valueOf(name)), new C111986q(etVar, epVar, gzVar)), ((C111885bw) xVar.f311134k.mo27525b()).mo99274b(epVar.mo100033p(), C111885bw.m185717c(epVar)), TimeUnit.MILLISECONDS, xVar.f311128e);
        ((C111948ap) xVar.f311129f.mo27525b()).mo99308b(c, e, epVar, agVar);
        return e;
    }
}
