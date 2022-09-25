package com.google.android.gms.car.p10750a.p10751a;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.car.a.a.cz */
/* compiled from: PG */
final class C143056cz {

    /* renamed from: a */
    private final C143054cx f388131a;

    /* renamed from: b */
    private final C143055cy f388132b;

    /* renamed from: c */
    private Object f388133c = null;

    public C143056cz(C143054cx cxVar, C143055cy cyVar) {
        this.f388131a = cxVar;
        this.f388132b = cyVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo118005a() {
        Object obj = this.f388133c;
        if (obj != null) {
            try {
                this.f388132b.mo117920a(obj);
            } catch (RemoteException | IllegalStateException unused) {
            }
            this.f388133c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo118006b(C143055cy cyVar) {
        if (this.f388133c == null) {
            this.f388133c = this.f388131a.mo117924a();
        }
        cyVar.mo117920a(this.f388133c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo118007c(C143053cw cwVar) {
        Object obj = this.f388133c;
        if (obj != null) {
            cwVar.mo117969a(obj);
        }
    }
}
