package kotlinx.coroutines;

import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bj */
/* compiled from: PG */
final class C71609bj extends RuntimeException {

    /* renamed from: a */
    private final C69585o f191044a;

    public C71609bj(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        this.f191044a = oVar;
    }

    public final Throwable fillInStackTrace() {
        setStackTrace((StackTraceElement[]) ((Object[]) new StackTraceElement[0]));
        return this;
    }

    public final String getLocalizedMessage() {
        return this.f191044a.toString();
    }
}
