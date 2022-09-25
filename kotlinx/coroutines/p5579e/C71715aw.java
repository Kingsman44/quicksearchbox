package kotlinx.coroutines.p5579e;

import kotlinx.coroutines.C71686dv;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.e.aw */
/* compiled from: PG */
public final class C71715aw {

    /* renamed from: a */
    public static final C71708ap f191181a = new C71708ap("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C69630p f191182b = C71712at.f191178a;

    /* renamed from: c */
    private static final C69630p f191183c = C71713au.f191179a;

    /* renamed from: d */
    private static final C69630p f191184d = C71714av.f191180a;

    /* renamed from: a */
    public static final Object m104855a(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        Object fold = oVar.fold(0, f191182b);
        C69664n.m101058d(fold);
        return fold;
    }

    /* renamed from: b */
    public static final Object m104856b(C69585o oVar, Object obj) {
        C69664n.m101061g(oVar, "context");
        if (obj == null) {
            obj = m104855a(oVar);
        }
        if (obj == 0) {
            return f191181a;
        }
        if (obj instanceof Integer) {
            return oVar.fold(new C71718az(oVar, ((Number) obj).intValue()), f191184d);
        }
        C69664n.m101059e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((C71686dv) obj).mo51648a(oVar);
    }

    /* renamed from: c */
    public static final void m104857c(C69585o oVar, Object obj) {
        C69664n.m101061g(oVar, "context");
        if (obj != f191181a) {
            if (obj instanceof C71718az) {
                C71718az azVar = (C71718az) obj;
                C69664n.m101061g(oVar, "context");
                int length = azVar.f191189c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        C71686dv dvVar = azVar.f191189c[length];
                        C69664n.m101058d(dvVar);
                        dvVar.mo51649b(oVar, azVar.f191188b[length]);
                        if (i >= 0) {
                            length = i;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = oVar.fold((Object) null, f191183c);
                C69664n.m101059e(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((C71686dv) fold).mo51649b(oVar, obj);
            }
        }
    }
}
