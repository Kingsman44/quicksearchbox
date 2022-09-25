package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121493a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121494b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.d.d */
/* compiled from: PG */
public final /* synthetic */ class C121530d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121534h f337252a;

    /* renamed from: b */
    public final /* synthetic */ Duration f337253b;

    /* renamed from: c */
    public final /* synthetic */ C121502j f337254c;

    public /* synthetic */ C121530d(C121534h hVar, Duration duration, C121502j jVar) {
        this.f337252a = hVar;
        this.f337253b = duration;
        this.f337254c = jVar;
    }

    public final void run() {
        C121534h hVar = this.f337252a;
        Duration duration = this.f337253b;
        C121502j jVar = this.f337254c;
        long nanos = duration.toNanos();
        C121493a aVar = (C121493a) ((C121494b) jVar).f337167a;
        Object[] objArr = {aVar.f337165a, aVar.f337166b};
        double d = (double) nanos;
        Double.isNaN(d);
        ((C19569f) ((C39141kp) hVar.f337264a.mo27525b()).f102844ab.mo6453a()).mo24824b(d / 1000.0d, objArr);
    }
}
