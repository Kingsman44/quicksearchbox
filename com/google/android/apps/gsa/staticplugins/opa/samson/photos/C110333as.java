package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4715m.p4716a.p4720b.p4721a.C62670ai;
import com.google.p4715m.p4716a.p4720b.p4721a.C62671aj;
import com.google.p4715m.p4716a.p4720b.p4721a.C62672ak;
import com.google.p4715m.p4716a.p4720b.p4721a.C62673al;
import com.google.p4715m.p4716a.p4720b.p4721a.C62682j;
import com.google.p4715m.p4716a.p4720b.p4721a.C62695w;
import com.google.p4715m.p4716a.p4720b.p4721a.C62696x;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.as */
/* compiled from: PG */
public final /* synthetic */ class C110333as implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C110340az f307532a;

    /* renamed from: b */
    public final /* synthetic */ C62682j f307533b;

    /* renamed from: c */
    public final /* synthetic */ Set f307534c;

    public /* synthetic */ C110333as(C110340az azVar, C62682j jVar, Set set) {
        this.f307532a = azVar;
        this.f307533b = jVar;
        this.f307534c = set;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C110340az azVar = this.f307532a;
        C62682j jVar = this.f307533b;
        Set<C110312a> set = this.f307534c;
        C110318ad adVar = (C110318ad) azVar.f307547f.mo27525b();
        ArrayList arrayList = new ArrayList();
        for (C110312a aVar : set) {
            C62695w wVar = (C62695w) C62696x.f169266d.createBuilder();
            String c = aVar.mo98567c();
            wVar.copyOnWrite();
            C62696x xVar = (C62696x) wVar.instance;
            c.getClass();
            xVar.f169268a = 2 | xVar.f169268a;
            xVar.f169270c = c;
            if (aVar.mo98566b().mo56113h()) {
                String str = (String) aVar.mo98566b().mo56107c();
                wVar.copyOnWrite();
                C62696x xVar2 = (C62696x) wVar.instance;
                str.getClass();
                xVar2.f169268a = 1 | xVar2.f169268a;
                xVar2.f169269b = str;
            }
            arrayList.add((C62696x) wVar.build());
        }
        String g = ((C86054o) azVar.f307548g.mo27525b()).mo79673g();
        g.getClass();
        HashMap hashMap = new HashMap();
        C62673al alVar = jVar.f169233a;
        if (alVar == null) {
            alVar = C62673al.f169207b;
        }
        for (C62671aj ajVar : alVar.f169209a) {
            hashMap.put(new C110384n(ajVar.f169203b, ajVar.f169206e), ajVar);
        }
        C110340az.m183738c(hashMap, new C110384n(89, Integer.toString(89)));
        C110340az.m183738c(hashMap, new C110384n(19, Integer.toString(19)));
        C110340az.m183738c(hashMap, new C110384n(1, C110340az.m183737a(1, g)));
        C110384n nVar = new C110384n(2, C110340az.m183737a(2, g));
        C62670ai aiVar = (C62670ai) C62671aj.f169200f.createBuilder();
        int i = nVar.f307651a;
        aiVar.copyOnWrite();
        C62671aj ajVar2 = (C62671aj) aiVar.instance;
        ajVar2.f169202a |= 1;
        ajVar2.f169203b = i;
        String str2 = nVar.f307652b;
        aiVar.copyOnWrite();
        C62671aj ajVar3 = (C62671aj) aiVar.instance;
        ajVar3.f169202a |= 8;
        ajVar3.f169206e = str2;
        aiVar.copyOnWrite();
        C62671aj ajVar4 = (C62671aj) aiVar.instance;
        C62971cq cqVar = ajVar4.f169205d;
        if (!cqVar.mo58948c()) {
            ajVar4.f169205d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) ajVar4.f169205d);
        aiVar.copyOnWrite();
        C62671aj ajVar5 = (C62671aj) aiVar.instance;
        ajVar5.f169202a |= 4;
        ajVar5.f169204c = true;
        hashMap.put(nVar, (C62671aj) aiVar.build());
        C62672ak akVar = (C62672ak) C62673al.f169207b.createBuilder();
        Collection values = hashMap.values();
        akVar.copyOnWrite();
        C62673al alVar2 = (C62673al) akVar.instance;
        C62971cq cqVar2 = alVar2.f169209a;
        if (!cqVar2.mo58948c()) {
            alVar2.f169209a = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) values, (List) alVar2.f169209a);
        C58976aa aaVar = C58975e.f156826a;
        return adVar.f307479f.mo28209i(adVar.f307479f.mo28210j(adVar.mo98570c(), "update settings", new C110391u(adVar, (C62673al) akVar.build())), "parse response", C110392v.f307671a);
    }
}
