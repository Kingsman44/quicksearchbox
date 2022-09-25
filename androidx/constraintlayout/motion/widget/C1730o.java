package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C1761t;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.o */
/* compiled from: PG */
public final class C1730o extends C1718c {

    /* renamed from: f */
    public String f5090f = null;

    /* renamed from: g */
    public int f5091g = -1;

    /* renamed from: h */
    public String f5092h = null;

    /* renamed from: i */
    public String f5093i = null;

    /* renamed from: j */
    public int f5094j = -1;

    /* renamed from: k */
    public int f5095k = -1;

    /* renamed from: l */
    float f5096l = 0.1f;

    /* renamed from: m */
    public float f5097m = Float.NaN;

    /* renamed from: n */
    public boolean f5098n = false;

    /* renamed from: o */
    int f5099o = -1;

    /* renamed from: p */
    int f5100p = -1;

    /* renamed from: q */
    int f5101q = -1;

    /* renamed from: r */
    RectF f5102r = new RectF();

    /* renamed from: s */
    RectF f5103s = new RectF();

    /* renamed from: t */
    HashMap f5104t = new HashMap();

    /* renamed from: u */
    private int f5105u = -1;

    /* renamed from: v */
    private View f5106v = null;

    /* renamed from: w */
    private boolean f5107w = true;

    /* renamed from: x */
    private boolean f5108x = true;

    /* renamed from: y */
    private boolean f5109y = true;

    /* renamed from: z */
    private float f5110z;

