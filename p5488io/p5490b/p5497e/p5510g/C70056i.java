package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: io.b.e.g.i */
/* compiled from: PG */
final class C70056i extends AtomicBoolean implements Runnable, C69803b {
    private static final long serialVersionUID = -2421395018820541164L;

    /* renamed from: a */
    final Runnable f186744a;

    public C70056i(Runnable runnable) {
        this.f186744a = runnable;
    }

    public final void dispose() {
        lazySet(true);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        if (!get()) {
            try {
                this.f186744a.run();
            } finally {
                lazySet(true);
            }
        }
    }
}
