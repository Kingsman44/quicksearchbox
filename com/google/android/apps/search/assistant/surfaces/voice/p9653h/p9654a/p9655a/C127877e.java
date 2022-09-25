package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.C120996f;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9660c.C127917d;
import com.google.common.p4526f.C59071e;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e */
/* compiled from: PG */
public final class C127877e implements C127917d {

    /* renamed from: a */
    public static final C59071e f351965a = C59071e.m91331h();

    /* renamed from: b */
    private final C121090b f351966b;

    /* renamed from: c */
    private final C120996f f351967c;

    /* renamed from: d */
    private final C71788b f351968d = new C71799m();

    /* renamed from: e */
    private final CopyOnWriteArraySet f351969e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f351970f;

    public C127877e(C71422aw awVar, C121090b bVar, C120996f fVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(bVar, "localeSettingsAccessor");
        C69664n.m101061g(fVar, "changeNotificationListenerService");
        this.f351966b = bVar;
        this.f351967c = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ef A[Catch:{ all -> 0x0121 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108258a(java.util.Set r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127873a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.a r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127873a) r0
            int r1 = r0.f351957g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351957g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.a r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.a.a.a
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f351955e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351957g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r10 = r0.f351953c
            kotlinx.coroutines.j.b r10 = (kotlinx.coroutines.p5584j.C71788b) r10
            java.lang.Object r1 = r0.f351952b
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r1
            java.lang.Object r0 = r0.f351951a
            p5462h.C69714l.m101134b(r11)
            goto L_0x00e8
        L_0x0036:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003e:
            java.lang.Object r10 = r0.f351954d
            java.lang.Object r2 = r0.f351953c
            h.f.b.aa r2 = (p5462h.p5473f.p5475b.C69644aa) r2
            java.lang.Object r6 = r0.f351952b
            h.f.b.aa r6 = (p5462h.p5473f.p5475b.C69644aa) r6
            java.lang.Object r7 = r0.f351951a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0068
        L_0x004e:
            p5462h.C69714l.m101134b(r11)
            h.f.b.aa r2 = new h.f.b.aa
            r2.<init>()
            r0.f351951a = r9
            r0.f351952b = r2
            r0.f351953c = r2
            r0.f351954d = r10
            r0.f351957g = r5
            java.lang.Object r11 = r9.mo108259b(r0)
            if (r11 == r1) goto L_0x0126
            r7 = r9
            r6 = r2
        L_0x0068:
            boolean r10 = r10.contains(r11)
            r2.f186023a = r10
            com.google.common.f.e r10 = f351965a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            boolean r11 = r6.f186023a
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            com.google.common.f.n r2 = new com.google.common.f.n
            r8 = 37562(0x92ba, float:5.2636E-41)
            r2.<init>(r8)
            r10.mo56379ah(r2)
            java.lang.String r2 = "#FCF: Assistant Primary locale check status : %s"
            r10.mo56389s(r2, r11)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352147e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r10 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f) r10
            java.lang.String r11 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            boolean r11 = r6.f186023a
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r2 = r10.f352152a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r2
            r2.f352149a = r5
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r2.f352150b = r11
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r11 = r10.f352152a
            com.google.protobuf.bv r11 = r11.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r11
            int r2 = r11.f352149a
            if (r2 != r5) goto L_0x00c4
            java.lang.Object r11 = r11.f352150b
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x00cc
        L_0x00c4:
            r10.mo108280c()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.h r11 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h.LOCALE_INVALID
            r10.mo108279b(r11)
        L_0x00cc:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r10 = r10.mo108278a()
            r11 = r7
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e) r11
            kotlinx.coroutines.j.b r11 = r11.f351968d
            r0.f351951a = r7
            r0.f351952b = r10
            r0.f351953c = r11
            r0.f351954d = r4
            r0.f351957g = r3
            java.lang.Object r0 = r11.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0126
            r1 = r10
            r10 = r11
            r0 = r7
        L_0x00e8:
            r11 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e) r11     // Catch:{ all -> 0x0121 }
            boolean r11 = r11.f351970f     // Catch:{ all -> 0x0121 }
            if (r11 != 0) goto L_0x011d
            com.google.common.f.e r11 = f351965a     // Catch:{ all -> 0x0121 }
            com.google.common.f.x r11 = r11.mo56224b()     // Catch:{ all -> 0x0121 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "#FCF: Adding callback"
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0121 }
            r6 = 37564(0x92bc, float:5.2638E-41)
            r3.<init>(r6)     // Catch:{ all -> 0x0121 }
            r11.mo56379ah(r3)     // Catch:{ all -> 0x0121 }
            r11.mo56386p(r2)     // Catch:{ all -> 0x0121 }
            r11 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e) r11     // Catch:{ all -> 0x0121 }
            com.google.android.apps.search.assistant.platform.h.a.f r11 = r11.f351967c     // Catch:{ all -> 0x0121 }
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.d r2 = new com.google.android.apps.search.assistant.surfaces.voice.h.a.a.d     // Catch:{ all -> 0x0121 }
            r3 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e) r3     // Catch:{ all -> 0x0121 }
            r2.<init>(r3)     // Catch:{ all -> 0x0121 }
            com.google.android.apps.search.assistant.platform.h.a.c.g r3 = com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g.ASSISTANT_PRIMARY_LOCALE     // Catch:{ all -> 0x0121 }
            r11.mo105022a(r2, r3)     // Catch:{ all -> 0x0121 }
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e) r0     // Catch:{ all -> 0x0121 }
            r0.f351970f = r5     // Catch:{ all -> 0x0121 }
        L_0x011d:
            r10.mo63026c(r4)
            return r1
        L_0x0121:
            r11 = move-exception
            r10.mo63026c(r4)
            throw r11
        L_0x0126:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e.mo108258a(java.util.Set, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108259b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127874b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127874b) r0
            int r1 = r0.f351960c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f351960c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.h.a.a.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.h.a.a.b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f351958a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f351960c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0046
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.platform.h.f.b r5 = r4.f351966b
            com.google.common.util.concurrent.cx r5 = r5.mo105044b()
            java.lang.String r2 = "localeSettingsAccessor.primaryAssistantLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f351960c = r3
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r5 != r1) goto L_0x0046
            return r1
        L_0x0046:
            java.util.Locale r5 = (java.util.Locale) r5
            java.lang.String r5 = r5.toLanguageTag()
            com.google.common.f.e r0 = f351965a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 37563(0x92bb, float:5.2637E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "#FCF: Assistant primary locale : %s"
            r0.mo56389s(r1, r5)
            java.lang.String r0 = "localeSettingsAccessor.p…y locale : %s\", it)\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e.mo108259b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final /* synthetic */ Set mo108260c() {
        return this.f351969e;
    }
}
