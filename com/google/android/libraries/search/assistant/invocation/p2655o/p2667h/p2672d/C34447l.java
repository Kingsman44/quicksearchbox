package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34114w;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34231an;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;
import java.util.Set;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.platform.PerConnectionPlatformConfigurationTracker$tracking$2", mo61344c = "PlatformConfigurationTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.l */
/* compiled from: PG */
final class C34447l extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f91538a;

    /* renamed from: b */
    final /* synthetic */ C34449n f91539b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34447l(C34449n nVar, C69577g gVar) {
        super(2, gVar);
        this.f91539b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34447l) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f91538a;
        C34060bw bwVar = (C34060bw) iVar.f186052a;
        C34060bw bwVar2 = (C34060bw) iVar.f186053b;
        C34449n nVar = this.f91539b;
        StringBuilder sb = new StringBuilder();
        C34114w wVar = bwVar2.f90765b;
        if (wVar == null) {
            wVar = C34114w.f90859c;
        }
        if ((wVar.f90861a & 1) != 0) {
            sb.append("\n  configuration snapshot id: ".concat(String.valueOf(wVar.f90862b)));
        }
        if (bwVar2.f90767d.size() > 0) {
            C62963cj<C34043bf> cjVar = new C62963cj(bwVar2.f90767d, C34060bw.f90761e);
            ArrayList arrayList = new ArrayList(C69540x.m100804k(cjVar, 10));
            for (C34043bf name : cjVar) {
                arrayList.add(name.name());
            }
            new StringBuilder("\n  active invocation sources: ").append(arrayList);
            sb.append("\n  active invocation sources: ".concat(arrayList.toString()));
        }
        Set ab = C69540x.m100846ab(C69540x.m100831M(new C62963cj(bwVar.f90767d, C34060bw.f90761e), new C62963cj(bwVar2.f90767d, C34060bw.f90761e)));
        ArrayList<C34043bf> arrayList2 = new ArrayList<>();
        for (Object next : ab) {
            C34043bf bfVar = (C34043bf) next;
            C34231an anVar = nVar.f91545c;
            C69664n.m101060f(bfVar, "it");
            C62917ay a = anVar.mo39277a(bfVar);
            if (a != null) {
                C34049bl blVar = bwVar.f90766c;
                if (blVar == null) {
                    blVar = C34049bl.f90749a;
                }
                C62940bt r10 = C62942bv.checkIsLite(a);
                blVar.mo58887l(r10);
                Object l = blVar.f169962ag.mo58854l(r10.f169971d);
                if (l == null) {
                    obj2 = r10.f169969b;
                } else {
                    obj2 = r10.mo58889c(l);
                }
                C34049bl blVar2 = bwVar2.f90766c;
                if (blVar2 == null) {
                    blVar2 = C34049bl.f90749a;
                }
                C62940bt r8 = C62942bv.checkIsLite(a);
                blVar2.mo58887l(r8);
                Object l2 = blVar2.f169962ag.mo58854l(r8.f169971d);
                if (l2 == null) {
                    obj3 = r8.f169969b;
                } else {
                    obj3 = r8.mo58889c(l2);
                }
                if (!C69664n.m101066l(obj2, obj3)) {
                    arrayList2.add(next);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
            for (C34043bf name2 : arrayList2) {
                arrayList3.add(name2.name());
            }
            new StringBuilder("\n  updated invocation sources (state): ").append(arrayList3);
            sb.append("\n  updated invocation sources (state): ".concat(arrayList3.toString()));
        }
        String sb2 = sb.toString();
        C59052c cVar = (C59052c) C34449n.f91543a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.ConfigurationView");
        String c = nVar.f91544b.mo39322c();
        C69664n.m101059e(bwVar2, "null cannot be cast to non-null type kotlin.Any");
        String a2 = C33914a.m62566a(bwVar2);
        if (true == C69764m.m101229h(sb2)) {
            sb2 = " N/A";
        }
        cVar.mo56379ah(new C59094n(51360));
        cVar.mo56359L("Platform configuration for connection(%s) has changed(@%s):%s", c, a2, sb2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34447l lVar = new C34447l(this.f91539b, gVar);
        lVar.f91538a = obj;
        return lVar;
    }
}
