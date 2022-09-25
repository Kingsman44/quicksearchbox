package p5462h.p5466c;

import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: h.c.n */
/* compiled from: PG */
final class C69584n extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C69584n f185990a = new C69584n();

    public C69584n() {
        super(2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C69585o oVar = (C69585o) obj;
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(oVar, "acc");
        C69664n.m101061g(lVar, "element");
        C69585o minusKey = oVar.minusKey(lVar.getKey());
        if (minusKey == C69586p.f185991a) {
            return lVar;
        }
        C69579i iVar = (C69579i) minusKey.get(C69579i.f185989a);
        if (iVar == null) {
            return new C69576f(minusKey, lVar);
        }
        C69585o minusKey2 = minusKey.minusKey(C69579i.f185989a);
        if (minusKey2 == C69586p.f185991a) {
            return new C69576f(lVar, iVar);
        }
        return new C69576f(new C69576f(minusKey2, lVar), iVar);
    }
}
