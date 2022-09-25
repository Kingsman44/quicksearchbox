package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69831g;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.bs */
/* compiled from: PG */
final class C69965bs extends AtomicLong implements C70123o, C69803b {
    private static final long serialVersionUID = 3764492702657003550L;

    /* renamed from: a */
    final C70123o f186482a;

    /* renamed from: b */
    final long f186483b = 500;

    /* renamed from: c */
    final TimeUnit f186484c;

    /* renamed from: d */
    final C70127s f186485d;

    /* renamed from: e */
    final C69831g f186486e;

    /* renamed from: f */
    final AtomicReference f186487f;

    public C69965bs(C70123o oVar, TimeUnit timeUnit, C70127s sVar) {
        this.f186482a = oVar;
        this.f186484c = timeUnit;
        this.f186485d = sVar;
        this.f186486e = new C69831g();
        this.f186487f = new AtomicReference();
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C69828d.m101309f(this.f186486e);
            this.f186482a.mo25986a();
            this.f186485d.dispose();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C69828d.m101309f(this.f186486e);
            this.f186482a.mo25987b(th);
            this.f186485d.dispose();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        C69828d.m101307c(this.f186487f, bVar);
    }

    public final void dispose() {
        C69828d.m101309f(this.f186487f);
        this.f186485d.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61544f(long j) {
        C69828d.m101310g(this.f186486e, this.f186485d.mo61456b(new C69966bt(j, this), this.f186483b, this.f186484c));
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((C69803b) this.f186486e.get()).dispose();
                this.f186482a.mo25988lL(obj);
                mo61544f(j2);
            }
        }
    }
}
