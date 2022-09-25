package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83725a;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83727c;
import com.google.android.apps.gsa.opa.smartspace.p6452a.C83728d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7041h.C89776h;
import com.google.android.apps.gsa.shared.p7041h.C89783o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C107987an;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.c.s */
/* compiled from: PG */
public final class C110559s implements C83725a {

    /* renamed from: a */
    public static final long f308220a = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: g */
    private static final long f308221g = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: h */
    private static final long f308222h = TimeUnit.MINUTES.toSeconds(1);

    /* renamed from: b */
    public final C108013bm f308223b;

    /* renamed from: c */
    public final C22871g f308224c;

    /* renamed from: d */
    public final C83727c f308225d;

    /* renamed from: e */
    public final C86124t f308226e;

    /* renamed from: f */
    public final C58974d f308227f;

    /* renamed from: i */
    private final C21370a f308228i;

    /* renamed from: j */
    private final C83794j f308229j;

    public C110559s(C108013bm bmVar, C22871g gVar, C83728d dVar, C21370a aVar, C86124t tVar, C83564a aVar2, C39226b bVar, C83794j jVar) {
        this.f308223b = bmVar;
        this.f308224c = gVar;
        C22871g gVar2 = (C22871g) dVar.f228205a.mo17428b();
        gVar2.getClass();
        C89783o oVar = (C89783o) dVar.f228206b.mo17428b();
        oVar.getClass();
        C21370a aVar3 = (C21370a) dVar.f228207c.mo17428b();
        aVar3.getClass();
        C86124t tVar2 = (C86124t) dVar.f228208d.mo17428b();
        tVar2.getClass();
        this.f308225d = new C83727c(gVar2, oVar, aVar3, bVar, tVar2);
        this.f308228i = aVar;
        this.f308226e = tVar;
        this.f308227f = aVar2.mo76900a("CalDataStoreImpl");
        this.f308229j = jVar;
    }

    /* renamed from: g */
    private final C60870cx m184168g() {
        ((C58970a) ((C58970a) this.f308227f.mo56224b()).mo56372aa(26543)).mo56386p("#getDataFromOpaStoreOrFetchLatest()");
        SettableFuture settableFuture = new SettableFuture();
        if (this.f308226e.mo79746e(C90014bt.f247646lA)) {
            new C90873ag(this.f308223b.f300493i.mo96376e(3, 16, C58836b.f156633a, C107987an.f300456a), this.f308224c, "loadActiveEvents", new C110551k(this, settableFuture)).mo85223a(new C110552l(this, settableFuture));
        } else {
            mo98764e(settableFuture, 1);
        }
        return settableFuture;
    }

    /* renamed from: a */
    public final C60870cx mo77049a() {
        ((C58970a) ((C58970a) this.f308227f.mo56224b()).mo56372aa(26544)).mo56386p("#getEventsForNext24Hours()");
        return this.f308224c.mo28209i(m184168g(), "transformEventDataListToEventsForNext24Hours", new C110556p(this));
    }

    /* renamed from: b */
    public final C60870cx mo77050b() {
        ((C58970a) ((C58970a) this.f308227f.mo56224b()).mo56372aa(26545)).mo56386p("#getNextEvent()");
        return this.f308224c.mo28209i(m184168g(), "transformEventDataListToNextEvent", new C110553m(this));
    }

