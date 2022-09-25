package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.assistant.p3781ad.p3789d.p3790a.C48552e;
import com.google.assistant.p3781ad.p3789d.p3790a.C48553f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.C48687av;
import com.google.assistant.p3781ad.p3789d.p3791b.C48688aw;
import com.google.assistant.p3781ad.p3789d.p3791b.C48695bc;
import com.google.assistant.p3781ad.p3789d.p3791b.C48696bd;
import com.google.assistant.p3781ad.p3789d.p3791b.C48701bi;
import com.google.assistant.p3781ad.p3789d.p3791b.C48702bj;
import com.google.assistant.p3781ad.p3789d.p3791b.C48705bm;
import com.google.assistant.p3781ad.p3789d.p3791b.C48706bn;
import com.google.assistant.p3781ad.p3789d.p3791b.C48707bo;
import com.google.assistant.p3781ad.p3789d.p3791b.C48708bp;
import com.google.assistant.p3781ad.p3789d.p3791b.C48709bq;
import com.google.assistant.p3781ad.p3789d.p3791b.C48710br;
import com.google.assistant.p3781ad.p3789d.p3791b.C48711bs;
import com.google.assistant.p3781ad.p3789d.p3791b.C48712bt;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C121313a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C121314b f336897a;

    /* renamed from: b */
    public final /* synthetic */ int f336898b;

    public /* synthetic */ C121313a(C121314b bVar, int i) {
        this.f336897a = bVar;
        this.f336898b = i;
    }

    public final Object apply(Object obj) {
        C121314b bVar = this.f336897a;
        int i = this.f336898b;
        SearchResults searchResults = (SearchResults) obj;
        C121324l lVar = bVar.f336900a;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        C58480gp e = C58485gu.m89837e();
        C142797am amVar = new C142797am(searchResults);
        while (amVar.hasNext()) {
            C142796al a = amVar.next();
            String h = a.mo117712h("text1");
            Optional flatMap = Optional.ofNullable(a.mo117714j()).flatMap(C121318f.f336907a).flatMap(C121319g.f336908a);
            if (flatMap.isEmpty()) {
                ((C58970a) ((C58970a) C121324l.f336913a.mo56226d()).mo56372aa(35769)).mo56386p("No icon image found.");
            }
            String str = (String) flatMap.map(new C121320h(lVar)).orElse(null);
            String str2 = (String) Optional.ofNullable(a.mo117712h("intent_data")).orElse(null);
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C48707bo boVar = (C48707bo) C48708bp.f126010g.createBuilder();
                C48672ag agVar = C48672ag.ICING;
                boVar.copyOnWrite();
                C48708bp bpVar = (C48708bp) boVar.instance;
                bpVar.f126013b = agVar.f125915O;
                bpVar.f126012a |= 1;
                C48709bq bqVar = (C48709bq) C48710br.f126019d.createBuilder();
                bqVar.mo53171a(h);
                C48710br brVar = (C48710br) bqVar.build();
                boVar.copyOnWrite();
                C48708bp bpVar2 = (C48708bp) boVar.instance;
                brVar.getClass();
                bpVar2.f126014c = brVar;
                bpVar2.f126012a |= 2;
                C48711bs bsVar = (C48711bs) C48712bt.f126024f.createBuilder();
                bsVar.copyOnWrite();
                C48712bt btVar = (C48712bt) bsVar.instance;
                btVar.f126026a |= 16;
                btVar.f126030e = true;
                double a2 = a.mo117705a();
                bsVar.copyOnWrite();
                C48712bt btVar2 = (C48712bt) bsVar.instance;
                btVar2.f126026a |= 1;
                btVar2.f126027b = a2;
                C48712bt btVar3 = (C48712bt) bsVar.build();
                boVar.copyOnWrite();
                C48708bp bpVar3 = (C48708bp) boVar.instance;
                btVar3.getClass();
                bpVar3.f126015d = btVar3;
                bpVar3.f126012a |= 4;
                String host = Uri.parse(str).getHost();
                if (host != null) {
                    C48695bc bcVar = (C48695bc) C48696bd.f125977e.createBuilder();
                    C48687av avVar = (C48687av) C48688aw.f125962c.createBuilder();
                    avVar.copyOnWrite();
                    C48688aw awVar = (C48688aw) avVar.instance;
                    str2.getClass();
                    awVar.f125964a |= 1;
                    awVar.f125965b = str2;
                    C48688aw awVar2 = (C48688aw) avVar.build();
                    bcVar.copyOnWrite();
                    C48696bd bdVar = (C48696bd) bcVar.instance;
                    awVar2.getClass();
                    bdVar.f125980b = awVar2;
                    bdVar.f125979a |= 1;
                    C48696bd bdVar2 = (C48696bd) bcVar.build();
                    boVar.copyOnWrite();
                    C48708bp bpVar4 = (C48708bp) boVar.instance;
                    bdVar2.getClass();
                    bpVar4.f126017f = bdVar2;
                    bpVar4.f126012a |= 16;
                    C48705bm bmVar = (C48705bm) C48706bn.f126002f.createBuilder();
                    C48701bi biVar = (C48701bi) C48702bj.f125992e.createBuilder();
                    biVar.copyOnWrite();
                    C48702bj bjVar = (C48702bj) biVar.instance;
                    h.getClass();
                    bjVar.f125994a |= 1;
                    bjVar.f125995b = h;
                    biVar.copyOnWrite();
                    C48702bj bjVar2 = (C48702bj) biVar.instance;
                    bjVar2.f125994a |= 2;
                    bjVar2.f125996c = host;
                    C48552e eVar = (C48552e) C48553f.f125431e.createBuilder();
                    eVar.copyOnWrite();
                    C48553f fVar = (C48553f) eVar.instance;
                    fVar.f125436d = 1;
                    fVar.f125433a |= 4;
                    eVar.copyOnWrite();
                    C48553f fVar2 = (C48553f) eVar.instance;
                    str.getClass();
                    fVar2.f125434b = 1;
                    fVar2.f125435c = str;
                    C48553f fVar3 = (C48553f) eVar.build();
                    biVar.copyOnWrite();
                    C48702bj bjVar3 = (C48702bj) biVar.instance;
                    fVar3.getClass();
                    bjVar3.f125997d = fVar3;
                    bjVar3.f125994a |= 4;
                    C48702bj bjVar4 = (C48702bj) biVar.build();
                    bmVar.copyOnWrite();
                    C48706bn bnVar = (C48706bn) bmVar.instance;
                    bjVar4.getClass();
                    bnVar.f126005b = bjVar4;
                    bnVar.f126004a |= 1;
                    C48706bn bnVar2 = (C48706bn) bmVar.build();
                    boVar.copyOnWrite();
                    C48708bp bpVar5 = (C48708bp) boVar.instance;
                    bnVar2.getClass();
                    bpVar5.f126016e = bnVar2;
                    bpVar5.f126012a |= 8;
                    e.mo55395g((C48708bp) boVar.build());
                    i--;
                    if (i <= 0) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return e.mo55394f();
    }
}
