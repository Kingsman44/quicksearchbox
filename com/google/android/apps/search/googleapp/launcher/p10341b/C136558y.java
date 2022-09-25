package com.google.android.apps.search.googleapp.launcher.p10341b;

import androidx.lifecycle.C2383n;
import com.google.apps.tiktok.tracing.C47810es;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.y */
/* compiled from: PG */
public final /* synthetic */ class C136558y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C136433ae f371795a;

    /* renamed from: b */
    public final /* synthetic */ int f371796b;

    public /* synthetic */ C136558y(C136433ae aeVar, int i) {
        this.f371795a = aeVar;
        this.f371796b = i;
    }

    public final void run() {
        C136433ae aeVar = this.f371795a;
        int i = this.f371796b;
        ScheduledFuture scheduledFuture = aeVar.f371421h;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            aeVar.f371421h.cancel(true);
        }
        int i2 = i & 2;
        C2383n nVar = C2383n.CREATED;
        if ((i & 1) != 0) {
            nVar = C2383n.STARTED;
        }
        if (i2 != 0) {
            nVar = C2383n.RESUMED;
        }
        if (!nVar.mo5788a(C2383n.STARTED) || nVar.mo5788a(C2383n.RESUMED) || !aeVar.f371419f.mo5788a(C2383n.RESUMED)) {
            aeVar.mo113031v(nVar);
        } else {
            aeVar.f371421h = aeVar.f371424k.schedule(C47810es.m84977q(new C136429aa(aeVar, nVar)), C136433ae.f371415b.toMillis(), TimeUnit.MILLISECONDS);
        }
    }
}
