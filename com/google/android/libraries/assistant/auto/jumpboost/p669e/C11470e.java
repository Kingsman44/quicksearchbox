package com.google.android.libraries.assistant.auto.jumpboost.p669e;

import android.content.Intent;
import android.net.Uri;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.e.e */
/* compiled from: PG */
final class C11470e implements C47506l {

    /* renamed from: a */
    final /* synthetic */ Uri f37270a;

    /* renamed from: b */
    final /* synthetic */ C11471f f37271b;

    public C11470e(C11471f fVar, Uri uri) {
        this.f37271b = fVar;
        this.f37270a = uri;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo20002a() {
        return 0;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo20003b() {
        return 0;
    }

    /* renamed from: c */
    public final C58833ax mo20004c() {
        return C58836b.f156633a;
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        C11469d dVar = this.f37271b.f37272a;
        if (dVar.f37266a.f38013a) {
            Uri uri = this.f37270a;
            C60870cx c = dVar.f37267b.mo20065c();
            C11467b bVar = new C11467b(dVar, uri);
            C46459k.m82829b(C60922j.m93045h(c, C47810es.m84966f(bVar), dVar.f37269d), "Error requesting assistant session for deeplink", new Object[0]);
            return C60856cj.m92900i(new GatewayHandler.GatewayDestination(5, (List) null, (String) null));
        }
        Uri build = this.f37270a.buildUpon().path(this.f37270a.getPath().substring(4)).build();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(build);
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
