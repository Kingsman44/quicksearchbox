package p3186j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p3186j$.util.C41039G;
import p3186j$.util.C41059a0;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.a2 */
class C41227a2 extends C41243e2 implements IntConsumer {
    C41227a2() {
    }

    public void accept(int i) {
        mo43847t();
        int i2 = this.f107878a;
        this.f107878a = i2 + 1;
        ((int[]) this.f107890d)[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo43649g((IntConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            mo43771u().forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return C41059a0.m71666g(mo43771u());
    }

    public final Object newArray(int i) {
        return new int[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo43805o(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo43806p(Object obj) {
        return ((int[]) obj).length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object[] mo43807s() {
        return new int[8][];
    }

    public final String toString() {
        int[] iArr = (int[]) mo43645b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f107879b), Arrays.toString(iArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f107879b), Arrays.toString(Arrays.copyOf(iArr, 200))});
    }

    /* renamed from: u */
    public C41039G mo43771u() {
        return new C41223Z1(this, 0, this.f107879b, 0, this.f107878a);
    }
}
