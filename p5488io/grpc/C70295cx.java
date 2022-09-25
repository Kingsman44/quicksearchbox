package p5488io.grpc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: io.grpc.cx */
/* compiled from: PG */
public final class C70295cx implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ C70296cy f187363a;

    /* renamed from: b */
    private boolean f187364b = true;

    /* renamed from: c */
    private int f187365c;

    public C70295cx(C70296cy cyVar) {
        this.f187363a = cyVar;
        this.f187365c = cyVar.f187367b;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        if (this.f187364b) {
            return true;
        }
        while (true) {
            int i = this.f187365c;
            C70296cy cyVar = this.f187363a;
            C70334de deVar = cyVar.f187368c;
            if (i >= deVar.f187484f) {
                return false;
            }
            if (Arrays.equals(cyVar.f187366a.f187371b, deVar.mo62036k(i))) {
                this.f187364b = true;
                return true;
            }
            this.f187365c++;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f187364b = false;
            C70296cy cyVar = this.f187363a;
            C70334de deVar = cyVar.f187368c;
            int i = this.f187365c;
            this.f187365c = i + 1;
            return deVar.mo62029d(i, cyVar.f187366a);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
