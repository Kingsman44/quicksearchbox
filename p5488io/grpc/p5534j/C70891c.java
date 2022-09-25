package p5488io.grpc.p5534j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p5488io.grpc.C70276ce;
import p5488io.grpc.C70279ch;

/* renamed from: io.grpc.j.c */
/* compiled from: PG */
final class C70891c extends C70893e {

    /* renamed from: a */
    private static final AtomicIntegerFieldUpdater f189081a = AtomicIntegerFieldUpdater.newUpdater(C70891c.class, C45240c.f118157a);

    /* renamed from: b */
    private final List f189082b;

    /* renamed from: c */
    private volatile int f189083c;

    public C70891c(List list, int i) {
        C58838bb.m90869d(!list.isEmpty(), "empty list");
        this.f189082b = list;
        this.f189083c = i - 1;
    }

    /* renamed from: a */
    public final C70276ce mo61957a() {
        int size = this.f189082b.size();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f189081a;
        int incrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
        if (incrementAndGet >= size) {
            int i = incrementAndGet % size;
            atomicIntegerFieldUpdater.compareAndSet(this, incrementAndGet, i);
            incrementAndGet = i;
        }
        return C70276ce.m102451c((C70279ch) this.f189082b.get(incrementAndGet));
    }

    /* renamed from: b */
    public final boolean mo62584b(C70893e eVar) {
        if (!(eVar instanceof C70891c)) {
            return false;
        }
        C70891c cVar = (C70891c) eVar;
        if (cVar == this || (this.f189082b.size() == cVar.f189082b.size() && new HashSet(this.f189082b).containsAll(cVar.f189082b))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C58830au a = C58831av.m90828a(C70891c.class);
        a.mo56102b("list", this.f189082b);
        return a.toString();
    }
}
