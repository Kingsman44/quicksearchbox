package com.google.android.voiceinteraction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.broadcastreceiver.C74444a;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.voiceinteraction.v */
/* compiled from: PG */
final class C45414v extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118790a;

    public C45414v(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118790a = gsaVoiceInteractionService;
    }

    public final void onReceive(Context context, Intent intent) {
        C59104x b = GsaVoiceInteractionService.f118622a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractionSrv");
        ((C59052c) ((C59052c) b).mo56372aa(54398)).mo56389s("O received %s", intent);
        if (intent != null) {
            C88486g gVar = new C88486g();
            gVar.f239201c = amo.COMMON_BROADCAST;
            gVar.f239199a = 1;
            gVar.f239204f = "broadcast_receiver";
            ClientConfig clientConfig = new ClientConfig(gVar);
            C88483e eVar = this.f118790a.f118647S;
            C88489j jVar = new C88489j(C87739bu.COMMON_BROADCAST_MESSAGE_RECEIVED);
            jVar.mo82015c(intent);
            eVar.mo82004b(clientConfig, jVar.mo82013a(), C74444a.f208519a);
        }
    }
}
