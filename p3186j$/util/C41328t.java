package p3186j$.util;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: j$.util.t */
final class C41328t extends C41112g {

    /* renamed from: a */
    private final List f108053a;

    /* renamed from: b */
    private final int f108054b;

    /* renamed from: c */
    private final int f108055c;

    private C41328t(List list, int i, int i2) {
        this.f108053a = list;
        this.f108054b = i;
        this.f108055c = i2;
    }

    /* renamed from: c */
    static C41328t m72294c(List list, int i, int i2) {
        return new C41328t(list, i, i2 - i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(int r9) {
        /*
            r8 = this;
            int r0 = r8.f108055c
            if (r9 < 0) goto L_0x0011
            if (r9 < r0) goto L_0x0007
            goto L_0x0011
        L_0x0007:
            int r0 = r8.f108054b
            int r0 = r0 + r9
            java.util.List r9 = r8.f108053a
            java.lang.Object r9 = r9.get(r0)
            return r9
        L_0x0011:
            r1 = 2
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3 = 0
            r2[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2[r0] = r9
            java.util.List r9 = p3186j$.util.List.CC.m71632c(r2)
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r4 = "checkIndex"
            if (r9 == 0) goto L_0x00c8
            int r5 = r9.size()
            if (r5 == r1) goto L_0x0035
            java.lang.String r5 = ""
            goto L_0x0036
        L_0x0035:
            r5 = r4
        L_0x0036:
            int r6 = r5.hashCode()
            r7 = -538822486(0xffffffffdfe238aa, float:-3.2601932E19)
            if (r6 == r7) goto L_0x0060
            r7 = 1844394469(0x6def39e5, float:9.2546134E27)
            if (r6 == r7) goto L_0x0055
            r7 = 1848935233(0x6e348341, float:1.3966495E28)
            if (r6 == r7) goto L_0x004a
            goto L_0x0066
        L_0x004a:
            java.lang.String r6 = "checkFromIndexSize"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0053
            goto L_0x0066
        L_0x0053:
            r5 = 2
            goto L_0x0069
        L_0x0055:
            java.lang.String r6 = "checkFromToIndex"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            r5 = 1
            goto L_0x0069
        L_0x0060:
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0068
        L_0x0066:
            r5 = -1
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            if (r5 == 0) goto L_0x00b3
            r6 = 3
            if (r5 == r0) goto L_0x0098
            if (r5 == r1) goto L_0x007d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            r1[r0] = r9
            java.lang.String r9 = "Range check failed: %s %s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            goto L_0x00d2
        L_0x007d:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Object r5 = r9.get(r3)
            r4[r3] = r5
            java.lang.Object r3 = r9.get(r0)
            r4[r0] = r3
            java.lang.Object r9 = r9.get(r1)
            r4[r1] = r9
            java.lang.String r9 = "Range [%d, %<d + %d) out of bounds for length %d"
            java.lang.String r9 = java.lang.String.format(r9, r4)
            goto L_0x00d2
        L_0x0098:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Object r5 = r9.get(r3)
            r4[r3] = r5
            java.lang.Object r3 = r9.get(r0)
            r4[r0] = r3
            java.lang.Object r9 = r9.get(r1)
            r4[r1] = r9
            java.lang.String r9 = "Range [%d, %d) out of bounds for length %d"
            java.lang.String r9 = java.lang.String.format(r9, r4)
            goto L_0x00d2
        L_0x00b3:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r4 = r9.get(r3)
            r1[r3] = r4
            java.lang.Object r9 = r9.get(r0)
            r1[r0] = r9
            java.lang.String r9 = "Index %d out of bounds for length %d"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            goto L_0x00d2
        L_0x00c8:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r3] = r4
            java.lang.String r0 = "Range check failed: %s"
            java.lang.String r9 = java.lang.String.format(r0, r9)
        L_0x00d2:
            r2.<init>(r9)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.util.C41328t.get(int):java.lang.Object");
    }

    public final Iterator iterator() {
        return new C41116k(this, this.f108055c);
    }

    public final ListIterator listIterator(int i) {
        int i2;
        if (i >= 0 && i <= (i2 = this.f108055c)) {
            return new C41116k(this, i2, i);
        }
        throw mo43628a(i);
    }

    public final int size() {
        return this.f108055c;
    }

    public final List subList(int i, int i2) {
        C41112g.m71733b(i, i2, this.f108055c);
        return new C41328t(this.f108053a, this.f108054b + i, i2 - i);
    }
}
