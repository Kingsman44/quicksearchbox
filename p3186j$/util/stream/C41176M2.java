package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.M2 */
final class C41176M2 extends C41267k2 {
    C41176M2(C41241e0 e0Var, Spliterator spliterator, boolean z) {
        super(e0Var, spliterator, z);
    }

    C41176M2(C41241e0 e0Var, C41224a aVar, boolean z) {
        super(e0Var, aVar, z);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f107963h != null || this.f107964i) {
            do {
            } while (tryAdvance(consumer));
            return;
        }
        Objects.requireNonNull(consumer);
        mo43858e();
        Objects.requireNonNull(consumer);
        C41172L2 l2 = new C41172L2(consumer, 1);
        this.f107957b.mo43816X(this.f107959d, l2);
        this.f107964i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo43777h() {
        C41247f2 f2Var = new C41247f2();
        this.f107963h = f2Var;
        Objects.requireNonNull(f2Var);
        this.f107960e = this.f107957b.mo43817Y(new C41172L2(f2Var, 0));
        this.f107961f = new C41224a(10, this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final C41267k2 mo43778j(Spliterator spliterator) {
        return new C41176M2(this.f107957b, spliterator, this.f107956a);
    }

    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean c = mo43857c();
        if (c) {
            C41247f2 f2Var = (C41247f2) this.f107963h;
            long j = this.f107962g;
            if (f2Var.f107879b == 0) {
                if (j < ((long) f2Var.f107878a)) {
                    obj = f2Var.f107901d[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < f2Var.count()) {
                int i = 0;
                while (i <= f2Var.f107879b) {
                    long j2 = f2Var.f107880c[i];
                    Object[] objArr = f2Var.f107902e[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    } else {
                        i++;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return c;
    }
}
