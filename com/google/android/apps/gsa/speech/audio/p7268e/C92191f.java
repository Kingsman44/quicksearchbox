package com.google.android.apps.gsa.speech.audio.p7268e;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.speech.audio.e.f */
/* compiled from: PG */
public final /* synthetic */ class C92191f implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C92194i f257024a;

    /* renamed from: b */
    public final /* synthetic */ String f257025b;

    /* renamed from: c */
    public final /* synthetic */ boolean f257026c;

    public /* synthetic */ C92191f(C92194i iVar, String str, boolean z) {
        this.f257024a = iVar;
        this.f257025b = str;
        this.f257026c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d4, code lost:
        r6 = r3;
        r2 = false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.speech.audio.e.i r1 = r0.f257024a
            java.lang.String r2 = r0.f257025b
            boolean r3 = r0.f257026c
            r4 = r19
            j$.util.Optional r4 = (p3186j$.util.Optional) r4
            boolean r5 = r4.isEmpty()
            r6 = 0
            if (r5 == 0) goto L_0x001b
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            goto L_0x00ec
        L_0x001b:
            com.google.common.f.e r5 = com.google.android.apps.gsa.speech.audio.p7268e.C92194i.f257030a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "AudioTrackSoundManager"
            r5.mo56378ag(r7, r8)
            java.lang.String r7 = "%s"
            r9 = 12239(0x2fcf, float:1.715E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r9)).mo56389s(r7, r2)
            r2 = 1
            r1.mo86854j(r2)
            if (r3 == 0) goto L_0x003a
            r5 = 454(0x1c6, float:6.36E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r5)
        L_0x003a:
            java.lang.Object r4 = r4.get()
            com.google.android.apps.gsa.speech.audio.e.h r4 = (com.google.android.apps.gsa.speech.audio.p7268e.C92193h) r4
            android.media.AudioTrack r5 = r4.f257028a
            int r4 = r4.f257029b
            r5.play()
            r11 = 0
            r12 = -1
            r13 = 0
        L_0x004b:
            if (r11 >= r4) goto L_0x00d4
            int r11 = r5.getPlayState()
            r15 = 3
            if (r11 != r15) goto L_0x0059
            int r11 = r5.getPlaybackHeadPosition()
            goto L_0x0079
        L_0x0059:
            int r11 = r5.getState()
            if (r11 == r2) goto L_0x0078
            r15 = 2
            if (r11 == r15) goto L_0x0076
            com.google.common.f.e r15 = com.google.android.apps.gsa.speech.audio.p7268e.C92194i.f257030a
            com.google.common.f.x r15 = r15.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r6, r8)
            java.lang.String r6 = "PlayTask: AudioTrack in state %d"
            r9 = 12232(0x2fc8, float:1.714E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r9)).mo56387q(r6, r11)
            r11 = -1
            goto L_0x0079
        L_0x0076:
            r11 = 0
            goto L_0x0079
        L_0x0078:
            r11 = r4
        L_0x0079:
            if (r11 < r4) goto L_0x007c
            goto L_0x00d4
        L_0x007c:
            if (r11 >= 0) goto L_0x0080
            r6 = r3
            goto L_0x00d6
        L_0x0080:
            long r9 = (long) r4
            r6 = r3
            long r2 = (long) r11
            long r9 = r9 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r2
            r2 = 16000(0x3e80, double:7.905E-320)
            long r9 = r9 / r2
            r2 = 50
            r16 = r8
            r7 = 500(0x1f4, double:2.47E-321)
            int r17 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r17 >= 0) goto L_0x0097
            r9 = r2
            goto L_0x009c
        L_0x0097:
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x009c
            r9 = r7
        L_0x009c:
            if (r11 != r12) goto L_0x00c4
            long r13 = r13 + r9
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00c1
            com.google.common.f.e r2 = com.google.android.apps.gsa.speech.audio.p7268e.C92194i.f257030a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12 = r16
            r2.mo56378ag(r3, r12)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            r3 = 12236(0x2fcc, float:1.7146E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = "Waited unsuccessfully for %d ms for AudioTrack to make progress, Aborting"
            r2.mo56388r(r3, r7)
        L_0x00bf:
            r2 = 1
            goto L_0x00d6
        L_0x00c1:
            r12 = r16
            goto L_0x00c8
        L_0x00c4:
            r12 = r16
            r13 = 0
        L_0x00c8:
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x00d2 }
            r3 = r6
            r8 = r12
            r2 = 1
            r6 = 0
            r12 = r11
            goto L_0x004b
        L_0x00d2:
            goto L_0x00bf
        L_0x00d4:
            r6 = r3
            r2 = 0
        L_0x00d6:
            r5.release()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00e4
            r3 = 455(0x1c7, float:6.38E-43)
            com.google.android.apps.gsa.shared.logger.C89949q.m146523g(r3)
        L_0x00e4:
            r3 = -1
            r1.mo86854j(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
        L_0x00ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.audio.p7268e.C92191f.mo17879a(java.lang.Object):java.lang.Object");
    }
}
