package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34239av;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.v */
/* compiled from: PG */
public final class C120076v implements C120057c, C34421k {

    /* renamed from: d */
    private static final C59071e f334275d = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f334276a;

    /* renamed from: b */
    public final C120045ag f334277b;

    /* renamed from: c */
    public final C34239av f334278c;

    /* renamed from: e */
    private final C39141kp f334279e;

    /* renamed from: f */
    private final C58889cz f334280f;

    /* renamed from: g */
    private final Duration f334281g;

    public C120076v(C120045ag agVar, C34239av avVar, C71422aw awVar, C39141kp kpVar, C58889cz czVar, C62910ar arVar) {
        C69664n.m101061g(agVar, "conformityService");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(czVar, "ticker");
        this.f334277b = agVar;
        this.f334278c = avVar;
        this.f334276a = awVar;
        this.f334279e = kpVar;
        this.f334280f = czVar;
        Duration d = C62950b.m95473d(arVar);
        C69664n.m101060f(d, "toJavaDuration(conformityAwaitDuration)");
        this.f334281g = d;
    }

    /* renamed from: d */
    private final Object m198992d(C120079y yVar, C120124o oVar, C69577g gVar) {
        C59052c cVar = (C59052c) f334275d.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        cVar.mo56379ah(new C59094n(34642));
        cVar.mo56389s("ConnectedSession#checkVariance(%s)", oVar);
        if (yVar.mo104645a() != oVar) {
            m198993e(this, yVar, oVar, true);
            Object b = yVar.mo104646b(gVar);
            return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
        }
        m198993e(this, yVar, oVar, false);
        return C69788q.f186170a;
    }

