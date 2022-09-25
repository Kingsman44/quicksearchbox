package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;

/* renamed from: com.google.android.libraries.lens.view.h.e.u */
/* compiled from: PG */
public final /* synthetic */ class C26810u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73085a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73086b;

    public /* synthetic */ C26810u(C26784ai aiVar, boolean z) {
        this.f73085a = aiVar;
        this.f73086b = z;
    }

    public final void run() {
        C26784ai aiVar = this.f73085a;
        boolean z = this.f73086b;
        aiVar.f73014f = !z;
        aiVar.f72978F.mo33288a(new C26811v(aiVar));
        aiVar.f73032x.f72677m = aiVar.f73014f;
        aiVar.f73031w.mo31982l(aiVar.f72998Z);
        aiVar.f72976D.mo32196k(aiVar.f73000ab);
        if (aiVar.f72979G != C26774z.LENS_TELECAMERA || z) {
            aiVar.f73031w.mo31985o(1);
        }
        aiVar.f73031w.mo31979i(((Boolean) aiVar.f72982J.f73043a.mo3842a()).booleanValue());
        if (z) {
            aiVar.f72989Q.mo33206a();
            aiVar.f73033y.mo31956b();
        }
        aiVar.f73024p.set(0);
        aiVar.mo32154x(new C26812w(aiVar));
        if (z && aiVar.f73015g) {
            aiVar.mo32116g();
        }
    }
}
