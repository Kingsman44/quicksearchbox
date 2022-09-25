package com.google.android.apps.gsa.staticplugins.p7932f.p7935c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7932f.p7934b.C100679g;
import com.google.android.apps.gsa.staticplugins.p7932f.p7934b.C100686n;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.c.c */
/* compiled from: PG */
public final class C100691c implements C23113i {

    /* renamed from: a */
    private final C100689a f281551a;

    public C100691c(C100689a aVar) {
        this.f281551a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("AmpActionsEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onClose")) {
                C100686n nVar = (C100686n) this.f281551a;
                nVar.f281528f.mo28212l("Reset Amp Actions", new C100679g(nVar));
            }
        }
    }
}
