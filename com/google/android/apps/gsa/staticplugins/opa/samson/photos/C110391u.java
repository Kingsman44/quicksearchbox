package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62666ae;
import com.google.p4715m.p4716a.p4720b.p4721a.C62667af;
import com.google.p4715m.p4716a.p4720b.p4721a.C62673al;
import com.google.p4715m.p4716a.p4720b.p4721a.C62692t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.u */
/* compiled from: PG */
public final /* synthetic */ class C110391u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110318ad f307669a;

    /* renamed from: b */
    public final /* synthetic */ C62673al f307670b;

    public /* synthetic */ C110391u(C110318ad adVar, C62673al alVar) {
        this.f307669a = adVar;
        this.f307670b = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110318ad adVar = this.f307669a;
        C62673al alVar = this.f307670b;
        C62692t tVar = (C62692t) obj;
        if (tVar == null) {
            C58976aa aaVar = C58975e.f156826a;
            tVar = C62692t.f169255d;
        }
        C62666ae aeVar = (C62666ae) C62667af.f169193d.createBuilder();
        aeVar.copyOnWrite();
        C62667af afVar = (C62667af) aeVar.instance;
        tVar.getClass();
        afVar.f169196b = tVar;
        afVar.f169195a |= 1;
        aeVar.copyOnWrite();
        C62667af afVar2 = (C62667af) aeVar.instance;
        alVar.getClass();
        afVar2.f169197c = alVar;
        afVar2.f169195a |= 2;
        C58976aa aaVar2 = C58975e.f156826a;
        return adVar.mo98571d(Uri.parse(adVar.f307475b.mo79758x(C90014bt.f247056U)).buildUpon().appendEncodedPath("settings/user/update").appendQueryParameter("rt", "b").build(), (C62667af) aeVar.build());
    }
}
