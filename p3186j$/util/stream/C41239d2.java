package p3186j$.util.stream;

import java.util.Comparator;
import p3186j$.util.C41041I;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.d2 */
abstract class C41239d2 implements C41041I {

    /* renamed from: a */
    int f107872a;

    /* renamed from: b */
    final int f107873b;

    /* renamed from: c */
    int f107874c;

    /* renamed from: d */
    final int f107875d;

    /* renamed from: e */
    Object f107876e;

    /* renamed from: f */
    final /* synthetic */ C41243e2 f107877f;

    C41239d2(C41243e2 e2Var, int i, int i2, int i3, int i4) {
        this.f107877f = e2Var;
        this.f107872a = i;
        this.f107873b = i2;
        this.f107874c = i3;
        this.f107875d = i4;
        Object[] objArr = e2Var.f107891e;
        this.f107876e = objArr == null ? e2Var.f107890d : objArr[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo43800c(int i, Object obj, Object obj2);

    public final int characteristics() {
        return 16464;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract C41041I mo43801d(Object obj, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract C41041I mo43802e(int i, int i2, int i3, int i4);

    public final long estimateSize() {
        int i = this.f107872a;
        int i2 = this.f107875d;
        int i3 = this.f107873b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f107874c);
        }
        long[] jArr = this.f107877f.f107880c;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f107874c);
    }

    /* renamed from: forEachRemaining */
    public final void mo43841l(Object obj) {
        C41243e2 e2Var;
        Objects.requireNonNull(obj);
        int i = this.f107872a;
        int i2 = this.f107875d;
        int i3 = this.f107873b;
        if (i < i3 || (i == i3 && this.f107874c < i2)) {
            int i4 = this.f107874c;
            while (true) {
                e2Var = this.f107877f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = e2Var.f107891e[i];
                e2Var.mo43805o(obj2, i4, e2Var.mo43806p(obj2), obj);
                i++;
                i4 = 0;
            }
            e2Var.mo43805o(this.f107872a == i3 ? this.f107876e : e2Var.f107891e[i3], i4, i2, obj);
            this.f107872a = i3;
            this.f107874c = i2;
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
    public final boolean mo43840i(Object obj) {
        Objects.requireNonNull(obj);
        int i = this.f107872a;
        int i2 = this.f107873b;
        if (i >= i2 && (i != i2 || this.f107874c >= this.f107875d)) {
            return false;
        }
        Object obj2 = this.f107876e;
        int i3 = this.f107874c;
        this.f107874c = i3 + 1;
        mo43800c(i3, obj2, obj);
        int i4 = this.f107874c;
        Object obj3 = this.f107876e;
        C41243e2 e2Var = this.f107877f;
        if (i4 == e2Var.mo43806p(obj3)) {
            this.f107874c = 0;
            int i5 = this.f107872a + 1;
            this.f107872a = i5;
            Object[] objArr = e2Var.f107891e;
            if (objArr != null && i5 <= i2) {
                this.f107876e = objArr[i5];
            }
        }
        return true;
    }

    public final Spliterator trySplit() {
        int i = this.f107872a;
        int i2 = this.f107873b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f107874c;
            C41243e2 e2Var = this.f107877f;
            C41041I e = mo43802e(i, i3, i4, e2Var.mo43806p(e2Var.f107891e[i3]));
            this.f107872a = i2;
            this.f107874c = 0;
            this.f107876e = e2Var.f107891e[i2];
            return e;
        }
        if (i == i2) {
            int i5 = this.f107874c;
            int i6 = (this.f107875d - i5) / 2;
            if (i6 != 0) {
                C41041I d = mo43801d(this.f107876e, i5, i6);
                this.f107874c += i6;
                return d;
            }
        }
        return null;
    }
}
