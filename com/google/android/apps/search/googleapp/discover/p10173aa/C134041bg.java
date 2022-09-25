package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4377aa;
import com.google.android.apps.search.googleapp.discover.p10238u.C135050dx;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$makeEagerBackgroundRequest$2", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {183, 186})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bg */
/* compiled from: PG */
final class C134041bg extends C69572j implements C69630p {

    /* renamed from: a */
    int f365109a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365110b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134041bg(C134053bs bsVar, C69577g gVar) {
        super(2, gVar);
        this.f365110b = bsVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134041bg) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f365109a;
        if (i == 0) {
            C69714l.m101134b(obj);
            if (this.f365110b.mo111541h()) {
                C134053bs bsVar = this.f365110b;
                this.f365109a = 1;
                obj = bsVar.mo111538e(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                this.f365110b.f365151j.mo111646a();
                C134053bs bsVar2 = this.f365110b;
                C135050dx a = bsVar2.f365149h.mo112120a(C57259bn.SCHEDULED_REFRESH);
                this.f365109a = 2;
                obj = bsVar2.mo111537d(a, true, this);
                if (obj == aVar) {
                    return aVar;
                }
                return (C4377aa) obj;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (C4377aa) obj;
        } else {
            C69714l.m101134b(obj);
        }
        return (C4377aa) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134041bg(this.f365110b, gVar);
    }
}
