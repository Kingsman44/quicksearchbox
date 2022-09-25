package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.I2 */
final class C41160I2 extends C41168K2 implements Spliterator, Consumer {

    /* renamed from: f */
    Object f107739f;

    C41160I2(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2);
    }

    C41160I2(Spliterator spliterator, C41160I2 i2) {
        super(spliterator, i2);
    }

    public final void accept(Object obj) {
        this.f107739f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C41279n2 n2Var = null;
        while (true) {
            C41164J2 o = mo43768o();
            if (o != C41164J2.NO_MORE) {
                C41164J2 j2 = C41164J2.MAYBE_MORE;
                Spliterator spliterator = this.f107752a;
                if (o == j2) {
                    int i = this.f107754c;
                    if (n2Var == null) {
                        n2Var = new C41279n2(i);
                    } else {
                        n2Var.f107990a = 0;
                    }
                    long j = 0;
                    while (spliterator.tryAdvance(n2Var)) {
                        j++;
                        if (j >= ((long) i)) {
                            break;
                        }
                    }
                    if (j != 0) {
                        long m = mo43767m(j);
                        for (int i2 = 0; ((long) i2) < m; i2++) {
                            consumer.accept(n2Var.f107986b[i2]);
                        }
                    } else {
                        return;
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo43737n(Spliterator spliterator) {
        return new C41160I2(spliterator, this);
    }

    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (mo43768o() != C41164J2.NO_MORE && this.f107752a.tryAdvance(this)) {
            if (mo43767m(1) == 1) {
                consumer.accept(this.f107739f);
                this.f107739f = null;
                return true;
            }
        }
        return false;
    }
}
