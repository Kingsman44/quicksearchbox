package kotlinx.coroutines.p5574b.p5575a;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", mo61344c = "Combine.kt", mo61345d = "invokeSuspend", mo61346e = {34})
/* renamed from: kotlinx.coroutines.b.a.v */
/* compiled from: PG */
final class C71465v extends C69572j implements C69630p {

    /* renamed from: a */
    int f190711a;

    /* renamed from: b */
    final /* synthetic */ C71587n[] f190712b;

    /* renamed from: c */
    final /* synthetic */ int f190713c;

    /* renamed from: d */
    final /* synthetic */ AtomicInteger f190714d;

    /* renamed from: e */
    final /* synthetic */ C71389v f190715e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71465v(C71587n[] nVarArr, int i, AtomicInteger atomicInteger, C71389v vVar, C69577g gVar) {
        super(2, gVar);
        this.f190712b = nVarArr;
        this.f190713c = i;
        this.f190714d = atomicInteger;
        this.f190715e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C71465v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f190711a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                if (this.f190714d.decrementAndGet() == 0) {
                    this.f190715e.mo62727D((Throwable) null);
                }
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C71587n[] nVarArr = this.f190712b;
            int i = this.f190713c;
            C71587n nVar = nVarArr[i];
            C71464u uVar = new C71464u(this.f190715e, i);
            this.f190711a = 1;
            if (nVar.mo38165mp(uVar, this) == aVar) {
                return aVar;
            }
        }
        if (this.f190714d.decrementAndGet() == 0) {
            this.f190715e.mo62727D((Throwable) null);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C71465v(this.f190712b, this.f190713c, this.f190714d, this.f190715e, gVar);
    }
}
