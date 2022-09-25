package com.google.android.apps.search.assistant.verticals.reminders.p10078d;

import android.net.Uri;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.d.e */
/* compiled from: PG */
final class C132554e implements GatewayHandler {

    /* renamed from: a */
    private final boolean f361732a;

    public C132554e(boolean z) {
        this.f361732a = z;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Uri data;
        String scheme;
        String host;
        if (!this.f361732a || (data = mVar.f123337a.getData()) == null || (scheme = data.getScheme()) == null || !scheme.equals("https") || (host = data.getHost()) == null || !host.equals("shoppinglist.google.com")) {
            return null;
        }
        return new C132553d();
    }
}
