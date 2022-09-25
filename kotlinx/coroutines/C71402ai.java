package kotlinx.coroutines;

import com.google.apps.tiktok.tracing.C47824ff;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: kotlinx.coroutines.ai */
/* compiled from: PG */
final class C71402ai extends C69665o implements C69630p {

    /* renamed from: a */
    public static final C71402ai f190608a = new C71402ai();

    public C71402ai() {
        super(2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        C69585o oVar = (C69585o) obj;
        C69582l lVar = (C69582l) obj2;
        C69664n.m101061g(oVar, "result");
        C69664n.m101061g(lVar, "element");
        if (!(lVar instanceof C47824ff)) {
            return oVar.plus(lVar);
        }
        C47824ff ffVar = (C47824ff) lVar;
        return oVar.plus(new C47824ff());
    }
}
