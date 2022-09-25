package p3186j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: j$.util.stream.V1 */
final class C41210V1 extends C41198S1 {

    /* renamed from: d */
    private Object[] f107818d;

    /* renamed from: e */
    private int f107819e;

    C41210V1(C41171L1 l1, Comparator comparator) {
        super(l1, comparator);
    }

    public final void accept(Object obj) {
        Object[] objArr = this.f107818d;
        int i = this.f107819e;
        this.f107819e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        if (j < 2147483639) {
            this.f107818d = new Object[((int) j)];
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        int i = 0;
        Arrays.sort(this.f107818d, 0, this.f107819e, this.f107807b);
        C41171L1 l1 = this.f107737a;
        l1.mo43663c((long) this.f107819e);
        if (!this.f107808c) {
            while (i < this.f107819e) {
                l1.accept(this.f107818d[i]);
                i++;
            }
        } else {
            while (i < this.f107819e && !l1.mo43664e()) {
                l1.accept(this.f107818d[i]);
                i++;
            }
        }
        l1.end();
        this.f107818d = null;
    }
}
