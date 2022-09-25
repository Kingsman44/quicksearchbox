package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import com.google.android.apps.gsa.binaries.satin.app.apm;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.p9253a.C121903a;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c.C121988a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b;
import com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33560a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2621b.C33732c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.o */
/* compiled from: PG */
public final class C121954o implements C33560a {

    /* renamed from: a */
    public static final C59071e f338418a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f338419b;

    /* renamed from: c */
    public final Executor f338420c;

    /* renamed from: d */
    public final AccountId f338421d;

    /* renamed from: e */
    public final C71788b f338422e = new C71799m();

    /* renamed from: f */
    public C121907ad f338423f;

    /* renamed from: g */
    public final apm f338424g;

    /* renamed from: h */
    private final C121988a f338425h;

    /* renamed from: i */
    private final C33732c f338426i;

    /* renamed from: j */
    private final boolean f338427j;

    /* renamed from: k */
    private final C69613f f338428k = new C69747m(new C121953n(this));

    /* renamed from: l */
    private final C121903a f338429l;

    public C121954o(C121903a aVar, C71422aw awVar, Executor executor, C121988a aVar2, C33732c cVar, AccountId accountId, boolean z, apm apm) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "uiExecutor");
        C69664n.m101061g(aVar2, "apaVisTokenApi");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(apm, "visWindowImplFactory");
        this.f338429l = aVar;
        this.f338419b = awVar;
        this.f338420c = executor;
        this.f338425h = aVar2;
        this.f338426i = cVar;
        this.f338421d = accountId;
        this.f338427j = z;
        this.f338424g = apm;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.google.android.apps.search.assistant.platform.j.b.c.b.ad] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[Catch:{ all -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ all -> 0x0156 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105469a(p5462h.p5466c.C69577g r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121942c
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.platform.j.b.c.b.c r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121942c) r2
            int r3 = r2.f338385e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f338385e = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.j.b.c.b.c r2 = new com.google.android.apps.search.assistant.platform.j.b.c.b.c
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f338383c
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f338385e
            java.lang.String r5 = "INV.AssistLayer"
            r6 = 1
            r7 = 0
            r8 = 2
            if (r4 == 0) goto L_0x0048
            if (r4 == r6) goto L_0x0040
            if (r4 != r8) goto L_0x0038
            java.lang.Object r3 = r2.f338382b
            java.lang.Object r2 = r2.f338381a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x0098
        L_0x0035:
            r0 = move-exception
            goto L_0x0158
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0040:
            java.lang.Object r4 = r2.f338382b
            java.lang.Object r6 = r2.f338381a
            p5462h.C69714l.m101134b(r0)
            goto L_0x005b
        L_0x0048:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f338422e
            r2.f338381a = r1
            r2.f338382b = r0
            r2.f338385e = r6
            java.lang.Object r4 = r0.mo63025b(r7, r2)
            if (r4 == r3) goto L_0x015c
            r4 = r0
            r6 = r1
        L_0x005b:
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r0     // Catch:{ all -> 0x0156 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.ad r0 = r0.f338423f     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0064
            goto L_0x0151
        L_0x0064:
            com.google.common.f.e r0 = f338418a     // Catch:{ all -> 0x0156 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0156 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0156 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0156 }
            r0.mo56378ag(r9, r5)     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "Requesting window token.."
            com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x0156 }
            r11 = 36023(0x8cb7, float:5.0479E-41)
            r10.<init>(r11)     // Catch:{ all -> 0x0156 }
            r0.mo56379ah(r10)     // Catch:{ all -> 0x0156 }
            r0.mo56386p(r9)     // Catch:{ all -> 0x0156 }
            r2.f338381a = r6     // Catch:{ all -> 0x0156 }
            r2.f338382b = r4     // Catch:{ all -> 0x0156 }
            r2.f338385e = r8     // Catch:{ all -> 0x0156 }
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r0     // Catch:{ all -> 0x0156 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.a r0 = r0.f338425h     // Catch:{ all -> 0x0156 }
            com.google.common.util.concurrent.cx r0 = r0.mo105511a()     // Catch:{ all -> 0x0156 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r2)     // Catch:{ all -> 0x0156 }
            if (r0 == r3) goto L_0x0155
            r3 = r4
            r2 = r6
        L_0x0098:
            r10 = r0
            android.os.IBinder r10 = (android.os.IBinder) r10     // Catch:{ all -> 0x0035 }
            com.google.common.f.e r0 = f338418a     // Catch:{ all -> 0x0035 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0035 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0035 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0035 }
            r0.mo56378ag(r4, r5)     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "Window token retrieved"
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0035 }
            r6 = 36024(0x8cb8, float:5.048E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0035 }
            r0.mo56379ah(r5)     // Catch:{ all -> 0x0035 }
            r0.mo56386p(r4)     // Catch:{ all -> 0x0035 }
            r0 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r0     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.a.a r0 = r0.f338429l     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "windowToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r4)     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.apj r4 = r0.f338277d     // Catch:{ all -> 0x0035 }
            com.google.apps.tiktok.account.AccountId r11 = r0.f338274a     // Catch:{ all -> 0x0035 }
            com.google.android.libraries.logging.ve.af r12 = r0.f338275b     // Catch:{ all -> 0x0035 }
            com.google.android.libraries.logging.ve.ab r13 = r0.f338276c     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.am r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.am     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r5 = r4.f199131a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r5.a     // Catch:{ all -> 0x0035 }
            g.a.a r5 = r5.j     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0035 }
            r14 = r5
            java.util.concurrent.Executor r14 = (java.util.concurrent.Executor) r14     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r5 = r4.f199131a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.anh r5 = r5.b     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqe r5 = r5.f198027a     // Catch:{ all -> 0x0035 }
            g.a.a r5 = r5.f199428eo     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0035 }
            r15 = r5
            com.google.android.apps.gsa.binaries.satin.app.apl r15 = (com.google.android.apps.gsa.binaries.satin.app.apl) r15     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r5 = r4.f199131a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r5.a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aso r5 = r5.d     // Catch:{ all -> 0x0035 }
            g.a.a r5 = r5.f201582bo     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0035 }
            r16 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.b.z r16 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121965z) r16     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r5 = r4.f199131a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r5 = r5.a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aso r5 = r5.d     // Catch:{ all -> 0x0035 }
            g.a.a r5 = r5.f201583bp     // Catch:{ all -> 0x0035 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ all -> 0x0035 }
            r17 = r5
            com.google.android.apps.search.assistant.platform.j.b.c.b.bk r17 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121941bk) r17     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqd r4 = r4.f199131a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.aqy r4 = r4.a     // Catch:{ all -> 0x0035 }
            com.google.android.apps.gsa.binaries.satin.app.ars r4 = r4.b     // Catch:{ all -> 0x0035 }
            g.a.a r4 = r4.f200094dB     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r4.mo17428b()     // Catch:{ all -> 0x0035 }
            r18 = r4
            com.google.android.apps.search.assistant.platform.j.b.c.b.ac r18 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121906ac) r18     // Catch:{ all -> 0x0035 }
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0035 }
            r4 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r4     // Catch:{ all -> 0x0035 }
            r4.f338423f = r0     // Catch:{ all -> 0x0035 }
            r4 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r4     // Catch:{ all -> 0x0035 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.c r4 = r4.f338426i     // Catch:{ all -> 0x0035 }
            com.google.android.libraries.search.assistant.invocation.f.b.b.b r4 = r4.mo39053a(r8)     // Catch:{ all -> 0x0035 }
            r4.mo39052d()     // Catch:{ all -> 0x0035 }
            r5 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r5 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r5     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.a r5 = r5.f338425h     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.m r6 = new com.google.android.apps.search.assistant.platform.j.b.c.b.m     // Catch:{ all -> 0x0035 }
            r8 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r8     // Catch:{ all -> 0x0035 }
            r6.<init>(r8, r4)     // Catch:{ all -> 0x0035 }
            java.io.Closeable r5 = r5.mo105512b(r6)     // Catch:{ all -> 0x0035 }
            r4.mo39051c(r5)     // Catch:{ all -> 0x0035 }
            r4 = r2
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r4     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.c.a r4 = r4.f338425h     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.k r5 = new com.google.android.apps.search.assistant.platform.j.b.c.b.k     // Catch:{ all -> 0x0035 }
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r2     // Catch:{ all -> 0x0035 }
            r5.<init>(r2)     // Catch:{ all -> 0x0035 }
            r4.mo105513c(r5)     // Catch:{ all -> 0x0035 }
            r4 = r3
        L_0x0151:
            r4.mo63026c(r7)
            return r0
        L_0x0155:
            return r3
        L_0x0156:
            r0 = move-exception
            r3 = r4
        L_0x0158:
            r3.mo63026c(r7)
            throw r0
        L_0x015c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o.mo105469a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo105470b(String str, C69626l lVar) {
        C121907ad adVar = this.f338423f;
        if (adVar == null) {
            C59052c cVar = (C59052c) f338418a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer");
            cVar.mo56379ah(new C59094n(36026));
            cVar.mo56389s("UI host was null, %s is not propagated", str);
            return;
        }
        lVar.mo5761a(adVar);
    }

    /* renamed from: c */
    public final C60870cx mo38977c(C129655b bVar, C34037b bVar2) {
        C69664n.m101061g(bVar2, "apaClient");
        if (this.f338427j) {
            return ((C33560a) this.f338428k.mo5768a()).mo38977c(bVar, bVar2);
        }
        return C71663i.m104692e(this.f338419b, (C71424ay) null, new C121947h(this, bVar, bVar2, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105471d(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b r10, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b r11, p5462h.p5466c.C69577g r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121948i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.platform.j.b.c.b.i r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121948i) r0
            int r1 = r0.f338399f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338399f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.b.i r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.i
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f338397d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338399f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r10 = r0.f338395b
            com.google.android.apps.search.assistant.platform.j.b.c.b.ad r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121907ad) r10
            java.lang.Object r11 = r0.f338394a
            com.google.android.libraries.search.assistant.invocation.o.a.b r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b) r11
            p5462h.C69714l.m101134b(r12)
            goto L_0x0091
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003b:
            java.lang.Object r11 = r0.f338396c
            java.lang.Object r10 = r0.f338395b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b) r10
            java.lang.Object r2 = r0.f338394a
            com.google.android.apps.search.assistant.platform.j.b.c.b.o r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o) r2
            p5462h.C69714l.m101134b(r12)
            goto L_0x007e
        L_0x0049:
            p5462h.C69714l.m101134b(r12)
            com.google.common.f.e r12 = f338418a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "INV.AssistLayer"
            r12.mo56378ag(r2, r6)
            java.lang.String r2 = r11.name()
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 36025(0x8cb9, float:5.0482E-41)
            r6.<init>(r7)
            r12.mo56379ah(r6)
            java.lang.String r6 = "Client %s requested to show a fragment."
            r12.mo56389s(r6, r2)
            r0.f338394a = r9
            r0.f338395b = r10
            r0.f338396c = r11
            r0.f338399f = r5
            java.lang.Object r12 = r9.mo105469a(r0)
            if (r12 == r1) goto L_0x009d
            r2 = r9
        L_0x007e:
            com.google.android.apps.search.assistant.platform.j.b.c.b.ad r12 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121907ad) r12
            r0.f338394a = r11
            r0.f338395b = r12
            r0.f338396c = r3
            r0.f338399f = r4
            java.lang.Object r10 = r2.mo105472e(r10, r0)
            if (r10 == r1) goto L_0x009d
            r8 = r12
            r12 = r10
            r10 = r8
        L_0x0091:
            com.google.android.libraries.search.assistant.invocation.c.a.b r12 = (com.google.android.libraries.search.assistant.invocation.p2598c.p2599a.C33561b) r12
            android.support.v4.app.Fragment r0 = r12.f89743a
            com.google.android.libraries.search.assistant.invocation.c.a.d r12 = r12.f89744b
            com.google.android.libraries.search.assistant.invocation.o.a.b r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b) r11
            r10.mo105436d(r0, r11, r12)
            return r3
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o.mo105471d(com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b, com.google.android.libraries.search.assistant.invocation.o.a.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105472e(com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9839d.C129655b r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121902a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.b.a r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121902a) r0
            int r1 = r0.f338273c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338273c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.b.a r0 = new com.google.android.apps.search.assistant.platform.j.b.c.b.a
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f338271a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338273c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x004a
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.platform.j.b.c.b.b r6 = new com.google.android.apps.search.assistant.platform.j.b.c.b.b
            r6.<init>(r5)
            java.util.concurrent.Executor r5 = r4.f338420c
            java.util.concurrent.Callable r6 = com.google.apps.tiktok.tracing.C47810es.m84978r(r6)
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60856cj.m92904m(r6, r5)
            r0.f338273c = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.String r5 = "fragmentFactory: AssistL…() }, uiExecutor).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b.C121954o.mo105472e(com.google.android.apps.search.assistant.surfaces.voice.ui.host.d.b, h.c.g):java.lang.Object");
    }
}
