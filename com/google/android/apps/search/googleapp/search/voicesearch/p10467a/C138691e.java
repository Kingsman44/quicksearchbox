package com.google.android.apps.search.googleapp.search.voicesearch.p10467a;

import android.content.Intent;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4152bb.p4153a.C55029df;
import com.google.p4152bb.p4153a.C55035dl;
import com.google.p4152bb.p4153a.C55213ka;
import com.google.p4152bb.p4153a.C55235kw;
import com.google.p4152bb.p4153a.C55265lz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.actions.ActionsHandler$handleSearchAction$resultDeferred$1", mo61344c = "ActionsHandler.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.a.e */
/* compiled from: PG */
public final class C138691e extends C69572j implements C69630p {

    /* renamed from: a */
    int f377215a;

    /* renamed from: b */
    final /* synthetic */ C138692f f377216b;

    /* renamed from: c */
    final /* synthetic */ C55265lz f377217c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138691e(C138692f fVar, C55265lz lzVar, C69577g gVar) {
        super(2, gVar);
        this.f377216b = fVar;
        this.f377217c = lzVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138691e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f377215a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C138692f fVar = this.f377216b;
            C55265lz lzVar = this.f377217c;
            this.f377215a = 1;
            C62971cq cqVar = lzVar.f145559b;
            C69664n.m101060f(cqVar, "modularAction\n        .argumentList");
            ArrayList<C55213ka> arrayList = new ArrayList<>();
            for (Object next : cqVar) {
                C55213ka kaVar = (C55213ka) next;
                C62940bt r7 = C62942bv.checkIsLite(C55235kw.f145427j);
                kaVar.mo58887l(r7);
                if (kaVar.f169962ag.mo58857o(r7.f169971d)) {
                    arrayList.add(next);
                }
            }
            ArrayList<C55235kw> arrayList2 = new ArrayList<>(C69540x.m100804k(arrayList, 10));
            for (C55213ka kaVar2 : arrayList) {
                C62940bt r72 = C62942bv.checkIsLite(C55235kw.f145427j);
                kaVar2.mo58887l(r72);
                Object l = kaVar2.f169962ag.mo58854l(r72.f169971d);
                if (l == null) {
                    obj3 = r72.f169969b;
                } else {
                    obj3 = r72.mo58889c(l);
                }
                arrayList2.add((C55235kw) obj3);
            }
            ArrayList arrayList3 = new ArrayList();
            for (C55235kw kwVar : arrayList2) {
                C62971cq cqVar2 = kwVar.f145434f;
                C69664n.m101060f(cqVar2, "it.clientQueryList");
                C69540x.m100811r(arrayList3, cqVar2);
            }
            ArrayList<C55029df> arrayList4 = new ArrayList<>();
            for (Object next2 : arrayList3) {
                C55029df dfVar = (C55029df) next2;
                C62940bt r8 = C62942bv.checkIsLite(C55035dl.f144791g);
                dfVar.mo58887l(r8);
                if (dfVar.f169962ag.mo58857o(r8.f169971d)) {
                    arrayList4.add(next2);
                }
            }
            ArrayList arrayList5 = new ArrayList(C69540x.m100804k(arrayList4, 10));
            for (C55029df dfVar2 : arrayList4) {
                C62940bt r6 = C62942bv.checkIsLite(C55035dl.f144791g);
                dfVar2.mo58887l(r6);
                Object l2 = dfVar2.f169962ag.mo58854l(r6.f169971d);
                if (l2 == null) {
                    obj2 = r6.f169969b;
                } else {
                    obj2 = r6.mo58889c(l2);
                }
                arrayList5.add((C55035dl) obj2);
            }
            if (arrayList5.size() > 1) {
                C59052c cVar = (C59052c) C138692f.f377219b.mo56226d();
                cVar.mo56378ag(C38505d.f101864b, new Integer(194898428));
                cVar.mo56379ah(new C59094n(41292));
                cVar.mo56386p("Saw multiple IcingQuery protos, but expected at most one.");
            }
            C55035dl dlVar = (C55035dl) C69540x.m100821C(arrayList5);
            if (dlVar != null) {
                C138693g gVar = fVar.f377222e;
                String str = dlVar.f144794b;
                C69664n.m101060f(str, "it.query");
                obj = gVar.mo114468a(str, this);
                if (obj != C69554a.COROUTINE_SUSPENDED) {
                    obj = (Intent) obj;
                }
            } else {
                obj = null;
            }
            if (obj == aVar) {
                return aVar;
            }
        }
        Intent intent = (Intent) obj;
        if (intent == null) {
            return null;
        }
        this.f377216b.mo114467a(intent);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138691e(this.f377216b, this.f377217c, gVar);
    }
}
