package p5462h.p5463a.p5464a;

import java.util.Arrays;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.a.d */
/* compiled from: PG */
public final class C69470d {
    /* renamed from: a */
    public static final void m100780a(Object[] objArr, int i) {
        C69664n.m101061g(objArr, "<this>");
        objArr[i] = null;
    }

    /* renamed from: b */
    public static final void m100781b(Object[] objArr, int i, int i2) {
        C69664n.m101061g(objArr, "<this>");
        while (i < i2) {
            m100780a(objArr, i);
            i++;
        }
    }

    /* renamed from: c */
    public static final Object[] m100782c(Object[] objArr, int i) {
        C69664n.m101061g(objArr, "<this>");
        Object[] copyOf = Arrays.copyOf(objArr, i);
        C69664n.m101060f(copyOf, "copyOf(this, newSize)");
        C69664n.m101059e(copyOf, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements>");
        return copyOf;
    }
}
