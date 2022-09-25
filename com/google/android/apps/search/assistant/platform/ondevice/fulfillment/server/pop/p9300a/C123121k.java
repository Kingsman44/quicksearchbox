package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122983ad;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.libraries.assistant.gallium.framework.CppMobStoreResourceLoader;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.portable.PortableAssistant;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.k */
/* compiled from: PG */
public final /* synthetic */ class C123121k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123089ac f340774a;

    /* renamed from: b */
    public final /* synthetic */ C122985af f340775b;

    /* renamed from: c */
    public final /* synthetic */ C63327k f340776c;

    /* renamed from: d */
    public final /* synthetic */ Optional f340777d;

    public /* synthetic */ C123121k(C123089ac acVar, C122985af afVar, C63327k kVar, Optional optional) {
        this.f340774a = acVar;
        this.f340775b = afVar;
        this.f340776c = kVar;
        this.f340777d = optional;
    }

    public final C60870cx apply(Object obj) {
        PortableAssistant portableAssistant;
        C123089ac acVar = this.f340774a;
        C122985af afVar = this.f340775b;
        C63327k kVar = this.f340776c;
        Optional optional = this.f340777d;
        GalliumIpc galliumIpc = (GalliumIpc) obj;
        afVar.mo105812a(new C123134x(acVar, galliumIpc));
        C123103aq aqVar = acVar.f340694k;
        if (aqVar.f340732e) {
            portableAssistant = new PortableAssistant(galliumIpc.f51693f, aqVar.f340730c, galliumIpc, aqVar.f340731d.mo105904a());
        } else {
            portableAssistant = new PortableAssistant(CppMobStoreResourceLoader.m35418b(aqVar.f340728a, kVar), aqVar.f340730c, galliumIpc, aqVar.f340731d.mo105904a());
        }
        C122983ad.m202320a(afVar, portableAssistant, new C123129s(acVar));
        C60870cx b = acVar.mo105873b(portableAssistant, optional);
        C123135y yVar = new C123135y(galliumIpc, portableAssistant);
        return C60922j.m93045h(b, C47810es.m84966f(yVar), acVar.f340691h);
    }
}
