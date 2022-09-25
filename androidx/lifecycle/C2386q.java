package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71647ct;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", mo61344c = "Lifecycle.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: androidx.lifecycle.q */
/* compiled from: PG */
public final class C2386q extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ LifecycleCoroutineScopeImpl f6606a;

    /* renamed from: b */
    private /* synthetic */ Object f6607b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2386q(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, C69577g gVar) {
        super(2, gVar);
        this.f6606a = lifecycleCoroutineScopeImpl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C2386q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C71422aw awVar = (C71422aw) this.f6607b;
        if (this.f6606a.f6490a.mo5789a().compareTo(C2383n.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f6606a;
            lifecycleCoroutineScopeImpl.f6490a.mo5790b(lifecycleCoroutineScopeImpl);
        } else {
            C71647ct.m104639c(awVar.mo5702lZ(), (CancellationException) null);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C2386q qVar = new C2386q(this.f6606a, gVar);
        qVar.f6607b = obj;
        return qVar;
    }
}