    /* renamed from: e */
    private static final void m198993e(C120076v vVar, C120079y yVar, C120124o oVar, boolean z) {
        C39141kp kpVar = vVar.f334279e;
        ((C19567d) kpVar.f103048t.mo6453a()).mo24822a(1, Boolean.valueOf(z), yVar.mo104645a().name(), oVar.name());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.google.android.apps.search.assistant.platform.c.a.a.a.b.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.android.apps.search.assistant.platform.c.c.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.apps.search.assistant.platform.c.c.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.google.android.apps.search.assistant.platform.c.a.a.a.b.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: com.google.android.apps.search.assistant.platform.c.c.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.google.android.apps.search.assistant.platform.c.c.a.a.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.google.android.apps.search.assistant.platform.c.a.a.a.b.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104657b(com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120072r
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.r r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120072r) r0
            int r1 = r0.f334263f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f334263f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.r r0 = new com.google.android.apps.search.assistant.platform.c.a.a.a.b.r
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f334261d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f334263f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            p5462h.C69714l.m101134b(r8)
            goto L_0x008a
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            java.lang.Object r7 = r0.f334260c
            java.lang.Object r2 = r0.f334259b
            java.lang.Object r4 = r0.f334258a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0076
        L_0x003f:
            java.lang.Object r7 = r0.f334259b
            java.lang.Object r2 = r0.f334258a
            p5462h.C69714l.m101134b(r8)
            goto L_0x005b
        L_0x0047:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.ag r8 = r6.f334277b
            kotlinx.coroutines.b.du r8 = r8.f334212c
            r0.f334258a = r6
            r0.f334259b = r7
            r0.f334263f = r5
            java.lang.Object r8 = kotlinx.coroutines.p5574b.C71517bu.m104350a(r8, r0)
            if (r8 == r1) goto L_0x008d
            r2 = r6
        L_0x005b:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.y r8 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120079y) r8
            if (r8 != 0) goto L_0x0062
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0062:
            r0.f334258a = r2
            r0.f334259b = r7
            r0.f334260c = r8
            r0.f334263f = r4
            r4 = r7
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r4 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r4
            java.lang.Object r4 = r8.mo104647c(r4, r0)
            if (r4 == r1) goto L_0x008d
            r4 = r2
            r2 = r7
            r7 = r8
        L_0x0076:
            r8 = 0
            r0.f334258a = r8
            r0.f334259b = r8
            r0.f334260c = r8
            r0.f334263f = r3
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r4 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r4
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r2 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r2
            java.lang.Object r7 = r4.m198992d(r7, r2, r0)
            if (r7 != r1) goto L_0x008a
            return r1
        L_0x008a:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x008d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v.mo104657b(com.google.android.apps.search.assistant.platform.c.c.a.a.o, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f334276a, (C71424ay) null, new C120071q(this, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.android.apps.search.assistant.platform.c.a.a.a.b.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.google.android.apps.search.assistant.platform.c.a.a.a.b.v} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:46|45|47|79|80|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017c, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b0, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01b2, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x014a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd A[Catch:{ dx -> 0x0142, all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104654a(com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o r18, p5462h.p5466c.C69577g r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r0 = r19
            boolean r3 = r0 instanceof com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120073s
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.s r3 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120073s) r3
            int r4 = r3.f334269f
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f334269f = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.s r3 = new com.google.android.apps.search.assistant.platform.c.a.a.a.b.s
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.f334267d
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f334269f
            java.lang.String r6 = "TRG.VIS.Conformity"
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            if (r5 == 0) goto L_0x00a0
            if (r5 == r11) goto L_0x0080
            if (r5 == r10) goto L_0x0072
            if (r5 == r9) goto L_0x0062
            if (r5 == r8) goto L_0x004f
            if (r5 != r7) goto L_0x0047
            java.lang.Object r2 = r3.f334266c
            java.lang.Object r4 = r3.f334265b
            java.lang.Object r3 = r3.f334264a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0192
        L_0x0042:
            r0 = move-exception
            r5 = r2
            r2 = r4
            goto L_0x01b3
        L_0x0047:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004f:
            java.lang.Object r2 = r3.f334266c
            java.lang.Object r5 = r3.f334265b
            java.lang.Object r6 = r3.f334264a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x005f }
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x017d
        L_0x005f:
            r0 = move-exception
            r3 = r6
            goto L_0x0091
        L_0x0062:
            java.lang.Object r2 = r3.f334266c
            java.lang.Object r5 = r3.f334265b
            java.lang.Object r9 = r3.f334264a
            p5462h.C69714l.m101134b(r0)     // Catch:{ dx -> 0x0070, all -> 0x006d }
            goto L_0x0128
        L_0x006d:
            r0 = move-exception
            r3 = r9
            goto L_0x0091
        L_0x0070:
            r10 = r9
            goto L_0x0099
        L_0x0072:
            java.lang.Object r2 = r3.f334266c
            java.lang.Object r5 = r3.f334265b
            java.lang.Object r10 = r3.f334264a
            p5462h.C69714l.m101134b(r0)     // Catch:{ dx -> 0x0099, all -> 0x007d }
            goto L_0x00f7
        L_0x007d:
            r0 = move-exception
            r3 = r10
            goto L_0x0091
        L_0x0080:
            java.lang.Object r2 = r3.f334266c
            java.lang.Object r5 = r3.f334265b
            java.lang.Object r11 = r3.f334264a
            p5462h.C69714l.m101134b(r0)     // Catch:{ dx -> 0x0098, all -> 0x008f }
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x00d9
        L_0x008f:
            r0 = move-exception
            r3 = r11
        L_0x0091:
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x01b3
        L_0x0098:
            r10 = r11
        L_0x0099:
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x014a
        L_0x00a0:
            p5462h.C69714l.m101134b(r0)
            com.google.common.f.e r0 = f334275d
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r5, r6)
            com.google.common.f.n r5 = new com.google.common.f.n
            r12 = 34643(0x8753, float:4.8545E-41)
            r5.<init>(r12)
            r0.mo56379ah(r5)
            java.lang.String r5 = "#satisfyVariance(%s)"
            r0.mo56389s(r5, r2)
            com.google.common.base.cz r0 = r1.f334280f
            com.google.common.base.ci r5 = com.google.common.base.C58872ci.m90947d(r0)
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.ag r0 = r1.f334277b     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            kotlinx.coroutines.b.du r0 = r0.f334212c     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            r3.f334264a = r1     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            r3.f334265b = r2     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            r3.f334266c = r5     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            r3.f334269f = r11     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            java.lang.Object r0 = kotlinx.coroutines.p5574b.C71517bu.m104350a(r0, r3)     // Catch:{ dx -> 0x0149, all -> 0x0145 }
            if (r0 == r4) goto L_0x0144
            r11 = r1
        L_0x00d9:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.y r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120079y) r0     // Catch:{ dx -> 0x0142, all -> 0x013e }
            if (r0 == 0) goto L_0x00fe
            r3.f334264a = r11     // Catch:{ dx -> 0x0142, all -> 0x013e }
            r3.f334265b = r2     // Catch:{ dx -> 0x0142, all -> 0x013e }
            r3.f334266c = r5     // Catch:{ dx -> 0x0142, all -> 0x013e }
            r3.f334269f = r10     // Catch:{ dx -> 0x0142, all -> 0x013e }
            r10 = r11
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r10 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r10     // Catch:{ dx -> 0x0142, all -> 0x013e }
            r12 = r2
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r12 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r12     // Catch:{ dx -> 0x0142, all -> 0x013e }
            java.lang.Object r0 = r10.m198992d(r0, r12, r3)     // Catch:{ dx -> 0x0142, all -> 0x013e }
            if (r0 == r4) goto L_0x00fd
            r10 = r11
            r16 = r5
            r5 = r2
            r2 = r16
        L_0x00f7:
            r16 = r5
            r5 = r2
            r2 = r16
            goto L_0x00ff
        L_0x00fd:
            return r4
        L_0x00fe:
            r10 = r11
        L_0x00ff:
            r0 = r10
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r0     // Catch:{ dx -> 0x014a }
            j$.time.Duration r0 = r0.f334281g     // Catch:{ dx -> 0x014a }
            long r11 = r0.toMillis()     // Catch:{ dx -> 0x014a }
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.u r0 = new com.google.android.apps.search.assistant.platform.c.a.a.a.b.u     // Catch:{ dx -> 0x014a }
            r13 = r10
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r13 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r13     // Catch:{ dx -> 0x014a }
            r14 = r2
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r14 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r14     // Catch:{ dx -> 0x014a }
            r15 = 0
            r0.<init>(r13, r14, r15)     // Catch:{ dx -> 0x014a }
            r3.f334264a = r10     // Catch:{ dx -> 0x014a }
            r3.f334265b = r2     // Catch:{ dx -> 0x014a }
            r3.f334266c = r5     // Catch:{ dx -> 0x014a }
            r3.f334269f = r9     // Catch:{ dx -> 0x014a }
            java.lang.Object r0 = kotlinx.coroutines.C71745ea.m104929a(r11, r0, r3)     // Catch:{ dx -> 0x014a }
            if (r0 == r4) goto L_0x013d
            r9 = r10
            r16 = r5
            r5 = r2
            r2 = r16
        L_0x0128:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r9 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r9
            com.google.android.libraries.search.logging.d.kp r0 = r9.f334279e
            com.google.common.base.ci r2 = (com.google.common.base.C58872ci) r2
            double r2 = com.google.android.libraries.search.assistant.invocation.p2641k.p2645d.C33929a.m62584a(r2)
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r5 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r5
            java.lang.String r4 = r5.name()
            r0.mo41679M(r2, r4)
            goto L_0x01aa
        L_0x013d:
            return r4
        L_0x013e:
            r0 = move-exception
            r3 = r11
            goto L_0x01b3
        L_0x0142:
            r10 = r11
            goto L_0x014a
        L_0x0144:
            return r4
        L_0x0145:
            r0 = move-exception
            r3 = r1
            goto L_0x01b3
        L_0x0149:
            r10 = r1
        L_0x014a:
            com.google.common.f.e r0 = f334275d     // Catch:{ all -> 0x01b1 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x01b1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x01b1 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01b1 }
            r0.mo56378ag(r9, r6)     // Catch:{ all -> 0x01b1 }
            java.lang.String r6 = "Session conformity(%s) await timed out!"
            com.google.common.f.n r9 = new com.google.common.f.n     // Catch:{ all -> 0x01b1 }
            r11 = 34644(0x8754, float:4.8547E-41)
            r9.<init>(r11)     // Catch:{ all -> 0x01b1 }
            r0.mo56379ah(r9)     // Catch:{ all -> 0x01b1 }
            r0.mo56389s(r6, r2)     // Catch:{ all -> 0x01b1 }
            r0 = r10
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r0     // Catch:{ all -> 0x01b1 }
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.ag r0 = r0.f334277b     // Catch:{ all -> 0x01b1 }
            kotlinx.coroutines.b.du r0 = r0.f334212c     // Catch:{ all -> 0x01b1 }
            r3.f334264a = r10     // Catch:{ all -> 0x01b1 }
            r3.f334265b = r2     // Catch:{ all -> 0x01b1 }
            r3.f334266c = r5     // Catch:{ all -> 0x01b1 }
            r3.f334269f = r8     // Catch:{ all -> 0x01b1 }
            java.lang.Object r0 = kotlinx.coroutines.p5574b.C71517bu.m104350a(r0, r3)     // Catch:{ all -> 0x01b1 }
            if (r0 == r4) goto L_0x01b0
            r6 = r10
        L_0x017d:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.y r0 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120079y) r0     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x0197
            r3.f334264a = r6     // Catch:{ all -> 0x01ad }
            r3.f334265b = r2     // Catch:{ all -> 0x01ad }
            r3.f334266c = r5     // Catch:{ all -> 0x01ad }
            r3.f334269f = r7     // Catch:{ all -> 0x01ad }
            java.lang.Object r0 = r0.mo104648d()     // Catch:{ all -> 0x01ad }
            if (r0 == r4) goto L_0x0196
            r4 = r2
            r2 = r5
            r3 = r6
        L_0x0192:
            r5 = r2
            r6 = r3
            r2 = r4
            goto L_0x0197
        L_0x0196:
            return r4
        L_0x0197:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r6 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r6
            com.google.android.libraries.search.logging.d.kp r0 = r6.f334279e
            com.google.common.base.ci r5 = (com.google.common.base.C58872ci) r5
            double r3 = com.google.android.libraries.search.assistant.invocation.p2641k.p2645d.C33929a.m62584a(r5)
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r2 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r2
            java.lang.String r2 = r2.name()
            r0.mo41679M(r3, r2)
        L_0x01aa:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x01ad:
            r0 = move-exception
            r3 = r6
            goto L_0x01b3
        L_0x01b0:
            return r4
        L_0x01b1:
            r0 = move-exception
            r3 = r10
        L_0x01b3:
            com.google.android.apps.search.assistant.platform.c.a.a.a.b.v r3 = (com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v) r3
            com.google.android.libraries.search.logging.d.kp r3 = r3.f334279e
            com.google.common.base.ci r5 = (com.google.common.base.C58872ci) r5
            double r4 = com.google.android.libraries.search.assistant.invocation.p2641k.p2645d.C33929a.m62584a(r5)
            com.google.android.apps.search.assistant.platform.c.c.a.a.o r2 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o) r2
            java.lang.String r2 = r2.name()
            r3.mo41679M(r4, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b.C120076v.mo104654a(com.google.android.apps.search.assistant.platform.c.c.a.a.o, h.c.g):java.lang.Object");
    }
}
