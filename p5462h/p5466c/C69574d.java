package p5462h.p5466c;

import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: h.c.d */
/* compiled from: PG */
final class C69574d extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C69574d f185983a = new C69574d();

    public C69574d() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        String str = (String) obj;
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(str, "acc");
        C69664n.m101061g(lVar, "element");
        if (str.length() == 0) {
            return lVar.toString();
        }
        return str + ", " + lVar;
    }
}
