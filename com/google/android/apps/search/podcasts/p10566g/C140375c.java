package com.google.android.apps.search.podcasts.p10566g;

import com.google.android.apps.search.podcasts.p10566g.p10568b.C140368c;
import com.google.android.apps.search.podcasts.p10600q.C140952k;
import com.google.p4017at.p4082j.p4083a.C54297aa;
import com.google.p4017at.p4082j.p4083a.C54299ac;
import com.google.p4017at.p4082j.p4083a.C54323b;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.g.c */
/* compiled from: PG */
final class C140375c extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C54297aa f381321a;

    /* renamed from: b */
    final /* synthetic */ boolean f381322b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140375c(C54297aa aaVar, boolean z) {
        super(1);
        this.f381321a = aaVar;
        this.f381322b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        List list;
        List<List> J;
        List list2 = (List) obj;
        if (list2 == null || (J = C69540x.m100828J(list2)) == null) {
            list = C69496am.f185918a;
        } else {
            list = new ArrayList();
            for (List V : J) {
                C69540x.m100811r(list, C69540x.m100840V(V));
            }
            if (this.f381322b && list.size() > 3) {
                list.add(3, new C140368c());
            }
        }
        C140952k kVar = new C140952k(list, (Integer) null);
        C62971cq cqVar = this.f381321a.f142652a;
        C69664n.m101060f(cqVar, "feed.feedItemsList");
        boolean z = false;
        if (!(cqVar instanceof Collection) || !cqVar.isEmpty()) {
            Iterator it = cqVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C54299ac acVar = (C54299ac) it.next();
                if (acVar.f142655a == 9 && ((C54323b) acVar.f142656b).f142701a) {
                    z = true;
                    break;
                }
            }
        }
        return new C140380h(kVar, z);
    }
}
