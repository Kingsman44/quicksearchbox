package com.google.android.apps.search.assistant.surfaces.appactions.p9368a.p9369a;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.search.p2476a.p2477a.C32151a;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.a.a.a */
/* compiled from: PG */
final class C124365a implements C47506l {

    /* renamed from: a */
    final /* synthetic */ Uri f343272a;

    /* renamed from: b */
    final /* synthetic */ C124366b f343273b;

    public C124365a(C124366b bVar, Uri uri) {
        this.f343273b = bVar;
        this.f343272a = uri;
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
        return C32151a.m59928d(C58485gu.m89845m());
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(this.f343272a);
        intent.setClassName(this.f343273b.f343274a, "com.google.android.apps.gsa.deeplink.DeeplinkActivityEntrypoint");
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