    /* renamed from: c */
    public final C60870cx mo77051c(long j) {
        ((C58970a) ((C58970a) this.f308227f.mo56224b()).mo56372aa(26546)).mo56388r("#storeLocalCalendarDataToOpaStore(): Fetch and store local calendar data for next %d days.", j);
        SettableFuture settableFuture = new SettableFuture();
        mo98764e(settableFuture, j);
        return settableFuture;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        if (r3 != 2) goto L_0x00b8;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo98763d(com.google.common.base.C58833ax r10) {
        /*
            r9 = this;
            boolean r0 = r10.mo56113h()
            r1 = 0
            if (r0 == 0) goto L_0x00ba
            com.google.common.f.a.d r0 = r9.f308227f
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.Object r2 = r10.mo56107c()
            com.google.android.apps.gsa.shared.h.j r2 = (com.google.android.apps.gsa.shared.p7041h.C89778j) r2
            com.google.protobuf.cq r2 = r2.f242998a
            int r2 = r2.size()
            r3 = 26540(0x67ac, float:3.719E-41)
            java.lang.String r4 = "Found %s local calendar events from OpaStore."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56387q(r4, r2)
            java.lang.Object r10 = r10.mo56107c()
            com.google.android.apps.gsa.shared.h.j r10 = (com.google.android.apps.gsa.shared.p7041h.C89778j) r10
            com.google.protobuf.cq r10 = r10.f242998a
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r10)
            com.google.android.apps.gsa.staticplugins.opa.smartspace.c.q r0 = com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110557q.f308217a
            java.util.Comparator r0 = p3186j$.util.Comparator.CC.comparing(r0)
            j$.util.stream.Stream r10 = r10.sorted(r0)
            j$.util.stream.Collector r0 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r10 = r10.collect(r0)
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0044:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r10.next()
            com.google.android.apps.gsa.shared.h.h r0 = (com.google.android.apps.gsa.shared.p7041h.C89776h) r0
            com.google.common.f.a.d r2 = r9.f308227f
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r3 = 26541(0x67ad, float:3.7192E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            long r3 = r0.f242983c
            java.lang.String r5 = r0.f242993m
            java.lang.String r6 = "Found event with event id: %s and sync id: %s"
            r2.mo56351D(r6, r3, r5)
            r2 = 0
            boolean r2 = r9.mo98765f(r0, r2)
            if (r2 == 0) goto L_0x007e
            com.google.common.f.a.d r0 = r9.f308227f
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "Event should be excluded."
            r3 = 26542(0x67ae, float:3.7193E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x0044
        L_0x007e:
            long r2 = r0.f242985e
            int r4 = r0.f242991k
            int r4 = com.google.android.apps.gsa.shared.p7041h.C89774f.m146147a(r4)
            if (r4 != 0) goto L_0x0089
            r4 = 1
        L_0x0089:
            int r5 = r0.f242990j
            if (r1 != 0) goto L_0x008e
            goto L_0x00b8
        L_0x008e:
            long r6 = r1.f242985e
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0095
            goto L_0x00b8
        L_0x0095:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0044
            r2 = 2
            if (r4 != r2) goto L_0x00a8
            int r3 = r1.f242991k
            int r3 = com.google.android.apps.gsa.shared.p7041h.C89774f.m146147a(r3)
            if (r3 != 0) goto L_0x00a5
            goto L_0x00b8
        L_0x00a5:
            if (r3 == r2) goto L_0x00aa
            goto L_0x00b8
        L_0x00a8:
            if (r4 != r2) goto L_0x0044
        L_0x00aa:
            int r3 = r1.f242991k
            int r3 = com.google.android.apps.gsa.shared.p7041h.C89774f.m146147a(r3)
            if (r3 == 0) goto L_0x0044
            if (r3 != r2) goto L_0x0044
            int r2 = r1.f242990j
            if (r5 >= r2) goto L_0x0044
        L_0x00b8:
            r1 = r0
            goto L_0x0044
        L_0x00ba:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90833j(r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110559s.mo98763d(com.google.common.base.ax):com.google.common.base.ax");
    }

    /* renamed from: e */
    public final void mo98764e(SettableFuture settableFuture, long j) {
        ((C58970a) ((C58970a) this.f308227f.mo56224b()).mo56372aa(26548)).mo56386p("#fetchDataAndWriteToOpaStore()");
        new C90873ag(this.f308225d.mo77052a(j), this.f308224c, "loadActiveEvents", new C110558r(this, settableFuture)).mo85223a(new C110549i(this, settableFuture));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo98765f(C89776h hVar, boolean z) {
        long j;
        if (hVar.f242993m.startsWith("SYNC_ERROR")) {
            C95883aa.m158983d(this.f308227f.mo56226d(), "Calendar event has sync error should be ignored.", 26557, C38505d.f101863a, Integer.valueOf(C89885b.LOCAL_CALENDAR_SYNC_ERROR_EVENTS_VALUE));
            return true;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f308228i.mo26870b());
        if (this.f308229j.mo77176n()) {
            j = TimeUnit.MINUTES.toSeconds(this.f308229j.mo77165a());
        } else {
            j = f308220a;
        }
        int i = hVar.f242981a;
        if ((i & 8) == 0) {
            return true;
        }
        long j2 = hVar.f242985e;
        if (seconds > (j + j2) - f308222h) {
            return true;
        }
        long j3 = f308221g;
        if (j2 > seconds + j3) {
            return true;
        }
        if ((i & 16) != 0) {
            long j4 = hVar.f242986f - j2;
            if (j4 > 0 && j4 % j3 == 0) {
                return true;
            }
        }
        if (z || !hVar.f242994n) {
            return false;
        }
        return true;
    }
}
