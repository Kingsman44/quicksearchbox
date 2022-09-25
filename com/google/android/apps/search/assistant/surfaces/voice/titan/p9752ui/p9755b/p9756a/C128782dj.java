package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import android.media.AudioManager;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128806c;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18411f;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18412g;
import com.google.android.libraries.assistant.p1525l.p1526a.p1527a.C18415j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj */
/* compiled from: PG */
public final class C128782dj implements C128806c {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f354004a = C59071e.m91331h();

    /* renamed from: b */
    public final C18415j f354005b;

    /* renamed from: c */
    public final C128800v f354006c;

    /* renamed from: d */
    public final AudioManager f354007d;

    /* renamed from: e */
    public final C71422aw f354008e;

    /* renamed from: f */
    public final C62910ar f354009f;

    /* renamed from: g */
    public boolean f354010g;

    /* renamed from: h */
    private final Set f354011h = new LinkedHashSet();

    /* renamed from: i */
    private C71643cp f354012i;

    /* renamed from: j */
    private final C71788b f354013j = new C71799m();

    public C128782dj(C18415j jVar, C128800v vVar, AudioManager audioManager, C71422aw awVar, C62910ar arVar) {
        C69664n.m101061g(jVar, "voicePlateEntrypointServiceStub");
        C69664n.m101061g(vVar, "intentPlateHandler");
        C69664n.m101061g(audioManager, "audioManager");
        C69664n.m101061g(awVar, "scope");
        this.f354005b = jVar;
        this.f354006c = vVar;
        this.f354007d = audioManager;
        this.f354008e = awVar;
        this.f354009f = arVar;
    }

