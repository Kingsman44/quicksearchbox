package com.google.android.apps.search.assistant.surfaces.voice.deeplinks.p9585b.p9586a.p9587a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.voice.deeplinks.deeplinktrampolineactivity.DeeplinkTrampolineActivity;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.b */
/* compiled from: PG */
public final class C127385b implements GatewayHandler {

    /* renamed from: a */
    public static final C59071e f350777a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.deeplinks.b.a.a.b");

    /* renamed from: b */
    public static final C60870cx f350778b = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("Unsupported Deeplink URL for MA"));

    /* renamed from: c */
    public static final C60870cx f350779c = C60856cj.m92900i(GatewayHandler.GatewayDestination.m84513a("URL not found"));

    /* renamed from: d */
    public final boolean f350780d;

    /* renamed from: e */
    public final Map f350781e;

    /* renamed from: f */
    public final C32158h f350782f;

    /* renamed from: g */
    private final Context f350783g;

    public C127385b(Context context, Map map, C32158h hVar, boolean z) {
        this.f350783g = context;
        this.f350781e = map;
        this.f350782f = hVar;
        this.f350780d = z;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        return new C127384a(this, mVar);
    }

    /* renamed from: b */
    public final Intent mo108041b(Uri uri) {
        ((C59052c) ((C59052c) f350777a.mo56224b()).mo56372aa(37452)).mo56386p("Create intent to route deeplink to AGSA-C deeplink activity.");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setClassName(this.f350783g, "com.google.android.apps.gsa.deeplink.DeeplinkActivityEntrypoint");
        return intent;
    }

    /* renamed from: c */
    public final Intent mo108042c(Uri uri, String str, boolean z) {
        ((C59052c) ((C59052c) f350777a.mo56224b()).mo56372aa(37453)).mo56386p("Create intent to route deeplink to MA:TNG.");
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_DEEPLINK_URL", uri.toString());
        bundle.putString("EXTRA_CALLING_PACKAGE", str);
        bundle.putBoolean("EXTRA_IS_LEGACY_PC_DEEPLINK", z);
        return new Intent().setClass(this.f350783g, DeeplinkTrampolineActivity.class).putExtras(bundle).setFlags(268435456);
    }
}
