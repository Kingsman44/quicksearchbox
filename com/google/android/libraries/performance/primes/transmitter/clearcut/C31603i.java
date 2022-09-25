package com.google.android.libraries.performance.primes.transmitter.clearcut;

import com.google.android.gms.usagereporting.C146099k;
import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.i */
/* compiled from: PG */
public final /* synthetic */ class C31603i implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ ClearcutMetricSnapshotTransmitter f85070a;

    public /* synthetic */ C31603i(ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter) {
        this.f85070a = clearcutMetricSnapshotTransmitter;
    }

    public final Object apply(Object obj) {
        ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter = this.f85070a;
        boolean a = ((C146099k) obj).mo122610a();
        AtomicReference atomicReference = clearcutMetricSnapshotTransmitter.f85037d;
        Boolean valueOf = Boolean.valueOf(a);
        atomicReference.set(valueOf);
        return valueOf;
    }
}
