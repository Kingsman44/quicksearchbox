package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dx */
/* compiled from: PG */
final class C122852dx {

    /* renamed from: a */
    final C122461p f340273a;

    /* renamed from: b */
    final C60870cx f340274b;

    /* renamed from: c */
    final C123001av f340275c;

    /* renamed from: d */
    final int f340276d;

    /* renamed from: e */
    public int f340277e = 1;

    /* renamed from: f */
    public boolean f340278f = false;

    /* renamed from: g */
    public final C122561k f340279g;

    public C122852dx(C122461p pVar, C60870cx cxVar, C122561k kVar, C123001av avVar, int i) {
        this.f340273a = pVar;
        this.f340274b = cxVar;
        this.f340279g = kVar;
        this.f340275c = avVar;
        this.f340276d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo105761a() {
        int i = this.f340277e - 1;
        this.f340277e = i;
        if (i == 0) {
            this.f340278f = true;
            this.f340279g.f339696a = true;
            this.f340274b.cancel(false);
        }
    }
}
