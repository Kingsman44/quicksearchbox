package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9331a;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.a.b */
/* compiled from: PG */
public final /* synthetic */ class C123800b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123809k f341997a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f341998b;

    public /* synthetic */ C123800b(C123809k kVar, C58480gp gpVar) {
        this.f341997a = kVar;
        this.f341998b = gpVar;
    }

    public final C60870cx apply(Object obj) {
        C123809k kVar = this.f341997a;
        Void voidR = (Void) obj;
        C58485gu f = this.f341998b.mo55394f();
        if (kVar.f342027k.isPresent() && !f.isEmpty()) {
            return ((C124167p) kVar.f342027k.get()).mo106310d(f);
        }
        ((C58970a) ((C58970a) kVar.f342029m.mo56226d()).mo56372aa(35246)).mo56386p("Could not update the display validity of weather data.");
        return C60866ct.f164955a;
    }
}
