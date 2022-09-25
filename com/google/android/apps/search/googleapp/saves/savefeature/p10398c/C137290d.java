package com.google.android.apps.search.googleapp.saves.savefeature.p10398c;

import android.content.Intent;
import android.net.Uri;
import android.util.Patterns;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.saves.savefeature.p10397b.C137282a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.nav.gateway.C47505k;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.regex.Matcher;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.c.d */
/* compiled from: PG */
final class C137290d implements C47506l {

    /* renamed from: a */
    final /* synthetic */ C47507m f373489a;

    /* renamed from: b */
    final /* synthetic */ C137291e f373490b;

    public C137290d(C137291e eVar, C47507m mVar) {
        this.f373490b = eVar;
        this.f373489a = mVar;
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
        return this.f373490b.f373492b.mo37970a();
    }

    /* renamed from: d */
    public final C60870cx mo20005d(C47505k kVar) {
        if (!"android.intent.action.SEND".equals(this.f373489a.f123337a.getAction())) {
            return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Unrecognized intent"));
        }
        Intent intent = this.f373489a.f123337a;
        AccountId accountId = kVar.f123336a;
        C59104x b = C137291e.f373491a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        ((C59052c) ((C59052c) b).mo56372aa(40950)).mo56386p("#SavesShareReceiverGatewayHandler.buildIntent()");
        String g = C58837ba.m90858g(intent.getStringExtra("android.intent.extra.TEXT"));
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        String str = g + "\n\n" + C58837ba.m90858g(stringExtra);
        C58480gp e = C58485gu.m89837e();
        Matcher matcher = Patterns.WEB_URL.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            if (group.startsWith("http")) {
                e.mo55395g(group);
            }
        }
        C58485gu f = e.mo55394f();
        C59104x b2 = C137289c.f373488a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
        C58724pq pqVar = (C58724pq) f;
        ((C59052c) ((C59052c) b2).mo56372aa(40947)).mo56387q("Found %s URLs from the shared payload.", pqVar.f156474d);
        if (pqVar.f156474d == 1) {
            String str2 = (String) f.get(0);
            if (str.startsWith(str2)) {
                C59104x b3 = C137289c.f373488a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
                ((C59052c) ((C59052c) b3).mo56372aa(40949)).mo56386p("Removing the URL from the beginning of the payload.");
                str = str.substring(str2.length()).trim();
            } else if (str.endsWith(str2)) {
                C59104x b4 = C137289c.f373488a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "SavesShareReceiver");
                ((C59052c) ((C59052c) b4).mo56372aa(40948)).mo56386p("Removing the URL from the end of the payload.");
                str = str.substring(0, str.length() - str2.length()).trim();
            }
        }
        C137284a aVar = new C137284a(str, f);
        return C60856cj.m92900i(GatewayHandler.GatewayDestination.m84514b(C137282a.m223048b(aVar.f373480a, Uri.parse((String) Collection.EL.stream(aVar.f373481b).findFirst().orElse(BuildConfig.FLAVOR)), 7, accountId).setAction("android.intent.action.SEND").putExtra("shareIntent", true).putExtra("android.intent.extra.STREAM", intent.getParcelableExtra("android.intent.extra.STREAM"))));
    }

    /* renamed from: e */
    public final /* synthetic */ GatewayHandler.GatewayDestination mo20006e() {
        return GatewayHandler.GatewayDestination.m84513a((String) null);
    }
}
