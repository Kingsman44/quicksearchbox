package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6176b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.education.C75749d;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80577k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80665au;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80716cr;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80864j;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80865k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.b.g */
/* compiled from: PG */
public final /* synthetic */ class C78345g implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C78345g f215693a = new C78345g();

    private /* synthetic */ C78345g() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional = (Optional) obj;
        C58528ij ijVar = C78347i.f215695a;
        if (!optional.isPresent()) {
            return Optional.empty();
        }
        C75749d dVar = (C75749d) optional.get();
        dVar.mo71848i();
        dVar.mo71845g();
        C58976aa aaVar = C58975e.f156826a;
        C80716cr p = C80722cx.m128539p();
        p.mo74483g(dVar.mo71850k());
        p.mo74482f(dVar.mo71849j());
        p.mo74485i(dVar.mo71840c());
        p.mo74484h(dVar.mo71851l());
        ((C80665au) p).f221455e = dVar.mo71839b();
        p.mo74481e(dVar.mo71848i());
        p.mo74488l(dVar.mo71845g());
        p.mo74480d(dVar.mo71841d());
        String h = dVar.mo71846h();
        e a = dVar.mo71838a();
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80864j jVar = (C80864j) C80865k.f221810c.createBuilder();
        C80577k kVar = (C80577k) C80578l.f221173g.createBuilder();
        kVar.copyOnWrite();
        C80578l lVar = (C80578l) kVar.instance;
        h.getClass();
        lVar.f221175a = 2;
        lVar.f221176b = h;
        jVar.copyOnWrite();
        C80578l lVar2 = (C80578l) kVar.build();
        lVar2.getClass();
        ((C80865k) jVar.instance).f221812a = lVar2;
        int i = a.ca;
        jVar.copyOnWrite();
        ((C80865k) jVar.instance).f221813b = i;
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        C80865k kVar2 = (C80865k) jVar.build();
        kVar2.getClass();
        ajVar.f221754b = kVar2;
        ajVar.f221753a = 2;
        p.mo74479c((C80831aj) eVar.build());
        p.mo74489m(dVar.mo71844f());
        return Optional.m71637of(p.mo74477a());
    }
}
