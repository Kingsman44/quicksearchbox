package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.hotword.service.HotwordInformation;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.ai */
/* compiled from: PG */
public final /* synthetic */ class C45380ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45381aj f118753a;

    public /* synthetic */ C45380ai(C45381aj ajVar) {
        this.f118753a = ajVar;
    }

    public final void run() {
        boolean z;
        C45381aj ajVar = this.f118753a;
        synchronized (ajVar.f118754a.f118726v) {
            HotwordInformation hotwordInformation = ajVar.f118754a.f118664aJ;
            z = false;
            if (hotwordInformation != null && hotwordInformation.f395877I && C118726n.m197095c(hotwordInformation.f395869A) && !hotwordInformation.f395883d && !hotwordInformation.f395885f) {
                z = true;
            }
        }
        GsaVoiceInteractionService gsaVoiceInteractionService = ajVar.f118754a;
        if (gsaVoiceInteractionService.f118702ax != null && z) {
            if (!gsaVoiceInteractionService.f118655aA.get()) {
                GsaVoiceInteractionService gsaVoiceInteractionService2 = ajVar.f118754a;
                if (!gsaVoiceInteractionService2.f118663aI && gsaVoiceInteractionService2.f118703ay == 2) {
                    try {
                        GsaVoiceInteractionService gsaVoiceInteractionService3 = ajVar.f118754a;
                        gsaVoiceInteractionService3.f118656aB = gsaVoiceInteractionService3.f118702ax.getSupportedRecognitionModes();
                    } catch (Exception e) {
                        C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(54462)).mo56386p("Error getting supported recognition modes");
                    }
                    GsaVoiceInteractionService gsaVoiceInteractionService4 = ajVar.f118754a;
                    gsaVoiceInteractionService4.f118702ax = null;
                    gsaVoiceInteractionService4.mo49454z(gsaVoiceInteractionService4.f118703ay, "deleted detector to delay trusted init");
                    return;
                }
            }
            if (ajVar.f118754a.f118703ay != 2 && ajVar.f118754a.f118703ay != 1) {
                GsaVoiceInteractionService gsaVoiceInteractionService5 = ajVar.f118754a;
                gsaVoiceInteractionService5.mo49454z(gsaVoiceInteractionService5.f118703ay, "deleted detector because no keyphrase support");
                GsaVoiceInteractionService gsaVoiceInteractionService6 = ajVar.f118754a;
                gsaVoiceInteractionService6.f118702ax = null;
                gsaVoiceInteractionService6.mo49453y(true);
            }
        }
    }
}
