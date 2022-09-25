package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity;

import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.monitoring.feedback.C47465c;
import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.monitoring.feedback.C47475l;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity.j */
/* compiled from: PG */
public final class C126895j implements C45987ay {

    /* renamed from: a */
    public final TransparentTngActivity f349399a;

    /* renamed from: b */
    private final C45989b f349400b;

    /* renamed from: c */
    private final C47477n f349401c;

    public C126895j(TransparentTngActivity transparentTngActivity, C45989b bVar, C47477n nVar) {
        C69664n.m101061g(bVar, "accountController");
        this.f349399a = transparentTngActivity;
        this.f349400b = bVar;
        this.f349401c = nVar;
        bVar.mo50082e(this);
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C47474k g = C47475l.m84477g();
        ((C47465c) g).f123249a = "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK";
        C47475l e = g.mo51332e();
        C69664n.m101060f(e, "builder()\n        .setCa…EDBACK\")\n        .build()");
        this.f349401c.mo51336a(e);
        this.f349399a.finish();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C69664n.m101061g(th, "reason");
        this.f349399a.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }
}
