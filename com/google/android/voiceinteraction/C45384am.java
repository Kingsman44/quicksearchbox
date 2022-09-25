package com.google.android.voiceinteraction;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.am */
/* compiled from: PG */
final class C45384am extends C88499t {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118757a;

    public C45384am(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118757a = gsaVoiceInteractionService;
    }

    /* renamed from: fO */
    public final void mo49088fO(Intent intent) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        this.f118757a.startActivity(intent.addFlags(268435456));
    }
}
