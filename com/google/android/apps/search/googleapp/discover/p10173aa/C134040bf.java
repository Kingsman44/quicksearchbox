package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.C4377aa;
import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$makeAppCloseRefresh$2", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {192, 197})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bf */
/* compiled from: PG */
final class C134040bf extends C69572j implements C69630p {

    /* renamed from: a */
    int f365107a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365108b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134040bf(C134053bs bsVar, C69577g gVar) {
        super(2, gVar);
        this.f365108b = bsVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134040bf) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f365107a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C134053bs bsVar = this.f365108b;
            this.f365107a = 1;
            obj = bsVar.mo111535a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return (C4377aa) obj;
        } else {
            C69714l.m101134b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return new C4645z(C4632m.f14549a);
        }
        this.f365108b.f365151j.f365592a.mo83702b(C89849ae.DISCOVER_TNG_APP_CLOSE_BACKGROUND_REFRESH_START);
        C134053bs bsVar2 = this.f365108b;
        C135050dx a = bsVar2.f365149h.mo112120a(C57259bn.APP_CLOSE_REFRESH);
        this.f365107a = 2;
        obj = bsVar2.mo111537d(a, false, this);
        if (obj == aVar) {
            return aVar;
        }
        return (C4377aa) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134040bf(this.f365108b, gVar);
    }
}
