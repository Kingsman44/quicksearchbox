package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.TngMaStatusChecker$evaluateInternal$2$a11yReadyDef$1", mo61344c = "TngMaStatusChecker.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.j */
/* compiled from: PG */
final class C127906j extends C69572j implements C69630p {

    /* renamed from: a */
    int f352077a;

    /* renamed from: b */
    final /* synthetic */ C127913q f352078b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127906j(C127913q qVar, C69577g gVar) {
        super(2, gVar);
        this.f352078b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127906j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0116 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f352077a
            if (r1 == 0) goto L_0x000b
            p5462h.C69714l.m101134b(r14)
            goto L_0x0117
        L_0x000b:
            p5462h.C69714l.m101134b(r14)
            com.google.android.apps.search.assistant.surfaces.voice.h.b.q r14 = r13.f352078b
            com.google.android.apps.search.assistant.surfaces.voice.h.a.b.a r14 = r14.f352101g
            r1 = 1
            r13.f352077a = r1
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127882a.f351987a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 37569(0x92c1, float:5.2645E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "FCF A11y Checker - readyForTngMa"
            r2.mo56386p(r3)
            android.view.accessibility.AccessibilityManager r2 = r14.f351989c
            boolean r2 = r2.isTouchExplorationEnabled()
            r3 = 0
            if (r2 == 0) goto L_0x0051
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127882a.f351987a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 37571(0x92c3, float:5.2648E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "FCF A11y Checker - servicesRequiringEarcon: TalkBack"
            r2.mo56386p(r4)
        L_0x004e:
            r2 = 1
            goto L_0x00c7
        L_0x0051:
            android.content.Context r2 = r14.f351988b
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r4 = "enabled_accessibility_services"
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r4)
            if (r2 != 0) goto L_0x0061
        L_0x005f:
            r2 = 0
            goto L_0x00c7
        L_0x0061:
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127882a.f351987a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "com.google.android.apps.accessibility.voiceaccess"
            boolean r6 = p5462h.p5483m.C69764m.m101205y(r2, r5, r3)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r7 = "com.google.android.accessibility.selecttospeak.SelectToSpeakService"
            boolean r8 = p5462h.p5483m.C69764m.m101205y(r2, r7, r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "com.android.switchaccess.SwitchAccessService"
            boolean r10 = p5462h.p5483m.C69764m.m101205y(r2, r9, r3)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            com.google.common.f.n r11 = new com.google.common.f.n
            r12 = 37570(0x92c2, float:5.2647E-41)
            r11.<init>(r12)
            r4.mo56379ah(r11)
            java.lang.String r11 = "FCF A11y Checker - servicesRequiringEarcon: VoiceAccess? %s, SelectToSpeak?: %s, SwitchAccess?: %s"
            r4.mo56359L(r11, r6, r8, r10)
            r4 = 3
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r3] = r5
            r4[r1] = r7
            r5 = 2
            r4[r5] = r9
            java.util.Set r4 = p5462h.p5463a.C69531o.m100939p(r4)
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00b0
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x00b0
            goto L_0x005f
        L_0x00b0:
            java.util.Iterator r4 = r4.iterator()
        L_0x00b4:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p5462h.p5483m.C69764m.m101205y(r2, r5, r3)
            if (r5 == 0) goto L_0x00b4
            goto L_0x004e
        L_0x00c7:
            android.view.accessibility.AccessibilityManager r14 = r14.f351989c
            boolean r14 = r14.isEnabled()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r4 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352147e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127927f) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.apps.search.assistant.surfaces.voice.h.e.k r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            if (r14 == 0) goto L_0x00e2
            if (r2 != 0) goto L_0x00e3
        L_0x00e2:
            r3 = 1
        L_0x00e3:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r14 = r4.f352152a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r14 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r14
            r14.f352149a = r1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r14.f352150b = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.e.f r14 = r4.f352152a
            com.google.protobuf.bv r14 = r14.instance
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r14 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r14
            int r2 = r14.f352149a
            if (r2 != r1) goto L_0x0108
            java.lang.Object r14 = r14.f352150b
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L_0x0110
        L_0x0108:
            r4.mo108280c()
            com.google.android.apps.search.assistant.surfaces.voice.h.e.h r14 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127929h.ACCESSIBILITY_MANAGER_AND_SERVICES_REQUIRING_EARCON_ENABLED
            r4.mo108279b(r14)
        L_0x0110:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r14 = r4.mo108278a()
            if (r14 != r0) goto L_0x0117
            return r0
        L_0x0117:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.C127906j.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127906j(this.f352078b, gVar);
    }
}
