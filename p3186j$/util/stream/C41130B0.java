package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.B0 */
final class C41130B0 extends C41126A0 implements C41245f0 {
    C41130B0(long j) {
        super(j);
    }

    public final void accept(double d) {
        int i = this.f107712b;
        double[] dArr = this.f107711a;
        if (i < dArr.length) {
            this.f107712b = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(dArr.length)}));
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43666k((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    public final C41261j0 build() {
        int i = this.f107712b;
        double[] dArr = this.f107711a;
        if (i >= dArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107712b), Integer.valueOf(dArr.length)}));
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        double[] dArr = this.f107711a;
        if (j == ((long) dArr.length)) {
            this.f107712b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(dArr.length)}));
        }
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
        int i = this.f107712b;
        double[] dArr = this.f107711a;
        if (i < dArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107712b), Integer.valueOf(dArr.length)}));
        }
    }

    /* renamed from: k */
    public final /* synthetic */ void mo43666k(Double d) {
        C41241e0.m72087d(this, d);
    }

    public final String toString() {
        double[] dArr = this.f107711a;
        return String.format("DoubleFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(dArr.length - this.f107712b), Arrays.toString(dArr)});
    }
}
