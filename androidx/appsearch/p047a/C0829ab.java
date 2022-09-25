package androidx.appsearch.p047a;

import androidx.core.p097i.C1968c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.appsearch.a.ab */
/* compiled from: PG */
public final class C0829ab implements Iterable {

    /* renamed from: a */
    private final List f2790a = new ArrayList();

    public C0829ab(String str) {
        try {
            m2682c(str);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage() + ": " + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2682c(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r9.length()
            r3 = 46
            r4 = 93
            r5 = 1
            r6 = -1
            if (r1 >= r2) goto L_0x002a
            char r2 = r9.charAt(r1)
            if (r2 == r4) goto L_0x0022
            r7 = 91
            if (r2 == r7) goto L_0x001e
            if (r2 != r3) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x001e:
            if (r2 != r7) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x0022:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed path (no starting '[')"
            r9.<init>(r0)
            throw r9
        L_0x002a:
            r1 = -1
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x00d2
            boolean r7 = r9.isEmpty()
            if (r7 != 0) goto L_0x00d2
            if (r1 != r6) goto L_0x0041
            java.util.List r0 = r8.f2790a
            androidx.appsearch.a.aa r1 = new androidx.appsearch.a.aa
            r1.<init>(r9, r6)
            r0.add(r1)
            return
        L_0x0041:
            if (r2 != 0) goto L_0x0057
            java.lang.String r0 = r9.substring(r0, r1)
            int r1 = r1 + r5
            java.lang.String r9 = r9.substring(r1)
            java.util.List r1 = r8.f2790a
            androidx.appsearch.a.aa r2 = new androidx.appsearch.a.aa
            r2.<init>(r0, r6)
            r1.add(r2)
            goto L_0x00a5
        L_0x0057:
            r9.getClass()
            java.lang.String r0 = r9.substring(r0, r1)
            int r2 = r9.indexOf(r4, r1)
            if (r2 == r6) goto L_0x00ca
            int r4 = r2 + 1
            int r6 = r9.length()
            if (r4 >= r6) goto L_0x007f
            char r6 = r9.charAt(r4)
            if (r6 != r3) goto L_0x0073
            goto L_0x007f
        L_0x0073:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Malformed path (']' not followed by '.'): "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L_0x007f:
            int r1 = r1 + r5
            java.lang.String r1 = r9.substring(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00b1 }
            if (r1 < 0) goto L_0x00a9
            java.util.List r3 = r8.f2790a
            androidx.appsearch.a.aa r5 = new androidx.appsearch.a.aa
            r5.<init>(r0, r1)
            r3.add(r5)
            int r0 = r9.length()
            if (r4 >= r0) goto L_0x00a1
            int r2 = r2 + 2
            java.lang.String r9 = r9.substring(r2)
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            if (r9 != 0) goto L_0x00a5
            return
        L_0x00a5:
            r8.m2682c(r9)
            return
        L_0x00a9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed path (path index less than 0)"
            r9.<init>(r0)
            throw r9
        L_0x00b1:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Malformed path (\""
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r1 = "\" as path index)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00ca:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed path (no ending ']')"
            r9.<init>(r0)
            throw r9
        L_0x00d2:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Malformed path (blank property name)"
            r9.<init>(r0)
            goto L_0x00db
        L_0x00da:
            throw r9
        L_0x00db:
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appsearch.p047a.C0829ab.m2682c(java.lang.String):void");
    }

    /* renamed from: a */
    public final int mo3376a() {
        return this.f2790a.size();
    }

    /* renamed from: b */
    public final C0828aa mo3377b(int i) {
        return (C0828aa) this.f2790a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0829ab)) {
            return C1968c.m5305b(this.f2790a, ((C0829ab) obj).f2790a);
        }
        return false;
    }

    public final int hashCode() {
        return C1968c.m5304a(this.f2790a);
    }

    public final Iterator iterator() {
        return this.f2790a.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f2790a.size(); i++) {
            sb.append(mo3377b(i).toString());
            if (i < this.f2790a.size() - 1) {
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
