package com.google.android.voiceinteraction;

import android.service.voice.AlwaysOnHotwordDetector;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.search.assistant.p2820v.p2821a.C36771a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.aj */
/* compiled from: PG */
final class C45381aj extends AlwaysOnHotwordDetector.Callback {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118754a;

    public C45381aj(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118754a = gsaVoiceInteractionService;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void onAvailabilityChanged(int r8) {
        /*
            r7 = this;
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onAvailabilityChanged %d"
            r2 = 54463(0xd4bf, float:7.6319E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56387q(r1, r8)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            r0.mo49402Q()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 1
            if (r0 < r1) goto L_0x003f
            if (r8 != r2) goto L_0x003f
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            java.lang.Object r0 = r8.f118701aw
            monitor-enter(r0)
            java.lang.String r1 = r8.f118659aE     // Catch:{ all -> 0x003c }
            java.lang.String r3 = r8.f118658aD     // Catch:{ all -> 0x003c }
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)     // Catch:{ all -> 0x003c }
            int r8 = r8.mo49424f(r1, r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            r0 = -1
            if (r8 != r0) goto L_0x003a
            r8 = -1
            goto L_0x003f
        L_0x003a:
            r8 = 1
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r8
        L_0x003f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            java.lang.Object r0 = r0.f118701aw
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r7.f118754a     // Catch:{ all -> 0x01c7 }
            android.service.voice.AlwaysOnHotwordDetector r3 = r1.f118702ax     // Catch:{ all -> 0x01c7 }
            r4 = 0
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = r1.f118658aD     // Catch:{ all -> 0x01c7 }
            if (r3 == 0) goto L_0x005f
            java.lang.String r5 = r1.f118659aE     // Catch:{ all -> 0x01c7 }
            if (r5 == 0) goto L_0x005f
            r1.mo49418ag(r3, r5, r4)     // Catch:{ all -> 0x01c7 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r7.f118754a     // Catch:{ all -> 0x01c7 }
            java.lang.String r2 = "ignoring availability change as AOHD is null"
            r1.mo49454z(r8, r2)     // Catch:{ all -> 0x01c7 }
            monitor-exit(r0)     // Catch:{ all -> 0x01c7 }
            return
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x01c7 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            r0.f118703ay = r8
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            java.lang.String r1 = "AOHD update"
            r0.mo49454z(r8, r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            int r0 = r8.f118703ay
            int r0 = r8.f118703ay
            r1 = -2
            if (r0 == r1) goto L_0x0115
            if (r0 == r2) goto L_0x010c
            r3 = 2
            if (r0 == r3) goto L_0x007b
            goto L_0x0126
        L_0x007b:
            java.lang.Object r0 = r8.f118725u     // Catch:{ RemoteException -> 0x00f5 }
            monitor-enter(r0)     // Catch:{ RemoteException -> 0x00f5 }
            boolean r3 = r8.mo49419ah()     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00ae
            boolean r3 = r8.f118724t     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00ae
            com.google.common.f.e r3 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x00f2 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x00f2 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r5, r6)     // Catch:{ all -> 0x00f2 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f2 }
            r5 = 54574(0xd52e, float:7.6474E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x00f2 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f2 }
            java.lang.String r5 = "reenrolling DSP model on service start"
            r3.mo56386p(r5)     // Catch:{ all -> 0x00f2 }
            com.google.android.apps.gsa.shared.logger.b.ae r3 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.REENROLL_ON_SERVICE_START     // Catch:{ all -> 0x00f2 }
            r8.mo49387B(r3)     // Catch:{ all -> 0x00f2 }
            r8.mo49450v()     // Catch:{ all -> 0x00f2 }
            goto L_0x00e9
        L_0x00ae:
            com.google.android.hotword.service.i r3 = r8.f118661aG     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00c0
            boolean r5 = r8.f118719o     // Catch:{ all -> 0x00f2 }
            if (r5 != 0) goto L_0x00e9
            boolean r3 = r3.mo123398j()     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00e9
            r8.mo49420ai()     // Catch:{ all -> 0x00f2 }
            goto L_0x00e9
        L_0x00c0:
            boolean r3 = r8.f118663aI     // Catch:{ all -> 0x00f2 }
            if (r3 == 0) goto L_0x00cc
            boolean r3 = r8.f118719o     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x00cc
            r8.mo49420ai()     // Catch:{ all -> 0x00f2 }
            goto L_0x00e9
        L_0x00cc:
            com.google.common.f.e r3 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x00f2 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x00f2 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f2 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r5, r6)     // Catch:{ all -> 0x00f2 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f2 }
            r5 = 54569(0xd529, float:7.6467E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)     // Catch:{ all -> 0x00f2 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00f2 }
            java.lang.String r5 = "Not starting recognition"
            r3.mo56386p(r5)     // Catch:{ all -> 0x00f2 }
        L_0x00e9:
            com.google.android.hotword.service.i r3 = r8.f118661aG     // Catch:{ all -> 0x00f2 }
            if (r3 != 0) goto L_0x00f0
            r8.mo49433o()     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x0126
        L_0x00f2:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f2 }
            throw r3     // Catch:{ RemoteException -> 0x00f5 }
        L_0x00f5:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r3.mo56378ag(r5, r6)
            java.lang.String r5 = "RemoteException"
            r6 = 54570(0xd52a, float:7.6469E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
            goto L_0x0126
        L_0x010c:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.AUTOMATIC_ENROLL_AFTER_UNENROLL
            r8.mo49387B(r0)
            r8.mo49450v()
            goto L_0x0126
        L_0x0115:
            java.lang.Object r3 = r8.f118726v
            monitor-enter(r3)
            com.google.android.hotword.service.HotwordInformation r0 = r8.f118664aJ     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.f395873E     // Catch:{ all -> 0x01c4 }
            if (r0 == 0) goto L_0x0125
            com.google.android.libraries.search.assistant.v.a.a r0 = com.google.android.libraries.search.assistant.p2820v.p2821a.C36771a.DSP_HARDWARE_UNAVAILABLE_WHEN_NEEDED     // Catch:{ all -> 0x01c4 }
            r8.mo49401P(r0)     // Catch:{ all -> 0x01c4 }
        L_0x0125:
            monitor-exit(r3)     // Catch:{ all -> 0x01c4 }
        L_0x0126:
            boolean r0 = r8.f118724t
            if (r0 == 0) goto L_0x012c
            r8.f118724t = r4
        L_0x012c:
            java.lang.Object r0 = r8.f118725u
            monitor-enter(r0)
            com.google.android.hotword.service.i r3 = r8.f118661aG     // Catch:{ all -> 0x01c1 }
            if (r3 == 0) goto L_0x019e
            int r5 = r8.f118703ay     // Catch:{ RemoteException -> 0x0176 }
            if (r5 == r1) goto L_0x0139
            r5 = 1
            goto L_0x013a
        L_0x0139:
            r5 = 0
        L_0x013a:
            r3.mo123395g(r5)     // Catch:{ RemoteException -> 0x0176 }
            java.lang.String r3 = ""
            java.lang.Object r5 = r8.f118726v     // Catch:{ RemoteException -> 0x0176 }
            monitor-enter(r5)     // Catch:{ RemoteException -> 0x0176 }
            com.google.android.hotword.service.HotwordInformation r6 = r8.f118664aJ     // Catch:{ all -> 0x0173 }
            if (r6 == 0) goto L_0x0148
            java.lang.String r3 = r6.f395888i     // Catch:{ all -> 0x0173 }
        L_0x0148:
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r3)     // Catch:{ RemoteException -> 0x0176 }
            if (r5 != 0) goto L_0x019a
            java.lang.String r5 = "X Google"
            java.lang.String r6 = "X Google"
            java.lang.String r6 = r8.mo49432n(r3, r6)     // Catch:{ RemoteException -> 0x0176 }
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)     // Catch:{ RemoteException -> 0x0176 }
            int r5 = r8.mo49424f(r5, r6)     // Catch:{ RemoteException -> 0x0176 }
            com.google.android.hotword.service.i r6 = r8.f118661aG     // Catch:{ RemoteException -> 0x0176 }
            if (r6 == 0) goto L_0x019a
            if (r5 == r1) goto L_0x019a
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE     // Catch:{ RemoteException -> 0x0176 }
            int r1 = r1.f253255d     // Catch:{ RemoteException -> 0x0176 }
            if (r5 != r2) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            r6.mo123396h(r1, r2, r3)     // Catch:{ RemoteException -> 0x0176 }
            goto L_0x019a
        L_0x0173:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0173 }
            throw r1     // Catch:{ RemoteException -> 0x0176 }
        L_0x0176:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x01c1 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x01c1 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01c1 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x01c1 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x01c1 }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x01c1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01c1 }
            r2 = 54565(0xd525, float:7.6462E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x01c1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01c1 }
            java.lang.String r2 = "RemoteException"
            r1.mo56386p(r2)     // Catch:{ all -> 0x01c1 }
        L_0x019a:
            r8.mo49405T()     // Catch:{ all -> 0x01c1 }
            goto L_0x01a1
        L_0x019e:
            r8.mo49433o()     // Catch:{ all -> 0x01c1 }
        L_0x01a1:
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.android.voiceinteraction.av r0 = r8.f118665aK
            if (r0 == 0) goto L_0x01ab
            r8.mo49452x()
        L_0x01ab:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            r8.mo49449u()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            java.util.concurrent.Executor r8 = r8.f118721q
            com.google.android.voiceinteraction.ai r0 = new com.google.android.voiceinteraction.ai
            r0.<init>(r7)
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r0)
            r8.execute(r0)
            return
        L_0x01c1:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c1 }
            throw r8
        L_0x01c4:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01c4 }
            throw r8
        L_0x01c7:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01c7 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45381aj.onAvailabilityChanged(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x018f, code lost:
        if (r7.f118754a.mo49416ae() != false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0191, code lost:
        r7.f118754a.f118660aF.sendEmptyMessage(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0198, code lost:
        r0 = r7.f118754a.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019c, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r8 = r7.f118754a;
        r1 = r8.f118632D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a1, code lost:
        if (r1 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a5, code lost:
        if (r1.f331150m != false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a7, code lost:
        r8 = r8.f118660aF.obtainMessage(4, r5.f51968b.getSampleRate(), 0);
        r1 = r7.f118754a;
        r2 = r1.f118660aF;
        r3 = r1.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ba, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r1 = r1.f118664aJ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bd, code lost:
        if (r1 == null) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bf, code lost:
        r1 = r1.f395890k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c1, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01c3, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c4, code lost:
        r1 = com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar.LENGTH_SHORT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r2.sendMessageDelayed(r8, (long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ce, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cf, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDetected(android.service.voice.AlwaysOnHotwordDetector.EventPayload r8) {
        /*
            r7 = this;
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            com.google.android.libraries.f.a r1 = r0.f118652X
            long r1 = r1.mo26871c()
            r0.f118714j = r1
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onDetected"
            r2 = 54464(0xd4c0, float:7.632E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            int r0 = r0.f118703ay
            r1 = 2
            if (r0 == r1) goto L_0x0052
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r2, r3)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 54467(0xd4c3, float:7.6325E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = "Availability is %d, but hotword still detected"
            com.google.android.voiceinteraction.GsaVoiceInteractionService r3 = r7.f118754a
            int r3 = r3.f118703ay
            r0.mo56387q(r2, r3)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            r0.f118703ay = r1
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            java.lang.String r2 = "hotword detected"
            r0.mo49454z(r1, r2)
        L_0x0052:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            java.util.concurrent.ConcurrentMap r0 = r0.f118695aq
            double r2 = java.lang.Math.random()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.put(r2, r3)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            r2 = 0
            r0.f118663aI = r2
            byte[] r0 = r8.getTriggerAudio()
            int r3 = com.google.android.voiceinteraction.GsaVoiceInteractionService.m80893b(r8)
            if (r0 != 0) goto L_0x008b
            if (r3 < 0) goto L_0x0075
            goto L_0x008b
        L_0x0075:
            com.google.common.f.e r8 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r8.mo56378ag(r0, r1)
            java.lang.String r0 = "No trigger audio present"
            r1 = 54466(0xd4c2, float:7.6323E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x008b:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a
            long r3 = r0.f118714j
            android.media.AudioFormat r0 = r8.getCaptureAudioFormat()
            if (r0 != 0) goto L_0x00c3
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r5, r6)
            java.lang.String r5 = "AudioFormat is not available in EventPayload"
            r6 = 54508(0xd4ec, float:7.6382E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r6)).mo56386p(r5)
            android.media.AudioFormat$Builder r0 = new android.media.AudioFormat$Builder
            r0.<init>()
            r5 = 16
            android.media.AudioFormat$Builder r0 = r0.setChannelMask(r5)
            android.media.AudioFormat$Builder r0 = r0.setEncoding(r1)
            r5 = 16000(0x3e80, float:2.2421E-41)
            android.media.AudioFormat$Builder r0 = r0.setSampleRate(r5)
            android.media.AudioFormat r0 = r0.build()
        L_0x00c3:
            int r8 = com.google.android.voiceinteraction.GsaVoiceInteractionService.m80893b(r8)
            com.google.android.libraries.assistant.hotword.a.a r5 = new com.google.android.libraries.assistant.hotword.a.a
            r5.<init>(r3, r0, r8)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            dagger.a r8 = r8.f118650V
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r8 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r8
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DSP_TRIGGERED
            r8.mo83702b(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            dagger.a r8 = r8.f118684af
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ag r8 = (com.google.android.apps.gsa.shared.speech.dumper.C90544ag) r8
            r8.mo84662c()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            boolean r8 = r8.mo49412aa()
            if (r8 == 0) goto L_0x0137
            com.google.common.f.e r8 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r8.mo56378ag(r0, r2)
            java.lang.String r0 = "Bisto device connected, dropping DSP event."
            r2 = 54465(0xd4c1, float:7.6322E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            r8.mo49393H()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "#handleNotProcessingDspData"
            r3 = 54577(0xd531, float:7.6479E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            android.media.AudioRecord r0 = com.google.android.libraries.assistant.hotword.C18371h.m35743i(r5)
            if (r0 == 0) goto L_0x012a
            r0.release()
        L_0x012a:
            com.google.android.voiceinteraction.ao r8 = r8.f118660aF
            r8.sendEmptyMessage(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.DSP_REJECTED_BISTO_DEVICE_HOTWORD_ACTIVE
            r8.mo49390E(r0)
            return
        L_0x0137:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            r8.f118717m = r2
            java.lang.Object r8 = r8.f118726v
            monitor-enter(r8)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a     // Catch:{ all -> 0x01f5 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r0.f118632D     // Catch:{ all -> 0x01f5 }
            r3 = 6
            if (r0 == 0) goto L_0x0157
            r0.mo103914f()     // Catch:{ all -> 0x01f5 }
            r0.mo103911c()     // Catch:{ all -> 0x01f5 }
            com.google.android.libraries.assistant.hotword.l r4 = r0.f331139b     // Catch:{ all -> 0x01f5 }
            int r4 = r4.mo23789a(r5)     // Catch:{ all -> 0x01f5 }
            if (r4 == r3) goto L_0x0158
            r0.mo103915g()     // Catch:{ all -> 0x01f5 }
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            r0 = 5
            if (r4 != r0) goto L_0x0161
            com.google.android.voiceinteraction.GsaVoiceInteractionService r4 = r7.f118754a     // Catch:{ all -> 0x01f5 }
            r4.mo49433o()     // Catch:{ all -> 0x01f5 }
            r4 = 5
        L_0x0161:
            monitor-exit(r8)     // Catch:{ all -> 0x01f5 }
            if (r4 != r3) goto L_0x01d6
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            java.lang.Object r8 = r8.f118726v
            monitor-enter(r8)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r7.f118754a     // Catch:{ all -> 0x01d3 }
            com.google.android.hotword.service.HotwordInformation r1 = r1.f118664aJ     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x0188
            boolean r3 = r1.f395892m     // Catch:{ all -> 0x01d3 }
            if (r3 != 0) goto L_0x0188
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r1.f395887h     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x017f
            com.google.common.base.ax r1 = r1.f253284b     // Catch:{ all -> 0x01d3 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x01d3 }
            if (r1 != 0) goto L_0x0188
        L_0x017f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118754a     // Catch:{ all -> 0x01d3 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r0.f118632D     // Catch:{ all -> 0x01d3 }
            r0.mo103921m()     // Catch:{ all -> 0x01d3 }
            monitor-exit(r8)     // Catch:{ all -> 0x01d3 }
            return
        L_0x0188:
            monitor-exit(r8)     // Catch:{ all -> 0x01d3 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            boolean r8 = r8.mo49416ae()
            if (r8 != 0) goto L_0x0198
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.android.voiceinteraction.ao r8 = r8.f118660aF
            r8.sendEmptyMessage(r0)
        L_0x0198:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            java.lang.Object r0 = r8.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a     // Catch:{ all -> 0x01d0 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r8.f118632D     // Catch:{ all -> 0x01d0 }
            if (r1 == 0) goto L_0x01ce
            boolean r1 = r1.f331150m     // Catch:{ all -> 0x01d0 }
            if (r1 != 0) goto L_0x01ce
            com.google.android.voiceinteraction.ao r8 = r8.f118660aF     // Catch:{ all -> 0x01d0 }
            android.media.AudioFormat r1 = r5.f51968b     // Catch:{ all -> 0x01d0 }
            int r1 = r1.getSampleRate()     // Catch:{ all -> 0x01d0 }
            r3 = 4
            android.os.Message r8 = r8.obtainMessage(r3, r1, r2)     // Catch:{ all -> 0x01d0 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r7.f118754a     // Catch:{ all -> 0x01d0 }
            com.google.android.voiceinteraction.ao r2 = r1.f118660aF     // Catch:{ all -> 0x01d0 }
            java.lang.Object r3 = r1.f118726v     // Catch:{ all -> 0x01d0 }
            monitor-enter(r3)     // Catch:{ all -> 0x01d0 }
            com.google.android.hotword.service.HotwordInformation r1 = r1.f118664aJ     // Catch:{ all -> 0x01cb }
            if (r1 == 0) goto L_0x01c3
            int r1 = r1.f395890k     // Catch:{ all -> 0x01cb }
            monitor-exit(r3)     // Catch:{ all -> 0x01cb }
            goto L_0x01c6
        L_0x01c3:
            monitor-exit(r3)     // Catch:{ all -> 0x01cb }
            r1 = 2000(0x7d0, float:2.803E-42)
        L_0x01c6:
            long r3 = (long) r1
            r2.sendMessageDelayed(r8, r3)     // Catch:{ all -> 0x01d0 }
            goto L_0x01ce
        L_0x01cb:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01cb }
            throw r8     // Catch:{ all -> 0x01d0 }
        L_0x01ce:
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            return
        L_0x01d0:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01d0 }
            throw r8
        L_0x01d3:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01d3 }
            throw r0
        L_0x01d6:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FAILED_TO_START_2ND_STAGE_HOTWORD
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.o.cb r3 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.aj r3 = (com.google.common.p4552o.C59582aj) r3
            r8.mo49391F(r0, r2, r3)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118754a
            com.google.android.voiceinteraction.ao r8 = r8.f118660aF
            r8.sendEmptyMessage(r1)
            return
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01f5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45381aj.onDetected(android.service.voice.AlwaysOnHotwordDetector$EventPayload):void");
    }

    public final void onError() {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        this.f118754a.mo49386A(C89849ae.DSP_ALWAYS_ON_DETECTOR_ERROR);
        this.f118754a.mo49401P(C36771a.DSP_HOTWORD_DETECTOR_ERROR);
        if (this.f118754a.f118703ay == 2) {
            this.f118754a.f118660aF.sendEmptyMessageDelayed(2, 5000);
        }
    }

    public final void onRecognitionPaused() {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onRecognitionResumed() {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118754a;
        gsaVoiceInteractionService.f118663aI = true;
        gsaVoiceInteractionService.mo49398M();
    }
}
