package com.google.android.apps.search.faceviewer.p10089a;

import android.content.Intent;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.faceviewer.a.a */
/* compiled from: PG */
final class C132673a implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C132674b f362050a;

    /* renamed from: b */
    private final Intent f362051b;

    public C132673a(C132674b bVar, Intent intent) {
        this.f362050a = bVar;
        this.f362051b = intent;
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
        return this.f362050a.f362053b.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Intent flags = new Intent().setClassName(this.f362050a.f362052a, "com.google.android.apps.search.faceviewer.FaceViewerActivity").setAction(this.f362051b.getAction()).putExtras(this.f362051b).setFlags(268435456);
        C45963aa.m82131a(flags, kVar.f123336a);
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84515c(C58485gu.m89846n(flags)));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
