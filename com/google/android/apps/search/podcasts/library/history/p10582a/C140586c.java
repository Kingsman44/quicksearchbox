package com.google.android.apps.search.podcasts.library.history.p10582a;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.android.apps.search.podcasts.p10576l.C140450al;
import com.google.android.apps.search.podcasts.p10576l.C140452an;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140984e;
import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.library.history.a.c */
/* compiled from: PG */
final class C140586c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140589f f381811a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f381812b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140586c(C140589f fVar, C60870cx cxVar) {
        super(1);
        this.f381811a = fVar;
        this.f381812b = cxVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List<C140641b> list = (List) obj;
        C69664n.m101061g(list, "episodes");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list, 10));
        for (C140641b bVar : list) {
            C97925o oVar = C140984e.f382770a;
            arrayList.add(new C140567b(bVar, C140984e.f382773d, false, 12));
        }
        C140952k kVar = new C140952k(arrayList, (Integer) null);
        boolean z = true;
        if (this.f381811a.f381819e.compareAndSet(false, true)) {
            C140589f fVar = this.f381811a;
            fVar.f381817c.mo50787a(fVar.f381815a.mo115432a(), C140192a.f380885a);
        }
        C140450al alVar = (C140450al) C60856cj.m92909r(this.f381812b);
        if (alVar != null) {
            C140452an anVar = alVar.f381526l;
            if (anVar == null) {
                anVar = C140452an.f381530b;
            }
            if (anVar != null) {
                z = anVar.f381532a;
            }
        }
        return C46688af.m83205b(new C140584a(kVar, z), 0);
    }
}
