package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import android.media.Ringtone;
import android.media.RingtoneManager;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.av */
/* compiled from: PG */
public final /* synthetic */ class C14682av implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14686az f44339a;

    public /* synthetic */ C14682av(C14686az azVar) {
        this.f44339a = azVar;
    }

    public final void run() {
        C14686az azVar = this.f44339a;
        if (azVar.f44364n == null) {
            azVar.f44364n = RingtoneManager.getRingtone(azVar.f44353c, RingtoneManager.getDefaultUri(2));
        }
        Ringtone ringtone = azVar.f44364n;
        if (ringtone != null) {
            ringtone.play();
            return;
        }
        C59104x d = C14686az.f44351a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MessageCtrl");
        ((C59052c) ((C59052c) d).mo56372aa(45403)).mo56386p("Ringtone was unavailable, not playing.");
    }
}
