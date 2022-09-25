package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajk */
/* compiled from: PG */
final class ajk extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        ArrayList arrayList = new ArrayList();
        alb.mo14822a();
        while (alb.mo14827e()) {
            try {
                arrayList.add(Integer.valueOf(alb.mo14834l()));
            } catch (NumberFormatException e) {
                throw new agq((Throwable) e);
            }
        }
        alb.mo14823b();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        ald.mo14844b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            ald.mo14852h((long) atomicIntegerArray.get(i));
        }
        ald.mo14847d();
    }
}
