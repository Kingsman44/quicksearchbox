package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121493a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121494b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.d.f */
/* compiled from: PG */
public final /* synthetic */ class C121532f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C121534h f337257a;

    /* renamed from: b */
    public final /* synthetic */ Duration f337258b;

    /* renamed from: c */
    public final /* synthetic */ C121502j f337259c;

    /* renamed from: d */
    public final /* synthetic */ String f337260d;

    public /* synthetic */ C121532f(C121534h hVar, Duration duration, C121502j jVar, String str) {
        this.f337257a = hVar;
        this.f337258b = duration;
        this.f337259c = jVar;
        this.f337260d = str;
    }

    public final void run() {
        C121534h hVar = this.f337257a;
        Duration duration = this.f337258b;
        C121502j jVar = this.f337259c;
        String str = this.f337260d;
        long nanos = duration.toNanos();
        C121493a aVar = (C121493a) ((C121494b) jVar).f337167a;
        Object[] objArr = {aVar.f337165a, aVar.f337166b, str};
        double d = (double) nanos;
        Double.isNaN(d);
        ((C19569f) ((C39141kp) hVar.f337264a.mo27525b()).f102843aa.mo6453a()).mo24824b(d / 1000.0d, objArr);
    }
}
