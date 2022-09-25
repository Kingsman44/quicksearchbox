package com.google.p386ak;

import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.ak.g */
/* compiled from: PG */
final class C8391g extends C8266aa {

    /* renamed from: a */
    final /* synthetic */ C8266aa f29243a;

    public C8391g(C8266aa aaVar) {
        this.f29243a = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.mo17119j();
        while (aVar.mo17125p()) {
            arrayList.add(Long.valueOf(((Number) this.f29243a.mo17029a(aVar)).longValue()));
        }
        aVar.mo17121l();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        cVar.mo17131c();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.f29243a.mo17030b(cVar, Long.valueOf(atomicLongArray.get(i)));
        }
        cVar.mo17134e();
    }
}
