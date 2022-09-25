package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9210j.p9216e;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121238c;
import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121244h;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9208i.p9209a.C121375a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.j.e.b */
/* compiled from: PG */
public final /* synthetic */ class C121401b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Map f337045a;

    /* renamed from: b */
    public final /* synthetic */ C121375a f337046b;

    public /* synthetic */ C121401b(Map map, C121375a aVar) {
        this.f337045a = map;
        this.f337046b = aVar;
    }

    public final Object call() {
        C121238c cVar;
        Map map = this.f337045a;
        C121375a aVar = this.f337046b;
        C121220ae aeVar = (C121220ae) map.get(C48714bv.APP_ACTIONS_SIGNAL);
        if (aeVar == null || aeVar.f336744b != 3) {
            C58976aa aaVar = C58975e.f156826a;
            return new ArrayList();
        }
        C121220ae aeVar2 = (C121220ae) map.get(C48714bv.APP_INFO_SIGNAL);
        if (aeVar2 == null || aeVar2.f336744b != 6) {
            C58976aa aaVar2 = C58975e.f156826a;
            return new ArrayList();
        }
        Map unmodifiableMap = Collections.unmodifiableMap(((C121244h) aeVar2.f336745c).f336792a);
        if (aeVar.f336744b == 3) {
            cVar = (C121238c) aeVar.f336745c;
        } else {
            cVar = C121238c.f336777b;
        }
        C58485gu a = aVar.mo105117a(unmodifiableMap, Collections.unmodifiableMap(cVar.f336779a));
        C58976aa aaVar3 = C58975e.f156826a;
        a.size();
        return a;
    }
}
