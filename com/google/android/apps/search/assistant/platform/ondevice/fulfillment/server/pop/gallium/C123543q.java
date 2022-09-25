package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123057e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.q */
/* compiled from: PG */
public final /* synthetic */ class C123543q implements C123057e {

    /* renamed from: a */
    public final /* synthetic */ C68214a f341373a;

    public /* synthetic */ C123543q(C68214a aVar) {
        this.f341373a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo105810a() {
        ((C59052c) ((C59052c) C123548v.f341398a.mo56224b()).mo56372aa(34947)).mo56386p("Tearing down GalliumClients.");
        return C47638k.m84750a((Iterable) Collection.EL.stream((Set) this.f341373a.mo27525b()).map(C123540n.f341370a).peek(C123541o.f341371a).collect(C58370cn.f155947b)).mo51520a(C123542p.f341372a, C60826bg.f164896a);
    }
}
