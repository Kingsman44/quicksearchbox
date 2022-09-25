package com.google.android.apps.search.googleapp.startup.p10514a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60872cz;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.googleapp.startup.a.c */
/* compiled from: PG */
public final /* synthetic */ class C139674c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C139675d f379651a;

    public /* synthetic */ C139674c(C139675d dVar) {
        this.f379651a = dVar;
    }

    public final void run() {
        C139675d dVar = this.f379651a;
        Duration duration = C139676e.f379659a;
        C47558bi a = C47831fm.m85006a("FirstDrawRunner#schedule");
        try {
            C60872cz d = dVar.f379654c.mo29164d(C47810es.m84977q(new C139673b(dVar)), dVar.f379657f.toMillis(), TimeUnit.MILLISECONDS);
            a.mo51417a(d);
            C46459k.m82829b(d, "Failed to execute FirstDrawRunner after onPreDraw()", new Object[0]);
            a.close();
            return;
        } catch (Throwable th) {
            C139672a.m227100a(th, th);
        }
        throw th;
    }
}
