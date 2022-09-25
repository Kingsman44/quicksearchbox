package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60979f;
import com.google.p4583d.p4584a.p4588d.C60980g;
import com.google.p4583d.p4584a.p4588d.C60987n;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.d.a.e.g */
/* compiled from: PG */
public final class C61000g {
    /* renamed from: a */
    public static C60976c m93237a(C60976c cVar, C61012g gVar, C60980g gVar2, Boolean bool, Boolean bool2) {
        C60976c cVar2 = new C60976c();
        Iterator k = cVar.mo57478k();
        while (k.hasNext()) {
            int intValue = ((Integer) k.next()).intValue();
            if (cVar.mo57485r(intValue)) {
                C60987n a = gVar2.mo57451a(gVar, Arrays.asList(new C60987n[]{cVar.mo57469e(intValue), new C60979f(Double.valueOf((double) intValue)), cVar}));
                if (a.mo57472g().equals(bool)) {
                    return cVar2;
                }
                if (bool2 == null || a.mo57472g().equals(bool2)) {
                    cVar2.mo57483p(intValue, a);
                }
            }
        }
        return cVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.p4583d.p4584a.p4588d.C60987n m93238b(com.google.p4583d.p4584a.p4588d.C60976c r9, com.google.p4583d.p4584a.C61012g r10, java.util.List r11, boolean r12) {
        /*
            java.lang.String r0 = "reduce"
            r1 = 1
            com.google.p4583d.p4584a.C61013h.m93266h(r0, r1, r11)
            r2 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r0, r2, r11)
            r0 = 0
            java.lang.Object r3 = r11.get(r0)
            com.google.d.a.d.n r3 = (com.google.p4583d.p4584a.p4588d.C60987n) r3
            com.google.d.a.e.c r4 = r10.f165215b
            com.google.d.a.d.n r3 = r4.mo57519a(r10, r3)
            boolean r4 = r3 instanceof com.google.p4583d.p4584a.p4588d.C60980g
            if (r4 == 0) goto L_0x00a4
            int r4 = r11.size()
            if (r4 != r2) goto L_0x003a
            java.lang.Object r11 = r11.get(r1)
            com.google.d.a.d.n r11 = (com.google.p4583d.p4584a.p4588d.C60987n) r11
            com.google.d.a.e.c r4 = r10.f165215b
            com.google.d.a.d.n r11 = r4.mo57519a(r10, r11)
            boolean r4 = r11 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r4 != 0) goto L_0x0032
            goto L_0x0041
        L_0x0032:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed to parse initial value"
            r9.<init>(r10)
            throw r9
        L_0x003a:
            int r11 = r9.mo57467c()
            if (r11 == 0) goto L_0x009c
            r11 = 0
        L_0x0041:
            com.google.d.a.d.g r3 = (com.google.p4583d.p4584a.p4588d.C60980g) r3
            int r4 = r9.mo57467c()
            if (r12 == 0) goto L_0x004b
            r5 = 0
            goto L_0x004d
        L_0x004b:
            int r5 = r4 + -1
        L_0x004d:
            r6 = -1
            if (r12 == 0) goto L_0x0052
            int r4 = r4 + r6
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            if (r1 == r12) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r6 = 1
        L_0x0057:
            if (r11 != 0) goto L_0x005e
            com.google.d.a.d.n r11 = r9.mo57469e(r5)
            goto L_0x0099
        L_0x005e:
            int r12 = r4 - r5
            int r12 = r12 * r6
            if (r12 < 0) goto L_0x009b
            boolean r12 = r9.mo57485r(r5)
            if (r12 == 0) goto L_0x0099
            r12 = 4
            com.google.d.a.d.n[] r12 = new com.google.p4583d.p4584a.p4588d.C60987n[r12]
            r12[r0] = r11
            com.google.d.a.d.n r11 = r9.mo57469e(r5)
            r12[r1] = r11
            com.google.d.a.d.f r11 = new com.google.d.a.d.f
            double r7 = (double) r5
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r11.<init>(r7)
            r12[r2] = r11
            r11 = 3
            r12[r11] = r9
            java.util.List r11 = java.util.Arrays.asList(r12)
            com.google.d.a.d.n r11 = r3.mo57451a(r10, r11)
            boolean r12 = r11 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r12 != 0) goto L_0x0091
            goto L_0x0099
        L_0x0091:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Reduce operation failed"
            r9.<init>(r10)
            throw r9
        L_0x0099:
            int r5 = r5 + r6
            goto L_0x005e
        L_0x009b:
            return r11
        L_0x009c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Empty array with no initial value error"
            r9.<init>(r10)
            throw r9
        L_0x00a4:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Callback should be a method"
            r9.<init>(r10)
            goto L_0x00ad
        L_0x00ac:
            throw r9
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4589e.C61000g.m93238b(com.google.d.a.d.c, com.google.d.a.g, java.util.List, boolean):com.google.d.a.d.n");
    }
}
