package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2114a.C26653n;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26654o;

/* renamed from: com.google.android.libraries.lens.view.h.e.c */
/* compiled from: PG */
public final /* synthetic */ class C26792c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73054a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73055b;

    public /* synthetic */ C26792c(C26784ai aiVar, boolean z) {
        this.f73054a = aiVar;
        this.f73055b = z;
    }

    public final void run() {
        C26784ai aiVar = this.f73054a;
        boolean z = this.f73055b;
        if (aiVar.f72988P.getAndSet(z) != z) {
            aiVar.mo32155y();
            if (z) {
                C26654o oVar = aiVar.f73032x;
                synchronized (oVar.f72673i) {
                    oVar.f72675k.mo33700b(true);
                    C26653n nVar = new C26653n(oVar);
                    nVar.mo31950a();
                    oVar.f72679o = nVar;
                }
                aiVar.mo32152u();
                return;
            }
            C26654o oVar2 = aiVar.f73032x;
            synchronized (oVar2.f72673i) {
                oVar2.f72675k.mo33700b(false);
                oVar2.f72679o = null;
            }
        }
    }
}
