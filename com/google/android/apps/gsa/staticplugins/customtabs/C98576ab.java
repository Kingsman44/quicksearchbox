package com.google.android.apps.gsa.staticplugins.customtabs;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98572h;
import com.google.android.apps.gsa.staticplugins.customtabs.p7709b.C98634q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ab */
/* compiled from: PG */
public final /* synthetic */ class C98576ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98583ai f275319a;

    public /* synthetic */ C98576ab(C98583ai aiVar) {
        this.f275319a = aiVar;
    }

    public final C60870cx apply(Object obj) {
        C98572h a;
        C98583ai aiVar = this.f275319a;
        if (((Boolean) obj).booleanValue()) {
            C60870cx b = aiVar.f275338n.mo79697b();
            C98691k kVar = new C98691k(aiVar);
            C60870cx g = C60922j.m93044g(b, C47810es.m84963c(kVar), aiVar.f275335k);
            C47633f e = C47633f.m84733g(g).mo51516i(C98692l.f275680a, aiVar.f275335k).mo51516i(new C98693m(g), aiVar.f275335k).mo51513e(Exception.class, C98694n.f275682a, aiVar.f275335k);
            C98695o oVar = C98695o.f275683a;
            return C47638k.m84753d(e, C60922j.m93045h(g, C47810es.m84966f(oVar), aiVar.f275335k)).mo51520a(C98696p.f275684a, aiVar.f275335k);
        }
        if (!aiVar.f275329c.mo91196f() && (a = aiVar.f275329c.mo91191a()) != null && a.mo79781e()) {
            C98634q qVar = aiVar.f275330f;
            Objects.requireNonNull(qVar);
            aiVar.mo91198v(new C98704x(qVar));
        }
        return C118826c.f331423b;
    }
}
