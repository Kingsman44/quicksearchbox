package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntConsumer;

/* renamed from: j$.util.K */
final class C41043K implements C41034B, IntConsumer, Iterator {

    /* renamed from: a */
    boolean f107501a = false;

    /* renamed from: b */
    int f107502b;

    /* renamed from: c */
    final /* synthetic */ C41039G f107503c;

    C41043K(C41039G g) {
        this.f107503c = g;
    }

    public final void accept(int i) {
        this.f107501a = true;
        this.f107502b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            IntConsumer intConsumer = (IntConsumer) consumer;
            Objects.requireNonNull(intConsumer);
            while (hasNext()) {
                if (this.f107501a || hasNext()) {
                    this.f107501a = false;
                    intConsumer.accept(this.f107502b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            C41033A a = new C41033A(consumer);
            Objects.requireNonNull(a);
            while (hasNext()) {
                if (this.f107501a || hasNext()) {
                    this.f107501a = false;
                    a.accept(this.f107502b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        C41063c0.m71673a(C41043K.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
        throw null;
    }

    public final boolean hasNext() {
        if (!this.f107501a) {
            this.f107503c.mo43449f(this);
        }
        return this.f107501a;
    }

    public final Object next() {
        if (C41063c0.f107569a) {
            C41063c0.m71673a(C41043K.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        } else if (this.f107501a || hasNext()) {
            this.f107501a = false;
            return Integer.valueOf(this.f107502b);
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
