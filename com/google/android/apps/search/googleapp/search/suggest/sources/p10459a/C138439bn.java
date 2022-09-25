package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.apps.search.googleapp.search.suggest.C138678v;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bn */
/* compiled from: PG */
public final /* synthetic */ class C138439bn implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376565a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f376566b;

    /* renamed from: c */
    public final /* synthetic */ C138133o f376567c;

    /* renamed from: d */
    public final /* synthetic */ long f376568d;

    public /* synthetic */ C138439bn(C138445bt btVar, C60870cx cxVar, C138133o oVar, long j) {
        this.f376565a = btVar;
        this.f376566b = cxVar;
        this.f376567c = oVar;
        this.f376568d = j;
    }

    public final Object apply(Object obj) {
        Duration duration;
        C138445bt btVar = this.f376565a;
        C60870cx cxVar = this.f376566b;
        C138133o oVar = this.f376567c;
        long j = this.f376568d;
        C138678v vVar = (C138678v) obj;
        if (!cxVar.isDone() && ((long) vVar.f377199c.size()) >= btVar.f376592o) {
            if (oVar.f375825b.length() == 1) {
                duration = btVar.f376591n;
            } else {
                duration = btVar.f376590m;
            }
            C46459k.m82829b(btVar.f376584g.mo29164d(new C138440bo(btVar, cxVar), Math.max(duration.minusMillis(btVar.f376587j.mo26871c() - j).toMillis(), 0), TimeUnit.MILLISECONDS), "Failed to schedule cancelling the Complete Server request.", new Object[0]);
        }
        return vVar;
    }
}
