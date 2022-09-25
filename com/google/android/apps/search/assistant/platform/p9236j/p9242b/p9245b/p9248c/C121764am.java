package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import com.google.android.apps.gsa.binaries.satin.app.aqs;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33725a;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.am */
/* compiled from: PG */
public final class C121764am implements C33725a {

    /* renamed from: a */
    private static final C59071e f337920a = C59071e.m91331h();

    /* renamed from: b */
    private final C121796l f337921b;

    /* renamed from: c */
    private final aqs f337922c;

    public C121764am(C121796l lVar, aqs aqs) {
        C69664n.m101061g(lVar, "audioInputResourceFactory");
        C69664n.m101061g(aqs, "invocationAppFlowLoggerFactory");
        this.f337921b = lVar;
        this.f337922c = aqs;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39041a(com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33729b r8, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r9, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d r10, p5462h.p5466c.C69577g r11) {
        /*
            r7 = this;
            boolean r10 = r11 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121763al
            if (r10 == 0) goto L_0x0013
            r10 = r11
            com.google.android.apps.search.assistant.platform.j.b.b.c.al r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121763al) r10
            int r0 = r10.f337919d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0013
            int r0 = r0 - r1
            r10.f337919d = r0
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.b.c.al r10 = new com.google.android.apps.search.assistant.platform.j.b.b.c.al
            r10.<init>(r7, r11)
        L_0x0018:
            r5 = r10
            java.lang.Object r10 = r5.f337917b
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r0 = r5.f337919d
            r1 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r1) goto L_0x002b
            java.lang.Object r8 = r5.f337916a
            p5462h.C69714l.m101134b(r10)
            goto L_0x00a8
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            p5462h.C69714l.m101134b(r10)
            com.google.frameworks.client.a.a.b r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            com.google.android.libraries.search.assistant.invocation.o.a.ca r0 = r8.f90084e
            com.google.android.libraries.search.assistant.invocation.o.a.s r0 = r0.f90778g
            if (r0 != 0) goto L_0x0042
            com.google.android.libraries.search.assistant.invocation.o.a.s r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34110s.f90846d
        L_0x0042:
            r2 = r0
            java.lang.String r0 = "invocationParams.resourceConfig.audioInput"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)
            int r0 = r2.f90848a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00eb
            com.google.android.libraries.search.assistant.invocation.o.a.u r0 = r2.f90850c
            if (r0 != 0) goto L_0x0054
            com.google.android.libraries.search.assistant.invocation.o.a.u r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34112u.f90852e
        L_0x0054:
            int r0 = r0.f90854a
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00eb
            com.google.android.apps.gsa.binaries.satin.app.aqs r0 = r7.f337922c
            com.google.android.libraries.search.assistant.invocation.o.c.a r3 = r8.f90080a
            com.google.android.libraries.search.assistant.invocation.k.a.c r6 = r0.mo67207a(r3, r9)
            boolean r0 = r2.f90849b
            if (r0 == 0) goto L_0x00be
            com.google.common.f.e r0 = f337920a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "INV.AudioInput.Strategy"
            r0.mo56378ag(r3, r4)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 35985(0x8c91, float:5.0426E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "Open mic immediately. InvocationToken: %s."
            r0.mo56389s(r3, r10)
            com.google.android.libraries.search.b.i.g r10 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97150gC
            java.lang.String r0 = "APA_INVOCATION_AUDIO_INP…QUIRE_WITH_OPEN_MIC_START"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            j.a.c.c.a.ew r0 = r6.f90466b
            com.google.android.libraries.search.b.i.a r10 = r10.mo40779c()
            r6.mo39128a(r10, r0)
            com.google.android.apps.search.assistant.platform.j.b.b.c.l r0 = r7.f337921b
            com.google.android.libraries.search.assistant.invocation.o.i.g r10 = r8.f90082c
            com.google.android.libraries.search.assistant.invocation.o.c.a r3 = r8.f90080a
            r5.f337916a = r6
            r5.f337919d = r1
            r1 = r2
            r2 = r10
            r4 = r9
            java.lang.Object r10 = r0.mo105384b(r1, r2, r3, r4, r5)
            if (r10 == r11) goto L_0x00bd
            r8 = r6
        L_0x00a8:
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121758ag) r10
            com.google.android.libraries.search.b.i.g r9 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97151gD
            java.lang.String r11 = "APA_INVOCATION_AUDIO_INP…E_WITH_OPEN_MIC_COMPLETED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)
            com.google.android.libraries.search.assistant.invocation.k.a.c r8 = (com.google.android.libraries.search.assistant.invocation.p2641k.p2642a.C33917c) r8
            j.a.c.c.a.ew r11 = r8.f90466b
            com.google.android.libraries.search.b.i.a r9 = r9.mo40779c()
            r8.mo39128a(r9, r11)
            goto L_0x00ea
        L_0x00bd:
            return r11
        L_0x00be:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.b.i.g r10 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97148gA
            java.lang.String r11 = "APA_INVOCATION_AUDIO_INP…RE_WITHOUT_OPEN_MIC_START"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            j.a.c.c.a.ew r11 = r6.f90466b
            com.google.android.libraries.search.b.i.a r10 = r10.mo40779c()
            r6.mo39128a(r10, r11)
            com.google.android.apps.search.assistant.platform.j.b.b.c.l r10 = r7.f337921b
            com.google.android.libraries.search.assistant.invocation.o.i.g r11 = r8.f90082c
            com.google.android.libraries.search.assistant.invocation.o.c.a r8 = r8.f90080a
            com.google.android.apps.search.assistant.platform.j.b.b.c.ag r10 = r10.mo105383a(r2, r11, r8, r9)
            com.google.android.libraries.search.b.i.g r8 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97149gB
            java.lang.String r9 = "APA_INVOCATION_AUDIO_INP…ITHOUT_OPEN_MIC_COMPLETED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            j.a.c.c.a.ew r9 = r6.f90466b
            com.google.android.libraries.search.b.i.a r8 = r8.mo40779c()
            r6.mo39128a(r8, r9)
        L_0x00ea:
            return r10
        L_0x00eb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            com.google.android.libraries.search.assistant.invocation.o.c.a r8 = r8.f90080a
            com.google.android.libraries.search.assistant.invocation.o.a.b r8 = r8.f90869a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            java.lang.String r8 = " tried to acquire AudioInputResource without providing AudioLibParams. InvocationToken: "
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = "."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c.C121764am.mo39041a(com.google.android.libraries.search.assistant.invocation.f.b.b, com.google.android.libraries.search.assistant.invocation.o.a.bp, com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.d, h.c.g):java.lang.Object");
    }
}
