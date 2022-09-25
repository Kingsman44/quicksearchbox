package com.google.android.libraries.assistant.auto.jumpboost.p669e;

import android.net.Uri;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.e.f */
/* compiled from: PG */
final class C11471f implements GatewayHandler {

    /* renamed from: a */
    public final C11469d f37272a;

    /* renamed from: b */
    private final C69464a f37273b;

    public C11471f(C11469d dVar, C69464a aVar) {
        this.f37272a = dVar;
        this.f37273b = aVar;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Uri data = mVar.f123337a.getData();
        if (data == null || !((Boolean) this.f37273b.mo17428b()).booleanValue()) {
            return null;
        }
        String path = data.getPath();
        if (("http".equals(data.getScheme()) || "https".equals(data.getScheme())) && "assistant.google.com".equals(data.getHost()) && path != null && path.startsWith("/aap/services/invoke")) {
            return new C11470e(this, data);
        }
        return null;
    }
}
