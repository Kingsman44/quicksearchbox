package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.p7598a;

import android.content.Intent;
import com.google.android.apps.gsa.h.g.e;
import com.google.android.apps.gsa.shared.search.C90506n;
import com.google.android.apps.gsa.shared.search.p7138b.C90489e;
import com.google.android.apps.gsa.shared.search.p7138b.C90491g;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7597c.C97077d;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7587c.C96997b;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.p3003h.p3004a.C38402f;
import com.google.android.libraries.search.p3003h.p3004a.C38404h;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.c.a.c */
/* compiled from: PG */
public final /* synthetic */ class C97068c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97070e f271229a;

    /* renamed from: b */
    public final /* synthetic */ C96997b f271230b;

    public /* synthetic */ C97068c(C97070e eVar, C96997b bVar) {
        this.f271229a = eVar;
        this.f271230b = bVar;
    }

    public final void run() {
        C97070e eVar = this.f271229a;
        C96997b bVar = this.f271230b;
        C97067b bVar2 = eVar.f271233b;
        C90489e eVar2 = (C90489e) C90491g.f252884z.createBuilder();
        int i = bVar.f271072d;
        eVar2.copyOnWrite();
        C90491g gVar = (C90491g) eVar2.instance;
        gVar.f252886a |= 16384;
        gVar.f252900o = i;
        String str = bVar.f271073e;
        eVar2.copyOnWrite();
        C90491g gVar2 = (C90491g) eVar2.instance;
        str.getClass();
        gVar2.f252886a |= 8192;
        gVar2.f252899n = str;
        boolean z = bVar.f271074f;
        eVar2.copyOnWrite();
        C90491g gVar3 = (C90491g) eVar2.instance;
        gVar3.f252886a |= 65536;
        gVar3.f252902q = z;
        if ((bVar.f271069a & 2) != 0) {
            String str2 = bVar.f271071c;
            eVar2.copyOnWrite();
            C90491g gVar4 = (C90491g) eVar2.instance;
            str2.getClass();
            gVar4.f252886a |= 512;
            gVar4.f252895j = str2;
        }
        if ((bVar.f271069a & 32) != 0) {
            String str3 = bVar.f271075g;
            eVar2.copyOnWrite();
            C90491g gVar5 = (C90491g) eVar2.instance;
            str3.getClass();
            gVar5.f252886a |= 2;
            gVar5.f252888c = str3;
        }
        C97077d dVar = bVar2.f271228a;
        String str4 = bVar.f271070b;
        C90491g gVar6 = (C90491g) eVar2.build();
        C38402f fVar = (C38402f) C38404h.f101652g.createBuilder();
        fVar.copyOnWrite();
        C38404h hVar = (C38404h) fVar.instance;
        str4.getClass();
        hVar.f101654a |= 1;
        hVar.f101655b = str4;
        int i2 = gVar6.f252900o;
        if (i2 == 1) {
            fVar.copyOnWrite();
            C38404h hVar2 = (C38404h) fVar.instance;
            hVar2.f101658e = 1;
            hVar2.f101654a |= 4;
        } else if (i2 != 2) {
            fVar.copyOnWrite();
            C38404h hVar3 = (C38404h) fVar.instance;
            hVar3.f101658e = 0;
            hVar3.f101654a |= 4;
        } else {
            fVar.copyOnWrite();
            C38404h hVar4 = (C38404h) fVar.instance;
            hVar4.f101658e = 2;
            hVar4.f101654a |= 4;
        }
        fVar.mo41412a("ved", gVar6.f252899n);
        if ((gVar6.f252886a & 512) != 0) {
            fVar.mo41412a("ibp", gVar6.f252895j);
        }
        if ((gVar6.f252886a & 2) != 0) {
            fVar.mo41412a("stick", gVar6.f252888c);
        }
        Intent a = dVar.f271264b.mo41411a(new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH"), (C38404h) fVar.build());
        if (a == null) {
            a = null;
        } else {
            a.putExtra("com.google.android.apps.gsa.shared.util.starter.IntentStarter.USE_TRANSITION", 2).putExtra("SKIP_EXIT_ANIMATION", true);
        }
        if (a == null) {
            a = new Intent("com.google.android.googlequicksearchbox.INTERNAL_GOOGLE_SEARCH").setClassName("com.google.android.googlequicksearchbox", e.b()).putExtra("query", str4).putExtra("search-options-proto", C90506n.m147606a(gVar6));
        }
        dVar.f271263a.mo65089a(a);
    }
}
