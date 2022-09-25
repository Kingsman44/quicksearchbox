package androidx.core.content.p091b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.core.content.b.x */
/* compiled from: PG */
public final class C1875x {
    /* renamed from: a */
    public static float m5114a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!m5120g(xmlPullParser, str)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m5115b(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: c */
    public static int m5116c(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!m5120g(xmlPullParser, str)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    /* renamed from: d */
    public static TypedArray m5117d(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: e */
    public static CharSequence m5118e(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: f */
    public static String m5119f(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: g */
    public static boolean m5120g(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: h */
    public static CharSequence[] m5121h(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: i */
    public static int m5122i(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    /* renamed from: j */
    public static int m5123j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!m5120g(xmlPullParser, str)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r18v3, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r13v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        r7 = r0.getName();
        r10 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r10 == 89650992) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r10 == 1191572447) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r7.equals("selector") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        if (r7.equals("gradient") == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r10 == 0) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        if (r10 != 1) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        if (r7.equals("gradient") == false) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r7 = m5117d(r4, r1, r2, androidx.core.C1779a.f5550d);
        r14 = m5114a(r7, r0, "startX", 8, 0.0f);
        r15 = m5114a(r7, r0, "startY", 9, 0.0f);
        r16 = m5114a(r7, r0, "endX", 10, 0.0f);
        r17 = m5114a(r7, r0, "endY", 11, 0.0f);
        r10 = m5114a(r7, r0, "centerX", 3, 0.0f);
        r5 = m5114a(r7, r0, "centerY", 4, 0.0f);
        r13 = m5116c(r7, r0, "type", 2, 0);
        r8 = m5123j(r7, r0, "startColor", 0);
        r18 = m5120g(r0, "centerColor");
        r3 = m5123j(r7, r0, "centerColor", 7);
        r11 = m5123j(r7, r0, "endColor", 1);
        r9 = m5116c(r7, r0, "tileMode", 6, 0);
        r20 = r5;
        r21 = m5114a(r7, r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r5 = r0.getDepth() + 1;
        r6 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (r7 == 1) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0109, code lost:
        r10 = r0.getDepth();
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        if (r10 >= r5) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0112, code lost:
        if (r7 == 3) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        if (r7 != 2) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0117, code lost:
        if (r10 > r5) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        if (r0.getName().equals("item") == false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        r7 = m5117d(r4, r1, r2, androidx.core.C1779a.f5551e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0135, code lost:
        if (r15 == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0137, code lost:
        if (r24 == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        r24 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r24));
        r6.add(java.lang.Float.valueOf(r25));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0168, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(r0.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0169, code lost:
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x016e, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0174, code lost:
        if (r12.size() <= 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0176, code lost:
        r0 = new androidx.core.content.p091b.C1862k((java.util.List) r12, (java.util.List) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x017c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017d, code lost:
        if (r0 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0180, code lost:
        if (r18 == false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0182, code lost:
        r0 = new androidx.core.content.p091b.C1862k(r8, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0188, code lost:
        r0 = new androidx.core.content.p091b.C1862k(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018e, code lost:
        if (r13 == 1) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0191, code lost:
        if (r13 == 2) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0193, code lost:
        r2 = r0.f5743a;
        r13 = new android.graphics.LinearGradient(r14, r23, r16, r17, r2, r0.f5744b, androidx.core.content.p091b.C1863l.m5091a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a8, code lost:
        r3 = r22;
        r1 = new android.graphics.SweepGradient(r3, r20, r0.f5743a, r0.f5744b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01b6, code lost:
        r4 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01bd, code lost:
        if (r21 <= 0.0f) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bf, code lost:
        r2 = r0.f5743a;
        r18 = new android.graphics.RadialGradient(r3, r4, r21, r2, r0.f5744b, androidx.core.content.p091b.C1863l.m5091a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d6, code lost:
        r0 = new androidx.core.content.p091b.C1855d(r1, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e5, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0203, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0221, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0222, code lost:
        r0 = androidx.core.content.p091b.C1854c.m5081b(r4, r0, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0230, code lost:
        r0 = new androidx.core.content.p091b.C1855d((android.graphics.Shader) null, r0, r0.getDefaultColor());
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.content.p091b.C1855d m5124k(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            r0 = r26
            r1 = r28
            r2 = r30
            java.lang.String r3 = "centerColor"
            r4 = r27
            r5 = r29
            boolean r4 = m5120g(r4, r5)
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L_0x023e
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r0.getValue(r2, r4)
            int r7 = r4.type
            r8 = 28
            if (r7 < r8) goto L_0x0031
            int r7 = r4.type
            r8 = 31
            if (r7 <= r8) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            int r0 = r4.data
            androidx.core.content.b.d r1 = new androidx.core.content.b.d
            r1.<init>(r5, r5, r0)
            return r1
        L_0x0031:
            android.content.res.Resources r4 = r26.getResources()
            int r0 = r0.getResourceId(r2, r6)
            android.content.res.XmlResourceParser r0 = r4.getXml(r0)     // Catch:{ Exception -> 0x0232 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r0)     // Catch:{ Exception -> 0x0232 }
        L_0x0041:
            int r7 = r0.next()     // Catch:{ Exception -> 0x0232 }
            r8 = 2
            r9 = 1
            if (r7 == r8) goto L_0x0054
            if (r7 == r9) goto L_0x004c
            goto L_0x0041
        L_0x004c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0232 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0232 }
            throw r0     // Catch:{ Exception -> 0x0232 }
        L_0x0054:
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x0232 }
            int r10 = r7.hashCode()     // Catch:{ Exception -> 0x0232 }
            r11 = 89650992(0x557f730, float:1.01546526E-35)
            java.lang.String r12 = "gradient"
            if (r10 == r11) goto L_0x0073
            r11 = 1191572447(0x4705f3df, float:34291.87)
            if (r10 == r11) goto L_0x0069
            goto L_0x007b
        L_0x0069:
            java.lang.String r10 = "selector"
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x007b
            r10 = 0
            goto L_0x007c
        L_0x0073:
            boolean r10 = r7.equals(r12)
            if (r10 == 0) goto L_0x007b
            r10 = 1
            goto L_0x007c
        L_0x007b:
            r10 = -1
        L_0x007c:
            if (r10 == 0) goto L_0x0222
            if (r10 != r9) goto L_0x0204
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x0232 }
            boolean r10 = r7.equals(r12)     // Catch:{ Exception -> 0x0232 }
            if (r10 == 0) goto L_0x01e6
            int[] r7 = androidx.core.C1779a.f5550d     // Catch:{ Exception -> 0x0232 }
            android.content.res.TypedArray r7 = m5117d(r4, r1, r2, r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "startX"
            r11 = 8
            r12 = 0
            float r14 = m5114a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "startY"
            r11 = 9
            float r15 = m5114a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "endX"
            r11 = 10
            float r16 = m5114a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "endY"
            r11 = 11
            float r17 = m5114a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "centerX"
            r11 = 3
            float r10 = m5114a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r13 = "centerY"
            r5 = 4
            float r5 = m5114a(r7, r0, r13, r5, r12)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r13 = "type"
            int r13 = m5116c(r7, r0, r13, r8, r6)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r8 = "startColor"
            int r8 = m5123j(r7, r0, r8, r6)     // Catch:{ Exception -> 0x0232 }
            boolean r18 = m5120g(r0, r3)     // Catch:{ Exception -> 0x0232 }
            r11 = 7
            int r3 = m5123j(r7, r0, r3, r11)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r11 = "endColor"
            int r11 = m5123j(r7, r0, r11, r9)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r9 = "tileMode"
            r12 = 6
            int r9 = m5116c(r7, r0, r9, r12, r6)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r12 = "gradientRadius"
            r6 = 5
            r20 = r5
            r5 = 0
            float r21 = m5114a(r7, r0, r12, r6, r5)     // Catch:{ Exception -> 0x0232 }
            r7.recycle()     // Catch:{ Exception -> 0x0232 }
            int r5 = r0.getDepth()     // Catch:{ Exception -> 0x0232 }
            r6 = 1
            int r5 = r5 + r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0232 }
            r7 = 20
            r6.<init>(r7)     // Catch:{ Exception -> 0x0232 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0232 }
            r12.<init>(r7)     // Catch:{ Exception -> 0x0232 }
        L_0x0100:
            int r7 = r0.next()     // Catch:{ Exception -> 0x0232 }
            r22 = r10
            r10 = 1
            if (r7 == r10) goto L_0x016e
            int r10 = r0.getDepth()     // Catch:{ Exception -> 0x0232 }
            r23 = r15
            if (r10 >= r5) goto L_0x0114
            r15 = 3
            if (r7 == r15) goto L_0x0170
        L_0x0114:
            r15 = 2
            if (r7 != r15) goto L_0x0169
            if (r10 > r5) goto L_0x0169
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r10 = "item"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x0232 }
            if (r7 == 0) goto L_0x0169
            int[] r7 = androidx.core.C1779a.f5551e     // Catch:{ Exception -> 0x0232 }
            android.content.res.TypedArray r7 = m5117d(r4, r1, r2, r7)     // Catch:{ Exception -> 0x0232 }
            r10 = 0
            boolean r15 = r7.hasValue(r10)     // Catch:{ Exception -> 0x0232 }
            r10 = 1
            boolean r24 = r7.hasValue(r10)     // Catch:{ Exception -> 0x0232 }
            if (r15 == 0) goto L_0x0155
            if (r24 == 0) goto L_0x0155
            r15 = 0
            int r24 = r7.getColor(r15, r15)     // Catch:{ Exception -> 0x0232 }
            r15 = 0
            float r25 = r7.getFloat(r10, r15)     // Catch:{ Exception -> 0x0232 }
            r7.recycle()     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)     // Catch:{ Exception -> 0x0232 }
            r12.add(r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.Float r7 = java.lang.Float.valueOf(r25)     // Catch:{ Exception -> 0x0232 }
            r6.add(r7)     // Catch:{ Exception -> 0x0232 }
            goto L_0x0169
        L_0x0155:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.String r0 = r0.concat(r2)     // Catch:{ Exception -> 0x0232 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0232 }
            throw r1     // Catch:{ Exception -> 0x0232 }
        L_0x0169:
            r10 = r22
            r15 = r23
            goto L_0x0100
        L_0x016e:
            r23 = r15
        L_0x0170:
            int r0 = r12.size()     // Catch:{ Exception -> 0x0232 }
            if (r0 <= 0) goto L_0x017c
            androidx.core.content.b.k r0 = new androidx.core.content.b.k     // Catch:{ Exception -> 0x0232 }
            r0.<init>((java.util.List) r12, (java.util.List) r6)     // Catch:{ Exception -> 0x0232 }
            goto L_0x017d
        L_0x017c:
            r0 = 0
        L_0x017d:
            if (r0 == 0) goto L_0x0180
            goto L_0x018d
        L_0x0180:
            if (r18 == 0) goto L_0x0188
            androidx.core.content.b.k r0 = new androidx.core.content.b.k     // Catch:{ Exception -> 0x0232 }
            r0.<init>(r8, r3, r11)     // Catch:{ Exception -> 0x0232 }
            goto L_0x018d
        L_0x0188:
            androidx.core.content.b.k r0 = new androidx.core.content.b.k     // Catch:{ Exception -> 0x0232 }
            r0.<init>((int) r8, (int) r11)     // Catch:{ Exception -> 0x0232 }
        L_0x018d:
            r1 = 1
            if (r13 == r1) goto L_0x01b6
            r1 = 2
            if (r13 == r1) goto L_0x01a8
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x0232 }
            int[] r2 = r0.f5743a     // Catch:{ Exception -> 0x0232 }
            float[] r0 = r0.f5744b     // Catch:{ Exception -> 0x0232 }
            android.graphics.Shader$TileMode r20 = androidx.core.content.p091b.C1863l.m5091a(r9)     // Catch:{ Exception -> 0x0232 }
            r13 = r1
            r15 = r23
            r18 = r2
            r19 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0232 }
            goto L_0x01d6
        L_0x01a8:
            android.graphics.SweepGradient r1 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x0232 }
            int[] r2 = r0.f5743a     // Catch:{ Exception -> 0x0232 }
            float[] r0 = r0.f5744b     // Catch:{ Exception -> 0x0232 }
            r4 = r20
            r3 = r22
            r1.<init>(r3, r4, r2, r0)     // Catch:{ Exception -> 0x0232 }
            goto L_0x01d6
        L_0x01b6:
            r4 = r20
            r3 = r22
            r1 = 0
            int r1 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01de
            android.graphics.RadialGradient r1 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x0232 }
            int[] r2 = r0.f5743a     // Catch:{ Exception -> 0x0232 }
            float[] r0 = r0.f5744b     // Catch:{ Exception -> 0x0232 }
            android.graphics.Shader$TileMode r24 = androidx.core.content.p091b.C1863l.m5091a(r9)     // Catch:{ Exception -> 0x0232 }
            r18 = r1
            r19 = r3
            r20 = r4
            r22 = r2
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x0232 }
        L_0x01d6:
            androidx.core.content.b.d r0 = new androidx.core.content.b.d     // Catch:{ Exception -> 0x0232 }
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0232 }
            goto L_0x023b
        L_0x01de:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0232 }
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0232 }
            throw r0     // Catch:{ Exception -> 0x0232 }
        L_0x01e6:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0232 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0232 }
            r2.<init>()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x0232 }
            r2.append(r0)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = ": invalid gradient color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x0232 }
            r2.append(r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0232 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0232 }
            throw r1     // Catch:{ Exception -> 0x0232 }
        L_0x0204:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0232 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0232 }
            r2.<init>()     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x0232 }
            r2.append(r0)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = ": unsupported complex color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x0232 }
            r2.append(r7)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0232 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0232 }
            throw r1     // Catch:{ Exception -> 0x0232 }
        L_0x0222:
            android.content.res.ColorStateList r0 = androidx.core.content.p091b.C1854c.m5081b(r4, r0, r2, r1)     // Catch:{ Exception -> 0x0232 }
            androidx.core.content.b.d r1 = new androidx.core.content.b.d     // Catch:{ Exception -> 0x0232 }
            int r2 = r0.getDefaultColor()     // Catch:{ Exception -> 0x0232 }
            r3 = 0
            r1.<init>(r3, r0, r2)     // Catch:{ Exception -> 0x0232 }
            r0 = r1
            goto L_0x023b
        L_0x0232:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
        L_0x023b:
            if (r0 == 0) goto L_0x023e
            return r0
        L_0x023e:
            androidx.core.content.b.d r0 = new androidx.core.content.b.d
            r1 = 0
            r2 = 0
            r0.<init>(r1, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p091b.C1875x.m5124k(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):androidx.core.content.b.d");
    }
}
