package p3186j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p3186j$.util.C41038F;
import p3186j$.util.C41059a0;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.Y1 */
class C41220Y1 extends C41243e2 implements DoubleConsumer {
    C41220Y1() {
    }

    public void accept(double d) {
        mo43847t();
        int i = this.f107878a;
        this.f107878a = i + 1;
        ((double[]) this.f107890d)[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            mo43649g((DoubleConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            mo43675u().forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return C41059a0.m71665f(mo43675u());
    }

    public final Object newArray(int i) {
        return new double[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo43805o(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo43806p(Object obj) {
        return ((double[]) obj).length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object[] mo43807s() {
        return new double[8][];
    }

    public final String toString() {
        double[] dArr = (double[]) mo43645b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f107879b), Arrays.toString(dArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f107879b), Arrays.toString(Arrays.copyOf(dArr, 200))});
    }

    /* renamed from: u */
    public C41038F mo43675u() {
        return new C41217X1(this, 0, this.f107879b, 0, this.f107878a);
    }
}
