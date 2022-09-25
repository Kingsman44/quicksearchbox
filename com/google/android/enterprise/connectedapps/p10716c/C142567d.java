package com.google.android.enterprise.connectedapps.p10716c;

import com.google.android.enterprise.connectedapps.C142555ao;
import com.google.android.enterprise.connectedapps.internal.C142581f;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.enterprise.connectedapps.c.d */
/* compiled from: PG */
final class C142567d implements C60845bz {

    /* renamed from: a */
    private final C142555ao f386857a;

    /* renamed from: b */
    private final C142581f f386858b;

    public C142567d(C142555ao aoVar, C142581f fVar) {
        aoVar.getClass();
        this.f386857a = aoVar;
        this.f386858b = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f386858b.mo117212b(this.f386857a);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C142581f fVar = this.f386858b;
        C142555ao aoVar = this.f386857a;
        synchronized (fVar.f386884a) {
            if (!fVar.f386885b) {
                if (!fVar.f386886c.containsKey(aoVar)) {
                    if (!fVar.f386887d.contains(aoVar)) {
                        fVar.f386886c.put(aoVar, obj);
                        fVar.mo117211a();
                    }
                }
            }
        }
    }
}
