package com.google.android.libraries.web.p3428m;

import com.google.android.libraries.web.browser.C43272a;
import com.google.android.libraries.web.lifecycle.p3427c.C43884b;
import com.google.android.libraries.web.lifecycle.p3427c.C43885c;
import com.google.android.libraries.web.lifecycle.p3427c.C43886d;
import com.google.android.libraries.web.lifecycle.p3427c.C43887e;
import com.google.android.libraries.web.lifecycle.p3427c.C43888f;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71589p;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.libraries.web.window.WebWindowAccessorsKt$special$$inlined$flatMapValueToLifecycled$1", mo61344c = "WebWindowAccessors.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.web.m.e */
/* compiled from: PG */
public final class C43928e extends C69572j implements C69631q {

    /* renamed from: a */
    int f114407a;

    /* renamed from: b */
    /* synthetic */ Object f114408b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f114409c;

    /* renamed from: d */
    private /* synthetic */ Object f114410d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43928e(C69577g gVar, C69644aa aaVar) {
        super(3, gVar);
        this.f114409c = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C43928e eVar = new C43928e((C69577g) obj3, this.f114409c);
        eVar.f114410d = (C71588o) obj;
        eVar.f114408b = obj2;
        return eVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f114407a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r6 = this.f114410d;
            C43888f fVar = (C43888f) this.f114408b;
            if (fVar instanceof C43885c) {
                nVar = new C71589p(new C43885c(C69788q.f186170a));
            } else if (fVar instanceof C43886d) {
                nVar = new C43927d(C43941r.m77581b((C43272a) ((C43886d) fVar).f114338a), this.f114409c);
            } else if (fVar instanceof C43887e) {
                this.f114409c.f186023a = true;
                nVar = new C71589p(new C43887e(C69788q.f186170a));
            } else if (fVar instanceof C43884b) {
                this.f114409c.f186023a = false;
                nVar = new C71589p(new C43884b(C69788q.f186170a));
            } else {
                throw new C69677g();
            }
            this.f114407a = 1;
            if (C71594u.m104516c(r6, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
