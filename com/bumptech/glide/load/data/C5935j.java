package com.bumptech.glide.load.data;

import com.bumptech.glide.p291h.C5630q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.j */
/* compiled from: PG */
public final class C5935j {

    /* renamed from: a */
    private static final C5931f f17586a = new C5933h();

    /* renamed from: b */
    private final Map f17587b = new HashMap();

    /* renamed from: a */
    public final synchronized C5932g mo12387a(Object obj) {
        C5931f fVar;
        C5630q.m14607d(obj, "Argument must not be null");
        fVar = (C5931f) this.f17587b.get(obj.getClass());
        if (fVar == null) {
            Iterator it = this.f17587b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5931f fVar2 = (C5931f) it.next();
                if (fVar2.mo12337b().isAssignableFrom(obj.getClass())) {
                    fVar = fVar2;
                    break;
                }
            }
        }
        if (fVar == null) {
            fVar = f17586a;
        }
        return fVar.mo12336a(obj);
    }

    /* renamed from: b */
    public final synchronized void mo12388b(C5931f fVar) {
        this.f17587b.put(fVar.mo12337b(), fVar);
    }
}
