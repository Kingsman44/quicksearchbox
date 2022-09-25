package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g;

import com.google.android.libraries.appactions.serviceengine.api.C147871d;
import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.appactions.serviceengine.api.C147875h;
import com.google.android.libraries.appactions.serviceengine.api.C147880m;
import com.google.android.libraries.appactions.serviceengine.api.C147881n;
import com.google.android.libraries.appactions.serviceengine.impl.C147915h;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3944g.p3948b.p3949a.C52935af;
import com.google.assistant.p3944g.p3948b.p3949a.C52936ag;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.av */
/* compiled from: PG */
public final class C135824av {

    /* renamed from: a */
    public static final C59071e f369951a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.g.av");

    /* renamed from: b */
    public final C147875h f369952b;

    /* renamed from: c */
    public final C147874g f369953c;

    /* renamed from: d */
    public final Executor f369954d;

    /* renamed from: e */
    public Optional f369955e = Optional.empty();

    /* renamed from: f */
    public Optional f369956f = Optional.empty();

    /* renamed from: g */
    public final C60845bz f369957g = new C135822at(this);

    /* renamed from: h */
    private final String f369958h;

    /* renamed from: i */
    private final C135823au f369959i;

    public C135824av(C147875h hVar, C147915h hVar2, C147874g gVar, Executor executor, long j, String str) {
        this.f369952b = hVar;
        this.f369953c = gVar;
        this.f369954d = executor;
        this.f369958h = str;
        hVar.mo124562d(gVar.mo111399a());
        C135823au a = C135823au.m220362a(j);
        this.f369959i = a;
        if (a == C135823au.FULFILLMENT_LINK_WEB_PAGE) {
            hVar2.f398991a.f398989b = true;
        }
    }

    /* renamed from: a */
    public final C60870cx mo112570a(String str) {
        C147880m k = C147881n.m241026k();
        C147871d dVar = (C147871d) k;
        dVar.f398906b = Optional.m71637of(str);
        dVar.f398905a = Optional.m71637of(C52935af.SURFACE_TYPE_AGA_GAB);
        k.mo124544c();
        k.f398928f.mo55429h("utm_source", "instacart_growth_partnerships");
        k.f398928f.mo55429h("utm_medium", "partner_recipe_google");
        k.f398928f.mo55429h("source_value", "google");
        if (this.f369959i == C135823au.FULFILLMENT_LINK_WEBX) {
            dVar.f398908d = Optional.m71637of(C52936ag.URL_VALIDATOR_CLIENT);
        }
        C147875h hVar = this.f369952b;
        mo112572c(k);
        return hVar.mo124560b(k.mo124564e());
    }

    /* renamed from: b */
    public final void mo112571b(C37252a aVar) {
        this.f369953c.mo111401c(aVar, "aga_gab");
    }

    /* renamed from: c */
    public final void mo112572c(C147880m mVar) {
        if (!this.f369958h.isEmpty()) {
            mVar.f398928f.mo55429h("utm_campaign", this.f369958h);
        }
    }
}
