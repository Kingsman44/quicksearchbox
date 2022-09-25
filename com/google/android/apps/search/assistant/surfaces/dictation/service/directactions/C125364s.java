package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import com.google.common.p4543n.p4548e.p4549a.C59425c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4648g.p4649a.C61634a;
import com.google.p4648g.p4649a.C61637d;
import com.google.protobuf.C62910ar;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s */
/* compiled from: PG */
public final class C125364s implements C125350e {

    /* renamed from: a */
    public final C71422aw f345763a;

    /* renamed from: b */
    public final C125314ab f345764b;

    /* renamed from: c */
    public final C71788b f345765c;

    /* renamed from: d */
    public C71604be f345766d;

    /* renamed from: e */
    private final C62910ar f345767e;

    /* renamed from: f */
    private final C69626l f345768f = new C59425c(new C125351f(this, (C69577g) null));

    /* renamed from: g */
    private final C61634a f345769g;

    /* renamed from: h */
    private List f345770h;

    /* renamed from: i */
    private boolean f345771i;

    /* renamed from: j */
    private final C71788b f345772j;

    public C125364s(C62910ar arVar, C71422aw awVar, C125314ab abVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f345767e = arVar;
        this.f345763a = awVar;
        this.f345764b = abVar;
        C71799m mVar = new C71799m();
        this.f345765c = mVar;
        C69664n.m101061g(mVar, "<this>");
        this.f345769g = new C61637d(mVar);
        this.f345772j = new C71799m();
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo106933a() {
        return C71663i.m104688a(C71803m.m105042c(this.f345763a, (C69585o) null, (C71424ay) null, new C125349d(this, (C69577g) null), 3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106934b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125352g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.g r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125352g) r0
            int r1 = r0.f345729c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345729c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.g r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f345727a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345729c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x004a
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.protobuf.ar r6 = r5.f345767e
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.h r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.h
            r4 = 0
            r2.<init>(r5, r4)
            r0.f345729c = r3
            j$.time.Duration r6 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r6)
            long r3 = com.google.common.p4580v.p4582b.C60942a.m93083a(r6)
            java.lang.Object r6 = kotlinx.coroutines.C71745ea.m104930b(r3, r2, r0)
            if (r6 == r1) goto L_0x0069
        L_0x004a:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L_0x0068
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36547(0x8ec3, float:5.1213E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Timed out waiting for DirectActions, proceeding without [SD]"
            r6.mo56386p(r0)
            h.a.am r6 = p5462h.p5463a.C69496am.f185918a
        L_0x0068:
            return r6
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s.mo106934b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo106935c() {
        C71803m.m105043d(this.f345763a, (C69585o) null, (C71424ay) null, new C125358m(this, (C69577g) null), 3);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v43, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v50, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v52, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r10 = th;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345771i = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r2.mo63026c((java.lang.Object) null);
        r10 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345772j;
        r0.f345734a = r5;
        r0.f345735b = r10;
        r0.f345740g = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009a, code lost:
        if (r10.mo63025b((java.lang.Object) null, r0) == r1) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r3).f345765c;
        r0.f345734a = r3;
        r0.f345735b = r10;
        r0.f345736c = r2;
        r0.f345740g = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r2.mo63025b((java.lang.Object) null, r0) == r1) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b1, code lost:
        r5 = r3;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        if (((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345771i != false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ba, code lost:
        r10 = p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bc, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r2.mo63026c((java.lang.Object) null);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bf, code lost:
        r3.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345770h = null;
        ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345771i = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.mo63026c((java.lang.Object) null);
        r10 = (com.google.common.p4526f.C59052c) com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a.mo56224b();
        r10.mo56379ah(new com.google.common.p4526f.C59094n(36548));
        r10.mo56386p("Requesting new direct actions from the app [SD]");
        r2 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345764b;
        r10 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5).f345768f;
        r0.f345734a = r5;
        r0.f345735b = r3;
        r0.f345736c = r2;
        r0.f345740g = 4;
        r10 = r10.mo5761a(r0);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0100, code lost:
        if (r10 == r1) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        r10 = r2.mo39117e((java.lang.String) r10);
        p5462h.p5473f.p5475b.C69664n.m101060f(r10, "directActionsAccessor.re…rectActions(activityId())");
        r0.f345734a = r5;
        r0.f345735b = r3;
        r0.f345736c = null;
        r0.f345740g = 5;
        r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        if (r10 == r1) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        r2 = r5;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        r10 = (com.google.common.p4522b.C58485gu) r10;
        r5 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r2).f345765c;
        r0.f345734a = r2;
        r0.f345735b = r3;
        r0.f345736c = r10;
        r0.f345737d = r5;
        r0.f345740g = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0133, code lost:
        if (r5.mo63025b((java.lang.Object) null, r0) == r1) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0135, code lost:
        r0 = r2;
        r1 = r5;
        r2 = r10;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        if (((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r0).f345771i != false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x013f, code lost:
        r10 = (com.google.common.p4526f.C59052c) com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a.mo56224b();
        r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126289b(new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125356k(r2));
        r10.mo56379ah(new com.google.common.p4526f.C59094n(36549));
        r10.mo56389s("Received direct actions from the app: %s [SD]", r7);
        ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r0).f345770h = r2;
        r10 = ((com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r0).f345769g;
        r0 = ((com.google.p4648g.p4649a.C61637d) r10).f166536b;
        r0.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r2 = ((com.google.p4648g.p4649a.C61637d) r10).f166537c;
        ((com.google.p4648g.p4649a.C61637d) r10).f166537c = new p5462h.p5463a.C69530n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0187, code lost:
        if (r2.isEmpty() != false) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0189, code lost:
        ((kotlinx.coroutines.C71646cs) r2.mo61315g()).mo62909P(p5462h.C69788q.f186170a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0195, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0196, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0199, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019a, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        r1.mo63026c((java.lang.Object) null);
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019d, code lost:
        r3.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a2, code lost:
        return p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a3, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a4, code lost:
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r1.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a7, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a9, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01aa, code lost:
        r2.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ad, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ae, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b0, code lost:
        r3 = r10;
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b2, code lost:
        r3.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b5, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b7, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b8, code lost:
        r2.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01bb, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0035, B:40:0x00b4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106936d(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125355j
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.j r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125355j) r0
            int r1 = r0.f345740g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345740g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.j r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.j
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f345738e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345740g
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0068;
                case 2: goto L_0x005f;
                case 3: goto L_0x0053;
                case 4: goto L_0x0046;
                case 5: goto L_0x003d;
                case 6: goto L_0x002b;
                default: goto L_0x0023;
            }
        L_0x0023:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x002b:
            java.lang.Object r1 = r0.f345737d
            java.lang.Object r2 = r0.f345736c
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            java.lang.Object r3 = r0.f345735b
            java.lang.Object r0 = r0.f345734a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x003a }
            goto L_0x0138
        L_0x003a:
            r10 = move-exception
            goto L_0x01b2
        L_0x003d:
            java.lang.Object r3 = r0.f345735b
            java.lang.Object r2 = r0.f345734a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x003a }
            goto L_0x011d
        L_0x0046:
            java.lang.Object r2 = r0.f345736c
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ab r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125314ab) r2
            java.lang.Object r3 = r0.f345735b
            java.lang.Object r5 = r0.f345734a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x003a }
            goto L_0x0102
        L_0x0053:
            java.lang.Object r2 = r0.f345736c
            kotlinx.coroutines.j.b r2 = (kotlinx.coroutines.p5584j.C71788b) r2
            java.lang.Object r3 = r0.f345735b
            java.lang.Object r5 = r0.f345734a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x003a }
            goto L_0x00b3
        L_0x005f:
            java.lang.Object r2 = r0.f345735b
            java.lang.Object r3 = r0.f345734a
            p5462h.C69714l.m101134b(r10)
            r10 = r2
            goto L_0x009d
        L_0x0068:
            java.lang.Object r2 = r0.f345735b
            java.lang.Object r5 = r0.f345734a
            p5462h.C69714l.m101134b(r10)
            goto L_0x0082
        L_0x0070:
            p5462h.C69714l.m101134b(r10)
            kotlinx.coroutines.j.b r2 = r9.f345765c
            r0.f345734a = r9
            r0.f345735b = r2
            r0.f345740g = r3
            java.lang.Object r10 = r2.mo63025b(r4, r0)
            if (r10 == r1) goto L_0x01bc
            r5 = r9
        L_0x0082:
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01b7 }
            r10.f345771i = r3     // Catch:{ all -> 0x01b7 }
            r2.mo63026c(r4)
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10
            kotlinx.coroutines.j.b r10 = r10.f345772j
            r0.f345734a = r5
            r0.f345735b = r10
            r2 = 2
            r0.f345740g = r2
            java.lang.Object r2 = r10.mo63025b(r4, r0)
            if (r2 == r1) goto L_0x01b6
            r3 = r5
        L_0x009d:
            r2 = r3
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r2     // Catch:{ all -> 0x01af }
            kotlinx.coroutines.j.b r2 = r2.f345765c     // Catch:{ all -> 0x01af }
            r0.f345734a = r3     // Catch:{ all -> 0x01af }
            r0.f345735b = r10     // Catch:{ all -> 0x01af }
            r0.f345736c = r2     // Catch:{ all -> 0x01af }
            r5 = 3
            r0.f345740g = r5     // Catch:{ all -> 0x01af }
            java.lang.Object r5 = r2.mo63025b(r4, r0)     // Catch:{ all -> 0x01af }
            if (r5 == r1) goto L_0x01ae
            r5 = r3
            r3 = r10
        L_0x00b3:
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01a9 }
            boolean r10 = r10.f345771i     // Catch:{ all -> 0x01a9 }
            if (r10 != 0) goto L_0x00c3
            h.q r10 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x01a9 }
            r2.mo63026c(r4)     // Catch:{ all -> 0x003a }
            r3.mo63026c(r4)
            return r10
        L_0x00c3:
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01a9 }
            r10.f345770h = r4     // Catch:{ all -> 0x01a9 }
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01a9 }
            r6 = 0
            r10.f345771i = r6     // Catch:{ all -> 0x01a9 }
            r2.mo63026c(r4)     // Catch:{ all -> 0x003a }
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a     // Catch:{ all -> 0x003a }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x003a }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "Requesting new direct actions from the app [SD]"
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x003a }
            r7 = 36548(0x8ec4, float:5.1215E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x003a }
            r10.mo56379ah(r6)     // Catch:{ all -> 0x003a }
            r10.mo56386p(r2)     // Catch:{ all -> 0x003a }
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x003a }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ab r2 = r10.f345764b     // Catch:{ all -> 0x003a }
            r10 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x003a }
            h.f.a.l r10 = r10.f345768f     // Catch:{ all -> 0x003a }
            r0.f345734a = r5     // Catch:{ all -> 0x003a }
            r0.f345735b = r3     // Catch:{ all -> 0x003a }
            r0.f345736c = r2     // Catch:{ all -> 0x003a }
            r6 = 4
            r0.f345740g = r6     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = r10.mo5761a(r0)     // Catch:{ all -> 0x003a }
            if (r10 == r1) goto L_0x01a8
        L_0x0102:
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x003a }
            com.google.common.util.concurrent.cx r10 = r2.mo39117e(r10)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "directActionsAccessor.re…rectActions(activityId())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)     // Catch:{ all -> 0x003a }
            r0.f345734a = r5     // Catch:{ all -> 0x003a }
            r0.f345735b = r3     // Catch:{ all -> 0x003a }
            r0.f345736c = r4     // Catch:{ all -> 0x003a }
            r2 = 5
            r0.f345740g = r2     // Catch:{ all -> 0x003a }
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r10, r0)     // Catch:{ all -> 0x003a }
            if (r10 == r1) goto L_0x01a8
            r2 = r5
        L_0x011d:
            com.google.common.b.gu r10 = (com.google.common.p4522b.C58485gu) r10     // Catch:{ all -> 0x003a }
            r5 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r5     // Catch:{ all -> 0x003a }
            kotlinx.coroutines.j.b r5 = r5.f345765c     // Catch:{ all -> 0x003a }
            r0.f345734a = r2     // Catch:{ all -> 0x003a }
            r0.f345735b = r3     // Catch:{ all -> 0x003a }
            r0.f345736c = r10     // Catch:{ all -> 0x003a }
            r0.f345737d = r5     // Catch:{ all -> 0x003a }
            r6 = 6
            r0.f345740g = r6     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r5.mo63025b(r4, r0)     // Catch:{ all -> 0x003a }
            if (r0 == r1) goto L_0x01a8
            r0 = r2
            r1 = r5
            r2 = r10
        L_0x0138:
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01a3 }
            boolean r10 = r10.f345771i     // Catch:{ all -> 0x01a3 }
            if (r10 != 0) goto L_0x019a
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a     // Catch:{ all -> 0x01a3 }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x01a3 }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x01a3 }
            java.lang.String r5 = "Received direct actions from the app: %s [SD]"
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.k r6 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.k     // Catch:{ all -> 0x01a3 }
            r6.<init>(r2)     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.a.b r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.s.a.b     // Catch:{ all -> 0x01a3 }
            r7.<init>(r6)     // Catch:{ all -> 0x01a3 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x01a3 }
            r8 = 36549(0x8ec5, float:5.1216E-41)
            r6.<init>(r8)     // Catch:{ all -> 0x01a3 }
            r10.mo56379ah(r6)     // Catch:{ all -> 0x01a3 }
            r10.mo56389s(r5, r7)     // Catch:{ all -> 0x01a3 }
            r10 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r10 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r10     // Catch:{ all -> 0x01a3 }
            r10.f345770h = r2     // Catch:{ all -> 0x01a3 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r0     // Catch:{ all -> 0x01a3 }
            com.google.g.a.a r10 = r0.f345769g     // Catch:{ all -> 0x01a3 }
            r0 = r10
            com.google.g.a.d r0 = (com.google.p4648g.p4649a.C61637d) r0     // Catch:{ all -> 0x01a3 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f166536b     // Catch:{ all -> 0x01a3 }
            r0.lock()     // Catch:{ all -> 0x01a3 }
            r2 = r10
            com.google.g.a.d r2 = (com.google.p4648g.p4649a.C61637d) r2     // Catch:{ all -> 0x0195 }
            h.a.n r2 = r2.f166537c     // Catch:{ all -> 0x0195 }
            h.a.n r5 = new h.a.n     // Catch:{ all -> 0x0195 }
            r5.<init>()     // Catch:{ all -> 0x0195 }
            com.google.g.a.d r10 = (com.google.p4648g.p4649a.C61637d) r10     // Catch:{ all -> 0x0195 }
            r10.f166537c = r5     // Catch:{ all -> 0x0195 }
            r0.unlock()     // Catch:{ all -> 0x01a3 }
        L_0x0183:
            boolean r10 = r2.isEmpty()     // Catch:{ all -> 0x01a3 }
            if (r10 != 0) goto L_0x019a
            java.lang.Object r10 = r2.mo61315g()     // Catch:{ all -> 0x01a3 }
            kotlinx.coroutines.cs r10 = (kotlinx.coroutines.C71646cs) r10     // Catch:{ all -> 0x01a3 }
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x01a3 }
            r10.mo62909P(r0)     // Catch:{ all -> 0x01a3 }
            goto L_0x0183
        L_0x0195:
            r10 = move-exception
            r0.unlock()     // Catch:{ all -> 0x01a3 }
            throw r10     // Catch:{ all -> 0x01a3 }
        L_0x019a:
            r1.mo63026c(r4)     // Catch:{ all -> 0x003a }
            r3.mo63026c(r4)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x01a3:
            r10 = move-exception
            r1.mo63026c(r4)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x01a8:
            return r1
        L_0x01a9:
            r10 = move-exception
            r2.mo63026c(r4)     // Catch:{ all -> 0x003a }
            throw r10     // Catch:{ all -> 0x003a }
        L_0x01ae:
            return r1
        L_0x01af:
            r0 = move-exception
            r3 = r10
            r10 = r0
        L_0x01b2:
            r3.mo63026c(r4)
            throw r10
        L_0x01b6:
            return r1
        L_0x01b7:
            r10 = move-exception
            r2.mo63026c(r4)
            throw r10
        L_0x01bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s.mo106936d(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106937e(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125357l
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.l r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125357l) r0
            int r1 = r0.f345746e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f345746e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.l r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.l
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f345744c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f345746e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r2 = r0.f345743b
            java.lang.Object r4 = r0.f345742a
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x002f }
            goto L_0x0053
        L_0x002f:
            r7 = move-exception
            goto L_0x0071
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            java.lang.Object r2 = r0.f345743b
            java.lang.Object r4 = r0.f345742a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0053
        L_0x0041:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r2 = r6.f345765c
            r0.f345742a = r6
            r0.f345743b = r2
            r0.f345746e = r4
            java.lang.Object r7 = r2.mo63025b(r5, r0)
            if (r7 == r1) goto L_0x0075
            r4 = r6
        L_0x0053:
            r7 = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r7     // Catch:{ all -> 0x002f }
            java.util.List r7 = r7.f345770h     // Catch:{ all -> 0x002f }
            if (r7 == 0) goto L_0x005e
            r2.mo63026c(r5)
            return r7
        L_0x005e:
            r7 = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r7 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r7     // Catch:{ all -> 0x002f }
            com.google.g.a.a r7 = r7.f345769g     // Catch:{ all -> 0x002f }
            r0.f345742a = r4     // Catch:{ all -> 0x002f }
            r0.f345743b = r2     // Catch:{ all -> 0x002f }
            r0.f345746e = r3     // Catch:{ all -> 0x002f }
            java.lang.Object r7 = r7.mo58155a(r0)     // Catch:{ all -> 0x002f }
            if (r7 == r1) goto L_0x0070
            goto L_0x0053
        L_0x0070:
            return r1
        L_0x0071:
            r2.mo63026c(r5)
            throw r7
        L_0x0075:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s.mo106937e(h.c.g):java.lang.Object");
    }
}
