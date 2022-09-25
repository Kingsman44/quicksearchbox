package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.ah */
/* compiled from: PG */
public final /* synthetic */ class C143350ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388768a;

    /* renamed from: b */
    public final /* synthetic */ int f388769b;

    public /* synthetic */ C143350ah(C143353ak akVar, int i) {
        this.f388768a = akVar;
        this.f388769b = i;
    }

    public final void run() {
        C143353ak akVar = this.f388768a;
        int i = this.f388769b;
        C143354al alVar = akVar.f388775a;
        alVar.f388800v = 3;
        synchronized (alVar.f388799u) {
            for (C143602k c : akVar.f388775a.f388799u) {
                c.mo118717c(i);
            }
        }
    }
}
