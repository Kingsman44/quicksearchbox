package com.google.android.apps.gsa.staticplugins.p7674cj.p7675a;

import android.content.ComponentName;
import android.content.Intent;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.cj.a.c */
/* compiled from: PG */
public final /* synthetic */ class C97857c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97864j f273259a;

    /* renamed from: b */
    public final /* synthetic */ long f273260b;

    public /* synthetic */ C97857c(C97864j jVar, long j) {
        this.f273259a = jVar;
        this.f273260b = j;
    }

    public final C60870cx apply(Object obj) {
        C97864j jVar = this.f273259a;
        long j = this.f273260b;
        String str = (String) obj;
        if (str == null || str.isEmpty()) {
            return C60856cj.m92899h(new IllegalStateException("Account is missing."));
        }
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gmm.TIMELINE_POST_VISIT_BADGE");
        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.apps.gmm.place.timeline.service.postvisitbadge.PostVisitBadgeService"));
        return jVar.f273275c.mo28202b("bindRunner", new C97863i(jVar, intent, new C97855a(str, j)));
    }
}
