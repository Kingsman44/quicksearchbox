package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bh */
/* compiled from: PG */
final class C89469bh implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C89474bm f242489a;

    public C89469bh(C89474bm bmVar) {
        this.f242489a = bmVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C89474bm.f242494a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(10347)).mo56386p("Failed to read device list");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        for (C124548d P : (List) obj) {
            String P2 = P.mo106475P();
            if (!P2.isEmpty()) {
                this.f242489a.mo83415u(P2);
            }
        }
    }
}
