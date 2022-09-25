package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57309dj;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.StreamRequester$loadMore$2", mo61344c = "StreamRequester.kt", mo61345d = "invokeSuspend", mo61346e = {49, 55})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.fx */
/* compiled from: PG */
public final class C135104fx extends C69572j implements C69630p {

    /* renamed from: a */
    int f367972a;

    /* renamed from: b */
    final /* synthetic */ C135108ga f367973b;

    /* renamed from: c */
    final /* synthetic */ UUID f367974c;

    /* renamed from: d */
    final /* synthetic */ C57315dp f367975d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135104fx(C135108ga gaVar, UUID uuid, C57315dp dpVar, C69577g gVar) {
        super(2, gVar);
        this.f367973b = gaVar;
        this.f367974c = uuid;
        this.f367975d = dpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135104fx) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C135012cn cnVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f367972a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135086ff ffVar = this.f367973b.f367985a;
            if (ffVar.f367923h || C134992bx.m218910a()) {
                cnVar = new C135012cn(new C135079ez(ffVar, (C69577g) null));
            } else {
                cnVar = new C135016cr(new C135082fb(ffVar, (C69577g) null));
            }
            C135103fw fwVar = new C135103fw(this.f367975d);
            if (cnVar instanceof C135012cn) {
                C135008cj cjVar = this.f367973b.f367986b;
                UUID uuid = this.f367974c;
                this.f367972a = 1;
                obj = C71803m.m105040a(cjVar.f367630b, new C135007ci(cjVar, uuid, fwVar, cnVar, (C69577g) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (cnVar instanceof C135016cr) {
                C135015cq cqVar = this.f367973b.f367987c;
                UUID uuid2 = this.f367974c;
                this.f367972a = 2;
                obj = C71803m.m105040a(cqVar.f367670a, new C135014cp(cqVar, fwVar, (C135016cr) cnVar, uuid2, (C69577g) null), this);
                if (obj == aVar) {
                    return aVar;
                }
                return (C57309dj) obj;
            } else {
                throw new C69677g();
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (C57309dj) obj;
        } else {
            C69714l.m101134b(obj);
        }
        return (C57309dj) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135104fx(this.f367973b, this.f367974c, this.f367975d, gVar);
    }
}
