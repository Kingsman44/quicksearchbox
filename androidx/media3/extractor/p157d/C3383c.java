package androidx.media3.extractor.p157d;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3636z;
import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.extractor.d.c */
/* compiled from: PG */
final class C3383c extends C3385e {

    /* renamed from: a */
    public long f10246a = -9223372036854775807L;

    /* renamed from: b */
    public long[] f10247b = new long[0];

    /* renamed from: c */
    public long[] f10248c = new long[0];

    public C3383c() {
        super(new C3636z());
    }

    /* renamed from: d */
    private static Double m9783d(C2604ac acVar) {
        return Double.valueOf(Double.longBitsToDouble(acVar.mo6145m()));
    }

    /* renamed from: f */
    private static String m9785f(C2604ac acVar) {
        int j = acVar.mo6142j();
        int i = acVar.f7235b;
        acVar.mo6131A(i + j);
        return new String(acVar.f7234a, i, j);
    }

    /* renamed from: g */
    private static HashMap m9786g(C2604ac acVar) {
        int i = acVar.mo6141i();
        HashMap hashMap = new HashMap(i);
        for (int i2 = 0; i2 < i; i2++) {
            String f = m9785f(acVar);
            Object e = m9784e(acVar, acVar.mo6139g());
            if (e != null) {
                hashMap.put(f, e);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7368a(C2604ac acVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo7369b(C2604ac acVar, long j) {
        if (acVar.mo6139g() != 2 || !"onMetaData".equals(m9785f(acVar)) || acVar.f7236c - acVar.f7235b == 0 || acVar.mo6139g() != 8) {
            return false;
        }
        HashMap g = m9786g(acVar);
        Object obj = g.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > C59203do.f157270a) {
                this.f10246a = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = g.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f10247b = new long[size];
                this.f10248c = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f10247b = new long[0];
                        this.f10248c = new long[0];
                    } else {
                        this.f10247b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f10248c[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f10247b = new long[0];
                this.f10248c = new long[0];
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m9784e(androidx.media3.common.p136b.C2604ac r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007d
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x0071
            r1 = 2
            if (r5 == r1) goto L_0x006c
            r2 = 3
            if (r5 == r2) goto L_0x0050
            r2 = 8
            if (r5 == r2) goto L_0x004b
            r2 = 10
            if (r5 == r2) goto L_0x002f
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m9783d(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            int r0 = r4.f7235b
            int r0 = r0 + r1
            r4.mo6131A(r0)
            return r5
        L_0x002f:
            int r5 = r4.mo6141i()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0038:
            if (r0 >= r5) goto L_0x004a
            int r2 = r4.mo6139g()
            java.lang.Object r2 = m9784e(r4, r2)
            if (r2 == 0) goto L_0x0047
            r1.add(r2)
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x004a:
            return r1
        L_0x004b:
            java.util.HashMap r4 = m9786g(r4)
            return r4
        L_0x0050:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0055:
            java.lang.String r0 = m9785f(r4)
            int r1 = r4.mo6139g()
            r2 = 9
            if (r1 != r2) goto L_0x0062
            return r5
        L_0x0062:
            java.lang.Object r1 = m9784e(r4, r1)
            if (r1 == 0) goto L_0x0055
            r5.put(r0, r1)
            goto L_0x0055
        L_0x006c:
            java.lang.String r4 = m9785f(r4)
            return r4
        L_0x0071:
            int r4 = r4.mo6139g()
            if (r4 != r1) goto L_0x0078
            r0 = 1
        L_0x0078:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007d:
            java.lang.Double r4 = m9783d(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p157d.C3383c.m9784e(androidx.media3.common.b.ac, int):java.lang.Object");
    }
}
