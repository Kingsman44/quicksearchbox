package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33140a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33142c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C33038l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33046t f88471a;

    /* renamed from: b */
    public final /* synthetic */ C33140a f88472b;

    /* renamed from: c */
    public final /* synthetic */ List f88473c;

    /* renamed from: d */
    public final /* synthetic */ List f88474d;

    public /* synthetic */ C33038l(C33046t tVar, C33140a aVar, List list, List list2) {
        this.f88471a = tVar;
        this.f88472b = aVar;
        this.f88473c = list;
        this.f88474d = list2;
    }

    public final C60870cx apply(Object obj) {
        C33046t tVar = this.f88471a;
        C33140a aVar = this.f88472b;
        List list = this.f88473c;
        List list2 = this.f88474d;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C33144e eVar = tVar.f88490b;
            eVar.getClass();
            eVar.mo38548a(10);
            return C60856cj.m92900i(Optional.empty());
        }
        String str = (String) optional.get();
        if (str != null) {
            ((C33142c) aVar).f88676c = str;
            C58976aa aaVar = C58975e.f156826a;
            C52623yp ypVar = (C52623yp) ((List) Collection.EL.stream(list).filter(new C33041o(aVar)).collect(C58370cn.f155946a)).get(0);
            list2.add(ypVar);
            ArrayList arrayList = new ArrayList();
            int i = tVar.f88491c;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    for (C52619yl ylVar : ypVar.f138168e) {
                        if ((ylVar.f138151a & 4) != 0) {
                            arrayList.add(ylVar.f138153c);
                        }
                    }
                } else if (i2 == 1) {
                    for (C52629yv yvVar : ypVar.f138169f) {
                        if ((yvVar.f138182a & 4) != 0) {
                            arrayList.add(yvVar.f138185d);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return C60856cj.m92900i(Optional.empty());
                }
                aVar.mo38539a();
                return C60856cj.m92900i(Optional.empty());
            }
            throw null;
        }
        throw new NullPointerException("Null resolvedProvider");
    }
}
