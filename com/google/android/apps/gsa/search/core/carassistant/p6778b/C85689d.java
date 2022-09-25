package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.d */
/* compiled from: PG */
public final class C85689d {

    /* renamed from: c */
    private static final C59071e f231720c = C59071e.m91332i("com.google.android.apps.gsa.search.core.carassistant.b.d");

    /* renamed from: a */
    public final C42876ab f231721a;

    /* renamed from: b */
    public final C86124t f231722b;

    public C85689d(C42876ab abVar, C86124t tVar) {
        abVar.mo46042d();
        this.f231721a = abVar;
        this.f231722b = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.apps.gsa.search.core.carassistant.b.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo79314a(int r7) {
        /*
            r6 = this;
            com.google.android.libraries.storage.protostore.ab r0 = r6.f231721a
            com.google.common.util.concurrent.cx r0 = r0.mo46042d()
            boolean r1 = r0.isDone()
            java.lang.String r2 = "DiscoUsageTracker"
            if (r1 != 0) goto L_0x0023
            com.google.common.f.e r7 = f231720c
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r0, r2)
            java.lang.String r0 = "Proto data store is not ready to read"
            r1 = 7565(0x1d8d, float:1.0601E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        L_0x0023:
            r1 = 1
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ Exception -> 0x0068 }
            com.google.android.apps.gsa.search.core.carassistant.b.g r0 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85692g) r0     // Catch:{ Exception -> 0x0068 }
            boolean r3 = r0.f231728c     // Catch:{ Exception -> 0x0068 }
            if (r3 != 0) goto L_0x0031
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a     // Catch:{ Exception -> 0x0068 }
            return r7
        L_0x0031:
            com.google.android.apps.gsa.search.core.carassistant.b.i r3 = com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i.f231729e     // Catch:{ Exception -> 0x0068 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ Exception -> 0x0068 }
            com.google.android.apps.gsa.search.core.carassistant.b.h r3 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85693h) r3     // Catch:{ Exception -> 0x0068 }
            r3.copyOnWrite()     // Catch:{ Exception -> 0x0068 }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ Exception -> 0x0068 }
            com.google.android.apps.gsa.search.core.carassistant.b.i r4 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r4     // Catch:{ Exception -> 0x0068 }
            int r5 = r4.f231731a     // Catch:{ Exception -> 0x0068 }
            r5 = r5 | r1
            r4.f231731a = r5     // Catch:{ Exception -> 0x0068 }
            r5 = 0
            r4.f231734d = r5     // Catch:{ Exception -> 0x0068 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ Exception -> 0x0068 }
            com.google.android.apps.gsa.search.core.carassistant.b.i r3 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r3     // Catch:{ Exception -> 0x0068 }
            com.google.protobuf.dn r0 = r0.f231727b     // Catch:{ Exception -> 0x0068 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0068 }
            boolean r5 = r0.containsKey(r4)     // Catch:{ Exception -> 0x0068 }
            if (r5 == 0) goto L_0x0061
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0068 }
            r3 = r0
            com.google.android.apps.gsa.search.core.carassistant.b.i r3 = (com.google.android.apps.gsa.search.core.carassistant.p6778b.C85694i) r3     // Catch:{ Exception -> 0x0068 }
        L_0x0061:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x0068 }
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r3)     // Catch:{ Exception -> 0x0068 }
            return r7
        L_0x0068:
            r0 = move-exception
            com.google.common.f.e r3 = f231720c
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r2)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.x r0 = r3.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 7564(0x1d8c, float:1.06E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            if (r7 == r1) goto L_0x008f
            r1 = 5
            if (r7 == r1) goto L_0x008c
            java.lang.String r7 = "null"
            goto L_0x0091
        L_0x008c:
            java.lang.String r7 = "ON_VOICEPLATE_TIMEOUT"
            goto L_0x0091
        L_0x008f:
            java.lang.String r7 = "ON_VOICEPLATE_INVOCATION_VISUAL"
        L_0x0091:
            java.lang.String r1 = "Failed to read from proto store for feature type %s"
            r0.mo56389s(r1, r7)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.p6778b.C85689d.mo79314a(int):com.google.common.base.ax");
    }

    /* renamed from: b */
    public final void mo79315b(int i, C85694i iVar) {
        this.f231721a.mo46039a(new C85687b(i, iVar), C60826bg.f164896a);
    }
}
