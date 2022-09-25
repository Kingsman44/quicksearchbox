package com.google.android.apps.search.podcasts.p10601r.p10602a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.a.c */
/* compiled from: PG */
public final class C140957c {

    /* renamed from: a */
    public static final C59071e f382714a = C59071e.m91331h();

    /* renamed from: b */
    public final C140459au f382715b;

    /* renamed from: c */
    public final C47770dh f382716c;

    /* renamed from: d */
    private final boolean f382717d;

    /* renamed from: e */
    private boolean f382718e;

    public C140957c(boolean z, C140459au auVar, C47770dh dhVar) {
        C69664n.m101061g(auVar, "syncablePreferences");
        C69664n.m101061g(dhVar, "traceCreation");
        this.f382717d = z;
        this.f382715b = auVar;
        this.f382716c = dhVar;
    }

    /* renamed from: a */
    public final void mo116042a(Fragment fragment) {
        if (!this.f382718e && this.f382717d) {
            this.f382718e = true;
            C60870cx c = this.f382715b.mo115678c();
            C69664n.m101060f(c, "syncablePreferences.preference");
            C140989k.m228950h(c, new C140956b(fragment, this));
        }
    }
}
