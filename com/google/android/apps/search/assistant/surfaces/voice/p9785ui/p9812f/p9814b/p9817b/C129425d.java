package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9817b;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.platform.p9141h.p9167j.C121170d;
import com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.p9504a.C126879a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127117i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127118j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.C129569a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.C129410a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.b.d */
/* compiled from: PG */
public final class C129425d implements C129410a {

    /* renamed from: a */
    public static final C59071e f355372a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f355373b;

    /* renamed from: c */
    public final Executor f355374c;

    /* renamed from: d */
    public final C126879a f355375d;

    /* renamed from: e */
    public final C127118j f355376e;

    /* renamed from: f */
    public final C129569a f355377f;

    /* renamed from: g */
    private final C121170d f355378g;

    public C129425d(Context context, Executor executor, C126879a aVar, C121170d dVar, C127118j jVar, C129569a aVar2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(dVar, "screenContextOptInReadAccessor");
        C69664n.m101061g(aVar2, "assistDataAccessor");
        this.f355373b = context;
        this.f355374c = executor;
        this.f355375d = aVar;
        this.f355378g = dVar;
        this.f355376e = jVar;
        this.f355377f = aVar2;
    }

    /* renamed from: a */
    public final void mo109027a() {
        if (!C129429h.m211310a(this.f355373b, "assist_structure_enabled") || !C129429h.m211310a(this.f355373b, "assist_screenshot_enabled")) {
            C59052c cVar = (C59052c) f355372a.mo56224b();
            cVar.mo56379ah(new C59094n(38551));
            cVar.mo56386p("Opening Digital Assistant App settings");
            Intent flags = new Intent("android.settings.VOICE_INPUT_SETTINGS").setFlags(268435456);
            C69664n.m101060f(flags, "Intent(Settings.ACTION_V…t.FLAG_ACTIVITY_NEW_TASK)");
            this.f355375d.mo20101f(flags);
            C127117i.m207897a(this.f355376e);
            return;
        }
        C60870cx a = this.f355378g.mo105068a();
        C129424c cVar2 = new C129424c(this);
        C60856cj.m92911t(a, C47810es.m84974n(cVar2), this.f355374c);
    }
}
