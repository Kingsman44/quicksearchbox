package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62679g;
import com.google.p4715m.p4716a.p4720b.p4721a.C62680h;
import com.google.p4715m.p4716a.p4720b.p4721a.C62692t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.z */
/* compiled from: PG */
public final /* synthetic */ class C110396z implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307676a;

    public /* synthetic */ C110396z(C110318ad adVar) {
        this.f307676a = adVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110318ad adVar = this.f307676a;
        C62692t tVar = (C62692t) obj;
        if (tVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            tVar = C62692t.f169255d;
        }
        C62679g gVar = (C62679g) C62680h.f169227c.createBuilder();
        gVar.copyOnWrite();
        C62680h hVar = (C62680h) gVar.instance;
        tVar.getClass();
        hVar.f169230b = tVar;
        hVar.f169229a |= 1;
        C58976aa aaVar2 = C58975e.f156826a;
        return adVar.mo98571d(Uri.parse(adVar.f307475b.mo79758x(C90014bt.f247056U)).buildUpon().appendEncodedPath("settings/user").appendQueryParameter("rt", "b").build(), (C62680h) gVar.build());
    }
}
