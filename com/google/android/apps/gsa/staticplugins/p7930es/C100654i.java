package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.p266f.p267a.p268a.C5121f;
import com.android.p266f.p267a.p268a.C5132q;
import com.android.p266f.p267a.p268a.C5138w;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.i */
/* compiled from: PG */
public final class C100654i extends BroadcastReceiver {

    /* renamed from: a */
    final SettableFuture f281460a;

    /* renamed from: b */
    private final C68214a f281461b;

    public C100654i(SettableFuture settableFuture, C68214a aVar) {
        this.f281461b = aVar;
        this.f281460a = settableFuture;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.apps.gsa.staticplugins.xms.MMS_SENT_ACTION".equals(intent.getAction())) {
            int resultCode = getResultCode();
            if (resultCode != -1) {
                ((C89859i) this.f281461b.mo27525b()).mo83702b(C89849ae.OPA_CHAT_MMS_STATUS_RECEIVER_RESULT_ERROR);
                SettableFuture settableFuture = this.f281460a;
                settableFuture.mo57357o(new Exception("MMS not sent. Error code: " + resultCode));
            } else {
                byte[] byteArrayExtra = intent.getByteArrayExtra("android.telephony.extra.MMS_DATA");
                C5121f g = byteArrayExtra != null ? new C5132q(byteArrayExtra).mo10177g() : null;
                if (g == null) {
                    ((C89859i) this.f281461b.mo27525b()).mo83702b(C89849ae.OPA_CHAT_MMS_STATUS_RECEIVER_PDU_EMPTY);
                    this.f281460a.mo57357o(new Exception("MMS not sent. Empty PDU response"));
                } else if (!(g instanceof C5138w)) {
                    ((C89859i) this.f281461b.mo27525b()).mo83702b(C89849ae.OPA_CHAT_MMS_STATUS_RECEIVER_PDU_INVALID);
                    this.f281460a.mo57357o(new Exception("MMS not sent. Invalid PDU response. SendConf expected."));
                } else {
                    C5138w wVar = (C5138w) g;
                    if (wVar.mo10189c() != 128) {
                        ((C89859i) this.f281461b.mo27525b()).mo83702b(C89849ae.OPA_CHAT_MMS_STATUS_RECEIVER_PDU_RESPONSE_ERROR);
                        SettableFuture settableFuture2 = this.f281460a;
                        int c = wVar.mo10189c();
                        settableFuture2.mo57357o(new Exception("MMS not sent. SendConf response status: " + c));
                    } else {
                        this.f281460a.mo57356n(C118826c.f331422a);
                    }
                }
            }
            context.unregisterReceiver(this);
        }
    }
}
