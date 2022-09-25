package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p679c.p680a;

import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142660f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.c.a.ab */
/* compiled from: PG */
public final /* synthetic */ class C11556ab implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C11556ab f37465a = new C11556ab();

    private /* synthetic */ C11556ab() {
    }

    public final Object apply(Object obj) {
        C142660f fVar = (C142660f) obj;
        if (fVar == null) {
            C59104x c = C11570ap.f37483a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) c).mo56372aa(43388)).mo56386p("Failed to notify Gearhead due to unset ICarAssistantClientCallbacks.");
            return null;
        }
        try {
            C59104x b = C11570ap.f37483a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) b).mo56372aa(43386)).mo56386p("Trigger Gearhead client onVoiceSessionEnd callback");
            fVar.mo117445g();
            return null;
        } catch (RemoteException e) {
            C59104x c2 = C11570ap.f37483a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AAPConnStatusImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(43387)).mo56386p("Gearhead Client callback onVoiceSessionEnd() failed");
            return null;
        }
    }
}
