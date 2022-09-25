package com.google.android.apps.gsa.staticplugins.p7327ac;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.b */
/* compiled from: PG */
public final /* synthetic */ class C92695b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f258735a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f258736b;

    public /* synthetic */ C92695b(C60870cx cxVar, C60870cx cxVar2) {
        this.f258735a = cxVar;
        this.f258736b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f258735a;
        C60870cx cxVar2 = this.f258736b;
        C59071e eVar = C92701h.f258742a;
        C6625b bVar = (C6625b) C6636m.f19775aC.createBuilder();
        Map map = (Map) C60856cj.m92909r(cxVar);
        bVar.copyOnWrite();
        C6636m mVar = (C6636m) bVar.instance;
        C62995dn dnVar = mVar.f19819an;
        if (!dnVar.f170058b) {
            mVar.f19819an = dnVar.mo58980a();
        }
        mVar.f19819an.putAll(map);
        C58976aa aaVar = C58975e.f156826a;
        Collections.unmodifiableMap(Collections.unmodifiableMap(((C6636m) bVar.instance).f19819an));
        Map map2 = (Map) C60856cj.m92909r(cxVar2);
        bVar.copyOnWrite();
        C6636m mVar2 = (C6636m) bVar.instance;
        C62995dn dnVar2 = mVar2.f19820ao;
        if (!dnVar2.f170058b) {
            mVar2.f19820ao = dnVar2.mo58980a();
        }
        mVar2.f19820ao.putAll(map2);
        Collections.unmodifiableMap(Collections.unmodifiableMap(((C6636m) bVar.instance).f19820ao));
        return (C6636m) bVar.build();
    }
}
