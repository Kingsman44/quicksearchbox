package p5589m;

import java.util.RandomAccess;
import p5462h.p5463a.C69524h;

/* renamed from: m.n */
/* compiled from: PG */
public final class C71837n extends C69524h implements RandomAccess {

    /* renamed from: a */
    public static final C71836m f191362a = new C71836m();

    /* renamed from: b */
    public final C71832i[] f191363b;

    /* renamed from: c */
    public final int[] f191364c;

    public C71837n(C71832i[] iVarArr, int[] iArr) {
        this.f191363b = iVarArr;
        this.f191364c = iArr;
    }

    /* renamed from: a */
    public final int mo61249a() {
        return this.f191363b.length;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C71832i)) {
            return false;
        }
        return super.contains((C71832i) obj);
    }

    public final /* synthetic */ Object get(int i) {
        return this.f191363b[i];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof C71832i)) {
            return -1;
        }
        return super.indexOf((C71832i) obj);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C71832i)) {
            return -1;
        }
        return super.lastIndexOf((C71832i) obj);
    }
}
