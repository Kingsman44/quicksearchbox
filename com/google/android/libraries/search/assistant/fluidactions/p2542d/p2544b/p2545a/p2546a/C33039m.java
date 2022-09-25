package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33140a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33142c;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52617yj;
import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52627yt;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.C52633yz;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.m */
/* compiled from: PG */
public final /* synthetic */ class C33039m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C33046t f88475a;

    /* renamed from: b */
    public final /* synthetic */ C33140a f88476b;

    /* renamed from: c */
    public final /* synthetic */ List f88477c;

    public /* synthetic */ C33039m(C33046t tVar, C33140a aVar, List list) {
        this.f88475a = tVar;
        this.f88476b = aVar;
        this.f88477c = list;
    }

    public final C60870cx apply(Object obj) {
        C33046t tVar = this.f88475a;
        C33140a aVar = this.f88476b;
        List list = this.f88477c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            C33144e eVar = tVar.f88490b;
            eVar.getClass();
            eVar.mo38548a(11);
            return C60856cj.m92900i(Optional.empty());
        }
        String str = (String) optional.get();
        if (str != null) {
            C33142c cVar = (C33142c) aVar;
            cVar.f88677d = str;
            C58976aa aaVar = C58975e.f156826a;
            if (list.isEmpty()) {
                C59104x c = C33046t.f88489a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ContactLookupFeatureClientOpResultProcessor");
                ((C59052c) ((C59052c) c).mo56372aa(50716)).mo56386p("targetPersonData is not present, this should not happen");
                return C60856cj.m92900i(Optional.empty());
            }
            C52623yp ypVar = (C52623yp) list.get(0);
            ArrayList arrayList = new ArrayList();
            int i = tVar.f88491c;
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    for (C52619yl ylVar : (List) Collection.EL.stream(ypVar.f138168e).filter(new C33045s(str)).collect(C58370cn.f155946a)) {
                        arrayList.add(ylVar.f138152b);
                    }
                } else if (i2 == 1) {
                    for (C52629yv yvVar : (List) Collection.EL.stream(ypVar.f138169f).filter(new C33044r(str)).collect(C58370cn.f155946a)) {
                        arrayList.add(yvVar.f138184c);
                    }
                } else if (i2 == 5) {
                    C52627yt ytVar = ypVar.f138165b;
                    if (ytVar == null) {
                        ytVar = C52627yt.f138176c;
                    }
                    for (C52617yj yjVar : ytVar.f138179b) {
                        for (C52633yz yzVar : yjVar.f138148a) {
                            if (str.equals(yzVar.f138195b)) {
                                C52613yf yfVar = yzVar.f138197d;
                                if (yfVar == null) {
                                    yfVar = C52613yf.f138138f;
                                }
                                arrayList.add(yfVar.f138141b);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return C60856cj.m92900i(Optional.empty());
                }
                aVar.mo38539a();
                if (cVar.f88676c != null) {
                    return C60856cj.m92900i(Optional.empty());
                }
                throw new IllegalStateException("Property \"resolvedProvider\" has not been set");
            }
            throw null;
        }
        throw new NullPointerException("Null resolvedInstanceLabel");
    }
}
