package com.google.android.libraries.search.assistant.performer.communication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.p104d.p105a.C2164c;
import com.android.p266f.p267a.p268a.C5121f;
import com.android.p266f.p267a.p268a.C5132q;
import com.android.p266f.p267a.p268a.C5138w;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dj */
/* compiled from: PG */
final class C35675dj extends BroadcastReceiver {

    /* renamed from: a */
    private final C2164c f93563a;

    public C35675dj(C2164c cVar) {
        this.f93563a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.libraries.search.assistant.performer.communication.MMS_SENT_ACTION".equals(intent.getAction())) {
            int resultCode = getResultCode();
            if (resultCode != -1) {
                C2164c cVar = this.f93563a;
                cVar.mo5439d(new Exception("MMS not sent. Error code: " + resultCode));
            } else {
                byte[] byteArrayExtra = intent.getByteArrayExtra("android.telephony.extra.MMS_DATA");
                C5121f g = byteArrayExtra != null ? new C5132q(byteArrayExtra).mo10177g() : null;
                if (g == null) {
                    this.f93563a.mo5439d(new Exception("MMS not sent. Empty PDU response"));
                } else if (!(g instanceof C5138w)) {
                    this.f93563a.mo5439d(new Exception("MMS not sent. Invalid PDU response. SendConf expected."));
                } else {
                    C5138w wVar = (C5138w) g;
                    if (wVar.mo10189c() != 128) {
                        C2164c cVar2 = this.f93563a;
                        int c = wVar.mo10189c();
                        cVar2.mo5439d(new Exception("MMS not sent. SendConf response status: " + c));
                    } else {
                        this.f93563a.mo5437b((Object) null);
                    }
                }
            }
            context.unregisterReceiver(this);
        }
    }
}
