package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: androidx.constraintlayout.widget.h */
/* compiled from: PG */
public final class C1749h {

    /* renamed from: a */
    public final ConstraintLayout f5321a;

    /* renamed from: b */
    public int f5322b = -1;

    /* renamed from: c */
    public int f5323c = -1;

    /* renamed from: d */
    public final SparseArray f5324d = new SparseArray();

    /* renamed from: e */
    private final SparseArray f5325e = new SparseArray();

    public C1749h(Context context, ConstraintLayout constraintLayout, int i) {
        this.f5321a = constraintLayout;
        m4784a(context, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4784a(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "id"
            android.content.res.Resources r1 = r11.getResources()
            android.content.res.XmlResourceParser r12 = r1.getXml(r12)
            int r1 = r12.getEventType()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r2 = 0
        L_0x000f:
            r3 = 1
            if (r1 == r3) goto L_0x00ed
            if (r1 == 0) goto L_0x00e4
            r4 = 2
            if (r1 == r4) goto L_0x0019
            goto L_0x00e7
        L_0x0019:
            java.lang.String r1 = r12.getName()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r5 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = -1
            switch(r5) {
                case -1349929691: goto L_0x0051;
                case 80204913: goto L_0x0047;
                case 1382829617: goto L_0x003d;
                case 1657696882: goto L_0x0033;
                case 1901439077: goto L_0x0029;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x005b
        L_0x0029:
            java.lang.String r5 = "Variant"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005b
            r1 = 3
            goto L_0x005c
        L_0x0033:
            java.lang.String r5 = "layoutDescription"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005b
            r1 = 0
            goto L_0x005c
        L_0x003d:
            java.lang.String r5 = "StateSet"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005b
            r1 = 1
            goto L_0x005c
        L_0x0047:
            java.lang.String r5 = "State"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005b
            r1 = 2
            goto L_0x005c
        L_0x0051:
            java.lang.String r5 = "ConstraintSet"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x005b
            r1 = 4
            goto L_0x005c
        L_0x005b:
            r1 = -1
        L_0x005c:
            if (r1 == r4) goto L_0x00d6
            if (r1 == r8) goto L_0x00c9
            if (r1 == r7) goto L_0x0064
            goto L_0x00e7
        L_0x0064:
            androidx.constraintlayout.widget.o r1 = new androidx.constraintlayout.widget.o     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r4 = r12.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
        L_0x006d:
            if (r6 >= r4) goto L_0x00e7
            java.lang.String r5 = r12.getAttributeName(r6)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            java.lang.String r7 = r12.getAttributeValue(r6)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            if (r5 == 0) goto L_0x00c6
            if (r7 != 0) goto L_0x007c
            goto L_0x00c6
        L_0x007c:
            boolean r5 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            if (r5 == 0) goto L_0x00c6
            java.lang.String r4 = "/"
            boolean r4 = r7.contains(r4)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            if (r4 == 0) goto L_0x00a2
            r4 = 47
            int r4 = r7.indexOf(r4)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r4 = r4 + r3
            java.lang.String r4 = r7.substring(r4)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            android.content.res.Resources r5 = r11.getResources()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            java.lang.String r6 = r11.getPackageName()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r4 = r5.getIdentifier(r4, r0, r6)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x00a3
        L_0x00a2:
            r4 = -1
        L_0x00a3:
            if (r4 != r9) goto L_0x00bc
            int r4 = r7.length()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            if (r4 <= r3) goto L_0x00b4
            java.lang.String r3 = r7.substring(r3)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r9 = java.lang.Integer.parseInt(r3)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x00bd
        L_0x00b4:
            java.lang.String r3 = "ConstraintLayoutStates"
            java.lang.String r4 = "error in parsing id"
            android.util.Log.e(r3, r4)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x00bd
        L_0x00bc:
            r9 = r4
        L_0x00bd:
            r1.mo4897q(r11, r12)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            android.util.SparseArray r3 = r10.f5325e     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r3.put(r9, r1)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x00e7
        L_0x00c6:
            int r6 = r6 + 1
            goto L_0x006d
        L_0x00c9:
            androidx.constraintlayout.widget.g r1 = new androidx.constraintlayout.widget.g     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r1.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            if (r2 == 0) goto L_0x00e7
            java.util.ArrayList r3 = r2.f5312b     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r3.add(r1)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x00e7
        L_0x00d6:
            androidx.constraintlayout.widget.f r1 = new androidx.constraintlayout.widget.f     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r1.<init>(r11, r12)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            android.util.SparseArray r2 = r10.f5324d     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            int r3 = r1.f5311a     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r2.put(r3, r1)     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            r2 = r1
            goto L_0x00e7
        L_0x00e4:
            r12.getName()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
        L_0x00e7:
            int r1 = r12.next()     // Catch:{ XmlPullParserException -> 0x00f3, IOException -> 0x00ee }
            goto L_0x000f
        L_0x00ed:
            return
        L_0x00ee:
            r11 = move-exception
            r11.printStackTrace()
            return
        L_0x00f3:
            r11 = move-exception
            r11.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C1749h.m4784a(android.content.Context, int):void");
    }
}
