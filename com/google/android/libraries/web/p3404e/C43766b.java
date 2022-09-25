package com.google.android.libraries.web.p3404e;

import com.google.android.libraries.web.browser.C43272a;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71589p;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.web.history.WebHistoryAccessorsKt$historyStateFlow$2$invoke$$inlined$flatMapLatest$1", mo61344c = "WebHistoryAccessors.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.web.e.b */
/* compiled from: PG */
public final class C43766b extends C69572j implements C69631q {

    /* renamed from: a */
    int f114137a;

    /* renamed from: b */
    /* synthetic */ Object f114138b;

    /* renamed from: c */
    private /* synthetic */ Object f114139c;

    public C43766b(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C43766b bVar = new C43766b((C69577g) obj3);
        bVar.f114139c = (C71588o) obj;
        bVar.f114138b = obj2;
        return bVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f114137a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r4 = this.f114139c;
            C43272a aVar = (C43272a) this.f114138b;
            if (aVar != null) {
                nVar = C43769e.m77284a(aVar);
            } else {
                nVar = new C71589p(new C43770f(false, false));
            }
            this.f114137a = 1;
            if (C71594u.m104516c(r4, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
