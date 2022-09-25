package kotlinx.coroutines.p5574b.p5575a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.a */
/* compiled from: PG */
public final class C71428a extends CancellationException {

    /* renamed from: a */
    public final transient C71588o f190640a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71428a(C71588o oVar) {
        super("Flow was aborted, no more elements needed");
        C69664n.m101061g(oVar, "owner");
        this.f190640a = oVar;
    }

    public final Throwable fillInStackTrace() {
        if (C71600ba.f191036a) {
            return super.fillInStackTrace();
        }
        setStackTrace((StackTraceElement[]) ((Object[]) new StackTraceElement[0]));
        return this;
    }
}
