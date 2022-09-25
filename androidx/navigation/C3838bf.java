package androidx.navigation;

import android.content.Context;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.bf */
/* compiled from: PG */
public final class C3838bf {

    /* renamed from: a */
    private static final ThreadLocal f12378a = new ThreadLocal();

    /* renamed from: b */
    private final Context f12379b;

    /* renamed from: c */
    private final C3870ck f12380c;

    public C3838bf(Context context, C3870ck ckVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(ckVar, "navigatorProvider");
        this.f12379b = context;
        this.f12380c = ckVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0114, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.navigation.C3825ax m11068b(android.content.res.Resources r18, android.content.res.XmlResourceParser r19, android.util.AttributeSet r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            androidx.navigation.ck r4 = r0.f12380c
            java.lang.String r5 = r19.getName()
            java.lang.String r6 = "parser.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            androidx.navigation.ci r4 = r4.mo8077a(r5)
            androidx.navigation.ax r4 = r4.mo8074a()
            android.content.Context r5 = r0.f12379b
            r4.mo8035a(r5, r2)
            int r5 = r19.getDepth()
            r6 = 1
            int r5 = r5 + r6
        L_0x0026:
            int r7 = r19.next()
            if (r7 == r6) goto L_0x0258
            int r8 = r19.getDepth()
            r9 = 3
            if (r8 >= r5) goto L_0x0035
            if (r7 == r9) goto L_0x0258
        L_0x0035:
            r10 = 2
            if (r7 != r10) goto L_0x0254
            if (r8 > r5) goto L_0x0254
            java.lang.String r7 = r19.getName()
            java.lang.String r8 = "argument"
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r7)
            java.lang.String r12 = "Arguments must have a name"
            java.lang.String r13 = "res.obtainAttributes(att… R.styleable.NavArgument)"
            r14 = 0
            if (r11 == 0) goto L_0x006d
            int[] r7 = androidx.navigation.p178a.C3801a.f12271b
            android.content.res.TypedArray r7 = r1.obtainAttributes(r2, r7)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r13)
            java.lang.String r8 = r7.getString(r14)
            if (r8 == 0) goto L_0x0067
            androidx.navigation.g r9 = m11069c(r7, r1, r3)
            java.util.Map r10 = r4.f12359h
            r10.put(r8, r9)
            r7.recycle()
            goto L_0x0026
        L_0x0067:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            r1.<init>(r12)
            throw r1
        L_0x006d:
            java.lang.String r11 = "deepLink"
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r11, r7)
            java.lang.String r15 = "action"
            if (r11 == 0) goto L_0x0115
            int[] r7 = androidx.navigation.p178a.C3801a.f12272c
            android.content.res.TypedArray r7 = r1.obtainAttributes(r2, r7)
            java.lang.String r8 = "res.obtainAttributes(att… R.styleable.NavDeepLink)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.lang.String r8 = r7.getString(r9)
            java.lang.String r9 = r7.getString(r6)
            java.lang.String r10 = r7.getString(r10)
            if (r8 == 0) goto L_0x0096
            int r11 = r8.length()
            if (r11 != 0) goto L_0x00a6
        L_0x0096:
            if (r9 == 0) goto L_0x009e
            int r11 = r9.length()
            if (r11 != 0) goto L_0x00a6
        L_0x009e:
            if (r10 == 0) goto L_0x010d
            int r11 = r10.length()
            if (r11 == 0) goto L_0x010d
        L_0x00a6:
            androidx.navigation.aj r11 = new androidx.navigation.aj
            r11.<init>()
            java.lang.String r12 = "${applicationId}"
            java.lang.String r13 = "context.packageName"
            if (r8 == 0) goto L_0x00c1
            android.content.Context r14 = r0.f12379b
            java.lang.String r14 = r14.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r13)
            java.lang.String r8 = p5462h.p5483m.C69764m.m101231j(r8, r12, r14)
            r11.mo8068b(r8)
        L_0x00c1:
            if (r9 == 0) goto L_0x00eb
            int r8 = r9.length()
            if (r8 != 0) goto L_0x00ca
            goto L_0x00eb
        L_0x00ca:
            android.content.Context r8 = r0.f12379b
            java.lang.String r8 = r8.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r13)
            java.lang.String r8 = p5462h.p5483m.C69764m.m101231j(r9, r12, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r15)
            int r9 = r8.length()
            if (r9 <= 0) goto L_0x00e3
            r11.f12315a = r8
            goto L_0x00eb
        L_0x00e3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The NavDeepLink cannot have an empty action."
            r1.<init>(r2)
            throw r1
        L_0x00eb:
            if (r10 == 0) goto L_0x0101
            android.content.Context r8 = r0.f12379b
            java.lang.String r8 = r8.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r13)
            java.lang.String r8 = p5462h.p5483m.C69764m.m101231j(r10, r12, r8)
            java.lang.String r9 = "mimeType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)
            r11.f12316b = r8
        L_0x0101:
            androidx.navigation.ao r8 = r11.mo8067a()
            r4.mo8088f(r8)
            r7.recycle()
            goto L_0x0026
        L_0x010d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType"
            r1.<init>(r2)
            throw r1
        L_0x0115:
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r15, r7)
            if (r11 == 0) goto L_0x0213
            android.content.Context r7 = r0.f12379b
            int[] r11 = androidx.navigation.p178a.C3801a.f12270a
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r2, r11, r14, r14)
            int r11 = r7.getResourceId(r14, r14)
            int r15 = r7.getResourceId(r6, r14)
            androidx.navigation.f r6 = new androidx.navigation.f
            r6.<init>(r15)
            androidx.navigation.bg r15 = new androidx.navigation.bg
            r15.<init>()
            r9 = 4
            boolean r9 = r7.getBoolean(r9, r14)
            r15.f12381a = r9
            r9 = 10
            boolean r9 = r7.getBoolean(r9, r14)
            r15.f12382b = r9
            r9 = 7
            r10 = -1
            int r9 = r7.getResourceId(r9, r10)
            r10 = 8
            boolean r10 = r7.getBoolean(r10, r14)
            r16 = r5
            r5 = 9
            boolean r5 = r7.getBoolean(r5, r14)
            r15.mo8100b(r9, r10, r5)
            r5 = 2
            r9 = -1
            int r10 = r7.getResourceId(r5, r9)
            r15.f12383c = r10
            r5 = 3
            int r10 = r7.getResourceId(r5, r9)
            r15.f12384d = r10
            r5 = 5
            int r5 = r7.getResourceId(r5, r9)
            r15.f12385e = r5
            r5 = 6
            int r5 = r7.getResourceId(r5, r9)
            r15.f12386f = r5
            androidx.navigation.bh r5 = r15.mo8099a()
            r6.f12447b = r5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            int r9 = r19.getDepth()
            r10 = 1
            int r9 = r9 + r10
        L_0x0189:
            int r15 = r19.next()
            if (r15 == r10) goto L_0x01d1
            int r10 = r19.getDepth()
            if (r10 >= r9) goto L_0x0198
            r14 = 3
            if (r15 == r14) goto L_0x01d1
        L_0x0198:
            r14 = 2
            if (r15 != r14) goto L_0x01cc
            if (r10 > r9) goto L_0x01cc
            java.lang.String r10 = r19.getName()
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r10)
            if (r10 == 0) goto L_0x01cc
            int[] r10 = androidx.navigation.p178a.C3801a.f12271b
            android.content.res.TypedArray r10 = r1.obtainAttributes(r2, r10)
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r13)
            r15 = 0
            java.lang.String r14 = r10.getString(r15)
            if (r14 == 0) goto L_0x01c6
            androidx.navigation.g r15 = m11069c(r10, r1, r3)
            boolean r3 = r15.f12471c
            if (r3 == 0) goto L_0x01c2
            r15.mo8130a(r14, r5)
        L_0x01c2:
            r10.recycle()
            goto L_0x01cc
        L_0x01c6:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            r1.<init>(r12)
            throw r1
        L_0x01cc:
            r3 = r21
            r10 = 1
            r14 = 0
            goto L_0x0189
        L_0x01d1:
            boolean r3 = r5.isEmpty()
            if (r3 != 0) goto L_0x01d9
            r6.f12448c = r5
        L_0x01d9:
            boolean r3 = r4.mo8036b()
            if (r3 == 0) goto L_0x01f2
            if (r11 == 0) goto L_0x01ea
            androidx.c.o r3 = r4.f12358g
            r3.mo3730i(r11, r6)
            r7.recycle()
            goto L_0x024d
        L_0x01ea:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot have an action with actionId 0"
            r1.<init>(r2)
            throw r1
        L_0x01f2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot add action "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = " to "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0213:
            r16 = r5
            java.lang.String r3 = "include"
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r7)
            if (r3 == 0) goto L_0x023f
            boolean r3 = r4 instanceof androidx.navigation.C3834bb
            if (r3 == 0) goto L_0x023f
            int[] r3 = androidx.navigation.C3873cn.f12441c
            android.content.res.TypedArray r3 = r1.obtainAttributes(r2, r3)
            java.lang.String r5 = "res.obtainAttributes(att…n.R.styleable.NavInclude)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            r5 = 0
            int r5 = r3.getResourceId(r5, r5)
            r6 = r4
            androidx.navigation.bb r6 = (androidx.navigation.C3834bb) r6
            androidx.navigation.bb r5 = r0.mo8098a(r5)
            r6.mo8095i(r5)
            r3.recycle()
            goto L_0x024d
        L_0x023f:
            boolean r3 = r4 instanceof androidx.navigation.C3834bb
            if (r3 == 0) goto L_0x024d
            r3 = r4
            androidx.navigation.bb r3 = (androidx.navigation.C3834bb) r3
            androidx.navigation.ax r5 = r17.m11068b(r18, r19, r20, r21)
            r3.mo8095i(r5)
        L_0x024d:
            r3 = r21
            r5 = r16
            r6 = 1
            goto L_0x0026
        L_0x0254:
            r3 = r21
            goto L_0x0026
        L_0x0258:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3838bf.m11068b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):androidx.navigation.ax");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:142|143|144|145|146|147|148|149|150|153) */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02a3, code lost:
        r1 = androidx.navigation.C3860ca.f12419j;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x028b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0293 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x029b */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final androidx.navigation.C3886g m11069c(android.content.res.TypedArray r16, android.content.res.Resources r17, int r18) {
        /*
            r0 = r16
            int[] r1 = androidx.navigation.p178a.C3801a.f12270a
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal r4 = f12378a
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L_0x001c
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L_0x001c:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>"
            java.lang.String r7 = "boolean"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>"
            java.lang.String r10 = "float"
            if (r4 == 0) goto L_0x016e
            java.lang.String r12 = r17.getResourcePackageName(r18)
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r4)
            if (r13 == 0) goto L_0x003b
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12410a
            goto L_0x016f
        L_0x003b:
            java.lang.String r13 = "integer[]"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x0047
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12412c
            goto L_0x016f
        L_0x0047:
            java.lang.String r13 = "long"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x0053
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12413d
            goto L_0x016f
        L_0x0053:
            java.lang.String r13 = "long[]"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x005f
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12414e
            goto L_0x016f
        L_0x005f:
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r4)
            if (r13 == 0) goto L_0x0069
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12417h
            goto L_0x016f
        L_0x0069:
            java.lang.String r13 = "boolean[]"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x0075
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12418i
            goto L_0x016f
        L_0x0075:
            java.lang.String r13 = "string"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x0081
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12419j
            goto L_0x016f
        L_0x0081:
            java.lang.String r13 = "string[]"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x008d
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12420k
            goto L_0x016f
        L_0x008d:
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r4)
            if (r13 == 0) goto L_0x0097
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12415f
            goto L_0x016f
        L_0x0097:
            java.lang.String r13 = "float[]"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x00a3
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12416g
            goto L_0x016f
        L_0x00a3:
            java.lang.String r13 = "reference"
            boolean r13 = p5462h.p5473f.p5475b.C69664n.m101066l(r13, r4)
            if (r13 == 0) goto L_0x00af
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12411b
            goto L_0x016f
        L_0x00af:
            int r13 = r4.length()
            if (r13 != 0) goto L_0x00b9
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12419j
            goto L_0x016f
        L_0x00b9:
            java.lang.String r13 = "."
            boolean r13 = p5462h.p5483m.C69764m.m101234m(r4, r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x00c8
            if (r12 == 0) goto L_0x00c8
            java.lang.String r12 = r12.concat(r4)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x00c9
        L_0x00c8:
            r12 = r4
        L_0x00c9:
            java.lang.String r13 = "[]"
            boolean r13 = p5462h.p5483m.C69764m.m101230i(r4, r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x0111
            int r13 = r12.length()     // Catch:{ ClassNotFoundException -> 0x0167 }
            int r13 = r13 + -2
            java.lang.String r12 = r12.substring(r2, r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.String r13 = "this as java.lang.String…ing(startIndex, endIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.Class<android.os.Parcelable> r14 = android.os.Parcelable.class
            boolean r14 = r14.isAssignableFrom(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r14 == 0) goto L_0x00fb
            androidx.navigation.bw r12 = new androidx.navigation.bw     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x00f5
            r12.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x016f
        L_0x00f5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x0167 }
            r0.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x00fb:
            java.lang.Class<java.io.Serializable> r14 = java.io.Serializable.class
            boolean r14 = r14.isAssignableFrom(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r14 == 0) goto L_0x015b
            androidx.navigation.by r12 = new androidx.navigation.by     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x010b
            r12.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x016f
        L_0x010b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x0167 }
            r0.<init>(r9)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x0111:
            java.lang.Class r13 = java.lang.Class.forName(r12)     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.Class<android.os.Parcelable> r14 = android.os.Parcelable.class
            boolean r14 = r14.isAssignableFrom(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r14 == 0) goto L_0x012d
            androidx.navigation.bx r12 = new androidx.navigation.bx     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x0125
            r12.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x016f
        L_0x0125:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>"
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x012d:
            java.lang.Class<java.lang.Enum> r14 = java.lang.Enum.class
            boolean r14 = r14.isAssignableFrom(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r14 == 0) goto L_0x0145
            androidx.navigation.bv r12 = new androidx.navigation.bv     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x013d
            r12.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x016f
        L_0x013d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>"
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x0145:
            java.lang.Class<java.io.Serializable> r14 = java.io.Serializable.class
            boolean r14 = r14.isAssignableFrom(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r14 == 0) goto L_0x015b
            androidx.navigation.bz r12 = new androidx.navigation.bz     // Catch:{ ClassNotFoundException -> 0x0167 }
            if (r13 == 0) goto L_0x0155
            r12.<init>(r13)     // Catch:{ ClassNotFoundException -> 0x0167 }
            goto L_0x016f
        L_0x0155:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ ClassNotFoundException -> 0x0167 }
            r0.<init>(r9)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x0167 }
            java.lang.String r1 = " is not Serializable or Parcelable."
            java.lang.String r1 = p5462h.p5473f.p5475b.C69664n.m101057c(r12, r1)     // Catch:{ ClassNotFoundException -> 0x0167 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x0167 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x0167 }
        L_0x0167:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x016e:
            r12 = 0
        L_0x016f:
            r13 = 1
            boolean r14 = r0.getValue(r13, r5)
            if (r14 == 0) goto L_0x02ab
            androidx.navigation.ca r14 = androidx.navigation.C3860ca.f12411b
            java.lang.String r15 = "' for "
            java.lang.String r2 = "unsupported value '"
            r11 = 16
            if (r12 != r14) goto L_0x01b9
            int r0 = r5.resourceId
            if (r0 == 0) goto L_0x0187
            int r0 = r5.resourceId
            goto L_0x0190
        L_0x0187:
            int r0 = r5.type
            if (r0 != r11) goto L_0x0196
            int r0 = r5.data
            if (r0 != 0) goto L_0x0196
            r0 = 0
        L_0x0190:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02ac
        L_0x0196:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = r12.mo8104b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01b9:
            int r14 = r5.resourceId
            if (r14 == 0) goto L_0x01ec
            if (r12 != 0) goto L_0x01c9
            androidx.navigation.ca r12 = androidx.navigation.C3860ca.f12411b
            int r0 = r5.resourceId
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02ac
        L_0x01c9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = r12.mo8104b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \"reference\" type to reference other resources."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01ec:
            androidx.navigation.ca r2 = androidx.navigation.C3860ca.f12419j
            if (r12 != r2) goto L_0x01f6
            java.lang.String r0 = r0.getString(r13)
            goto L_0x02ac
        L_0x01f6:
            int r0 = r5.type
            if (r0 == r1) goto L_0x0276
            r1 = 4
            if (r0 == r1) goto L_0x0267
            r1 = 5
            if (r0 == r1) goto L_0x0251
            r1 = 18
            if (r0 == r1) goto L_0x023f
            int r0 = r5.type
            if (r0 < r11) goto L_0x022d
            int r0 = r5.type
            r1 = 31
            if (r0 > r1) goto L_0x022d
            androidx.navigation.ca r0 = androidx.navigation.C3860ca.f12415f
            if (r12 != r0) goto L_0x021f
            androidx.navigation.ca r12 = androidx.navigation.C3837be.m11067a(r5, r12, r0, r4, r10)
            int r0 = r5.data
            float r0 = (float) r0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x02ac
        L_0x021f:
            androidx.navigation.ca r0 = androidx.navigation.C3860ca.f12410a
            androidx.navigation.ca r12 = androidx.navigation.C3837be.m11067a(r5, r12, r0, r4, r8)
            int r0 = r5.data
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02ac
        L_0x022d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            int r1 = r5.type
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "unsupported argument type "
            java.lang.String r1 = p5462h.p5473f.p5475b.C69664n.m101057c(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x023f:
            androidx.navigation.ca r0 = androidx.navigation.C3860ca.f12417h
            androidx.navigation.ca r12 = androidx.navigation.C3837be.m11067a(r5, r12, r0, r4, r7)
            int r0 = r5.data
            if (r0 == 0) goto L_0x024b
            r0 = 1
            goto L_0x024c
        L_0x024b:
            r0 = 0
        L_0x024c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x02ac
        L_0x0251:
            androidx.navigation.ca r0 = androidx.navigation.C3860ca.f12410a
            java.lang.String r1 = "dimension"
            androidx.navigation.ca r12 = androidx.navigation.C3837be.m11067a(r5, r12, r0, r4, r1)
            android.util.DisplayMetrics r0 = r17.getDisplayMetrics()
            float r0 = r5.getDimension(r0)
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x02ac
        L_0x0267:
            androidx.navigation.ca r0 = androidx.navigation.C3860ca.f12415f
            androidx.navigation.ca r12 = androidx.navigation.C3837be.m11067a(r5, r12, r0, r4, r10)
            float r0 = r5.getFloat()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x02ac
        L_0x0276:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r12 != 0) goto L_0x02a6
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12410a     // Catch:{ IllegalArgumentException -> 0x028b }
            r1.mo8103a(r0)     // Catch:{ IllegalArgumentException -> 0x028b }
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12410a     // Catch:{ IllegalArgumentException -> 0x028b }
            goto L_0x02a5
        L_0x028b:
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12413d     // Catch:{ IllegalArgumentException -> 0x0293 }
            r1.mo8103a(r0)     // Catch:{ IllegalArgumentException -> 0x0293 }
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12413d     // Catch:{ IllegalArgumentException -> 0x0293 }
            goto L_0x02a5
        L_0x0293:
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12415f     // Catch:{ IllegalArgumentException -> 0x029b }
            r1.mo8103a(r0)     // Catch:{ IllegalArgumentException -> 0x029b }
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12415f     // Catch:{ IllegalArgumentException -> 0x029b }
            goto L_0x02a5
        L_0x029b:
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12417h     // Catch:{ IllegalArgumentException -> 0x02a3 }
            r1.mo8103a(r0)     // Catch:{ IllegalArgumentException -> 0x02a3 }
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12417h     // Catch:{ IllegalArgumentException -> 0x02a3 }
            goto L_0x02a5
        L_0x02a3:
            androidx.navigation.ca r1 = androidx.navigation.C3860ca.f12419j
        L_0x02a5:
            r12 = r1
        L_0x02a6:
            java.lang.Object r0 = r12.mo8103a(r0)
            goto L_0x02ac
        L_0x02ab:
            r0 = 0
        L_0x02ac:
            if (r0 == 0) goto L_0x02b0
            r2 = 1
            goto L_0x02b2
        L_0x02b0:
            r0 = 0
            r2 = 0
        L_0x02b2:
            if (r12 == 0) goto L_0x02b6
            r11 = r12
            goto L_0x02b7
        L_0x02b6:
            r11 = 0
        L_0x02b7:
            if (r11 != 0) goto L_0x03c4
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x02c1
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12410a
            goto L_0x03c4
        L_0x02c1:
            boolean r1 = r0 instanceof int[]
            if (r1 == 0) goto L_0x02c9
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12412c
            goto L_0x03c4
        L_0x02c9:
            boolean r1 = r0 instanceof java.lang.Long
            if (r1 == 0) goto L_0x02d1
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12413d
            goto L_0x03c4
        L_0x02d1:
            boolean r1 = r0 instanceof long[]
            if (r1 == 0) goto L_0x02d9
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12414e
            goto L_0x03c4
        L_0x02d9:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L_0x02e1
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12415f
            goto L_0x03c4
        L_0x02e1:
            boolean r1 = r0 instanceof float[]
            if (r1 == 0) goto L_0x02e9
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12416g
            goto L_0x03c4
        L_0x02e9:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L_0x02f1
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12417h
            goto L_0x03c4
        L_0x02f1:
            boolean r1 = r0 instanceof boolean[]
            if (r1 == 0) goto L_0x02f9
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12418i
            goto L_0x03c4
        L_0x02f9:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x03c2
            if (r0 != 0) goto L_0x0301
            goto L_0x03c2
        L_0x0301:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0310
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r1 = r1 instanceof java.lang.String[]
            if (r1 == 0) goto L_0x0310
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12420k
            goto L_0x03c4
        L_0x0310:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0344
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            java.lang.Class<android.os.Parcelable> r4 = android.os.Parcelable.class
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0344
            androidx.navigation.bw r11 = new androidx.navigation.bw
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r1 == 0) goto L_0x033e
            r11.<init>(r1)
            goto L_0x03c4
        L_0x033e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r6)
            throw r0
        L_0x0344:
            java.lang.Class r1 = r0.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L_0x0377
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            boolean r1 = r4.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0377
            androidx.navigation.by r11 = new androidx.navigation.by
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r1 == 0) goto L_0x0371
            r11.<init>(r1)
            goto L_0x03c4
        L_0x0371:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r9)
            throw r0
        L_0x0377:
            boolean r1 = r0 instanceof android.os.Parcelable
            if (r1 == 0) goto L_0x0385
            androidx.navigation.bx r11 = new androidx.navigation.bx
            java.lang.Class r1 = r0.getClass()
            r11.<init>(r1)
            goto L_0x03c4
        L_0x0385:
            boolean r1 = r0 instanceof java.lang.Enum
            if (r1 == 0) goto L_0x0393
            androidx.navigation.bv r11 = new androidx.navigation.bv
            java.lang.Class r1 = r0.getClass()
            r11.<init>(r1)
            goto L_0x03c4
        L_0x0393:
            boolean r1 = r0 instanceof java.io.Serializable
            if (r1 == 0) goto L_0x03a1
            androidx.navigation.bz r11 = new androidx.navigation.bz
            java.lang.Class r1 = r0.getClass()
            r11.<init>(r1)
            goto L_0x03c4
        L_0x03a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Object of type "
            r2.<init>(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x03c2:
            androidx.navigation.ca r11 = androidx.navigation.C3860ca.f12419j
        L_0x03c4:
            androidx.navigation.g r1 = new androidx.navigation.g
            r1.<init>(r11, r3, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3838bf.m11069c(android.content.res.TypedArray, android.content.res.Resources, int):androidx.navigation.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if ((r2 instanceof androidx.navigation.C3834bb) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        r2 = (androidx.navigation.C3834bb) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        throw new java.lang.IllegalArgumentException("Root element <" + r3 + "> did not inflate into a NavGraph");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        r3 = r1.getName();
        p5462h.p5473f.p5475b.C69664n.m101060f(r0, "res");
        p5462h.p5473f.p5475b.C69664n.m101060f(r2, "attrs");
        r2 = m11068b(r0, r1, r2, r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.navigation.C3834bb mo8098a(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f12379b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            java.lang.String r2 = "res.getXml(graphResId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x0013:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0060 }
            r4 = 2
            if (r3 == r4) goto L_0x0026
            r4 = 1
            if (r3 == r4) goto L_0x001e
            goto L_0x0013
        L_0x001e:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0060 }
            throw r2     // Catch:{ Exception -> 0x0060 }
        L_0x0026:
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "res"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "attrs"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)     // Catch:{ Exception -> 0x0060 }
            androidx.navigation.ax r2 = r6.m11068b(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0060 }
            boolean r4 = r2 instanceof androidx.navigation.C3834bb     // Catch:{ Exception -> 0x0060 }
            if (r4 == 0) goto L_0x0042
            androidx.navigation.bb r2 = (androidx.navigation.C3834bb) r2     // Catch:{ Exception -> 0x0060 }
            r1.close()
            return r2
        L_0x0042:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060 }
            r2.<init>()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r4 = "Root element <"
            r2.append(r4)     // Catch:{ Exception -> 0x0060 }
            r2.append(r3)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r2.append(r3)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0060 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0060 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0060 }
            throw r3     // Catch:{ Exception -> 0x0060 }
        L_0x005e:
            r7 = move-exception
            goto L_0x0088
        L_0x0060:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r4.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x005e }
            r4.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x005e }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x005e }
            r4.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x005e }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x005e }
            throw r3     // Catch:{ all -> 0x005e }
        L_0x0088:
            r1.close()
            goto L_0x008d
        L_0x008c:
            throw r7
        L_0x008d:
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C3838bf.mo8098a(int):androidx.navigation.bb");
    }
}
