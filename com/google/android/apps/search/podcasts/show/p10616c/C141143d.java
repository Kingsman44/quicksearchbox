package com.google.android.apps.search.podcasts.show.p10616c;

import android.text.TextUtils;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.android.apps.search.podcasts.show.p10615b.C141135b;
import com.google.android.apps.search.podcasts.show.p10615b.C141136c;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69644aa;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.show.c.d */
/* compiled from: PG */
final class C141143d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C60870cx f383200a;

    /* renamed from: b */
    final /* synthetic */ C141150k f383201b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f383202c;

    /* renamed from: d */
    final /* synthetic */ String f383203d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f383204e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C141143d(C60870cx cxVar, C141150k kVar, C69644aa aaVar, String str, C60870cx cxVar2) {
        super(1);
        this.f383200a = cxVar;
        this.f383201b = kVar;
        this.f383202c = aaVar;
        this.f383203d = str;
        this.f383204e = cxVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Object obj2;
        C140646b bVar = (C140646b) obj;
        C69664n.m101061g(bVar, "show");
        Object r = C60856cj.m92909r(this.f383200a);
        C69664n.m101060f(r, "getDone(episodeListFuture)");
        List<C140641b> list = (List) r;
        if (bVar.f382007m) {
            C141150k kVar = this.f383201b;
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj2 = null;
            } else {
                obj2 = it.next();
                if (it.hasNext()) {
                    long j = ((C140641b) obj2).f381980g;
                    while (true) {
                        Object next = it.next();
                        long j2 = ((C140641b) next).f381980g;
                        long j3 = j < j2 ? j2 : j;
                        if (j < j2) {
                            obj2 = next;
                        }
                        if (!it.hasNext()) {
                            break;
                        }
                        j = j3;
                    }
                }
            }
            C140641b bVar2 = (C140641b) obj2;
            if (bVar2 != null) {
                kVar.f383224d.mo115477h(bVar2);
            }
            this.f383202c.f186023a = false;
        } else if (this.f383202c.f186023a && !TextUtils.isEmpty(this.f383203d)) {
            C141150k kVar2 = this.f383201b;
            kVar2.f383227g.mo50787a(kVar2.f383224d.mo115471b(bVar), C140192a.f380885a);
        }
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C140641b bVar3 : list) {
            arrayList.add(new C141135b(bVar3));
        }
        int size = arrayList.size();
        Object r2 = C60856cj.m92909r(this.f383204e);
        C69664n.m101060f(r2, "getDone(sortPreferencesFuture)");
        C140952k kVar3 = new C140952k(C69540x.m100831M(C69540x.m100944b(new C141136c(bVar, size, (C140651c) r2, !TextUtils.isEmpty(this.f383203d))), arrayList), (Integer) null);
        return this.f383201b.mo116183a(C46688af.m83205b(new C141141b(C140993o.AVAILABLE, kVar3), 0), C46688af.m83206c(new C141141b(C140993o.AVAILABLE, kVar3)));
    }
}
