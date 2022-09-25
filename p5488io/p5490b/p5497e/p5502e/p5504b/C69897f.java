package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.Iterator;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5500c.C69842a;

/* renamed from: io.b.e.e.b.f */
/* compiled from: PG */
final class C69897f extends C69896e {
    private static final long serialVersionUID = -6022804456014692607L;

    /* renamed from: d */
    final C69842a f186330d;

    public C69897f(C69842a aVar, Iterator it) {
        super(it);
        this.f186330d = aVar;
    }

    /* renamed from: f */
    public final void mo61514f() {
        Iterator it = this.f186327a;
        C69842a aVar = this.f186330d;
        while (!this.f186328b) {
            try {
                Object next = it.next();
                if (!this.f186328b) {
                    if (next == null) {
                        aVar.mo61497f(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    aVar.mo61486d(next);
                    if (!this.f186328b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.f186328b) {
                                    aVar.mo61499lK();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C69813f.m101292a(th);
                            aVar.mo61497f(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                C69813f.m101292a(th2);
                aVar.mo61497f(th2);
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo61515g(long j) {
        Iterator it = this.f186327a;
        C69842a aVar = this.f186330d;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (!this.f186328b) {
                    try {
                        Object next = it.next();
                        if (!this.f186328b) {
                            if (next == null) {
                                aVar.mo61497f(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean d = aVar.mo61486d(next);
                            if (!this.f186328b) {
                                try {
                                    if (!it.hasNext()) {
                                        if (!this.f186328b) {
                                            aVar.mo61499lK();
                                            return;
                                        }
                                        return;
                                    } else if (d) {
                                        j2++;
                                    }
                                } catch (Throwable th) {
                                    C69813f.m101292a(th);
                                    aVar.mo61497f(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        C69813f.m101292a(th2);
                        aVar.mo61497f(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
