package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71647ct;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.f */
/* compiled from: PG */
public final class C2375f implements Closeable, C71422aw {

    /* renamed from: a */
    private final C69585o f6598a;

    public C2375f(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        this.f6598a = oVar;
    }

    public final void close() {
        C71647ct.m104639c(this.f6598a, (CancellationException) null);
    }

    /* renamed from: lZ */
    public final C69585o mo5702lZ() {
        return this.f6598a;
    }
}
