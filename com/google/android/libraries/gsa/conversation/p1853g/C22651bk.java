package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.C22727l;
import com.google.android.libraries.gsa.conversation.p1855h.C22709m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.gsa.conversation.g.bk */
/* compiled from: PG */
final class C22651bk implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f62389a;

    /* renamed from: b */
    final /* synthetic */ C22652bl f62390b;

    public C22651bk(C22652bl blVar, boolean z) {
        this.f62390b = blVar;
        this.f62389a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C22654bn.f62403a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ProcessorHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(48356)).mo56386p("processDeltaStream failed");
        C22652bl blVar = this.f62390b;
        if (!blVar.f62393c) {
            blVar.f62393c = true;
            ((C22727l) blVar.f62391a).f62547a.mo27700d(new C22709m(th instanceof CancellationException ? 3 : 2));
            ((C22727l) this.f62390b.f62391a).f62547a.mo27706j(false);
            this.f62390b.f62391a.mo27740a();
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C58976aa aaVar = C58975e.f156826a;
        C22652bl blVar = this.f62390b;
        if (!blVar.f62393c && blVar.f62397g.f62413k != null) {
            blVar.f62393c = true;
            if (this.f62389a) {
                C22618ae aeVar = blVar.f62391a;
                ((C22727l) aeVar).f62547a.mo27700d(new C22709m(4));
                C22652bl blVar2 = this.f62390b;
                C22654bn bnVar = blVar2.f62397g;
                bnVar.mo27766g(bnVar.f62413k, blVar2.f62391a, blVar2.f62396f);
            } else {
                C22618ae aeVar2 = blVar.f62391a;
                ((C22727l) aeVar2).f62547a.mo27700d(new C22709m(2));
            }
            ((C22727l) this.f62390b.f62391a).f62547a.mo27706j(false);
        }
    }
}
