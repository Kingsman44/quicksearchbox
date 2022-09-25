package com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1339a.p1340a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1177c.p1178a.C15829o;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1195e.p1196a.C15881b;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16358be;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16359bf;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.e.a.a.l */
/* compiled from: PG */
final class C16881l implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f49372a;

    /* renamed from: b */
    final /* synthetic */ C16882m f49373b;

    public C16881l(C16882m mVar, boolean z) {
        this.f49373b = mVar;
        this.f49372a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C65753ak akVar = C16882m.f49374a;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C65753ak akVar = C16882m.f49374a;
        C58976aa aaVar = C58975e.f156826a;
        C15881b bVar = this.f49373b.f49378e;
        Boolean valueOf = Boolean.valueOf(this.f49372a);
        if (bVar.f47160c.isPresent()) {
            C58833ax a = ((C15829o) bVar.f47160c.get()).mo22578a();
            if (a.mo56113h()) {
                C16359bf bfVar = (C16359bf) a.mo56107c();
                if (!Boolean.valueOf(bfVar.f48155b).equals(valueOf)) {
                    C16358be beVar = (C16358be) bfVar.toBuilder();
                    boolean booleanValue = valueOf.booleanValue();
                    beVar.copyOnWrite();
                    C16359bf bfVar2 = (C16359bf) beVar.instance;
                    bfVar2.f48154a |= 1;
                    bfVar2.f48155b = booleanValue;
                    ((C15829o) bVar.f47160c.get()).mo22579b((C16359bf) beVar.build());
                }
            }
        }
    }
}
