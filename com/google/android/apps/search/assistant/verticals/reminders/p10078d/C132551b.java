package com.google.android.apps.search.assistant.verticals.reminders.p10078d;

import android.net.Uri;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;

/* renamed from: com.google.android.apps.search.assistant.verticals.reminders.d.b */
/* compiled from: PG */
final class C132551b implements GatewayHandler {

    /* renamed from: a */
    private final boolean f361731a;

    public C132551b(boolean z) {
        this.f361731a = z;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        Uri data;
        String scheme;
        String host;
        String path;
        if (!this.f361731a || (data = mVar.f123337a.getData()) == null || (scheme = data.getScheme()) == null || !scheme.equals("https") || (host = data.getHost()) == null || !host.equals("assistant.google.com") || (path = data.getPath()) == null || (!path.startsWith("/reminders/mainview") && !path.startsWith("/reminders/id") && !path.startsWith("/reminders/move"))) {
            return null;
        }
        return new C132550a(data);
    }
}
