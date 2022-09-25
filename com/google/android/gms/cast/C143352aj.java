package com.google.android.gms.cast;

/* renamed from: com.google.android.gms.cast.aj */
/* compiled from: PG */
public final /* synthetic */ class C143352aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388773a;

    /* renamed from: b */
    public final /* synthetic */ int f388774b;

    public /* synthetic */ C143352aj(C143353ak akVar, int i) {
        this.f388773a = akVar;
        this.f388774b = i;
    }

    public final void run() {
        C143353ak akVar = this.f388773a;
        int i = this.f388774b;
        if (i == 0) {
            C143354al alVar = akVar.f388775a;
            alVar.f388800v = 2;
            alVar.f388781c = true;
            alVar.f388782d = true;
            synchronized (alVar.f388799u) {
                for (C143602k a : akVar.f388775a.f388799u) {
                    a.mo118715a();
                }
            }
            return;
        }
        C143354al alVar2 = akVar.f388775a;
        alVar2.f388800v = 1;
        synchronized (alVar2.f388799u) {
            for (C143602k b : akVar.f388775a.f388799u) {
                b.mo118716b(i);
            }
        }
        akVar.f388775a.mo118492l();
    }
}
