package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80099an;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80158cg;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6419z.C83378a;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.at */
/* compiled from: PG */
public final class C103671at implements C103651a {

    /* renamed from: a */
    private static final C59071e f288764a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nga.r.c.at");

    /* renamed from: b */
    private final C31167ax f288765b;

    public C103671at(C31167ax axVar) {
        this.f288765b = axVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        C59071e eVar = f288764a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21634)).mo56386p("#handleRequest.");
        if (bnVar.f219917a == 34) {
            if (C83378a.f227246a.f84029a.equals(((C80099an) bnVar.f219918b).f219805b)) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(21636)).mo56386p("Sending idle memory metrics to Primes.");
                this.f288765b.mo36917i(C83378a.f227246a);
                C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
                C80158cg cgVar = C80158cg.f219960a;
                buVar.copyOnWrite();
                C80275dd ddVar = (C80275dd) buVar.instance;
                cgVar.getClass();
                ddVar.f220291b = cgVar;
                ddVar.f220290a = 21;
                return C60856cj.m92900i((C80275dd) buVar.build());
            }
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(21635)).mo56386p("Unknown custom event name.");
            return C60856cj.m92900i(C80275dd.f220288c);
        }
        ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(21637)).mo56386p("Invalid request. Return empty.");
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
