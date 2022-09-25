package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71686dv;
import p5462h.p5466c.C69582l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.e.at */
/* compiled from: PG */
final class C71712at extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C71712at f191178a = new C71712at();

    public C71712at() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(lVar, "element");
        if (!(lVar instanceof C71686dv)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? lVar : Integer.valueOf(intValue + 1);
    }
}
