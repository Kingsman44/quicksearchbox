package androidx.media3.exoplayer.p142e;

import java.util.NoSuchElementException;

/* renamed from: androidx.media3.exoplayer.e.n */
/* compiled from: PG */
final class C2984n {

    /* renamed from: a */
    private int f8574a = 0;

    /* renamed from: b */
    private int f8575b = -1;

    /* renamed from: c */
    private int f8576c = 0;

    /* renamed from: d */
    private int[] f8577d;

    /* renamed from: e */
    private int f8578e;

    public C2984n() {
        int[] iArr = new int[16];
        this.f8577d = iArr;
        this.f8578e = iArr.length - 1;
    }

    /* renamed from: a */
    public final int mo6899a() {
        int i = this.f8576c;
        if (i != 0) {
            int[] iArr = this.f8577d;
            int i2 = this.f8574a;
            int i3 = iArr[i2];
            this.f8574a = (i2 + 1) & this.f8578e;
            this.f8576c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final void mo6900b(int i) {
        int i2 = this.f8576c;
        int[] iArr = this.f8577d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 >= 0) {
                int[] iArr2 = new int[i3];
                int i4 = this.f8574a;
                int i5 = length - i4;
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.f8577d, 0, iArr2, i5, i4);
                this.f8574a = 0;
                this.f8575b = this.f8576c - 1;
                this.f8577d = iArr2;
                this.f8578e = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i6 = (this.f8575b + 1) & this.f8578e;
        this.f8575b = i6;
        iArr[i6] = i;
        this.f8576c++;
    }

    /* renamed from: c */
    public final void mo6901c() {
        this.f8574a = 0;
        this.f8575b = -1;
        this.f8576c = 0;
    }

    /* renamed from: d */
    public final boolean mo6902d() {
        return this.f8576c == 0;
    }
}
