package com.google.android.apps.search.googleapp.customtabs.features.appactions;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.appactions.serviceengine.api.C147871d;
import com.google.android.libraries.appactions.serviceengine.api.C147875h;
import com.google.android.libraries.appactions.serviceengine.api.C147880m;
import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import com.google.android.libraries.appactions.serviceengine.impl.C147907ap;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3944g.p3948b.p3949a.C52935af;
import com.google.assistant.p3944g.p3948b.p3949a.C52955t;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.appactions.j */
/* compiled from: PG */
public final /* synthetic */ class C133791j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133798q f364425a;

    /* renamed from: b */
    public final /* synthetic */ String f364426b;

    public /* synthetic */ C133791j(C133798q qVar, String str) {
        this.f364425a = qVar;
        this.f364426b = str;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        Optional optional2;
        C133798q qVar = this.f364425a;
        String str = this.f364426b;
        C58485gu guVar = (C58485gu) obj;
        for (int i = 0; i < guVar.size(); i++) {
            C52955t tVar = ((C147907ap) guVar.get(i)).f398982a;
            if ((tVar.f138845a & 1) != 0) {
                optional = Optional.m71637of(tVar.f138846b);
            } else {
                optional = Optional.empty();
            }
            if ("com.instacart.client".equals(optional.orElse(BuildConfig.FLAVOR))) {
                C52955t tVar2 = ((C147907ap) guVar.get(i)).f398982a;
                if ((tVar2.f138845a & 4) != 0) {
                    optional2 = Optional.m71637of(Boolean.valueOf(tVar2.f138848d));
                } else {
                    optional2 = Optional.empty();
                }
                if (((Boolean) optional2.orElse(false)).booleanValue()) {
                    C133806y yVar = qVar.f364438f;
                    C147880m k = C147881n.m241026k();
                    C147871d dVar = (C147871d) k;
                    dVar.f398906b = Optional.m71637of(str);
                    dVar.f398905a = Optional.m71637of(C52935af.SURFACE_TYPE_AGA_CCT);
                    k.mo124544c();
                    dVar.f398909e = Optional.m71637of(Boolean.valueOf(yVar.f364455e));
                    k.f398928f.mo55429h("utm_source", "instacart_growth_partnerships");
                    k.f398928f.mo55429h("utm_medium", "partner_recipe_google");
                    k.f398928f.mo55429h("source_value", "google");
                    C147875h hVar = yVar.f364452b;
                    if (!yVar.f364456f.isEmpty()) {
                        k.f398928f.mo55429h("utm_campaign", yVar.f364456f);
                    }
                    C60870cx b = hVar.mo124560b(k.mo124564e());
                    C133804w wVar = C133804w.f364449a;
                    C60870cx g = C60922j.m93044g(b, C47810es.m84963c(wVar), yVar.f364454d);
                    C133794m mVar = C133794m.f364429a;
                    return C60846c.m92879h(g, Exception.class, C47810es.m84966f(mVar), C60826bg.f164896a);
                }
            }
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
