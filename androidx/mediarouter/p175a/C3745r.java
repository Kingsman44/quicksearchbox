package androidx.mediarouter.p175a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: androidx.mediarouter.a.r */
/* compiled from: PG */
public class C3745r extends C3748u {

    /* renamed from: j */
    public final Object f12022j = new Object();

    /* renamed from: k */
    Executor f12023k;

    /* renamed from: l */
    C3739l f12024l;

    /* renamed from: m */
    Collection f12025m;

    /* renamed from: n */
    C3670af f12026n;

    /* renamed from: k */
    public final void mo7911k(C3739l lVar, Collection collection) {
        if (lVar != null) {
            synchronized (this.f12022j) {
                Executor executor = this.f12023k;
                if (executor != null) {
                    executor.execute(new C3743p(this, this.f12026n, lVar, collection));
                } else {
                    this.f12024l = lVar;
                    this.f12025m = new ArrayList(collection);
                }
            }
            return;
        }
        throw new NullPointerException("groupRoute must not be null");
    }
}
