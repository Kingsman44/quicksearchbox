package p3186j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import p3186j$.util.C41040H;
import p3186j$.util.C41059a0;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.c2 */
class C41235c2 extends C41243e2 implements LongConsumer {
    C41235c2() {
    }

    public void accept(long j) {
        mo43847t();
        int i = this.f107878a;
        this.f107878a = i + 1;
        ((long[]) this.f107890d)[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            mo43649g((LongConsumer) consumer);
        } else if (!C41211V2.f107820a) {
            mo43796u().forEachRemaining(consumer);
        } else {
            C41211V2.m71971a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        }
    }

    public final Iterator iterator() {
        return C41059a0.m71667h(mo43796u());
    }

    public final Object newArray(int i) {
        return new long[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo43805o(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo43806p(Object obj) {
        return ((long[]) obj).length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object[] mo43807s() {
        return new long[8][];
    }

    public final String toString() {
        long[] jArr = (long[]) mo43645b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f107879b), Arrays.toString(jArr)});
        }
        return String.format("%s[length=%d, chunks=%d]%s...", new Object[]{getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f107879b), Arrays.toString(Arrays.copyOf(jArr, 200))});
    }

    /* renamed from: u */
    public C41040H mo43796u() {
        return new C41231b2(this, 0, this.f107879b, 0, this.f107878a);
    }
}
