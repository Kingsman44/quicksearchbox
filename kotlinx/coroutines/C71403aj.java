package kotlinx.coroutines;

import com.google.apps.tiktok.tracing.C47824ff;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.aj */
/* compiled from: PG */
final class C71403aj extends C69665o implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C69648ae f190609a;

    /* renamed from: b */
    final /* synthetic */ boolean f190610b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71403aj(C69648ae aeVar, boolean z) {
        super(2);
        this.f190609a = aeVar;
        this.f190610b = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C47824ff ffVar;
        C69585o oVar = (C69585o) obj;
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(oVar, "result");
        C69664n.m101061g(lVar, "element");
        if (!(lVar instanceof C47824ff)) {
            return oVar.plus(lVar);
        }
        if (((C69585o) this.f190609a.f186027a).get(lVar.getKey()) == null) {
            if (this.f190610b) {
                C47824ff ffVar2 = (C47824ff) lVar;
                ffVar = new C47824ff();
            } else {
                ffVar = (C47824ff) lVar;
            }
            return oVar.plus(ffVar);
        }
        C69648ae aeVar = this.f190609a;
        aeVar.f186027a = ((C69585o) aeVar.f186027a).minusKey(lVar.getKey());
        C47824ff ffVar3 = (C47824ff) lVar;
        return oVar.plus(new C47824ff());
    }
}
