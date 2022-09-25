package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.cq */
/* compiled from: PG */
public final class C71644cq extends CancellationException implements C71401ah {

    /* renamed from: a */
    public final transient C71643cp f191084a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71644cq(String str, Throwable th, C71643cp cpVar) {
        super(str);
        C69664n.m101061g(str, "message");
        C69664n.m101061g(cpVar, "job");
        this.f191084a = cpVar;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo62763a() {
        if (!C71600ba.f191036a) {
            return null;
        }
        String message = getMessage();
        C69664n.m101058d(message);
        return new C71644cq(message, this, this.f191084a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C71644cq) {
            C71644cq cqVar = (C71644cq) obj;
            return C69664n.m101066l(cqVar.getMessage(), getMessage()) && C69664n.m101066l(cqVar.f191084a, this.f191084a) && C69664n.m101066l(cqVar.getCause(), getCause());
        }
        return false;
    }

    public final Throwable fillInStackTrace() {
        if (C71600ba.f191036a) {
            return super.fillInStackTrace();
        }
        setStackTrace((StackTraceElement[]) ((Object[]) new StackTraceElement[0]));
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        C69664n.m101058d(message);
        int hashCode = ((message.hashCode() * 31) + this.f191084a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public final String toString() {
        String cancellationException = super.toString();
        C71643cp cpVar = this.f191084a;
        return cancellationException + "; job=" + cpVar;
    }
}
