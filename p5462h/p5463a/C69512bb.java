package p5462h.p5463a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;

/* renamed from: h.a.bb */
/* compiled from: PG */
final class C69512bb extends C69526j {

    /* renamed from: a */
    private final List f185928a;

    public C69512bb(List list) {
        C69664n.m101061g(list, "delegate");
        this.f185928a = list;
    }

    /* renamed from: a */
    public final int mo61066a() {
        return this.f185928a.size();
    }

    public final void add(int i, Object obj) {
        List list = this.f185928a;
        if (new C69695c(0, mo61066a()).mo61416c(i)) {
            list.add(mo61066a() - i, obj);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C69695c(0, mo61066a()) + "].");
    }

    /* renamed from: b */
    public final Object mo61071b(int i) {
        return this.f185928a.remove(C69490ag.m100814u(this, i));
    }

    public final void clear() {
        this.f185928a.clear();
    }

    public final Object get(int i) {
        return this.f185928a.get(C69490ag.m100814u(this, i));
    }

    public final Object set(int i, Object obj) {
        return this.f185928a.set(C69490ag.m100814u(this, i), obj);
    }
}
