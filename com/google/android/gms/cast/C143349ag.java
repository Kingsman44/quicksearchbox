package com.google.android.gms.cast;

import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.gms.cast.ag */
/* compiled from: PG */
public final /* synthetic */ class C143349ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143353ak f388766a;

    /* renamed from: b */
    public final /* synthetic */ int f388767b;

    public /* synthetic */ C143349ag(C143353ak akVar, int i) {
        this.f388766a = akVar;
        this.f388767b = i;
    }

    public final void run() {
        C143353ak akVar = this.f388766a;
        int i = this.f388767b;
        C143354al alVar = akVar.f388775a;
        alVar.f388792n = -1;
        alVar.f388793o = -1;
        alVar.f388788j = null;
        alVar.f388789k = null;
        alVar.f388790l = C59203do.f157270a;
        alVar.mo118498r();
        alVar.f388791m = false;
        alVar.f388794p = null;
        C143354al alVar2 = akVar.f388775a;
        alVar2.f388800v = 1;
        synchronized (alVar2.f388799u) {
            for (C143602k d : akVar.f388775a.f388799u) {
                d.mo118718d(i);
            }
        }
        akVar.f388775a.mo118492l();
        C143354al alVar3 = akVar.f388775a;
        alVar3.mo118499s(alVar3.f388780b);
    }
}
