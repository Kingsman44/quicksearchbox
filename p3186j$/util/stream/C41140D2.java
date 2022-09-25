package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41041I;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.D2 */
abstract class C41140D2 extends C41148F2 implements C41041I {
    C41140D2(C41041I i, long j, long j2) {
        super(i, j, j2, 0, Math.min(i.estimateSize(), j2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Object mo43660d();

    /* renamed from: forEachRemaining */
    public final void mo43689l(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f107732e;
        long j2 = this.f107728a;
        if (j2 < j) {
            long j3 = this.f107731d;
            if (j3 < j) {
                if (j3 < j2 || ((C41041I) this.f107730c).estimateSize() + j3 > this.f107729b) {
                    while (j2 > this.f107731d) {
                        ((C41041I) this.f107730c).tryAdvance(mo43660d());
                        this.f107731d++;
                    }
                    while (this.f107731d < this.f107732e) {
                        ((C41041I) this.f107730c).tryAdvance(obj);
                        this.f107731d++;
                    }
                    return;
                }
                ((C41041I) this.f107730c).forEachRemaining(obj);
                this.f107731d = this.f107732e;
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
    public final boolean mo43688i(Object obj) {
        long j;
        Objects.requireNonNull(obj);
        long j2 = this.f107732e;
        long j3 = this.f107728a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f107731d;
            if (j3 <= j) {
                break;
            }
            ((C41041I) this.f107730c).tryAdvance(mo43660d());
            this.f107731d++;
        }
        if (j >= this.f107732e) {
            return false;
        }
        this.f107731d = j + 1;
        return ((C41041I) this.f107730c).tryAdvance(obj);
    }

    C41140D2(C41041I i, long j, long j2, long j3, long j4) {
        super(i, j, j2, j3, j4);
    }
}
