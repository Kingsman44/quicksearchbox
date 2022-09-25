package com.google.android.libraries.search.assistant.invocation.p2651n.p2654c;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5466c.C69577g;

/* renamed from: com.google.android.libraries.search.assistant.invocation.n.c.y */
/* compiled from: PG */
public final class C34008y implements C33499c, C34003t {

    /* renamed from: a */
    public static final C59071e f90653a = C59071e.m91331h();

    /* renamed from: b */
    private static final String f90654b = "action";

    /* renamed from: c */
    private static final String f90655c = "config";

    /* renamed from: d */
    private static final String f90656d = "nga_is_assistant";

    /* renamed from: e */
    private static final Bundle f90657e;

    /* renamed from: f */
    private final C71788b f90658f = new C71799m();

    /* renamed from: g */
    private boolean f90659g;

    /* renamed from: h */
    private C33497h f90660h;

    static {
        Bundle bundle = new Bundle();
        bundle.putString("action", "config");
        bundle.putBoolean("nga_is_assistant", true);
        f90657e = bundle;
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo38908c(C69577g gVar) {
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38909d(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34006w
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.n.c.w r0 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34006w) r0
            int r1 = r0.f90645e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90645e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.n.c.w r0 = new com.google.android.libraries.search.assistant.invocation.n.c.w
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f90643c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90645e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r0.f90642b
            java.lang.Object r0 = r0.f90641a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            p5462h.C69714l.m101134b(r6)
            kotlinx.coroutines.j.b r6 = r5.f90658f
            r0.f90641a = r5
            r0.f90642b = r6
            r0.f90645e = r3
            java.lang.Object r0 = r6.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x006b
            r0 = r5
            r1 = r6
        L_0x0047:
            r6 = r0
            com.google.android.libraries.search.assistant.invocation.n.c.y r6 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r6     // Catch:{ all -> 0x0066 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r6 = r6.f90660h     // Catch:{ all -> 0x0066 }
            if (r6 == 0) goto L_0x005e
            r6 = r0
            com.google.android.libraries.search.assistant.invocation.n.c.y r6 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r6     // Catch:{ all -> 0x0066 }
            r6.f90660h = r4     // Catch:{ all -> 0x0066 }
            com.google.android.libraries.search.assistant.invocation.n.c.y r0 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r0     // Catch:{ all -> 0x0066 }
            r6 = 0
            r0.f90659g = r6     // Catch:{ all -> 0x0066 }
            r1.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x005e:
            java.lang.String r6 = "Inconsistent lifecycle event, service already stopped."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            r0.<init>(r6)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r6 = move-exception
            r1.mo63026c(r4)
            throw r6
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y.mo38909d(h.c.g):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h, code=java.lang.Object, for r6v0, types: [com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38910e(java.lang.Object r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34005v
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.invocation.n.c.v r0 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34005v) r0
            int r1 = r0.f90640f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90640f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.n.c.v r0 = new com.google.android.libraries.search.assistant.invocation.n.c.v
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f90638d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90640f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.f90637c
            java.lang.Object r1 = r0.f90636b
            java.lang.Object r0 = r0.f90635a
            p5462h.C69714l.m101134b(r7)
            r7 = r6
            r6 = r1
            goto L_0x004c
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p5462h.C69714l.m101134b(r7)
            kotlinx.coroutines.j.b r7 = r5.f90658f
            r0.f90635a = r5
            r0.f90636b = r6
            r0.f90637c = r7
            r0.f90640f = r3
            java.lang.Object r0 = r7.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0078
            r0 = r5
        L_0x004c:
            r1 = r0
            com.google.android.libraries.search.assistant.invocation.n.c.y r1 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r1     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r1 = r1.f90660h     // Catch:{ all -> 0x0073 }
            if (r1 != 0) goto L_0x006b
            boolean r1 = r6 instanceof com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0063
            com.google.android.libraries.search.assistant.invocation.n.c.y r0 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r0     // Catch:{ all -> 0x0073 }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r6 = (com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h) r6     // Catch:{ all -> 0x0073 }
            r0.f90660h = r6     // Catch:{ all -> 0x0073 }
            r7.mo63026c(r4)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x0063:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "VoiceInteractionSession does not expose uiHints"
            r6.<init>(r0)     // Catch:{ all -> 0x0073 }
            throw r6     // Catch:{ all -> 0x0073 }
        L_0x006b:
            java.lang.String r6 = "Inconsistent lifecycle event, service already started."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0073 }
            r0.<init>(r6)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r6 = move-exception
            r7.mo63026c(r4)
            throw r6
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y.mo38910e(com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: com.google.android.libraries.search.assistant.invocation.n.c.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d A[Catch:{ all -> 0x015f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39184a(android.os.Bundle r11, boolean r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            java.lang.String r0 = "newBuilder()"
            java.lang.String r1 = "INV.SystemUI"
            boolean r2 = r13 instanceof com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34007x
            if (r2 == 0) goto L_0x0017
            r2 = r13
            com.google.android.libraries.search.assistant.invocation.n.c.x r2 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34007x) r2
            int r3 = r2.f90652g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f90652g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.n.c.x r2 = new com.google.android.libraries.search.assistant.invocation.n.c.x
            r2.<init>(r10, r13)
        L_0x001c:
            java.lang.Object r13 = r2.f90650e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f90652g
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x003c
            if (r4 != r5) goto L_0x0034
            boolean r12 = r2.f90649d
            java.lang.Object r11 = r2.f90648c
            java.lang.Object r3 = r2.f90647b
            java.lang.Object r2 = r2.f90646a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0056
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            p5462h.C69714l.m101134b(r13)
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            kotlinx.coroutines.j.b r13 = r10.f90658f
            r2.f90646a = r10
            r2.f90647b = r11
            r2.f90648c = r13
            r2.f90649d = r12
            r2.f90652g = r5
            java.lang.Object r2 = r13.mo63025b(r6, r2)
            if (r2 == r3) goto L_0x0164
            r2 = r10
            r3 = r11
            r11 = r13
        L_0x0056:
            r13 = r2
            com.google.android.libraries.search.assistant.invocation.n.c.y r13 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r13     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.a.a.h r13 = r13.f90660h     // Catch:{ all -> 0x015f }
            if (r13 != 0) goto L_0x00a7
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.s r12 = com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34002s.f90631c     // Catch:{ all -> 0x015f }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.r r12 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34001r) r12     // Catch:{ all -> 0x015f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.aa r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.m r13 = com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33996m.f90622c     // Catch:{ all -> 0x015f }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.k r13 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33994k) r13     // Catch:{ all -> 0x015f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.h r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "VoiceInteractionService not running"
            r13.mo39182b(r0)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.l r0 = com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33995l.VOICE_INTERACTION_SERVICE_NOT_RUNNING     // Catch:{ all -> 0x015f }
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.k r1 = r13.f90615a     // Catch:{ all -> 0x015f }
            r1.copyOnWrite()     // Catch:{ all -> 0x015f }
            com.google.protobuf.bv r1 = r1.instance     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.m r1 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C33996m) r1     // Catch:{ all -> 0x015f }
            int r0 = r0.getNumber()     // Catch:{ all -> 0x015f }
            r1.f90625b = r0     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.m r13 = r13.mo39181a()     // Catch:{ all -> 0x015f }
            r12.mo39178b(r13)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.s r12 = r12.mo39177a()     // Catch:{ all -> 0x015f }
            r11.mo63026c(r6)
            return r12
        L_0x00a7:
            if (r12 == 0) goto L_0x0155
            com.google.common.f.e r12 = f90653a     // Catch:{ all -> 0x015f }
            com.google.common.f.x r0 = r12.mo56224b()     // Catch:{ all -> 0x015f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x015f }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            r0.mo56378ag(r4, r1)     // Catch:{ all -> 0x015f }
            java.lang.String r4 = "setUiHints (Backend): needs config"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x015f }
            r8 = 51323(0xc87b, float:7.1919E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x015f }
            r0.mo56379ah(r7)     // Catch:{ all -> 0x015f }
            r0.mo56386p(r4)     // Catch:{ all -> 0x015f }
            com.google.common.f.x r0 = r12.mo56224b()     // Catch:{ all -> 0x015f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x015f }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            r0.mo56378ag(r4, r1)     // Catch:{ all -> 0x015f }
            java.lang.String r4 = "setUiHints (Backend): sent_config = %s"
            r7 = r2
            com.google.android.libraries.search.assistant.invocation.n.c.y r7 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r7     // Catch:{ all -> 0x015f }
            boolean r7 = r7.f90659g     // Catch:{ all -> 0x015f }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x015f }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x015f }
            r9 = 51324(0xc87c, float:7.192E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x015f }
            r0.mo56379ah(r8)     // Catch:{ all -> 0x015f }
            r0.mo56389s(r4, r7)     // Catch:{ all -> 0x015f }
            r0 = r2
            com.google.android.libraries.search.assistant.invocation.n.c.y r0 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r0     // Catch:{ all -> 0x015f }
            boolean r0 = r0.f90659g     // Catch:{ all -> 0x015f }
            if (r0 != 0) goto L_0x0155
            com.google.common.f.x r0 = r12.mo56224b()     // Catch:{ all -> 0x015f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x015f }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            r0.mo56378ag(r4, r1)     // Catch:{ all -> 0x015f }
            java.lang.String r4 = "setUiHints (Backend): send config"
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x015f }
            r8 = 51325(0xc87d, float:7.1922E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x015f }
            r0.mo56379ah(r7)     // Catch:{ all -> 0x015f }
            r0.mo56386p(r4)     // Catch:{ all -> 0x015f }
            android.os.Bundle r0 = f90657e     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.s r0 = com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34004u.m62667a(r13, r0)     // Catch:{ all -> 0x015f }
            int r4 = r0.f90633a     // Catch:{ all -> 0x015f }
            r7 = 2
            if (r4 != r7) goto L_0x0136
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x015f }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x015f }
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            r12.mo56378ag(r13, r1)     // Catch:{ all -> 0x015f }
            java.lang.String r13 = "setUiHints (Backend): send config failed"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x015f }
            r2 = 51327(0xc87f, float:7.1924E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x015f }
            r12.mo56379ah(r1)     // Catch:{ all -> 0x015f }
            r12.mo56386p(r13)     // Catch:{ all -> 0x015f }
            r11.mo63026c(r6)
            return r0
        L_0x0136:
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ all -> 0x015f }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x015f }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x015f }
            r12.mo56378ag(r0, r1)     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "setUiHints (Backend): send config successful"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x015f }
            r4 = 51326(0xc87e, float:7.1923E-41)
            r1.<init>(r4)     // Catch:{ all -> 0x015f }
            r12.mo56379ah(r1)     // Catch:{ all -> 0x015f }
            r12.mo56386p(r0)     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.y r2 = (com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y) r2     // Catch:{ all -> 0x015f }
            r2.f90659g = r5     // Catch:{ all -> 0x015f }
        L_0x0155:
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x015f }
            com.google.android.libraries.search.assistant.invocation.n.c.s r12 = com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34004u.m62667a(r13, r3)     // Catch:{ all -> 0x015f }
            r11.mo63026c(r6)
            return r12
        L_0x015f:
            r12 = move-exception
            r11.mo63026c(r6)
            throw r12
        L_0x0164:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2651n.p2654c.C34008y.mo39184a(android.os.Bundle, boolean, h.c.g):java.lang.Object");
    }
}
