package com.google.android.apps.gsa.staticplugins.p7886ea;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6668cr.C85199a;
import com.google.android.apps.gsa.search.core.p6519al.p6705di.C85372a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7442bc.C94514g;
import com.google.android.apps.gsa.staticplugins.webview.C118247f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.ea.c */
/* compiled from: PG */
public final class C100333c extends C86734a implements C85372a {

    /* renamed from: a */
    public static final C59071e f280587a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ea.c");

    /* renamed from: b */
    public final AtomicReference f280588b = new AtomicReference();

    /* renamed from: c */
    private final C22871g f280589c;

    /* renamed from: f */
    private final C85199a f280590f;

    /* renamed from: g */
    private final C90476a f280591g;

    /* renamed from: h */
    private boolean f280592h = false;

    /* renamed from: i */
    private final C94514g f280593i;

    /* renamed from: j */
    private final C118247f f280594j;

    public C100333c(C22871g gVar, C94514g gVar2, C85199a aVar, C118247f fVar, C90476a aVar2) {
        super(C118575h.WORKER_TEXT_SEARCH, "textsearch");
        this.f280589c = gVar;
        this.f280593i = gVar2;
        this.f280590f = aVar;
        this.f280594j = fVar;
        this.f280591g = aVar2;
    }

    /* renamed from: a */
    public final void mo78897a(C60870cx cxVar, C86361a aVar, C89356b bVar) {
        if (!this.f280592h) {
            this.f280592h = true;
            new C90873ag(m166322c(0, bVar, false, cxVar, aVar), this.f280589c, "Creating SearchGraph for prewarmed text search", new C100331a(this)).mo85223a(C100332b.f280586a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78898b(com.google.android.apps.gsa.shared.search.Query r8, long r9, com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a r11, com.google.common.util.concurrent.C60870cx r12, com.google.android.apps.gsa.search.core.p6820r.p6821a.p6824c.C86361a r13, com.google.android.apps.gsa.shared.p7012bb.C89356b r14) {
        /*
            r7 = this;
            boolean r0 = r8.mo84435dP()
            com.google.common.base.C58838bb.m90883r(r0)
            boolean r0 = r8.mo84435dP()
            com.google.common.base.C58838bb.m90883r(r0)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicReference r9 = r7.f280588b
            r10 = 0
            java.lang.Object r9 = r9.getAndSet(r10)
            com.google.android.apps.gsa.search.core.r.u r9 = (com.google.android.apps.gsa.search.core.p6820r.C86575u) r9
            if (r9 == 0) goto L_0x0023
            r10 = 0
            r7.f280592h = r10
            goto L_0x0038
        L_0x0023:
            r1 = r0
            goto L_0x0026
        L_0x0025:
            r1 = r9
        L_0x0026:
            boolean r4 = r8.mo84436dQ()
            r0 = r7
            r3 = r14
            r5 = r12
            r6 = r13
            com.google.common.util.concurrent.cx r9 = r0.m166322c(r1, r3, r4, r5, r6)
            com.google.android.apps.gsa.search.core.r.y r10 = new com.google.android.apps.gsa.search.core.r.y
            r10.<init>(r9)
            r9 = r10
        L_0x0038:
            boolean r10 = r8.mo84435dP()
            com.google.common.base.C58838bb.m90883r(r10)
            com.google.android.apps.gsa.search.core.r.w r8 = r11.mo80187k(r8, r9, r14)
            com.google.android.apps.gsa.shared.s.a.a r9 = r7.f280591g
            boolean r9 = r9.mo84225b()
            if (r9 == 0) goto L_0x0052
            java.lang.String r9 = "SearchGraphRunner.search()"
            com.google.android.apps.gsa.shared.s.a.a r10 = r7.f280591g
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148695a(r9, r10)
        L_0x0052:
            r8.mo80180a()
            com.google.android.apps.gsa.shared.s.a.a r8 = r7.f280591g
            boolean r8 = r8.mo84225b()
            if (r8 == 0) goto L_0x0062
            com.google.android.apps.gsa.shared.s.a.a r8 = r7.f280591g
            com.google.android.apps.gsa.shared.util.debug.C91030n.m148696b(r8)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7886ea.C100333c.mo78898b(com.google.android.apps.gsa.shared.search.Query, long, com.google.android.apps.gsa.search.core.r.j.a, com.google.common.util.concurrent.cx, com.google.android.apps.gsa.search.core.r.a.c.a, com.google.android.apps.gsa.shared.bb.b):void");
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }

    /* renamed from: c */
    private final C60870cx m166322c(long j, C89356b bVar, boolean z, C60870cx cxVar, C86361a aVar) {
        Object obj;
        if (z) {
            obj = this.f280594j.f328273b;
        } else {
            obj = this.f280593i.mo88489a(j, bVar);
        }
        return this.f280590f.mo78785a(C60856cj.m92900i(obj), cxVar, bVar, aVar);
    }
}
