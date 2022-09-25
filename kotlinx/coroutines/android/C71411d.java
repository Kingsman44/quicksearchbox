package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71606bg;
import kotlinx.coroutines.C71613bn;
import kotlinx.coroutines.C71615bp;
import kotlinx.coroutines.C71647ct;
import kotlinx.coroutines.C71669de;
import kotlinx.coroutines.C71672dh;
import kotlinx.coroutines.C71807q;
import kotlinx.coroutines.C71808r;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.android.d */
/* compiled from: PG */
public final class C71411d extends C71412e implements C71606bg {
    private volatile C71411d _immediate;

    /* renamed from: c */
    public final Handler f190619c;

    /* renamed from: d */
    private final String f190620d;

    /* renamed from: e */
    private final boolean f190621e;

    /* renamed from: f */
    private final C71411d f190622f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C71411d(Handler handler, String str) {
        this(handler, str, false);
        C69664n.m101061g(handler, "handler");
    }

    /* renamed from: i */
    private final void m104177i(C69585o oVar, Runnable runnable) {
        C71647ct.m104639c(oVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C71613bn.f191049c.mo62766d(oVar, runnable);
    }

    /* renamed from: a */
    public final void mo62765a(long j, C71807q qVar) {
        C71409b bVar = new C71409b(qVar, this);
        Handler handler = this.f190619c;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(bVar, j)) {
            qVar.mo63035f(new C71410c(this, bVar));
        } else {
            m104177i(((C71808r) qVar).f191338b, bVar);
        }
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        if (!this.f190619c.post(runnable)) {
            m104177i(oVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C71411d) && ((C71411d) obj).f190619c == this.f190619c;
    }

    /* renamed from: f */
    public final boolean mo62768f(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return !this.f190621e || !C69664n.m101066l(Looper.myLooper(), this.f190619c.getLooper());
    }

    /* renamed from: g */
    public final C71615bp mo62769g(long j, Runnable runnable, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        Handler handler = this.f190619c;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new C71408a(this, runnable);
        }
        m104177i(oVar, runnable);
        return C71672dh.f191129a;
    }

    /* renamed from: h */
    public final /* synthetic */ C71669de mo62770h() {
        return this.f190622f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f190619c);
    }

    public final String toString() {
        String c = mo62919c();
        if (c != null) {
            return c;
        }
        String str = this.f190620d;
        if (str == null) {
            str = this.f190619c.toString();
        }
        return this.f190621e ? String.valueOf(str).concat(".immediate") : str;
    }

    private C71411d(Handler handler, String str, boolean z) {
        this.f190619c = handler;
        this.f190620d = str;
        this.f190621e = z;
        this._immediate = true != z ? null : this;
        C71411d dVar = this._immediate;
        if (dVar == null) {
            dVar = new C71411d(handler, str, true);
            this._immediate = dVar;
        }
        this.f190622f = dVar;
    }
}
