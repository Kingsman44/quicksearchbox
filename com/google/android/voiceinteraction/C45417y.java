package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.shared.bisto.C89686y;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118719g;
import com.google.android.apps.gsa.voiceinteraction.hotword.C118726n;
import com.google.android.hotword.service.HotwordInformation;
import com.google.android.libraries.assistant.hotword.C18339al;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.y */
/* compiled from: PG */
final class C45417y implements C89686y {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118792a;

    public C45417y(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118792a = gsaVoiceInteractionService;
    }

    /* renamed from: c */
    private final void m81036c() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118792a;
        HotwordInformation hotwordInformation = gsaVoiceInteractionService.f118664aJ;
        if (hotwordInformation != null) {
            gsaVoiceInteractionService.mo49408W(hotwordInformation, false, false, false);
        }
    }

    /* renamed from: d */
    private final boolean m81037d() {
        boolean z;
        synchronized (this.f118792a.f118726v) {
            HotwordInformation hotwordInformation = this.f118792a.f118664aJ;
            z = false;
            if (hotwordInformation != null && C118726n.m197095c(hotwordInformation.f395869A) && hotwordInformation.f395877I && hotwordInformation.f395873E) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo39364a() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54401)).mo56386p("#onBistoHotwordStarting");
        synchronized (this.f118792a.f118726v) {
            GsaVoiceInteractionService gsaVoiceInteractionService = this.f118792a;
            C118719g gVar = gsaVoiceInteractionService.f118632D;
            if (gVar != null) {
                gVar.mo103918j();
            } else if (gsaVoiceInteractionService.f118704az || m81037d()) {
                this.f118792a.mo49421aj(true);
                this.f118792a.mo49453y(true);
                C118719g gVar2 = this.f118792a.f118632D;
                if (gVar2 != null) {
                    gVar2.mo103918j();
                    GsaVoiceInteractionService gsaVoiceInteractionService2 = this.f118792a;
                    gsaVoiceInteractionService2.f118632D.mo103920l(gsaVoiceInteractionService2.f118664aJ);
                } else {
                    C59104x c = GsaVoiceInteractionService.f118622a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
                    ((C59052c) ((C59052c) c).mo56372aa(54402)).mo56386p("Could not create HotwordDetectorWithState");
                }
            }
            m81036c();
        }
    }

    /* renamed from: b */
    public final void mo39365b() {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54403)).mo56386p("#onBistoHotwordStopping");
        synchronized (this.f118792a.f118726v) {
            C118719g gVar = this.f118792a.f118632D;
            if (gVar != null) {
                gVar.f331147j.f331167h = false;
                C18339al alVar = gVar.f331140c;
                if (alVar != null) {
                    alVar.mo23792d();
                    gVar.f331140c = null;
                }
            }
            if (this.f118792a.f118704az || m81037d()) {
                GsaVoiceInteractionService gsaVoiceInteractionService = this.f118792a;
                HotwordInformation hotwordInformation = gsaVoiceInteractionService.f118664aJ;
                if ((hotwordInformation != null && hotwordInformation.f395883d) || gsaVoiceInteractionService.f118712h) {
                    C45386ao aoVar = gsaVoiceInteractionService.f118660aF;
                    if (aoVar != null) {
                        aoVar.sendEmptyMessage(2);
                    } else {
                        gsaVoiceInteractionService.mo49420ai();
                    }
                }
                C118719g gVar2 = this.f118792a.f118632D;
                if (gVar2 != null) {
                    gVar2.f331139b.mo23792d();
                    C18339al alVar2 = gVar2.f331140c;
                    if (alVar2 != null) {
                        alVar2.mo23792d();
                    }
                }
                this.f118792a.f118632D = null;
            }
            m81036c();
        }
    }
}
