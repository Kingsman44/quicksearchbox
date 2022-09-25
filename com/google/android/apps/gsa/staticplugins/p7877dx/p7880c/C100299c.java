package com.google.android.apps.gsa.staticplugins.p7877dx.p7880c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7879b.C100295m;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.c.c */
/* compiled from: PG */
public final class C100299c implements C23113i {

    /* renamed from: a */
    private final C100297a f280482a;

    public C100299c(C100297a aVar) {
        this.f280482a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("TabNavigationEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onTabClicked_com.google.android.apps.gsa.shared.monet.features.tabnavigation.TabNavigationProto.TabNavigationTabType")) {
                C23259d dVar = new C23259d(C90208n.values());
                int i = pVar.f63472a.getInt("tab");
                this.f280482a.mo91868h((C90208n) dVar.f63738a[i]);
            } else if (str.equals("setSelectedTab_com.google.android.apps.gsa.shared.monet.features.tabnavigation.TabNavigationProto.TabNavigationTabType")) {
                C23259d dVar2 = new C23259d(C90208n.values());
                int i2 = pVar.f63472a.getInt("tab");
                ((C100295m) this.f280482a).mo91869i((C90208n) dVar2.f63738a[i2], false);
            }
        }
    }
}
