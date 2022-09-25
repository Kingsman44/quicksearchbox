package com.bumptech.glide.load.p293a.p295b;

import com.bumptech.glide.p291h.C5630q;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.a.b.f */
/* compiled from: PG */
final class C5690f {

    /* renamed from: a */
    public final Map f17153a = new HashMap();

    /* renamed from: b */
    public final C5689e f17154b = new C5689e();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12194a(String str) {
        C5688d dVar;
        synchronized (this) {
            dVar = (C5688d) this.f17153a.get(str);
            C5630q.m14607d(dVar, "Argument must not be null");
            int i = dVar.f17151b;
            if (i > 0) {
                int i2 = i - 1;
                dVar.f17151b = i2;
                if (i2 == 0) {
                    C5688d dVar2 = (C5688d) this.f17153a.remove(str);
                    if (dVar2.equals(dVar)) {
                        C5689e eVar = this.f17154b;
                        synchronized (eVar.f17152a) {
                            if (eVar.f17152a.size() < 10) {
                                eVar.f17152a.offer(dVar2);
                            }
                        }
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + dVar.toString() + ", but actually removed: " + String.valueOf(dVar2) + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + i);
            }
        }
        dVar.f17150a.unlock();
    }
}
