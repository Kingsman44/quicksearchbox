package p3186j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p3186j$.lang.C40948a;
import p3186j$.util.C41059a0;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.f2 */
class C41247f2 extends C41240e implements Consumer, Iterable, C40948a {

    /* renamed from: d */
    protected Object[] f107901d = new Object[16];

    /* renamed from: e */
    protected Object[][] f107902e;

    C41247f2() {
    }

    public void accept(Object obj) {
        long j;
        int i = this.f107878a;
        Object[] objArr = this.f107901d;
        if (i == objArr.length) {
            if (this.f107902e == null) {
                Object[][] objArr2 = new Object[8][];
                this.f107902e = objArr2;
                this.f107880c = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f107879b;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f107902e;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    j = (long) objArr.length;
                } else {
                    j = ((long) objArr3[i2].length) + this.f107880c[i2];
                }
                mo43851o(j + 1);
            }
            this.f107878a = 0;
            int i4 = this.f107879b + 1;
            this.f107879b = i4;
            this.f107901d = this.f107902e[i4];
        }
        Object[] objArr4 = this.f107901d;
        int i5 = this.f107878a;
        this.f107878a = i5 + 1;
        objArr4[i5] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void clear() {
        Object[][] objArr = this.f107902e;
        if (objArr != null) {
            this.f107901d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f107901d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f107902e = null;
            this.f107880c = null;
        } else {
            for (int i2 = 0; i2 < this.f107878a; i2++) {
                this.f107901d[i2] = null;
            }
        }
        this.f107878a = 0;
        this.f107879b = 0;
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f107879b; i++) {
            for (Object accept : this.f107902e[i]) {
                consumer.accept(accept);
            }
        }
        for (int i2 = 0; i2 < this.f107878a; i2++) {
            consumer.accept(this.f107901d[i2]);
        }
    }

    public final Iterator iterator() {
        return C41059a0.m71668i(spliterator());
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo43851o(long j) {
        long j2;
        int i;
        int i2 = this.f107879b;
        if (i2 == 0) {
            j2 = (long) this.f107901d.length;
        } else {
            j2 = this.f107880c[i2] + ((long) this.f107902e[i2].length);
        }
        if (j > j2) {
            if (this.f107902e == null) {
                Object[][] objArr = new Object[8][];
                this.f107902e = objArr;
                this.f107880c = new long[8];
                objArr[0] = this.f107901d;
            }
            while (true) {
                i2++;
                if (j > j2) {
                    Object[][] objArr2 = this.f107902e;
                    if (i2 >= objArr2.length) {
                        int length = objArr2.length * 2;
                        this.f107902e = (Object[][]) Arrays.copyOf(objArr2, length);
                        this.f107880c = Arrays.copyOf(this.f107880c, length);
                    }
                    if (i2 == 0 || i2 == 1) {
                        i = 4;
                    } else {
                        i = Math.min((i2 + 4) - 1, 30);
                    }
                    int i3 = 1 << i;
                    Object[][] objArr3 = this.f107902e;
                    objArr3[i2] = new Object[i3];
                    long[] jArr = this.f107880c;
                    int i4 = i2 - 1;
                    jArr[i2] = jArr[i4] + ((long) objArr3[i4].length);
                    j2 += (long) i3;
                } else {
                    return;
                }
            }
        }
    }

    public Spliterator spliterator() {
        return new C41214W1(this, 0, this.f107879b, 0, this.f107878a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C41224a(11, arrayList));
        String obj = arrayList.toString();
        return "SpinedBuffer:" + obj;
    }
}
