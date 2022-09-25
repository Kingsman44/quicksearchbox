package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.C1745d;
import androidx.constraintlayout.widget.C1751j;

/* renamed from: androidx.constraintlayout.motion.widget.am */
/* compiled from: PG */
public final class C1714am {

    /* renamed from: a */
    public int f4986a;

    /* renamed from: b */
    public int f4987b = -1;

    /* renamed from: c */
    int f4988c;

    /* renamed from: d */
    C1723h f4989d;

    /* renamed from: e */
    C1751j f4990e;

    /* renamed from: f */
    Context f4991f;

    /* renamed from: g */
    public int f4992g;

    /* renamed from: h */
    public int f4993h;

    /* renamed from: i */
    public int f4994i;

    /* renamed from: j */
    public int f4995j;

    /* renamed from: k */
    private boolean f4996k;

    /* renamed from: l */
    private int f4997l;

    /* renamed from: m */
    private int f4998m;

    /* renamed from: n */
    private int f4999n;

    /* renamed from: o */
    private int f5000o;

    /* renamed from: p */
    private String f5001p;

    /* renamed from: q */
    private int f5002q;

    /* renamed from: r */
    private String f5003r;

    /* renamed from: s */
    private int f5004s;

    /* renamed from: t */
    private int f5005t;

