package com.google.android.voiceinteraction;

import android.os.Build;
import android.os.PersistableBundle;
import android.os.SharedMemory;
import android.service.voice.HotwordDetector;
import com.google.android.apps.gsa.nga.shared.p6339f.p6343d.C81060a;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82368cp;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82598lc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82599ld;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118717e;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.hotword.service.HotwordInformation;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;

/* renamed from: com.google.android.voiceinteraction.aa */
/* compiled from: PG */
final class C45372aa implements C118717e {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118743a;

    public C45372aa(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118743a = gsaVoiceInteractionService;
    }

    /* renamed from: f */
    private final void m80969f(HotwordResult hotwordResult) {
        synchronized (this.f118743a.f118726v) {
            if (hotwordResult.mo84678C()) {
                this.f118743a.f118660aF.removeMessages(4);
            } else {
                this.f118743a.mo49396K();
            }
            if (this.f118743a.f118730z.mo81951w()) {
                this.f118743a.mo49446s();
            }
            C118719g gVar = this.f118743a.f118632D;
            if (gVar != null) {
                gVar.mo103921m();
            }
        }
    }

    /* renamed from: g */
    private final void m80970g(boolean z, boolean z2) {
        C58833ax axVar = (C58833ax) this.f118743a.f118681ac.mo27525b();
        if (axVar.mo56113h()) {
            C83305i iVar = (C83305i) axVar.mo56107c();
            C82598lc l = C82599ld.m131673l();
            C82368cp cpVar = (C82368cp) l;
            cpVar.f225013b = "SOFTWARE";
            l.mo75889c(true != z2 ? 1 : 2);
            cpVar.f225014c = "N/A";
            cpVar.f225015d = true != z ? "false" : "true";
            cpVar.f225016e = true != z2 ? "NON_DSP" : "DSP";
            l.mo75888b(false);
            String str = true != ((C84516aa) this.f118743a.f118653Y.mo27525b()).f230023b.isDeviceLocked() ? "false" : "true";
            C58976aa aaVar = C58975e.f156826a;
            cpVar.f225017f = str;
            cpVar.f225018g = C81060a.m129008a(Build.MODEL);
            iVar.mo75579d(l.mo75887a());
        }
        synchronized (this.f118743a.f118726v) {
            HotwordResult hotwordResult = this.f118743a.f118729y;
            if (hotwordResult != null) {
                m80969f(hotwordResult);
                this.f118743a.f118729y = null;
            }
        }
    }

    /* renamed from: a */
    public final HotwordDetector mo49464a(PersistableBundle persistableBundle, SharedMemory sharedMemory, HotwordDetector.Callback callback) {
        return this.f118743a.createHotwordDetector(persistableBundle, sharedMemory, callback);
    }

