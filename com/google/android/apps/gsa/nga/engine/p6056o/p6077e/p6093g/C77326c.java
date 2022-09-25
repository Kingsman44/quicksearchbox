package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.c */
/* compiled from: PG */
public final /* synthetic */ class C77326c implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77333j f213252a;

    /* renamed from: b */
    public final /* synthetic */ C79326x f213253b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f213254c;

    /* renamed from: d */
    public final /* synthetic */ Optional f213255d;

    /* renamed from: e */
    public final /* synthetic */ String f213256e;

    /* renamed from: f */
    public final /* synthetic */ C76590bg f213257f;

    public /* synthetic */ C77326c(C77333j jVar, C79326x xVar, C74965n nVar, Optional optional, String str, C76590bg bgVar) {
        this.f213252a = jVar;
        this.f213253b = xVar;
        this.f213254c = nVar;
        this.f213255d = optional;
        this.f213256e = str;
        this.f213257f = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C77333j jVar = this.f213252a;
        C79326x xVar = this.f213253b;
        C74965n nVar = this.f213254c;
        Optional optional = this.f213255d;
        String str2 = this.f213256e;
        C76590bg bgVar = this.f213257f;
        Optional optional2 = (Optional) obj;
        if (!optional2.isPresent()) {
            xVar.mo73900a("ABORT - Did not return a search on app intent.");
            return C80401n.f220656k;
        }
        Intent intent = (Intent) optional2.get();
        String dataString = intent.getDataString();
        if ((dataString == null || !C77321am.m124094b(dataString)) && ((str = intent.getPackage()) == null || !C77321am.f213245a.contains(str))) {
            intent.setIdentifier(nVar.mo71336k().f227136c);
            Collection.EL.stream(jVar.f213270d).forEach(new C77331h());
            xVar.mo73900a(String.format("Success - Android Intent: %s", new Object[]{"Search-in-app Android intent [" + intent.toUri(1) + "]."}));
            xVar.mo73900a("RETURNING - Generated search in app intent");
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
            if (!optional.isPresent()) {
                lVar.mo74319k(105330);
            }
            String str3 = intent.getPackage();
            if (str3 != null && ((Boolean) jVar.f213268b.a().b(str3, Optional.empty()).map(C77330g.f213264a).orElse(false)).booleanValue()) {
                Optional map = jVar.f213267a.g(str2).map(C77332i.f213265a);
                if (!map.isPresent()) {
                    xVar.mo73900a("Abort - Failure to generate the open app intent.");
                    return C80401n.f220656k;
                }
                C81442m.m129557s(lVar, t.u((Intent) map.get(), 1, nVar.mo71336k(), false, false));
            }
            C81442m.m129557s(lVar, t.u(intent, 1, nVar.mo71336k(), false, false));
            lVar.mo74315g(C77324ap.m124096a(bgVar, str2, jVar.f213269c.a()));
            return (C80401n) lVar.build();
        }
        xVar.mo73900a("ABORT - Sensitive intent");
        return C80401n.f220656k;
    }
}
