package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71728j;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bb */
/* compiled from: PG */
public final class C71601bb {
    /* renamed from: a */
    public static final String m104526a(Object obj) {
        C69664n.m101061g(obj, "<this>");
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m104527b(Object obj) {
        C69664n.m101061g(obj, "<this>");
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m104528c(C69577g gVar) {
        String str;
        C69664n.m101061g(gVar, "<this>");
        if (gVar instanceof C71728j) {
            return gVar.toString();
        }
        try {
            str = gVar + "@" + m104527b(gVar);
        } catch (Throwable th) {
            str = C69714l.m101133a(th);
        }
        Throwable a = C69702k.m101124a(str);
        String str2 = str;
        if (a != null) {
            str2 = gVar.getClass().getName() + "@" + m104527b(gVar);
        }
        return (String) str2;
    }
}
