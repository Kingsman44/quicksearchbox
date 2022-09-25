package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.agc */
/* compiled from: PG */
final class agc extends agt {

    /* renamed from: a */
    final /* synthetic */ agt f20609a;

    public agc(agt agt) {
        this.f20609a = agt;
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        ArrayList arrayList = new ArrayList();
        alb.mo14822a();
        while (alb.mo14827e()) {
            arrayList.add(Long.valueOf(((Number) this.f20609a.read(alb)).longValue()));
        }
        alb.mo14823b();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        ald.mo14844b();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f20609a.write(ald, Long.valueOf(atomicLongArray.get(i)));
        }
        ald.mo14847d();
    }
}
