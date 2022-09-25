package com.google.android.libraries.assistant.pcp.p1554e;

import android.content.Context;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1551b.C18601c;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1551b.C18602d;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1551b.C18603e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3809c.C49045ek;
import com.google.assistant.p3803ag.p3809c.C49046el;
import com.google.assistant.p3803ag.p3809c.C49050ep;
import com.google.assistant.p3803ag.p3809c.C49099gk;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.assistant.pcp.e.at */
/* compiled from: PG */
public final class C18650at implements C18630a {

    /* renamed from: a */
    public final Context f52677a;

    /* renamed from: b */
    public final Executor f52678b;

    /* renamed from: c */
    public final C58528ij f52679c;

    /* renamed from: d */
    public final C18603e f52680d;

    /* renamed from: e */
    private final Executor f52681e;

    public C18650at(Context context, Executor executor, Executor executor2, Set set, C18603e eVar) {
        this.f52677a = context;
        this.f52681e = executor;
        this.f52678b = executor2;
        this.f52679c = C58528ij.m90006F(set);
        this.f52680d = eVar;
    }

    /* renamed from: b */
    public static C49046el m36106b(C49050ep epVar, C58528ij ijVar) {
        Optional map = Collection.EL.stream(epVar.f126863c).filter(new C18661l(ijVar)).findFirst().map(C18662m.f52694a);
        C49046el elVar = epVar.f126862b;
        if (elVar == null) {
            elVar = C49046el.f126849c;
        }
        return (C49046el) map.orElse(elVar);
    }

    /* renamed from: c */
    public static C58528ij m36107c(C49099gk gkVar, C58528ij ijVar, Set set) {
        Stream map = Collection.EL.stream(gkVar.f126987c).filter(new C18635ae(ijVar)).map(C18636af.f52662a).map(C18663n.f52695a);
        Objects.requireNonNull(set);
        return (C58528ij) map.filter(new C18658i(set)).collect(C58370cn.f155947b);
    }

    /* renamed from: f */
    public static boolean m36108f(C49046el elVar) {
        int a = C49045ek.m85351a(elVar.f126851a);
        return a != 0 && a == 2;
    }

    /* renamed from: a */
    public final C60870cx mo24093a(C53306j jVar) {
        C60870cx d = mo24095d();
        C18632ab abVar = new C18632ab(this, jVar);
        return C60922j.m93044g(d, C47810es.m84963c(abVar), this.f52678b);
    }

    /* renamed from: d */
    public final C60870cx mo24095d() {
        C47633f e = C47633f.m84733g(this.f52680d.f52627b.mo46042d()).mo51515h(C18601c.f52624a, C60826bg.f164896a).mo51513e(Throwable.class, C18602d.f52625a, C60826bg.f164896a);
        C18642al alVar = new C18642al(this);
        return C60922j.m93045h(e, C47810es.m84966f(alVar), this.f52678b);
    }

    /* renamed from: e */
    public final C60870cx mo24096e() {
        C18637ag agVar = new C18637ag(this);
        return C60856cj.m92904m(C47810es.m84978r(agVar), this.f52681e);
    }
}
