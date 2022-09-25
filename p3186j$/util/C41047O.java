package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.O */
public abstract class C41047O implements C41039G {

    /* renamed from: a */
    private final int f107511a = 1296;

    /* renamed from: b */
    private long f107512b = Long.MAX_VALUE;

    /* renamed from: c */
    private int f107513c;

    protected C41047O() {
    }

    public final int characteristics() {
        return this.f107511a;
    }

    public final long estimateSize() {
        return this.f107512b;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C41333y.m72296d(this, consumer);
    }

    public final void forEachRemaining(Object obj) {
        while (true) {
            mo43449f((IntConsumer) obj);
        }
    }

    /* renamed from: g */
    public final void mo43450g(IntConsumer intConsumer) {
        while (true) {
            mo43449f(intConsumer);
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C41333y.m72299j(this, consumer);
    }

    public final Spliterator trySplit() {
        C41046N n = new C41046N();
        long j = this.f107512b;
        if (j <= 1) {
            return null;
        }
        mo43449f(n);
        int i = this.f107513c + 1024;
        if (((long) i) > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        int[] iArr = new int[i];
        int i2 = 0;
        while (true) {
            iArr[i2] = n.f107510a;
            i2++;
            if (i2 >= i) {
                break;
            }
            mo43449f(n);
        }
        this.f107513c = i2;
        long j2 = this.f107512b;
        if (j2 != Long.MAX_VALUE) {
            this.f107512b = j2 - ((long) i2);
        }
        return new C41055X(iArr, 0, i2, this.f107511a);
    }
}