    /* renamed from: b */
    public final void mo49465b(boolean z) {
        HotwordInformation hotwordInformation;
        HotwordInformation hotwordInformation2;
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54417)).mo56389s("#onClosed - audio is closed, hasRecordingStarted %b", Boolean.valueOf(z));
        this.f118743a.mo49398M();
        synchronized (this.f118743a.f118726v) {
            if (this.f118743a.f118703ay == 2) {
                GsaVoiceInteractionService gsaVoiceInteractionService = this.f118743a;
                if ((!gsaVoiceInteractionService.f118719o || (hotwordInformation2 = gsaVoiceInteractionService.f118664aJ) == null || !C118726n.m197095c(hotwordInformation2.f395869A)) && !gsaVoiceInteractionService.f118663aI && (hotwordInformation = gsaVoiceInteractionService.f118664aJ) != null && (hotwordInformation.f395883d || gsaVoiceInteractionService.f118712h)) {
                    gsaVoiceInteractionService.f118660aF.sendEmptyMessage(2);
                }
            }
        }
        this.f118743a.mo49404S();
        if (z) {
            this.f118743a.mo49395J();
        } else {
            this.f118743a.mo49396K();
        }
    }

    /* renamed from: c */
    public final void mo49466c(HotwordResult hotwordResult) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        this.f118743a.mo49404S();
        if (hotwordResult != null && hotwordResult.mo84678C() && !hotwordResult.mo84680E()) {
            this.f118743a.mo49409X(C58833ax.m90834k(hotwordResult));
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            float c = hotwordResult.mo84683c();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            cbVar.f160115b |= C89885b.HTTP_VALUE;
            cbVar.f160055T = c;
            String x = hotwordResult.mo84707x();
            if (x != null) {
                ajVar.copyOnWrite();
                C59687cb cbVar2 = (C59687cb) ajVar.instance;
                cbVar2.f160115b |= C89885b.S3REQUEST_VALUE;
                cbVar2.f160054S = x;
            }
            this.f118743a.mo49391F(C89849ae.HOTWORD_2ND_STAGE_DSP_TIMEOUT, C58836b.f156633a, ajVar);
            this.f118743a.mo49389D(hotwordResult);
        }
    }

    /* renamed from: d */
    public final void mo49467d() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54421)).mo56386p("HotwordCallback#onError");
        this.f118743a.mo49404S();
        synchronized (this.f118743a.f118726v) {
            C118719g gVar = this.f118743a.f118632D;
            if (gVar != null) {
                gVar.mo103921m();
            }
            GsaVoiceInteractionService gsaVoiceInteractionService = this.f118743a;
            HotwordInformation hotwordInformation = gsaVoiceInteractionService.f118664aJ;
            if (hotwordInformation != null && hotwordInformation.f395882c) {
                if (gsaVoiceInteractionService.f118717m) {
                    gsaVoiceInteractionService.mo49390E(C89849ae.HOTWORD_2ND_STAGE_DSP_TIMEOUT);
                } else {
                    gsaVoiceInteractionService.mo49390E(C89849ae.HOTWORD_2ND_STAGE_RECOGNITION_ERROR);
                }
                this.f118743a.mo49409X(C58836b.f156633a);
            }
        }
        if (this.f118743a.f118730z.mo81951w()) {
            this.f118743a.f118660aF.sendEmptyMessage(6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0467, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x05a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05ab, code lost:
        r0 = r12.f118743a.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05af, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r2 = r12.f118743a.f118726v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05b4, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r4 = r12.f118743a.f118664aJ;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05bb, code lost:
        if (r4.f395883d != false) goto L_0x05c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05bf, code lost:
        if (r4.f395885f == false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05c1, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05c2, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05c3, code lost:
        if (r3 == false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05c9, code lost:
        if (r13.mo84676A() != false) goto L_0x0605;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05d7, code lost:
        if (r12.f118743a.mo49429k().mo85405j(com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n) == false) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05da, code lost:
        r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a.mo56226d();
        r1.mo56378ag(com.google.common.p4526f.p4527a.C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(54431)).mo56386p("Speaker-Id required and did not trigger.");
        r12.f118743a.mo49390E(com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED);
        r12.f118743a.mo49446s();
        r1 = r12.f118743a.f118632D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05ff, code lost:
        if (r1 == null) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0601, code lost:
        r1.mo103921m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x060d, code lost:
        if (r12.f118743a.f118730z.mo81951w() == false) goto L_0x061a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x060f, code lost:
        r12.f118743a.mo49443p();
        r12.f118743a.mo49446s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x061a, code lost:
        r12.f118743a.f118660aF.sendEmptyMessage(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0622, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0623, code lost:
        r12.f118743a.mo49396K();
        r12.f118743a.f118696ar.put(java.lang.Double.valueOf(java.lang.Math.random()), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x063d, code lost:
        if (r13.mo84676A() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x063f, code lost:
        r12.f118743a.f118697as.put(java.lang.Double.valueOf(java.lang.Math.random()), java.lang.Boolean.TRUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00a7 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49468e(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r13) {
        /*
            r12 = this;
            boolean r0 = r13.mo84678C()
            if (r0 == 0) goto L_0x0020
            com.google.android.apps.gsa.shared.speech.hotword.p r13 = r13.mo84696n()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            com.google.speech.k.a.g r0 = r0.mo49431m()
            r13.mo84713b(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            long r0 = r0.mo49425g()
            r13.mo84725n(r0)
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r13 = r13.mo84712a()
        L_0x0020:
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "onHotwordDetected"
            r2 = 54422(0xd496, float:7.6261E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r0 = r0.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0666 }
            com.google.android.hotword.service.HotwordInformation r1 = r1.f118664aJ     // Catch:{ all -> 0x0666 }
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0107
            boolean r1 = r1.f395889j     // Catch:{ all -> 0x0666 }
            if (r1 == 0) goto L_0x0107
            com.google.common.base.ax r1 = r13.mo84698p()     // Catch:{ all -> 0x0666 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x0666 }
            if (r1 == 0) goto L_0x00ea
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            android.content.Context r1 = r1.f118637I     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.io.File r1 = r1.getExternalFilesDir(r2)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.String r1 = r1.getPath()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.<init>()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.append(r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.String r1 = "/hw_result_audio.wav"
            r4.append(r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r5 = 54414(0xd48e, float:7.625E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.String r5 = "Dumping hotword audio to %s"
            r4.mo56389s(r5, r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.<init>(r1, r3)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            com.google.common.base.ax r1 = r13.mo84698p()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            byte[] r1 = (byte[]) r1     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.write(r1)     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.flush()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            r4.close()     // Catch:{ IOException -> 0x00c5, Exception -> 0x00a7 }
            goto L_0x0107
        L_0x00a7:
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0666 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0666 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0666 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r4, r5)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            r4 = 54416(0xd490, float:7.6253E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            java.lang.String r4 = "Ignoring Exception"
            r1.mo56386p(r4)     // Catch:{ all -> 0x0666 }
            goto L_0x0107
        L_0x00c5:
            r1 = move-exception
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0666 }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x0666 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0666 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0666 }
            com.google.common.f.x r1 = r4.mo56382g(r1)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            r4 = 54415(0xd48f, float:7.6252E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            java.lang.String r4 = "IOException during dumping hotword audio"
            r1.mo56386p(r4)     // Catch:{ all -> 0x0666 }
            goto L_0x0107
        L_0x00ea:
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0666 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0666 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0666 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r4, r5)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            r4 = 54413(0xd48d, float:7.6249E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r4)     // Catch:{ all -> 0x0666 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x0666 }
            java.lang.String r4 = "Audio not present in HotwordResult"
            r1.mo56386p(r4)     // Catch:{ all -> 0x0666 }
        L_0x0107:
            monitor-exit(r0)     // Catch:{ all -> 0x0666 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            r0.mo49404S()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            boolean r0 = r0.mo49412aa()
            if (r0 == 0) goto L_0x013e
            com.google.common.base.ax r0 = r13.mo84701s()
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0120
            goto L_0x013e
        L_0x0120:
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "bistoIsActive"
            r2 = 54429(0xd49d, float:7.6271E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            r0.mo49393H()
            r12.m80969f(r13)
            return
        L_0x013e:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r1 = r0.f118726v
            monitor-enter(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0663 }
            r0.f118729y = r13     // Catch:{ all -> 0x0663 }
            monitor-exit(r1)     // Catch:{ all -> 0x0663 }
            com.google.common.base.ax r0 = r13.mo84704u()
            boolean r0 = r0.mo56113h()
            if (r0 != 0) goto L_0x0177
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF
            r1 = 8
            r4 = 60000(0xea60, double:2.9644E-319)
            r0.sendEmptyMessageDelayed(r1, r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            dagger.a r0 = r0.f118651W
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.search.logging.appflows.c r0 = (com.google.android.libraries.search.logging.appflows.C38780c) r0
            com.google.android.libraries.search.logging.b r1 = com.google.android.libraries.search.logging.C38828b.HOTWORD_LIBRARY_ANDROID
            com.google.android.libraries.search.b.b r0 = r0.mo41619a(r1)
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a.f98364h
            com.google.android.libraries.search.b.i.a r1 = r1.mo40813g()
            r0.mo19974a(r1)
        L_0x0177:
            boolean r0 = r13.mo84678C()
            if (r0 == 0) goto L_0x01a4
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF
            r1 = 4
            r0.removeMessages(r1)
            boolean r0 = r13.mo84680E()
            if (r0 != 0) goto L_0x01d1
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            dagger.a r0 = r0.f118650V
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_NOT_DETECTED
            r0.mo83702b(r1)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r13)
            r0.mo49409X(r1)
            goto L_0x01d1
        L_0x01a4:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r0 = r0.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0660 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r4 = r1.f118632D     // Catch:{ all -> 0x0660 }
            if (r4 == 0) goto L_0x01c3
            com.google.android.libraries.assistant.hotword.l r4 = r4.f331139b     // Catch:{ all -> 0x0660 }
            boolean r4 = r4 instanceof com.google.android.apps.gsa.voiceinteraction.hotword.C118725m     // Catch:{ all -> 0x0660 }
            if (r4 == 0) goto L_0x01c3
            dagger.a r1 = r1.f118650V     // Catch:{ all -> 0x0660 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0660 }
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1     // Catch:{ all -> 0x0660 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRUSTED_NON_DSP_TRIGGERED     // Catch:{ all -> 0x0660 }
            r1.mo83702b(r4)     // Catch:{ all -> 0x0660 }
            goto L_0x01d0
        L_0x01c3:
            dagger.a r1 = r1.f118650V     // Catch:{ all -> 0x0660 }
            java.lang.Object r1 = r1.mo27525b()     // Catch:{ all -> 0x0660 }
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1     // Catch:{ all -> 0x0660 }
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_NON_DSP_TRIGGERED     // Catch:{ all -> 0x0660 }
            r1.mo83702b(r4)     // Catch:{ all -> 0x0660 }
        L_0x01d0:
            monitor-exit(r0)     // Catch:{ all -> 0x0660 }
        L_0x01d1:
            boolean r0 = r13.mo84676A()
            r1 = 1
            if (r0 == 0) goto L_0x029a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            dagger.a r0 = r0.f118684af
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.speech.dumper.ag r0 = (com.google.android.apps.gsa.shared.speech.dumper.C90544ag) r0
            com.google.android.libraries.storage.protostore.ab r0 = r0.f253129b
            com.google.android.apps.gsa.shared.speech.dumper.i r4 = com.google.android.apps.gsa.shared.speech.dumper.C90556i.f253155a
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r0.mo46039a(r4, r5)
            com.google.android.apps.gsa.p8883x.C118826c.m197213c(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            dagger.a r0 = r0.f118650V
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_SPEAKER_VERIFIED_INTERACTOR
            r0.mo83702b(r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            com.google.android.apps.gsa.shared.util.v.g r0 = r0.mo49429k()
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f249888aD
            boolean r0 = r0.mo85405j(r4)
            if (r0 == 0) goto L_0x0256
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r0 = r13.mo84697o()
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 54428(0xd49c, float:7.627E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            r5 = r4
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            if (r0 == 0) goto L_0x022e
            com.google.common.base.ax r0 = r0.f253284b
            goto L_0x0230
        L_0x022e:
            java.lang.String r0 = "null"
        L_0x0230:
            r7 = r0
            java.lang.String r6 = "Hotword triggered with speaker ID. Model ID: %s, Software Hotword Score: %f,  Speaker Score: %f, Hotword Power: %f, Background Power: %f"
            float r0 = r13.mo84683c()
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            float r0 = r13.mo84684d()
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            float r0 = r13.mo84682b()
            java.lang.Float r10 = java.lang.Float.valueOf(r0)
            float r0 = r13.mo84681a()
            java.lang.Float r11 = java.lang.Float.valueOf(r0)
            r5.mo56361N(r6, r7, r8, r9, r10, r11)
        L_0x0256:
            com.google.common.base.ax r0 = r13.mo84700r()
            if (r0 == 0) goto L_0x0310
            boolean r4 = r0.mo56113h()
            if (r4 == 0) goto L_0x0310
            java.lang.Object r4 = r0.mo56107c()
            boolean[] r4 = (boolean[]) r4
            int r4 = r4.length
            r5 = 2
            if (r4 != r5) goto L_0x0310
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 54427(0xd49b, float:7.6268E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.String r5 = "Channel 0: %b, Channel 1: %b"
            java.lang.Object r6 = r0.mo56107c()
            boolean[] r6 = (boolean[]) r6
            boolean r6 = r6[r3]
            java.lang.Object r0 = r0.mo56107c()
            boolean[] r0 = (boolean[]) r0
            boolean r0 = r0[r1]
            r4.mo56358K(r5, r6, r0)
            goto L_0x0310
        L_0x029a:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r4 = r0.f118726v
            monitor-enter(r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x065d }
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r5 = r5.f395887h     // Catch:{ all -> 0x065d }
            if (r5 != 0) goto L_0x02b5
            dagger.a r0 = r0.f118650V     // Catch:{ all -> 0x065d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_NO_SPEAKER_ID_MODEL     // Catch:{ all -> 0x065d }
            r0.mo83702b(r5)     // Catch:{ all -> 0x065d }
            goto L_0x030f
        L_0x02b5:
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x065d }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x065d }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x065d }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x065d }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x065d }
            r5 = 54423(0xd497, float:7.6263E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x065d }
            r5 = r0
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x065d }
            java.lang.String r6 = "Hotword triggered but speaker ID failed. Software Hotword Score: %f,  Speaker Score: %f, Hotword Power: %f, Background Power: %f"
            float r0 = r13.mo84683c()     // Catch:{ all -> 0x065d }
            java.lang.Float r7 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x065d }
            float r0 = r13.mo84684d()     // Catch:{ all -> 0x065d }
            java.lang.Float r8 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x065d }
            float r0 = r13.mo84682b()     // Catch:{ all -> 0x065d }
            java.lang.Float r9 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x065d }
            float r0 = r13.mo84681a()     // Catch:{ all -> 0x065d }
            java.lang.Float r10 = java.lang.Float.valueOf(r0)     // Catch:{ all -> 0x065d }
            r5.mo56360M(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x065d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x065d }
            dagger.a r0 = r0.f118684af     // Catch:{ all -> 0x065d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.speech.dumper.ag r0 = (com.google.android.apps.gsa.shared.speech.dumper.C90544ag) r0     // Catch:{ all -> 0x065d }
            r0.mo84663d()     // Catch:{ all -> 0x065d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x065d }
            dagger.a r0 = r0.f118650V     // Catch:{ all -> 0x065d }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0     // Catch:{ all -> 0x065d }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_IMPOSTER_DETECTED_INTERACTOR     // Catch:{ all -> 0x065d }
            r0.mo83702b(r5)     // Catch:{ all -> 0x065d }
        L_0x030f:
            monitor-exit(r4)     // Catch:{ all -> 0x065d }
        L_0x0310:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r0 = r0.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r4 = r12.f118743a     // Catch:{ all -> 0x065a }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r5 = r4.f118632D     // Catch:{ all -> 0x065a }
            if (r5 == 0) goto L_0x032d
            boolean r5 = r5.f331150m     // Catch:{ all -> 0x065a }
            if (r5 == 0) goto L_0x032d
            dagger.a r4 = r4.f118650V     // Catch:{ all -> 0x065a }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x065a }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ all -> 0x065a }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_USING_SODA     // Catch:{ all -> 0x065a }
            r4.mo83702b(r5)     // Catch:{ all -> 0x065a }
            goto L_0x0342
        L_0x032d:
            com.google.android.hotword.service.HotwordInformation r5 = r4.f118664aJ     // Catch:{ all -> 0x065a }
            if (r5 == 0) goto L_0x0342
            boolean r5 = r5.f395895p     // Catch:{ all -> 0x065a }
            if (r5 == 0) goto L_0x0342
            dagger.a r4 = r4.f118650V     // Catch:{ all -> 0x065a }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x065a }
            com.google.android.apps.gsa.shared.logger.b.i r4 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r4     // Catch:{ all -> 0x065a }
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_FAILED_TO_USE_SODA     // Catch:{ all -> 0x065a }
            r4.mo83702b(r5)     // Catch:{ all -> 0x065a }
        L_0x0342:
            monitor-exit(r0)     // Catch:{ all -> 0x065a }
            boolean r0 = r13.mo84679D()
            if (r0 == 0) goto L_0x0358
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            dagger.a r0 = r0.f118650V
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r0 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r0
            com.google.android.apps.gsa.shared.logger.b.ae r4 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_LOW_THRESHOLD_TRIGGERED
            r0.mo83702b(r4)
        L_0x0358:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r4 = r0.f118726v
            monitor-enter(r4)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x05aa
            dagger.a r0 = r0.f118686ah     // Catch:{ all -> 0x0657 }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x0657 }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ all -> 0x0657 }
            boolean r5 = r0.mo56113h()     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x0468
            java.lang.Object r5 = r0.mo56107c()     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.d.b.a.c r5 = (com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a.C89700c) r5     // Catch:{ all -> 0x0657 }
            boolean r5 = r5.mo83607b()     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x0468
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r12.f118743a     // Catch:{ all -> 0x0657 }
            boolean r5 = r5.mo49412aa()     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x03ae
            com.google.common.base.ax r5 = r13.mo84701s()     // Catch:{ all -> 0x0657 }
            boolean r5 = r5.mo56113h()     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x03ae
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r5, r6)     // Catch:{ all -> 0x0657 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0657 }
            r5 = 54426(0xd49a, float:7.6267E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0657 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0657 }
            java.lang.String r5 = "Bisto invocation when apa stack is active, bypassing to classic."
            r0.mo56386p(r5)     // Catch:{ all -> 0x0657 }
            goto L_0x0468
        L_0x03ae:
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r1, r3)     // Catch:{ all -> 0x0657 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0657 }
            r1 = 54425(0xd499, float:7.6266E-41)
            com.google.common.f.x r13 = r13.mo56372aa(r1)     // Catch:{ all -> 0x0657 }
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "Apa stack is active, delegating."
            r13.mo56386p(r1)     // Catch:{ all -> 0x0657 }
            java.lang.Object r13 = r0.mo56107c()     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.d.b.a.c r13 = (com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a.C89700c) r13     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r0.f118632D     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r3 = r0.f118729y     // Catch:{ all -> 0x0657 }
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x0657 }
            if (r3 == 0) goto L_0x0466
            if (r5 == 0) goto L_0x0466
            boolean r5 = r5.f395899t     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x041d
            boolean r5 = r3.mo84676A()     // Catch:{ all -> 0x0657 }
            if (r5 != 0) goto L_0x041d
            com.google.android.apps.gsa.shared.util.v.g r0 = r0.mo49429k()     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x0657 }
            boolean r0 = r0.mo85405j(r5)     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x041d
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56226d()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "Ignoring hotword event without verified speaker id."
            r1 = 54408(0xd488, float:7.6242E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r13 = r13.f118729y     // Catch:{ all -> 0x0657 }
            if (r13 == 0) goto L_0x0415
            r12.m80969f(r13)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            r13.f118729y = r2     // Catch:{ all -> 0x0657 }
        L_0x0415:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
            goto L_0x0466
        L_0x041d:
            android.net.Uri r0 = r3.mo84695m()     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x0429
            if (r1 == 0) goto L_0x0429
            android.net.Uri r0 = r1.mo103909a()     // Catch:{ all -> 0x0657 }
        L_0x0429:
            if (r0 != 0) goto L_0x044e
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56225c()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "No hotword audio URI and no seamless token."
            r1 = 54407(0xd487, float:7.624E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r13 = r13.f118729y     // Catch:{ all -> 0x0657 }
            if (r13 == 0) goto L_0x0466
            r12.m80969f(r13)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            r13.f118729y = r2     // Catch:{ all -> 0x0657 }
            goto L_0x0466
        L_0x044e:
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r5 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r5)     // Catch:{ all -> 0x0657 }
            java.lang.String r2 = "Forwarding the hotword event to Apa handler."
            r5 = 54406(0xd486, float:7.6239E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r5)).mo56386p(r2)     // Catch:{ all -> 0x0657 }
            r13.mo83606a(r3, r0)     // Catch:{ all -> 0x0657 }
        L_0x0466:
            monitor-exit(r4)     // Catch:{ all -> 0x0657 }
            return
        L_0x0468:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.hotword.service.HotwordInformation r0 = r0.f118664aJ     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r5 = r13.mo84697o()     // Catch:{ all -> 0x0657 }
            boolean r6 = r13.mo84676A()     // Catch:{ all -> 0x0657 }
            if (r6 == 0) goto L_0x047a
            if (r5 == 0) goto L_0x047a
            r0.f395887h = r5     // Catch:{ all -> 0x0657 }
        L_0x047a:
            boolean r5 = r0.f395885f     // Catch:{ all -> 0x0657 }
            boolean r6 = r0.f395883d     // Catch:{ all -> 0x0657 }
            boolean r7 = r0.f395881b     // Catch:{ all -> 0x0657 }
            if (r7 == 0) goto L_0x0488
            boolean r0 = r0.f395899t     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x0488
            r0 = 1
            goto L_0x0489
        L_0x0488:
            r0 = 0
        L_0x0489:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r7 = r12.f118743a     // Catch:{ all -> 0x0657 }
            boolean r7 = r7.mo49412aa()     // Catch:{ all -> 0x0657 }
            if (r7 == 0) goto L_0x049d
            com.google.common.base.ax r7 = r13.mo84701s()     // Catch:{ all -> 0x0657 }
            boolean r7 = r7.mo56113h()     // Catch:{ all -> 0x0657 }
            if (r7 == 0) goto L_0x049d
            r7 = 1
            goto L_0x049e
        L_0x049d:
            r7 = 0
        L_0x049e:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r12.f118743a     // Catch:{ all -> 0x0657 }
            boolean r8 = r8.mo49416ae()     // Catch:{ all -> 0x0657 }
            if (r8 == 0) goto L_0x05aa
            if (r6 != 0) goto L_0x04bc
            if (r5 != 0) goto L_0x04bc
            if (r0 != 0) goto L_0x04bc
            if (r7 != 0) goto L_0x04bc
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.util.v.g r0 = r0.mo49429k()     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x0657 }
            boolean r0 = r0.mo85405j(r5)     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x05aa
        L_0x04bc:
            boolean r0 = r13.mo84680E()     // Catch:{ all -> 0x0657 }
            if (r0 == 0) goto L_0x05aa
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r13.f118632D     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1 = r13.f118729y     // Catch:{ all -> 0x0657 }
            com.google.android.hotword.service.HotwordInformation r5 = r13.f118664aJ     // Catch:{ all -> 0x0657 }
            if (r1 == 0) goto L_0x05a3
            if (r5 != 0) goto L_0x04d0
            goto L_0x05a3
        L_0x04d0:
            boolean r13 = r1.mo84676A()     // Catch:{ all -> 0x0657 }
            boolean r6 = r1.mo84678C()     // Catch:{ all -> 0x0657 }
            com.google.common.base.ax r7 = r1.mo84704u()     // Catch:{ all -> 0x0657 }
            boolean r5 = r5.f395899t     // Catch:{ all -> 0x0657 }
            if (r5 == 0) goto L_0x0517
            if (r13 != 0) goto L_0x0517
            boolean r5 = r7.mo56113h()     // Catch:{ all -> 0x0657 }
            if (r5 != 0) goto L_0x0517
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.util.v.g r5 = r5.mo49429k()     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x0657 }
            boolean r5 = r5.mo85405j(r8)     // Catch:{ all -> 0x0657 }
            if (r5 != 0) goto L_0x0517
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "NGA ignores hotword event without verified SpeakerID or seamless token."
            r1 = 54412(0xd48c, float:7.6247E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0657 }
            r12.m80970g(r3, r6)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
            goto L_0x05a8
        L_0x0517:
            android.net.Uri r3 = r1.mo84695m()     // Catch:{ all -> 0x0657 }
            if (r3 != 0) goto L_0x0523
            if (r0 == 0) goto L_0x0523
            android.net.Uri r3 = r0.mo103909a()     // Catch:{ all -> 0x0657 }
        L_0x0523:
            if (r3 != 0) goto L_0x0548
            boolean r0 = r7.mo56113h()     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x0548
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56225c()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "No hotword audio URI and no seamless token."
            r1 = 54411(0xd48b, float:7.6246E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_DETECTED_NO_AUDIO     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
            goto L_0x05a8
        L_0x0548:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.common.base.ax r0 = r0.f118648T     // Catch:{ all -> 0x0657 }
            com.google.common.base.bk r0 = (com.google.common.base.C58847bk) r0     // Catch:{ all -> 0x0657 }
            java.lang.Object r0 = r0.f156646a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.nga.shared.m.d r0 = (com.google.android.apps.gsa.nga.shared.p6356m.C81428d) r0     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r5 = new com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData     // Catch:{ all -> 0x0657 }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x0657 }
            boolean r0 = r0.mo75078e(r5)     // Catch:{ all -> 0x0657 }
            if (r0 != 0) goto L_0x0582
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "NGA ignored software hotword event."
            r2 = 54410(0xd48a, float:7.6245E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)     // Catch:{ all -> 0x0657 }
            r12.m80970g(r13, r6)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            r13.mo49445r(r3)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_DROPPED_BY_NGA     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
            goto L_0x05a8
        L_0x0582:
            com.google.common.f.e r13 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0657 }
            com.google.common.f.x r13 = r13.mo56224b()     // Catch:{ all -> 0x0657 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0657 }
            java.lang.String r1 = "GsaVoiceInteractionSrv"
            r13.mo56378ag(r0, r1)     // Catch:{ all -> 0x0657 }
            java.lang.String r0 = "Delegate software hotword event to NGA"
            r1 = 54409(0xd489, float:7.6243E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_TRIGGER_DELEGATED_TO_NGA     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a     // Catch:{ all -> 0x0657 }
            r13.f118729y = r2     // Catch:{ all -> 0x0657 }
            goto L_0x05a8
        L_0x05a3:
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.NOT_SENDING_HOTWORD_MISSING_RESULT_OR_DETECTOR     // Catch:{ all -> 0x0657 }
            r13.mo49390E(r0)     // Catch:{ all -> 0x0657 }
        L_0x05a8:
            monitor-exit(r4)     // Catch:{ all -> 0x0657 }
            return
        L_0x05aa:
            monitor-exit(r4)     // Catch:{ all -> 0x0657 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.lang.Object r0 = r0.f118726v
            monitor-enter(r0)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r2 = r12.f118743a     // Catch:{ all -> 0x0654 }
            java.lang.Object r2 = r2.f118726v     // Catch:{ all -> 0x0654 }
            monitor-enter(r2)     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r4 = r12.f118743a     // Catch:{ all -> 0x0651 }
            com.google.android.hotword.service.HotwordInformation r4 = r4.f118664aJ     // Catch:{ all -> 0x0651 }
            boolean r5 = r4.f395883d     // Catch:{ all -> 0x0651 }
            if (r5 != 0) goto L_0x05c1
            boolean r4 = r4.f395885f     // Catch:{ all -> 0x0651 }
            if (r4 == 0) goto L_0x05c2
        L_0x05c1:
            r3 = 1
        L_0x05c2:
            monitor-exit(r2)     // Catch:{ all -> 0x0651 }
            if (r3 == 0) goto L_0x0605
            boolean r1 = r13.mo84676A()     // Catch:{ all -> 0x0654 }
            if (r1 != 0) goto L_0x0605
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            com.google.android.apps.gsa.shared.util.v.g r1 = r1.mo49429k()     // Catch:{ all -> 0x0654 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90082eg.f250077n     // Catch:{ all -> 0x0654 }
            boolean r1 = r1.mo85405j(r2)     // Catch:{ all -> 0x0654 }
            if (r1 == 0) goto L_0x05da
            goto L_0x0605
        L_0x05da:
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0654 }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ all -> 0x0654 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0654 }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r3)     // Catch:{ all -> 0x0654 }
            java.lang.String r2 = "Speaker-Id required and did not trigger."
            r3 = 54431(0xd49f, float:7.6274E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED     // Catch:{ all -> 0x0654 }
            r1.mo49390E(r2)     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            r1.mo49446s()     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r1.f118632D     // Catch:{ all -> 0x0654 }
            if (r1 == 0) goto L_0x0622
            r1.mo103921m()     // Catch:{ all -> 0x0654 }
            goto L_0x0622
        L_0x0605:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            com.google.android.apps.gsa.search.shared.service.aa r1 = r1.f118730z     // Catch:{ all -> 0x0654 }
            boolean r1 = r1.mo81951w()     // Catch:{ all -> 0x0654 }
            if (r1 == 0) goto L_0x061a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            r1.mo49443p()     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            r1.mo49446s()     // Catch:{ all -> 0x0654 }
            goto L_0x0622
        L_0x061a:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r1 = r12.f118743a     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.ao r1 = r1.f118660aF     // Catch:{ all -> 0x0654 }
            r2 = 5
            r1.sendEmptyMessage(r2)     // Catch:{ all -> 0x0654 }
        L_0x0622:
            monitor-exit(r0)     // Catch:{ all -> 0x0654 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            r0.mo49396K()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r12.f118743a
            java.util.concurrent.ConcurrentMap r0 = r0.f118696ar
            double r1 = java.lang.Math.random()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r1, r2)
            boolean r13 = r13.mo84676A()
            if (r13 != 0) goto L_0x0650
            com.google.android.voiceinteraction.GsaVoiceInteractionService r13 = r12.f118743a
            java.util.concurrent.ConcurrentMap r13 = r13.f118697as
            double r0 = java.lang.Math.random()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.put(r0, r1)
        L_0x0650:
            return
        L_0x0651:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0651 }
            throw r13     // Catch:{ all -> 0x0654 }
        L_0x0654:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0654 }
            throw r13
        L_0x0657:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0657 }
            throw r13
        L_0x065a:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x065a }
            throw r13
        L_0x065d:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x065d }
            throw r13
        L_0x0660:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0660 }
            throw r13
        L_0x0663:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0663 }
            throw r13
        L_0x0666:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0666 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45372aa.mo49468e(com.google.android.apps.gsa.shared.speech.hotword.HotwordResult):void");
    }
}
