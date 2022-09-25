package com.google.android.apps.search.assistant.verticals.recommend.p10071b;

import android.content.Intent;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.b.a */
/* compiled from: PG */
final class C132513a implements C47506l {

    /* renamed from: a */
    final /* synthetic */ String f361659a;

    /* renamed from: b */
    final /* synthetic */ String f361660b;

    /* renamed from: c */
    final /* synthetic */ String f361661c;

    /* renamed from: d */
    final /* synthetic */ C132514b f361662d;

    public C132513a(C132514b bVar, String str, String str2, String str3) {
        this.f361662d = bVar;
        this.f361659a = str;
        this.f361660b = str2;
        this.f361661c = str3;
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
        return this.f361662d.f361665b.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        Intent intent = new Intent();
        String str = this.f361659a;
        if (str != null) {
            intent.putExtra("tabindex", str);
        }
        String str2 = this.f361660b;
        if (str2 != null) {
            intent.putExtra("filter", str2);
        }
        String str3 = this.f361661c;
        if (str3 != null) {
            intent.putExtra("entryPoint", str3);
        }
        intent.setClassName(this.f361662d.f361664a, "com.google.android.apps.search.assistant.verticals.recommend.RecommendActivity");
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
