package com.google.android.voiceinteraction;

import android.os.SharedMemory;
import android.service.voice.AlwaysOnHotwordDetector;
import android.service.voice.HotwordRejectedResult;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.speech.dumper.C90544ag;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.hotword.service.HotwordInformation;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.voiceinteraction.ag */
/* compiled from: PG */
final class C45378ag extends AlwaysOnHotwordDetector.Callback {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118751a;

    public C45378ag(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118751a = gsaVoiceInteractionService;
    }

    /* renamed from: a */
    private final void m80976a() {
        synchronized (this.f118751a.f118726v) {
            GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
            if (gsaVoiceInteractionService.f118702ax == null) {
                C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c).mo56372aa(54461)).mo56386p("no alwaysOnHotwordDetector to update");
                return;
            }
            HotwordInformation hotwordInformation = gsaVoiceInteractionService.f118664aJ;
            if (hotwordInformation == null) {
                C59104x c2 = GsaVoiceInteractionService.f118622a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c2).mo56372aa(54460)).mo56386p("Cannot update trusted process, hotwordInformation is null.  Binding to HotwordService to acquire new information.");
                this.f118751a.mo49433o();
                return;
            }
            byte[] bArr = hotwordInformation.f395875G;
            if (bArr == null) {
                C59104x c3 = GsaVoiceInteractionService.f118622a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c3).mo56372aa(54459)).mo56386p("Cannot update trusted process, missing hotword model");
                return;
            }
            SpeakerIdModel speakerIdModel = hotwordInformation.f395887h;
            byte[] bArr2 = bArr;
            SharedMemory b = C118726n.m197094b(bArr2, speakerIdModel);
            int length = bArr2.length;
            GsaVoiceInteractionService gsaVoiceInteractionService2 = this.f118751a;
            HotwordInformation hotwordInformation2 = gsaVoiceInteractionService2.f118664aJ;
            boolean z = hotwordInformation2.f395883d;
            boolean z2 = false;
            if (z && hotwordInformation2.f395887h != null) {
                z2 = true;
            }
            if (!z || hotwordInformation2.f395887h != null) {
                try {
                    gsaVoiceInteractionService2.f118702ax.updateState(C118726n.m197093a(length, speakerIdModel, z2), b);
                } catch (Exception e) {
                    C59104x c4 = GsaVoiceInteractionService.f118622a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e)).mo56372aa(54457)).mo56386p("Error updating trusted process state");
                }
            } else {
                C59104x c5 = GsaVoiceInteractionService.f118622a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c5).mo56372aa(54458)).mo56386p("AlwaysOnEnabled is true, but there is no speaker-id model.");
                this.f118751a.mo49433o();
            }
        }
    }

    public final void onAvailabilityChanged(int i) {
        C90851k kVar;
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54442)).mo56386p("onAvailabilityChanged");
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
        if (gsaVoiceInteractionService.f118720p == null && (kVar = gsaVoiceInteractionService.f118676aV) != null) {
            gsaVoiceInteractionService.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
        }
        this.f118751a.f118720p.execute(C47810es.m84977q(new C45373ab(this, i)));
    }

    public final void onDetected(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        C90851k kVar;
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54443)).mo56386p("#onDetected");
        C68214a aVar = this.f118751a.f118650V;
        if (aVar == null || aVar.mo27525b() == null) {
            C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54444)).mo56386p("Cannot log AppFlows with null AppFlowLogger");
        } else {
            ((C89859i) this.f118751a.f118650V.mo27525b()).mo83702b(C89849ae.HOTWORD_TRUSTED_DSP_TRIGGERED);
        }
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
        if (gsaVoiceInteractionService.f118720p == null && (kVar = gsaVoiceInteractionService.f118676aV) != null) {
            gsaVoiceInteractionService.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
        }
        this.f118751a.f118720p.execute(C47810es.m84977q(new C45375ad(this, eventPayload)));
    }

    public final void onError() {
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54445)).mo56386p("trusted onError");
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
        gsaVoiceInteractionService.f118702ax = null;
        gsaVoiceInteractionService.f118663aI = false;
        gsaVoiceInteractionService.f118703ay = 0;
        this.f118751a.mo49454z(0, "deleted detector for onError");
        this.f118751a.f118720p.mo29164d(new C45374ac(this), 1000, TimeUnit.MILLISECONDS);
        this.f118751a.f118669aO.onError();
    }

    public final void onHotwordDetectionServiceInitialized(int i) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        if (i == 0) {
            C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b).mo56372aa(54449)).mo56386p("Successfully Initialized.");
        } else if (i == 1) {
            C59104x b2 = GsaVoiceInteractionService.f118622a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) b2).mo56372aa(54448)).mo56386p("Reacquiring hotword models.");
            this.f118751a.mo49433o();
        } else if (i == 2) {
            C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54447)).mo56386p("Unknown error occurred when initializing the HotwordDetectionService.");
        }
    }

    public final void onHotwordDetectionServiceRestarted() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54450)).mo56386p("onHotwordDetectionServiceRestarted");
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
        if (gsaVoiceInteractionService.f118716l.length() != 0) {
            gsaVoiceInteractionService.f118716l = String.valueOf(gsaVoiceInteractionService.f118716l).concat(", ");
        }
        String str = gsaVoiceInteractionService.f118716l;
        String format = GsaVoiceInteractionService.f118627d.format(Long.valueOf(System.currentTimeMillis()));
        gsaVoiceInteractionService.f118716l = str + "trusted process restarted | " + format;
        m80976a();
    }

    public final void onRecognitionPaused() {
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54451)).mo56386p("onRecognitionPaused");
    }

    public final void onRecognitionResumed() {
        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) c).mo56372aa(54452)).mo56386p("onRecognitionResumed");
        this.f118751a.f118669aO.onRecognitionResumed();
    }

    public final void onRejected(HotwordRejectedResult hotwordRejectedResult) {
        C90851k kVar;
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54453)).mo56389s("Rejected: %s", hotwordRejectedResult);
        int confidenceLevel = hotwordRejectedResult.getConfidenceLevel();
        C68214a aVar = this.f118751a.f118684af;
        if (!(aVar == null || aVar.mo27525b() == null)) {
            ((C90544ag) this.f118751a.f118684af.mo27525b()).mo84662c();
        }
        C68214a aVar2 = this.f118751a.f118650V;
        if (aVar2 == null || aVar2.mo27525b() == null) {
            C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54440)).mo56387q("Cannot log AppFlows with null AppFlowLogger event=%d", C89849ae.HOTWORD_TRUSTED_DSP_TRIGGERED.f245884YW);
        } else {
            ((C89859i) this.f118751a.f118650V.mo27525b()).mo83702b(C89849ae.HOTWORD_TRUSTED_DSP_TRIGGERED);
        }
        if (confidenceLevel == 0 || confidenceLevel == 1) {
            this.f118751a.mo49390E(C89849ae.FAILED_TO_START_2ND_STAGE_HOTWORD);
        } else if (confidenceLevel == 2) {
            this.f118751a.mo49390E(C89849ae.HOTWORD_2ND_STAGE_DSP_TIMEOUT);
        } else if (confidenceLevel != 3) {
            this.f118751a.mo49390E(C89849ae.HOTWORD_2ND_STAGE_RECOGNITION_ERROR);
            C59104x c2 = GsaVoiceInteractionService.f118622a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c2).mo56372aa(54441)).mo56387q("Unrecognized confidence interval after hotword rejected: %d", confidenceLevel);
        } else {
            this.f118751a.mo49390E(C89849ae.HOTWORD_2ND_STAGE_VOICE_MATCH_REJECTED);
            ((C90544ag) this.f118751a.f118684af.mo27525b()).mo84663d();
        }
        if (confidenceLevel == 1) {
            C59104x d = GsaVoiceInteractionService.f118622a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) d).mo56372aa(54455)).mo56386p("Trusted process not initialized.");
            m80976a();
        }
        if (this.f118751a.mo49420ai()) {
            this.f118751a.f118663aI = true;
        } else {
            C59104x c3 = GsaVoiceInteractionService.f118622a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c3).mo56372aa(54454)).mo56386p("Could not restart recognition.");
        }
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118751a;
        if (gsaVoiceInteractionService.f118720p == null && (kVar = gsaVoiceInteractionService.f118676aV) != null) {
            gsaVoiceInteractionService.f118720p = kVar.mo85208a("HotwordBackgroundExecutor");
        }
        this.f118751a.f118720p.execute(C47810es.m84977q(new C45376ae(this)));
        if (!this.f118751a.mo49416ae()) {
            this.f118751a.f118718n.set(true);
            this.f118751a.f118660aF.sendEmptyMessage(5);
        }
    }
}
