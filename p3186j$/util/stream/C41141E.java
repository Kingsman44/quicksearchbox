package p3186j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.C41076m;

/* renamed from: j$.util.stream.E */
final class C41141E extends C41236d {

    /* renamed from: j */
    private final C41324z f107724j;

    /* renamed from: k */
    private final boolean f107725k;

    C41141E(C41141E e, Spliterator spliterator) {
        super((C41236d) e, spliterator);
        this.f107725k = e.f107725k;
        this.f107724j = e.f107724j;
    }

    C41141E(C41324z zVar, boolean z, C41241e0 e0Var, Spliterator spliterator) {
        super(e0Var, spliterator);
        this.f107725k = z;
        this.f107724j = zVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo43697a() {
        boolean z;
        C41203T2 t2 = (C41203T2) this.f107724j.f108049d.get();
        this.f107893a.mo43816X(this.f107894b, t2);
        Object obj = t2.get();
        AtomicReference atomicReference = this.f107867h;
        if (!this.f107725k) {
            if (obj != null) {
                C41076m.m71700a(atomicReference, (Object) null, obj);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            C41244f fVar = this;
            while (true) {
                if (fVar != null) {
                    C41244f d = fVar.mo43848d();
                    if (d != null && d.f107896d != fVar) {
                        z = false;
                        break;
                    }
                    fVar = d;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C41076m.m71700a(atomicReference, (Object) null, obj);
            } else {
                mo43834i();
            }
            return obj;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C41244f mo43698e(Spliterator spliterator) {
        return new C41141E(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Object mo43699j() {
        return this.f107724j.f108047b;
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.f107725k) {
            C41141E e = (C41141E) this.f107896d;
            C41141E e2 = null;
            while (true) {
                if (e == e2) {
                    break;
                }
                Object c = e.mo43830c();
                if (c == null || !this.f107724j.f108048c.test(c)) {
                    e2 = e;
                    e = (C41141E) this.f107897e;
                } else {
                    mo43832f(c);
                    C41244f fVar = this;
                    while (true) {
                        if (fVar != null) {
                            C41244f d = fVar.mo43848d();
                            if (d != null && d.f107896d != fVar) {
                                z = false;
                                break;
                            }
                            fVar = d;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        C41076m.m71700a(this.f107867h, (Object) null, c);
                    } else {
                        mo43834i();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
