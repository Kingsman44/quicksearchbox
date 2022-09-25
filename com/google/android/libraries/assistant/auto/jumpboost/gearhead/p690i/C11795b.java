package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i;

import android.os.RemoteException;
import com.google.android.gearhead.sdk.assistant.C142663i;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.b */
/* compiled from: PG */
public final /* synthetic */ class C11795b implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C11795b f37949a = new C11795b();

    private /* synthetic */ C11795b() {
    }

    public final Object apply(Object obj) {
        C142663i iVar = (C142663i) obj;
        if (iVar == null) {
            C59104x c = C11805l.f37963a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) c).mo56372aa(43471)).mo56386p("Failed to notify Gearhead due to unset ITranscriptionCallback.");
            return null;
        }
        try {
            C59104x b = C11805l.f37963a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) b).mo56372aa(43469)).mo56386p("Trigger Gearhead TranscriptionCallback.onTranscriptionSessionEnd");
            iVar.mo17263hf(4, iVar.mo17260gA());
            return null;
        } catch (RemoteException e) {
            C59104x c2 = C11805l.f37963a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(43470)).mo56386p("Trigger Gearhead TranscriptionCallback.onTranscriptionSessionEnd failed");
            return null;
        }
    }
}
