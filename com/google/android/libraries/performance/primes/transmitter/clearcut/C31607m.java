package com.google.android.libraries.performance.primes.transmitter.clearcut;

import android.content.Context;
import com.google.android.libraries.performance.primes.transmitter.C31616h;
import com.google.android.libraries.performance.primes.transmitter.C31617i;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.m */
/* compiled from: PG */
public final /* synthetic */ class C31607m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C31610p f85073a;

    /* renamed from: b */
    public final /* synthetic */ C71308ej f85074b;

    public /* synthetic */ C31607m(C31610p pVar, C71308ej ejVar) {
        this.f85073a = pVar;
        this.f85074b = ejVar;
    }

    public final C60870cx apply(Object obj) {
        C31610p pVar = this.f85073a;
        C71308ej ejVar = this.f85074b;
        ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = pVar.f85078b;
        Context context = pVar.f85077a;
        C31616h hVar = (C31616h) ((C31617i) obj).toBuilder();
        hVar.copyOnWrite();
        C31617i iVar = (C31617i) hVar.instance;
        ejVar.getClass();
        iVar.f85089b = ejVar;
        iVar.f85088a |= 1;
        return clearcutMetricSnapshotTransmitter.mo37272a(context, (C31617i) hVar.build());
    }
}
