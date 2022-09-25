package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70908w;

/* renamed from: io.grpc.e.i */
/* compiled from: PG */
public abstract class C70573i implements C70654l, C70557hk {

    /* renamed from: C */
    private int f188138C;

    /* renamed from: D */
    private boolean f188139D;

    /* renamed from: o */
    public C70391bg f188140o;

    /* renamed from: p */
    public final Object f188141p = new Object();

    /* renamed from: q */
    public final C70679ly f188142q;

    /* renamed from: r */
    public final C70560hn f188143r;

    /* renamed from: s */
    public boolean f188144s;

    protected C70573i(int i, C70670lp lpVar, C70679ly lyVar) {
        this.f188142q = lyVar;
        C70560hn hnVar = new C70560hn(this, C70908w.f189099a, i, lpVar, lyVar);
        this.f188143r = hnVar;
        this.f188140o = hnVar;
    }

    /* renamed from: c */
    private final void m103113c() {
        boolean o;
        synchronized (this.f188141p) {
            o = mo62326o();
        }
        if (o) {
            mo62128g().mo62084e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo61921d() {
        C58838bb.m90883r(mo62128g() != null);
        synchronized (this.f188141p) {
            C58838bb.m90884s(!this.f188139D, "Already allocated");
            this.f188139D = true;
        }
        m103113c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract C70673ls mo62128g();

    /* renamed from: k */
    public final void mo62305k(C70672lr lrVar) {
        mo62128g().mo62083d(lrVar);
    }

    /* renamed from: l */
    public final void mo62323l(int i) {
        synchronized (this.f188141p) {
            this.f188138C += i;
        }
    }

    /* renamed from: m */
    public final void mo62324m(int i) {
        boolean z;
        synchronized (this.f188141p) {
            C58838bb.m90884s(this.f188139D, "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.f188138C;
            int i3 = i2 - i;
            this.f188138C = i3;
            z = false;
            if (i2 >= 32768 && i3 < 32768) {
                z = true;
            }
        }
        if (z) {
            m103113c();
        }
    }

    /* renamed from: n */
    public final void mo62325n() {
        C70560hn hnVar = this.f188143r;
        hnVar.f188087a = this;
        this.f188140o = hnVar;
    }

    /* renamed from: o */
    public final boolean mo62326o() {
        boolean z;
        synchronized (this.f188141p) {
            z = false;
            if (this.f188139D && this.f188138C < 32768 && !this.f188144s) {
                z = true;
            }
        }
        return z;
    }
}
