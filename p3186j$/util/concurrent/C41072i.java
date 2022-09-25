package p3186j$.util.concurrent;

import java.util.Comparator;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.i */
final class C41072i extends C41079p implements Spliterator {

    /* renamed from: i */
    public final /* synthetic */ int f107600i;

    /* renamed from: j */
    long f107601j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41072i(C41074k[] kVarArr, int i, int i2, int i3, long j, int i4) {
        super(kVarArr, i, i2, i3);
        this.f107600i = i4;
        this.f107601j = j;
    }

    public final int characteristics() {
        switch (this.f107600i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    public final long estimateSize() {
        switch (this.f107600i) {
            case 0:
                return this.f107601j;
            default:
                return this.f107601j;
        }
    }

    public final void forEachRemaining(Consumer consumer) {
        switch (this.f107600i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C41074k c = mo43572c();
                    if (c != null) {
                        consumer.accept(c.f107606b);
                    } else {
                        return;
                    }
                }
            default:
                if (consumer != null) {
                    while (true) {
                        C41074k c2 = mo43572c();
                        if (c2 != null) {
                            consumer.accept(c2.f107607c);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw null;
                }
        }
    }

    public final /* synthetic */ Comparator getComparator() {
        switch (this.f107600i) {
            case 0:
                return Spliterator.CC.$default$getComparator(this);
            default:
                return Spliterator.CC.$default$getComparator(this);
        }
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f107600i) {
            case 0:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            default:
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f107600i) {
            case 0:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
            default:
                return Spliterator.CC.$default$hasCharacteristics(this, i);
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f107600i) {
            case 0:
                consumer.getClass();
                C41074k c = mo43572c();
                if (c == null) {
                    return false;
                }
                consumer.accept(c.f107606b);
                return true;
            default:
                consumer.getClass();
                C41074k c2 = mo43572c();
                if (c2 == null) {
                    return false;
                }
                consumer.accept(c2.f107607c);
                return true;
        }
    }

    public final Spliterator trySplit() {
        switch (this.f107600i) {
            case 0:
                int i = this.f107618f;
                int i2 = this.f107619g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C41074k[] kVarArr = this.f107613a;
                int i4 = this.f107620h;
                this.f107619g = i3;
                long j = this.f107601j >>> 1;
                this.f107601j = j;
                return new C41072i(kVarArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f107618f;
                int i6 = this.f107619g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C41074k[] kVarArr2 = this.f107613a;
                int i8 = this.f107620h;
                this.f107619g = i7;
                long j2 = this.f107601j >>> 1;
                this.f107601j = j2;
                return new C41072i(kVarArr2, i8, i7, i6, j2, 1);
        }
    }
}
