package androidx.core.content.p091b;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.b.w */
/* compiled from: PG */
public final class C1874w {

    /* renamed from: a */
    private static final ThreadLocal f5754a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f5755b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f5756c = new Object();

    /* renamed from: a */
    public static float m5104a(Resources resources, int i) {
        return C1867p.m5097a(resources, i);
    }

    /* renamed from: b */
    public static ColorStateList m5105b(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1868q qVar;
        Resources.Theme theme2;
        C1869r rVar = new C1869r(resources, theme);
        synchronized (f5756c) {
            SparseArray sparseArray = (SparseArray) f5755b.get(rVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (qVar = (C1868q) sparseArray.get(i)) == null)) {
                if (!qVar.f5746b.equals(rVar.f5748a.getConfiguration()) || (!((theme2 = rVar.f5749b) == null && qVar.f5747c == 0) && (theme2 == null || qVar.f5747c != theme2.hashCode()))) {
                    sparseArray.remove(i);
                } else {
                    colorStateList2 = qVar.f5745a;
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal threadLocal = f5754a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            try {
                colorStateList = C1854c.m5080a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return C1866o.m5096b(resources, i, theme);
        }
        synchronized (f5756c) {
            WeakHashMap weakHashMap = f5755b;
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(rVar);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(rVar, sparseArray2);
            }
            sparseArray2.append(i, new C1868q(colorStateList, rVar.f5748a.getConfiguration(), theme));
        }
        return colorStateList;
    }

    /* renamed from: c */
    public static Typeface m5106c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m5112i(context, i, new TypedValue(), 0, (C1872u) null, (Handler) null, false, true);
    }

    /* renamed from: d */
    public static Typeface m5107d(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m5112i(context, i, new TypedValue(), 0, (C1872u) null, (Handler) null, false, false);
    }

    /* renamed from: e */
    public static Typeface m5108e(Context context, int i, TypedValue typedValue, int i2, C1872u uVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m5112i(context, i, typedValue, i2, uVar, (Handler) null, true, false);
    }

    /* renamed from: f */
    public static Drawable m5109f(Resources resources, int i, Resources.Theme theme) {
        return C1865n.m5093a(resources, i, theme);
    }

    /* renamed from: g */
    public static void m5110g(Context context, int i, C1872u uVar, Handler handler) {
        if (context.isRestricted()) {
            uVar.mo5042d(-4, handler);
            return;
        }
        m5112i(context, i, new TypedValue(), 0, uVar, handler, false, false);
    }

    /* renamed from: h */
    public static int m5111h(Resources resources, int i) {
        return C1866o.m5095a(resources, i, (Resources.Theme) null);
    }

