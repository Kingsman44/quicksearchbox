package com.google.android.gms.cast.framework.internal;

/* renamed from: com.google.android.gms.cast.framework.internal.z */
/* compiled from: PG */
public final /* synthetic */ class C143462z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143437ac f389016a;

    public /* synthetic */ C143462z(C143437ac acVar) {
        this.f389016a = acVar;
    }

    public final void run() {
        C143437ac acVar = this.f389016a;
        C143437ac.f388967a.mo118888f("transfer with type = %d has timed out", Integer.valueOf(acVar.f388971e));
        acVar.mo118641b(101);
    }
}