    /* renamed from: u */
    private int f5006u;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1714am(android.content.Context r17, org.xmlpull.v1.XmlPullParser r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r16.<init>()
            r3 = -1
            r1.f4987b = r3
            r4 = 0
            r1.f4996k = r4
            r1.f4997l = r4
            r1.f4998m = r3
            r1.f4999n = r3
            r1.f5002q = r4
            r5 = 0
            r1.f5003r = r5
            r1.f5004s = r3
            r1.f4992g = r3
            r1.f4993h = r3
            r1.f5005t = r3
            r1.f5006u = r3
            r1.f4994i = r3
            r1.f4995j = r3
            r1.f4991f = r0
            int r5 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
        L_0x002e:
            r6 = 1
            if (r5 == r6) goto L_0x0275
            r7 = 2
            r8 = 3
            java.lang.String r9 = "ViewTransition"
            if (r5 == r7) goto L_0x0046
            if (r5 == r8) goto L_0x003b
            goto L_0x026e
        L_0x003b:
            java.lang.String r5 = r18.getName()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            boolean r5 = r9.equals(r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r5 == 0) goto L_0x026e
            return
        L_0x0046:
            java.lang.String r5 = r18.getName()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r11 = 4
            switch(r10) {
                case -1962203927: goto L_0x0079;
                case -1239391468: goto L_0x006f;
                case 61998586: goto L_0x0067;
                case 366511058: goto L_0x005d;
                case 1791837707: goto L_0x0053;
                default: goto L_0x0052;
            }
        L_0x0052:
            goto L_0x0083
        L_0x0053:
            java.lang.String r10 = "CustomAttribute"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x0083
            r10 = 3
            goto L_0x0084
        L_0x005d:
            java.lang.String r10 = "CustomMethod"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x0083
            r10 = 4
            goto L_0x0084
        L_0x0067:
            boolean r10 = r5.equals(r9)
            if (r10 == 0) goto L_0x0083
            r10 = 0
            goto L_0x0084
        L_0x006f:
            java.lang.String r10 = "KeyFrameSet"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x0083
            r10 = 1
            goto L_0x0084
        L_0x0079:
            java.lang.String r10 = "ConstraintOverride"
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L_0x0083
            r10 = 2
            goto L_0x0084
        L_0x0083:
            r10 = -1
        L_0x0084:
            r12 = 13
            if (r10 == 0) goto L_0x013b
            if (r10 == r6) goto L_0x0132
            if (r10 == r7) goto L_0x012a
            if (r10 == r8) goto L_0x0121
            if (r10 == r11) goto L_0x0121
            java.lang.Throwable r7 = new java.lang.Throwable     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r6 = r7[r6]     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r7 = r6.getFileName()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r8 = r6.getLineNumber()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r6 = r6.getMethodName()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r10 = java.lang.String.valueOf(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r10 = r10.length()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r10 = r10 + 18
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r11 = r11.length()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r10 = r10 + r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r11.<init>(r10)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r10 = ".("
            r11.append(r10)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r11.append(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r7 = ":"
            r11.append(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r11.append(r8)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r7 = ") "
            r11.append(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r11.append(r6)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r6 = "()"
            r11.append(r6)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r6 = r11.toString()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r7 = r6.length()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r7 = r7 + r12
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r8 = r8.length()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r8.<init>(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r8.append(r6)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r6 = " unknown tag "
            r8.append(r6)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r8.append(r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r5 = r8.toString()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            android.util.Log.e(r9, r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r5 = r18.getLineNumber()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r7 = 16
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r7 = ".xml:"
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.lang.String r5 = r6.toString()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            android.util.Log.e(r9, r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x026e
        L_0x0121:
            androidx.constraintlayout.widget.j r5 = r1.f4990e     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            java.util.HashMap r5 = r5.f5344g     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            androidx.constraintlayout.widget.C1742a.m4755d(r0, r2, r5)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x026e
        L_0x012a:
            androidx.constraintlayout.widget.j r5 = androidx.constraintlayout.widget.C1756o.m4803d(r17, r18)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4990e = r5     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x026e
        L_0x0132:
            androidx.constraintlayout.motion.widget.h r5 = new androidx.constraintlayout.motion.widget.h     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r5.<init>(r0, r2)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4989d = r5     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x026e
        L_0x013b:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int[] r9 = androidx.constraintlayout.widget.C1761t.f5480v     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r9)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r9 = r5.getIndexCount()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r10 = 0
        L_0x014a:
            if (r10 >= r9) goto L_0x026b
            int r13 = r5.getIndex(r10)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 != 0) goto L_0x015c
            int r13 = r1.f4986a     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getResourceId(r4, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4986a = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x015c:
            r14 = 8
            if (r13 != r14) goto L_0x0190
            boolean r13 = androidx.constraintlayout.motion.widget.MotionLayout.f4817a     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 == 0) goto L_0x0176
            int r13 = r1.f5000o     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getResourceId(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5000o = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 != r3) goto L_0x0266
            java.lang.String r13 = r5.getString(r14)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5001p = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0176:
            android.util.TypedValue r13 = r5.peekValue(r14)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r13.type     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 != r8) goto L_0x0186
            java.lang.String r13 = r5.getString(r14)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5001p = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0186:
            int r13 = r1.f5000o     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getResourceId(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5000o = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0190:
            r14 = 9
            if (r13 != r14) goto L_0x019e
            int r13 = r1.f4987b     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getInt(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4987b = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x019e:
            r14 = 12
            if (r13 != r14) goto L_0x01ac
            boolean r13 = r1.f4996k     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            boolean r13 = r5.getBoolean(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4996k = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01ac:
            r14 = 10
            if (r13 != r14) goto L_0x01ba
            int r13 = r1.f4997l     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getInt(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4997l = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01ba:
            if (r13 != r11) goto L_0x01c6
            int r13 = r1.f4998m     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getInt(r11, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4998m = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01c6:
            if (r13 != r12) goto L_0x01d2
            int r13 = r1.f4999n     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getInt(r12, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4999n = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01d2:
            r14 = 14
            if (r13 != r14) goto L_0x01e0
            int r13 = r1.f4988c     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r13 = r5.getInt(r14, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4988c = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01e0:
            r14 = 7
            if (r13 != r14) goto L_0x0221
            android.util.TypedValue r13 = r5.peekValue(r14)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r15 = r13.type     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r4 = -2
            if (r15 != r6) goto L_0x01f8
            int r13 = r5.getResourceId(r14, r3)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5004s = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 == r3) goto L_0x0266
            r1.f5002q = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x01f8:
            int r13 = r13.type     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 != r8) goto L_0x0218
            java.lang.String r13 = r5.getString(r14)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5003r = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 == 0) goto L_0x0215
            java.lang.String r15 = "/"
            int r13 = r13.indexOf(r15)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            if (r13 <= 0) goto L_0x0215
            int r13 = r5.getResourceId(r14, r3)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5004s = r13     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5002q = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0215:
            r1.f5002q = r3     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0218:
            int r4 = r1.f5002q     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getInteger(r14, r4)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5002q = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0221:
            r4 = 11
            if (r13 != r4) goto L_0x022e
            int r13 = r1.f4992g     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getResourceId(r4, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4992g = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x022e:
            if (r13 != r8) goto L_0x0239
            int r4 = r1.f4993h     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getResourceId(r8, r4)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4993h = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0239:
            r4 = 6
            if (r13 != r4) goto L_0x0245
            int r13 = r1.f5005t     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getResourceId(r4, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5005t = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0245:
            r4 = 5
            if (r13 != r4) goto L_0x0251
            int r13 = r1.f5006u     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getResourceId(r4, r13)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f5006u = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x0251:
            if (r13 != r7) goto L_0x025c
            int r4 = r1.f4995j     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getResourceId(r7, r4)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4995j = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            goto L_0x0266
        L_0x025c:
            if (r13 != r6) goto L_0x0266
            int r4 = r1.f4994i     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            int r4 = r5.getInteger(r6, r4)     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r1.f4994i = r4     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
        L_0x0266:
            int r10 = r10 + 1
            r4 = 0
            goto L_0x014a
        L_0x026b:
            r5.recycle()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
        L_0x026e:
            int r5 = r18.next()     // Catch:{ XmlPullParserException -> 0x027b, IOException -> 0x0276 }
            r4 = 0
            goto L_0x002e
        L_0x0275:
            return
        L_0x0276:
            r0 = move-exception
            r0.printStackTrace()
            return
        L_0x027b:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1714am.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [android.view.animation.Interpolator] */
    /* JADX WARNING: type inference failed for: r7v18, types: [android.view.animation.Interpolator] */
    /* JADX WARNING: type inference failed for: r7v19, types: [androidx.constraintlayout.motion.widget.ak] */
    /* JADX WARNING: type inference failed for: r7v20, types: [android.view.animation.AccelerateDecelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r7v21, types: [android.view.animation.AccelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r7v22, types: [android.view.animation.DecelerateInterpolator] */
    /* JADX WARNING: type inference failed for: r7v23, types: [android.view.animation.BounceInterpolator] */
    /* JADX WARNING: type inference failed for: r7v24, types: [android.view.animation.OvershootInterpolator] */
    /* JADX WARNING: type inference failed for: r7v25, types: [android.view.animation.AnticipateInterpolator] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4786a(androidx.constraintlayout.motion.widget.C1716ao r21, androidx.constraintlayout.motion.widget.MotionLayout r22, int r23, androidx.constraintlayout.widget.C1756o r24, android.view.View... r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            boolean r5 = r0.f4996k
            if (r5 == 0) goto L_0x000f
            return
        L_0x000f:
            int r5 = r0.f4988c
            r6 = 2
            r7 = 0
            r8 = -1
            r9 = 0
            r10 = 1
            if (r5 != r6) goto L_0x00dc
            r2 = r4[r9]
            androidx.constraintlayout.motion.widget.r r13 = new androidx.constraintlayout.motion.widget.r
            r13.<init>(r2)
            androidx.constraintlayout.motion.widget.ab r3 = r13.f5142e
            r4 = 0
            r3.f4880d = r4
            r3.f4881e = r4
            r13.f5131B = r10
            float r4 = r2.getX()
            float r5 = r2.getY()
            int r6 = r2.getWidth()
            float r6 = (float) r6
            int r9 = r2.getHeight()
            float r9 = (float) r9
            r3.mo4752c(r4, r5, r6, r9)
            androidx.constraintlayout.motion.widget.ab r3 = r13.f5143f
            float r4 = r2.getX()
            float r5 = r2.getY()
            int r6 = r2.getWidth()
            float r6 = (float) r6
            int r9 = r2.getHeight()
            float r9 = (float) r9
            r3.mo4752c(r4, r5, r6, r9)
            androidx.constraintlayout.motion.widget.p r3 = r13.f5144g
            r3.mo4802b(r2)
            androidx.constraintlayout.motion.widget.p r3 = r13.f5145h
            r3.mo4802b(r2)
            androidx.constraintlayout.motion.widget.h r2 = r0.f4989d
            java.util.HashMap r2 = r2.f5056b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L_0x0073
            java.util.ArrayList r3 = r13.f5156s
            r3.addAll(r2)
        L_0x0073:
            int r2 = r22.getWidth()
            int r3 = r22.getHeight()
            long r4 = java.lang.System.nanoTime()
            r13.mo4810f(r2, r3, r4)
            androidx.constraintlayout.motion.widget.al r11 = new androidx.constraintlayout.motion.widget.al
            int r14 = r0.f4998m
            int r15 = r0.f4999n
            int r2 = r0.f4987b
            android.content.Context r1 = r22.getContext()
            int r3 = r0.f5002q
            switch(r3) {
                case -2: goto L_0x00c4;
                case -1: goto L_0x00b8;
                case 0: goto L_0x00b2;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a6;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00a0;
                case 5: goto L_0x009a;
                case 6: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x00ca
        L_0x0094:
            android.view.animation.AnticipateInterpolator r7 = new android.view.animation.AnticipateInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x009a:
            android.view.animation.OvershootInterpolator r7 = new android.view.animation.OvershootInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x00a0:
            android.view.animation.BounceInterpolator r7 = new android.view.animation.BounceInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x00a6:
            android.view.animation.DecelerateInterpolator r7 = new android.view.animation.DecelerateInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x00ac:
            android.view.animation.AccelerateInterpolator r7 = new android.view.animation.AccelerateInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x00b2:
            android.view.animation.AccelerateDecelerateInterpolator r7 = new android.view.animation.AccelerateDecelerateInterpolator
            r7.<init>()
            goto L_0x00ca
        L_0x00b8:
            java.lang.String r1 = r0.f5003r
            androidx.constraintlayout.a.a.a.f r1 = androidx.constraintlayout.p079a.p080a.p081a.C1596f.m4246c(r1)
            androidx.constraintlayout.motion.widget.ak r7 = new androidx.constraintlayout.motion.widget.ak
            r7.<init>(r1)
            goto L_0x00ca
        L_0x00c4:
            int r3 = r0.f5004s
            android.view.animation.Interpolator r7 = android.view.animation.AnimationUtils.loadInterpolator(r1, r3)
        L_0x00ca:
            r17 = r7
            int r1 = r0.f4992g
            int r3 = r0.f4993h
            r12 = r21
            r16 = r2
            r18 = r1
            r19 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x00dc:
            if (r5 != r10) goto L_0x012a
            androidx.constraintlayout.motion.widget.af r5 = r1.f4852b
            if (r5 != 0) goto L_0x00e3
            goto L_0x00f9
        L_0x00e3:
            android.util.SparseArray r6 = r5.f4922f
            int r6 = r6.size()
            int[] r7 = new int[r6]
            r10 = 0
        L_0x00ec:
            if (r10 >= r6) goto L_0x00f9
            android.util.SparseArray r11 = r5.f4922f
            int r11 = r11.keyAt(r10)
            r7[r10] = r11
            int r10 = r10 + 1
            goto L_0x00ec
        L_0x00f9:
            r5 = 0
        L_0x00fa:
            int r6 = r7.length
            if (r5 >= r6) goto L_0x012a
            r6 = r7[r5]
            if (r6 != r2) goto L_0x0102
            goto L_0x0127
        L_0x0102:
            androidx.constraintlayout.widget.o r6 = r1.mo4716c(r6)
            int r10 = r4.length
            r11 = 0
        L_0x0108:
            if (r11 >= r10) goto L_0x0127
            r12 = r4[r11]
            int r12 = r12.getId()
            androidx.constraintlayout.widget.j r12 = r6.mo4886f(r12)
            androidx.constraintlayout.widget.j r13 = r0.f4990e
            if (r13 == 0) goto L_0x0124
            r13.mo4874b(r12)
            java.util.HashMap r12 = r12.f5344g
            androidx.constraintlayout.widget.j r13 = r0.f4990e
            java.util.HashMap r13 = r13.f5344g
            r12.putAll(r13)
        L_0x0124:
            int r11 = r11 + 1
            goto L_0x0108
        L_0x0127:
            int r5 = r5 + 1
            goto L_0x00fa
        L_0x012a:
            androidx.constraintlayout.widget.o r5 = new androidx.constraintlayout.widget.o
            r5.<init>()
            java.util.HashMap r6 = r5.f5457f
            r6.clear()
            java.util.HashMap r6 = r3.f5457f
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x013e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x015e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.util.HashMap r10 = r3.f5457f
            java.lang.Object r10 = r10.get(r7)
            androidx.constraintlayout.widget.j r10 = (androidx.constraintlayout.widget.C1751j) r10
            if (r10 == 0) goto L_0x013e
            java.util.HashMap r11 = r5.f5457f
            androidx.constraintlayout.widget.j r10 = r10.clone()
            r11.put(r7, r10)
            goto L_0x013e
        L_0x015e:
            int r6 = r4.length
            r7 = 0
        L_0x0160:
            if (r7 >= r6) goto L_0x017f
            r10 = r4[r7]
            int r10 = r10.getId()
            androidx.constraintlayout.widget.j r10 = r5.mo4886f(r10)
            androidx.constraintlayout.widget.j r11 = r0.f4990e
            if (r11 == 0) goto L_0x017c
            r11.mo4874b(r10)
            java.util.HashMap r10 = r10.f5344g
            androidx.constraintlayout.widget.j r11 = r0.f4990e
            java.util.HashMap r11 = r11.f5344g
            r10.putAll(r11)
        L_0x017c:
            int r7 = r7 + 1
            goto L_0x0160
        L_0x017f:
            r1.mo4745z(r2, r5)
            r5 = 2131436932(0x7f0b2584, float:1.8495748E38)
            r1.mo4745z(r5, r3)
            r1.mo4736r(r5, r8, r8)
            androidx.constraintlayout.motion.widget.ae r3 = new androidx.constraintlayout.motion.widget.ae
            androidx.constraintlayout.motion.widget.af r5 = r1.f4852b
            r3.<init>((androidx.constraintlayout.motion.widget.C1707af) r5, (int) r2)
            int r2 = r4.length
            r5 = 0
        L_0x0194:
            if (r5 >= r2) goto L_0x01ee
            r6 = r4[r5]
            int r7 = r0.f4998m
            if (r7 == r8) goto L_0x01a4
            r10 = 8
            int r7 = java.lang.Math.max(r7, r10)
            r3.f4906h = r7
        L_0x01a4:
            int r7 = r0.f4997l
            r3.f4914p = r7
            int r7 = r0.f5002q
            java.lang.String r10 = r0.f5003r
            int r11 = r0.f5004s
            r3.f4903e = r7
            r3.f4904f = r10
            r3.f4905g = r11
            int r6 = r6.getId()
            androidx.constraintlayout.motion.widget.h r7 = r0.f4989d
            if (r7 == 0) goto L_0x01eb
            java.util.HashMap r7 = r7.f5056b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r10)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            androidx.constraintlayout.motion.widget.h r10 = new androidx.constraintlayout.motion.widget.h
            r10.<init>()
            int r11 = r7.size()
            r12 = 0
        L_0x01d2:
            if (r12 >= r11) goto L_0x01e6
            java.lang.Object r13 = r7.get(r12)
            androidx.constraintlayout.motion.widget.c r13 = (androidx.constraintlayout.motion.widget.C1718c) r13
            androidx.constraintlayout.motion.widget.c r13 = r13.clone()
            r13.f5014b = r6
            r10.mo4799b(r13)
            int r12 = r12 + 1
            goto L_0x01d2
        L_0x01e6:
            java.util.ArrayList r6 = r3.f4909k
            r6.add(r10)
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x0194
        L_0x01ee:
            r1.mo4740u(r3)
            androidx.constraintlayout.motion.widget.aj r2 = new androidx.constraintlayout.motion.widget.aj
            r2.<init>(r0, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.mo4718i(r3)
            r1.f4828K = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1714am.mo4786a(androidx.constraintlayout.motion.widget.ao, androidx.constraintlayout.motion.widget.MotionLayout, int, androidx.constraintlayout.widget.o, android.view.View[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo4788c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f5000o == -1 && this.f5001p == null) || !mo4787b(view)) {
            return false;
        }
        if (view.getId() == this.f5000o) {
            return true;
        }
        if (this.f5001p != null && (view.getLayoutParams() instanceof C1745d) && (str = ((C1745d) view.getLayoutParams()).f5256Y) != null && str.matches(this.f5001p)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String c = C1701a.m4620c(this.f4991f, this.f4986a);
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 16);
        sb.append("ViewTransition(");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo4787b(View view) {
        boolean z;
        int i = this.f5005t;
        if (i != -1 && view.getTag(i) == null) {
            z = false;
        } else {
            z = true;
        }
        int i2 = this.f5006u;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
