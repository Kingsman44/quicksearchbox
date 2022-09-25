package com.google.android.apps.search.assistant.verticals.recommend.p10071b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.verticals.recommend.b.b */
/* compiled from: PG */
final class C132514b implements GatewayHandler {

    /* renamed from: c */
    private static final C59071e f361663c = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.recommend.b.b");

    /* renamed from: a */
    public final Context f361664a;

    /* renamed from: b */
    public final C32158h f361665b;

    /* renamed from: d */
    private final boolean f361666d;

    public C132514b(Context context, C32158h hVar, boolean z) {
        this.f361664a = context;
        this.f361665b = hVar;
        this.f361666d = z;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Uri data = mVar.f123337a.getData();
        if (data == null) {
            return null;
        }
        String scheme = data.getScheme();
        String host = data.getHost();
        String path = data.getPath();
        String queryParameter = data.getQueryParameter("tabindex");
        String queryParameter2 = data.getQueryParameter("filter");
        String queryParameter3 = data.getQueryParameter("entryPoint");
        if (path == null || host == null || scheme == null || !path.equals("/recommend") || !host.equals("assistant.google.com") || !scheme.equals("https")) {
            return null;
        }
        if (this.f361666d) {
            return new C132513a(this, queryParameter, queryParameter2, queryParameter3);
        }
        ((C59052c) ((C59052c) f361663c.mo56226d()).mo56372aa(39682)).mo56386p("RecommendDeeplink was called but was disabled.");
        return null;
    }
}
