package p3186j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.J */
final class C41042J implements Iterator, Consumer {

    /* renamed from: a */
    boolean f107498a = false;

    /* renamed from: b */
    Object f107499b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f107500c;

    C41042J(Spliterator spliterator) {
        this.f107500c = spliterator;
    }

    public final void accept(Object obj) {
        this.f107498a = true;
        this.f107499b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final boolean hasNext() {
        if (!this.f107498a) {
            this.f107500c.tryAdvance(this);
        }
        return this.f107498a;
    }

    public final Object next() {
        if (this.f107498a || hasNext()) {
            this.f107498a = false;
            return this.f107499b;
        }
        throw new NoSuchElementException();
    }
}
