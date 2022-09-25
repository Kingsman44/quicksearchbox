package com.google.android.voiceinteraction;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Locale;
import java.util.Timer;

/* renamed from: com.google.android.voiceinteraction.al */
/* compiled from: PG */
final class C45383al extends C45389ar {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118756a;

    public C45383al(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118756a = gsaVoiceInteractionService;
    }

    /* renamed from: a */
    public final int mo49490a(String str) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        this.f118756a.mo49411Z(str);
        return this.f118756a.f118703ay;
    }

    /* renamed from: b */
    public final int mo49491b(String str) {
        this.f118756a.mo49411Z(str);
        return this.f118756a.mo49423e();
    }

    /* renamed from: c */
    public final int mo49492c(String str, String str2) {
        return this.f118756a.mo49424f(str, Locale.forLanguageTag(str2));
    }

    /* renamed from: d */
    public final Intent mo49493d(String str) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f118756a.f118703ay;
        if (this.f118756a.f118703ay > 0) {
            this.f118756a.mo49411Z(str);
            if (this.f118756a.f118703ay != 2) {
                this.f118756a.mo49387B(C89849ae.DSP_ENROLLMENT_START);
                try {
                    return this.f118756a.f118702ax.createEnrollIntent();
                } catch (Exception e) {
                    C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54475)).mo56386p("Error creating enroll intent");
                }
            } else {
                C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) b).mo56372aa(54476)).mo56386p("Returning re-enroll intent instead of enroll");
                return mo49494e(str);
            }
        }
        throw new UnsupportedOperationException("DSP is not available");
    }

    /* renamed from: e */
    public final Intent mo49494e(String str) {
        if (this.f118756a.f118703ay > 0) {
            this.f118756a.mo49411Z(str);
            this.f118756a.mo49387B(C89849ae.DSP_REENROLLMENT_START);
            try {
                return this.f118756a.f118702ax.createReEnrollIntent();
            } catch (Exception e) {
                C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54477)).mo56386p("Error creating re-enroll intent");
            }
        }
        throw new UnsupportedOperationException("DSP is not available");
    }

    /* renamed from: f */
    public final Intent mo49495f(String str) {
        if (this.f118756a.f118703ay > 0) {
            this.f118756a.mo49411Z(str);
            this.f118756a.mo49387B(C89849ae.DSP_UNENROLLMENT_START);
            try {
                return this.f118756a.f118702ax.createUnEnrollIntent();
            } catch (Exception e) {
                C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54478)).mo56386p("Error creating unenroll intent");
            }
        }
        throw new UnsupportedOperationException("DSP is not available");
    }

    /* renamed from: g */
    public final String mo49496g() {
        String str;
        synchronized (this.f118756a.f118701aw) {
            str = this.f118756a.f118658aD;
        }
        return str;
    }

    /* renamed from: h */
    public final void mo49497h() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54479)).mo56386p("#connectToSearchStack");
        this.f118756a.f118660aF.sendEmptyMessage(7);
        this.f118756a.f118660aF.sendEmptyMessage(5);
        Timer timer = this.f118756a.f118723s;
        if (timer != null) {
            timer.cancel();
        }
        this.f118756a.f118723s = new Timer();
        this.f118756a.f118723s.schedule(new C45382ak(this), 3000);
    }

    /* renamed from: i */
    public final void mo49498i() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54480)).mo56386p("#disconnectFromSearchStack");
        this.f118756a.f118660aF.sendEmptyMessage(6);
        Timer timer = this.f118756a.f118723s;
        if (timer != null) {
            timer.cancel();
            this.f118756a.f118723s = null;
            C59104x b2 = GsaVoiceInteractionService.f118622a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b2).mo56372aa(54481)).mo56386p("cancel timer");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e9, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49499j(byte[] r4, byte[] r5, byte[] r6, com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c r7) {
        /*
            r3 = this;
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onFirstStageHotword()."
            r2 = 54482(0xd4d2, float:7.6346E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0145 }
            com.google.android.libraries.search.c.hs r1 = com.google.android.libraries.search.p2904c.C37672hs.f100056c     // Catch:{ ct -> 0x0145 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r4, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x0145 }
            com.google.android.libraries.search.c.hs r4 = (com.google.android.libraries.search.p2904c.C37672hs) r4     // Catch:{ ct -> 0x0145 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0129 }
            com.google.android.libraries.search.c.dg r1 = com.google.android.libraries.search.p2904c.C37500dg.f99557c     // Catch:{ ct -> 0x0129 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r5, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x0129 }
            com.google.android.libraries.search.c.dg r5 = (com.google.android.libraries.search.p2904c.C37500dg) r5     // Catch:{ ct -> 0x0129 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x010d }
            com.google.android.apps.gsa.nga.shared.f.c.j r1 = com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81052j.f222154f     // Catch:{ ct -> 0x010d }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (byte[]) r6, (com.google.protobuf.C62921ba) r0)     // Catch:{ ct -> 0x010d }
            com.google.android.apps.gsa.nga.shared.f.c.j r6 = (com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81052j) r6     // Catch:{ ct -> 0x010d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r3.f118756a
            java.lang.Object r0 = r0.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r3.f118756a     // Catch:{ all -> 0x010a }
            com.google.android.hotword.service.HotwordInformation r1 = r1.f118664aJ     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x0069
            boolean r2 = r6.f222158c     // Catch:{ all -> 0x010a }
            if (r2 == 0) goto L_0x0069
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r1 = r1.f395887h     // Catch:{ all -> 0x010a }
            if (r1 == 0) goto L_0x0054
            com.google.common.base.ax r1 = r1.f253284b     // Catch:{ all -> 0x010a }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x0069
        L_0x0054:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r3.f118756a     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.shared.util.v.g r1 = r1.mo49429k()     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x010a }
            boolean r1 = r1.mo85405j(r2)     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x0069
            com.google.android.apps.gsa.nga.api.a.h r4 = com.google.android.apps.gsa.nga.api.a.h.g     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a.m129009b(r7, r4)     // Catch:{ all -> 0x010a }
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            return
        L_0x0069:
            if (r4 == 0) goto L_0x0102
            if (r5 == 0) goto L_0x00fa
            if (r6 == 0) goto L_0x00f2
            if (r7 == 0) goto L_0x00ea
            com.google.android.apps.gsa.nga.shared.f.a r1 = new com.google.android.apps.gsa.nga.shared.f.a     // Catch:{ all -> 0x010a }
            r1.<init>(r4, r5, r6, r7)     // Catch:{ all -> 0x010a }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r4 = r3.f118756a     // Catch:{ all -> 0x010a }
            dagger.a r4 = r4.f118650V     // Catch:{ all -> 0x010a }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_BISTO_DSP_TRIGGERED     // Catch:{ all -> 0x010a }
            r4.mo83702b(r5)     // Catch:{ all -> 0x010a }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r4 = r3.f118756a     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r4 = r4.f118632D     // Catch:{ all -> 0x010a }
            if (r4 != 0) goto L_0x0092
            com.google.android.apps.gsa.nga.api.a.h r4 = com.google.android.apps.gsa.nga.api.a.h.j     // Catch:{ all -> 0x010a }
            com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a.m129009b(r7, r4)     // Catch:{ all -> 0x010a }
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            return
        L_0x0092:
            com.google.common.f.e r5 = com.google.android.apps.gsa.voiceinteraction.hotword.C118719g.f331138a     // Catch:{ all -> 0x010a }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x010a }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x010a }
            java.lang.String r7 = "HwDetectorWithState"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x010a }
            java.lang.String r6 = "#startClientHotword"
            r7 = 34109(0x853d, float:4.7797E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x010a }
            r4.mo103912d()     // Catch:{ all -> 0x010a }
            r4.mo103914f()     // Catch:{ all -> 0x010a }
            com.google.android.libraries.assistant.hotword.l r5 = r4.f331139b     // Catch:{ all -> 0x010a }
            boolean r6 = r5 instanceof com.google.android.apps.gsa.voiceinteraction.hotword.C118725m     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00e5
            com.google.android.libraries.assistant.hotword.al r6 = r4.f331140c     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00e5
            int r5 = r6.mo23797k()     // Catch:{ all -> 0x010a }
            r7 = 1
            if (r5 != r7) goto L_0x00c6
            com.google.android.libraries.assistant.hotword.data.HotwordData r5 = r4.f331149l     // Catch:{ all -> 0x010a }
            if (r5 == 0) goto L_0x00c6
            r6.mo23794f(r5)     // Catch:{ all -> 0x010a }
            goto L_0x00df
        L_0x00c6:
            com.google.android.libraries.assistant.hotword.data.HotwordData r5 = r4.f331149l     // Catch:{ all -> 0x010a }
            if (r5 != 0) goto L_0x00df
            com.google.common.f.e r5 = com.google.android.apps.gsa.voiceinteraction.hotword.C118719g.f331138a     // Catch:{ all -> 0x010a }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x010a }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x010a }
            java.lang.String r7 = "HwDetectorWithState"
            r5.mo56378ag(r6, r7)     // Catch:{ all -> 0x010a }
            java.lang.String r6 = "Missing hotword data, so cannot initialize detector."
            r7 = 34110(0x853e, float:4.7798E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)     // Catch:{ all -> 0x010a }
        L_0x00df:
            com.google.android.libraries.assistant.hotword.al r4 = r4.f331140c     // Catch:{ all -> 0x010a }
            r4.mo23795g(r1)     // Catch:{ all -> 0x010a }
            goto L_0x00e8
        L_0x00e5:
            r5.mo23795g(r1)     // Catch:{ all -> 0x010a }
        L_0x00e8:
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            return
        L_0x00ea:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "Null callback"
            r4.<init>(r5)     // Catch:{ all -> 0x010a }
            throw r4     // Catch:{ all -> 0x010a }
        L_0x00f2:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "Null hotwordVerificationParams"
            r4.<init>(r5)     // Catch:{ all -> 0x010a }
            throw r4     // Catch:{ all -> 0x010a }
        L_0x00fa:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "Null precachedBufferId"
            r4.<init>(r5)     // Catch:{ all -> 0x010a }
            throw r4     // Catch:{ all -> 0x010a }
        L_0x0102:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "Null invocationToken"
            r4.<init>(r5)     // Catch:{ all -> 0x010a }
            throw r4     // Catch:{ all -> 0x010a }
        L_0x010a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            throw r4
        L_0x010d:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "Failed parsing FirstStagerParams."
            r0 = 54483(0xd4d3, float:7.6347E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r0)).mo56386p(r6)
            com.google.android.apps.gsa.nga.api.a.h r4 = com.google.android.apps.gsa.nga.api.a.h.n
            com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a.m129009b(r7, r4)
            return
        L_0x0129:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "Failed parsing PrecachedBufferId."
            r0 = 54484(0xd4d4, float:7.6348E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r0)).mo56386p(r6)
            com.google.android.apps.gsa.nga.api.a.h r4 = com.google.android.apps.gsa.nga.api.a.h.t
            com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a.m129009b(r7, r4)
            return
        L_0x0145:
            r4 = move-exception
            com.google.common.f.e r5 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GsaVoiceInteractionSrv"
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "Failed parsing InvocationToken."
            r0 = 54485(0xd4d5, float:7.635E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r4)).mo56372aa(r0)).mo56386p(r6)
            com.google.android.apps.gsa.nga.api.a.h r4 = com.google.android.apps.gsa.nga.api.a.h.f
            com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a.m129009b(r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45383al.mo49499j(byte[], byte[], byte[], com.google.android.apps.gsa.nga.shared.f.a.c):void");
    }

    /* renamed from: l */
    public final void mo49501l(Intent intent) {
        this.f118756a.mo21615a(intent);
    }

    /* renamed from: m */
    public final boolean mo49502m(String str, String str2, C45393av avVar) {
        String str3;
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118756a;
        if (!gsaVoiceInteractionService.f118662aH || !gsaVoiceInteractionService.mo49414ac()) {
            return false;
        }
        if (str != null) {
            synchronized (this.f118756a.f118701aw) {
                GsaVoiceInteractionService gsaVoiceInteractionService2 = this.f118756a;
                gsaVoiceInteractionService2.f118665aK = avVar;
                String str4 = gsaVoiceInteractionService2.f118658aD;
                if (str4 == null || str4.equals(str) || (str3 = this.f118756a.f118659aE) == null || str3.equals(str2)) {
                    this.f118756a.mo49452x();
                } else if (!this.f118756a.mo49418ag(str, str2, false)) {
                    this.f118756a.mo49452x();
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Locale can't be null");
    }

    /* renamed from: n */
    public final boolean mo49503n() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118756a;
        ((C59052c) ((C59052c) b).mo56372aa(54490)).mo56358K("isHotwordRecognitionEnabled %b %b", gsaVoiceInteractionService.f118663aI, gsaVoiceInteractionService.f118712h);
        GsaVoiceInteractionService gsaVoiceInteractionService2 = this.f118756a;
        return gsaVoiceInteractionService2.f118663aI && !gsaVoiceInteractionService2.f118712h;
    }

    /* renamed from: o */
    public final boolean mo49504o(String str) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        this.f118756a.mo49411Z(str);
        return this.f118756a.mo49420ai();
    }

    /* renamed from: p */
    public final boolean mo49505p() {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118756a;
        if (gsaVoiceInteractionService.f118702ax != null) {
            return gsaVoiceInteractionService.mo49421aj(true);
        }
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54493)).mo56386p("AlwaysOnHotwordDetector is null");
        return false;
    }

    /* renamed from: k */
    public final void mo49500k(Bundle bundle) {
        if (this.f118756a.f118662aH) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                this.f118756a.setUiHints(bundle);
            } catch (SecurityException e) {
                C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54488)).mo56386p("Cannot setUiHints() since we're not the default assistant anymore.");
            }
        } else {
            C59104x c2 = GsaVoiceInteractionService.f118622a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c2).mo56372aa(54486)).mo56386p("setUiHints() invoked on platform which doesn't support UI hints.");
        }
    }
}
