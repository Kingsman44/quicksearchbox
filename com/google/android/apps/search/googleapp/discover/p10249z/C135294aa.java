package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10184f.C134258i;
import com.google.android.apps.search.googleapp.discover.p10195j.p10197b.C134429a;
import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134550ao;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10238u.C135032df;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.z.aa */
/* compiled from: PG */
public final class C135294aa {

    /* renamed from: a */
    public final C135200t f368536a;

    /* renamed from: b */
    public final C135032df f368537b;

    /* renamed from: c */
    public final C134258i f368538c;

    /* renamed from: d */
    public final C69585o f368539d;

    /* renamed from: e */
    public final C39143kr f368540e;

    /* renamed from: f */
    private final C134429a f368541f;

    public C135294aa(C135200t tVar, C135032df dfVar, C134258i iVar, C39143kr krVar, C69585o oVar, C134429a aVar) {
        C69664n.m101061g(krVar, "clientStreamz");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(aVar, "xUiKitPrefetcher");
        this.f368536a = tVar;
        this.f368537b = dfVar;
        this.f368538c = iVar;
        this.f368540e = krVar;
        this.f368539d = oVar;
        this.f368541f = aVar;
    }

    /* renamed from: a */
    public final void mo112244a(List list) {
        C134550ao aoVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C134560ay ayVar = ((C134538ac) it.next()).f366380c;
            if (ayVar == null) {
                ayVar = C134560ay.f366453g;
            }
            if (ayVar.f366456b == 19) {
                aoVar = (C134550ao) ayVar.f366457c;
            } else {
                aoVar = C134550ao.f366417b;
            }
            C62971cq cqVar = aoVar.f366419a;
            C69664n.m101060f(cqVar, "it.streamContent.element…chResources.resourcesList");
            C69540x.m100811r(arrayList, cqVar);
        }
        this.f368541f.mo111779a(arrayList);
    }
}
