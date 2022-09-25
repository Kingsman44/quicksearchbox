package p3186j$.util.stream;

import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.stream.R2 */
final class C41195R2 extends C41184O2 implements Stream.Builder {

    /* renamed from: b */
    Object f107803b;

    /* renamed from: c */
    C41247f2 f107804c;

    C41195R2() {
    }

    C41195R2(Object obj) {
        this.f107803b = obj;
        this.f107779a = -2;
    }

    public final void accept(Object obj) {
        int i = this.f107779a;
        if (i == 0) {
            this.f107803b = obj;
            this.f107779a = i + 1;
        } else if (i > 0) {
            if (this.f107804c == null) {
                C41247f2 f2Var = new C41247f2();
                this.f107804c = f2Var;
                f2Var.accept(this.f107803b);
                this.f107779a++;
            }
            this.f107804c.accept(obj);
        } else {
            throw new IllegalStateException();
        }
    }

    public final Stream.Builder add(Object obj) {
        accept(obj);
        return this;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Stream build() {
        int i = this.f107779a;
        if (i >= 0) {
            this.f107779a = (-i) - 1;
            return i < 2 ? StreamSupport.stream(this, false) : StreamSupport.stream(this.f107804c.spliterator(), false);
        }
        throw new IllegalStateException();
    }

    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f107779a == -2) {
            consumer.accept(this.f107803b);
            this.f107779a = -1;
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f107779a != -2) {
            return false;
        }
        consumer.accept(this.f107803b);
        this.f107779a = -1;
        return true;
    }
}
