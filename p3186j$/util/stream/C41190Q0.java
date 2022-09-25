package p3186j$.util.stream;

import java.util.ArrayDeque;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.stream.Q0 */
final class C41190Q0 extends C41193R0 {
    C41190Q0(C41277n0 n0Var) {
        super(n0Var);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (this.f107792a != null) {
            if (this.f107795d == null) {
                Spliterator spliterator = this.f107794c;
                if (spliterator == null) {
                    ArrayDeque d = mo43788d();
                    while (true) {
                        C41277n0 c = C41193R0.m71911c(d);
                        if (c != null) {
                            c.forEach(consumer);
                        } else {
                            this.f107792a = null;
                            return;
                        }
                    }
                } else {
                    spliterator.forEachRemaining(consumer);
                }
            } else {
                do {
                } while (tryAdvance(consumer));
            }
        }
    }

    public final boolean tryAdvance(Consumer consumer) {
        C41277n0 c;
        if (!mo43789e()) {
            return false;
        }
        boolean tryAdvance = this.f107795d.tryAdvance(consumer);
        if (!tryAdvance) {
            if (this.f107794c != null || (c = C41193R0.m71911c(this.f107796e)) == null) {
                this.f107792a = null;
            } else {
                Spliterator spliterator = c.spliterator();
                this.f107795d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
        }
        return tryAdvance;
    }
}
