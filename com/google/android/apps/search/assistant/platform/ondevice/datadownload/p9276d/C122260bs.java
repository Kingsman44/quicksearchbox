package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.bs */
/* compiled from: PG */
final class C122260bs {

    /* renamed from: a */
    public final String f339010a;

    /* renamed from: b */
    public final Locale f339011b;

    /* renamed from: c */
    public final C58833ax f339012c;

    /* renamed from: d */
    public volatile Optional f339013d = Optional.empty();

    /* renamed from: e */
    public volatile long f339014e = 0;

    /* renamed from: f */
    public volatile C17072q f339015f = C17072q.READY_TO_DOWNLOAD;

    /* renamed from: g */
    public volatile String f339016g = null;

    /* renamed from: h */
    final /* synthetic */ C122261bt f339017h;

    public C122260bs(C122261bt btVar, String str, Locale locale, C58833ax axVar) {
        this.f339017h = btVar;
        this.f339010a = str;
        this.f339011b = locale;
        this.f339012c = axVar;
    }

    /* renamed from: b */
    public static final String m201773b(Throwable th) {
        return String.format("%s (%s)", new Object[]{th.getClass().getSimpleName(), th.getMessage()});
    }

    /* renamed from: a */
    public final C60870cx mo105578a(C60870cx cxVar, Consumer consumer, Consumer consumer2) {
        return C47633f.m84733g(cxVar).mo51514f(Exception.class, new C122252bk(consumer2), this.f339017h.f339020c).mo51515h(new C122253bl(consumer), this.f339017h.f339020c);
    }
}
