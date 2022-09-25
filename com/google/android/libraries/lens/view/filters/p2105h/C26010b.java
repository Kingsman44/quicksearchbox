package com.google.android.libraries.lens.view.filters.p2105h;

import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25985i;
import com.google.android.libraries.lens.view.p2154p.p2156b.C27543c;
import com.google.common.base.C58833ax;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56258bl;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56264br;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56274ca;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56275cb;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;

/* renamed from: com.google.android.libraries.lens.view.filters.h.b */
/* compiled from: PG */
public final class C26010b implements C25985i {

    /* renamed from: a */
    private final C27543c f70674a;

    public C26010b(C25989d dVar, C27543c cVar) {
        this.f70674a = cVar;
        cVar.mo33104g(new C26009a(dVar), false);
    }

    /* renamed from: a */
    public final C56278ce mo31042a() {
        C56274ca caVar = (C56274ca) C56275cb.f149977c.createBuilder();
        C58833ax d = this.f70674a.mo33101d();
        if (d.mo56113h()) {
            C56264br brVar = (C56264br) d.mo56107c();
            caVar.copyOnWrite();
            C56275cb cbVar = (C56275cb) caVar.instance;
            brVar.getClass();
            cbVar.f149980b = brVar;
            cbVar.f149979a |= 1;
        }
        C56258bl blVar = (C56258bl) C56278ce.f149986e.createBuilder();
        C56306df dfVar = C56306df.TEXT;
        blVar.copyOnWrite();
        C56278ce ceVar = (C56278ce) blVar.instance;
        ceVar.f149991d = dfVar.f150068m;
        ceVar.f149988a |= 1;
        blVar.copyOnWrite();
        C56278ce ceVar2 = (C56278ce) blVar.instance;
        C56275cb cbVar2 = (C56275cb) caVar.build();
        cbVar2.getClass();
        ceVar2.f149990c = cbVar2;
        ceVar2.f149989b = 6;
        return (C56278ce) blVar.build();
    }
}
