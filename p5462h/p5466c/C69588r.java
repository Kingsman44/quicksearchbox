package p5462h.p5466c;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p5462h.C69692j;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.r */
/* compiled from: PG */
public final class C69588r implements C69577g, C69566d {
    @Deprecated

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f185992a = AtomicReferenceFieldUpdater.newUpdater(C69588r.class, Object.class, "result");

    /* renamed from: b */
    private final C69577g f185993b;
    private volatile Object result;

    public C69588r(C69577g gVar) {
        C69664n.m101061g(gVar, "delegate");
        C69554a aVar = C69554a.UNDECIDED;
        C69664n.m101061g(gVar, "delegate");
        this.f185993b = gVar;
        this.result = aVar;
    }

    /* renamed from: a */
    public final Object mo61355a() {
        Object obj = this.result;
        if (obj == C69554a.UNDECIDED) {
            if (C69587q.m100999a(f185992a, this, C69554a.UNDECIDED, C69554a.COROUTINE_SUSPENDED)) {
                return C69554a.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == C69554a.RESUMED) {
            return C69554a.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof C69692j)) {
            return obj;
        }
        throw ((C69692j) obj).f186058a;
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* renamed from: eM */
    public final C69566d mo61336eM() {
        C69577g gVar = this.f185993b;
        if (gVar instanceof C69566d) {
            return (C69566d) gVar;
        }
        return null;
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return this.f185993b.mo61340lY();
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        while (true) {
            Object obj2 = this.result;
            if (obj2 != C69554a.UNDECIDED) {
                C69554a aVar = C69554a.COROUTINE_SUSPENDED;
                if (obj2 != aVar) {
                    throw new IllegalStateException("Already resumed");
                } else if (C69587q.m100999a(f185992a, this, aVar, C69554a.RESUMED)) {
                    this.f185993b.mo61338mb(obj);
                    return;
                }
            } else if (C69587q.m100999a(f185992a, this, C69554a.UNDECIDED, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeContinuation for ");
        C69577g gVar = this.f185993b;
        sb.append(gVar);
        return "SafeContinuation for ".concat(String.valueOf(gVar));
    }
}
