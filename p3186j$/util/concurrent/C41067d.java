package p3186j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.d */
final class C41067d extends C41064a implements Iterator, p3186j$.util.Iterator {
    C41067d(C41074k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, concurrentHashMap);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final Object next() {
        C41074k kVar = this.f107614b;
        if (kVar != null) {
            Object obj = kVar.f107606b;
            Object obj2 = kVar.f107607c;
            this.f107594j = kVar;
            mo43572c();
            return new C41073j(obj, obj2, this.f107593i);
        }
        throw new NoSuchElementException();
    }
}
