package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8406v;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.ak.b.a.u */
/* compiled from: PG */
final class C8321u extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.mo17119j();
        while (aVar.mo17125p()) {
            try {
                arrayList.add(Integer.valueOf(aVar.mo17111c()));
            } catch (NumberFormatException e) {
                throw new C8406v((Throwable) e);
            }
        }
        aVar.mo17121l();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        cVar.mo17131c();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            cVar.mo17139i((long) atomicIntegerArray.get(i));
        }
        cVar.mo17134e();
    }
}
