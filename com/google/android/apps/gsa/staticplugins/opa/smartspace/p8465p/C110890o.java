package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.C83794j;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.android.apps.gsa.opa.smartspace.p6458g.C83791c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110707f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.o */
/* compiled from: PG */
public final class C110890o {

    /* renamed from: a */
    public final C22871g f308921a;

    /* renamed from: b */
    public final C83794j f308922b;

    /* renamed from: c */
    public final C83791c f308923c;

    /* renamed from: d */
    public final C110707f f308924d;

    /* renamed from: e */
    public final C58974d f308925e;

    /* renamed from: f */
    public final C91189au f308926f;

    /* renamed from: g */
    private final C83783a f308927g;

    public C110890o(C83783a aVar, C22871g gVar, C83794j jVar, C83791c cVar, C110707f fVar, C91189au auVar, C83564a aVar2) {
        this.f308927g = aVar;
        this.f308921a = gVar;
        this.f308922b = jVar;
        this.f308923c = cVar;
        this.f308924d = fVar;
        this.f308926f = auVar;
        this.f308925e = aVar2.mo76900a("OpaSmartspaceStgeUtil");
    }

    /* renamed from: a */
    public final C60870cx mo98916a(C83800p pVar) {
        C60870cx cxVar;
        C60870cx b = this.f308927g.mo77103b();
        C60870cx e = this.f308927g.mo77106e();
        C60870cx j = this.f308921a.mo28210j(C60856cj.m92907p(b, e), BuildConfig.FLAVOR, new C110889n(this, pVar));
        if (this.f308922b.mo77172j()) {
            cxVar = this.f308927g.mo77105d();
        } else {
            cxVar = C60856cj.m92900i(new ArrayList());
        }
        return this.f308921a.mo28210j(C60856cj.m92907p(j, cxVar), "Fetching zero prefix suggestion cards", C110887l.f308914a);
    }
}
