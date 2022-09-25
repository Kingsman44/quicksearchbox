package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b;

import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34108q;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.C37346ak;
import com.google.android.libraries.search.p2904c.p2913d.p2914a.C37482d;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.b.j */
/* compiled from: PG */
public final class C121749j implements C33733c {

    /* renamed from: a */
    public static final C59071e f337848a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f337849b;

    /* renamed from: c */
    public final C34053bp f337850c;

    /* renamed from: d */
    public final C71788b f337851d = new C71799m();

    /* renamed from: e */
    public C37346ak f337852e;

    /* renamed from: f */
    public C37325aa f337853f;

    /* renamed from: g */
    public C37325aa f337854g;

    /* renamed from: h */
    public boolean f337855h;

    /* renamed from: i */
    public C71816z f337856i;

    /* renamed from: j */
    private final C34108q f337857j;

    /* renamed from: k */
    private final C37346ak f337858k;

    /* renamed from: l */
    private final String f337859l;

    /* renamed from: m */
    private final C37482d f337860m;

    public C121749j(C37482d dVar, C71422aw awVar, C34108q qVar, C34053bp bpVar) {
        C69664n.m101061g(dVar, "audioFocusClient");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(qVar, "initialAudioFocusConfig");
        C69664n.m101061g(bpVar, "token");
        this.f337860m = dVar;
        this.f337849b = awVar;
        this.f337857j = qVar;
        this.f337850c = bpVar;
        C37346ak akVar = qVar.f90845c;
        akVar = akVar == null ? C37346ak.f99197g : akVar;
        C69664n.m101060f(akVar, "initialAudioFocusConfig.audioFocusRequestParams");
        this.f337858k = akVar;
        this.f337856i = new C71816z();
        this.f337859l = "AudioFocusResource";
    }

