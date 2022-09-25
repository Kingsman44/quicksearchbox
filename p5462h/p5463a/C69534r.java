package p5462h.p5463a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.r */
/* compiled from: PG */
class C69534r extends C69533q {
    /* renamed from: a */
    public static final List m100923a(Object[] objArr) {
        C69664n.m101061g(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        C69664n.m101060f(asList, "asList(this)");
        return asList;
    }

    /* renamed from: b */
    public static final void m100924b(Object[] objArr, Object obj, int i, int i2) {
        C69664n.m101061g(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    /* renamed from: c */
    public static final void m100925c(Object[] objArr, Comparator comparator) {
        C69664n.m101061g(objArr, "<this>");
        C69664n.m101061g(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* renamed from: d */
    public static final void m100926d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        C69664n.m101061g(bArr, "<this>");
        C69664n.m101061g(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* renamed from: e */
    public static final void m100927e(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C69664n.m101061g(iArr, "<this>");
        C69664n.m101061g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    /* renamed from: f */
    public static final void m100928f(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        C69664n.m101061g(objArr, "<this>");
        C69664n.m101061g(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m100929g(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        C69531o.m100928f(objArr, objArr2, i, i2, i3);
    }
}
