package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122983ad;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.libraries.assistant.gallium.framework.CppMobStoreResourceLoader;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.j */
/* compiled from: PG */
public final /* synthetic */ class C123120j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340769a;

    /* renamed from: b */
    public final /* synthetic */ C122985af f340770b;

    /* renamed from: c */
    public final /* synthetic */ C63327k f340771c;

    /* renamed from: d */
    public final /* synthetic */ C18226d f340772d;

    /* renamed from: e */
    public final /* synthetic */ Optional f340773e;

    public /* synthetic */ C123120j(C123089ac acVar, C122985af afVar, C63327k kVar, C18226d dVar, Optional optional) {
        this.f340769a = acVar;
        this.f340770b = afVar;
        this.f340771c = kVar;
        this.f340772d = dVar;
        this.f340773e = optional;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123089ac acVar = this.f340769a;
        C122985af afVar = this.f340770b;
        C63327k kVar = this.f340771c;
        C18226d dVar = this.f340772d;
        Optional optional = this.f340773e;
        C123103aq aqVar = acVar.f340694k;
        PortableAssistant portableAssistant = new PortableAssistant(CppMobStoreResourceLoader.m35418b(aqVar.f340728a, kVar), new C123102ap(aqVar, dVar), aqVar.f340730c);
        C122983ad.m202320a(afVar, portableAssistant, new C123129s(acVar));
        C60870cx b = acVar.mo105873b(portableAssistant, optional);
        C123131u uVar = new C123131u(portableAssistant);
        return C60922j.m93044g(b, C47810es.m84963c(uVar), C60826bg.f164896a);
    }
}
