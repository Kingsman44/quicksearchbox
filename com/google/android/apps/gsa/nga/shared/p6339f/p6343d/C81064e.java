package com.google.android.apps.gsa.nga.shared.p6339f.p6343d;

import com.google.android.apps.gsa.nga.api.C74723ca;
import com.google.android.apps.gsa.nga.api.a.ab;
import com.google.android.apps.gsa.nga.api.a.ad;
import com.google.android.apps.gsa.nga.api.a.aq;
import com.google.android.apps.gsa.nga.api.a.ar;
import com.google.android.apps.gsa.nga.shared.p6339f.C81042c;
import com.google.android.apps.gsa.nga.shared.p6356m.C81428d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82312an;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.d.e */
/* compiled from: PG */
public final class C81064e {

    /* renamed from: b */
    private static final C58974d f222178b = C58974d.m91136j();

    /* renamed from: a */
    public final C74723ca f222179a;

    /* renamed from: c */
    private final C81428d f222180c;

    /* renamed from: d */
    private final C81042c f222181d;

    /* renamed from: e */
    private final C22871g f222182e;

    public C81064e(C81428d dVar, C81042c cVar, C22871g gVar, C74723ca caVar) {
        this.f222180c = dVar;
        this.f222181d = cVar;
        this.f222182e = gVar;
        this.f222179a = caVar;
    }

    /* renamed from: a */
    public final boolean mo74838a(C37672hs hsVar) {
        ar arVar;
        char c = 0;
        if (this.f222180c.mo75077d()) {
            return false;
        }
        ((C58970a) ((C58970a) f222178b.mo56226d()).mo56372aa(5815)).mo56389s("NGA not active. Rejecting Bisto invocation for %s", C81062c.m129010a(Optional.m71637of(hsVar)));
        ab createBuilder = ad.d.createBuilder();
        createBuilder.copyOnWrite();
        hsVar.getClass();
        createBuilder.instance.c = hsVar;
        aq createBuilder2 = ar.b.createBuilder();
        createBuilder2.copyOnWrite();
        createBuilder2.instance.a = 1;
        createBuilder.copyOnWrite();
        ad adVar = createBuilder.instance;
        ar build = createBuilder2.build();
        build.getClass();
        adVar.b = build;
        adVar.a = 5;
        ad build2 = createBuilder.build();
        this.f222182e.mo28212l("[NGA] InvocationManagerImpl.notifyInvocationError", new C81063d(this, build2));
        C81042c cVar = this.f222181d;
        if (build2.a == 5) {
            arVar = (ar) build2.b;
        } else {
            arVar = ar.b;
        }
        C83305i iVar = cVar.f222112a;
        int i = arVar.a;
        if (i == 0) {
            c = 2;
        } else if (i == 1) {
            c = 3;
        } else if (i == 2) {
            c = 4;
        }
        iVar.mo75579d(new C82312an("INVOCATION_MANAGER_REJECTION", c == 0 ? "UNRECOGNIZED" : c != 2 ? c != 3 ? "QPU_FLAGS_NOT_ENABLED" : "NGA_NOT_ACTIVE" : "UNKNOWN"));
        return true;
    }
}
