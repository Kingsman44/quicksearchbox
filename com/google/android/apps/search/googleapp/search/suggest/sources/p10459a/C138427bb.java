package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137941aa;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bb */
/* compiled from: PG */
public final /* synthetic */ class C138427bb implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f376545a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f376546b;

    /* renamed from: c */
    public final /* synthetic */ Optional f376547c;

    public /* synthetic */ C138427bb(C60870cx cxVar, C60870cx cxVar2, Optional optional) {
        this.f376545a = cxVar;
        this.f376546b = cxVar2;
        this.f376547c = optional;
    }

    public final Object call() {
        C60870cx cxVar = this.f376545a;
        C60870cx cxVar2 = this.f376546b;
        Optional optional = this.f376547c;
        C137941aa aaVar = (C137941aa) C60856cj.m92909r(cxVar2);
        if ((((C137965y) C60856cj.m92909r(cxVar)).f375354a & 1) == 0 || ((aaVar.f375289a & 1) != 0 && !aaVar.f375290b)) {
            return Optional.empty();
        }
        return optional;
    }
}
