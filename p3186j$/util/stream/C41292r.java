package p3186j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r */
final class C41292r extends C41135C1 {
    C41292r(C41232c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: q0 */
    static C41297s0 m72204q0(C41232c cVar, Spliterator spliterator) {
        C41281o0 o0Var = new C41281o0(24);
        C41281o0 o0Var2 = new C41281o0(25);
        C41281o0 o0Var3 = new C41281o0(26);
        Objects.requireNonNull(o0Var);
        Objects.requireNonNull(o0Var2);
        Objects.requireNonNull(o0Var3);
        return new C41297s0((Collection) new C41258i1(C41263j2.REFERENCE, o0Var3, o0Var2, o0Var, 2).mo43758a(cVar, spliterator));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final C41277n0 mo43779i0(Spliterator spliterator, IntFunction intFunction, C41232c cVar) {
        if (C41259i2.DISTINCT.mo43855g(cVar.mo43815P())) {
            return cVar.mo43818Z(spliterator, false, intFunction);
        }
        if (C41259i2.ORDERED.mo43855g(cVar.mo43815P())) {
            return m72204q0(cVar, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C41252h hVar = new C41252h(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(hVar);
        new C41157I(hVar, false).mo43758a(cVar, spliterator);
        Set keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add((Object) null);
            keySet = hashSet;
        }
        return new C41297s0(keySet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final Spliterator mo43780j0(C41232c cVar, Spliterator spliterator) {
        return C41259i2.DISTINCT.mo43855g(cVar.mo43815P()) ? cVar.mo43825p0(spliterator) : C41259i2.ORDERED.mo43855g(cVar.mo43815P()) ? m72204q0(cVar, spliterator).spliterator() : new C41287p2(cVar.mo43825p0(spliterator));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        Objects.requireNonNull(l1);
        return C41259i2.DISTINCT.mo43855g(i) ? l1 : C41259i2.SORTED.mo43855g(i) ? new C41284p(l1) : new C41288q(l1);
    }
}
