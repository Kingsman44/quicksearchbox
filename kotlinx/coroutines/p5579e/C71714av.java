package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71686dv;
import p5462h.p5466c.C69582l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.e.av */
/* compiled from: PG */
final class C71714av extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C71714av f191180a = new C71714av();

    public C71714av() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C71718az azVar = (C71718az) obj;
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(azVar, "state");
        C69664n.m101061g(lVar, "element");
        if (lVar instanceof C71686dv) {
            C71686dv dvVar = (C71686dv) lVar;
            Object a = dvVar.mo51648a(azVar.f191187a);
            C69664n.m101061g(dvVar, "element");
            Object[] objArr = azVar.f191188b;
            int i = azVar.f191190d;
            objArr[i] = a;
            C71686dv[] dvVarArr = azVar.f191189c;
            azVar.f191190d = i + 1;
            dvVarArr[i] = dvVar;
        }
        return azVar;
    }
}
