package p3186j$.util.concurrent;

import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.Spliterator;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.IntFunction;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Stream;

/* renamed from: j$.util.concurrent.s */
final class C41082s extends C41065b implements Collection {
    C41082s(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.f107595a.containsValue(obj);
    }

    public final void forEach(Consumer consumer) {
        if (consumer != null) {
            C41074k[] kVarArr = this.f107595a.f107579a;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c != null) {
                        consumer.accept(c.f107607c);
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw null;
        }
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        C41074k[] kVarArr = concurrentHashMap.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        return new C41071h(kVarArr, length, length, concurrentHashMap, 1);
    }

    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    public final boolean remove(Object obj) {
        C41064a aVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            aVar = (C41064a) it;
            if (!aVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C41071h) it).next()));
        aVar.remove();
        return true;
    }

    public final boolean removeAll(java.util.Collection collection) {
        if (collection != null) {
            Iterator it = iterator();
            boolean z = false;
            while (true) {
                C41064a aVar = (C41064a) it;
                if (!aVar.hasNext()) {
                    return z;
                }
                if (collection.contains(((C41071h) it).next())) {
                    aVar.remove();
                    z = true;
                }
            }
        } else {
            throw null;
        }
    }

    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        if (predicate != null) {
            C41074k[] kVarArr = concurrentHashMap.f107579a;
            boolean z = false;
            if (kVarArr != null) {
                C41079p pVar = new C41079p(kVarArr, kVarArr.length, 0, kVarArr.length);
                while (true) {
                    C41074k c = pVar.mo43572c();
                    if (c == null) {
                        break;
                    }
                    Object obj = c.f107606b;
                    Object obj2 = c.f107607c;
                    if (predicate.test(obj2) && concurrentHashMap.mo43528h(obj, (Object) null, obj2) != null) {
                        z = true;
                    }
                }
            }
            return z;
        }
        concurrentHashMap.getClass();
        throw null;
    }

    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f107595a;
        long k = concurrentHashMap.mo43529k();
        C41074k[] kVarArr = concurrentHashMap.f107579a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        long j = 0;
        if (k >= 0) {
            j = k;
        }
        return new C41072i(kVarArr, length, 0, length, j, 1);
    }

    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }
}