    /* renamed from: a */
    public final Object mo39054a(C69577g gVar) {
        return C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39055b(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121746g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.b.b.g r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121746g) r0
            int r1 = r0.f337838e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337838e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.b.g r0 = new com.google.android.apps.search.assistant.platform.j.b.b.b.g
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f337836c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337838e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f337834a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0064
        L_0x002f:
            r8 = move-exception
            goto L_0x006f
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f337835b
            java.lang.Object r4 = r0.f337834a
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4
            p5462h.C69714l.m101134b(r8)
            r8 = r2
            goto L_0x0057
        L_0x0044:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r7.f337851d
            r0.f337834a = r7
            r0.f337835b = r8
            r0.f337838e = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r4 = r7
        L_0x0057:
            r0.f337834a = r8     // Catch:{ all -> 0x006b }
            r0.f337835b = r5     // Catch:{ all -> 0x006b }
            r0.f337838e = r3     // Catch:{ all -> 0x006b }
            java.lang.Object r0 = r4.mo105343f(r0)     // Catch:{ all -> 0x006b }
            if (r0 == r1) goto L_0x006a
            r0 = r8
        L_0x0064:
            r0.mo63026c(r5)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x006a:
            return r1
        L_0x006b:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x006f:
            r0.mo63026c(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.mo39055b(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: com.google.android.libraries.search.c.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0103 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0124 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0149 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x014f A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105341c(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121745f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.platform.j.b.b.b.f r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121745f) r0
            int r1 = r0.f337833f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337833f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.b.f r0 = new com.google.android.apps.search.assistant.platform.j.b.b.b.f
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f337831d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337833f
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = "INV.AudioFocus"
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f337830c
            java.lang.Object r2 = r0.f337829b
            java.lang.Object r0 = r0.f337828a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0034 }
            goto L_0x0106
        L_0x0034:
            r13 = move-exception
            goto L_0x01c0
        L_0x0037:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003f:
            java.lang.Object r2 = r0.f337829b
            java.lang.Object r4 = r0.f337828a
            p5462h.C69714l.m101134b(r13)
            goto L_0x005a
        L_0x0047:
            p5462h.C69714l.m101134b(r13)
            kotlinx.coroutines.j.b r13 = r12.f337851d
            r0.f337828a = r12
            r0.f337829b = r13
            r0.f337833f = r4
            java.lang.Object r2 = r13.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x01c4
            r4 = r12
            r2 = r13
        L_0x005a:
            r13 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r13 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r13     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.aa r13 = r13.f337854g     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x00a0
            r13 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r13 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r13     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r13 = r13.f337852e     // Catch:{ all -> 0x0034 }
            r7 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r7     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r7 = r7.f337858k     // Catch:{ all -> 0x0034 }
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r7)     // Catch:{ all -> 0x0034 }
            if (r13 == 0) goto L_0x00a0
            com.google.common.f.e r13 = f337848a     // Catch:{ all -> 0x0034 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0034 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0034 }
            r13.mo56378ag(r7, r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "Audio focus config is not changed. Returns the existing audio focus session. InvocationToken: %s."
            r8 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r8     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r8.f337850c     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r8)     // Catch:{ all -> 0x0034 }
            com.google.common.f.n r9 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r10 = 35940(0x8c64, float:5.0363E-41)
            r9.<init>(r10)     // Catch:{ all -> 0x0034 }
            r13.mo56379ah(r9)     // Catch:{ all -> 0x0034 }
            r13.mo56389s(r7, r8)     // Catch:{ all -> 0x0034 }
            r13 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r13 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r13     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.aa r13 = r13.f337854g     // Catch:{ all -> 0x0034 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r13)     // Catch:{ all -> 0x0034 }
            goto L_0x00eb
        L_0x00a0:
            com.google.common.f.e r13 = f337848a     // Catch:{ all -> 0x0034 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0034 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0034 }
            r13.mo56378ag(r7, r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "Acquiring a new audio focus session with audio_focus_gain=%s. InvocationToken: %s."
            r8 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r8     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r8 = r8.f337858k     // Catch:{ all -> 0x0034 }
            int r8 = r8.f99200b     // Catch:{ all -> 0x0034 }
            r9 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r9     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f337850c     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)     // Catch:{ all -> 0x0034 }
            com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r11 = 35939(0x8c63, float:5.0361E-41)
            r10.<init>(r11)     // Catch:{ all -> 0x0034 }
            r13.mo56379ah(r10)     // Catch:{ all -> 0x0034 }
            r13.mo56395y(r7, r8, r9)     // Catch:{ all -> 0x0034 }
            r13 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r13 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r13     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.d.a.d r13 = r13.f337860m     // Catch:{ all -> 0x0034 }
            r7 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r7 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r7     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r7 = r7.f337858k     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.aa r13 = r13.mo40984a(r7)     // Catch:{ all -> 0x0034 }
            com.google.android.apps.search.assistant.platform.j.b.b.b.e r7 = new com.google.android.apps.search.assistant.platform.j.b.b.b.e     // Catch:{ all -> 0x0034 }
            r8 = r4
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r8 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r8     // Catch:{ all -> 0x0034 }
            r7.<init>(r8, r13)     // Catch:{ all -> 0x0034 }
            r8 = r13
            com.google.android.libraries.search.c.d.a.j r8 = (com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j) r8     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.d.a.b r8 = r8.f99526f     // Catch:{ all -> 0x0034 }
            r8.mo40982a(r7)     // Catch:{ all -> 0x0034 }
        L_0x00eb:
            r7 = r13
            com.google.android.libraries.search.c.d.a.j r7 = (com.google.android.libraries.search.p2904c.p2913d.p2914a.C37488j) r7     // Catch:{ all -> 0x0034 }
            com.google.common.util.concurrent.cx r7 = r7.f99524d     // Catch:{ all -> 0x0034 }
            java.lang.String r8 = "session.acquireAudioFocusStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x0034 }
            r0.f337828a = r4     // Catch:{ all -> 0x0034 }
            r0.f337829b = r2     // Catch:{ all -> 0x0034 }
            r0.f337830c = r13     // Catch:{ all -> 0x0034 }
            r0.f337833f = r3     // Catch:{ all -> 0x0034 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)     // Catch:{ all -> 0x0034 }
            if (r0 == r1) goto L_0x01bf
            r1 = r13
            r13 = r0
            r0 = r4
        L_0x0106:
            com.google.android.libraries.search.c.ac r13 = (com.google.android.libraries.search.p2904c.C37338ac) r13     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "status"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)     // Catch:{ all -> 0x0034 }
            com.google.common.f.e r3 = f337848a     // Catch:{ all -> 0x0034 }
            com.google.common.f.x r4 = r3.mo56224b()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0034 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0034 }
            r4.mo56378ag(r7, r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r7 = "Acquiring AudioFocus finished with status %s. InvocationToken: %s."
            int r8 = r13.f99179b     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.af r8 = com.google.android.libraries.search.p2904c.C37341af.m66350a(r8)     // Catch:{ all -> 0x0034 }
            if (r8 != 0) goto L_0x0126
            com.google.android.libraries.search.c.af r8 = com.google.android.libraries.search.p2904c.C37341af.UNKNOWN_ACQUIRING_STATUS     // Catch:{ all -> 0x0034 }
        L_0x0126:
            java.lang.String r8 = r8.name()     // Catch:{ all -> 0x0034 }
            r9 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r9 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r9     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = r9.f337850c     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)     // Catch:{ all -> 0x0034 }
            com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r11 = 35945(0x8c69, float:5.037E-41)
            r10.<init>(r11)     // Catch:{ all -> 0x0034 }
            r4.mo56379ah(r10)     // Catch:{ all -> 0x0034 }
            r4.mo56354G(r7, r8, r9)     // Catch:{ all -> 0x0034 }
            int r4 = r13.f99179b     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.af r4 = com.google.android.libraries.search.p2904c.C37341af.m66350a(r4)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x014b
            com.google.android.libraries.search.c.af r4 = com.google.android.libraries.search.p2904c.C37341af.UNKNOWN_ACQUIRING_STATUS     // Catch:{ all -> 0x0034 }
        L_0x014b:
            com.google.android.libraries.search.c.af r7 = com.google.android.libraries.search.p2904c.C37341af.ACQUIRED     // Catch:{ all -> 0x0034 }
            if (r4 != r7) goto L_0x01b3
            r4 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4     // Catch:{ all -> 0x0034 }
            r4.f337854g = r1     // Catch:{ all -> 0x0034 }
            r4 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4     // Catch:{ all -> 0x0034 }
            r4.f337853f = r1     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r1     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r1 = r1.f337858k     // Catch:{ all -> 0x0034 }
            r4 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4     // Catch:{ all -> 0x0034 }
            r4.f337852e = r1     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r1     // Catch:{ all -> 0x0034 }
            kotlinx.coroutines.z r1 = r1.f337856i     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.mo62875x()     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0186
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r1     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f337850c     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r1)     // Catch:{ all -> 0x0034 }
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r1     // Catch:{ all -> 0x0034 }
            r4 = 0
            r1.f337855h = r4     // Catch:{ all -> 0x0034 }
            kotlinx.coroutines.z r1 = new kotlinx.coroutines.z     // Catch:{ all -> 0x0034 }
            r1.<init>()     // Catch:{ all -> 0x0034 }
            r4 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4     // Catch:{ all -> 0x0034 }
            r4.f337856i = r1     // Catch:{ all -> 0x0034 }
        L_0x0186:
            r1 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r1 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r1     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.c.ak r1 = r1.f337858k     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.f99202d     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x01b3
            com.google.common.f.x r1 = r3.mo56226d()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0034 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0034 }
            r1.mo56378ag(r3, r6)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "releaseOnLoss flag is false. Invocation audio focus resource may not support the cases fully yet. Please see b/242997213. InvocationToken: %s."
            r4 = r0
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4     // Catch:{ all -> 0x0034 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r4.f337850c     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)     // Catch:{ all -> 0x0034 }
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r7 = 35941(0x8c65, float:5.0364E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0034 }
            r1.mo56379ah(r6)     // Catch:{ all -> 0x0034 }
            r1.mo56389s(r3, r4)     // Catch:{ all -> 0x0034 }
        L_0x01b3:
            com.google.android.apps.search.assistant.platform.j.b.b.b.a r1 = new com.google.android.apps.search.assistant.platform.j.b.b.b.a     // Catch:{ all -> 0x0034 }
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r0     // Catch:{ all -> 0x0034 }
            kotlinx.coroutines.z r0 = r0.f337856i     // Catch:{ all -> 0x0034 }
            r1.<init>(r13, r0)     // Catch:{ all -> 0x0034 }
            r2.mo63026c(r5)
        L_0x01bf:
            return r1
        L_0x01c0:
            r2.mo63026c(r5)
            throw r13
        L_0x01c4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.mo105341c(h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final String mo39056d() {
        return this.f337859l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105342e(p5462h.p5466c.C69577g r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121747h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.b.b.b.h r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121747h) r0
            int r1 = r0.f337843e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337843e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.b.h r0 = new com.google.android.apps.search.assistant.platform.j.b.b.b.h
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f337841c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337843e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f337839a
            kotlinx.coroutines.j.b r0 = (kotlinx.coroutines.p5584j.C71788b) r0
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002f }
            goto L_0x0088
        L_0x002f:
            r10 = move-exception
            goto L_0x0093
        L_0x0031:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0039:
            java.lang.Object r2 = r0.f337840b
            java.lang.Object r4 = r0.f337839a
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r4 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r4
            p5462h.C69714l.m101134b(r10)
            r10 = r2
            goto L_0x007b
        L_0x0044:
            p5462h.C69714l.m101134b(r10)
            com.google.common.f.e r10 = f337848a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "INV.AudioFocus"
            r10.mo56378ag(r2, r6)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r9.f337850c
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 35943(0x8c67, float:5.0367E-41)
            r6.<init>(r7)
            r10.mo56379ah(r6)
            java.lang.String r6 = "Release AudioFocus proactively. InvocationToken: %s."
            r10.mo56389s(r6, r2)
            kotlinx.coroutines.j.b r10 = r9.f337851d
            r0.f337839a = r9
            r0.f337840b = r10
            r0.f337843e = r4
            java.lang.Object r2 = r10.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0097
            r4 = r9
        L_0x007b:
            r0.f337839a = r10     // Catch:{ all -> 0x008f }
            r0.f337840b = r5     // Catch:{ all -> 0x008f }
            r0.f337843e = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r4.mo105343f(r0)     // Catch:{ all -> 0x008f }
            if (r0 == r1) goto L_0x008e
            r0 = r10
        L_0x0088:
            r0.mo63026c(r5)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x008e:
            return r1
        L_0x008f:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x0093:
            r0.mo63026c(r5)
            throw r10
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.mo105342e(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105343f(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121748i
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.platform.j.b.b.b.i r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121748i) r0
            int r1 = r0.f337847d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337847d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.b.i r0 = new com.google.android.apps.search.assistant.platform.j.b.b.b.i
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f337845b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337847d
            java.lang.String r3 = "INV.AudioFocus"
            r4 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            java.lang.Object r0 = r0.f337844a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0077
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0033:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.c.aa r9 = r8.f337854g
            if (r9 != 0) goto L_0x003d
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x003d:
            com.google.common.f.e r2 = f337848a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r5, r3)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = r8.f337850c
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r5)
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 35944(0x8c68, float:5.0368E-41)
            r6.<init>(r7)
            r2.mo56379ah(r6)
            java.lang.String r6 = "Releasing audio focus. InvocationToken: %s."
            r2.mo56389s(r6, r5)
            r8.f337855h = r4
            com.google.common.util.concurrent.cx r9 = r9.mo40883b()
            java.lang.String r2 = "currentSession.releaseAudioFocus()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f337844a = r8
            r0.f337847d = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r0 = r8
        L_0x0077:
            com.google.android.libraries.search.c.am r9 = (com.google.android.libraries.search.p2904c.C37348am) r9
            java.lang.String r1 = "status"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)
            com.google.common.f.e r1 = f337848a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r3)
            int r9 = r9.f99208b
            com.google.android.libraries.search.c.ai r9 = com.google.android.libraries.search.p2904c.C37344ai.m66353a(r9)
            if (r9 != 0) goto L_0x0095
            com.google.android.libraries.search.c.ai r9 = com.google.android.libraries.search.p2904c.C37344ai.UNKNOWN_RELEASING_STATUS
        L_0x0095:
            java.lang.String r9 = r9.name()
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r0
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = r0.f337850c
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 35946(0x8c6a, float:5.0371E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "Releasing AudioFocus finished with status %s. InvocationToken: %s."
            r1.mo56354G(r3, r9, r2)
            r9 = 0
            r0.f337854g = r9
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j.mo105343f(h.c.g):java.lang.Object");
    }
}
