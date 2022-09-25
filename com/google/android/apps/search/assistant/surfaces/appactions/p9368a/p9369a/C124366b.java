package com.google.android.apps.search.assistant.surfaces.appactions.p9368a.p9369a;

import android.content.Context;
import android.net.Uri;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.android.apps.search.assistant.surfaces.appactions.a.a.b */
/* compiled from: PG */
final class C124366b implements GatewayHandler {

    /* renamed from: a */
    public final Context f343274a;

    public C124366b(Context context) {
        this.f343274a = context;
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
        if (scheme == null || host == null || path == null) {
            return null;
        }
        if ((scheme.equals("https") || scheme.equals("http")) && host.equals("assistant.google.com") && path.startsWith("/shortcuts")) {
            return new C124365a(this, data);
        }
        return null;
    }
}
