package com.google.android.apps.search.googleapp.notifications.settings.receiver;

import android.content.Intent;
import com.google.android.apps.search.googleapp.notifications.settings.p10366a.C136779b;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.settings.receiver.a */
/* compiled from: PG */
public final class C136782a implements C47102r {

    /* renamed from: a */
    private final C136779b f372336a;

    public C136782a(C136779b bVar) {
        this.f372336a = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        C69664n.m101061g(intent, "intent");
        String action = intent.getAction();
        if (action != null && action.hashCode() == 452039370 && action.equals("android.app.action.APP_BLOCK_STATE_CHANGED")) {
            this.f372336a.f372327c.mo50787a(C47633f.m84733g(C60866ct.f164955a), C136779b.f372325a);
        }
        C47633f g = C47633f.m84733g(C60866ct.f164955a);
        C69664n.m101060f(g, "immediateFuture(null)");
        return g;
    }
}