    /* renamed from: i */
    private static Typeface m5112i(Context context, int i, TypedValue typedValue, int i2, C1872u uVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int i3 = i;
        resources.getValue(i, typedValue, true);
        Typeface j = m5113j(context, resources, typedValue, i, i2, uVar, handler, z, z2);
        if (j != null || uVar != null || z2) {
            return j;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: android.graphics.Typeface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: android.graphics.Typeface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: android.graphics.Typeface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v6 */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01f0, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01f2, code lost:
        r0 = e;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0215, code lost:
        r11.mo5042d(-3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r3.require(2, (java.lang.String) null, "font-family");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r3.getName().equals("font-family") == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r2 = r0.obtainAttributes(android.util.Xml.asAttributeSet(r3), androidx.core.C1779a.f5548b);
        r9 = r2.getString(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r15 = r2.getString(4);
        r6 = r2.getString(5);
        r10 = r2.getResourceId(1, 0);
        r7 = r2.getInteger(2, 1);
        r5 = r2.getInteger(3, 500);
        r4 = r2.getString(6);
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        if (r9 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r15 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        if (r6 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        if (r3.next() == 3) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        androidx.core.content.p091b.C1861j.m5089b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r3 = new androidx.core.content.p091b.C1860i(new androidx.core.p095g.C1909g(r9, r15, r6, androidx.core.content.p091b.C1861j.m5088a(r0, r10)), r7, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d0, code lost:
        if (r3.next() == 3) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r3.getEventType() != 2) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        if (r3.getName().equals("font") == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e5, code lost:
        r4 = r0.obtainAttributes(android.util.Xml.asAttributeSet(r3), androidx.core.C1779a.f5549c);
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f6, code lost:
        if (true == r4.hasValue(8)) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f9, code lost:
        r17 = r4.getInt(r6, 400);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0103, code lost:
        if (true == r4.hasValue(6)) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0105, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        r6 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010d, code lost:
        if (r4.getInt(r6, 0) != 1) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010f, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        r6 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011a, code lost:
        if (true == r4.hasValue(9)) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011c, code lost:
        r6 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011d, code lost:
        r7 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0122, code lost:
        if (true == r4.hasValue(7)) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0124, code lost:
        r7 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0125, code lost:
        r19 = r4.getString(r7);
        r20 = r4.getInt(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0133, code lost:
        if (true == r4.hasValue(5)) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0135, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0138, code lost:
        r21 = r4.getResourceId(r10, 0);
        r4.getString(r10);
        r4.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0147, code lost:
        if (r3.next() == 3) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0149, code lost:
        androidx.core.content.p091b.C1861j.m5089b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014d, code lost:
        r2.add(new androidx.core.content.p091b.C1859h(r17, r18, r19, r20, r21));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0159, code lost:
        androidx.core.content.p091b.C1861j.m5089b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0165, code lost:
        if (r2.isEmpty() == false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        r3 = new androidx.core.content.p091b.C1858g((androidx.core.content.p091b.C1859h[]) r2.toArray(new androidx.core.content.p091b.C1859h[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0178, code lost:
        androidx.core.content.p091b.C1861j.m5089b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017b, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x017c, code lost:
        if (r2 != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017e, code lost:
        android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0183, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0185, code lost:
        r11.mo5042d(-3, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018b, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018e, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019e, code lost:
        r15 = r15;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a2, code lost:
        return androidx.core.graphics.C1943i.m5260b(r22, r2, r23, r25, r14, r1.assetCookie, r26, r27, r28, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a4, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a6, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a7, code lost:
        r15 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01e5 A[Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0215  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Typeface m5113j(android.content.Context r22, android.content.res.Resources r23, android.util.TypedValue r24, int r25, int r26, androidx.core.content.p091b.C1872u r27, android.os.Handler r28, boolean r29, boolean r30) {
        /*
            r0 = r23
            r1 = r24
            r4 = r25
            r7 = r26
            r11 = r27
            r12 = r28
            java.lang.String r2 = "font-family"
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r3 = r1.string
            if (r3 == 0) goto L_0x021a
            java.lang.CharSequence r3 = r1.string
            java.lang.String r14 = r3.toString()
            java.lang.String r3 = "res/"
            boolean r3 = r14.startsWith(r3)
            r15 = -3
            r10 = 0
            if (r3 != 0) goto L_0x002a
            if (r11 == 0) goto L_0x0029
            r11.mo5042d(r15, r12)
        L_0x0029:
            return r10
        L_0x002a:
            int r3 = r1.assetCookie
            androidx.c.m r5 = androidx.core.graphics.C1943i.f5853b
            java.lang.String r3 = androidx.core.graphics.C1943i.m5261c(r0, r4, r14, r3, r7)
            java.lang.Object r3 = r5.mo3690d(r3)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L_0x0040
            if (r11 == 0) goto L_0x003f
            r11.mo5043e(r3, r12)
        L_0x003f:
            return r3
        L_0x0040:
            if (r30 == 0) goto L_0x0043
            return r10
        L_0x0043:
            java.lang.String r3 = r14.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            java.lang.String r5 = ".xml"
            boolean r3 = r3.endsWith(r5)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            if (r3 == 0) goto L_0x01a9
            android.content.res.XmlResourceParser r3 = r0.getXml(r4)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
        L_0x0053:
            int r5 = r3.next()     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            r6 = 2
            r8 = 1
            if (r5 == r6) goto L_0x0066
            if (r5 == r8) goto L_0x005e
            goto L_0x0053
        L_0x005e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
        L_0x0066:
            r3.require(r6, r10, r2)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            java.lang.String r5 = r3.getName()     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            boolean r2 = r5.equals(r2)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            if (r2 == 0) goto L_0x0178
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            int[] r5 = androidx.core.C1779a.f5548b     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            android.content.res.TypedArray r2 = r0.obtainAttributes(r2, r5)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            r5 = 0
            java.lang.String r9 = r2.getString(r5)     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            r10 = 4
            java.lang.String r15 = r2.getString(r10)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r10 = 5
            java.lang.String r6 = r2.getString(r10)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            int r10 = r2.getResourceId(r8, r5)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r5 = 2
            int r7 = r2.getInteger(r5, r8)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r5 = 500(0x1f4, float:7.0E-43)
            r8 = 3
            int r5 = r2.getInteger(r8, r5)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r8 = 6
            java.lang.String r4 = r2.getString(r8)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r2.recycle()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r9 == 0) goto L_0x00c6
            if (r15 == 0) goto L_0x00c6
            if (r6 == 0) goto L_0x00c6
        L_0x00aa:
            int r2 = r3.next()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r8 = 3
            if (r2 == r8) goto L_0x00b5
            androidx.core.content.p091b.C1861j.m5089b(r3)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            goto L_0x00aa
        L_0x00b5:
            java.util.List r2 = androidx.core.content.p091b.C1861j.m5088a(r0, r10)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            androidx.core.content.b.i r3 = new androidx.core.content.b.i     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            androidx.core.g.g r8 = new androidx.core.g.g     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r8.<init>(r9, r15, r6, r2)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r3.<init>(r8, r7, r5, r4)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
        L_0x00c3:
            r2 = r3
            goto L_0x017c
        L_0x00c6:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
        L_0x00cb:
            int r4 = r3.next()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r5 = 3
            if (r4 == r5) goto L_0x0161
            int r4 = r3.getEventType()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r5 = 2
            if (r4 != r5) goto L_0x00cb
            java.lang.String r4 = r3.getName()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            java.lang.String r6 = "font"
            boolean r4 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r4 == 0) goto L_0x0159
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            int[] r6 = androidx.core.C1779a.f5549c     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            android.content.res.TypedArray r4 = r0.obtainAttributes(r4, r6)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r6 = 8
            boolean r7 = r4.hasValue(r6)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r9 = 1
            if (r9 == r7) goto L_0x00f9
            r6 = 1
        L_0x00f9:
            r7 = 400(0x190, float:5.6E-43)
            int r17 = r4.getInt(r6, r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            boolean r6 = r4.hasValue(r8)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r9 == r6) goto L_0x0107
            r6 = 2
            goto L_0x0108
        L_0x0107:
            r6 = 6
        L_0x0108:
            r7 = 0
            int r6 = r4.getInt(r6, r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r6 != r9) goto L_0x0112
            r18 = 1
            goto L_0x0114
        L_0x0112:
            r18 = 0
        L_0x0114:
            r6 = 9
            boolean r7 = r4.hasValue(r6)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r9 == r7) goto L_0x011d
            r6 = 3
        L_0x011d:
            r7 = 7
            boolean r10 = r4.hasValue(r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r9 == r10) goto L_0x0125
            r7 = 4
        L_0x0125:
            java.lang.String r19 = r4.getString(r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r7 = 0
            int r20 = r4.getInt(r6, r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r6 = 5
            boolean r10 = r4.hasValue(r6)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r9 == r10) goto L_0x0137
            r10 = 0
            goto L_0x0138
        L_0x0137:
            r10 = 5
        L_0x0138:
            int r21 = r4.getResourceId(r10, r7)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r4.getString(r10)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r4.recycle()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
        L_0x0142:
            int r4 = r3.next()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r7 = 3
            if (r4 == r7) goto L_0x014d
            androidx.core.content.p091b.C1861j.m5089b(r3)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            goto L_0x0142
        L_0x014d:
            androidx.core.content.b.h r4 = new androidx.core.content.b.h     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r16 = r4
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r2.add(r4)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            goto L_0x00cb
        L_0x0159:
            r6 = 5
            r7 = 3
            r9 = 1
            androidx.core.content.p091b.C1861j.m5089b(r3)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            goto L_0x00cb
        L_0x0161:
            boolean r3 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r3 == 0) goto L_0x0168
            goto L_0x017b
        L_0x0168:
            androidx.core.content.b.g r3 = new androidx.core.content.b.g     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r4 = 0
            androidx.core.content.b.h[] r4 = new androidx.core.content.p091b.C1859h[r4]     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            java.lang.Object[] r2 = r2.toArray(r4)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            androidx.core.content.b.h[] r2 = (androidx.core.content.p091b.C1859h[]) r2     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            goto L_0x00c3
        L_0x0178:
            androidx.core.content.p091b.C1861j.m5089b(r3)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
        L_0x017b:
            r2 = 0
        L_0x017c:
            if (r2 != 0) goto L_0x018b
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
            if (r11 == 0) goto L_0x0189
            r1 = -3
            r11.mo5042d(r1, r12)     // Catch:{ XmlPullParserException -> 0x01a6, IOException -> 0x01a3 }
        L_0x0189:
            r10 = 0
            return r10
        L_0x018b:
            r10 = 0
            int r6 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x0204, IOException -> 0x01f4 }
            r1 = r22
            r3 = r23
            r4 = r25
            r5 = r14
            r7 = r26
            r8 = r27
            r9 = r28
            r15 = r10
            r10 = r29
            android.graphics.Typeface r0 = androidx.core.graphics.C1943i.m5260b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
            return r0
        L_0x01a3:
            r0 = move-exception
            r15 = 0
            goto L_0x01f6
        L_0x01a6:
            r0 = move-exception
            r15 = 0
            goto L_0x0206
        L_0x01a9:
            r15 = r10
            int r1 = r1.assetCookie     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
            android.graphics.fonts.Font$Builder r2 = new android.graphics.fonts.Font$Builder     // Catch:{ Exception -> 0x01d2 }
            r3 = r25
            r2.<init>(r0, r3)     // Catch:{ Exception -> 0x01d4 }
            android.graphics.fonts.Font r2 = r2.build()     // Catch:{ Exception -> 0x01d4 }
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ Exception -> 0x01d4 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x01d4 }
            android.graphics.fonts.FontFamily r4 = r4.build()     // Catch:{ Exception -> 0x01d4 }
            android.graphics.Typeface$CustomFallbackBuilder r5 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x01d4 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01d4 }
            android.graphics.fonts.FontStyle r2 = r2.getStyle()     // Catch:{ Exception -> 0x01d4 }
            android.graphics.Typeface$CustomFallbackBuilder r2 = r5.setStyle(r2)     // Catch:{ Exception -> 0x01d4 }
            android.graphics.Typeface r10 = r2.build()     // Catch:{ Exception -> 0x01d4 }
            goto L_0x01d6
        L_0x01d2:
            r3 = r25
        L_0x01d4:
            r10 = r15
        L_0x01d6:
            if (r10 == 0) goto L_0x01e3
            r2 = r26
            java.lang.String r0 = androidx.core.graphics.C1943i.m5261c(r0, r3, r14, r1, r2)     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
            androidx.c.m r1 = androidx.core.graphics.C1943i.f5853b     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
            r1.mo3691e(r0, r10)     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
        L_0x01e3:
            if (r11 == 0) goto L_0x01ef
            if (r10 == 0) goto L_0x01eb
            r11.mo5043e(r10, r12)     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
            goto L_0x01ef
        L_0x01eb:
            r1 = -3
            r11.mo5042d(r1, r12)     // Catch:{ XmlPullParserException -> 0x01f2, IOException -> 0x01f0 }
        L_0x01ef:
            return r10
        L_0x01f0:
            r0 = move-exception
            goto L_0x01f6
        L_0x01f2:
            r0 = move-exception
            goto L_0x0206
        L_0x01f4:
            r0 = move-exception
            r15 = r10
        L_0x01f6:
            java.lang.String r1 = "Failed to read xml resource "
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r13, r1, r0)
            goto L_0x0213
        L_0x0204:
            r0 = move-exception
            r15 = r10
        L_0x0206:
            java.lang.String r1 = "Failed to parse xml resource "
            java.lang.String r2 = java.lang.String.valueOf(r14)
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r13, r1, r0)
        L_0x0213:
            if (r11 == 0) goto L_0x0219
            r1 = -3
            r11.mo5042d(r1, r12)
        L_0x0219:
            return r15
        L_0x021a:
            r3 = r4
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Resource \""
            r4.<init>(r5)
            java.lang.String r0 = r0.getResourceName(r3)
            r4.append(r0)
            java.lang.String r0 = "\" ("
            r4.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r25)
            r4.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0)
            goto L_0x0248
        L_0x0247:
            throw r2
        L_0x0248:
            goto L_0x0247
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p091b.C1874w.m5113j(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.b.u, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
