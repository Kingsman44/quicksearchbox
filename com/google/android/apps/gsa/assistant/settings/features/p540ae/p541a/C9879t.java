package com.google.android.apps.gsa.assistant.settings.features.p540ae.p541a;

import com.google.apps.tiktok.cache.C46407v;
import com.google.assistant.p3861at.C50284rj;
import com.google.assistant.p3861at.acv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.a.t */
/* compiled from: PG */
public final /* synthetic */ class C9879t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C9882w f33914a;

    /* renamed from: b */
    public final /* synthetic */ acv f33915b;

    public /* synthetic */ C9879t(C9882w wVar, acv acv) {
        this.f33914a = wVar;
        this.f33915b = acv;
    }

    public final C60870cx apply(Object obj) {
        C9882w wVar = this.f33914a;
        acv acv = this.f33915b;
        C46407v vVar = (C46407v) obj;
        C50284rj rjVar = acv.f128931J;
        if (rjVar == null) {
            rjVar = C50284rj.f130766f;
        }
        C9885z zVar = wVar.f33920c;
        return vVar.mo50346f(rjVar, C60922j.m93044g(zVar.f33927b.mo17841f(acv, TimeUnit.SECONDS), new C9867h(zVar), C60826bg.f164896a));
    }
}
