package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.smartspace.C92033ac;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50738bc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.at */
/* compiled from: PG */
public final /* synthetic */ class C110748at implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308568a;

    /* renamed from: b */
    public final /* synthetic */ C92113i[] f308569b;

    public /* synthetic */ C110748at(C110764bi biVar, C92113i[] iVarArr) {
        this.f308568a = biVar;
        this.f308569b = iVarArr;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        C110764bi biVar = this.f308568a;
        C92113i[] iVarArr = this.f308569b;
        List list = (List) obj;
        boolean z = true;
        List<C83802r> list2 = list.get(1) != null ? (List) list.get(1) : null;
        if (list2 != null) {
            for (C83802r rVar : list2) {
                if (rVar.mo77094d().mo56113h()) {
                    C50738bc bcVar = (C50738bc) rVar.mo77094d().mo56107c();
                    C58970a aVar = (C58970a) ((C58970a) biVar.f308623n.mo56224b()).mo56372aa(26762);
                    String str = bcVar.f132037d;
                    C50701am a = C50701am.m85887a(bcVar.f132040g);
                    if (a == null) {
                        a = C50701am.UNKNOWN;
                    }
                    aVar.mo56359L("sending chip: %s, %s, %s", str, a.name(), bcVar.f132038e);
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        C58833ax j = C58833ax.m90833j(list2);
        biVar.mo98883u(iVarArr);
        if (j.mo56113h()) {
            biVar.f308624o.clear();
            biVar.f308624o.addAll((List) j.mo56107c());
        }
        ArrayList arrayList = new ArrayList();
        if (!j.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            List list3 = (List) j.mo56107c();
            if (list3.isEmpty()) {
                axVar = C58836b.f156633a;
            } else {
                C83802r rVar2 = (C83802r) Collection.EL.stream(list3).filter(C110752ax.f308576a).findFirst().orElse(null);
                C83802r rVar3 = (C83802r) Collection.EL.stream(list3).filter(C110758bc.f308585a).findFirst().orElse(null);
                if (rVar2 != null && rVar3 != null) {
                    axVar = C58833ax.m90834k(C58485gu.m89847o(rVar3, rVar2));
                } else if (rVar2 != null) {
                    axVar = C58833ax.m90834k(C58485gu.m89846n(rVar2));
                } else if (rVar3 != null) {
                    axVar = C58833ax.m90834k(C58485gu.m89846n(rVar3));
                } else {
                    C59104x c = C110764bi.f308595a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ProactiveServiceManager");
                    ((C59052c) ((C59052c) c).mo56372aa(26749)).mo56386p("wtf both situational & contextchip are absent.");
                    axVar = C58836b.f156633a;
                }
            }
        }
        for (C92033ac a2 : biVar.f308611b) {
            arrayList.add(a2.mo86686a(iVarArr, axVar));
        }
        if (axVar.mo56113h() && biVar.f308627r.mo79746e(C90017bw.f247864F)) {
            if (!biVar.f308616g.u() || !biVar.f308616g.w()) {
                z = false;
            }
            biVar.f308619j.mo86701f((List) axVar.mo56107c(), z, biVar.f308618i.mo86684a());
        }
        return C118826c.m197212b(arrayList);
    }
}
