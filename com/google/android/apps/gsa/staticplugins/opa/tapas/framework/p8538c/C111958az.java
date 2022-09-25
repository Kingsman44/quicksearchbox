package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.az */
/* compiled from: PG */
public final /* synthetic */ class C111958az implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C111971bl f311031a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311032b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f311033c;

    public /* synthetic */ C111958az(C111971bl blVar, C113405ep epVar, C60870cx cxVar) {
        this.f311031a = blVar;
        this.f311032b = epVar;
        this.f311033c = cxVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C111971bl blVar = this.f311031a;
        C113405ep epVar = this.f311032b;
        C60870cx cxVar = this.f311033c;
        C113404eo e = epVar.mo100020e();
        e.mo100010j(((C112312ag) blVar.f311062i.mo27525b()).mo99494c(epVar));
        C113405ep a = e.mo100001a();
        C121537f fVar = C111971bl.f311053a;
        C60870cx j = blVar.f311059f.mo28210j(cxVar, "ranking candidates", new C111962bc(blVar, a));
        fVar.mo105244m("rank", j);
        C60870cx g = C60922j.m93044g(j, new C111963bd(blVar, epVar), C60826bg.f164896a);
        g.mo4106b(new C111964be(blVar), C60826bg.f164896a);
        return g;
    }
}
