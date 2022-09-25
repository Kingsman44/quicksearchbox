package com.google.android.voiceinteraction;

import android.content.Context;
import android.media.AudioFormat;
import android.service.voice.AlwaysOnHotwordDetector;
import com.google.android.apps.gsa.hotword.hotworddetectionservice.k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.dumper.C90544ag;
import com.google.android.apps.gsa.shared.speech.hotword.C90599p;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.voiceinteraction.ad */
/* compiled from: PG */
public final /* synthetic */ class C45375ad implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45378ag f118747a;

    /* renamed from: b */
    public final /* synthetic */ AlwaysOnHotwordDetector.EventPayload f118748b;

    public /* synthetic */ C45375ad(C45378ag agVar, AlwaysOnHotwordDetector.EventPayload eventPayload) {
        this.f118747a = agVar;
        this.f118748b = eventPayload;
    }

    public final void run() {
        boolean z;
        C45378ag agVar = this.f118747a;
        AlwaysOnHotwordDetector.EventPayload eventPayload = this.f118748b;
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54433)).mo56386p("handling onDetected");
        GsaVoiceInteractionService gsaVoiceInteractionService = agVar.f118751a;
        if (gsaVoiceInteractionService.f118667aM == null) {
            gsaVoiceInteractionService.f118667aM = new k();
        }
        GsaVoiceInteractionService gsaVoiceInteractionService2 = agVar.f118751a;
        boolean z2 = false;
        gsaVoiceInteractionService2.f118663aI = false;
        synchronized (gsaVoiceInteractionService2.f118726v) {
            HotwordInformation hotwordInformation = agVar.f118751a.f118664aJ;
            if (hotwordInformation != null) {
                z2 = hotwordInformation.f395883d;
                z = hotwordInformation.f395889j;
            } else {
                C59104x d = GsaVoiceInteractionService.f118622a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) d).mo56372aa(54434)).mo56386p("No HotwordInformation to use for the HotwordResult.");
                z = false;
            }
        }
        Context context = z ? agVar.f118751a.f118637I : null;
        AudioFormat captureAudioFormat = eventPayload.getCaptureAudioFormat();
        GsaVoiceInteractionService gsaVoiceInteractionService3 = agVar.f118751a;
        HotwordResult d2 = C118726n.m197096d(eventPayload, z2, true, context, captureAudioFormat, gsaVoiceInteractionService3.f118657aC, C58833ax.m90833j(gsaVoiceInteractionService3.f118667aM), C58833ax.m90834k(gsaVoiceInteractionService3.f118668aN));
        C21370a aVar = agVar.f118751a.f118652X;
        if (!(aVar == null || d2 == null)) {
            C90599p n = d2.mo84696n();
            n.mo84720i(aVar.mo26871c());
            n.mo84719h(true);
            d2 = n.mo84712a();
        }
        if (agVar.f118751a.mo49412aa()) {
            C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c).mo56372aa(54436)).mo56386p("Hotword triggered, but Bisto device is connected, so ignoring and not restarting hotword detection on DSP.");
            agVar.f118751a.mo49393H();
            if (d2 != null) {
                agVar.f118751a.mo49445r(d2.mo84695m());
            }
            C68214a aVar2 = agVar.f118751a.f118650V;
            if (aVar2 == null || aVar2.mo27525b() == null) {
                C59104x c2 = GsaVoiceInteractionService.f118622a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                ((C59052c) ((C59052c) c2).mo56372aa(54437)).mo56386p("Cannot log AppFlows with null AppFlowLogger");
                return;
            }
            agVar.f118751a.mo49390E(C89849ae.DSP_REJECTED_BISTO_DEVICE_HOTWORD_ACTIVE);
            return;
        }
        C68214a aVar3 = agVar.f118751a.f118684af;
        if (!(aVar3 == null || aVar3.mo27525b() == null)) {
            ((C90544ag) agVar.f118751a.f118684af.mo27525b()).mo84662c();
        }
        if (d2 == null) {
            C59104x c3 = GsaVoiceInteractionService.f118622a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
            ((C59052c) ((C59052c) c3).mo56372aa(54435)).mo56386p("Could not create the HotwordResult");
            if (agVar.f118751a.mo49420ai()) {
                agVar.f118751a.f118663aI = true;
                return;
            }
            return;
        }
        agVar.f118751a.f118700av.mo49468e(d2);
    }
}
