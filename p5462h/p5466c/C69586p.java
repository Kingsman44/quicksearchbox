package p5462h.p5466c;

import java.io.Serializable;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.c.p */
/* compiled from: PG */
public final class C69586p implements Serializable, C69585o {

    /* renamed from: a */
    public static final C69586p f185991a = new C69586p();
    private static final long serialVersionUID = 0;

    private C69586p() {
    }

    private final Object readResolve() {
        return f185991a;
    }

    public final Object fold(Object obj, C69630p pVar) {
        C69664n.m101061g(pVar, "operation");
        return obj;
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return this;
    }

    public final C69585o plus(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return oVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
