package com.google.android.apps.gsa.staticplugins.messages.monet.p8037c;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.common.p4552o.C60572uw;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.c.g */
/* compiled from: PG */
public final class C102755g implements C102754f {

    /* renamed from: a */
    public final C23112h f286850a;

    public C102755g(C23112h hVar) {
        this.f286850a = hVar;
    }

    /* renamed from: f */
    public final void mo93412f(C60572uw uwVar) {
        Bundle bundle = new Bundle();
        C60572uw.values();
        bundle.putInt("status", uwVar.ordinal());
        this.f286850a.mo28345s("onFuseUiStatus_com.google.common.logging.GsaClientLogProto.LocalIntentCountdownStatus", "MessageCardEventsDispatcher", bundle);
    }
}
