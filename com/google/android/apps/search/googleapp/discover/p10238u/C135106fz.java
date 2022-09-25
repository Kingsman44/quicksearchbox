package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.android.apps.search.googleapp.discover.p10181d.C134205aj;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57252bg;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57286cn;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.StreamRequester$triggerFirstPageRequest$2", mo61344c = "StreamRequester.kt", mo61345d = "invokeSuspend", mo61346e = {102, 113})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.fz */
/* compiled from: PG */
public final class C135106fz extends C69572j implements C69630p {

    /* renamed from: a */
    int f367978a;

    /* renamed from: b */
    final /* synthetic */ C135108ga f367979b;

    /* renamed from: c */
    final /* synthetic */ C135050dx f367980c;

    /* renamed from: d */
    final /* synthetic */ UUID f367981d;

    /* renamed from: e */
    final /* synthetic */ C57340w f367982e;

    /* renamed from: f */
    final /* synthetic */ C57286cn f367983f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135106fz(C135108ga gaVar, C135050dx dxVar, UUID uuid, C57340w wVar, C57286cn cnVar, C69577g gVar) {
        super(2, gVar);
        this.f367979b = gaVar;
        this.f367980c = dxVar;
        this.f367981d = uuid;
        this.f367982e = wVar;
        this.f367983f = cnVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135106fz) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f367978a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C134205aj ajVar = this.f367979b.f367988d;
            C37258g gVar = this.f367980c.f367777f;
            UUID uuid = this.f367981d;
            C69664n.m101061g(gVar, "requestStartEvent");
            C69664n.m101061g(uuid, "requestId");
            ajVar.mo111615a(uuid, gVar);
            C135050dx dxVar = this.f367980c;
            C135090fj fjVar = dxVar.f367778g;
            if (fjVar instanceof C135012cn) {
                C135008cj cjVar = this.f367979b.f367986b;
                C57340w wVar = this.f367982e;
                UUID uuid2 = this.f367981d;
                C57259bn bnVar = dxVar.f367772a;
                C134991bw bwVar = dxVar.f367775d;
                C57252bg bgVar = dxVar.f367773b;
                String str = dxVar.f367774c;
                C57286cn cnVar = this.f367983f;
                this.f367978a = 1;
                obj3 = C71803m.m105040a(cjVar.f367630b, new C135006ch(cjVar, uuid2, bnVar, wVar, bwVar, bgVar, str, cnVar, (C135012cn) fjVar, (C69577g) null), this);
                if (obj3 == aVar) {
                    return aVar;
                }
            } else if (fjVar instanceof C135016cr) {
                C135015cq cqVar = this.f367979b.f367987c;
                C57340w wVar2 = this.f367982e;
                UUID uuid3 = this.f367981d;
                C57259bn bnVar2 = dxVar.f367772a;
                C134991bw bwVar2 = dxVar.f367775d;
                C57252bg bgVar2 = dxVar.f367773b;
                String str2 = dxVar.f367774c;
                C57286cn cnVar2 = this.f367983f;
                this.f367978a = 2;
                obj2 = C71803m.m105040a(cqVar.f367670a, new C135013co(cqVar, bnVar2, wVar2, bwVar2, bgVar2, str2, cnVar2, (C135016cr) fjVar, uuid3, (C69577g) null), this);
                if (obj2 == aVar) {
                    return aVar;
                }
                return (C57309dj) obj2;
            } else {
                throw new C69677g();
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            obj2 = obj;
            return (C57309dj) obj2;
        } else {
            C69714l.m101134b(obj);
            obj3 = obj;
        }
        return (C57309dj) obj3;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135106fz(this.f367979b, this.f367980c, this.f367981d, this.f367982e, this.f367983f, gVar);
    }
}
