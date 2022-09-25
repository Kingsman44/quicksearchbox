package com.google.android.voiceinteraction;

/* renamed from: com.google.android.voiceinteraction.k */
/* compiled from: PG */
public final /* synthetic */ class C45403k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45404l f118776a;

    public /* synthetic */ C45403k(C45404l lVar) {
        this.f118776a = lVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r18 = this;
            r1 = r18
            com.google.android.voiceinteraction.l r2 = r1.f118776a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r3 = r2.f118778b
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.Object r4 = r3.f118725u
            monitor-enter(r4)
            com.google.android.hotword.service.i r0 = r3.f118661aG     // Catch:{ all -> 0x01d5 }
            r5 = 0
            if (r0 != 0) goto L_0x0013
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            goto L_0x01c7
        L_0x0013:
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            java.lang.Object r4 = r3.f118725u     // Catch:{ RemoteException -> 0x01a3 }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x01a3 }
            com.google.android.hotword.service.i r0 = r3.f118661aG     // Catch:{ all -> 0x01a0 }
            com.google.android.hotword.service.HotwordInformation r0 = r0.mo123389a()     // Catch:{ all -> 0x01a0 }
            monitor-exit(r4)     // Catch:{ all -> 0x01a0 }
            if (r0 == 0) goto L_0x019e
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r4 = r0.f395876H     // Catch:{ RemoteException -> 0x01a3 }
            java.lang.Object r6 = r3.f118726v     // Catch:{ RemoteException -> 0x01a3 }
            monitor-enter(r6)     // Catch:{ RemoteException -> 0x01a3 }
            com.google.android.hotword.service.HotwordInformation r7 = r3.f118664aJ     // Catch:{ all -> 0x019b }
            r8 = 1
            if (r7 != 0) goto L_0x002f
            if (r4 == 0) goto L_0x002f
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
        L_0x002d:
            r4 = 1
            goto L_0x0054
        L_0x002f:
            if (r7 == 0) goto L_0x0039
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r9 = r7.f395876H     // Catch:{ all -> 0x019b }
            if (r9 != 0) goto L_0x0039
            if (r4 == 0) goto L_0x0039
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
            goto L_0x002d
        L_0x0039:
            if (r7 == 0) goto L_0x0043
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r9 = r7.f395876H     // Catch:{ all -> 0x019b }
            if (r9 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x0043
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
            goto L_0x002d
        L_0x0043:
            if (r7 == 0) goto L_0x0052
            com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.DspModelInformation r7 = r7.f395876H     // Catch:{ all -> 0x019b }
            if (r7 == 0) goto L_0x0052
            if (r4 == 0) goto L_0x0052
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x019b }
            r4 = r4 ^ r8
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
            goto L_0x0054
        L_0x0052:
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
            r4 = 0
        L_0x0054:
            byte[] r6 = r0.f395875G     // Catch:{ RemoteException -> 0x01a3 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r7 = r0.f395887h     // Catch:{ RemoteException -> 0x01a3 }
            java.lang.Object r9 = r3.f118726v     // Catch:{ RemoteException -> 0x01a3 }
            monitor-enter(r9)     // Catch:{ RemoteException -> 0x01a3 }
            com.google.android.hotword.service.HotwordInformation r10 = r3.f118664aJ     // Catch:{ all -> 0x0198 }
            if (r10 != 0) goto L_0x0062
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            r6 = 1
            goto L_0x0073
        L_0x0062:
            byte[] r11 = r10.f395875G     // Catch:{ all -> 0x0198 }
            if (r11 != r6) goto L_0x0071
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r6 = r10.f395887h     // Catch:{ all -> 0x0198 }
            boolean r6 = p3186j$.util.Objects.equals(r6, r7)     // Catch:{ all -> 0x0198 }
            if (r6 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r6 = 0
            goto L_0x0072
        L_0x0071:
            r6 = 1
        L_0x0072:
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
        L_0x0073:
            boolean r7 = r0.f395883d     // Catch:{ RemoteException -> 0x01a3 }
            java.lang.Object r9 = r3.f118726v     // Catch:{ RemoteException -> 0x01a3 }
            monitor-enter(r9)     // Catch:{ RemoteException -> 0x01a3 }
            boolean r10 = r3.f118704az     // Catch:{ all -> 0x0195 }
            if (r10 != 0) goto L_0x007f
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
            r8 = 0
            goto L_0x008f
        L_0x007f:
            com.google.android.hotword.service.HotwordInformation r10 = r3.f118664aJ     // Catch:{ all -> 0x0195 }
            if (r10 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x0086
            goto L_0x008e
        L_0x0086:
            boolean r10 = r10.f395883d     // Catch:{ all -> 0x0195 }
            if (r10 == r7) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
            goto L_0x008f
        L_0x008e:
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
        L_0x008f:
            java.lang.Object r7 = r3.f118726v     // Catch:{ RemoteException -> 0x01a3 }
            monitor-enter(r7)     // Catch:{ RemoteException -> 0x01a3 }
            boolean r9 = r0.f395871C     // Catch:{ all -> 0x0192 }
            j$.time.Duration r11 = r0.f395872D     // Catch:{ all -> 0x0192 }
            java.lang.Object r15 = r3.f118726v     // Catch:{ all -> 0x0192 }
            monitor-enter(r15)     // Catch:{ all -> 0x0192 }
            if (r9 != 0) goto L_0x00a9
            com.google.common.base.ax r9 = r3.f118715k     // Catch:{ all -> 0x018b }
            boolean r9 = r9.mo56113h()     // Catch:{ all -> 0x018b }
            if (r9 == 0) goto L_0x00fc
            com.google.common.base.b r9 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x018b }
            r3.f118715k = r9     // Catch:{ all -> 0x018b }
            monitor-exit(r15)     // Catch:{ all -> 0x018b }
            goto L_0x00ff
        L_0x00a9:
            com.google.common.base.ax r9 = r3.f118715k     // Catch:{ all -> 0x018b }
            boolean r9 = r9.mo56113h()     // Catch:{ all -> 0x018b }
            if (r9 != 0) goto L_0x00fc
            dagger.a r9 = r3.f118693ao     // Catch:{ all -> 0x018b }
            java.lang.Object r9 = r9.mo27525b()     // Catch:{ all -> 0x018b }
            com.google.android.apps.gsa.shared.ak.e r9 = (com.google.android.apps.gsa.shared.p6987ak.C89191e) r9     // Catch:{ all -> 0x018b }
            com.google.android.apps.gsa.shared.ak.d r16 = new com.google.android.apps.gsa.shared.ak.d     // Catch:{ all -> 0x018b }
            r11.getClass()     // Catch:{ all -> 0x018b }
            g.a.a r10 = r9.f241813a     // Catch:{ all -> 0x018b }
            java.lang.Object r10 = r10.mo17428b()     // Catch:{ all -> 0x018b }
            r12 = r10
            com.google.common.v.i r12 = (com.google.common.p4580v.C60950i) r12     // Catch:{ all -> 0x018b }
            r12.getClass()     // Catch:{ all -> 0x018b }
            g.a.a r10 = r9.f241814b     // Catch:{ all -> 0x018b }
            dagger.a.g r10 = (dagger.p5294a.C68221g) r10     // Catch:{ all -> 0x018b }
            java.lang.Object r10 = r10.f184583a     // Catch:{ all -> 0x018b }
            r13 = r10
            com.google.common.base.ax r13 = (com.google.common.base.C58833ax) r13     // Catch:{ all -> 0x018b }
            r13.getClass()     // Catch:{ all -> 0x018b }
            g.a.a r10 = r9.f241815c     // Catch:{ all -> 0x018b }
            java.lang.Object r10 = r10.mo17428b()     // Catch:{ all -> 0x018b }
            r14 = r10
            android.content.Context r14 = (android.content.Context) r14     // Catch:{ all -> 0x018b }
            r14.getClass()     // Catch:{ all -> 0x018b }
            g.a.a r9 = r9.f241816d     // Catch:{ all -> 0x018b }
            java.lang.Object r9 = r9.mo17428b()     // Catch:{ all -> 0x018b }
            java.util.concurrent.Executor r9 = (java.util.concurrent.Executor) r9     // Catch:{ all -> 0x018b }
            r9.getClass()     // Catch:{ all -> 0x018b }
            r10 = r16
            r17 = r15
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0190 }
            com.google.common.base.ax r9 = com.google.common.base.C58833ax.m90834k(r16)     // Catch:{ all -> 0x0190 }
            r3.f118715k = r9     // Catch:{ all -> 0x0190 }
            goto L_0x00fe
        L_0x00fc:
            r17 = r15
        L_0x00fe:
            monitor-exit(r17)     // Catch:{ all -> 0x0190 }
        L_0x00ff:
            r3.f118664aJ = r0     // Catch:{ all -> 0x0192 }
            monitor-exit(r7)     // Catch:{ all -> 0x0192 }
            r3.mo49408W(r0, r4, r6, r8)     // Catch:{ RemoteException -> 0x01a3 }
            java.lang.String r4 = r0.f395888i     // Catch:{ RemoteException -> 0x01a3 }
            java.lang.String r6 = r0.f395891l     // Catch:{ RemoteException -> 0x01a3 }
            boolean r4 = r3.mo49418ag(r4, r6, r5)     // Catch:{ RemoteException -> 0x01a3 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r6 = r0.f395887h     // Catch:{ RemoteException -> 0x0189 }
            r3.mo49394I(r6)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.ax r6 = r3.f118639K     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ RemoteException -> 0x0189 }
            com.google.android.apps.gsa.shared.bisto.ad r6 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r6     // Catch:{ RemoteException -> 0x0189 }
            byte[] r7 = r0.f395875G     // Catch:{ RemoteException -> 0x0189 }
            r6.mo83464j(r7)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.ax r6 = r3.f118639K     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ RemoteException -> 0x0189 }
            com.google.android.apps.gsa.shared.bisto.ad r6 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.String r7 = r0.f395891l     // Catch:{ RemoteException -> 0x0189 }
            r6.mo83465k(r7)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.ax r6 = r3.f118639K     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ RemoteException -> 0x0189 }
            com.google.android.apps.gsa.shared.bisto.ad r6 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.String r7 = r0.f395888i     // Catch:{ RemoteException -> 0x0189 }
            r6.mo83466l(r7)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.ax r6 = r3.f118639K     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ RemoteException -> 0x0189 }
            com.google.android.apps.gsa.shared.bisto.ad r6 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r6     // Catch:{ RemoteException -> 0x0189 }
            boolean r7 = r0.f395899t     // Catch:{ RemoteException -> 0x0189 }
            r6.mo83470p(r7)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.ax r6 = r3.f118639K     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.base.bk r6 = (com.google.common.base.C58847bk) r6     // Catch:{ RemoteException -> 0x0189 }
            java.lang.Object r6 = r6.f156646a     // Catch:{ RemoteException -> 0x0189 }
            com.google.android.apps.gsa.shared.bisto.ad r6 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r6     // Catch:{ RemoteException -> 0x0189 }
            boolean r7 = r0.f395895p     // Catch:{ RemoteException -> 0x0189 }
            r6.mo83467m(r7)     // Catch:{ RemoteException -> 0x0189 }
            int r6 = r3.f118703ay     // Catch:{ RemoteException -> 0x0189 }
            r7 = 2
            if (r6 != r7) goto L_0x01ba
            boolean r6 = r3.f118663aI     // Catch:{ RemoteException -> 0x0189 }
            if (r6 != 0) goto L_0x01ba
            boolean r0 = r0.f395883d     // Catch:{ RemoteException -> 0x0189 }
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r3.f118719o     // Catch:{ RemoteException -> 0x0189 }
            if (r0 != 0) goto L_0x01ba
            boolean r0 = r3.f118662aH     // Catch:{ RemoteException -> 0x0189 }
            if (r0 == 0) goto L_0x01ba
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0189 }
            java.lang.String r7 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r6, r7)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0189 }
            r6 = 54546(0xd512, float:7.6435E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)     // Catch:{ RemoteException -> 0x0189 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ RemoteException -> 0x0189 }
            java.lang.String r6 = "Starting Recognition in fetchAndSetHotworInformation"
            r0.mo56386p(r6)     // Catch:{ RemoteException -> 0x0189 }
            r3.mo49420ai()     // Catch:{ RemoteException -> 0x0189 }
            goto L_0x01ba
        L_0x0189:
            r0 = move-exception
            goto L_0x01a5
        L_0x018b:
            r0 = move-exception
            r17 = r15
        L_0x018e:
            monitor-exit(r17)     // Catch:{ all -> 0x0190 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0190:
            r0 = move-exception
            goto L_0x018e
        L_0x0192:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ RemoteException -> 0x01a3 }
        L_0x0195:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0195 }
            throw r0     // Catch:{ RemoteException -> 0x01a3 }
        L_0x0198:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0198 }
            throw r0     // Catch:{ RemoteException -> 0x01a3 }
        L_0x019b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ RemoteException -> 0x01a3 }
        L_0x019e:
            r4 = 0
            goto L_0x01ba
        L_0x01a0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01a0 }
            throw r0     // Catch:{ RemoteException -> 0x01a3 }
        L_0x01a3:
            r0 = move-exception
            r4 = 0
        L_0x01a5:
            com.google.common.f.e r6 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "GsaVoiceInteractionSrv"
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "Remote Exception"
            r8 = 54547(0xd513, float:7.6437E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r8)).mo56386p(r7)
        L_0x01ba:
            if (r4 != 0) goto L_0x01c7
            java.lang.Object r4 = r3.f118725u
            monitor-enter(r4)
            r3.mo49405T()     // Catch:{ all -> 0x01c4 }
            monitor-exit(r4)     // Catch:{ all -> 0x01c4 }
            goto L_0x01c7
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c4 }
            throw r0
        L_0x01c7:
            boolean r0 = r2.f118777a
            if (r0 == 0) goto L_0x01d4
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r2.f118778b
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_INTERACTION_SERVICE_START
            r0.mo49388C(r3)
            r2.f118777a = r5
        L_0x01d4:
            return
        L_0x01d5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            goto L_0x01d9
        L_0x01d8:
            throw r0
        L_0x01d9:
            goto L_0x01d8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45403k.run():void");
    }
}
