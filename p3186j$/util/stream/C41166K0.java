package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.K0 */
final class C41166K0 extends C41162J0 implements C41249g0 {
    C41166K0(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final void accept(int i) {
        int i2 = this.f107742b;
        int[] iArr = this.f107741a;
        if (i2 < iArr.length) {
            this.f107742b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(iArr.length)}));
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43736d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final C41265k0 build() {
        int i = this.f107742b;
        int[] iArr = this.f107741a;
        if (i >= iArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107742b), Integer.valueOf(iArr.length)}));
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        int[] iArr = this.f107741a;
        if (j == ((long) iArr.length)) {
            this.f107742b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(iArr.length)}));
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo43736d(Integer num) {
        C41241e0.m72089g(this, num);
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
        int i = this.f107742b;
        int[] iArr = this.f107741a;
        if (i < iArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107742b), Integer.valueOf(iArr.length)}));
        }
    }

    public final String toString() {
        int[] iArr = this.f107741a;
        return String.format("IntFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(iArr.length - this.f107742b), Arrays.toString(iArr)});
    }
}
