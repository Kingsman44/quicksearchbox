package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.opa.C83572ac;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ar */
/* compiled from: PG */
public final /* synthetic */ class C107385ar implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C109040fj f298877a;

    /* renamed from: b */
    public final /* synthetic */ boolean f298878b;

    public /* synthetic */ C107385ar(C109040fj fjVar, boolean z) {
        this.f298877a = fjVar;
        this.f298878b = z;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C109040fj fjVar = this.f298877a;
        boolean z = this.f298878b;
        List list = (List) obj;
        Boolean bool = (Boolean) list.get(0);
        Boolean bool2 = (Boolean) list.get(1);
        if (bool != null && bool.booleanValue()) {
            fjVar.f303334bo = true;
            fjVar.mo97448aJ(C83572ac.AOL, z);
        } else if (bool2 == null || !bool2.booleanValue()) {
            fjVar.mo97447aI(z);
        } else {
            fjVar.f303335bp = true;
            fjVar.mo97448aJ(C83572ac.TMF, z);
        }
    }
}
