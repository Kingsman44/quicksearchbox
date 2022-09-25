package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122983ad;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.assistant.gallium.framework.CppMobStoreResourceLoader;
import com.google.android.libraries.assistant.gallium.framework.GalliumIpc;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18221a;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18226d;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18227e;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18228f;
import com.google.android.libraries.assistant.portable.LongLivedCppInterfaceRegistryProvider;
import com.google.android.libraries.assistant.portable.PopCppDeploymentConfigProvider;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4850an.p4851a.p4852a.C63327k;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.u */
/* compiled from: PG */
public final /* synthetic */ class C123547u implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122985af f341388a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f341389b;

    /* renamed from: c */
    public final /* synthetic */ Context f341390c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f341391d;

    /* renamed from: e */
    public final /* synthetic */ Executor f341392e;

    /* renamed from: f */
    public final /* synthetic */ C18207ak f341393f;

    /* renamed from: g */
    public final /* synthetic */ List f341394g;

    /* renamed from: h */
    public final /* synthetic */ C39141kp f341395h;

    /* renamed from: i */
    public final /* synthetic */ String f341396i;

    /* renamed from: j */
    public final /* synthetic */ boolean f341397j;

    public /* synthetic */ C123547u(C122985af afVar, C60870cx cxVar, Context context, C60870cx cxVar2, Executor executor, C18207ak akVar, List list, C39141kp kpVar, String str, boolean z) {
        this.f341388a = afVar;
        this.f341389b = cxVar;
        this.f341390c = context;
        this.f341391d = cxVar2;
        this.f341392e = executor;
        this.f341393f = akVar;
        this.f341394g = list;
        this.f341395h = kpVar;
        this.f341396i = str;
        this.f341397j = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122985af afVar = this.f341388a;
        C60870cx cxVar = this.f341389b;
        Context context = this.f341390c;
        C60870cx cxVar2 = this.f341391d;
        Executor executor = this.f341392e;
        C18207ak akVar = this.f341393f;
        List list = this.f341394g;
        C39141kp kpVar = this.f341395h;
        String str = this.f341396i;
        boolean z = this.f341397j;
        CppMobStoreResourceLoader b = CppMobStoreResourceLoader.m35418b(context, (C63327k) C60856cj.m92909r(cxVar2));
        C18227e l = C18228f.m35519l();
        l.mo23710e(akVar);
        l.mo23708c(z);
        C18221a aVar = (C18221a) l;
        aVar.f51758c = new PopCppDeploymentConfigProvider(b);
        aVar.f51759d = b;
        aVar.f51757b = new LongLivedCppInterfaceRegistryProvider();
        aVar.f51763h = Optional.m71637of(kpVar);
        l.mo23707b(str);
        l.mo23709d(executor);
        aVar.f51761f = C58485gu.m89842j(list);
        GalliumIpc galliumIpc = (GalliumIpc) ((C18226d) C60856cj.m92909r(cxVar)).mo23711a(l.mo23706a());
        ((C59052c) ((C59052c) C123548v.f341398a.mo56224b()).mo56372aa(34945)).mo56386p("Long-lived Gallium initialized.");
        C122983ad.m202320a(afVar, galliumIpc, new C123546t(executor));
        return C60856cj.m92900i(galliumIpc);
    }
}
