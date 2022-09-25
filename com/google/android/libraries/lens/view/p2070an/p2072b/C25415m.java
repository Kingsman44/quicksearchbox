package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.util.Log;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.an.b.m */
/* compiled from: PG */
public final /* synthetic */ class C25415m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C25417o f69259a;

    /* renamed from: b */
    public final /* synthetic */ long f69260b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f69261c;

    public /* synthetic */ C25415m(C25417o oVar, long j, C60870cx cxVar) {
        this.f69259a = oVar;
        this.f69260b = j;
        this.f69261c = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C25417o oVar = this.f69259a;
        long j = this.f69260b;
        C60870cx cxVar = this.f69261c;
        C58976aa aaVar = C58975e.f156826a;
        long e = oVar.f69270f.mo26873e();
        if (Log.isLoggable("ServerImagePreprocessor", 3)) {
            Duration.ofNanos(e - j).toMillis();
        }
        C60870cx a = oVar.f69269e.mo32035a((Bitmap) C60856cj.m92909r(cxVar));
        if (Log.isLoggable("ServerImagePreprocessor", 3)) {
            C25416n nVar = new C25416n(oVar, e);
            C60856cj.m92911t(a, C47810es.m84974n(nVar), C60826bg.f164896a);
        }
        return a;
    }
}
