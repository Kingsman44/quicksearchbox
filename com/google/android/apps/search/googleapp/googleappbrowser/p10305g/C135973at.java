package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import com.google.android.apps.gsa.p8867w.p8879i.C118809j;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135475u;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44074i;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46719bc;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.at */
/* compiled from: PG */
public final class C135973at {

    /* renamed from: a */
    public final C46723bg f370315a;

    /* renamed from: b */
    public final C135475u f370316b;

    /* renamed from: c */
    public final C46778cv f370317c;

    /* renamed from: d */
    public final Executor f370318d;

    /* renamed from: e */
    public final C44070e f370319e;

    /* renamed from: f */
    public final C118809j f370320f;

    /* renamed from: g */
    private final C44074i f370321g;

    public C135973at(C118809j jVar, C46723bg bgVar, C135475u uVar, C44074i iVar, Executor executor, C44070e eVar, C46778cv cvVar) {
        this.f370320f = jVar;
        this.f370315a = bgVar;
        this.f370316b = uVar;
        this.f370317c = cvVar;
        this.f370321g = iVar;
        this.f370318d = executor;
        this.f370319e = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C46689ag mo112652a() {
        return new C46719bc(this.f370315a, new C135956ac(this), "additional_safe_browsing_settings_enabled_content_key");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C46689ag mo112653b() {
        return new C46719bc(this.f370315a, new C135960ag(this), "open_pages_in_google_app_content_key");
    }

    /* renamed from: c */
    public final C46689ag mo112654c() {
        return new C46719bc(this.f370315a, new C135958ae(this), "should_show_browsing_settings_content_key");
    }

    /* renamed from: d */
    public final C60870cx mo112655d() {
        C60870cx b = this.f370321g.mo47042b(C43271v.WEB_LAYER);
        C135957ad adVar = new C135957ad(this);
        return C60922j.m93044g(b, C47810es.m84963c(adVar), this.f370318d);
    }

    /* renamed from: e */
    public final C60870cx mo112656e() {
        C60870cx d = mo112655d();
        C135967an anVar = C135967an.f370309a;
        return C60922j.m93045h(d, C47810es.m84966f(anVar), this.f370318d);
    }
}
