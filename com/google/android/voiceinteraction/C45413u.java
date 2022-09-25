package com.google.android.voiceinteraction;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.voiceinteraction.u */
/* compiled from: PG */
final class C45413u extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118789a;

    public C45413u(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118789a = gsaVoiceInteractionService;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ef, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = r11.getAction()
            int r0 = r10.hashCode()
            r1 = 3
            r2 = 0
            r3 = 1
            r4 = 2
            switch(r0) {
                case -2126562734: goto L_0x00a0;
                case -2019171071: goto L_0x0096;
                case -1716154038: goto L_0x008c;
                case -1121732990: goto L_0x0082;
                case -791785364: goto L_0x0078;
                case -435623966: goto L_0x006d;
                case -188713932: goto L_0x0062;
                case 223187771: goto L_0x0057;
                case 230663044: goto L_0x004d;
                case 552075796: goto L_0x0043;
                case 727471669: goto L_0x0037;
                case 1238575667: goto L_0x002c;
                case 1329445648: goto L_0x0021;
                case 1524160964: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x00ab
        L_0x0015:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.START_DSP_HOTWORD"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 11
            goto L_0x00ac
        L_0x0021:
            java.lang.String r0 = "com.google.android.apps.googleassistant.interactor.RESTART_RECOGNITION"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 5
            goto L_0x00ac
        L_0x002c:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_PREFERENCE_CHANGED"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 7
            goto L_0x00ac
        L_0x0037:
            java.lang.String r0 = "com.google.android.voiceinteraction.NEW_SPEAKER_ID_MODEL_AVAILABLE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 13
            goto L_0x00ac
        L_0x0043:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.CHANGE_VOICESEARCH_LANGUAGE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 3
            goto L_0x00ac
        L_0x004d:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.FROM_ANY_SCREEN_INTERACTOR_FLAG_CHANGED"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 1
            goto L_0x00ac
        L_0x0057:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.interactor.BOOT_COMPLETED"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 8
            goto L_0x00ac
        L_0x0062:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.STOP_DSP_HOTWORD"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 12
            goto L_0x00ac
        L_0x006d:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.START_HOTWORD"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 9
            goto L_0x00ac
        L_0x0078:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.action.HOTWORD_ENROLLMENT"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 6
            goto L_0x00ac
        L_0x0082:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.interactor.HOTWORD_MODEL_DOWNLOADED"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 2
            goto L_0x00ac
        L_0x008c:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.interactor.RESTART_RECOGNITION"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 4
            goto L_0x00ac
        L_0x0096:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.ACTION_UPDATE_HOTWORD_INFORMATION_AND_HOTWORD_STATE"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 0
            goto L_0x00ac
        L_0x00a0:
            java.lang.String r0 = "com.google.android.googlequicksearchbox.STOP_HOTWORD"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x00ab
            r10 = 10
            goto L_0x00ac
        L_0x00ab:
            r10 = -1
        L_0x00ac:
            switch(r10) {
                case 0: goto L_0x02a5;
                case 1: goto L_0x029f;
                case 2: goto L_0x029f;
                case 3: goto L_0x0252;
                case 4: goto L_0x020b;
                case 5: goto L_0x020b;
                case 6: goto L_0x01b3;
                case 7: goto L_0x01ad;
                case 8: goto L_0x019f;
                case 9: goto L_0x0174;
                case 10: goto L_0x0149;
                case 11: goto L_0x011e;
                case 12: goto L_0x00f3;
                case 13: goto L_0x00b1;
                default: goto L_0x00af;
            }
        L_0x00af:
            goto L_0x02aa
        L_0x00b1:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.lang.Object r0 = r10.f118726v
            monitor-enter(r0)
            com.google.android.hotword.service.HotwordInformation r1 = r10.f118664aJ     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = "speaker_id_model"
            android.os.Parcelable r11 = r11.getParcelableExtra(r1)     // Catch:{ all -> 0x00f0 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r11 = (com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel) r11     // Catch:{ all -> 0x00f0 }
            com.google.android.hotword.service.HotwordInformation r1 = r10.f118664aJ     // Catch:{ all -> 0x00f0 }
            boolean r2 = r1.f395883d     // Catch:{ all -> 0x00f0 }
            if (r2 != 0) goto L_0x00cc
            boolean r1 = r1.f395885f     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00d7
        L_0x00cc:
            if (r11 == 0) goto L_0x00e6
            com.google.common.base.ax r1 = r11.f253284b     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x00f0 }
            if (r1 != 0) goto L_0x00d7
            goto L_0x00e6
        L_0x00d7:
            r10.mo49394I(r11)     // Catch:{ all -> 0x00f0 }
            com.google.android.hotword.service.HotwordInformation r1 = r10.f118664aJ     // Catch:{ all -> 0x00f0 }
            r1.f395887h = r11     // Catch:{ all -> 0x00f0 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r10 = r10.f118632D     // Catch:{ all -> 0x00f0 }
            if (r10 == 0) goto L_0x00ee
            r10.mo103920l(r1)     // Catch:{ all -> 0x00f0 }
            goto L_0x00ee
        L_0x00e6:
            r10.mo49433o()     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            return
        L_0x00eb:
            r10.mo49433o()     // Catch:{ all -> 0x00f0 }
        L_0x00ee:
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            return
        L_0x00f0:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f0 }
            throw r10
        L_0x00f3:
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r10.mo56378ag(r11, r0)
            java.lang.String r11 = "Handling ACTION_STOP_DSP_HOTWORD"
            r0 = 54397(0xd47d, float:7.6226E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r11)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49449u()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.util.concurrent.Executor r10 = r10.f118721q
            com.google.android.voiceinteraction.t r11 = new com.google.android.voiceinteraction.t
            r11.<init>(r9)
            java.lang.Runnable r11 = com.google.apps.tiktok.tracing.C47810es.m84977q(r11)
            r10.execute(r11)
            return
        L_0x011e:
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r10.mo56378ag(r11, r0)
            java.lang.String r11 = "Handling ACTION_START_DSP_HOTWORD"
            r0 = 54396(0xd47c, float:7.6225E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r11)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49449u()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.util.concurrent.Executor r10 = r10.f118721q
            com.google.android.voiceinteraction.s r11 = new com.google.android.voiceinteraction.s
            r11.<init>(r9)
            java.lang.Runnable r11 = com.google.apps.tiktok.tracing.C47810es.m84977q(r11)
            r10.execute(r11)
            return
        L_0x0149:
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r10.mo56378ag(r0, r1)
            java.lang.String r0 = "Handling ACTION_STOP_HOTWORD"
            r1 = 54395(0xd47b, float:7.6224E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49449u()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.util.concurrent.Executor r10 = r10.f118721q
            com.google.android.voiceinteraction.r r0 = new com.google.android.voiceinteraction.r
            r0.<init>(r9, r11)
            java.lang.Runnable r11 = com.google.apps.tiktok.tracing.C47810es.m84977q(r0)
            r10.execute(r11)
            return
        L_0x0174:
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r10.mo56378ag(r0, r1)
            java.lang.String r0 = "Handling ACTION_START_HOTWORD"
            r1 = 54394(0xd47a, float:7.6222E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49449u()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.util.concurrent.Executor r10 = r10.f118721q
            com.google.android.voiceinteraction.q r0 = new com.google.android.voiceinteraction.q
            r0.<init>(r9, r11)
            java.lang.Runnable r11 = com.google.apps.tiktok.tracing.C47810es.m84977q(r0)
            r10.execute(r11)
            return
        L_0x019f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            boolean r11 = r10.f118630B
            if (r11 != 0) goto L_0x02aa
            com.google.android.voiceinteraction.ao r10 = r10.f118660aF
            r0 = 30000(0x7530, double:1.4822E-319)
            r10.sendEmptyMessageDelayed(r4, r0)
            return
        L_0x01ad:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49433o()
            return
        L_0x01b3:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.lang.String r0 = "com.google.android.googlequicksearchbox.extra.HOTWORD_REQUESTED"
            boolean r11 = r11.getBooleanExtra(r0, r2)
            r10.f118719o = r11
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            com.google.common.base.ax r11 = r10.f118639K
            com.google.common.base.bk r11 = (com.google.common.base.C58847bk) r11
            java.lang.Object r11 = r11.f156646a
            com.google.android.apps.gsa.shared.bisto.ad r11 = (com.google.android.apps.gsa.shared.bisto.C89606ad) r11
            boolean r10 = r10.f118719o
            r11.mo83471q(r10)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            boolean r10 = r10.mo49415ad()
            if (r10 == 0) goto L_0x02aa
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.lang.Object r10 = r10.f118726v
            monitor-enter(r10)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r11 = r9.f118789a     // Catch:{ all -> 0x0208 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r11.f118632D     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01e9
            boolean r1 = r11.f118719o     // Catch:{ all -> 0x0208 }
            com.google.android.apps.gsa.voiceinteraction.hotword.h r0 = r0.f331147j     // Catch:{ all -> 0x0208 }
            r0.f331164e = r1     // Catch:{ all -> 0x0208 }
            r11.mo49395J()     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x01e9:
            com.google.common.f.e r11 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0208 }
            com.google.common.f.x r11 = r11.mo56225c()     // Catch:{ all -> 0x0208 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0208 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r11.mo56378ag(r0, r1)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0208 }
            r0 = 54393(0xd479, float:7.6221E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r0)     // Catch:{ all -> 0x0208 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "Cannot set audio captured by enrollment, there is no hotword detector."
            r11.mo56386p(r0)     // Catch:{ all -> 0x0208 }
        L_0x0206:
            monitor-exit(r10)     // Catch:{ all -> 0x0208 }
            return
        L_0x0208:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0208 }
            throw r11
        L_0x020b:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            boolean r0 = r10.f118662aH
            if (r0 == 0) goto L_0x02aa
            boolean r0 = r10.f118663aI
            if (r0 == 0) goto L_0x02aa
            int r10 = r10.f118703ay
            if (r10 != r4) goto L_0x02aa
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.lang.String r0 = "delayStartByMilliseconds"
            r5 = 0
            long r7 = r11.getLongExtra(r0, r5)
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x023d
            com.google.common.f.e r10 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r10.mo56378ag(r11, r0)
            java.lang.String r11 = "Stop delay can't be greater than start delay"
            r0 = 54619(0xd55b, float:7.6538E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r11)
            return
        L_0x023d:
            com.google.android.voiceinteraction.ao r11 = r10.f118660aF
            android.os.Message r11 = r11.obtainMessage()
            r11.arg1 = r3
            r11.what = r1
            com.google.android.voiceinteraction.ao r0 = r10.f118660aF
            r0.sendMessageDelayed(r11, r5)
            com.google.android.voiceinteraction.ao r10 = r10.f118660aF
            r10.sendEmptyMessageDelayed(r4, r7)
            return
        L_0x0252:
            java.lang.String r10 = "language"
            java.lang.String r10 = r11.getStringExtra(r10)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r11 = r9.f118789a
            java.lang.Object r11 = r11.f118701aw
            monitor-enter(r11)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r9.f118789a     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r0.f118658aD     // Catch:{ all -> 0x029c }
            boolean r10 = r10.equals(r0)     // Catch:{ all -> 0x029c }
            if (r10 != 0) goto L_0x0278
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_SEARCH_LANGUAGE_CHANGE     // Catch:{ all -> 0x029c }
            r10.mo49388C(r0)     // Catch:{ all -> 0x029c }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a     // Catch:{ all -> 0x029c }
            r10.mo49421aj(r3)     // Catch:{ all -> 0x029c }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a     // Catch:{ all -> 0x029c }
            r10.mo49433o()     // Catch:{ all -> 0x029c }
        L_0x0278:
            monitor-exit(r11)     // Catch:{ all -> 0x029c }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            boolean r10 = r10.mo49415ad()
            if (r10 == 0) goto L_0x02aa
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            java.lang.Object r10 = r10.f118726v
            monitor-enter(r10)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r11 = r9.f118789a     // Catch:{ all -> 0x0299 }
            com.google.android.hotword.service.HotwordInformation r0 = r11.f118664aJ     // Catch:{ all -> 0x0299 }
            if (r0 == 0) goto L_0x0297
            boolean r1 = r0.f395884e     // Catch:{ all -> 0x0299 }
            if (r1 == 0) goto L_0x0297
            boolean r0 = r0.f395882c     // Catch:{ all -> 0x0299 }
            if (r0 != 0) goto L_0x0297
            r11.mo49433o()     // Catch:{ all -> 0x0299 }
        L_0x0297:
            monitor-exit(r10)     // Catch:{ all -> 0x0299 }
            return
        L_0x0299:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0299 }
            throw r11
        L_0x029c:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x029c }
            throw r10
        L_0x029f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49433o()
            return
        L_0x02a5:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r10 = r9.f118789a
            r10.mo49433o()
        L_0x02aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45413u.onReceive(android.content.Context, android.content.Intent):void");
    }
}
