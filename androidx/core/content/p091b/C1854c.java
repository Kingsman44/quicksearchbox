package androidx.core.content.p091b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.b.c */
/* compiled from: PG */
public final class C1854c {

    /* renamed from: a */
    private static final ThreadLocal f5729a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m5080a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return m5081b(resources, xmlPullParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0135  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m5081b(android.content.res.Resources r34, org.xmlpull.v1.XmlPullParser r35, android.util.AttributeSet r36, android.content.res.Resources.Theme r37) {
        /*
            r0 = r34
            r1 = r36
            r2 = r37
            java.lang.String r3 = r35.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x035f
            int r3 = r35.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r35.next()
            if (r9 == r4) goto L_0x034e
            int r10 = r35.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x034e
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x033e
            if (r10 > r3) goto L_0x033e
            java.lang.String r9 = r35.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x033e
            int[] r9 = androidx.core.C1779a.f5547a
            if (r2 != 0) goto L_0x0049
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004d
        L_0x0049:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004d:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008e
            java.lang.ThreadLocal r10 = f5729a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x006c
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x006e
        L_0x006c:
            r12 = r16
        L_0x006e:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r11 = 28
            if (r10 < r11) goto L_0x007c
            int r10 = r12.type
            if (r10 > r14) goto L_0x007c
            goto L_0x008e
        L_0x007c:
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x0089 }
            android.content.res.ColorStateList r10 = m5080a(r0, r10, r2)     // Catch:{ Exception -> 0x0089 }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x0089 }
            goto L_0x0092
        L_0x0089:
            int r10 = r9.getColor(r7, r15)
            goto L_0x0092
        L_0x008e:
            int r10 = r9.getColor(r7, r15)
        L_0x0092:
            boolean r11 = r9.hasValue(r4)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L_0x009f
            float r11 = r9.getFloat(r4, r12)
            goto L_0x00ad
        L_0x009f:
            r11 = 3
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00ab
            float r11 = r9.getFloat(r11, r12)
            goto L_0x00ad
        L_0x00ab:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00ad:
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 < r14) goto L_0x00bf
            r13 = 2
            boolean r14 = r9.hasValue(r13)
            if (r14 == 0) goto L_0x00bf
            float r14 = r9.getFloat(r13, r15)
            goto L_0x00c4
        L_0x00bf:
            r13 = 4
            float r14 = r9.getFloat(r13, r15)
        L_0x00c4:
            r9.recycle()
            int r9 = r36.getAttributeCount()
            int[] r13 = new int[r9]
            r4 = 0
            r15 = 0
        L_0x00cf:
            if (r15 >= r9) goto L_0x00fe
            int r12 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r12 == r7) goto L_0x00f6
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r12 == r7) goto L_0x00f6
            r7 = 2130968670(0x7f04005e, float:1.7546E38)
            if (r12 == r7) goto L_0x00f6
            r7 = 2130970249(0x7f040689, float:1.7549203E38)
            if (r12 == r7) goto L_0x00f6
            int r7 = r4 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 != 0) goto L_0x00f3
            int r12 = -r12
        L_0x00f3:
            r13[r4] = r12
            r4 = r7
        L_0x00f6:
            int r15 = r15 + 1
            r0 = r34
            r7 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cf
        L_0x00fe:
            int[] r0 = android.util.StateSet.trimStateSet(r13, r4)
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x010f
            int r9 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x010f
            r9 = 1
            goto L_0x0110
        L_0x010f:
            r9 = 0
        L_0x0110:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 != 0) goto L_0x0121
            if (r9 != 0) goto L_0x0120
            r4 = r0
            r30 = r3
            r13 = r5
            r16 = 1
            goto L_0x02ff
        L_0x0120:
            r9 = 1
        L_0x0121:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r11 = androidx.core.p092d.C1886a.m5145c(r11, r13, r12)
            if (r9 == 0) goto L_0x02f1
            androidx.core.content.b.y r9 = androidx.core.content.p091b.C1876y.f5757a
            androidx.core.content.b.a r9 = androidx.core.content.p091b.C1852a.m5074b(r10, r9)
            float r10 = r9.f5719a
            float r9 = r9.f5720b
            androidx.core.content.b.y r12 = androidx.core.content.p091b.C1876y.f5757a
            r13 = r5
            double r4 = (double) r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x02e7
            int r4 = java.lang.Math.round(r14)
            double r4 = (double) r4
            r19 = 0
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x02e7
            int r4 = java.lang.Math.round(r14)
            double r4 = (double) r4
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0161
            goto L_0x02e7
        L_0x0161:
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0167
            r4 = 0
            goto L_0x016d
        L_0x0167:
            r4 = 1135869952(0x43b40000, float:360.0)
            float r4 = java.lang.Math.min(r4, r10)
        L_0x016d:
            r10 = r9
            r5 = 0
            r19 = 1
            r20 = 0
        L_0x0173:
            float r22 = r20 - r9
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02d6
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x018a:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x028a
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r15 = r24 + r27
            androidx.core.content.b.y r7 = androidx.core.content.p091b.C1876y.f5757a
            androidx.core.content.b.a r7 = androidx.core.content.p091b.C1852a.m5075c(r15, r10, r4, r7)
            androidx.core.content.b.y r1 = androidx.core.content.p091b.C1876y.f5757a
            int r1 = r7.mo5033a(r1)
            int r7 = android.graphics.Color.red(r1)
            float r7 = androidx.core.content.p091b.C1853b.m5077a(r7)
            int r30 = android.graphics.Color.green(r1)
            float r30 = androidx.core.content.p091b.C1853b.m5077a(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = androidx.core.content.p091b.C1853b.m5077a(r31)
            float[][] r32 = androidx.core.content.p091b.C1853b.f5728d
            r16 = 1
            r32 = r32[r16]
            r18 = 0
            r33 = r32[r18]
            float r7 = r7 * r33
            r33 = r32[r16]
            float r30 = r30 * r33
            float r7 = r7 + r30
            r17 = 2
            r30 = r32[r17]
            float r31 = r31 * r30
            float r7 = r7 + r31
            r28 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 / r28
            r30 = 1007753895(0x3c111aa7, float:0.008856452)
            int r30 = (r7 > r30 ? 1 : (r7 == r30 ? 0 : -1))
            if (r30 > 0) goto L_0x01f0
            r30 = 1147261687(0x4461d2f7, float:903.2963)
            float r7 = r7 * r30
            r30 = r3
            goto L_0x0200
        L_0x01f0:
            r30 = r3
            double r2 = (double) r7
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = -1048576000(0xffffffffc1800000, float:-16.0)
            float r7 = r2 + r3
        L_0x0200:
            float r2 = r14 - r7
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x025f
            androidx.core.content.b.y r3 = androidx.core.content.p091b.C1876y.f5757a
            androidx.core.content.b.a r1 = androidx.core.content.p091b.C1852a.m5074b(r1, r3)
            float r3 = r1.f5721c
            r31 = r2
            float r2 = r1.f5720b
            r32 = r10
            androidx.core.content.b.y r10 = androidx.core.content.p091b.C1876y.f5757a
            androidx.core.content.b.a r2 = androidx.core.content.p091b.C1852a.m5075c(r3, r2, r4, r10)
            float r3 = r1.f5722d
            float r10 = r2.f5722d
            float r3 = r3 - r10
            float r10 = r1.f5723e
            r33 = r4
            float r4 = r2.f5723e
            float r10 = r10 - r4
            float r4 = r1.f5724f
            float r2 = r2.f5724f
            float r4 = r4 - r2
            float r3 = r3 * r3
            float r10 = r10 * r10
            float r3 = r3 + r10
            float r4 = r4 * r4
            float r3 = r3 + r4
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            r4 = r0
            r10 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r2
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0266
            r22 = r0
            r26 = r10
            r23 = r31
            goto L_0x0266
        L_0x025f:
            r33 = r4
            r32 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = r0
        L_0x0266:
            r0 = 0
            int r2 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0270
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0270
            goto L_0x029a
        L_0x0270:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0276
            r25 = r15
        L_0x0276:
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x027c
            r24 = r15
        L_0x027c:
            r1 = r36
            r2 = r37
            r0 = r4
            r3 = r30
            r10 = r32
            r4 = r33
            r7 = 0
            goto L_0x018a
        L_0x028a:
            r30 = r3
            r33 = r4
            r32 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 2
            r28 = 1120403456(0x42c80000, float:100.0)
            r4 = r0
            r0 = 0
        L_0x029a:
            r2 = r26
            if (r19 == 0) goto L_0x02b9
            if (r2 == 0) goto L_0x02a5
            int r10 = r2.mo5033a(r12)
            goto L_0x02f7
        L_0x02a5:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r10 = r20 + r2
            r1 = r36
            r2 = r37
            r0 = r4
            r3 = r30
            r4 = r33
            r7 = 0
            r19 = 0
            goto L_0x0173
        L_0x02b9:
            if (r2 == 0) goto L_0x02bc
            r5 = r2
        L_0x02bc:
            if (r2 == 0) goto L_0x02c0
            r20 = r32
        L_0x02c0:
            if (r2 != 0) goto L_0x02c4
            r9 = r32
        L_0x02c4:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r10 = r20 + r2
            r1 = r36
            r2 = r37
            r0 = r4
            r3 = r30
            r4 = r33
            r7 = 0
            goto L_0x0173
        L_0x02d6:
            r4 = r0
            r30 = r3
            r16 = 1
            if (r5 != 0) goto L_0x02e2
            int r10 = androidx.core.content.p091b.C1853b.m5078b(r14)
            goto L_0x02f7
        L_0x02e2:
            int r10 = r5.mo5033a(r12)
            goto L_0x02f7
        L_0x02e7:
            r4 = r0
            r30 = r3
            r16 = 1
            int r10 = androidx.core.content.p091b.C1853b.m5078b(r14)
            goto L_0x02f7
        L_0x02f1:
            r4 = r0
            r30 = r3
            r13 = r5
            r16 = 1
        L_0x02f7:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02ff:
            int r0 = r8 + 1
            r5 = r13
            int r1 = r5.length
            if (r0 <= r1) goto L_0x0311
            int r1 = androidx.core.content.p091b.C1864m.m5092a(r8)
            int[] r1 = new int[r1]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r1, r2, r8)
            r5 = r1
            goto L_0x0312
        L_0x0311:
            r2 = 0
        L_0x0312:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x032d
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            int r3 = androidx.core.content.p091b.C1864m.m5092a(r8)
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r3)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x032d:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r1 = r36
            r2 = r37
            r8 = r0
            r3 = r30
            r4 = 1
            r7 = 0
            r0 = r34
            goto L_0x0020
        L_0x033e:
            r30 = r3
            r16 = 1
            r0 = r34
            r1 = r36
            r2 = r37
            r3 = r30
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x034e:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x035f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r35.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x037e
        L_0x037d:
            throw r0
        L_0x037e:
            goto L_0x037d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p091b.C1854c.m5081b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public static ColorStateList m5082c(Resources resources, int i, Resources.Theme theme) {
        try {
            return m5080a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }
}
