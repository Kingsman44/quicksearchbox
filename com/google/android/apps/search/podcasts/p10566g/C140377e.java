package com.google.android.apps.search.podcasts.p10566g;

import com.google.android.apps.search.podcasts.p10566g.p10568b.C140369d;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140370e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140982c;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140983d;
import com.google.p4017at.p4082j.p4083a.C54392cr;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.g.e */
/* compiled from: PG */
final class C140377e extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C54392cr f381324a;

    /* renamed from: b */
    final /* synthetic */ C140983d f381325b;

    /* renamed from: c */
    final /* synthetic */ C140332a f381326c;

    /* renamed from: d */
    final /* synthetic */ boolean f381327d;

    /* renamed from: e */
    final /* synthetic */ boolean f381328e;

    /* renamed from: f */
    final /* synthetic */ boolean f381329f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140377e(C54392cr crVar, C140983d dVar, C140332a aVar, boolean z, boolean z2, boolean z3) {
        super(1);
        this.f381324a = crVar;
        this.f381325b = dVar;
        this.f381326c = aVar;
        this.f381327d = z;
        this.f381328e = z2;
        this.f381329f = z3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "showItems");
        C140332a aVar = this.f381326c;
        ArrayList<C140646b> arrayList = new ArrayList<>();
        for (Object next : list) {
            C140646b bVar = (C140646b) next;
            if (C140376d.f381323a[aVar.ordinal()] == 1) {
                C54397cw a = C54397cw.m87374a(bVar.f382010p);
                if (a == null) {
                    a = C54397cw.UNRECOGNIZED;
                }
                if (a != C54397cw.SHOW_HIDE) {
                    C54397cw a2 = C54397cw.m87374a(bVar.f382010p);
                    if (a2 == null) {
                        a2 = C54397cw.UNRECOGNIZED;
                    }
                    if (a2 == C54397cw.SHOW_RECOMMEND_LESS) {
                    }
                }
            }
            arrayList.add(next);
        }
        if (arrayList.isEmpty()) {
            return C69496am.f185918a;
        }
        String str = this.f381324a.f142863c;
        C69664n.m101060f(str, "showGroup.title");
        C140983d dVar = this.f381325b;
        C54392cr crVar = this.f381324a;
        boolean z = this.f381327d;
        boolean z2 = this.f381328e;
        boolean z3 = this.f381329f;
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C140646b eVar : arrayList) {
            arrayList2.add(new C140370e(eVar, new C140982c(dVar.f382769e, (crVar.f142861a & 8) != 0 ? crVar.f142864d : null), z, z2, z3));
        }
        return C69540x.m100944b(new C140369d(str, arrayList2, this.f381325b.f382768d));
    }
}
