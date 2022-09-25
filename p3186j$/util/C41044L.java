package p3186j$.util;

import java.util.NoSuchElementException;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.L */
final class C41044L implements C41036D, LongConsumer, Iterator {

    /* renamed from: a */
    boolean f107504a = false;

    /* renamed from: b */
    long f107505b;

    /* renamed from: c */
    final /* synthetic */ C41040H f107506c;

    C41044L(C41040H h) {
        this.f107506c = h;
    }

    public final void accept(long j) {
        this.f107504a = true;
        this.f107505b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer.CC.$default$andThen(this, longConsumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            LongConsumer longConsumer = (LongConsumer) consumer;
            Objects.requireNonNull(longConsumer);
            while (hasNext()) {
                if (this.f107504a || hasNext()) {
                    this.f107504a = false;
                    longConsumer.accept(this.f107505b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        Objects.requireNonNull(consumer);
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            C41035C c = new C41035C(consumer);
            Objects.requireNonNull(c);
            while (hasNext()) {
                if (this.f107504a || hasNext()) {
                    this.f107504a = false;
                    c.accept(this.f107505b);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return;
        }
        C41063c0.m71673a(C41044L.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
        throw null;
    }

    public final boolean hasNext() {
        if (!this.f107504a) {
            this.f107506c.mo43452b(this);
        }
        return this.f107504a;
    }

    public final Object next() {
        if (C41063c0.f107569a) {
            C41063c0.m71673a(C41044L.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        } else if (this.f107504a || hasNext()) {
            this.f107504a = false;
            return Long.valueOf(this.f107505b);
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
