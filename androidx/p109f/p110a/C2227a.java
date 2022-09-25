package androidx.p109f.p110a;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: androidx.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C2227a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2234h f6287a;

    public /* synthetic */ C2227a(C2234h hVar) {
        this.f6287a = hVar;
    }

    public final void run() {
        C2228b bVar = this.f6287a.f6298c;
        bVar.f6288a.f6300e = SystemClock.uptimeMillis();
        C2234h hVar = bVar.f6288a;
        long j = hVar.f6300e;
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < hVar.f6297b.size(); i++) {
            C2229c cVar = (C2229c) hVar.f6297b.get(i);
            if (cVar != null) {
                Long l = (Long) hVar.f6296a.get(cVar);
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        hVar.f6296a.remove(cVar);
                    }
                }
                cVar.mo5574a(j);
            }
        }
        if (hVar.f6301f) {
            int size = hVar.f6297b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (hVar.f6297b.get(size) == null) {
                    hVar.f6297b.remove(size);
                }
            }
            if (hVar.f6297b.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                C2231e eVar = hVar.f6304i;
                ValueAnimator.unregisterDurationScaleChangeListener(eVar.f6290a);
                eVar.f6290a = null;
            }
            hVar.f6301f = false;
        }
        if (bVar.f6288a.f6297b.size() > 0) {
            C2234h hVar2 = bVar.f6288a;
            hVar2.f6303h.mo5577a(hVar2.f6299d);
        }
    }
}
