package com.google.android.libraries.search.p2476a;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.libraries.search.a.e */
/* compiled from: PG */
public final /* synthetic */ class C32216e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C32233g f86424a;

    public /* synthetic */ C32216e(C32233g gVar) {
        this.f86424a = gVar;
    }

    public final void run() {
        C58528ij F;
        C32233g gVar = this.f86424a;
        gVar.f86446a.f86453g.f254443a.mo78242b();
        synchronized (gVar.f86446a.f86452f) {
            F = C58528ij.m90006F(gVar.f86446a.f86451e);
        }
        C58800sl lA = F.iterator();
        while (lA.hasNext()) {
            ((C32150a) lA.next()).mo37969j();
        }
    }
}
