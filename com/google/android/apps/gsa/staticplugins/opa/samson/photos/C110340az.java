package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4715m.p4716a.p4720b.p4721a.C62665ad;
import com.google.p4715m.p4716a.p4720b.p4721a.C62670ai;
import com.google.p4715m.p4716a.p4720b.p4721a.C62671aj;
import dagger.C68214a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.az */
/* compiled from: PG */
public final class C110340az {

    /* renamed from: a */
    public static final C59071e f307542a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.samson.photos.az");

    /* renamed from: b */
    public final Context f307543b;

    /* renamed from: c */
    public final C68214a f307544c;

    /* renamed from: d */
    public final C68214a f307545d;

    /* renamed from: e */
    public final C68214a f307546e;

    /* renamed from: f */
    public final C68214a f307547f;

    /* renamed from: g */
    public final C68214a f307548g;

    /* renamed from: h */
    public final C22871g f307549h;

    /* renamed from: i */
    public final C22871g f307550i;

    public C110340az(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, C22871g gVar2) {
        this.f307543b = context;
        this.f307544c = aVar;
        this.f307545d = aVar2;
        this.f307546e = aVar3;
        this.f307547f = aVar4;
        this.f307548g = aVar5;
        this.f307549h = gVar;
        this.f307550i = gVar2;
    }

    /* renamed from: a */
    public static String m183737a(int i, String str) {
        return String.format(Locale.US, "%d:%s", new Object[]{Integer.valueOf(i), str});
    }

    /* renamed from: c */
    public static void m183738c(Map map, C110339ay ayVar) {
        C62671aj ajVar = (C62671aj) map.get(ayVar);
        if (ajVar != null) {
            C62670ai aiVar = (C62670ai) ajVar.toBuilder();
            aiVar.copyOnWrite();
            C62671aj ajVar2 = (C62671aj) aiVar.instance;
            ajVar2.f169202a |= 4;
            ajVar2.f169204c = true;
            map.put(ayVar, (C62671aj) aiVar.build());
        }
    }

    /* renamed from: b */
    public final C60870cx mo98580b(C110370cb cbVar, C58833ax axVar) {
        cbVar.f307612d = null;
        cbVar.f307613e = null;
        C58836b bVar = C58836b.f156633a;
        C60870cx a = ((C110318ad) this.f307547f.mo27525b()).mo98568a(bVar, bVar);
        C60870cx i = C60856cj.m92900i(C62665ad.f169190b);
        if (axVar.mo56113h()) {
            i = this.f307549h.mo28202b("fetchpreview", new C110334at(this, axVar));
        }
        this.f307550i.mo28211k(C60856cj.m92897f(a, i), "print albums", new C110335au(this, axVar, cbVar));
        return a;
    }
}
