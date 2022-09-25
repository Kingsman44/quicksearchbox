package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.Iterator;
import org.p5649d.C72639b;
import p5488io.p5490b.p5495c.C69813f;

/* renamed from: io.b.e.e.b.g */
/* compiled from: PG */
final class C69898g extends C69896e {
    private static final long serialVersionUID = -6022804456014692607L;

    /* renamed from: d */
    final C72639b f186331d;

    public C69898g(C72639b bVar, Iterator it) {
        super(it);
        this.f186331d = bVar;
    }

    /* renamed from: f */
    public final void mo61514f() {
        Iterator it = this.f186327a;
        C72639b bVar = this.f186331d;
        while (!this.f186328b) {
            try {
                Object next = it.next();
                if (!this.f186328b) {
                    if (next == null) {
                        bVar.mo61497f(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bVar.mo61498g(next);
                    if (!this.f186328b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.f186328b) {
                                    bVar.mo61499lK();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C69813f.m101292a(th);
                            bVar.mo61497f(th);
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
                bVar.mo61497f(th2);
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo61515g(long j) {
        Iterator it = this.f186327a;
        C72639b bVar = this.f186331d;
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
                                bVar.mo61497f(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            bVar.mo61498g(next);
                            if (!this.f186328b) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!this.f186328b) {
                                        bVar.mo61499lK();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    C69813f.m101292a(th);
                                    bVar.mo61497f(th);
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
                        bVar.mo61497f(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }
}
