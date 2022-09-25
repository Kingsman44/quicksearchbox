package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.android.gearhead.sdk.assistant.IntentResult;
import com.google.android.gearhead.sdk.assistant.VoiceSessionResult;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.al */
/* compiled from: PG */
public final /* synthetic */ class C11566al implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Intent f37479a;

    public /* synthetic */ C11566al(Intent intent) {
        this.f37479a = intent;
    }

    public final Object apply(Object obj) {
        Intent intent = this.f37479a;
        C142660f fVar = (C142660f) obj;
        if (fVar == null) {
            C59104x c = C11570ap.f37483a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) c).mo56372aa(43385)).mo56386p("Failed to notify Gearhead due to unset ICarAssistantClientCallbacks.");
            return false;
        }
        IntentResult intentResult = new IntentResult();
        intentResult.f387113a = 1;
        intentResult.f387114b = intent;
        VoiceSessionResult voiceSessionResult = new VoiceSessionResult();
        voiceSessionResult.f387143a = 1;
        voiceSessionResult.f387144b = intentResult;
        try {
            C59104x b = C11570ap.f37483a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) b).mo56372aa(43383)).mo56386p("Trigger Gearhead client onVoiceSessionResult callback");
            return Boolean.valueOf(fVar.mo117446h(voiceSessionResult));
        } catch (RemoteException e) {
            C59104x c2 = C11570ap.f37483a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(43384)).mo56386p("Gearhead Client callback onVoiceSessionResult() failed");
            return false;
        }
    }
}
