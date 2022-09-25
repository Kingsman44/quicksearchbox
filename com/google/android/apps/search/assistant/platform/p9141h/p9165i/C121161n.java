package com.google.android.apps.search.assistant.platform.p9141h.p9165i;

import com.google.android.apps.search.assistant.platform.p9141h.p9165i.p9166a.C121146d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.h.i.n */
/* compiled from: PG */
public final class C121161n implements C121151d {

    /* renamed from: a */
    private static final C59071e f336646a = C59071e.m91331h();

    /* renamed from: b */
    private static final C46690ah f336647b = new C46885y("QUICK_PHRASES_SETTINGS_KEY");

    /* renamed from: c */
    private final C42876ab f336648c;

    /* renamed from: d */
    private final C46778cv f336649d;

    /* renamed from: e */
    private final Set f336650e;

    /* renamed from: f */
    private final C71788b f336651f = new C71799m();

    public C121161n(ScheduledExecutorService scheduledExecutorService, C71422aw awVar, C42876ab abVar, C46778cv cvVar, Set set) {
        C69664n.m101061g(scheduledExecutorService, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(abVar, "quickPhrasesSettingsStore");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f336648c = abVar;
        this.f336649d = cvVar;
        this.f336650e = set;
    }

    /* renamed from: a */
    public final Object mo105064a(C121146d dVar, C69577g gVar) {
        C59052c cVar = (C59052c) f336646a.mo56224b();
        cVar.mo56379ah(new C59094n(35721));
        cVar.mo56386p("#QP: DataServiceImpl: Overwriting QP Settings.");
        Object c = mo105066c(new C121158k(dVar), gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo105065b(Set set, boolean z, C69577g gVar) {
        C59052c cVar = (C59052c) f336646a.mo56224b();
        cVar.mo56379ah(new C59094n(35722));
        cVar.mo56386p("#QP: DataServiceImpl: Updating some QP Settings.");
        Object c = mo105066c(new C121157j(set, z), gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5 A[LOOP:0: B:26:0x00af->B:28:0x00b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105066c(p5462h.p5473f.p5474a.C69626l r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121159l
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.h.i.l r0 = (com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121159l) r0
            int r1 = r0.f336644f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336644f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.h.i.l r0 = new com.google.android.apps.search.assistant.platform.h.i.l
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f336642d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f336644f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r9 = r0.f336640b
            kotlinx.coroutines.j.b r9 = (kotlinx.coroutines.p5584j.C71788b) r9
            java.lang.Object r0 = r0.f336639a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0083
        L_0x0031:
            r10 = move-exception
            goto L_0x00cf
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            java.lang.Object r9 = r0.f336641c
            java.lang.Object r2 = r0.f336640b
            h.f.a.l r2 = (p5462h.p5473f.p5474a.C69626l) r2
            java.lang.Object r4 = r0.f336639a
            p5462h.C69714l.m101134b(r10)
            r10 = r9
            r9 = r2
            goto L_0x005e
        L_0x004a:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r10 = r8.f336651f
            r0.f336639a = r8
            r0.f336640b = r9
            r0.f336641c = r10
            r0.f336644f = r4
            java.lang.Object r2 = r10.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x00d3
            r4 = r8
        L_0x005e:
            r2 = r4
            com.google.android.apps.search.assistant.platform.h.i.n r2 = (com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121161n) r2     // Catch:{ all -> 0x00cb }
            com.google.android.libraries.storage.protostore.ab r2 = r2.f336648c     // Catch:{ all -> 0x00cb }
            com.google.android.apps.search.assistant.platform.h.i.m r6 = new com.google.android.apps.search.assistant.platform.h.i.m     // Catch:{ all -> 0x00cb }
            r6.<init>(r9)     // Catch:{ all -> 0x00cb }
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00cb }
            com.google.common.util.concurrent.cx r9 = r2.mo46039a(r6, r9)     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "transformer: (QuickPhras…ecutors.directExecutor())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ all -> 0x00cb }
            r0.f336639a = r4     // Catch:{ all -> 0x00cb }
            r0.f336640b = r10     // Catch:{ all -> 0x00cb }
            r0.f336641c = r5     // Catch:{ all -> 0x00cb }
            r0.f336644f = r3     // Catch:{ all -> 0x00cb }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)     // Catch:{ all -> 0x00cb }
            if (r9 == r1) goto L_0x00ca
            r9 = r10
            r0 = r4
        L_0x0083:
            r9.mo63026c(r5)
            com.google.common.f.e r9 = f336646a
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r1 = 35723(0x8b8b, float:5.0059E-41)
            r10.<init>(r1)
            r9.mo56379ah(r10)
            java.lang.String r10 = "#QP: DataServiceImpl: Notifying QP Settings change to listeners."
            r9.mo56386p(r10)
            com.google.android.apps.search.assistant.platform.h.i.n r0 = (com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121161n) r0
            com.google.apps.tiktok.dataservice.cv r9 = r0.f336649d
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.apps.tiktok.dataservice.ah r1 = f336647b
            r9.mo50787a(r10, r1)
            java.util.Set r9 = r0.f336650e
            java.util.Iterator r9 = r9.iterator()
        L_0x00af:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00c7
            java.lang.Object r10 = r9.next()
            com.google.android.apps.search.assistant.platform.h.a.a.g r10 = (com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9143a.C120978g) r10
            kotlinx.coroutines.aw r0 = r10.f336337d
            com.google.android.apps.search.assistant.platform.h.a.a.f r1 = new com.google.android.apps.search.assistant.platform.h.a.a.f
            r1.<init>(r10, r5)
            r10 = 3
            kotlinx.coroutines.C71803m.m105043d(r0, r5, r5, r1, r10)
            goto L_0x00af
        L_0x00c7:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00ca:
            return r1
        L_0x00cb:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00cf:
            r9.mo63026c(r5)
            throw r10
        L_0x00d3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9141h.p9165i.C121161n.mo105066c(h.f.a.l, h.c.g):java.lang.Object");
    }
}
