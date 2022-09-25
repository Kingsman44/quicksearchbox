package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.f */
/* compiled from: PG */
public final /* synthetic */ class C133887f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133891j f364668a;

    public /* synthetic */ C133887f(C133891j jVar) {
        this.f364668a = jVar;
    }

    public final C60870cx apply(Object obj) {
        Void voidR = (Void) obj;
        C38750am amVar = this.f364668a.f364673b;
        C59743a aVar = C59743a.USER_EVENT_CUSTOM_TABS_BOTTOM_BAR_DISMISSED;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1418;
        amVar.mo41599k(aVar, tzVar);
        return C60866ct.f164955a;
    }
}
