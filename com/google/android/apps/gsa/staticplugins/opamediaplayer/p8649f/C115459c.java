package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.C115171a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115198a;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23257b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.c */
/* compiled from: PG */
public final class C115459c implements C23113i {

    /* renamed from: a */
    private final C115421a f320293a;

    public C115459c(C115421a aVar) {
        this.f320293a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("AppbarEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onSentFeedback_byte[]")) {
                byte[] e = C23257b.m43596e("screenshot", pVar);
                C115421a aVar = this.f320293a;
                if (!((C23056g) aVar).f63405W.mo28420E()) {
                    C115171a aVar2 = (C115171a) aVar;
                    C115198a.m190984a(aVar2.f319636a, aVar2.f319637b, e);
                }
            }
        }
    }
}
