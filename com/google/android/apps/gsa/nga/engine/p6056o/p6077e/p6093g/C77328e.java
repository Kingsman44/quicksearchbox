package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.understanding.teleport.C79326x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.e */
/* compiled from: PG */
public final /* synthetic */ class C77328e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77333j f213260a;

    /* renamed from: b */
    public final /* synthetic */ C79326x f213261b;

    /* renamed from: c */
    public final /* synthetic */ C74965n f213262c;

    /* renamed from: d */
    public final /* synthetic */ C76590bg f213263d;

    public /* synthetic */ C77328e(C77333j jVar, C79326x xVar, C74965n nVar, C76590bg bgVar) {
        this.f213260a = jVar;
        this.f213261b = xVar;
        this.f213262c = nVar;
        this.f213263d = bgVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77333j jVar = this.f213260a;
        C79326x xVar = this.f213261b;
        C74965n nVar = this.f213262c;
        C76590bg bgVar = this.f213263d;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            xVar.mo73900a("ABORT - Did not return a translate intent.");
            return C80401n.f220656k;
        }
        Intent intent = (Intent) optional.get();
        intent.setIdentifier(nVar.mo71336k().f227136c);
        Collection.EL.stream(jVar.f213270d).forEach(new C77329f());
        xVar.mo73900a(String.format("Success - Android Intent: %s", new Object[]{"Search-in-app Android intent (for translate) [" + intent.toUri(1) + "]."}));
        xVar.mo73900a("RETURNING - Generated search in app (for translate) intent");
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.copyOnWrite();
        ((C80401n) lVar.instance).f220664g = C80403p.m128150a(5);
        lVar.mo74319k(true != ((Boolean) bgVar.mo72265g(C76575as.f211814a, "isAssistedBrowse").orElse(false)).booleanValue() ? 77913 : 76548);
        C81442m.m129557s(lVar, t.u(intent, 1, nVar.mo71336k(), false, false));
        return (C80401n) lVar.build();
    }
}
