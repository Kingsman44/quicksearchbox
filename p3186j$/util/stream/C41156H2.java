package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41041I;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.H2 */
abstract class C41156H2 extends C41168K2 implements C41041I {
    C41156H2(C41041I i, long j, long j2) {
        super(i, j, j2);
    }

    C41156H2(C41041I i, C41156H2 h2) {
        super(i, h2);
    }

    /* renamed from: forEachRemaining */
    public final void mo43742g(Object obj) {
        Objects.requireNonNull(obj);
        C41271l2 l2Var = null;
        while (true) {
            C41164J2 o = mo43768o();
            if (o != C41164J2.NO_MORE) {
                C41164J2 j2 = C41164J2.MAYBE_MORE;
                Spliterator spliterator = this.f107752a;
                if (o == j2) {
                    int i = this.f107754c;
                    if (l2Var == null) {
                        l2Var = new C41271l2(i);
                    } else {
                        l2Var.f107981b = 0;
                    }
                    long j = 0;
                    while (((C41041I) spliterator).tryAdvance(l2Var)) {
                        j++;
                        if (j >= ((long) i)) {
                            break;
                        }
                    }
                    if (j != 0) {
                        long m = mo43767m(j);
                        C41271l2 l2Var2 = l2Var;
                        IntConsumer intConsumer = (IntConsumer) obj;
                        for (int i2 = 0; ((long) i2) < m; i2++) {
                            intConsumer.accept(l2Var2.f107972c[i2]);
                        }
                    } else {
                        return;
                    }
                } else {
                    ((C41041I) spliterator).forEachRemaining(obj);
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

    /* renamed from: tryAdvance */
    public final boolean mo43741f(Object obj) {
        Objects.requireNonNull(obj);
        while (mo43768o() != C41164J2.NO_MORE && ((C41041I) this.f107752a).tryAdvance(this)) {
            if (mo43767m(1) == 1) {
                ((IntConsumer) obj).accept(((C41152G2) this).f107735f);
                return true;
            }
        }
        return false;
    }
}
