package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.DiscoverEligibilityWriter$setDiscoverEligibility$2", mo61344c = "DiscoverEligibilityWriter.kt", mo61345d = "invokeSuspend", mo61346e = {44})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.p */
/* compiled from: PG */
public final class C134072p extends C69572j implements C69630p {

    /* renamed from: a */
    int f365215a;

    /* renamed from: b */
    final /* synthetic */ C134591i f365216b;

    /* renamed from: c */
    final /* synthetic */ C134073q f365217c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134072p(C134591i iVar, C134073q qVar, C69577g gVar) {
        super(2, gVar);
        this.f365216b = iVar;
        this.f365217c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134072p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365215a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f365216b != C134591i.UNKNOWN) {
                C134073q qVar = this.f365217c;
                C60870cx a = qVar.f365218a.mo46039a(new C134071o(qVar, this.f365216b), qVar.f365220c);
                C69664n.m101060f(a, "suspend fun setDiscoverE…   .await()\n      }\n    }");
                this.f365215a = 1;
                if (C71663i.m104690c(a, this) == aVar) {
                    return aVar;
                }
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134072p(this.f365216b, this.f365217c, gVar);
    }
}
