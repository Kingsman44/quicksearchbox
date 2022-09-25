package com.google.android.voiceinteraction;

import android.os.Handler;

/* renamed from: com.google.android.voiceinteraction.ao */
/* compiled from: PG */
final class C45386ao extends Handler {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118759a;

    public C45386ao(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118759a = gsaVoiceInteractionService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        if (r0.mo49414ac() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r11 = r0.f118701aw;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r0.mo49417af(r10, r14, r0.f118655aA.get()) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56224b();
        r14.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(54528)).mo56386p("no need to update detector");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        if (r0.f118703ay != 2) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        r0.mo49406U();
        r0.f118702ax = null;
        r0.f118703ay = 0;
        r0.mo49387B(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTOR_DELETED);
        r0.mo49454z(r0.f118703ay, "deleted detector to start enrollment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        r1 = r0.mo49432n(r10, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56224b();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(54523)).mo56359L("Creating AOHD: Keyphrase - %s, Locale - %s/%s", r14, r10, r1);
        r0.mo49387B(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTOR_CREATED);
        r4 = r0.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5 = r0.f118664aJ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e8, code lost:
        if (r5 == null) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        if (com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r5.f395869A) == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        if (r5.f395877I == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if (r5.f395883d != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        if (r5.f395885f != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0104, code lost:
        if (r0.f118655aA.get() == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0108, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0109, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (r5 == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r12 = r0.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010e, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56224b();
        r4.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(54526)).mo56386p("Using Trusted Process.");
        r4 = r0.f118664aJ;
        r5 = r4.f395875G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r5 == null) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r6 = r4.f395887h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0136, code lost:
        if (r4.f395883d != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        if (r4.f395885f == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013c, code lost:
        if (r6 == null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013e, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0140, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0141, code lost:
        r0.f118702ax = r0.createAlwaysOnHotwordDetector(r14, java.util.Locale.forLanguageTag(r1), com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197093a(r5.length, r6, r4), com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197094b(r5, r6), r0.f118666aL);
        r0.f118703ay = 0;
        r0.f118704az = true;
        r0.mo49454z(r0.f118703ay, "created detector");
        r0.f118657aC = r0.f118664aJ.f395870B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016b, code lost:
        r0.mo49405T();
        r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56224b();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(54527)).mo56358K("Not creating AlwaysOnHotwordDetector.  AlwaysOnAvailable: %b, model != null: %b", r0.f118664aJ.f395882c, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018f, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0194, code lost:
        r0.f118702ax = r0.createAlwaysOnHotwordDetector(r14, java.util.Locale.forLanguageTag(r1), r0.f118669aO);
        r0.f118703ay = 0;
        r0.f118704az = false;
        r0.mo49454z(r0.f118703ay, "created detector");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(54525)).mo56386p("Service implementation not ready");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        r2 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56225c();
        r2.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(54524)).mo56386p("NPE at the time of creating AlwaysOnHotwordDetector");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            int r0 = r14.what
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x020c
            java.lang.String r0 = ","
            com.google.common.base.cf r0 = com.google.common.base.C58869cf.m90938d(r0)
            java.lang.Object r14 = r14.obj
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r14 = r0.mo56155i(r14)
            int r0 = r14.size()
            if (r0 != r1) goto L_0x0204
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r13.f118759a
            java.lang.Object r4 = r14.get(r2)
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r14 = r14.get(r3)
            java.lang.String r14 = (java.lang.String) r14
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r4 = r0.f118662aH
            if (r4 != 0) goto L_0x0046
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r14 = r14.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r0, r1)
            java.lang.String r0 = "Service is not ready yet."
            r1 = 54530(0xd502, float:7.6413E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0046:
            java.lang.Object r4 = r0.f118726v
            monitor-enter(r4)
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x0201 }
            if (r5 != 0) goto L_0x006c
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0201 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ all -> 0x0201 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0201 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r0, r1)     // Catch:{ all -> 0x0201 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0201 }
            r0 = 54529(0xd501, float:7.6411E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r0)     // Catch:{ all -> 0x0201 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0201 }
            java.lang.String r0 = "Cannot create AlwaysOnHotwordDetector without HotwordInformation."
            r14.mo56386p(r0)     // Catch:{ all -> 0x0201 }
            monitor-exit(r4)     // Catch:{ all -> 0x0201 }
            return
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x0201 }
            boolean r4 = r0.mo49414ac()
            if (r4 != 0) goto L_0x0075
            goto L_0x0451
        L_0x0075:
            java.lang.Object r11 = r0.f118701aw
            monitor-enter(r11)
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f118655aA     // Catch:{ all -> 0x01fe }
            boolean r4 = r4.get()     // Catch:{ all -> 0x01fe }
            boolean r4 = r0.mo49417af(r10, r14, r4)     // Catch:{ all -> 0x01fe }
            if (r4 != 0) goto L_0x00a3
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x01fe }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fe }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r0, r1)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x01fe }
            r0 = 54528(0xd500, float:7.641E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r0)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = "no need to update detector"
            r14.mo56386p(r0)     // Catch:{ all -> 0x01fe }
            monitor-exit(r11)     // Catch:{ all -> 0x01fe }
            return
        L_0x00a3:
            int r4 = r0.f118703ay     // Catch:{ all -> 0x01fe }
            if (r4 != r1) goto L_0x00bd
            r0.mo49406U()     // Catch:{ all -> 0x01fe }
            r1 = 0
            r0.f118702ax = r1     // Catch:{ all -> 0x01fe }
            r0.f118703ay = r2     // Catch:{ all -> 0x01fe }
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTOR_DELETED     // Catch:{ all -> 0x01fe }
            r0.mo49387B(r1)     // Catch:{ all -> 0x01fe }
            int r1 = r0.f118703ay     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "deleted detector to start enrollment"
            r0.mo49454z(r1, r2)     // Catch:{ all -> 0x01fe }
            goto L_0x01f8
        L_0x00bd:
            java.lang.String r1 = r0.mo49432n(r10, r14)     // Catch:{ all -> 0x01fe }
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            r5 = 54523(0xd4fb, float:7.6403E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            java.lang.String r5 = "Creating AOHD: Keyphrase - %s, Locale - %s/%s"
            r4.mo56359L(r5, r14, r10, r1)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_DETECTOR_CREATED     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            r0.mo49387B(r4)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            java.lang.Object r4 = r0.f118726v     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            monitor-enter(r4)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x0108
            boolean r6 = r5.f395869A     // Catch:{ all -> 0x01ac }
            boolean r6 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r6)     // Catch:{ all -> 0x01ac }
            if (r6 == 0) goto L_0x0108
            boolean r6 = r5.f395877I     // Catch:{ all -> 0x01ac }
            if (r6 == 0) goto L_0x0106
            boolean r6 = r5.f395883d     // Catch:{ all -> 0x01ac }
            if (r6 != 0) goto L_0x0106
            boolean r5 = r5.f395885f     // Catch:{ all -> 0x01ac }
            if (r5 != 0) goto L_0x0106
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f118655aA     // Catch:{ all -> 0x01ac }
            boolean r5 = r5.get()     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x0108
        L_0x0106:
            r5 = 1
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            if (r5 == 0) goto L_0x0194
            java.lang.Object r12 = r0.f118726v     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            monitor-enter(r12)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0191 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x0191 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0191 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x0191 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0191 }
            r5 = 54526(0xd4fe, float:7.6407E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x0191 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0191 }
            java.lang.String r5 = "Using Trusted Process."
            r4.mo56386p(r5)     // Catch:{ all -> 0x0191 }
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x0191 }
            byte[] r5 = r4.f395875G     // Catch:{ all -> 0x0191 }
            if (r5 == 0) goto L_0x016b
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r6 = r4.f395887h     // Catch:{ all -> 0x0191 }
            boolean r7 = r4.f395883d     // Catch:{ all -> 0x0191 }
            if (r7 != 0) goto L_0x013c
            boolean r4 = r4.f395885f     // Catch:{ all -> 0x0191 }
            if (r4 == 0) goto L_0x0140
        L_0x013c:
            if (r6 == 0) goto L_0x0140
            r4 = 1
            goto L_0x0141
        L_0x0140:
            r4 = 0
        L_0x0141:
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)     // Catch:{ all -> 0x0191 }
            int r7 = r5.length     // Catch:{ all -> 0x0191 }
            android.os.PersistableBundle r7 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197093a(r7, r6, r4)     // Catch:{ all -> 0x0191 }
            android.os.SharedMemory r8 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197094b(r5, r6)     // Catch:{ all -> 0x0191 }
            android.service.voice.AlwaysOnHotwordDetector$Callback r9 = r0.f118666aL     // Catch:{ all -> 0x0191 }
            r4 = r0
            r5 = r14
            r6 = r1
            android.service.voice.AlwaysOnHotwordDetector r1 = r4.createAlwaysOnHotwordDetector(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0191 }
            r0.f118702ax = r1     // Catch:{ all -> 0x0191 }
            r0.f118703ay = r2     // Catch:{ all -> 0x0191 }
            r0.f118704az = r3     // Catch:{ all -> 0x0191 }
            int r1 = r0.f118703ay     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = "created detector"
            r0.mo49454z(r1, r2)     // Catch:{ all -> 0x0191 }
            com.google.android.hotword.service.HotwordInformation r1 = r0.f118664aJ     // Catch:{ all -> 0x0191 }
            java.lang.String r1 = r1.f395870B     // Catch:{ all -> 0x0191 }
            r0.f118657aC = r1     // Catch:{ all -> 0x0191 }
            goto L_0x018f
        L_0x016b:
            r0.mo49405T()     // Catch:{ all -> 0x0191 }
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0191 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0191 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0191 }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r3, r4)     // Catch:{ all -> 0x0191 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0191 }
            r3 = 54527(0xd4ff, float:7.6409E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r3)     // Catch:{ all -> 0x0191 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = "Not creating AlwaysOnHotwordDetector.  AlwaysOnAvailable: %b, model != null: %b"
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x0191 }
            boolean r4 = r4.f395882c     // Catch:{ all -> 0x0191 }
            r1.mo56358K(r3, r4, r2)     // Catch:{ all -> 0x0191 }
        L_0x018f:
            monitor-exit(r12)     // Catch:{ all -> 0x0191 }
            goto L_0x01f8
        L_0x0191:
            r1 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0191 }
            throw r1     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
        L_0x0194:
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            android.service.voice.AlwaysOnHotwordDetector$Callback r3 = r0.f118669aO     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            android.service.voice.AlwaysOnHotwordDetector r1 = r0.createAlwaysOnHotwordDetector(r14, r1, r3)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            r0.f118702ax = r1     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            r0.f118703ay = r2     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            r0.f118704az = r2     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            int r1 = r0.f118703ay     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            java.lang.String r2 = "created detector"
            r0.mo49454z(r1, r2)     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
            goto L_0x01f8
        L_0x01ac:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            throw r1     // Catch:{ NullPointerException -> 0x01d4, IllegalStateException -> 0x01af }
        L_0x01af:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x01fe }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            r2 = 54525(0xd4fd, float:7.6406E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "Service implementation not ready"
            r1.mo56386p(r2)     // Catch:{ all -> 0x01fe }
            goto L_0x01f8
        L_0x01d4:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x01fe }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = "GsaVoiceInteractionSrv"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x01fe }
            com.google.common.f.x r1 = r2.mo56382g(r1)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            r2 = 54524(0xd4fc, float:7.6404E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x01fe }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "NPE at the time of creating AlwaysOnHotwordDetector"
            r1.mo56386p(r2)     // Catch:{ all -> 0x01fe }
        L_0x01f8:
            r0.f118658aD = r10     // Catch:{ all -> 0x01fe }
            r0.f118659aE = r14     // Catch:{ all -> 0x01fe }
            monitor-exit(r11)     // Catch:{ all -> 0x01fe }
            return
        L_0x01fe:
            r14 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x01fe }
            throw r14
        L_0x0201:
            r14 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0201 }
            throw r14
        L_0x0204:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Please provide locale and hotword phrase"
            r14.<init>(r0)
            throw r14
        L_0x020c:
            int r0 = r14.what
            if (r0 != r1) goto L_0x0216
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            r14.mo49420ai()
            return
        L_0x0216:
            int r0 = r14.what
            r1 = 3
            if (r0 != r1) goto L_0x0226
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r13.f118759a
            int r14 = r14.arg1
            if (r14 == r3) goto L_0x0222
            r2 = 1
        L_0x0222:
            r0.mo49421aj(r2)
            return
        L_0x0226:
            int r0 = r14.what
            r1 = 4
            if (r0 != r1) goto L_0x0260
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r13.f118759a
            int r14 = r14.arg1
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r14 = r0.mo49428j(r14)
            r0.mo49389D(r14)
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r1, r2)
            java.lang.String r1 = "Stopping DSP streaming after timeout"
            r2 = 54626(0xd562, float:7.6547E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r2)).mo56386p(r1)
            java.lang.Object r1 = r0.f118726v
            monitor-enter(r1)
            com.google.android.apps.gsa.voiceinteraction.hotword.g r14 = r0.f118632D     // Catch:{ all -> 0x025d }
            if (r14 == 0) goto L_0x025b
            r0.f118717m = r3     // Catch:{ all -> 0x025d }
            r14.mo103921m()     // Catch:{ all -> 0x025d }
        L_0x025b:
            monitor-exit(r1)     // Catch:{ all -> 0x025d }
            return
        L_0x025d:
            r14 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x025d }
            throw r14
        L_0x0260:
            int r0 = r14.what
            r1 = 5
            r4 = 6
            if (r0 != r1) goto L_0x0293
            r13.removeMessages(r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.android.apps.gsa.search.shared.service.aa r14 = r14.f118730z
            boolean r14 = r14.mo81951w()
            if (r14 == 0) goto L_0x0289
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r14 = r14.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r0, r1)
            java.lang.String r0 = "Already connected to SearchService."
            r1 = 54497(0xd4e1, float:7.6367E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0289:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.service.aa r14 = r14.f118730z
            r14.mo81932c()
            return
        L_0x0293:
            int r0 = r14.what
            if (r0 != r4) goto L_0x02a1
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.service.aa r14 = r14.f118730z
            r14.mo81933e()
            return
        L_0x02a1:
            int r0 = r14.what
            r1 = 7
            if (r0 != r1) goto L_0x02c7
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.android.apps.gsa.shared.util.c.bz r0 = r14.f118633E
            r0.getClass()
            com.google.android.apps.gsa.search.shared.service.ae r0 = r14.f118640L
            com.google.android.apps.gsa.search.shared.service.t r1 = r14.f118629A
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118628e
            com.google.android.apps.gsa.search.shared.service.aa r0 = r0.mo81958a(r1, r1, r4)
            r14.f118730z = r0
            com.google.android.apps.gsa.search.shared.service.aa r0 = r14.f118730z
            com.google.android.apps.gsa.search.shared.service.aj r14 = r14.f118699au
            com.google.android.apps.gsa.search.shared.service.b.um[] r1 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r3]
            com.google.android.apps.gsa.search.shared.service.b.um r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ON_SERVICE_CONNECTED
            r1[r2] = r3
            r0.mo81940l(r14, r1)
            return
        L_0x02c7:
            int r0 = r14.what
            r1 = 8
            if (r0 != r1) goto L_0x0343
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            java.lang.Object r0 = r14.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a     // Catch:{ all -> 0x0340 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r14 = r14.f118632D     // Catch:{ all -> 0x0340 }
            if (r14 == 0) goto L_0x0311
            r14.mo103921m()     // Catch:{ all -> 0x0340 }
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0340 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ all -> 0x0340 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0340 }
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r14.mo56378ag(r1, r2)     // Catch:{ all -> 0x0340 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0340 }
            r1 = 54496(0xd4e0, float:7.6365E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r1)     // Catch:{ all -> 0x0340 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0340 }
            java.lang.String r1 = "Closing PFD after timeout"
            r14.mo56386p(r1)     // Catch:{ all -> 0x0340 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a     // Catch:{ all -> 0x0340 }
            dagger.a r14 = r14.f118651W     // Catch:{ all -> 0x0340 }
            java.lang.Object r14 = r14.mo27525b()     // Catch:{ all -> 0x0340 }
            com.google.android.libraries.search.logging.appflows.c r14 = (com.google.android.libraries.search.logging.appflows.C38780c) r14     // Catch:{ all -> 0x0340 }
            com.google.android.libraries.search.logging.b r1 = com.google.android.libraries.search.logging.C38828b.HOTWORD_LIBRARY_ANDROID     // Catch:{ all -> 0x0340 }
            com.google.android.libraries.search.b.b r14 = r14.mo41619a(r1)     // Catch:{ all -> 0x0340 }
            com.google.android.libraries.search.b.i.f r1 = com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a.f98363g     // Catch:{ all -> 0x0340 }
            com.google.android.libraries.search.b.i.a r1 = r1.mo40804b()     // Catch:{ all -> 0x0340 }
            r14.mo19974a(r1)     // Catch:{ all -> 0x0340 }
        L_0x0311:
            monitor-exit(r0)     // Catch:{ all -> 0x0340 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            boolean r0 = r14.f118704az
            if (r0 == 0) goto L_0x031f
            com.google.android.apps.gsa.hotword.hotworddetectionservice.k r14 = r14.f118667aM
            if (r14 == 0) goto L_0x031f
            r14.f()
        L_0x031f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            dagger.a r14 = r14.f118681ac
            java.lang.Object r14 = r14.mo27525b()
            com.google.common.base.ax r14 = (com.google.common.base.C58833ax) r14
            boolean r0 = r14.mo56113h()
            if (r0 == 0) goto L_0x0451
            java.lang.Object r14 = r14.mo56107c()
            com.google.android.apps.gsa.nga.shared.v.i r14 = (com.google.android.apps.gsa.nga.shared.p6407v.C83305i) r14
            com.google.android.apps.gsa.nga.shared.v.c.hj r0 = new com.google.android.apps.gsa.nga.shared.v.c.hj
            java.lang.String r1 = "SPEECH_PFD_TIMEOUT"
            r0.<init>(r1)
            r14.mo75579d(r0)
            return
        L_0x0340:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0340 }
            throw r14
        L_0x0343:
            int r0 = r14.what
            r1 = 9
            if (r0 != r1) goto L_0x034f
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            r14.mo49433o()
            return
        L_0x034f:
            int r0 = r14.what
            r1 = 600000(0x927c0, double:2.964394E-318)
            r3 = 10
            if (r0 != r3) goto L_0x0385
            com.google.common.f.e r14 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            java.util.concurrent.ConcurrentMap r14 = r14.f118695aq
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r14.put(r0, r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            java.util.concurrent.ConcurrentMap r14 = r14.f118697as
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r14.put(r0, r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            java.util.concurrent.ConcurrentMap r14 = r14.f118696ar
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r14.put(r0, r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.android.voiceinteraction.ao r14 = r14.f118660aF
            r14.sendEmptyMessageDelayed(r3, r1)
            return
        L_0x0385:
            int r0 = r14.what
            r3 = 12
            if (r0 != r3) goto L_0x03e9
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            java.lang.Object r0 = r14.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r4 = r14.f118664aJ     // Catch:{ all -> 0x03e6 }
            if (r4 == 0) goto L_0x03e4
            com.google.android.apps.gsa.voiceinteraction.hotword.g r5 = r14.f118632D     // Catch:{ all -> 0x03e6 }
            if (r5 == 0) goto L_0x03e4
            boolean r4 = r4.f395885f     // Catch:{ all -> 0x03e6 }
            if (r4 != 0) goto L_0x039d
            goto L_0x03e4
        L_0x039d:
            android.os.PowerManager r4 = r14.mo49427i()     // Catch:{ all -> 0x03e6 }
            boolean r4 = r4.isInteractive()     // Catch:{ all -> 0x03e6 }
            if (r4 == 0) goto L_0x03b0
            com.google.android.apps.gsa.voiceinteraction.hotword.g r4 = r14.f118632D     // Catch:{ all -> 0x03e6 }
            com.google.android.apps.gsa.voiceinteraction.hotword.h r4 = r4.f331147j     // Catch:{ all -> 0x03e6 }
            boolean r4 = r4.mo103926e()     // Catch:{ all -> 0x03e6 }
            goto L_0x03b8
        L_0x03b0:
            com.google.android.apps.gsa.voiceinteraction.hotword.g r4 = r14.f118632D     // Catch:{ all -> 0x03e6 }
            com.google.android.apps.gsa.voiceinteraction.hotword.h r4 = r4.f331147j     // Catch:{ all -> 0x03e6 }
            boolean r4 = r4.mo103925d()     // Catch:{ all -> 0x03e6 }
        L_0x03b8:
            r14.mo49392G()     // Catch:{ all -> 0x03e6 }
            if (r4 == 0) goto L_0x03dd
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x03e6 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x03e6 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x03e6 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x03e6 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x03e6 }
            r5 = 54641(0xd571, float:7.6568E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x03e6 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x03e6 }
            java.lang.String r5 = "performNextAction: screenState was not up to date"
            r4.mo56386p(r5)     // Catch:{ all -> 0x03e6 }
            r14.mo49395J()     // Catch:{ all -> 0x03e6 }
        L_0x03dd:
            com.google.android.voiceinteraction.ao r14 = r14.f118660aF     // Catch:{ all -> 0x03e6 }
            r14.sendEmptyMessageDelayed(r3, r1)     // Catch:{ all -> 0x03e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x03e6 }
            return
        L_0x03e4:
            monitor-exit(r0)     // Catch:{ all -> 0x03e6 }
            return
        L_0x03e6:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x03e6 }
            throw r14
        L_0x03e9:
            int r0 = r14.what
            r1 = 13
            if (r0 != r1) goto L_0x03f5
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            r14.mo49450v()
            return
        L_0x03f5:
            int r0 = r14.what
            r1 = 14
            if (r0 != r1) goto L_0x0401
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            r14.mo49444q()
            return
        L_0x0401:
            int r14 = r14.what
            r0 = 15
            if (r14 != r0) goto L_0x0451
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.android.apps.gsa.shared.util.v.g r14 = r14.mo49429k()
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251278fm
            boolean r14 = r14.mo85405j(r1)
            if (r14 == 0) goto L_0x0451
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            dagger.a r14 = r14.f118685ag
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.shared.ba.c r14 = (com.google.android.apps.gsa.shared.p7010ba.C89341c) r14
            com.google.common.v.g r1 = com.google.common.p4580v.C60948g.f165068a
            j$.time.Instant r1 = p3186j$.time.Instant.now()
            long r2 = android.os.SystemClock.elapsedRealtime()
            j$.time.Duration r2 = p3186j$.time.Duration.ofMillis(r2)
            com.google.android.libraries.storage.protostore.ab r14 = r14.f242218c
            com.google.android.apps.gsa.shared.ba.a r3 = new com.google.android.apps.gsa.shared.ba.a
            r3.<init>(r2, r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r14 = r14.mo46039a(r3, r1)
            com.google.common.util.concurrent.cx r14 = com.google.android.apps.gsa.p8883x.C118826c.m197213c(r14)
            com.google.android.voiceinteraction.an r1 = new com.google.android.voiceinteraction.an
            r1.<init>(r13)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            r14.mo4106b(r1, r2)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r14 = r13.f118759a
            com.google.android.voiceinteraction.ao r14 = r14.f118660aF
            long r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118626c
            r14.sendEmptyMessageDelayed(r0, r1)
        L_0x0451:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45386ao.handleMessage(android.os.Message):void");
    }
}
