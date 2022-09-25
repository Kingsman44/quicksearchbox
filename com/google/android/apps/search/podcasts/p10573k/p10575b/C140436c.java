package com.google.android.apps.search.podcasts.p10573k.p10575b;

import android.content.Context;
import android.os.Build;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140133ai;
import com.google.android.apps.search.podcasts.p10550b.p10557g.C140152p;
import com.google.android.apps.search.podcasts.p10576l.C140498j;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.k.b.c */
/* compiled from: PG */
public final class C140436c {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f381476a = C59071e.m91331h();

    /* renamed from: b */
    public final C140498j f381477b;

    /* renamed from: c */
    private final C140133ai f381478c;

    /* renamed from: d */
    private final boolean f381479d;

    public C140436c(C140498j jVar, C140133ai aiVar, boolean z) {
        C69664n.m101061g(jVar, "devicePreferencesManager");
        C69664n.m101061g(aiVar, "favoritesManager");
        this.f381477b = jVar;
        this.f381478c = aiVar;
        this.f381479d = z;
    }

    /* renamed from: a */
    public final void mo115673a(Context context) {
        C69664n.m101061g(context, "context");
        if (this.f381479d && Build.VERSION.SDK_INT > 31) {
            C46459k.m82829b(C140989k.m228945c(C47633f.m84733g(this.f381478c.mo115472c()).mo51515h(C140152p.f380815a, C60826bg.f164896a), new C140435b(this, context)), "Failed to retrieve promptedForNotificationPermission value.", new Object[0]);
        }
    }
}
