package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84425ag;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.libraries.gcoreclient.p1753c.C21479b;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21461i;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21465m;
import com.google.android.libraries.gcoreclient.p1753c.p1754a.C21466n;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.ac */
/* compiled from: PG */
public final /* synthetic */ class C93717ac implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C84418a f261540a;

    /* renamed from: b */
    public final /* synthetic */ C21466n f261541b;

    /* renamed from: c */
    public final /* synthetic */ C21461i f261542c;

    public /* synthetic */ C93717ac(C84418a aVar, C21466n nVar, C21461i iVar) {
        this.f261540a = aVar;
        this.f261541b = nVar;
        this.f261542c = iVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C84425ag c = this.f261540a.mo77986c();
        boolean z = false;
        if (c != null) {
            C142826w wVar = new C142826w();
            wVar.mo117756b(C21461i.m40576a("com.google.android.apps.maps", "internal.3p:GeoShape").f59908a);
            C21479b g = c.mo78000g(BuildConfig.FLAVOR, 1, C21465m.m40577a(wVar));
            if (g != null && g.mo26945a() > 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
