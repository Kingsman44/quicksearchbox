package com.google.knowledge.cerebra.sense.textclassifier.tclib;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bh */
/* compiled from: PG */
public final class C61898bh {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Locale m94556a(android.content.Intent r7) {
        /*
            r0 = 0
            r1 = 0
            if (r7 != 0) goto L_0x0006
        L_0x0004:
            r3 = r1
            goto L_0x004d
        L_0x0006:
            java.lang.String r2 = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER"
            android.os.Bundle r7 = r7.getBundleExtra(r2)
            if (r7 != 0) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            java.lang.String r2 = "text-languages"
            android.os.Bundle r7 = r7.getBundle(r2)
            if (r7 != 0) goto L_0x0018
            goto L_0x0004
        L_0x0018:
            java.lang.String r2 = "entity-type"
            java.lang.String[] r2 = r7.getStringArray(r2)
            java.lang.String r3 = "score"
            float[] r7 = r7.getFloatArray(r3)
            if (r2 == 0) goto L_0x0004
            if (r7 == 0) goto L_0x0004
            int r3 = r2.length
            if (r3 == 0) goto L_0x0004
            int r4 = r7.length
            if (r3 == r4) goto L_0x002f
            goto L_0x0004
        L_0x002f:
            r3 = 1
            r4 = 0
        L_0x0031:
            int r5 = r2.length
            if (r3 >= r5) goto L_0x0040
            r5 = r7[r4]
            r6 = r7[r3]
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x003d
            r4 = r3
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0040:
            r2 = r2[r4]
            r7 = r7[r4]
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            androidx.core.i.e r3 = new androidx.core.i.e
            r3.<init>(r2, r7)
        L_0x004d:
            if (r3 != 0) goto L_0x0050
            return r1
        L_0x0050:
            java.lang.Object r7 = r3.f5888a
            java.lang.String r7 = (java.lang.String) r7
            androidx.core.f.j r7 = androidx.core.p094f.C1897j.m5165b(r7)
            androidx.core.f.k r2 = r7.f5774b
            android.os.LocaleList r2 = r2.f5775a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0063
            return r1
        L_0x0063:
            androidx.core.f.k r7 = r7.f5774b
            android.os.LocaleList r7 = r7.f5775a
            java.util.Locale r7 = r7.get(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61898bh.m94556a(android.content.Intent):java.util.Locale");
    }
}
