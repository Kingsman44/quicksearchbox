package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o;

import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.ak */
/* compiled from: PG */
public final class C111700ak extends C113409et {

    /* renamed from: a */
    public static final C121511c f310512a;

    /* renamed from: e */
    private static final C121537f f310513e;

    /* renamed from: b */
    public final C68214a f310514b;

    /* renamed from: c */
    public final C68214a f310515c;

    /* renamed from: d */
    public final C112982q f310516d;

    /* renamed from: f */
    private final C111741v f310517f;

    /* renamed from: g */
    private final C22871g f310518g;

    static {
        C121537f b = C121537f.m200840b("TapasServerSuggestSource", C113409et.f314037l);
        f310513e = b;
        f310512a = b.f337270a;
    }

    public C111700ak(C22871g gVar, C111741v vVar, C68214a aVar, C68214a aVar2, C112982q qVar) {
        this.f310518g = gVar;
        this.f310517f = vVar;
        this.f310514b = aVar;
        this.f310515c = aVar2;
        this.f310516d = qVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.TAPAS_SERVER;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        this.f310516d.mo99804e(epVar.mo100016a(), C112976k.TAPAS_SERVER_SOURCE);
        return this.f310518g.mo28210j(this.f310517f.mo99217a(epVar), "parse tapas server response", new C111698ai(this, epVar));
    }
}
