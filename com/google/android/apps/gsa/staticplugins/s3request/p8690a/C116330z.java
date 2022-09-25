package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.C85968dn;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58800sl;
import com.google.p4500cm.p4514b.C58171e;
import com.google.p4500cm.p4514b.C58172f;
import com.google.p4500cm.p4514b.C58173g;
import com.google.p4500cm.p4514b.C58174h;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66683q;
import com.google.speech.p5208h.C66684r;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.z */
/* compiled from: PG */
public final /* synthetic */ class C116330z implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C85929cw f322509a;

    /* renamed from: b */
    public final /* synthetic */ Query f322510b;

    public /* synthetic */ C116330z(C85929cw cwVar, Query query) {
        this.f322509a = cwVar;
        this.f322510b = query;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C85929cw cwVar = this.f322509a;
        Query query = this.f322510b;
        UriRequest b = cwVar.mo79567g(query, 1).mo79626b((C85966dl) null);
        C66683q qVar = (C66683q) C66684r.f181405c.createBuilder();
        C58800sl lA = b.mo81502a().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            C58173g gVar = (C58173g) C58174h.f155525d.createBuilder();
            String str = (String) entry.getKey();
            gVar.copyOnWrite();
            C58174h hVar = (C58174h) gVar.instance;
            str.getClass();
            hVar.f155527a |= 1;
            hVar.f155528b = str;
            String str2 = (String) entry.getValue();
            gVar.copyOnWrite();
            C58174h hVar2 = (C58174h) gVar.instance;
            str2.getClass();
            hVar2.f155527a |= 2;
            hVar2.f155529c = str2;
            qVar.copyOnWrite();
            C66684r rVar = (C66684r) qVar.instance;
            C58174h hVar3 = (C58174h) gVar.build();
            hVar3.getClass();
            C62971cq cqVar = rVar.f181408a;
            if (!cqVar.mo58948c()) {
                rVar.f181408a = C62942bv.mutableCopy(cqVar);
            }
            rVar.f181408a.add(hVar3);
        }
        Map b2 = C85968dn.m137828b(b.f236331a);
        b2.putAll(query.f252755M);
        if (query.mo84399cf()) {
            b2.put("cwopa", "1");
        }
        for (Map.Entry entry2 : b2.entrySet()) {
            C58171e eVar = (C58171e) C58172f.f155520d.createBuilder();
            String str3 = (String) entry2.getKey();
            eVar.copyOnWrite();
            C58172f fVar = (C58172f) eVar.instance;
            str3.getClass();
            fVar.f155522a |= 1;
            fVar.f155523b = str3;
            String str4 = (String) entry2.getValue();
            eVar.copyOnWrite();
            C58172f fVar2 = (C58172f) eVar.instance;
            str4.getClass();
            fVar2.f155522a |= 2;
            fVar2.f155524c = str4;
            qVar.copyOnWrite();
            C66684r rVar2 = (C66684r) qVar.instance;
            C58172f fVar3 = (C58172f) eVar.build();
            fVar3.getClass();
            C62971cq cqVar2 = rVar2.f181409b;
            if (!cqVar2.mo58948c()) {
                rVar2.f181409b = C62942bv.mutableCopy(cqVar2);
            }
            rVar2.f181409b.add(fVar3);
        }
        return C58833ax.m90834k((C66684r) qVar.build());
    }
}
