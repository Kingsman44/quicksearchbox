package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.am */
/* compiled from: PG */
final class C140664am extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140651c f382041a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140664am(C140651c cVar) {
        super(1);
        this.f382041a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "episodeItemList");
        if (this.f382041a.f382025b) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                C140644e eVar = ((C140641b) next).f381984k;
                if (eVar == null) {
                    eVar = C140644e.f381988d;
                }
                if (eVar.f381990a < 1.0f) {
                    arrayList.add(next);
                }
            }
            list = arrayList;
        }
        return C69540x.m100837S(list, new C140663al(this.f382041a));
    }
}
