package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p690i;

import android.os.Parcel;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.gearhead.sdk.assistant.C142663i;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.i.e */
/* compiled from: PG */
public final /* synthetic */ class C11798e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f37953a;

    public /* synthetic */ C11798e(String str) {
        this.f37953a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f37953a;
        C142663i iVar = (C142663i) obj;
        if (iVar == null) {
            C59104x c = C11805l.f37963a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) c).mo56372aa(43465)).mo56386p("Failed to notify Gearhead due to unset ITranscriptionCallback.");
            return null;
        }
        try {
            C59104x b = C11805l.f37963a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) b).mo56372aa(43463)).mo56386p("Trigger Gearhead TranscriptionCallback.onTranscriptionChange");
            Parcel gA = iVar.mo17260gA();
            gA.writeString(str);
            gA.writeString(BuildConfig.FLAVOR);
            iVar.mo17263hf(2, gA);
            return null;
        } catch (RemoteException e) {
            C59104x c2 = C11805l.f37963a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "AAPTranscriptionCBImpl");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(43464)).mo56386p("Trigger Gearhead TranscriptionCallback.onTranscriptionChange failed");
            return null;
        }
    }
}