    /* renamed from: f */
    public static final C71587n m210148f(C71587n nVar, int i) {
        return new C71552db(new C128780dh(nVar, (C69577g) null, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108625a(com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128805b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128740bv
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bv r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128740bv) r0
            int r1 = r0.f353913f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353913f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bv r0 = new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bv
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f353911d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353913f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.f353910c
            java.lang.Object r1 = r0.f353909b
            java.lang.Object r0 = r0.f353908a
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f354013j
            r0.f353908a = r6
            r0.f353909b = r7
            r0.f353910c = r8
            r0.f353913f = r3
            java.lang.Object r0 = r8.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00cd
            r0 = r6
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r1 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r1     // Catch:{ all -> 0x00c8 }
            java.util.Set r1 = r1.f354011h     // Catch:{ all -> 0x00c8 }
            boolean r1 = r1.contains(r7)     // Catch:{ all -> 0x00c8 }
            if (r1 == 0) goto L_0x0078
            com.google.common.f.e r7 = f354004a     // Catch:{ all -> 0x00c8 }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x00c8 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "Connecting with a connected UiCallbacks."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x00c8 }
            r2 = 38015(0x947f, float:5.327E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x00c8 }
            r7.mo56379ah(r1)     // Catch:{ all -> 0x00c8 }
            r7.mo56386p(r0)     // Catch:{ all -> 0x00c8 }
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00c8 }
            r8.mo63026c(r4)
            return r7
        L_0x0078:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r1 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r1     // Catch:{ all -> 0x00c8 }
            java.util.Set r1 = r1.f354011h     // Catch:{ all -> 0x00c8 }
            r1.add(r7)     // Catch:{ all -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.k r1 = com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128836k.MID     // Catch:{ all -> 0x00c8 }
            r7.mo108667g(r1)     // Catch:{ all -> 0x00c8 }
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r7 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r7     // Catch:{ all -> 0x00c8 }
            kotlinx.coroutines.cp r7 = r7.f354012i     // Catch:{ all -> 0x00c8 }
            if (r7 == 0) goto L_0x0092
            boolean r7 = r7.mo62867mj()     // Catch:{ all -> 0x00c8 }
            if (r7 == r3) goto L_0x00c0
        L_0x0092:
            com.google.common.f.e r7 = f354004a     // Catch:{ all -> 0x00c8 }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x00c8 }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00c8 }
            java.lang.String r1 = "Connect to hubmode service"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x00c8 }
            r5 = 38021(0x9485, float:5.3279E-41)
            r2.<init>(r5)     // Catch:{ all -> 0x00c8 }
            r7.mo56379ah(r2)     // Catch:{ all -> 0x00c8 }
            r7.mo56386p(r1)     // Catch:{ all -> 0x00c8 }
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r7 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r7     // Catch:{ all -> 0x00c8 }
            kotlinx.coroutines.aw r7 = r7.f354008e     // Catch:{ all -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.cg r1 = new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.cg     // Catch:{ all -> 0x00c8 }
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r2     // Catch:{ all -> 0x00c8 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x00c8 }
            r2 = 3
            kotlinx.coroutines.cp r7 = kotlinx.coroutines.C71803m.m105043d(r7, r4, r4, r1, r2)     // Catch:{ all -> 0x00c8 }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r0     // Catch:{ all -> 0x00c8 }
            r0.f354012i = r7     // Catch:{ all -> 0x00c8 }
        L_0x00c0:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00c8 }
            r8.mo63026c(r4)
            return r7
        L_0x00c8:
            r7 = move-exception
            r8.mo63026c(r4)
            throw r7
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj.mo108625a(com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo108626b(C69577g gVar) {
        Object a = this.f354006c.mo108650a(gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057 A[Catch:{ all -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108627c(com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128805b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128777de
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.de r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128777de) r0
            int r1 = r0.f353988f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353988f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.de r0 = new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.de
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f353986d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353988f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r7 = r0.f353985c
            java.lang.Object r1 = r0.f353984b
            java.lang.Object r0 = r0.f353983a
            p5462h.C69714l.m101134b(r8)
            r8 = r7
            r7 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f354013j
            r0.f353983a = r6
            r0.f353984b = r7
            r0.f353985c = r8
            r0.f353988f = r3
            java.lang.Object r0 = r8.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x00b1
            r0 = r6
        L_0x004c:
            r1 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r1 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r1     // Catch:{ all -> 0x00ac }
            java.util.Set r1 = r1.f354011h     // Catch:{ all -> 0x00ac }
            boolean r7 = r1.remove(r7)     // Catch:{ all -> 0x00ac }
            if (r7 != 0) goto L_0x0078
            com.google.common.f.e r7 = f354004a     // Catch:{ all -> 0x00ac }
            com.google.common.f.x r7 = r7.mo56226d()     // Catch:{ all -> 0x00ac }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "Disconnecting a disconnected UiCallbacks."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x00ac }
            r2 = 38016(0x9480, float:5.3272E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x00ac }
            r7.mo56379ah(r1)     // Catch:{ all -> 0x00ac }
            r7.mo56386p(r0)     // Catch:{ all -> 0x00ac }
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00ac }
            r8.mo63026c(r4)
            return r7
        L_0x0078:
            r7 = r0
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r7 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r7     // Catch:{ all -> 0x00ac }
            java.util.Set r7 = r7.f354011h     // Catch:{ all -> 0x00ac }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00a4
            com.google.common.f.e r7 = f354004a     // Catch:{ all -> 0x00ac }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ all -> 0x00ac }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "Disconnect from hubmode service"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x00ac }
            r5 = 38022(0x9486, float:5.328E-41)
            r2.<init>(r5)     // Catch:{ all -> 0x00ac }
            r7.mo56379ah(r2)     // Catch:{ all -> 0x00ac }
            r7.mo56386p(r1)     // Catch:{ all -> 0x00ac }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r0     // Catch:{ all -> 0x00ac }
            kotlinx.coroutines.cp r7 = r0.f354012i     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00a4
            r7.mo62723u(r4)     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x00ac }
            r8.mo63026c(r4)
            return r7
        L_0x00ac:
            r7 = move-exception
            r8.mo63026c(r4)
            throw r7
        L_0x00b1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj.mo108627c(com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b, h.c.g):java.lang.Object");
    }

    /* renamed from: d */
    public final Object mo108628d(C69577g gVar) {
        C59071e eVar = f354004a;
        C59052c cVar = (C59052c) eVar.mo56224b();
        cVar.mo56379ah(new C59094n(38018));
        cVar.mo56386p("Stop interaction");
        if (!this.f354010g) {
            C59052c cVar2 = (C59052c) eVar.mo56224b();
            cVar2.mo56379ah(new C59094n(38019));
            cVar2.mo56386p("There is no active interaction. Not sending stop interaction request.");
            return C69788q.f186170a;
        }
        C18415j jVar = this.f354005b;
        C18411f fVar = (C18411f) C18412g.f52253a.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C69664n.m101061g(fVar, "builder");
        C62942bv build = fVar.build();
        C69664n.m101060f(build, "_builder.build()");
        Object b = jVar.mo23908b((C18412g) build, new C70334de(), gVar);
        return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a A[Catch:{ all -> 0x008f }, LOOP:0: B:17:0x0054->B:19:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108642e(com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128781di
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.di r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128781di) r0
            int r1 = r0.f354003f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f354003f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.di r0 = new com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.di
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f354001d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f354003f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r6 = r0.f354000c
            java.lang.Object r1 = r0.f353999b
            java.lang.Object r0 = r0.f353998a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004c
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r7 = r5.f354013j
            r0.f353998a = r5
            r0.f353999b = r6
            r0.f354000c = r7
            r0.f354003f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0094
            r0 = r5
            r1 = r6
            r6 = r7
        L_0x004c:
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.dj r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj) r0     // Catch:{ all -> 0x008f }
            java.util.Set r7 = r0.f354011h     // Catch:{ all -> 0x008f }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x008f }
        L_0x0054:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.C128805b) r0     // Catch:{ all -> 0x008f }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu) r2     // Catch:{ all -> 0x008f }
            boolean r2 = r2.f353905c     // Catch:{ all -> 0x008f }
            r0.mo108664d(r2)     // Catch:{ all -> 0x008f }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu) r2     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.f r2 = r2.f353904b     // Catch:{ all -> 0x008f }
            r0.mo108663c(r2)     // Catch:{ all -> 0x008f }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu) r2     // Catch:{ all -> 0x008f }
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a r2 = r2.f353903a     // Catch:{ all -> 0x008f }
            r0.mo108665e(r2)     // Catch:{ all -> 0x008f }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu) r2     // Catch:{ all -> 0x008f }
            boolean r2 = r2.f353906d     // Catch:{ all -> 0x008f }
            r0.mo108662b(r2)     // Catch:{ all -> 0x008f }
            r2 = r1
            com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu r2 = (com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128739bu) r2     // Catch:{ all -> 0x008f }
            boolean r2 = r2.f353907e     // Catch:{ all -> 0x008f }
            r0.mo108661a(r2)     // Catch:{ all -> 0x008f }
            goto L_0x0054
        L_0x0089:
            r6.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x008f:
            r7 = move-exception
            r6.mo63026c(r4)
            throw r7
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a.C128782dj.mo108642e(com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.bu, h.c.g):java.lang.Object");
    }
}
