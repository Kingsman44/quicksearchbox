package com.google.android.apps.search.podcasts.p10566g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140367b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import com.google.p4017at.p4082j.p4083a.C54458w;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.g.b */
/* compiled from: PG */
final class C140365b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140332a f381301a;

    /* renamed from: b */
    final /* synthetic */ C97925o f381302b;

    /* renamed from: c */
    final /* synthetic */ boolean f381303c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140365b(C140332a aVar, C97925o oVar, boolean z) {
        super(1);
        this.f381301a = aVar;
        this.f381302b = oVar;
        this.f381303c = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        List list = (List) obj;
        C69664n.m101061g(list, "episodeItems");
        if (list.isEmpty()) {
            C59052c cVar = (C59052c) C140379g.f381331a.mo56224b();
            cVar.mo56379ah(new C59094n(41589));
            cVar.mo56386p("EpisodeItems failed to convert.");
            return C69496am.f185918a;
        }
        C140332a aVar = this.f381301a;
        ArrayList<C140641b> arrayList = new ArrayList<>();
        for (Object next : list) {
            C140641b bVar = (C140641b) next;
            C140332a aVar2 = C140332a.NONE;
            int ordinal = aVar.ordinal();
            if (ordinal == 1) {
                C140644e eVar = bVar.f381984k;
                if (eVar == null) {
                    eVar = C140644e.f381988d;
                }
                if (eVar.f381990a >= 1.0f) {
                }
            } else if (ordinal == 2) {
                C140646b bVar2 = bVar.f381974a;
                if (bVar2 == null) {
                    bVar2 = C140646b.f381993r;
                }
                C54397cw a = C54397cw.m87374a(bVar2.f382010p);
                if (a == null) {
                    a = C54397cw.UNRECOGNIZED;
                }
                if (a != C54397cw.SHOW_HIDE) {
                    C140646b bVar3 = bVar.f381974a;
                    if (bVar3 == null) {
                        bVar3 = C140646b.f381993r;
                    }
                    C54397cw a2 = C54397cw.m87374a(bVar3.f382010p);
                    if (a2 == null) {
                        a2 = C54397cw.UNRECOGNIZED;
                    }
                    if (a2 != C54397cw.SHOW_RECOMMEND_LESS) {
                        C54458w a3 = C54458w.m87383a(bVar.f381986m);
                        if (a3 == null) {
                            a3 = C54458w.UNRECOGNIZED;
                        }
                        if (a3 != C54458w.EPISODE_HIDE) {
                            C54458w a4 = C54458w.m87383a(bVar.f381986m);
                            if (a4 == null) {
                                a4 = C54458w.UNRECOGNIZED;
                            }
                            if (a4 == C54458w.EPISODE_RECOMMEND_LESS) {
                            }
                        }
                    }
                }
            }
            arrayList.add(next);
        }
        C97925o oVar = this.f381302b;
        boolean z = this.f381303c;
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C140641b bVar4 : arrayList) {
            arrayList2.add(new C140367b(bVar4, oVar, z));
        }
        return arrayList2;
    }
}
