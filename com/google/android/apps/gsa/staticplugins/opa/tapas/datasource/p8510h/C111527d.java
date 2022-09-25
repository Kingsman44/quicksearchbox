package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.d */
/* compiled from: PG */
public final class C111527d extends C113409et {

    /* renamed from: g */
    public static final /* synthetic */ int f310205g = 0;

    /* renamed from: a */
    public final C68214a f310206a;

    /* renamed from: b */
    public final C21370a f310207b;

    /* renamed from: c */
    public final double f310208c;

    /* renamed from: d */
    public final boolean f310209d;

    /* renamed from: e */
    public final long f310210e;

    /* renamed from: f */
    public final C113425ff f310211f;

    /* renamed from: h */
    private final Executor f310212h;

    public C111527d(C68214a aVar, C21370a aVar2, C86124t tVar, C113425ff ffVar, C90851k kVar) {
        this.f310206a = aVar;
        this.f310207b = aVar2;
        this.f310208c = tVar.mo79747m(C90063do.f249508ep);
        this.f310209d = tVar.mo79746e(C90063do.f249581gI);
        this.f310210e = tVar.mo79743a(C90063do.f249507eo);
        this.f310211f = ffVar;
        if (tVar.mo79746e(C90063do.f249333bZ)) {
            this.f310212h = kVar.mo85210c("TapasLightweightExecutor");
        } else {
            this.f310212h = C60826bg.f164896a;
        }
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.HABIT;
    }

    /* renamed from: b */
    public final C60870cx mo99168b(C113405ep epVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (!TextUtils.isEmpty(epVar.mo100033p().trim())) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C60870cx b = this.f310211f.mo100136b();
        C111526c cVar = new C111526c(this);
        return C60922j.m93045h(b, C47810es.m84966f(cVar), this.f310212h);
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return mo99168b(epVar);
    }
}
