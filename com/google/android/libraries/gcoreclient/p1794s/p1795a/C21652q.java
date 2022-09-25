package com.google.android.libraries.gcoreclient.p1794s.p1795a;

import com.google.android.gms.mdh.C145078l;
import com.google.android.libraries.p10923ac.p10948d.p10949a.p10950a.p10952b.C147223g;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.s.a.q */
/* compiled from: PG */
public final class C21652q {

    /* renamed from: a */
    public final C145078l f60002a;

    /* renamed from: b */
    private final WeakHashMap f60003b = new WeakHashMap();

    public C21652q(C145078l lVar) {
        this.f60002a = lVar;
    }

    /* renamed from: a */
    public final C21651p mo27042a(C147223g gVar) {
        C21651p pVar;
        synchronized (this.f60003b) {
            WeakReference weakReference = (WeakReference) this.f60003b.get(gVar);
            if (weakReference == null) {
                pVar = null;
            } else {
                pVar = (C21651p) weakReference.get();
            }
            if (pVar == null) {
                pVar = new C21651p(gVar);
                this.f60003b.put(gVar, new WeakReference(pVar));
            }
        }
        return pVar;
    }
}
