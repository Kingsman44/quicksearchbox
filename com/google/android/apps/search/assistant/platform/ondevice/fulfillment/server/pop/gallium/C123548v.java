package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9295i.p9296a.C122976b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123026bt;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123027bu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123148c;
import com.google.android.libraries.assistant.gallium.framework.C18207ak;
import com.google.android.libraries.search.assistant.p2716p.p2717a.p2718a.p2719a.C34922b;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.v */
/* compiled from: PG */
public final class C123548v implements C123534h, C122976b {

    /* renamed from: a */
    public static final C59071e f341398a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.v");

    /* renamed from: b */
    public final C123026bt f341399b;

    /* renamed from: c */
    private boolean f341400c = false;

    public C123548v(Context context, C123027bu buVar, C123148c cVar, C34922b bVar, C18207ak akVar, C68214a aVar, C123550x xVar, C39141kp kpVar, String str, Executor executor, Executor executor2, C123168a aVar2, Set set, boolean z, boolean z2) {
        this.f341399b = buVar.mo105837a(new C123544r(context, cVar, bVar, executor, akVar, z, executor2, kpVar, str, z2, aVar, set), Optional.empty(), executor);
        xVar.f341402a = Optional.m71637of(new C123545s(this));
    }

    /* renamed from: a */
    public final C60870cx mo106031a() {
        synchronized (this) {
            if (!this.f341400c) {
                return this.f341399b.mo105834b();
            }
            C60870cx h = C60856cj.m92899h(new C122872ec("LongLivedGalliumProviderImpl", "LongLivedGalliumProvider is disabled because it is currently shutting down."));
            return h;
        }
    }

    /* renamed from: c */
    public final C60870cx mo105714c() {
        ((C59052c) ((C59052c) f341398a.mo56224b()).mo56372aa(34946)).mo56386p("Tearing down long-lived Gallium.");
        synchronized (this) {
            this.f341400c = true;
        }
        return this.f341399b.mo105833a();
    }
}
