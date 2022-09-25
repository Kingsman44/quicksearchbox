package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.C120996f;
import com.google.android.apps.search.assistant.platform.p9141h.p9146b.C121009h;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9660c.C127917d;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i */
/* compiled from: PG */
public final class C127881i implements C127917d {

    /* renamed from: a */
    public static final C59071e f351981a = C59071e.m91331h();

    /* renamed from: b */
    private final C121009h f351982b;

    /* renamed from: c */
    private final C120996f f351983c;

    /* renamed from: d */
    private final C71788b f351984d = new C71799m();

    /* renamed from: e */
    private boolean f351985e;

    /* renamed from: f */
    private final CopyOnWriteArraySet f351986f = new CopyOnWriteArraySet();

    public C127881i(C71422aw awVar, C121009h hVar, C120996f fVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "changeNotificationListenerService");
        this.f351982b = hVar;
        this.f351983c = fVar;
    }

    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0107 A[Catch:{ all -> 0x0139 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108261a(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127878f
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.f r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127878f) r0
            int r1 = r0.f351976f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351976f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.f r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.a.a.f
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f351974d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351976f
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.f351973c
            kotlinx.coroutines.j.b r1 = (kotlinx.coroutines.p5584j.C71788b) r1
            java.lang.Object r2 = r0.f351972b
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r2
            java.lang.Object r0 = r0.f351971a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0100
        L_0x0036:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x003e:
            java.lang.Object r2 = r0.f351973c
            h.f.b.aa r2 = (p5462h.p5473f.p5475b.C69644aa) r2
            java.lang.Object r6 = r0.f351972b
            h.f.b.aa r6 = (p5462h.p5473f.p5475b.C69644aa) r6
            java.lang.Object r7 = r0.f351971a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0080
        L_0x004c:
            p5462h.C69714l.m101134b(r11)
            h.f.b.aa r2 = new h.f.b.aa
            r2.<init>()
            com.google.android.apps.search.assistant.platform.h.b.h r11 = r10.f351982b
            com.google.android.apps.search.assistant.platform.h.b.g r11 = (com.google.android.apps.search.assistant.platform.p9141h.p9146b.C121008g) r11
            g.a.a r11 = r11.f336380a
            java.lang.Object r11 = r11.mo17428b()
            com.google.android.libraries.storage.protostore.ab r11 = (com.google.android.libraries.storage.protostore.C42876ab) r11
            com.google.common.util.concurrent.cx r11 = r11.mo46042d()
            com.google.android.apps.search.assistant.platform.h.b.c r6 = com.google.android.apps.search.assistant.platform.p9141h.p9146b.C121004c.f336376a
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r6 = com.google.apps.tiktok.tracing.C47810es.m84963c(r6)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r11, r6, r7)
            r0.f351971a = r10
            r0.f351972b = r2
            r0.f351973c = r2
            r0.f351976f = r5
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 == r1) goto L_0x013e
            r7 = r10
            r6 = r2
        L_0x0080:
            com.google.android.apps.search.assistant.platform.h.b.a.c r8 = com.google.android.apps.search.assistant.platform.p9141h.p9146b.p9147a.C121001c.ON
            if (r11 != r8) goto L_0x0086
            r11 = 1
            goto L_0x0087
        L_0x0086:
            r11 = 0
        L_0x0087:
            r2.f186023a = r11
            com.google.common.f.e r11 = f351981a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            boolean r2 = r6.f186023a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 37567(0x92bf, float:5.2643E-41)
            r8.<init>(r9)
            r11.mo56379ah(r8)
            java.lang.String r8 = "#FCF: Continued Conversation Mode Enabled: %s"
            r11.mo56389s(r8, r2)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r11 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352147e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f) r11
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            boolean r2 = r6.f186023a
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r6 = r11.f352152a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r6
            r6.f352149a = r5
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f352150b = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r2 = r11.f352152a
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r2
            int r6 = r2.f352149a
            if (r6 != r5) goto L_0x00e7
            java.lang.Object r2 = r2.f352150b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x00e7
            r11.mo108280c()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.h r2 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h.CONTINUED_CONVERSATION_ENABLED
            r11.mo108279b(r2)
        L_0x00e7:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r2 = r11.mo108278a()
            r11 = r7
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i) r11
            kotlinx.coroutines.j.b r11 = r11.f351984d
            r0.f351971a = r7
            r0.f351972b = r2
            r0.f351973c = r11
            r0.f351976f = r3
            java.lang.Object r0 = r11.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x013e
            r1 = r11
            r0 = r7
        L_0x0100:
            r11 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i) r11     // Catch:{ all -> 0x0139 }
            boolean r11 = r11.f351985e     // Catch:{ all -> 0x0139 }
            if (r11 != 0) goto L_0x0135
            com.google.common.f.e r11 = f351981a     // Catch:{ all -> 0x0139 }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x0139 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0139 }
            java.lang.String r3 = "#FCF: Adding callback"
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x0139 }
            r7 = 37568(0x92c0, float:5.2644E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x0139 }
            r11.mo56379ah(r6)     // Catch:{ all -> 0x0139 }
            r11.mo56386p(r3)     // Catch:{ all -> 0x0139 }
            r11 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i) r11     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.assistant.platform.h.a.f r11 = r11.f351983c     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.h r3 = new com.google.android.apps.search.assistant.surfaces.voice.h.a.a.h     // Catch:{ all -> 0x0139 }
            r6 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i) r6     // Catch:{ all -> 0x0139 }
            r3.<init>(r6)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.assistant.platform.h.a.c.g r6 = com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g.CC_SETTING     // Catch:{ all -> 0x0139 }
            r11.mo105022a(r3, r6)     // Catch:{ all -> 0x0139 }
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i) r0     // Catch:{ all -> 0x0139 }
            r0.f351985e = r5     // Catch:{ all -> 0x0139 }
        L_0x0135:
            r1.mo63026c(r4)
            return r2
        L_0x0139:
            r11 = move-exception
            r1.mo63026c(r4)
            throw r11
        L_0x013e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i.mo108261a(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ Set mo108260c() {
        return this.f351986f;
    }
}
