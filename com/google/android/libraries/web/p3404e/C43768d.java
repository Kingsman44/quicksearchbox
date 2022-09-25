package com.google.android.libraries.web.p3404e;

import com.google.android.libraries.web.p3404e.p3405a.C43765b;
import com.google.android.libraries.web.p3428m.C43904a;
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

@C69567e(mo61343b = "com.google.android.libraries.web.history.WebHistoryAccessorsKt$special$$inlined$flatMapLatest$1", mo61344c = "WebHistoryAccessors.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.web.e.d */
/* compiled from: PG */
public final class C43768d extends C69572j implements C69631q {

    /* renamed from: a */
    int f114141a;

    /* renamed from: b */
    /* synthetic */ Object f114142b;

    /* renamed from: c */
    private /* synthetic */ Object f114143c;

    public C43768d(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C43768d dVar = new C43768d((C69577g) obj3);
        dVar.f114143c = (C71588o) obj;
        dVar.f114142b = obj2;
        return dVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f114141a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r4 = this.f114143c;
            C43904a aVar = (C43904a) this.f114142b;
            if (aVar != null) {
                nVar = C43765b.m77278a(aVar);
                aVar.mo46915a();
            } else {
                nVar = new C71589p(new C43770f(false, false));
            }
            this.f114141a = 1;
            if (C71594u.m104516c(r4, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
