package p5462h.p5463a;

import java.util.AbstractList;
import java.util.List;
import p5462h.p5473f.p5475b.p5476a.C69641b;

/* renamed from: h.a.j */
/* compiled from: PG */
public abstract class C69526j extends AbstractList implements List, C69641b {
    protected C69526j() {
    }

    /* renamed from: a */
    public abstract int mo61066a();

    /* renamed from: b */
    public abstract Object mo61071b(int i);

    public final /* bridge */ Object remove(int i) {
        return mo61071b(i);
    }

    public final /* bridge */ int size() {
        return mo61066a();
    }
}
