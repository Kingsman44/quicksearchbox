package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.app.Activity;
import android.content.Intent;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.r */
/* compiled from: PG */
class C126731r implements C46792di {

    /* renamed from: a */
    final /* synthetic */ Activity f349019a;

    /* renamed from: b */
    final /* synthetic */ C126732s f349020b;

    public C126731r(C126732s sVar, Activity activity) {
        this.f349020b = sVar;
        this.f349019a = activity;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126732s.f349021a.mo56225c()).mo56382g(th)).mo56372aa(37111)).mo56386p("Not able to get the hotword intent.");
        C126728o.m207279d(this.f349020b.f349022b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        Intent intent = (Intent) obj;
        if (intent.getComponent() != null) {
            C45250g.m80605a(this.f349019a.getIntent(), intent);
            this.f349020b.f349022b.startActivityForResult(intent, 1000);
            return;
        }
        C126728o.m207279d(this.f349020b.f349022b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
