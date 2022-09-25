package com.google.android.libraries.social.populous.p3296e.p3297a;

import com.google.android.libraries.social.populous.core.C42331dc;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42404aa;
import com.google.android.libraries.social.populous.storage.C42689j;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.social.populous.e.a.k */
/* compiled from: PG */
public final /* synthetic */ class C42396k implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C42396k f111184a = new C42396k();

    private /* synthetic */ C42396k() {
    }

    public final C60870cx apply(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C42689j jVar = (C42689j) guVar.get(i);
            if (jVar != null) {
                C42404aa aaVar = new C42404aa();
                aaVar.mo45398e(jVar.f111907b);
                aaVar.f111220c.add(C42331dc.PAPI_LIST_PEOPLE_BY_KNOWN_ID);
                String str = jVar.f111906a;
                C58838bb.m90884s(aaVar.f111219b == null, "Cannot set a contextual candidate ID on a CustomResult.");
                aaVar.f111221d = str;
                e.mo55395g(aaVar.mo45394a());
            }
        }
        return C60856cj.m92900i(e.mo55394f());
    }
}
