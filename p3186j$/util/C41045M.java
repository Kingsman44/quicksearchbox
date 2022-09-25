package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;

/* renamed from: j$.util.M */
final class C41045M implements C41334z, DoubleConsumer, Iterator {

    /* renamed from: a */
    boolean f107507a = false;

    /* renamed from: b */
    double f107508b;

    /* renamed from: c */
    final /* synthetic */ C41038F f107509c;

    C41045M(C41038F f) {
        this.f107509c = f;
    }

    public final void accept(double d) {
        this.f107507a = true;
        this.f107508b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer.CC.$default$andThen(this, doubleConsumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) consumer;
            Objects.requireNonNull(doubleConsumer);
            while (hasNext()) {
                if (this.f107507a || hasNext()) {
                    this.f107507a = false;
                    doubleConsumer.accept(this.f107508b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            C41332x xVar = new C41332x(consumer);
            Objects.requireNonNull(xVar);
            while (hasNext()) {
                if (this.f107507a || hasNext()) {
                    this.f107507a = false;
                    xVar.accept(this.f107508b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        C41063c0.m71673a(C41045M.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
        throw null;
    }

    public final boolean hasNext() {
        if (!this.f107507a) {
            this.f107509c.mo43447i(this);
        }
        return this.f107507a;
    }

    public final Object next() {
        if (C41063c0.f107569a) {
            C41063c0.m71673a(C41045M.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        } else if (this.f107507a || hasNext()) {
            this.f107507a = false;
            return Double.valueOf(this.f107508b);
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
