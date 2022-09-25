package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.cp */
/* compiled from: PG */
public final /* synthetic */ class C138468cp implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138471cs f376641a;

    /* renamed from: b */
    public final /* synthetic */ Duration f376642b;

    public /* synthetic */ C138468cp(C138471cs csVar, Duration duration) {
        this.f376641a = csVar;
        this.f376642b = duration;
    }

    public final C60870cx apply(Object obj) {
        C138471cs csVar = this.f376641a;
        Duration duration = this.f376642b;
        if (((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C138454cb cbVar = csVar.f376645a;
        return cbVar.f376613d.mo29164d(C47810es.m84977q(new C138448bw(cbVar)), duration.toMillis(), TimeUnit.MILLISECONDS);
    }
}
