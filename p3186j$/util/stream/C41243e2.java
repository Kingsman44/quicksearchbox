package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.lang.C40948a;

/* renamed from: j$.util.stream.e2 */
abstract class C41243e2 extends C41240e implements Iterable, C40948a {

    /* renamed from: d */
    Object f107890d = newArray(16);

    /* renamed from: e */
    Object[] f107891e;

    C41243e2() {
    }

    /* renamed from: b */
    public Object mo43645b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo43647f(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void clear() {
        Object[] objArr = this.f107891e;
        if (objArr != null) {
            this.f107890d = objArr[0];
            this.f107891e = null;
            this.f107880c = null;
        }
        this.f107878a = 0;
        this.f107879b = 0;
    }

    /* renamed from: f */
    public void mo43647f(int i, Object obj) {
        long j = (long) i;
        long count = count() + j;
        if (count > ((long) mo43806p(obj)) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        } else if (this.f107879b == 0) {
            System.arraycopy(this.f107890d, 0, obj, i, this.f107878a);
        } else {
            for (int i2 = 0; i2 < this.f107879b; i2++) {
                Object obj2 = this.f107891e[i2];
                System.arraycopy(obj2, 0, obj, i, mo43806p(obj2));
                i += mo43806p(this.f107891e[i2]);
            }
            int i3 = this.f107878a;
            if (i3 > 0) {
                System.arraycopy(this.f107890d, 0, obj, i, i3);
            }
        }
    }

    /* renamed from: g */
    public void mo43649g(Object obj) {
        for (int i = 0; i < this.f107879b; i++) {
            Object obj2 = this.f107891e[i];
            mo43805o(obj2, 0, mo43806p(obj2), obj);
        }
        mo43805o(this.f107890d, 0, this.f107878a, obj);
    }

    public abstract Object newArray(int i);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract void mo43805o(Object obj, int i, int i2, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo43806p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final int mo43845q(long j) {
        if (this.f107879b == 0) {
            if (j < ((long) this.f107878a)) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f107879b; i++) {
                if (j < this.f107880c[i] + ((long) mo43806p(this.f107891e[i]))) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo43846r(long j) {
        long j2;
        int i;
        int i2 = this.f107879b;
        if (i2 == 0) {
            j2 = (long) mo43806p(this.f107890d);
        } else {
            j2 = ((long) mo43806p(this.f107891e[i2])) + this.f107880c[i2];
        }
        if (j > j2) {
            if (this.f107891e == null) {
                Object[] s = mo43807s();
                this.f107891e = s;
                this.f107880c = new long[8];
                s[0] = this.f107890d;
            }
            int i3 = this.f107879b;
            while (true) {
                i3++;
                if (j > j2) {
                    Object[] objArr = this.f107891e;
                    if (i3 >= objArr.length) {
                        int length = objArr.length * 2;
                        this.f107891e = Arrays.copyOf(objArr, length);
                        this.f107880c = Arrays.copyOf(this.f107880c, length);
                    }
                    if (i3 == 0 || i3 == 1) {
                        i = 4;
                    } else {
                        i = Math.min((i3 + 4) - 1, 30);
                    }
                    int i4 = 1 << i;
                    this.f107891e[i3] = newArray(i4);
                    long[] jArr = this.f107880c;
                    int i5 = i3 - 1;
                    jArr[i3] = jArr[i5] + ((long) mo43806p(this.f107891e[i5]));
                    j2 += (long) i4;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract Object[] mo43807s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo43847t() {
        long j;
        if (this.f107878a == mo43806p(this.f107890d)) {
            if (this.f107891e == null) {
                Object[] s = mo43807s();
                this.f107891e = s;
                this.f107880c = new long[8];
                s[0] = this.f107890d;
            }
            int i = this.f107879b;
            int i2 = i + 1;
            Object[] objArr = this.f107891e;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    j = (long) mo43806p(this.f107890d);
                } else {
                    j = ((long) mo43806p(objArr[i])) + this.f107880c[i];
                }
                mo43846r(j + 1);
            }
            this.f107878a = 0;
            int i3 = this.f107879b + 1;
            this.f107879b = i3;
            this.f107890d = this.f107891e[i3];
        }
    }
}
