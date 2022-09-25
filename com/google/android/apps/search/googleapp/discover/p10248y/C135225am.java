package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10200l.C134462f;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135277a;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135278b;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135279c;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135280d;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135281e;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135293q;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$fetchAndStoreDataSuspend$2", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {127, 129, 135})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.am */
/* compiled from: PG */
final class C135225am extends C69572j implements C69630p {

    /* renamed from: a */
    Object f368343a;

    /* renamed from: b */
    Object f368344b;

    /* renamed from: c */
    Object f368345c;

    /* renamed from: d */
    int f368346d;

    /* renamed from: e */
    final /* synthetic */ C135241bb f368347e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135225am(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368347e = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135225am) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        C135214ab abVar;
        C135050dx dxVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368346d;
        if (i == 0) {
            C69714l.m101134b(obj);
            C135241bb bbVar = this.f368347e;
            if (!bbVar.f368399b || bbVar.f368409l.mo112181c().f367772a != C57259bn.MANUAL_REFRESH) {
                dxVar = this.f368347e.f368409l.mo112181c();
            } else {
                dxVar = this.f368347e.f368406i.mo112120a(C57259bn.SCHEDULED_REFRESH);
            }
            C135241bb bbVar2 = this.f368347e;
            C135314au auVar = bbVar2.f368400c;
            C134766q qVar = bbVar2.f368410m;
            this.f368346d = 1;
            obj = auVar.mo112253b(dxVar, qVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            try {
                C69714l.m101134b(obj);
            } catch (C135293q e) {
                C135241bb bbVar3 = this.f368347e;
                this.f368346d = 2;
                obj = bbVar3.mo112187e(e, this);
                if (obj == aVar) {
                    return aVar;
                }
            } catch (C135281e e2) {
                C135281e eVar = e2;
                C135241bb bbVar4 = this.f368347e;
                obj3 = bbVar4.f368412o;
                C135280d dVar = eVar.f368528a;
                C134462f fVar = bbVar4.f368404g;
                this.f368343a = eVar;
                this.f368344b = obj3;
                this.f368345c = dVar;
                this.f368346d = 3;
                obj = fVar.mo111789a(this);
                if (obj == aVar) {
                    return aVar;
                }
                obj4 = dVar;
                obj2 = eVar;
            }
        } else if (i != 2) {
            obj4 = this.f368345c;
            obj3 = this.f368344b;
            Object obj5 = this.f368343a;
            C69714l.m101134b(obj);
            obj2 = obj5;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C69664n.m101061g(obj4, "precheckFailureReason");
            C135246bg bgVar = null;
            if (C69664n.m101066l(obj4, C135279c.f368527a)) {
                if (booleanValue) {
                    bgVar = C135246bg.f368435a;
                }
                abVar = ((C135221ai) obj3).mo112178a(C135217ae.m219322b((C135280d) obj4), bgVar);
            } else if (C69664n.m101066l(obj4, C135277a.f368525a)) {
                abVar = ((C135221ai) obj3).mo112178a(C135217ae.m219322b((C135280d) obj4), C135256g.f368479a);
            } else if (obj4 instanceof C135278b) {
                int i2 = ((C135278b) obj4).f368526a;
                C135221ai aiVar = (C135221ai) obj3;
                abVar = aiVar.mo112178a(C135217ae.m219322b((C135280d) obj4), new C135260k(i2, aiVar.f368330b.mo119363k(aiVar.f368331c, i2, (String) null)));
            } else {
                throw new C69677g();
            }
            throw C135223ak.m219325a((Exception) obj2, abVar);
        } else {
            C69714l.m101134b(obj);
            return (C134555at) obj;
        }
        return (C134555at) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135225am(this.f368347e, gVar);
    }
}
