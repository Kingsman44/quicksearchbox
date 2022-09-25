package com.google.android.libraries.web.contrib.requestblock;

import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43941r;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.requestblock.RequestBlockWebModel$1", mo61344c = "RequestBlockWebModel.kt", mo61345d = "invokeSuspend", mo61346e = {65})
/* renamed from: com.google.android.libraries.web.contrib.requestblock.d */
/* compiled from: PG */
final class C43717d extends C69572j implements C69630p {

    /* renamed from: a */
    Object f114039a;

    /* renamed from: b */
    int f114040b;

    /* renamed from: c */
    final /* synthetic */ C43720g f114041c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43717d(C43720g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f114041c = gVar;
    }

    /* renamed from: e */
    public static final void m77186e(C43720g gVar, C43904a aVar, boolean z) {
        C43909d.m77519a(aVar).mo46917g().remove(gVar);
        if (!z) {
            gVar.f114050e = null;
            for (Map.Entry value : gVar.f114048c.entrySet()) {
                ((C43718e) value.getValue()).f114042a = null;
            }
            for (Map.Entry value2 : gVar.f114049d.entrySet()) {
                ((C43718e) value2.getValue()).f114042a = null;
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43717d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114040b != 0) {
            obj2 = this.f114039a;
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException unused) {
            }
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            try {
                C71587n a = C43941r.m77580a(this.f114041c.f114046a);
                C43716c cVar = new C43716c(aeVar, this.f114041c);
                this.f114039a = aeVar;
                this.f114040b = 1;
                if (a.mo38165mp(cVar, this) == aVar) {
                    return aVar;
                }
            } catch (CancellationException unused2) {
                obj2 = aeVar;
                C43904a aVar2 = (C43904a) ((C69648ae) obj2).f186027a;
                if (aVar2 != null && !aVar2.mo46410c().mo46899e()) {
                    m77186e(this.f114041c, aVar2, false);
                }
                return C69788q.f186170a;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43717d(this.f114041c, gVar);
    }
}
