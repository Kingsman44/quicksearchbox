package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.C122976b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123026bt;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123027bu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123140c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123165e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ao */
/* compiled from: PG */
public final class C123101ao implements C123165e, C122976b {

    /* renamed from: a */
    public static final C59071e f340722a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ao");

    /* renamed from: b */
    public final C123026bt f340723b;

    /* renamed from: c */
    public C123001av f340724c;

    /* renamed from: d */
    private boolean f340725d = false;

    public C123101ao(C123140c cVar, C123027bu buVar, C123002aw awVar, long j, Executor executor) {
        this.f340724c = awVar.mo105822a();
        this.f340723b = buVar.mo105837a(new C123100an(this, awVar, cVar), Optional.m71637of(Duration.ofMillis(j)), executor);
    }

    /* renamed from: a */
    public final synchronized C123001av mo105883a() {
        return this.f340724c;
    }

    /* renamed from: b */
    public final C60870cx mo105884b() {
        return this.f340723b.mo105835c();
    }

    /* renamed from: c */
    public final C60870cx mo105714c() {
        synchronized (this) {
            this.f340725d = true;
        }
        return this.f340723b.mo105833a();
    }

    /* renamed from: d */
    public final synchronized C60870cx mo105885d() {
        if (this.f340725d) {
            return C60856cj.m92899h(new C122872ec("PopWrapperProviderImpl", "is shutdown"));
        }
        this.f340723b.mo105836d();
        return this.f340723b.mo105834b();
    }
}