    public C1730o() {
        this.f5016d = 5;
        this.f5017e = new HashMap();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4693h(java.lang.String r19, android.view.View r20) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            java.lang.String r3 = "\" not found on "
            java.lang.String r4 = " Custom Attribute \""
            java.lang.String r5 = "TransitionLayout"
            java.lang.String r6 = "."
            boolean r6 = r0.startsWith(r6)
            r8 = 0
            if (r6 == 0) goto L_0x01f8
            int r6 = r19.length()
            r9 = 1
            if (r6 != r9) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            if (r6 != 0) goto L_0x002b
            java.lang.String r0 = r0.substring(r9)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r10)
        L_0x002b:
            r10 = r0
            java.util.HashMap r0 = r1.f5017e
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x0036:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01f7
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r12 = r0.toLowerCase(r12)
            if (r6 != 0) goto L_0x0050
            boolean r12 = r12.matches(r10)
            if (r12 == 0) goto L_0x0036
        L_0x0050:
            java.util.HashMap r12 = r1.f5017e
            java.lang.Object r0 = r12.get(r0)
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.C1742a) r0
            if (r0 == 0) goto L_0x0036
            java.lang.Class r12 = r20.getClass()
            java.lang.String r13 = r0.f5217b
            boolean r14 = r0.f5216a
            if (r14 != 0) goto L_0x0077
            int r14 = r13.length()
            java.lang.String r15 = "set"
            if (r14 == 0) goto L_0x0071
            java.lang.String r14 = r15.concat(r13)
            goto L_0x0078
        L_0x0071:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r15)
            goto L_0x0078
        L_0x0077:
            r14 = r13
        L_0x0078:
            int r15 = r0.f5223h     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            int r16 = r15 + -1
            if (r15 == 0) goto L_0x012f
            switch(r16) {
                case 0: goto L_0x0116;
                case 1: goto L_0x00fd;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00b2;
                case 5: goto L_0x009a;
                case 6: goto L_0x0082;
                case 7: goto L_0x0116;
                default: goto L_0x0081;
            }     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
        L_0x0081:
            goto L_0x0036
        L_0x0082:
            java.lang.Class[] r15 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class r16 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r16     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r15 = r12.getMethod(r14, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            float r0 = r0.f5219d     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15.invoke(r2, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x009a:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class r15 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            boolean r0 = r0.f5221f     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x00b2:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class<java.lang.CharSequence> r15 = java.lang.CharSequence.class
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.String r0 = r0.f5220e     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x00c7:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class<android.graphics.drawable.Drawable> r15 = android.graphics.drawable.Drawable.class
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            android.graphics.drawable.ColorDrawable r15 = new android.graphics.drawable.ColorDrawable     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15.<init>()     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            int r0 = r0.f5222g     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15.setColor(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r0[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x00e4:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            int r0 = r0.f5222g     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x00fd:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class r15 = java.lang.Float.TYPE     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            float r0 = r0.f5219d     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x0116:
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7[r8] = r15     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.reflect.Method r7 = r12.getMethod(r14, r7)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            int r0 = r0.f5218c     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r15[r8] = r0     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            r7.invoke(r2, r15)     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
            goto L_0x0036
        L_0x012f:
            r7 = 0
            throw r7     // Catch:{ NoSuchMethodException -> 0x0193, IllegalAccessException -> 0x0162, InvocationTargetException -> 0x0131 }
        L_0x0131:
            r0 = move-exception
            java.lang.String r7 = r12.getName()
            java.lang.String r12 = java.lang.String.valueOf(r7)
            int r12 = r12.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r15 = r13.length()
            int r15 = r15 + 34
            int r15 = r15 + r12
            r14.<init>(r15)
            r14.append(r4)
            r14.append(r13)
            r14.append(r3)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            android.util.Log.e(r5, r7)
            r0.printStackTrace()
            goto L_0x0036
        L_0x0162:
            r0 = move-exception
            java.lang.String r7 = r12.getName()
            java.lang.String r12 = java.lang.String.valueOf(r7)
            int r12 = r12.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r15 = r13.length()
            int r15 = r15 + 34
            int r15 = r15 + r12
            r14.<init>(r15)
            r14.append(r4)
            r14.append(r13)
            r14.append(r3)
            r14.append(r7)
            java.lang.String r7 = r14.toString()
            android.util.Log.e(r5, r7)
            r0.printStackTrace()
            goto L_0x0036
        L_0x0193:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.e(r5, r0)
            java.lang.String r0 = r12.getName()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r17 = r13.length()
            int r17 = r17 + 34
            int r7 = r17 + r7
            r15.<init>(r7)
            r15.append(r4)
            r15.append(r13)
            r15.append(r3)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.e(r5, r0)
            java.lang.String r0 = r12.getName()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.String r12 = java.lang.String.valueOf(r14)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r7 = r7 + 20
            int r7 = r7 + r12
            r13.<init>(r7)
            r13.append(r0)
            java.lang.String r0 = " must have a method "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r0 = r13.toString()
            android.util.Log.e(r5, r0)
            goto L_0x0036
        L_0x01f7:
            return
        L_0x01f8:
            java.util.HashMap r3 = r1.f5104t
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L_0x020d
            java.util.HashMap r3 = r1.f5104t
            java.lang.Object r3 = r3.get(r0)
            r7 = r3
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L_0x020c
            goto L_0x020e
        L_0x020c:
            return
        L_0x020d:
            r7 = 0
        L_0x020e:
            java.lang.String r3 = "KeyTrigger"
            java.lang.String r4 = " "
            java.lang.String r5 = "\"on class "
            if (r7 != 0) goto L_0x0271
            java.lang.Class r6 = r20.getClass()     // Catch:{ NoSuchMethodException -> 0x0226 }
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ NoSuchMethodException -> 0x0226 }
            java.lang.reflect.Method r7 = r6.getMethod(r0, r7)     // Catch:{ NoSuchMethodException -> 0x0226 }
            java.util.HashMap r6 = r1.f5104t     // Catch:{ NoSuchMethodException -> 0x0226 }
            r6.put(r0, r7)     // Catch:{ NoSuchMethodException -> 0x0226 }
            goto L_0x0271
        L_0x0226:
            java.util.HashMap r6 = r1.f5104t
            r7 = 0
            r6.put(r0, r7)
            java.lang.Class r6 = r20.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C1701a.m4619b(r20)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r2)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r10 = r19.length()
            int r10 = r10 + 34
            int r10 = r10 + r7
            int r10 = r10 + r8
            r9.<init>(r10)
            java.lang.String r7 = "Could not find method \""
            r9.append(r7)
            r9.append(r0)
            r9.append(r5)
            r9.append(r6)
            r9.append(r4)
            r9.append(r2)
            java.lang.String r0 = r9.toString()
            android.util.Log.e(r3, r0)
            return
        L_0x0271:
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0277 }
            r7.invoke(r2, r0)     // Catch:{ Exception -> 0x0277 }
            return
        L_0x0277:
            java.lang.String r0 = r1.f5090f
            java.lang.Class r6 = r20.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r2 = androidx.constraintlayout.motion.widget.C1701a.m4619b(r20)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r2)
            int r9 = r9.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            int r7 = r7 + 30
            int r7 = r7 + r8
            int r7 = r7 + r9
            r10.<init>(r7)
            java.lang.String r7 = "Exception in call \""
            r10.append(r7)
            r10.append(r0)
            r10.append(r5)
            r10.append(r6)
            r10.append(r4)
            r10.append(r2)
            java.lang.String r0 = r10.toString()
            android.util.Log.e(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1730o.m4693h(java.lang.String, android.view.View):void");
    }

    /* renamed from: i */
    private static final void m4694i(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* renamed from: a */
    public final C1718c clone() {
        C1730o oVar = new C1730o();
        super.mo4797f(this);
        oVar.f5105u = this.f5105u;
        oVar.f5090f = this.f5090f;
        oVar.f5091g = this.f5091g;
        oVar.f5092h = this.f5092h;
        oVar.f5093i = this.f5093i;
        oVar.f5094j = this.f5094j;
        oVar.f5095k = this.f5095k;
        oVar.f5106v = this.f5106v;
        oVar.f5096l = this.f5096l;
        oVar.f5107w = this.f5107w;
        oVar.f5108x = this.f5108x;
        oVar.f5109y = this.f5109y;
        oVar.f5097m = this.f5097m;
        oVar.f5110z = this.f5110z;
        oVar.f5098n = this.f5098n;
        oVar.f5102r = this.f5102r;
        oVar.f5103s = this.f5103s;
        oVar.f5104t = this.f5104t;
        return oVar;
    }

    /* renamed from: b */
    public final void mo4792b(HashMap hashMap) {
    }

    /* renamed from: c */
    public final void mo4793c(HashSet hashSet) {
    }

    /* renamed from: d */
    public final void mo4795d(Context context, AttributeSet attributeSet) {
        C1729n.m4692a(this, context.obtainStyledAttributes(attributeSet, C1761t.f5467i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4800g(float r10, android.view.View r11) {
        /*
            r9 = this;
            int r0 = r9.f5095k
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == r3) goto L_0x0061
            android.view.View r0 = r9.f5106v
            if (r0 != 0) goto L_0x0019
            android.view.ViewParent r0 = r11.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r9.f5095k
            android.view.View r0 = r0.findViewById(r4)
            r9.f5106v = r0
        L_0x0019:
            android.graphics.RectF r0 = r9.f5102r
            android.view.View r4 = r9.f5106v
            boolean r5 = r9.f5098n
            m4694i(r0, r4, r5)
            android.graphics.RectF r0 = r9.f5103s
            boolean r4 = r9.f5098n
            m4694i(r0, r11, r4)
            android.graphics.RectF r0 = r9.f5102r
            android.graphics.RectF r4 = r9.f5103s
            boolean r0 = r0.intersect(r4)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r9.f5107w
            if (r0 == 0) goto L_0x003b
            r9.f5107w = r2
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            boolean r4 = r9.f5109y
            if (r4 == 0) goto L_0x0044
            r9.f5109y = r2
            r4 = 1
            goto L_0x0045
        L_0x0044:
            r4 = 0
        L_0x0045:
            r9.f5108x = r1
            r5 = r4
            r4 = 0
            goto L_0x00de
        L_0x004b:
            boolean r0 = r9.f5107w
            if (r0 != 0) goto L_0x0053
            r9.f5107w = r1
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            boolean r4 = r9.f5108x
            if (r4 == 0) goto L_0x005c
            r9.f5108x = r2
            r4 = 1
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            r9.f5109y = r1
            goto L_0x00dd
        L_0x0061:
            boolean r0 = r9.f5107w
            r4 = 0
            if (r0 == 0) goto L_0x0077
            float r0 = r9.f5097m
            float r5 = r10 - r0
            float r6 = r9.f5110z
            float r6 = r6 - r0
            float r5 = r5 * r6
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            r9.f5107w = r2
            r0 = 1
            goto L_0x0088
        L_0x0077:
            float r0 = r9.f5097m
            float r0 = r10 - r0
            float r0 = java.lang.Math.abs(r0)
            float r5 = r9.f5096l
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r9.f5107w = r1
        L_0x0087:
            r0 = 0
        L_0x0088:
            boolean r5 = r9.f5108x
            if (r5 == 0) goto L_0x00a1
            float r5 = r9.f5097m
            float r6 = r10 - r5
            float r7 = r9.f5110z
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b1
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00b1
            r9.f5108x = r2
            r5 = 1
            goto L_0x00b2
        L_0x00a1:
            float r5 = r9.f5097m
            float r5 = r10 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r9.f5096l
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b1
            r9.f5108x = r1
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            boolean r6 = r9.f5109y
            if (r6 == 0) goto L_0x00cc
            float r6 = r9.f5097m
            float r7 = r10 - r6
            float r8 = r9.f5110z
            float r8 = r8 - r6
            float r8 = r8 * r7
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00dc
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            r9.f5109y = r2
            r4 = r5
            r5 = 1
            goto L_0x00de
        L_0x00cc:
            float r4 = r9.f5097m
            float r4 = r10 - r4
            float r4 = java.lang.Math.abs(r4)
            float r6 = r9.f5096l
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dc
            r9.f5109y = r1
        L_0x00dc:
            r4 = r5
        L_0x00dd:
            r5 = 0
        L_0x00de:
            r9.f5110z = r10
            if (r4 != 0) goto L_0x00e6
            if (r0 != 0) goto L_0x00e6
            if (r5 == 0) goto L_0x0106
        L_0x00e6:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            androidx.constraintlayout.motion.widget.aa r6 = r10.f4867q
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.f4818A
            if (r10 == 0) goto L_0x0106
            java.util.Iterator r10 = r10.iterator()
        L_0x00f6:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r6 = r10.next()
            androidx.constraintlayout.motion.widget.aa r6 = (androidx.constraintlayout.motion.widget.C1702aa) r6
            r6.mo4749g()
            goto L_0x00f6
        L_0x0106:
            int r10 = r9.f5091g
            if (r10 != r3) goto L_0x010c
            r10 = r11
            goto L_0x0118
        L_0x010c:
            android.view.ViewParent r10 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
            int r6 = r9.f5091g
            android.view.View r10 = r10.findViewById(r6)
        L_0x0118:
            if (r4 == 0) goto L_0x0134
            java.lang.String r4 = r9.f5092h
            if (r4 == 0) goto L_0x0121
            r9.m4693h(r4, r10)
        L_0x0121:
            int r4 = r9.f5099o
            if (r4 == r3) goto L_0x0134
            android.view.ViewParent r4 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r6 = r9.f5099o
            android.view.View[] r7 = new android.view.View[r1]
            r7[r2] = r10
            r4.mo4712A(r6, r7)
        L_0x0134:
            if (r5 == 0) goto L_0x0150
            java.lang.String r4 = r9.f5093i
            if (r4 == 0) goto L_0x013d
            r9.m4693h(r4, r10)
        L_0x013d:
            int r4 = r9.f5100p
            if (r4 == r3) goto L_0x0150
            android.view.ViewParent r4 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r9.f5100p
            android.view.View[] r6 = new android.view.View[r1]
            r6[r2] = r10
            r4.mo4712A(r5, r6)
        L_0x0150:
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = r9.f5090f
            if (r0 == 0) goto L_0x0159
            r9.m4693h(r0, r10)
        L_0x0159:
            int r0 = r9.f5101q
            if (r0 == r3) goto L_0x016c
            android.view.ViewParent r11 = r11.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = (androidx.constraintlayout.motion.widget.MotionLayout) r11
            int r0 = r9.f5101q
            android.view.View[] r1 = new android.view.View[r1]
            r1[r2] = r10
            r11.mo4712A(r0, r1)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C1730o.mo4800g(float, android.view.View):void");
    }
}
