package p5488io.p5490b.p5497e.p5502e.p5507e;

import org.p5649d.C72640c;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5497e.p5500c.C69842a;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;

/* renamed from: io.b.e.e.e.k */
/* compiled from: PG */
final class C70007k extends C70005i {
    private static final long serialVersionUID = 1075119423897941642L;

    /* renamed from: k */
    final C69842a f186624k;

    public C70007k(C69842a aVar, int i, C70037c cVar, C70127s sVar) {
        super(i, cVar, sVar);
        this.f186624k = aVar;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186615e, cVar)) {
            this.f186615e = cVar;
            this.f186624k.mo61494a(this);
            cVar.mo61489e((long) this.f186611a);
        }
    }

    public final void run() {
        Throwable th;
        int i = this.f186620j;
        C70037c cVar = this.f186613c;
        C69842a aVar = this.f186624k;
        int i2 = this.f186612b;
        int i3 = 1;
        while (true) {
            long j = this.f186618h.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.f186619i) {
                    cVar.mo61475c();
                    return;
                }
                boolean z = this.f186616f;
                if (!z || (th = this.f186617g) == null) {
                    Object lN = cVar.mo61479lN();
                    if (!z) {
                        if (lN == null) {
                            break;
                        }
                    } else if (lN == null) {
                        aVar.mo61499lK();
                        this.f186614d.dispose();
                        return;
                    }
                    if (aVar.mo61486d(lN)) {
                        j2++;
                    }
                    i++;
                    if (i == i2) {
                        this.f186615e.mo61489e((long) i);
                        i = 0;
                    }
                } else {
                    cVar.mo61475c();
                    aVar.mo61497f(th);
                    this.f186614d.dispose();
                    return;
                }
            }
            if (j2 == j) {
                if (this.f186619i) {
                    cVar.mo61475c();
                    return;
                } else if (this.f186616f) {
                    Throwable th2 = this.f186617g;
                    if (th2 != null) {
                        cVar.mo61475c();
                        aVar.mo61497f(th2);
                        this.f186614d.dispose();
                        return;
                    } else if (cVar.mo61476i()) {
                        aVar.mo61499lK();
                        this.f186614d.dispose();
                        return;
                    }
                }
            }
            if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                this.f186618h.addAndGet(-j2);
            }
            int i4 = get();
            if (i4 == i3) {
                this.f186620j = i;
                i3 = addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            } else {
                i3 = i4;
            }
        }
    }
}
