package com.google.android.apps.search.googleapp.discover.p10249z;

import com.google.android.apps.search.googleapp.discover.p10184f.C134258i;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.android.libraries.p1635au.C19567d;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamprovider.ResponsePersistenceManager$persistFirstPageResponse$2$2", mo61344c = "ResponsePersistenceManager.kt", mo61345d = "invokeSuspend", mo61346e = {70, 72})
/* renamed from: com.google.android.apps.search.googleapp.discover.z.u */
/* compiled from: PG */
final class C135364u extends C69572j implements C69630p {

    /* renamed from: a */
    int f368807a;

    /* renamed from: b */
    final /* synthetic */ C134587e f368808b;

    /* renamed from: c */
    final /* synthetic */ C135294aa f368809c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135364u(C134587e eVar, C135294aa aaVar, C69577g gVar) {
        super(2, gVar);
        this.f368808b = eVar;
        this.f368809c = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135364u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f368807a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C134587e eVar = this.f368808b;
            if (eVar != null) {
                C134258i iVar = this.f368809c.f368538c;
                this.f368807a = 1;
                if (iVar.mo111663a(eVar, this) == aVar) {
                    return aVar;
                }
                return C69788q.f186170a;
            }
            C134258i iVar2 = this.f368809c.f368538c;
            this.f368807a = 2;
            if (iVar2.mo111664b(this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        }
        ((C19567d) this.f368809c.f368540e.f103056a.f103112u.mo6453a()).mo24822a(1, new Object[0]);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135364u(this.f368808b, this.f368809c, gVar);
    }
}
