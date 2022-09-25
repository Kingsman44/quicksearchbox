package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7411b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7410a.C94109f;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.b.c */
/* compiled from: PG */
public final class C94113c implements C23113i {

    /* renamed from: a */
    private final C94111a f262938a;

    public C94113c(C94111a aVar) {
        this.f262938a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ExploreOnContentEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onCloseExploreOnContent")) {
                ((C94109f) this.f262938a).f262923b.mo28600c();
            }
        }
    }
}
