package p5488io.grpc.p5525e;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: io.grpc.e.ec */
/* compiled from: PG */
public abstract class C70468ec {

    /* renamed from: b */
    public final Set f187818b = Collections.newSetFromMap(new IdentityHashMap());

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo62004a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo62005b();

    /* renamed from: c */
    public final void mo62188c(Object obj, boolean z) {
        int size = this.f187818b.size();
        if (z) {
            this.f187818b.add(obj);
            if (size == 0) {
                mo62004a();
            }
        } else if (this.f187818b.remove(obj) && size == 1) {
            mo62005b();
        }
    }
}
