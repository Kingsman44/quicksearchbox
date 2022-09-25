package p3186j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p3186j$.util.Collection;
import p3186j$.util.List;
import p3186j$.util.Objects;

/* renamed from: j$.util.stream.U1 */
final class C41206U1 extends C41198S1 {

    /* renamed from: d */
    private ArrayList f107815d;

    C41206U1(C41171L1 l1, Comparator comparator) {
        super(l1, comparator);
    }

    public final void accept(Object obj) {
        this.f107815d.add(obj);
    }

    /* renamed from: c */
    public final void mo43663c(long j) {
        ArrayList arrayList;
        if (j < 2147483639) {
            if (j >= 0) {
                int i = (int) j;
            } else {
                arrayList = new ArrayList();
            }
            this.f107815d = arrayList;
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    public final void end() {
        List.EL.sort(this.f107815d, this.f107807b);
        C41171L1 l1 = this.f107737a;
        l1.mo43663c((long) this.f107815d.size());
        if (!this.f107808c) {
            ArrayList arrayList = this.f107815d;
            Objects.requireNonNull(l1);
            Collection.EL.forEach(arrayList, new C41224a(6, l1));
        } else {
            Iterator it = this.f107815d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (l1.mo43664e()) {
                    break;
                }
                l1.accept(next);
            }
        }
        l1.end();
        this.f107815d = null;
    }
}
