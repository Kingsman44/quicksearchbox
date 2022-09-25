package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62695w;
import com.google.p4715m.p4716a.p4720b.p4721a.C62696x;
import com.google.p4715m.p4716a.p4720b.p4721a.C62697y;
import com.google.p4715m.p4716a.p4720b.p4721a.C62698z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.at */
/* compiled from: PG */
public final /* synthetic */ class C110334at implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110340az f307535a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f307536b;

    public /* synthetic */ C110334at(C110340az azVar, C58833ax axVar) {
        this.f307535a = azVar;
        this.f307536b = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110340az azVar = this.f307535a;
        C58833ax axVar = this.f307536b;
        C110318ad adVar = (C110318ad) azVar.f307547f.mo27525b();
        String str = (String) axVar.mo56107c();
        String g = ((C86054o) azVar.f307548g.mo27525b()).mo79673g();
        g.getClass();
        int i = azVar.f307543b.getResources().getDisplayMetrics().widthPixels / 3;
        C62697y yVar = (C62697y) C62698z.f169271g.createBuilder();
        String a = C110340az.m183737a(2, g);
        yVar.copyOnWrite();
        C62698z zVar = (C62698z) yVar.instance;
        a.getClass();
        zVar.f169273a |= 1;
        zVar.f169274b = a;
        C62695w wVar = (C62695w) C62696x.f169266d.createBuilder();
        wVar.copyOnWrite();
        C62696x xVar = (C62696x) wVar.instance;
        str.getClass();
        xVar.f169268a |= 2;
        xVar.f169270c = str;
        yVar.copyOnWrite();
        C62698z zVar2 = (C62698z) yVar.instance;
        C62696x xVar2 = (C62696x) wVar.build();
        xVar2.getClass();
        zVar2.f169275c = xVar2;
        zVar2.f169273a |= 2;
        yVar.copyOnWrite();
        C62698z zVar3 = (C62698z) yVar.instance;
        zVar3.f169273a |= 8;
        zVar3.f169276d = 100;
        yVar.copyOnWrite();
        C62698z zVar4 = (C62698z) yVar.instance;
        zVar4.f169273a |= 16;
        zVar4.f169277e = i;
        yVar.copyOnWrite();
        C62698z zVar5 = (C62698z) yVar.instance;
        zVar5.f169273a |= 32;
        zVar5.f169278f = i;
        C58976aa aaVar = C58975e.f156826a;
        return adVar.f307479f.mo28209i(adVar.mo98571d(Uri.parse(adVar.f307475b.mo79758x(C90014bt.f247056U)).buildUpon().appendEncodedPath("settings/preview").appendQueryParameter("rt", "b").build(), (C62698z) yVar.build()), "parse preview response", C110316ab.f307472a);
    }
}
