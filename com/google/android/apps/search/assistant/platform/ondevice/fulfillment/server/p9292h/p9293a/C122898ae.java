package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.p9293a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.C122872ec;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123141a;
import com.google.android.libraries.mdi.C29690f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.h.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C122898ae implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123141a f340376a;

    /* renamed from: b */
    public final /* synthetic */ C122964p f340377b;

    public /* synthetic */ C122898ae(C123141a aVar, C122964p pVar) {
        this.f340376a = aVar;
        this.f340377b = pVar;
    }

    public final C60870cx apply(Object obj) {
        C123141a aVar = this.f340376a;
        C122964p pVar = this.f340377b;
        C122872ec ecVar = (C122872ec) obj;
        C122463r a = aVar.mo105894a();
        C29690f fVar = a.f339498d;
        if (fVar == null) {
            fVar = C29690f.f80408m;
        }
        if (fVar.equals(C29690f.f80408m)) {
            pVar.mo105804a(Optional.empty());
            return C60856cj.m92899h(new C122872ec("ResourceServiceImpl", "Client webref group is empty"));
        }
        pVar.mo105804a(Optional.m71637of("webref_client"));
        C29690f fVar2 = a.f339498d;
        if (fVar2 == null) {
            fVar2 = C29690f.f80408m;
        }
        return C60856cj.m92900i(fVar2);
    }
}
