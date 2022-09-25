package p3186j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.h */
final class C41071h extends C41064a implements Iterator, Enumeration, p3186j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f107599k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41071h(C41074k[] kVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(kVarArr, i, i2, concurrentHashMap);
        this.f107599k = i3;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f107599k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    public final Object next() {
        switch (this.f107599k) {
            case 0:
                C41074k kVar = this.f107614b;
                if (kVar != null) {
                    this.f107594j = kVar;
                    mo43572c();
                    return kVar.f107606b;
                }
                throw new NoSuchElementException();
            default:
                C41074k kVar2 = this.f107614b;
                if (kVar2 != null) {
                    Object obj = kVar2.f107607c;
                    this.f107594j = kVar2;
                    mo43572c();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    public final Object nextElement() {
        switch (this.f107599k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
