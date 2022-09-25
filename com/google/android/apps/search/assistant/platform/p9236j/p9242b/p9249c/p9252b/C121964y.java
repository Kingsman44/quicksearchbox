package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.apps.gsa.binaries.satin.app.apn;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C121988a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33560a;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33568a;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2600b.C33574g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5484n.C69779a;
import p5462h.p5484n.C69781c;
import p5462h.p5484n.C69782d;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.y */
/* compiled from: PG */
public final class C121964y implements C33560a, C33568a {

    /* renamed from: a */
    public static final C59071e f338465a = C59071e.m91331h();

    /* renamed from: g */
    private static final long f338466g = C69781c.m101247b(30, C69782d.SECONDS);

    /* renamed from: b */
    public final C121988a f338467b;

    /* renamed from: c */
    public final C33574g f338468c;

    /* renamed from: d */
    public final C71788b f338469d = new C71799m();

    /* renamed from: e */
    public C121940bj f338470e;

    /* renamed from: f */
    public final AtomicReference f338471f = new AtomicReference((Object) null);

    /* renamed from: h */
    private final AccountId f338472h;

    /* renamed from: i */
    private final Executor f338473i;

    /* renamed from: j */
    private final C71422aw f338474j;

    /* renamed from: k */
    private final C121941bk f338475k;

    /* renamed from: l */
    private final AtomicInteger f338476l = new AtomicInteger(0);

    /* renamed from: m */
    private final apn f338477m;

    static {
        int i = C69779a.f186156a;
    }

