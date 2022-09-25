package com.google.android.libraries.gsa.p1932q.p1933a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.C107344n;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.C107345o;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.gsa.q.a.a */
/* compiled from: PG */
final class C23322a extends Handler {

    /* renamed from: a */
    final /* synthetic */ C23324c f63823a;

    public C23322a(C23324c cVar) {
        this.f63823a = cVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 3) {
            C107344n nVar = this.f63823a.f63840k;
            if (nVar == null) {
                ((C59052c) ((C59052c) C23324c.f63825a.mo56226d()).mo56372aa(48651)).mo56387q("Message %d received after unbind.", message.what);
                return;
            }
            ((Bundle) message.obj).getByteArray("ssb_service:ssb_state");
            C107345o oVar = nVar.f298732a;
            while (!oVar.f298735b.isEmpty()) {
                oVar.mo95921a(((Boolean) oVar.f298735b.remove()).booleanValue());
            }
            return;
        }
        super.handleMessage(message);
    }
}
