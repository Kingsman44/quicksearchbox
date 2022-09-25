package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.stream.T0 */
final class C41201T0 extends C41197S0 implements C41253h0 {
    C41201T0(long j) {
        super(j);
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final void accept(long j) {
        int i = this.f107806b;
        long[] jArr = this.f107805a;
        if (i < jArr.length) {
            this.f107806b = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(jArr.length)}));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo43738j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    public final C41269l0 build() {
        int i = this.f107806b;
        long[] jArr = this.f107805a;
        if (i >= jArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107806b), Integer.valueOf(jArr.length)}));
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        long[] jArr = this.f107805a;
        if (j == ((long) jArr.length)) {
            this.f107806b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(jArr.length)}));
        }
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
        int i = this.f107806b;
        long[] jArr = this.f107805a;
        if (i < jArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f107806b), Integer.valueOf(jArr.length)}));
        }
    }

    /* renamed from: j */
    public final /* synthetic */ void mo43738j(Long l) {
        C41241e0.m72091i(this, l);
    }

    public final String toString() {
        long[] jArr = this.f107805a;
        return String.format("LongFixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(jArr.length - this.f107806b), Arrays.toString(jArr)});
    }
}
