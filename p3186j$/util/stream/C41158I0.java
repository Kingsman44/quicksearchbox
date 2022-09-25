package p3186j$.util.stream;

import java.util.Arrays;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.I0 */
final class C41158I0 extends C41293r0 implements C41257i0 {
    C41158I0(long j, IntFunction intFunction) {
        super(j, intFunction);
    }

    public final /* synthetic */ void accept(double d) {
        C41241e0.m72086c();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C41241e0.m72093k();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C41241e0.m72094l();
        throw null;
    }

    public final void accept(Object obj) {
        int i = this.f108012b;
        Object[] objArr = this.f108011a;
        if (i < objArr.length) {
            this.f108012b = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(objArr.length)}));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final C41277n0 build() {
        int i = this.f108012b;
        Object[] objArr = this.f108011a;
        if (i >= objArr.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f108012b), Integer.valueOf(objArr.length)}));
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        Object[] objArr = this.f108011a;
        if (j == ((long) objArr.length)) {
            this.f108012b = 0;
        } else {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(objArr.length)}));
        }
    }

    /* renamed from: e */
    public final /* synthetic */ boolean mo43664e() {
        return false;
    }

    public final void end() {
        int i = this.f108012b;
        Object[] objArr = this.f108011a;
        if (i < objArr.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f108012b), Integer.valueOf(objArr.length)}));
        }
    }

    public final String toString() {
        Object[] objArr = this.f108011a;
        return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(objArr.length - this.f108012b), Arrays.toString(objArr)});
    }
}
