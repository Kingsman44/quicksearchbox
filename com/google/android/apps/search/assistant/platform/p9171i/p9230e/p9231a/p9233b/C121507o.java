package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import android.databinding.C0118a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121490a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58979ad;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.o */
/* compiled from: PG */
final class C121507o implements C121492b {

    /* renamed from: a */
    final /* synthetic */ C58872ci f337195a;

    /* renamed from: b */
    final /* synthetic */ C121501i f337196b;

    /* renamed from: c */
    final /* synthetic */ Instant f337197c;

    public C121507o(C58872ci ciVar, C121501i iVar, Instant instant) {
        this.f337195a = ciVar;
        this.f337196b = iVar;
        this.f337197c = instant;
    }

    /* renamed from: a */
    public final void mo105188a(String str) {
        C58872ci ciVar = this.f337195a;
        if (!ciVar.f156708a) {
            C0118a.m96d(C121510r.f337203a.mo56226d(), "Async span closed more than once, event ignored.", 35845, C58979ad.MEDIUM);
            return;
        }
        ciVar.mo56162g();
        C121499g.m200777c(this.f337196b, this.f337197c, Duration.ofNanos(this.f337195a.mo56159b()), str);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo105189b() {
        C121490a.m200746a(this);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo105190c() {
        C121490a.m200747b(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo105191d() {
        C121490a.m200748c(this);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo105192e() {
        C121490a.m200749d(this);
    }
}
