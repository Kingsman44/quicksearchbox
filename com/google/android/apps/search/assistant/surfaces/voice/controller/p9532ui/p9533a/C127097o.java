package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.apps.search.assistant.platform.p9141h.p9152d.C121048h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129678l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130055a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130092b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.C130094d;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3135d.C40346e;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o */
/* compiled from: PG */
public final class C127097o extends C127103u {

    /* renamed from: a */
    public static final Duration f349967a = Duration.ofSeconds(1);

    /* renamed from: b */
    public static final C129676j f349968b;

    /* renamed from: c */
    public static final C129676j f349969c;

    /* renamed from: g */
    private static final C59071e f349970g = C59071e.m91331h();

    /* renamed from: d */
    public final Context f349971d;

    /* renamed from: e */
    public final C121011a f349972e;

    /* renamed from: f */
    public final C121048h f349973f;

    /* renamed from: h */
    private final C129566ah f349974h;

    /* renamed from: i */
    private final C127108z f349975i;

    /* renamed from: j */
    private final PowerManager f349976j;

    /* renamed from: k */
    private final C40346e f349977k;

    /* renamed from: l */
    private final AtomicReference f349978l = new AtomicReference((Object) null);

    static {
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a = C69664n.m101061g(gVar, "builder");
        a.mo109191c(C129662i.ENABLE_ASSISTANT);
        f349968b = a.mo109189a();
        C129660g gVar2 = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar2, "newBuilder()");
        C129678l a2 = C69664n.m101061g(gVar2, "builder");
        a2.mo109191c(C129662i.KEYBOARD_INPUT);
        C62940bt btVar = C130092b.f356721e;
        C69664n.m101060f(btVar, "keyboardInputData");
        C130055a aVar = (C130055a) C130092b.f356720d.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C130094d a3 = C69664n.m101061g(aVar, "builder");
        C129660g gVar3 = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar3, "newBuilder()");
        C129678l a4 = C69664n.m101061g(gVar3, "builder");
        a4.mo109191c(C129662i.INPUT);
        a3.mo109486b(a4.mo109189a());
        a2.mo109190b(btVar, a3.mo109485a());
        f349969c = a2.mo109189a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127097o(C129566ah ahVar, Context context, C127108z zVar, PowerManager powerManager, C121011a aVar, C121048h hVar, C69585o oVar, C40346e eVar) {
        super(oVar);
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(zVar, "subscriptionProvider");
        C69664n.m101061g(powerManager, "powerManager");
        C69664n.m101061g(aVar, "assistantEligibilityChecker");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(eVar, "xUiKitLibraryLoader");
        this.f349974h = ahVar;
        this.f349971d = context;
        this.f349975i = zVar;
        this.f349976j = powerManager;
        this.f349972e = aVar;
        this.f349973f = hVar;
        this.f349977k = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107929c(java.lang.Object r5, java.lang.String r6, p5462h.p5473f.p5474a.C69626l r7, p5462h.p5466c.C69577g r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127096n
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.n r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127096n) r0
            int r1 = r0.f349966e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349966e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.n r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.n
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f349964c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349966e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r6 = r0.f349963b
            java.lang.Object r5 = r0.f349962a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002b }
            goto L_0x0045
        L_0x002b:
            r7 = move-exception
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            r0.f349962a = r5     // Catch:{ all -> 0x002b }
            r0.f349963b = r6     // Catch:{ all -> 0x002b }
            r0.f349966e = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r8 = r7.mo5761a(r0)     // Catch:{ all -> 0x002b }
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r8
        L_0x0046:
            com.google.common.f.e r8 = f349970g
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.x r7 = r8.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r8 = new com.google.common.f.n
            r0 = 37393(0x9211, float:5.2399E-41)
            r8.<init>(r0)
            r7.mo56379ah(r8)
            java.lang.String r6 = (java.lang.String) r6
            r7.mo56386p(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o.mo107929c(java.lang.Object, java.lang.String, h.f.a.l, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107928b(com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127084b r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127090h
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.h r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127090h) r0
            int r1 = r0.f349950f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349950f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.h r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.h
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f349948d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349950f
            r3 = 0
            java.lang.String r4 = "newBuilder()"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r6) goto L_0x003c
            if (r2 != r5) goto L_0x0034
            java.lang.Object r11 = r0.f349947c
            java.lang.Object r1 = r0.f349946b
            java.lang.Object r0 = r0.f349945a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00ff
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            java.lang.Object r11 = r0.f349946b
            java.lang.Object r2 = r0.f349945a
            p5462h.C69714l.m101134b(r12)     // Catch:{ Exception -> 0x0044 }
            goto L_0x009e
        L_0x0044:
            r12 = move-exception
            goto L_0x00ba
        L_0x0047:
            p5462h.C69714l.m101134b(r12)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.z r12 = r10.f349975i
            java.util.concurrent.atomic.AtomicBoolean r12 = r12.f349994d
            boolean r12 = r12.get()
            if (r12 == 0) goto L_0x00d9
            android.os.PowerManager r12 = r10.f349976j
            boolean r12 = r12.isInteractive()
            if (r12 != 0) goto L_0x00d9
            com.google.common.f.e r12 = f349970g
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r2 = new com.google.common.f.n
            r7 = 37390(0x920e, float:5.2395E-41)
            r2.<init>(r7)
            r12.mo56379ah(r2)
            java.lang.String r2 = "Has Invisible activity on LockScreen. Acquiring wakelock and waiting for screen to be illuminated."
            r12.mo56386p(r2)
            java.util.concurrent.atomic.AtomicReference r12 = r10.f349978l     // Catch:{ Exception -> 0x00b8 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.g r2 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.g     // Catch:{ Exception -> 0x00b8 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x00b8 }
            p3186j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(r12, r2)     // Catch:{ Exception -> 0x00b8 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.z r12 = r10.f349975i     // Catch:{ Exception -> 0x00b8 }
            r0.f349945a = r10     // Catch:{ Exception -> 0x00b8 }
            r0.f349946b = r11     // Catch:{ Exception -> 0x00b8 }
            r0.f349950f = r6     // Catch:{ Exception -> 0x00b8 }
            j$.time.Duration r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127108z.f349991a     // Catch:{ Exception -> 0x00b8 }
            long r7 = r2.toMillis()     // Catch:{ Exception -> 0x00b8 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.y r2 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.y     // Catch:{ Exception -> 0x00b8 }
            r2.<init>(r12, r3)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r12 = kotlinx.coroutines.C71745ea.m104930b(r7, r2, r0)     // Catch:{ Exception -> 0x00b8 }
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x00b8 }
            if (r12 == r2) goto L_0x009b
            h.q r12 = p5462h.C69788q.f186170a     // Catch:{ Exception -> 0x00b8 }
        L_0x009b:
            if (r12 == r1) goto L_0x00b7
            r2 = r10
        L_0x009e:
            com.google.common.f.e r12 = f349970g     // Catch:{ Exception -> 0x0044 }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ Exception -> 0x0044 }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ Exception -> 0x0044 }
            java.lang.String r7 = "Activity woken up."
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ Exception -> 0x0044 }
            r9 = 37391(0x920f, float:5.2396E-41)
            r8.<init>(r9)     // Catch:{ Exception -> 0x0044 }
            r12.mo56379ah(r8)     // Catch:{ Exception -> 0x0044 }
            r12.mo56386p(r7)     // Catch:{ Exception -> 0x0044 }
            goto L_0x00da
        L_0x00b7:
            return r1
        L_0x00b8:
            r12 = move-exception
            r2 = r10
        L_0x00ba:
            com.google.common.f.e r7 = f349970g
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.x r12 = r7.mo56382g(r12)
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 37392(0x9210, float:5.2397E-41)
            r7.<init>(r8)
            r12.mo56379ah(r7)
            java.lang.String r7 = "Exception while waiting for No InVisibleActivity on lockScreen."
            r12.mo56386p(r7)
            goto L_0x00da
        L_0x00d9:
            r2 = r10
        L_0x00da:
            r12 = r2
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o r12 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o) r12
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.z r7 = r12.f349975i
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f349993c
            int r7 = r7.get()
            if (r7 != 0) goto L_0x0145
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah r7 = r12.f349974h
            r0.f349945a = r2
            r0.f349946b = r11
            r0.f349947c = r7
            r0.f349950f = r5
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.k r5 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.k
            r5.<init>(r12, r3)
            java.lang.Object r12 = kotlinx.coroutines.C71423ax.m104196a(r5, r0)
            if (r12 == r1) goto L_0x0144
            r1 = r11
            r0 = r2
            r11 = r7
        L_0x00ff:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j) r12
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.b r1 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127084b) r1
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r1 = r1.f349937b
            if (r1 != 0) goto L_0x0109
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r1 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i.f350561i
        L_0x0109:
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r1 = r1.f350567e
            if (r1 != 0) goto L_0x010f
            com.google.android.apps.search.assistant.surfaces.voice.d.d.n r1 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127294n.f350576c
        L_0x010f:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = r1.f350579b
            if (r1 != 0) goto L_0x0115
            com.google.android.libraries.search.assistant.invocation.o.a.bp r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0115:
            r11.mo109106b(r12, r1)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o) r0
            com.google.android.libraries.search.rendering.xuikit.d.d.e r11 = r0.f349977k
            r11.mo42409a()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r11 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127086d.f349939c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.c r11 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127085c) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.f r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.c r12 = r11.f349943a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r12 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127086d) r12
            int r0 = r12.f349941a
            r0 = r0 | r6
            r12.f349941a = r0
            r0 = 0
            r12.f349942b = r0
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r11 = r11.mo107927a()
            return r11
        L_0x0144:
            return r1
        L_0x0145:
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r11 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127086d.f349939c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.c r11 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127085c) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.f r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.c r12 = r11.f349943a
            r12.copyOnWrite()
            com.google.protobuf.bv r12 = r12.instance
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r12 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127086d) r12
            int r0 = r12.f349941a
            r0 = r0 | r6
            r12.f349941a = r0
            r12.f349942b = r6
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.d r11 = r11.mo107927a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o.mo107928b(com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.b, h.c.g):java.lang.Object");
    }
}
