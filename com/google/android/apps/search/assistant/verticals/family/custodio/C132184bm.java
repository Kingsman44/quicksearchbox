package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Intent;
import android.os.Bundle;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bm */
/* compiled from: PG */
final class C132184bm implements C47506l {

    /* renamed from: a */
    final /* synthetic */ String f360794a;

    /* renamed from: b */
    final /* synthetic */ String f360795b;

    /* renamed from: c */
    final /* synthetic */ String f360796c;

    /* renamed from: d */
    final /* synthetic */ String f360797d;

    /* renamed from: e */
    final /* synthetic */ String f360798e;

    /* renamed from: f */
    final /* synthetic */ C132185bn f360799f;

    public C132184bm(C132185bn bnVar, String str, String str2, String str3, String str4, String str5) {
        this.f360799f = bnVar;
        this.f360794a = str;
        this.f360795b = str2;
        this.f360796c = str3;
        this.f360797d = str4;
        this.f360798e = str5;
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
        ((C59052c) ((C59052c) C132185bn.f360800a.mo56224b()).mo56372aa(39536)).mo56386p("getOptionalGatewayAccountConfig called");
        return this.f360799f.f360802c.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        ((C59052c) ((C59052c) C132185bn.f360800a.mo56224b()).mo56372aa(39537)).mo56386p("getRedirectIntent called");
        Intent intent = new Intent(this.f360799f.f360801b, CustodioActivity.class);
        intent.putExtra("account_name", this.f360794a);
        intent.putExtra("entry_point_id", this.f360795b);
        String str = this.f360796c;
        if (str != null) {
            intent.putExtra("supervised_oid", str);
        }
        if (!(this.f360797d == null && this.f360798e == null)) {
            Bundle bundle = new Bundle();
            String str2 = this.f360798e;
            if (str2 != null) {
                bundle.putString("cast_device_id", str2);
            } else {
                bundle.putString("libassistant_device_id", this.f360797d);
            }
            intent.putExtra("device_id", bundle);
        }
        C45963aa.m82131a(intent, kVar.f123336a);
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(intent));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
