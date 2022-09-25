package com.google.android.apps.gsa.shared.p7048l.p7049a;

import com.google.common.p4526f.C59071e;
import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.l.a.c */
/* compiled from: PG */
public final class C89833c {

    /* renamed from: a */
    static Object f243154a;

    /* renamed from: d */
    private static final C59071e f243155d = C59071e.m91332i("com.google.android.apps.gsa.shared.l.a.c");

    /* renamed from: e */
    private static C89833c f243156e = new C89833c(new C89831a[0]);

    /* renamed from: b */
    public final C89831a[] f243157b;

    /* renamed from: c */
    public final Pattern f243158c;

    public C89833c(C89831a[] aVarArr) {
        Arrays.sort(aVarArr);
        StringBuilder sb = new StringBuilder("(\\Q");
        for (int i = 0; i < aVarArr.length; i++) {
            if (i > 0) {
                sb.append("\\E)|(\\Q");
            }
            String str = aVarArr[i].f243151b;
            int i2 = 0;
            while (true) {
                int indexOf = str.indexOf("\\E", i2);
                if (indexOf == -1) {
                    break;
                }
                int i3 = indexOf + 2;
                sb.append(str, i2, i3);
                sb.append("\\\\E\\Q");
                i2 = i3;
            }
            sb.append(str, i2, str.length());
        }
        sb.append("\\E)");
        this.f243158c = Pattern.compile(sb.toString());
        this.f243157b = aVarArr;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.android.apps.gsa.shared.p7048l.p7049a.C89833c m146253a(android.content.ContentResolver r9) {
        /*
            java.lang.Class<com.google.android.apps.gsa.shared.l.a.c> r0 = com.google.android.apps.gsa.shared.p7048l.p7049a.C89833c.class
            monitor-enter(r0)
            java.lang.Object r1 = com.google.android.p10905k.C146606e.m238840b(r9)     // Catch:{ all -> 0x0086 }
            java.lang.Object r2 = f243154a     // Catch:{ all -> 0x0086 }
            if (r1 != r2) goto L_0x0011
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.shared.l.a.c r9 = f243156e     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)
            return r9
        L_0x0011:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0086 }
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0086 }
            java.lang.String r3 = "url:"
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0086 }
            java.util.Map r9 = com.google.android.p10905k.C146606e.m238842d(r9, r2)     // Catch:{ all -> 0x0086 }
            int r2 = r9.size()     // Catch:{ all -> 0x0086 }
            com.google.android.apps.gsa.shared.l.a.a[] r3 = new com.google.android.apps.gsa.shared.p7048l.p7049a.C89831a[r2]     // Catch:{ all -> 0x0086 }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0086 }
        L_0x002d:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0086 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0086 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ b -> 0x005b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ b -> 0x005b }
            r7 = 4
            r6.substring(r7)     // Catch:{ b -> 0x005b }
            java.lang.Object r5 = r5.getValue()     // Catch:{ b -> 0x005b }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ b -> 0x005b }
            if (r5 == 0) goto L_0x002d
            int r6 = r5.length()     // Catch:{ b -> 0x005b }
            if (r6 == 0) goto L_0x002d
            com.google.android.apps.gsa.shared.l.a.a r6 = new com.google.android.apps.gsa.shared.l.a.a     // Catch:{ b -> 0x005b }
            r6.<init>(r5)     // Catch:{ b -> 0x005b }
            r3[r4] = r6     // Catch:{ b -> 0x005b }
            int r4 = r4 + 1
            goto L_0x002d
        L_0x005b:
            r5 = move-exception
            com.google.common.f.e r6 = f243155d     // Catch:{ all -> 0x0086 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0086 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0086 }
            java.lang.String r8 = "UrlRules"
            r6.mo56378ag(r7, r8)     // Catch:{ all -> 0x0086 }
            java.lang.String r7 = "Invalid rule from Gservices"
            r8 = 10571(0x294b, float:1.4813E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)     // Catch:{ all -> 0x0086 }
            goto L_0x002d
        L_0x0071:
            com.google.android.apps.gsa.shared.l.a.c r9 = new com.google.android.apps.gsa.shared.l.a.c     // Catch:{ all -> 0x0086 }
            if (r2 != r4) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ all -> 0x0086 }
            r3 = r2
            com.google.android.apps.gsa.shared.l.a.a[] r3 = (com.google.android.apps.gsa.shared.p7048l.p7049a.C89831a[]) r3     // Catch:{ all -> 0x0086 }
        L_0x007d:
            r9.<init>(r3)     // Catch:{ all -> 0x0086 }
            f243156e = r9     // Catch:{ all -> 0x0086 }
            f243154a = r1     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)
            return r9
        L_0x0086:
            r9 = move-exception
            monitor-exit(r0)
            goto L_0x008a
        L_0x0089:
            throw r9
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p7048l.p7049a.C89833c.m146253a(android.content.ContentResolver):com.google.android.apps.gsa.shared.l.a.c");
    }
}