    public C121964y(AccountId accountId, Executor executor, C71422aw awVar, C121988a aVar, C33574g gVar, apn apn, C121941bk bkVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(executor, "uiExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "apaVisTokenApi");
        C69664n.m101061g(gVar, "visManager");
        C69664n.m101061g(apn, "visHostFactory");
        C69664n.m101061g(bkVar, "windowIdGenerator");
        this.f338472h = accountId;
        this.f338473i = executor;
        this.f338474j = awVar;
        this.f338467b = aVar;
        this.f338468c = gVar;
        this.f338477m = apn;
        this.f338475k = bkVar;
    }

    /* renamed from: a */
    public final void mo38985a() {
        C58976aa aaVar = C58975e.f156826a;
        C71803m.m105043d(this.f338474j, (C69585o) null, (C71424ay) null, new C121957r(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final void mo38986b() {
        C58976aa aaVar = C58975e.f156826a;
        C71803m.m105043d(this.f338474j, (C69585o) null, (C71424ay) null, new C121958s(this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo38977c(C129655b bVar, C34037b bVar2) {
        C69664n.m101061g(bVar2, "apaClient");
        this.f338476l.incrementAndGet();
        return C71663i.m104692e(this.f338474j, (C71424ay) null, new C121962w(this, bVar, bVar2, (C69577g) null), 3);
    }

    /* renamed from: d */
    public final void mo38987d() {
        C58976aa aaVar = C58975e.f156826a;
        C71803m.m105043d(this.f338474j, (C69585o) null, (C71424ay) null, new C121959t(this, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final void mo38988e() {
        C71803m.m105043d(this.f338474j, (C69585o) null, (C71424ay) null, new C121960u(this, (C69577g) null), 3);
    }

    /* renamed from: f */
    public final void mo38989f() {
        C71803m.m105043d(this.f338474j, (C69585o) null, (C71424ay) null, new C121961v(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c8 A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f9 A[Catch:{ all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105473g(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b r25, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r26, p5462h.p5466c.C69577g r27) {
        /*
            r24 = this;
            r1 = r24
            r0 = r27
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121963x
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.b.x r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121963x) r2
            int r3 = r2.f338464g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f338464g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.j.b.c.b.x r2 = new com.google.android.apps.search.assistant.platform.j.b.c.b.x
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f338462e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f338464g
            java.lang.String r5 = "INV.AssistLayer"
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x0087
            if (r4 == r9) goto L_0x0070
            if (r4 == r8) goto L_0x0067
            if (r4 == r7) goto L_0x004f
            if (r4 != r6) goto L_0x0047
            java.lang.Object r3 = r2.f338460c
            com.google.android.apps.search.assistant.platform.j.b.c.b.y r3 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121964y) r3
            java.lang.Object r4 = r2.f338459b
            com.google.android.apps.search.assistant.platform.j.b.c.b.bj r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121940bj) r4
            java.lang.Object r2 = r2.f338458a
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0185
        L_0x0044:
            r0 = move-exception
            goto L_0x018e
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004f:
            java.lang.Object r4 = r2.f338461d
            java.lang.Object r5 = r2.f338460c
            com.google.android.libraries.search.assistant.invocation.o.a.b r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b) r5
            java.lang.Object r7 = r2.f338459b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b) r7
            java.lang.Object r8 = r2.f338458a
            com.google.android.apps.search.assistant.platform.j.b.c.b.y r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121964y) r8
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0063 }
            r12 = r8
            goto L_0x0117
        L_0x0063:
            r0 = move-exception
            r2 = r4
            goto L_0x018e
        L_0x0067:
            java.lang.Object r2 = r2.f338458a
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0187
        L_0x0070:
            java.lang.Object r4 = r2.f338461d
            java.lang.Object r9 = r2.f338460c
            com.google.android.libraries.search.assistant.invocation.o.a.b r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b) r9
            java.lang.Object r11 = r2.f338459b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b) r11
            java.lang.Object r12 = r2.f338458a
            com.google.android.apps.search.assistant.platform.j.b.c.b.y r12 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121964y) r12
            p5462h.C69714l.m101134b(r0)
            r23 = r11
            r11 = r4
            r4 = r23
            goto L_0x00c4
        L_0x0087:
            p5462h.C69714l.m101134b(r0)
            com.google.common.f.e r0 = f338465a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r5)
            java.lang.String r4 = r26.name()
            com.google.common.f.n r11 = new com.google.common.f.n
            r12 = 36040(0x8cc8, float:5.0503E-41)
            r11.<init>(r12)
            r0.mo56379ah(r11)
            java.lang.String r11 = "Client %s requested to show a fragment. Will be shown in Vis Window"
            r0.mo56389s(r11, r4)
            kotlinx.coroutines.j.b r0 = r1.f338469d
            r2.f338458a = r1
            r4 = r25
            r2.f338459b = r4
            r11 = r26
            r2.f338460c = r11
            r2.f338461d = r0
            r2.f338464g = r9
            java.lang.Object r9 = r0.mo63025b(r10, r2)
            if (r9 == r3) goto L_0x0192
            r12 = r1
            r9 = r11
            r11 = r0
        L_0x00c4:
            com.google.android.apps.search.assistant.platform.j.b.c.b.bj r0 = r12.f338470e     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x00f9
            com.google.common.f.e r6 = f338465a     // Catch:{ all -> 0x018c }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ all -> 0x018c }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x018c }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x018c }
            r6.mo56378ag(r7, r5)     // Catch:{ all -> 0x018c }
            java.lang.String r5 = "Reusing existing session.."
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x018c }
            r12 = 36041(0x8cc9, float:5.0504E-41)
            r7.<init>(r12)     // Catch:{ all -> 0x018c }
            r6.mo56379ah(r7)     // Catch:{ all -> 0x018c }
            r6.mo56386p(r5)     // Catch:{ all -> 0x018c }
            r2.f338458a = r11     // Catch:{ all -> 0x018c }
            r2.f338459b = r10     // Catch:{ all -> 0x018c }
            r2.f338460c = r10     // Catch:{ all -> 0x018c }
            r2.f338461d = r10     // Catch:{ all -> 0x018c }
            r2.f338464g = r8     // Catch:{ all -> 0x018c }
            java.lang.Object r0 = r0.mo105465c(r4, r9, r2)     // Catch:{ all -> 0x018c }
            if (r0 == r3) goto L_0x00f8
            r2 = r11
            goto L_0x0187
        L_0x00f8:
            return r3
        L_0x00f9:
            r2.f338458a = r12     // Catch:{ all -> 0x018c }
            r2.f338459b = r4     // Catch:{ all -> 0x018c }
            r2.f338460c = r9     // Catch:{ all -> 0x018c }
            r2.f338461d = r11     // Catch:{ all -> 0x018c }
            r2.f338464g = r7     // Catch:{ all -> 0x018c }
            long r7 = f338466g     // Catch:{ all -> 0x018c }
            com.google.android.apps.search.assistant.platform.j.b.c.b.q r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.q     // Catch:{ all -> 0x018c }
            r0.<init>(r12, r10)     // Catch:{ all -> 0x018c }
            long r7 = kotlinx.coroutines.C71608bi.m104549a(r7)     // Catch:{ all -> 0x018c }
            java.lang.Object r0 = kotlinx.coroutines.C71745ea.m104929a(r7, r0, r2)     // Catch:{ all -> 0x018c }
            if (r0 == r3) goto L_0x018b
            r7 = r4
            r5 = r9
            r4 = r11
        L_0x0117:
            r14 = r0
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.b r14 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33504b) r14     // Catch:{ all -> 0x0063 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.bk r0 = r12.f338475k     // Catch:{ all -> 0x0063 }
            java.util.concurrent.atomic.AtomicLong r0 = r0.f338380a     // Catch:{ all -> 0x0063 }
            long r15 = r0.incrementAndGet()     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.apn r0 = r12.f338477m     // Catch:{ all -> 0x0063 }
            com.google.apps.tiktok.account.AccountId r8 = r12.f338472h     // Catch:{ all -> 0x0063 }
            java.util.concurrent.Executor r9 = r12.f338473i     // Catch:{ all -> 0x0063 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.bj r11 = new com.google.android.apps.search.assistant.platform.j.b.c.b.bj     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r13 = r0.f199135a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r13 = r13.a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.asp r13 = r13.a     // Catch:{ all -> 0x0063 }
            g.a.a r13 = r13.f202878fQ     // Catch:{ all -> 0x0063 }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ all -> 0x0063 }
            r19 = r13
            com.google.android.libraries.logging.ve.af r19 = (com.google.android.libraries.logging.p2185ve.C28310af) r19     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r13 = r0.f199135a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r13 = r13.a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.asp r13 = r13.a     // Catch:{ all -> 0x0063 }
            g.a.a r13 = r13.f202880fS     // Catch:{ all -> 0x0063 }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ all -> 0x0063 }
            r20 = r13
            com.google.android.libraries.logging.ve.ab r20 = (com.google.android.libraries.logging.p2185ve.C28306ab) r20     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r13 = r0.f199135a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r13 = r13.a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aso r13 = r13.d     // Catch:{ all -> 0x0063 }
            g.a.a r13 = r13.f201582bo     // Catch:{ all -> 0x0063 }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ all -> 0x0063 }
            r21 = r13
            com.google.android.apps.search.assistant.platform.j.b.c.b.z r21 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121965z) r21     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r0 = r0.f199135a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r0 = r0.a     // Catch:{ all -> 0x0063 }
            com.google.android.apps.gsa.binaries.satin.app.ars r0 = r0.b     // Catch:{ all -> 0x0063 }
            g.a.a r0 = r0.f200094dB     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r0.mo17428b()     // Catch:{ all -> 0x0063 }
            r22 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.b.ac r22 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121906ac) r22     // Catch:{ all -> 0x0063 }
            r13 = r11
            r17 = r8
            r18 = r9
            r13.<init>(r14, r15, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0063 }
            r2.f338458a = r4     // Catch:{ all -> 0x0063 }
            r2.f338459b = r11     // Catch:{ all -> 0x0063 }
            r2.f338460c = r12     // Catch:{ all -> 0x0063 }
            r2.f338461d = r10     // Catch:{ all -> 0x0063 }
            r2.f338464g = r6     // Catch:{ all -> 0x0063 }
            java.lang.Object r0 = r11.mo105466d(r7, r5, r2)     // Catch:{ all -> 0x0063 }
            if (r0 == r3) goto L_0x018b
            r2 = r4
            r4 = r11
            r3 = r12
        L_0x0185:
            r3.f338470e = r4     // Catch:{ all -> 0x0044 }
        L_0x0187:
            r2.mo63026c(r10)
            return r10
        L_0x018b:
            return r3
        L_0x018c:
            r0 = move-exception
            r2 = r11
        L_0x018e:
            r2.mo63026c(r10)
            throw r0
        L_0x0192:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121964y.mo105473g(com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b, com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }
}
