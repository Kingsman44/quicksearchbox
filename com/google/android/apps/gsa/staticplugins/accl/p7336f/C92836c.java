package com.google.android.apps.gsa.staticplugins.accl.p7336f;

import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.f.c */
/* compiled from: PG */
public final class C92836c implements C84350ai {

    /* renamed from: a */
    public static final C59071e f259030a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.f.c");

    /* renamed from: b */
    public final C68214a f259031b;

    /* renamed from: c */
    private final C22871g f259032c;

    public C92836c(C68214a aVar, C22871g gVar) {
        this.f259031b = aVar;
        this.f259032c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo77886a(ServiceEventData serviceEventData) {
        return this.f259032c.mo28201a("Send service event", new C92835b(this, serviceEventData));
    }
}
