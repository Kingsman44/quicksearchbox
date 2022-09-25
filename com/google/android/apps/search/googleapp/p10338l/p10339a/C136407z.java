package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136376a;
import com.google.android.apps.search.googleapp.p10338l.C136417k;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump$getKvData$2", mo61344c = "StateDump.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.apps.search.googleapp.l.a.z */
/* compiled from: PG */
final class C136407z extends C69572j implements C69630p {

    /* renamed from: a */
    int f371367a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371368b;

    /* renamed from: c */
    final /* synthetic */ C136398q f371369c;

    /* renamed from: d */
    private /* synthetic */ Object f371370d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136407z(C136378aa aaVar, C136398q qVar, C69577g gVar) {
        super(2, gVar);
        this.f371368b = aaVar;
        this.f371369c = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136407z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f371367a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f371370d;
            C136376a aVar2 = (C136376a) this.f371368b.f371292b.get(this.f371369c.f371341a);
            if (aVar2 != null) {
                this.f371367a = 1;
                obj = aVar2.mo112952a();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalStateException("no data for PSD key ".concat(String.valueOf(this.f371369c.f371341a)));
            }
        }
        obj2 = (C136417k) obj;
        return new C69702k(obj2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C136407z zVar = new C136407z(this.f371368b, this.f371369c, gVar);
        zVar.f371370d = obj;
        return zVar;
    }
}
