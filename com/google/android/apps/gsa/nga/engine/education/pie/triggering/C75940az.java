package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75907h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76401e;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80187ah;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80792fm;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.az */
/* compiled from: PG */
public final /* synthetic */ class C75940az implements C75907h {

    /* renamed from: a */
    public final /* synthetic */ C75942ba f210693a;

    public /* synthetic */ C75940az(C75942ba baVar) {
        this.f210693a = baVar;
    }

    /* renamed from: c */
    public final void mo71955c(C76401e eVar) {
        C75942ba baVar = this.f210693a;
        if (baVar.mo71972f()) {
            ((e) eVar.mo72147b().mo71338m().orElse(e.a)).name();
            if (baVar.f210698c) {
                Optional optional = (Optional) baVar.f210700e.get();
                Optional optional2 = (Optional) baVar.f210699d.get();
                if (!optional.isEmpty()) {
                    String q = eVar.mo72187e().mo71163q();
                    String str = ((C80792fm) optional.get()).f221699b;
                    Optional optional3 = (Optional) baVar.f210701f.get();
                    if (baVar.mo71973g(str, q)) {
                        baVar.mo71971e((C80187ah) optional3.orElse(C80187ah.f220007e), Optional.m71637of(str), Optional.m71637of(q));
                    } else {
                        baVar.f210697b.mo71933e();
                    }
                } else if (!optional2.isEmpty()) {
                    C58528ij ijVar = (C58528ij) Collection.EL.stream(C89988b.m146551d(baVar.f210696a.mo85403h(C90037cp.f248552ca))).map(C75938ax.f210691a).collect(C58370cn.f155947b);
                    if (((e) eVar.mo72147b().mo71338m().orElse(e.a)).equals(e.bb) || ijVar.isEmpty() || ((Boolean) ((C80722cx) optional2.get()).mo74498h().map(new C75939ay(ijVar)).orElse(true)).booleanValue()) {
                        String q2 = eVar.mo72187e().mo71163q();
                        String k = ((C80722cx) optional2.get()).mo74502k();
                        Optional optional4 = (Optional) baVar.f210701f.get();
                        if (baVar.mo71973g(k, q2)) {
                            baVar.mo71971e((C80187ah) optional4.orElse(C80187ah.f220007e), Optional.m71637of(k), Optional.m71637of(q2));
                        } else {
                            baVar.f210697b.mo71933e();
                        }
                    }
                }
            }
        }
    }
}
