package com.google.android.libraries.elements.p1714d;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6118b;
import com.google.android.libraries.elements.C21366j;
import com.google.android.libraries.elements.interfaces.C21237ag;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.common.p4575r.C60757n;
import com.google.p370af.C7490c;
import com.google.protos.youtube.elements.C66260r;
import com.youtube.p5283a.p5284a.C68073bi;
import com.youtube.p5283a.p5284a.C68074bj;
import com.youtube.p5283a.p5284a.C68085g;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.libraries.elements.d.eg */
/* compiled from: PG */
final class C21071eg {

    /* renamed from: a */
    public static final /* synthetic */ int f59060a = 0;

    /* renamed from: b */
    private static final Map f59061b = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private static final Map f59062c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: a */
    static Typeface m39584a(Context context, C68073bi biVar, C21296cl clVar, C21259bb bbVar, C21319z zVar) {
        FutureTask futureTask;
        C68073bi biVar2 = biVar;
        String u = biVar.mo60192u();
        if (u == null) {
            return null;
        }
        int i = 400;
        if (C7490c.m22726p(biVar, 20) || C7490c.m22726p(biVar, 22)) {
            if (!C7490c.m22726p(biVar, 20)) {
                switch (biVar.mo60185n()) {
                    case 1:
                        i = 100;
                        break;
                    case 2:
                        i = 200;
                        break;
                    case 3:
                        i = 300;
                        break;
                    case 5:
                        i = 500;
                        break;
                    case 6:
                        i = 600;
                        break;
                    case 7:
                        i = 700;
                        break;
                    case 8:
                        i = 800;
                        break;
                    case 9:
                        i = 900;
                        break;
                }
            } else {
                i = (int) biVar.mo60190s();
            }
        }
        Context context2 = context;
        int k = m39594k(context, i);
        C20843c cVar = new C20843c(u, k, biVar.mo60194w());
        Map map = f59062c;
        synchronized (map) {
            futureTask = (FutureTask) map.get(cVar);
            if (futureTask == null) {
                FutureTask futureTask2 = new FutureTask(new C21066eb(clVar, context, u, k, biVar));
                map.put(cVar, futureTask2);
                futureTask = futureTask2;
            }
        }
        futureTask.run();
        try {
            return (Typeface) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            C66260r rVar = C66260r.LOG_TYPE_INTERNAL_ERROR;
            boolean w = biVar.mo60194w();
            bbVar.mo25782a(rVar, " Font fetching future task failed" + u + "with weight= " + k + "italic= " + w, zVar, e);
            return null;
        }
    }

    /* renamed from: b */
    public static Typeface m39585b(Context context, Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.defaultFromStyle(0);
        }
        if (Build.VERSION.SDK_INT < 31) {
            return typeface;
        }
        int weight = typeface.getWeight();
        if (weight == 0) {
            weight = true != typeface.isBold() ? 400 : 700;
        }
        int k = m39594k(context, weight);
        if (k == weight) {
            return typeface;
        }
        return Typeface.create(typeface, k, typeface.isItalic());
    }

    /* renamed from: c */
    static TextUtils.TruncateAt m39586c(int i) {
        return i != 2 ? i != 4 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    /* renamed from: d */
    static TextUtils.TruncateAt m39587d(int i) {
        return i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x024c, code lost:
        if (r0.mo60220o() > 0) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x024e, code lost:
        r7.f19295a.f19324Q = new com.google.android.libraries.elements.p1714d.C20906db();
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.facebook.litho.C6407q m39588e(com.facebook.litho.C6411u r16, @com.facebook.litho.p323b.C6118b com.youtube.p5283a.p5284a.C68074bj r17, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21313t r18, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21296cl r19, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21259bb r20, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21319z r21, @com.facebook.litho.p323b.C6118b java.util.Map r22, @com.facebook.litho.p323b.C6118b com.google.android.libraries.elements.interfaces.C21237ag r23, @com.facebook.litho.p323b.C6118b boolean r24, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r25, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r26, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.DIMEN_OFFSET) float r27, @com.facebook.litho.p323b.C6118b(mo12872a = com.facebook.litho.p323b.C6119c.COLOR) java.lang.Integer r28, @com.facebook.litho.p323b.C6118b boolean r29, @com.facebook.litho.p323b.C6118b boolean r30, @com.facebook.litho.p323b.C6118b boolean r31, @com.facebook.litho.p323b.C6118b java.lang.Boolean r32, java.util.concurrent.atomic.AtomicReference r33, java.util.concurrent.atomic.AtomicReference r34, java.util.concurrent.atomic.AtomicReference r35, java.util.concurrent.atomic.AtomicReference r36) {
        /*
            r0 = r16
            r13 = r20
            r14 = r21
            java.lang.Object r1 = r33.get()
            com.google.af.e r1 = (com.google.p370af.C7492e) r1
            com.youtube.a.a.g r2 = r17.mo60197i()
            boolean r1 = com.google.android.libraries.elements.internal.C21359t.m40387m(r1, r2)
            if (r1 != 0) goto L_0x0047
            com.youtube.a.a.g r1 = r17.mo60197i()
            r2 = r33
            r2.set(r1)
            com.youtube.a.a.g r1 = r17.mo60197i()
            com.youtube.a.a.g r3 = com.google.android.libraries.elements.internal.C21359t.m40382h(r1, r14, r13)
            android.content.Context r2 = r0.f19009b
            r1 = r21
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r29
            r11 = r30
            r12 = r31
            java.lang.CharSequence r1 = m39590g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r35
            r2.set(r1)
            goto L_0x004f
        L_0x0047:
            r2 = r35
            java.lang.Object r1 = r35.get()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x004f:
            r15 = r1
            java.lang.Object r1 = r34.get()
            com.google.af.e r1 = (com.google.p370af.C7492e) r1
            com.youtube.a.a.g r2 = r17.mo60198j()
            boolean r1 = com.google.android.libraries.elements.internal.C21359t.m40387m(r1, r2)
            if (r1 != 0) goto L_0x0091
            com.youtube.a.a.g r1 = r17.mo60198j()
            r2 = r34
            r2.set(r1)
            com.youtube.a.a.g r1 = r17.mo60198j()
            com.youtube.a.a.g r3 = com.google.android.libraries.elements.internal.C21359t.m40382h(r1, r14, r13)
            android.content.Context r2 = r0.f19009b
            r1 = r21
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r29
            r11 = r30
            r12 = r31
            java.lang.CharSequence r1 = m39590g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r36
            r2.set(r1)
            goto L_0x0099
        L_0x0091:
            r2 = r36
            java.lang.Object r1 = r36.get()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
        L_0x0099:
            com.youtube.a.a.g r2 = r17.mo60197i()
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x00ae
            com.youtube.a.a.g r2 = r17.mo60197i()
            int r2 = r2.mo60221p()
            if (r2 != r3) goto L_0x00ae
            r2 = 1
            goto L_0x00af
        L_0x00ae:
            r2 = 0
        L_0x00af:
            android.content.Context r6 = r0.f19009b
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r7 = "com.google.android.apps.youtube.music"
            boolean r6 = r6.equals(r7)
            com.facebook.litho.widget.dm r7 = new com.facebook.litho.widget.dm
            r7.<init>()
            com.facebook.litho.widget.do r8 = new com.facebook.litho.widget.do
            r8.<init>()
            r7.mo13589d(r0, r8)
            com.facebook.litho.widget.do r8 = r7.f19295a
            r8.f19316I = r15
            java.util.BitSet r8 = r7.f19296d
            r8.set(r5)
            com.facebook.litho.widget.do r8 = r7.f19295a
            r8.f19330f = r2
            com.facebook.litho.fk r2 = r7.f18979b
            r9 = r25
            int r2 = r2.mo13257a(r9)
            float r2 = (float) r2
            r8.f19314G = r2
            com.facebook.litho.widget.do r2 = r7.f19295a
            com.facebook.litho.fk r8 = r7.f18979b
            r9 = r26
            int r8 = r8.mo13257a(r9)
            float r8 = (float) r8
            r2.f19312E = r8
            com.facebook.litho.widget.do r2 = r7.f19295a
            com.facebook.litho.fk r8 = r7.f18979b
            r9 = r27
            int r8 = r8.mo13257a(r9)
            float r8 = (float) r8
            r2.f19313F = r8
            if (r28 != 0) goto L_0x00fe
            r2 = 0
            goto L_0x0102
        L_0x00fe:
            int r2 = r28.intValue()
        L_0x0102:
            com.facebook.litho.widget.do r8 = r7.f19295a
            r8.f19311D = r2
            if (r4 == r6) goto L_0x010c
            r2 = 16842907(0x101009b, float:2.3693992E-38)
            goto L_0x010f
        L_0x010c:
            r2 = 16842800(0x1010030, float:2.3693693E-38)
        L_0x010f:
            com.facebook.litho.fk r6 = r7.f18979b
            android.content.res.Resources$Theme r6 = r6.f18510a
            int[] r9 = new int[r4]
            r9[r5] = r2
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r9)
            int r6 = r2.getColor(r5, r5)     // Catch:{ all -> 0x027e }
            r2.recycle()
            r8.f19309B = r6
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.content.Context r6 = r0.f19009b
            int r6 = m39595l(r6)
            if (r6 <= 0) goto L_0x013d
            r2 = 300(0x12c, float:4.2E-43)
            if (r6 != r2) goto L_0x0135
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            goto L_0x013d
        L_0x0135:
            android.content.Context r2 = r0.f19009b
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r2 = m39585b(r2, r6)
        L_0x013d:
            com.facebook.litho.widget.do r6 = r7.f19295a
            r6.f19321N = r2
            android.content.Context r0 = r0.f19009b
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            r2 = 1096810496(0x41600000, float:14.0)
            float r0 = r0 * r2
            int r0 = com.facebook.litho.C6159cg.m16231a(r0)
            boolean r2 = r15 instanceof android.text.Spannable
            if (r2 == 0) goto L_0x0179
            r2 = r15
            android.text.Spannable r2 = (android.text.Spannable) r2
            int r6 = r15.length()
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r8 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r2 = r2.getSpans(r5, r6, r8)
            android.text.style.AbsoluteSizeSpan[] r2 = (android.text.style.AbsoluteSizeSpan[]) r2
            int r6 = r2.length
            r8 = 0
        L_0x016a:
            if (r8 >= r6) goto L_0x0179
            r9 = r2[r8]
            int r9 = r9.getSize()
            int r0 = java.lang.Math.min(r9, r0)
            int r8 = r8 + 1
            goto L_0x016a
        L_0x0179:
            com.facebook.litho.widget.do r2 = r7.f19295a
            r2.f19318K = r0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            com.facebook.litho.widget.do r2 = r7.f19295a
            r2.f19326b = r0
            long r8 = r17.mo60196h()
            r10 = 0
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0198
            long r8 = r17.mo60196h()
            com.facebook.litho.widget.do r0 = r7.f19295a
            int r2 = (int) r8
            r0.f19310C = r2
        L_0x0198:
            com.youtube.a.a.g r0 = r17.mo60197i()
            if (r0 == 0) goto L_0x021d
            com.youtube.a.a.g r0 = r17.mo60197i()
            int r2 = r0.mo60217h()
            if (r2 == r4) goto L_0x01be
            r6 = 2
            if (r2 == r6) goto L_0x01b8
            if (r2 == r3) goto L_0x01b3
            com.facebook.litho.widget.do r2 = r7.f19295a
            r3 = 4
            r2.f19322O = r3
            goto L_0x01c3
        L_0x01b3:
            com.facebook.litho.widget.do r2 = r7.f19295a
            r2.f19322O = r3
            goto L_0x01c3
        L_0x01b8:
            com.facebook.litho.widget.do r2 = r7.f19295a
            r3 = 7
            r2.f19322O = r3
            goto L_0x01c3
        L_0x01be:
            com.facebook.litho.widget.do r2 = r7.f19295a
            r3 = 6
            r2.f19322O = r3
        L_0x01c3:
            float r2 = r0.mo60216g()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x01db
            float r2 = r0.mo60216g()
            com.facebook.litho.widget.do r3 = r7.f19295a
            com.facebook.litho.fk r6 = r7.f18979b
            int r2 = r6.mo13258b(r2)
            float r2 = (float) r2
            r3.f19331g = r2
        L_0x01db:
            boolean r2 = r0.mo60231z()
            com.facebook.litho.widget.do r3 = r7.f19295a
            r3.f19315H = r2
            int r2 = r0.mo60221p()
            if (r2 == r4) goto L_0x01f5
            int r2 = r0.mo60221p()
            android.text.TextUtils$TruncateAt r2 = m39586c(r2)
            com.facebook.litho.widget.do r3 = r7.f19295a
            r3.f19329e = r2
        L_0x01f5:
            int r2 = r0.mo60221p()
            if (r2 != 0) goto L_0x0213
            int r2 = r0.mo60223r()
            r3 = 5
            if (r2 == r3) goto L_0x020f
            int r2 = r0.mo60223r()
            android.text.TextUtils$TruncateAt r2 = m39587d(r2)
            com.facebook.litho.widget.do r3 = r7.f19295a
            r3.f19329e = r2
            goto L_0x0213
        L_0x020f:
            com.facebook.litho.widget.do r2 = r7.f19295a
            r2.f19320M = r4
        L_0x0213:
            int r0 = r0.mo60219j()
            if (r0 == 0) goto L_0x021d
            com.facebook.litho.widget.do r0 = r7.f19295a
            r0.f19325a = r4
        L_0x021d:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0227
            com.facebook.litho.widget.do r0 = r7.f19295a
            r0.f19328d = r1
        L_0x0227:
            com.youtube.a.a.g r0 = r17.mo60197i()
            if (r0 != 0) goto L_0x022e
            goto L_0x0257
        L_0x022e:
            com.youtube.a.a.bi r1 = new com.youtube.a.a.bi
            r1.<init>()
        L_0x0233:
            int r2 = r0.mo60222q()
            if (r5 >= r2) goto L_0x0248
            r0.mo60229x(r1, r5)
            long r2 = r1.mo60186o()
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0245
            goto L_0x024e
        L_0x0245:
            int r5 = r5 + 1
            goto L_0x0233
        L_0x0248:
            int r0 = r0.mo60220o()
            if (r0 <= 0) goto L_0x0257
        L_0x024e:
            com.google.android.libraries.elements.d.db r0 = new com.google.android.libraries.elements.d.db
            r0.<init>()
            com.facebook.litho.widget.do r1 = r7.f19295a
            r1.f19324Q = r0
        L_0x0257:
            if (r32 == 0) goto L_0x0261
            boolean r0 = r32.booleanValue()
            com.facebook.litho.widget.do r1 = r7.f19295a
            r1.f19327c = r0
        L_0x0261:
            long r0 = r17.mo60195g()
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0273
            long r0 = r17.mo60195g()
            com.facebook.litho.widget.do r2 = r7.f19295a
            int r1 = (int) r0
            r2.f19308A = r1
            goto L_0x0279
        L_0x0273:
            com.facebook.litho.widget.do r0 = r7.f19295a
            r1 = 436207616(0x1a000000, float:2.646978E-23)
            r0.f19308A = r1
        L_0x0279:
            com.facebook.litho.widget.do r0 = r7.mo13259a()
            return r0
        L_0x027e:
            r0 = move-exception
            r1 = r0
            r2.recycle()
            goto L_0x0285
        L_0x0284:
            throw r1
        L_0x0285:
            goto L_0x0284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C21071eg.m39588e(com.facebook.litho.u, com.youtube.a.a.bj, com.google.android.libraries.elements.interfaces.t, com.google.android.libraries.elements.interfaces.cl, com.google.android.libraries.elements.interfaces.bb, com.google.android.libraries.elements.interfaces.z, java.util.Map, com.google.android.libraries.elements.interfaces.ag, boolean, float, float, float, java.lang.Integer, boolean, boolean, boolean, java.lang.Boolean, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference, java.util.concurrent.atomic.AtomicReference):com.facebook.litho.q");
    }

    /* renamed from: f */
    static CharSequence m39589f(C21319z zVar, Context context, C68085g gVar, C21313t tVar, C21296cl clVar, C21259bb bbVar, Map map, boolean z) {
        return m39590g(zVar, context, gVar, tVar, clVar, bbVar, map, C21237ag.f59568a, z, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0598, code lost:
        if (r1 < 0) goto L_0x059a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0551  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0583  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05b0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x02e7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020d  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.CharSequence m39590g(com.google.android.libraries.elements.interfaces.C21319z r28, android.content.Context r29, com.youtube.p5283a.p5284a.C68085g r30, com.google.android.libraries.elements.interfaces.C21313t r31, com.google.android.libraries.elements.interfaces.C21296cl r32, com.google.android.libraries.elements.interfaces.C21259bb r33, java.util.Map r34, com.google.android.libraries.elements.interfaces.C21237ag r35, boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            r7 = r28
            r15 = r29
            r14 = r30
            r8 = r32
            r13 = r33
            if (r14 != 0) goto L_0x000f
            java.lang.String r0 = ""
            return r0
        L_0x000f:
            com.google.android.libraries.elements.internal.t r0 = new com.google.android.libraries.elements.internal.t
            r0.<init>(r13)
            java.lang.String r12 = r30.mo60230y()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = ""
            return r0
        L_0x0021:
            if (r36 == 0) goto L_0x0034
            boolean r1 = com.google.android.libraries.elements.C21366j.f59736a
            if (r1 == 0) goto L_0x0034
            androidx.emoji.a.j r1 = androidx.emoji.p108a.C2200j.m6088b()
            int r2 = r12.length()
            java.lang.CharSequence r1 = r1.mo5515e(r12, r2)
            goto L_0x0035
        L_0x0034:
            r1 = r12
        L_0x0035:
            int r2 = r30.mo60222q()
            if (r2 != 0) goto L_0x0055
            int r2 = r30.mo60219j()
            if (r2 != 0) goto L_0x0055
            int r2 = r30.mo60218i()
            if (r2 != 0) goto L_0x0055
            int r2 = r30.mo60220o()
            if (r2 != 0) goto L_0x0055
            com.youtube.a.a.ai r2 = r30.mo60227v()
            if (r2 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            return r1
        L_0x0055:
            android.text.SpannableString r11 = android.text.SpannableString.valueOf(r12)
            r9 = 0
        L_0x005a:
            int r1 = r30.mo60219j()
            if (r9 >= r1) goto L_0x0095
            com.youtube.a.a.s r16 = r14.mo60225t(r9)
            if (r16 != 0) goto L_0x0067
            goto L_0x0092
        L_0x0067:
            com.youtube.a.a.ag r1 = r16.mo60249k()
            if (r1 != 0) goto L_0x0073
            com.youtube.a.a.ag r1 = r16.mo60248j()
            if (r1 == 0) goto L_0x0092
        L_0x0073:
            com.google.android.libraries.elements.d.ed r6 = new com.google.android.libraries.elements.d.ed
            com.google.android.libraries.elements.interfaces.az r5 = r28.mo26806h()
            r1 = r6
            r2 = r16
            r3 = r31
            r4 = r0
            r10 = r6
            r6 = r28
            r1.<init>(r2, r3, r4, r5, r6)
            long r1 = r16.mo60247i()
            int r2 = (int) r1
            long r3 = r16.mo60246h()
            int r1 = (int) r3
            m39592i(r11, r10, r2, r1)
        L_0x0092:
            int r9 = r9 + 1
            goto L_0x005a
        L_0x0095:
            r1 = 0
        L_0x0096:
            int r0 = r30.mo60222q()
            r4 = 6
            r5 = 0
            r10 = 0
            if (r1 >= r0) goto L_0x02f1
            com.youtube.a.a.bi r9 = r14.mo60228w(r1)
            if (r9 != 0) goto L_0x00ab
            r3 = r7
            r6 = r8
            r8 = r34
            goto L_0x02e7
        L_0x00ab:
            long r16 = r9.mo60187p()
            r18 = 0
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00cc
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            long r2 = r9.mo60187p()
            int r3 = (int) r2
            r0.<init>(r3)
            long r2 = r9.mo60189r()
            int r3 = (int) r2
            long r6 = r9.mo60188q()
            int r7 = (int) r6
            m39592i(r11, r0, r3, r7)
        L_0x00cc:
            float r0 = r9.mo60180h()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00fb
            float r0 = r9.mo60180h()
            android.content.res.Resources r3 = r29.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.scaledDensity
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            float r0 = r0 * r3
            int r0 = java.lang.Math.round(r0)
            r3 = 0
            r6.<init>(r0, r3)
            long r2 = r9.mo60189r()
            int r0 = (int) r2
            long r2 = r9.mo60188q()
            int r3 = (int) r2
            m39592i(r11, r6, r0, r3)
        L_0x00fb:
            long r2 = r9.mo60186o()
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
            com.google.android.libraries.elements.d.dn r0 = new com.google.android.libraries.elements.d.dn
            long r2 = r9.mo60186o()
            int r3 = (int) r2
            float r2 = r9.mo60179g()
            r0.<init>(r3, r2, r10, r13)
            long r2 = r9.mo60189r()
            int r3 = (int) r2
            long r5 = r9.mo60188q()
            int r2 = (int) r5
            m39592i(r11, r0, r3, r2)
        L_0x011e:
            java.lang.String r0 = r9.mo60192u()
            java.lang.String r2 = r9.mo60193v()
            if (r0 == 0) goto L_0x0141
            r3 = r28
            android.graphics.Typeface r2 = m39584a(r15, r9, r8, r13, r3)
            com.google.android.libraries.elements.internal.Spans$CustomTypefaceSpan r5 = new com.google.android.libraries.elements.internal.Spans$CustomTypefaceSpan
            r5.<init>(r0, r2)
            long r7 = r9.mo60189r()
            int r0 = (int) r7
            long r7 = r9.mo60188q()
            int r2 = (int) r7
            m39592i(r11, r5, r0, r2)
            goto L_0x019b
        L_0x0141:
            r3 = r28
            if (r2 == 0) goto L_0x019b
            int r0 = m39595l(r29)
            com.google.android.libraries.elements.d.d r5 = new com.google.android.libraries.elements.d.d
            r5.<init>(r2, r0)
            java.util.Map r7 = f59061b
            monitor-enter(r7)
            java.lang.Object r0 = r7.get(r5)     // Catch:{ all -> 0x0198 }
            java.util.concurrent.FutureTask r0 = (java.util.concurrent.FutureTask) r0     // Catch:{ all -> 0x0198 }
            if (r0 != 0) goto L_0x0169
            java.util.concurrent.FutureTask r0 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0198 }
            com.google.android.libraries.elements.d.ec r8 = new com.google.android.libraries.elements.d.ec     // Catch:{ all -> 0x0198 }
            r6 = r32
            r8.<init>(r6, r15, r2)     // Catch:{ all -> 0x0198 }
            r0.<init>(r8)     // Catch:{ all -> 0x0198 }
            r7.put(r5, r0)     // Catch:{ all -> 0x0198 }
            goto L_0x016b
        L_0x0169:
            r6 = r32
        L_0x016b:
            monitor-exit(r7)     // Catch:{ all -> 0x0198 }
            r0.run()
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x0178, ExecutionException -> 0x0176 }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ InterruptedException -> 0x0178, ExecutionException -> 0x0176 }
            goto L_0x0185
        L_0x0176:
            r0 = move-exception
            goto L_0x0179
        L_0x0178:
            r0 = move-exception
        L_0x0179:
            com.google.protos.youtube.elements.r r5 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INTERNAL_ERROR
            java.lang.String r7 = " Font fetching future task failed"
            java.lang.String r7 = r7.concat(r2)
            r13.mo25782a(r5, r7, r3, r0)
            r0 = r10
        L_0x0185:
            com.google.android.libraries.elements.internal.Spans$CustomTypefaceSpan r5 = new com.google.android.libraries.elements.internal.Spans$CustomTypefaceSpan
            r5.<init>(r2, r0)
            long r7 = r9.mo60189r()
            int r0 = (int) r7
            long r7 = r9.mo60188q()
            int r2 = (int) r7
            m39592i(r11, r5, r0, r2)
            goto L_0x019d
        L_0x0198:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            r6 = r32
        L_0x019d:
            int r0 = r9.mo60184m()
            r2 = 2
            if (r0 == r2) goto L_0x01a8
            r2 = 3
            if (r0 == r2) goto L_0x01a8
            goto L_0x01ba
        L_0x01a8:
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            long r7 = r9.mo60189r()
            int r2 = (int) r7
            long r7 = r9.mo60188q()
            int r5 = (int) r7
            m39592i(r11, r0, r2, r5)
        L_0x01ba:
            int r0 = r9.mo60183l()
            r2 = 2
            if (r0 == r2) goto L_0x01c5
            r2 = 3
            if (r0 == r2) goto L_0x01c5
            goto L_0x01d7
        L_0x01c5:
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            long r7 = r9.mo60189r()
            int r2 = (int) r7
            long r7 = r9.mo60188q()
            int r5 = (int) r7
            m39592i(r11, r0, r2, r5)
        L_0x01d7:
            int r0 = r9.mo60182j()
            r2 = 1
            if (r0 == r2) goto L_0x01f5
            r2 = 2
            if (r0 == r2) goto L_0x01e2
            goto L_0x0207
        L_0x01e2:
            android.text.style.SuperscriptSpan r0 = new android.text.style.SuperscriptSpan
            r0.<init>()
            long r7 = r9.mo60189r()
            int r2 = (int) r7
            long r7 = r9.mo60188q()
            int r5 = (int) r7
            m39592i(r11, r0, r2, r5)
            goto L_0x0207
        L_0x01f5:
            android.text.style.SubscriptSpan r0 = new android.text.style.SubscriptSpan
            r0.<init>()
            long r7 = r9.mo60189r()
            int r2 = (int) r7
            long r7 = r9.mo60188q()
            int r5 = (int) r7
            m39592i(r11, r0, r2, r5)
        L_0x0207:
            com.youtube.a.a.ah r0 = r9.mo60191t()
            if (r0 == 0) goto L_0x02c6
            com.youtube.a.a.ah r2 = r9.mo60191t()
            r5 = 0
        L_0x0212:
            int r0 = r2.mo60108g()
            if (r5 >= r0) goto L_0x02c6
            com.youtube.a.a.ag r7 = r2.mo60109h(r5)
            if (r7 != 0) goto L_0x0224
            r8 = r34
            r31 = r2
            goto L_0x02ba
        L_0x0224:
            int r0 = r7.mo60107j()
            r8 = 2
            if (r0 != r8) goto L_0x029e
            int r0 = r7.mo60106i()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r34
            java.lang.Object r0 = r8.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x0283
            java.lang.Object r10 = r0.first     // Catch:{ ct -> 0x0268 }
            com.google.android.libraries.elements.interfaces.ca r10 = (com.google.android.libraries.elements.interfaces.C21285ca) r10     // Catch:{ ct -> 0x0268 }
            r31 = r2
            java.nio.ByteBuffer r2 = r7.mo16918f(r4)     // Catch:{ ct -> 0x0266 }
            java.lang.Object r0 = r0.second     // Catch:{ ct -> 0x0266 }
            com.google.protobuf.eb r0 = (com.google.protobuf.C63010eb) r0     // Catch:{ ct -> 0x0266 }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0266 }
            com.google.android.libraries.elements.internal.C21322ab.m40329a(r2, r0, r4)     // Catch:{ ct -> 0x0266 }
            java.lang.Object r0 = r10.mo26794b()     // Catch:{ ct -> 0x0266 }
            if (r0 == 0) goto L_0x02ba
            long r14 = r9.mo60189r()     // Catch:{ ct -> 0x0266 }
            int r2 = (int) r14     // Catch:{ ct -> 0x0266 }
            long r14 = r9.mo60188q()     // Catch:{ ct -> 0x0266 }
            int r4 = (int) r14     // Catch:{ ct -> 0x0266 }
            m39592i(r11, r0, r2, r4)     // Catch:{ ct -> 0x0266 }
            goto L_0x02ba
        L_0x0266:
            r0 = move-exception
            goto L_0x026b
        L_0x0268:
            r0 = move-exception
            r31 = r2
        L_0x026b:
            com.google.protos.youtube.elements.r r2 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR
            int r4 = r7.mo60106i()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "Failed to set PB Style Run Extension in TextComponentSpec. Extension id: "
            r7.<init>(r10)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r13.mo25782a(r2, r4, r3, r0)
            goto L_0x02ba
        L_0x0283:
            r31 = r2
            com.google.protos.youtube.elements.r r0 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_UNKNOWN_EXTENSION
            int r2 = r7.mo60106i()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "TextComponentSpec: No converter for extension: "
            r4.<init>(r7)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r4 = 0
            r13.mo25782a(r0, r2, r3, r4)
            goto L_0x02ba
        L_0x029e:
            r8 = r34
            r31 = r2
            r4 = r10
            com.google.protos.youtube.elements.r r0 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_WIRE_FORMAT_ERROR
            int r2 = r7.mo60106i()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "TextComponentSpec: extension with unsupported format: "
            r7.<init>(r10)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r13.mo25782a(r0, r2, r3, r4)
        L_0x02ba:
            int r5 = r5 + 1
            r15 = r29
            r14 = r30
            r2 = r31
            r4 = 6
            r10 = 0
            goto L_0x0212
        L_0x02c6:
            r8 = r34
            float r0 = r9.mo60181i()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x02e7
            com.google.android.libraries.elements.internal.ap r0 = new com.google.android.libraries.elements.internal.ap
            float r2 = r9.mo60181i()
            r0.<init>(r2)
            long r4 = r9.mo60189r()
            int r2 = (int) r4
            long r4 = r9.mo60188q()
            int r5 = (int) r4
            m39592i(r11, r0, r2, r5)
        L_0x02e7:
            int r1 = r1 + 1
            r15 = r29
            r14 = r30
            r7 = r3
            r8 = r6
            goto L_0x0096
        L_0x02f1:
            r3 = r7
            r0 = 0
        L_0x02f3:
            int r1 = r30.mo60220o()
            if (r0 >= r1) goto L_0x044b
            r1 = r30
            com.youtube.a.a.v r4 = r1.mo60226u(r0)
            android.content.res.Resources r5 = r29.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r4 == 0) goto L_0x0446
            com.youtube.a.a.ag r6 = r4.mo60255h()
            if (r6 == 0) goto L_0x036e
            com.youtube.a.a.ag r6 = r4.mo60255h()
            int r6 = r6.mo60106i()
            r7 = 389740320(0x173af720, float:6.0411757E-25)
            if (r6 != r7) goto L_0x036e
            com.youtube.a.a.ag r6 = r4.mo60255h()
            r7 = 6
            java.nio.ByteBuffer r6 = r6.mo16918f(r7)
            com.youtube.a.a.ak r6 = com.youtube.p5283a.p5284a.C68048ak.m98276o(r6)
            android.graphics.RectF r7 = new android.graphics.RectF
            float r8 = r6.mo60115i()
            r2 = 1
            float r8 = android.util.TypedValue.applyDimension(r2, r8, r5)
            float r9 = r6.mo60117k()
            float r9 = android.util.TypedValue.applyDimension(r2, r9, r5)
            float r10 = r6.mo60116j()
            float r10 = android.util.TypedValue.applyDimension(r2, r10, r5)
            float r14 = r6.mo60114h()
            float r14 = android.util.TypedValue.applyDimension(r2, r14, r5)
            r7.<init>(r8, r9, r10, r14)
            com.google.android.libraries.elements.d.dn r8 = new com.google.android.libraries.elements.d.dn
            long r9 = r6.mo60118l()
            int r10 = (int) r9
            float r9 = r6.mo60113g()
            float r9 = android.util.TypedValue.applyDimension(r2, r9, r5)
            r8.<init>(r10, r9, r7, r13)
            long r9 = r6.mo60120n()
            int r7 = (int) r9
            long r9 = r6.mo60119m()
            int r6 = (int) r9
            m39592i(r11, r8, r7, r6)
        L_0x036e:
            r6 = 4
            if (r37 == 0) goto L_0x03e1
            com.youtube.a.a.ag r7 = r4.mo60255h()
            if (r7 == 0) goto L_0x03e1
            com.youtube.a.a.ag r7 = r4.mo60255h()
            int r7 = r7.mo60106i()
            r8 = 381326004(0x16ba92b4, float:3.0142503E-25)
            if (r7 != r8) goto L_0x03e1
            com.youtube.a.a.ag r7 = r4.mo60255h()
            r8 = 6
            java.nio.ByteBuffer r7 = r7.mo16918f(r8)
            com.youtube.a.a.al r8 = new com.youtube.a.a.al
            r8.<init>()
            java.nio.ByteOrder r9 = java.nio.ByteOrder.LITTLE_ENDIAN
            r7.order(r9)
            int r9 = r7.position()
            int r9 = r7.getInt(r9)
            int r10 = r7.position()
            int r9 = r9 + r10
            r8.mo16917e(r9, r7)
            boolean r7 = com.google.android.libraries.elements.internal.C21327ag.m40334a(r29)
            com.google.android.libraries.elements.d.do r9 = new com.google.android.libraries.elements.d.do
            int r10 = r8.mo16913a(r6)
            if (r10 == 0) goto L_0x03be
            java.nio.ByteBuffer r14 = r8.f24704b
            int r15 = r8.f24703a
            int r10 = r10 + r15
            float r10 = r14.getFloat(r10)
            r2 = 1
            goto L_0x03c0
        L_0x03be:
            r2 = 1
            r10 = 0
        L_0x03c0:
            float r10 = android.util.TypedValue.applyDimension(r2, r10, r5)
            r14 = 6
            int r15 = r8.mo16913a(r14)
            if (r15 == 0) goto L_0x03d5
            java.nio.ByteBuffer r14 = r8.f24704b
            int r8 = r8.f24703a
            int r15 = r15 + r8
            float r8 = r14.getFloat(r15)
            goto L_0x03d6
        L_0x03d5:
            r8 = 0
        L_0x03d6:
            float r5 = android.util.TypedValue.applyDimension(r2, r8, r5)
            r9.<init>(r7, r10, r5)
            r5 = 0
            m39592i(r11, r9, r5, r5)
        L_0x03e1:
            if (r38 == 0) goto L_0x0446
            com.youtube.a.a.ag r5 = r4.mo60255h()
            if (r5 == 0) goto L_0x0446
            com.youtube.a.a.ag r5 = r4.mo60255h()
            int r5 = r5.mo60106i()
            r7 = 381326005(0x16ba92b5, float:3.0142506E-25)
            if (r5 != r7) goto L_0x0446
            com.youtube.a.a.ag r4 = r4.mo60255h()
            r5 = 6
            java.nio.ByteBuffer r4 = r4.mo16918f(r5)
            com.youtube.a.a.bp r5 = new com.youtube.a.a.bp
            r5.<init>()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r7)
            int r7 = r4.position()
            int r7 = r4.getInt(r7)
            int r8 = r4.position()
            int r7 = r7 + r8
            r5.mo16917e(r7, r4)
            com.google.android.libraries.elements.d.ej r4 = new com.google.android.libraries.elements.d.ej
            int r6 = r5.mo16913a(r6)
            if (r6 == 0) goto L_0x042b
            java.nio.ByteBuffer r7 = r5.f24704b
            int r8 = r5.f24703a
            int r6 = r6 + r8
            float r6 = r7.getFloat(r6)
            goto L_0x042c
        L_0x042b:
            r6 = 0
        L_0x042c:
            r7 = 6
            int r8 = r5.mo16913a(r7)
            if (r8 == 0) goto L_0x043d
            java.nio.ByteBuffer r7 = r5.f24704b
            int r5 = r5.f24703a
            int r8 = r8 + r5
            float r5 = r7.getFloat(r8)
            goto L_0x043e
        L_0x043d:
            r5 = 0
        L_0x043e:
            r4.<init>(r6, r5)
            r5 = 0
            m39592i(r11, r4, r5, r5)
            goto L_0x0447
        L_0x0446:
            r5 = 0
        L_0x0447:
            int r0 = r0 + 1
            goto L_0x02f3
        L_0x044b:
            r1 = r30
            r5 = 0
            android.content.res.Resources r0 = r29.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            r4 = 1096810496(0x41600000, float:14.0)
            float r0 = r0 * r4
            int r0 = java.lang.Math.round(r0)
            r4 = 0
        L_0x0461:
            int r6 = r30.mo60218i()
            if (r4 >= r6) goto L_0x06d0
            com.google.android.libraries.elements.interfaces.ag r6 = com.google.android.libraries.elements.interfaces.C21237ag.f59568a
            r7 = r35
            if (r7 != r6) goto L_0x0477
            com.google.protos.youtube.elements.r r0 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_CONFIGURATION_ERROR
            java.lang.String r2 = "Has attachmentRuns but drawableRequester is missing."
            r6 = 0
            r13.mo25782a(r0, r2, r3, r6)
            goto L_0x06d0
        L_0x0477:
            r6 = 0
            com.youtube.a.a.f r8 = r1.mo60224s(r4)
            if (r8 != 0) goto L_0x0496
            com.google.protos.youtube.elements.r r8 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r9 = "AttachmentRun missing"
            r13.mo25782a(r8, r9, r3, r6)
        L_0x0485:
            r37 = r0
            r19 = r4
            r9 = r6
            r6 = r11
            r21 = r12
            r7 = r13
            r1 = 2
            r4 = 0
            r5 = 1
            r8 = 3
            r20 = 6
            goto L_0x06c2
        L_0x0496:
            long r9 = r8.mo60214j()
            long r14 = r8.mo60213i()
            com.youtube.a.a.ab r17 = r8.mo60215k()
            if (r17 != 0) goto L_0x04ac
            com.google.protos.youtube.elements.r r8 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r9 = "Element missing in AttachmentRun"
            r13.mo25782a(r8, r9, r3, r6)
            goto L_0x0485
        L_0x04ac:
            com.youtube.a.a.ag r2 = r17.mo60097k()
            if (r2 != 0) goto L_0x04ba
            com.google.protos.youtube.elements.r r2 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r8 = "AttachmentRun contains element with no type"
            r13.mo25782a(r2, r8, r3, r6)
            goto L_0x0485
        L_0x04ba:
            int r6 = r2.mo60106i()
            r5 = 158796345(0x9770a39, float:2.973635E-33)
            if (r6 == r5) goto L_0x04dc
            com.google.protos.youtube.elements.r r5 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            int r2 = r2.mo60106i()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Attachment run contains element that is not ImageType, but id: "
            r6.<init>(r8)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r6 = 0
            r13.mo25782a(r5, r2, r3, r6)
            goto L_0x0485
        L_0x04dc:
            r6 = 0
            int r5 = r8.mo60212g()
            r8 = 6
            java.nio.ByteBuffer r2 = r2.mo16918f(r8)
            com.youtube.a.a.ap r16 = com.youtube.p5283a.p5284a.C68053ap.m98290j(r2)
            com.youtube.a.a.an r2 = r16.mo60127i()
            if (r2 != 0) goto L_0x04f8
            com.google.protos.youtube.elements.r r2 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_MISSING_FIELD
            java.lang.String r5 = "Image of ImageType missing in Attachment"
            r13.mo25782a(r2, r5, r3, r6)
            goto L_0x0485
        L_0x04f8:
            com.youtube.a.a.as r6 = new com.youtube.a.a.as
            r6.<init>()
            com.youtube.a.a.ah r8 = r17.mo60099m()
            if (r8 != 0) goto L_0x0508
            r37 = r0
        L_0x0505:
            r0 = 0
            r1 = 0
            goto L_0x051d
        L_0x0508:
            r37 = r0
            r0 = 168772996(0xa0f4584, float:6.898274E-33)
            com.google.android.libraries.elements.internal.o r1 = com.google.android.libraries.elements.internal.C21354o.f59719a
            boolean r0 = com.google.android.libraries.elements.internal.C21359t.m40386l(r8, r6, r0, r1)
            if (r0 == 0) goto L_0x0505
            com.youtube.a.a.w r0 = r6.mo60133l()
            com.youtube.a.a.w r1 = r6.mo60132k()
        L_0x051d:
            int r10 = (int) r9
            android.content.res.Resources r8 = r29.getResources()
            if (r0 == 0) goto L_0x052a
            com.google.android.libraries.elements.a.a.e r9 = new com.google.android.libraries.elements.a.a.e
            r9.<init>(r0)
            goto L_0x052b
        L_0x052a:
            r9 = 0
        L_0x052b:
            if (r9 == 0) goto L_0x0551
            com.google.android.libraries.elements.interfaces.DimensionUnit r0 = r9.unit()
            r17 = r2
            com.google.android.libraries.elements.interfaces.DimensionUnit r2 = com.google.android.libraries.elements.interfaces.DimensionUnit.DIMENSION_UNIT_POINT
            if (r0 != r2) goto L_0x0553
            com.youtube.a.a.w r0 = r9.f57964a
            float r0 = r0.mo60256b()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0553
            com.youtube.a.a.w r0 = r9.f57964a
            float r0 = r0.mo60256b()
            android.util.DisplayMetrics r2 = r8.getDisplayMetrics()
            int r0 = com.google.android.libraries.elements.internal.C21344e.m40353a(r0, r2)
            goto L_0x0554
        L_0x0551:
            r17 = r2
        L_0x0553:
            r0 = -1
        L_0x0554:
            if (r0 > 0) goto L_0x057e
            int r0 = r10 + 1
            java.lang.Class<android.text.style.AbsoluteSizeSpan> r2 = android.text.style.AbsoluteSizeSpan.class
            java.lang.Object[] r0 = r11.getSpans(r10, r0, r2)
            android.text.style.AbsoluteSizeSpan[] r0 = (android.text.style.AbsoluteSizeSpan[]) r0
            if (r0 == 0) goto L_0x0579
            int r2 = r0.length
            if (r2 != 0) goto L_0x0566
            goto L_0x0579
        L_0x0566:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0579
            r8 = r0[r2]
            if (r8 == 0) goto L_0x0566
            int r9 = r8.getSize()
            if (r9 <= 0) goto L_0x0566
            int r0 = r8.getSize()
            goto L_0x057a
        L_0x0579:
            r0 = -1
        L_0x057a:
            if (r0 > 0) goto L_0x057e
            r0 = r37
        L_0x057e:
            if (r1 != 0) goto L_0x0583
            r9 = r17
            goto L_0x059a
        L_0x0583:
            int r8 = r1.mo60257c()
            r2 = 1
            if (r8 == r2) goto L_0x059c
            r9 = r17
            r2 = 2
            if (r8 == r2) goto L_0x0590
            goto L_0x059a
        L_0x0590:
            float r1 = r1.mo60256b()
            float r2 = (float) r0
            float r1 = r1 * r2
            int r1 = (int) r1
            if (r1 >= 0) goto L_0x05ae
        L_0x059a:
            r1 = r0
            goto L_0x05ae
        L_0x059c:
            r9 = r17
            android.content.res.Resources r2 = r29.getResources()
            float r1 = r1.mo60256b()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r1 = com.google.android.libraries.elements.internal.C21344e.m40353a(r1, r2)
        L_0x05ae:
            if (r0 < 0) goto L_0x06ad
            if (r1 >= 0) goto L_0x05b4
            goto L_0x06ad
        L_0x05b4:
            com.youtube.a.a.x r2 = r6.mo60134m()
            if (r2 != 0) goto L_0x05cc
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r20 = r0
            r21 = r1
            com.google.android.libraries.elements.d.bb r2 = com.google.android.libraries.elements.p1714d.C20818bb.m39089a(r20, r21, r22, r23, r24, r25)
            goto L_0x063c
        L_0x05cc:
            android.content.res.Resources r6 = r29.getResources()
            com.google.android.libraries.elements.a.a.d r8 = new com.google.android.libraries.elements.a.a.d
            r8.<init>(r2)
            com.google.android.libraries.elements.interfaces.DimensionProxy r2 = r8.left()
            int r2 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r2)
            r38 = r2
            com.google.android.libraries.elements.interfaces.DimensionProxy r2 = r8.top()
            int r23 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r2)
            com.google.android.libraries.elements.interfaces.DimensionProxy r2 = r8.right()
            int r2 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r2)
            r17 = r2
            com.google.android.libraries.elements.interfaces.DimensionProxy r2 = r8.bottom()
            int r25 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r2)
            com.google.android.libraries.elements.interfaces.DimensionProxy r2 = r8.start()
            int r2 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r2)
            com.google.android.libraries.elements.interfaces.DimensionProxy r8 = r8.end()
            int r6 = com.google.android.libraries.elements.internal.C21344e.m40354b(r6, r8)
            if (r2 >= 0) goto L_0x0613
            if (r6 < 0) goto L_0x060e
            goto L_0x0613
        L_0x060e:
            r22 = r38
        L_0x0610:
            r24 = r17
            goto L_0x0634
        L_0x0613:
            boolean r8 = com.google.android.libraries.elements.internal.C21327ag.m40334a(r29)
            if (r8 == 0) goto L_0x0628
            if (r2 < 0) goto L_0x061c
            goto L_0x061e
        L_0x061c:
            r2 = r17
        L_0x061e:
            if (r6 < 0) goto L_0x0621
            goto L_0x0623
        L_0x0621:
            r6 = r38
        L_0x0623:
            r24 = r2
            r22 = r6
            goto L_0x0634
        L_0x0628:
            if (r2 < 0) goto L_0x062b
            goto L_0x062d
        L_0x062b:
            r2 = r38
        L_0x062d:
            r22 = r2
            if (r6 >= 0) goto L_0x0632
            goto L_0x0610
        L_0x0632:
            r24 = r6
        L_0x0634:
            r20 = r0
            r21 = r1
            com.google.android.libraries.elements.d.bb r2 = com.google.android.libraries.elements.p1714d.C20818bb.m39089a(r20, r21, r22, r23, r24, r25)
        L_0x063c:
            com.google.android.libraries.elements.a.a.f r6 = new com.google.android.libraries.elements.a.a.f
            r6.<init>(r9)
            com.youtube.a.a.an r8 = r16.mo60125g()
            if (r8 == 0) goto L_0x0653
            com.google.android.libraries.elements.a.a.f r8 = new com.google.android.libraries.elements.a.a.f
            com.youtube.a.a.an r9 = r16.mo60125g()
            r8.<init>(r9)
            r17 = r8
            goto L_0x0655
        L_0x0653:
            r17 = 0
        L_0x0655:
            com.youtube.a.a.an r8 = r16.mo60126h()
            if (r8 == 0) goto L_0x0667
            com.google.android.libraries.elements.a.a.f r8 = new com.google.android.libraries.elements.a.a.f
            com.youtube.a.a.an r9 = r16.mo60126h()
            r8.<init>(r9)
            r16 = r8
            goto L_0x0669
        L_0x0667:
            r16 = 0
        L_0x0669:
            r20 = 6
            r8 = r35
            r9 = r29
            r19 = r4
            r7 = r10
            r4 = 0
            r10 = r6
            r6 = r11
            r11 = r17
            r21 = r12
            r12 = r16
            r13 = r0
            r26 = r14
            r14 = r1
            r15 = r2
            r16 = r33
            r17 = r39
            r8.mo26206b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = 2
            if (r5 == r1) goto L_0x069c
            r8 = 3
            if (r5 == r8) goto L_0x0693
            android.text.style.ImageSpan r0 = new android.text.style.ImageSpan
            r0.<init>(r2, r4)
            goto L_0x0698
        L_0x0693:
            com.google.android.libraries.elements.d.ei r0 = new com.google.android.libraries.elements.d.ei
            r0.<init>(r2)
        L_0x0698:
            r9 = r26
            r5 = 1
            goto L_0x06a5
        L_0x069c:
            r8 = 3
            android.text.style.ImageSpan r0 = new android.text.style.ImageSpan
            r5 = 1
            r0.<init>(r2, r5)
            r9 = r26
        L_0x06a5:
            int r2 = (int) r9
            m39592i(r6, r0, r7, r2)
            r7 = r33
            r9 = 0
            goto L_0x06c2
        L_0x06ad:
            r19 = r4
            r6 = r11
            r21 = r12
            r1 = 2
            r4 = 0
            r5 = 1
            r8 = 3
            r20 = 6
            com.google.protos.youtube.elements.r r0 = com.google.protos.youtube.elements.C66260r.LOG_TYPE_INVALID_FIELD
            java.lang.String r2 = "Attachment run requires widthDimension and heightDimension in LayoutProperties."
            r7 = r33
            r9 = 0
            r7.mo25782a(r0, r2, r3, r9)
        L_0x06c2:
            int r0 = r19 + 1
            r1 = r30
            r4 = r0
            r11 = r6
            r13 = r7
            r12 = r21
            r5 = 0
            r0 = r37
            goto L_0x0461
        L_0x06d0:
            r6 = r11
            r21 = r12
            r4 = 0
            com.youtube.a.a.ai r0 = r30.mo60227v()
            if (r0 == 0) goto L_0x0707
            com.youtube.a.a.ai r0 = r30.mo60227v()
            float r0 = r0.mo60111g()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0707
            com.youtube.a.a.ai r0 = r30.mo60227v()
            float r0 = r0.mo60111g()
            android.content.res.Resources r1 = r29.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.scaledDensity
            com.google.android.libraries.elements.d.cz r2 = new com.google.android.libraries.elements.d.cz
            float r0 = r0 * r1
            r2.<init>(r0)
            int r0 = r21.length()
            m39592i(r6, r2, r4, r0)
        L_0x0707:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.elements.p1714d.C21071eg.m39590g(com.google.android.libraries.elements.interfaces.z, android.content.Context, com.youtube.a.a.g, com.google.android.libraries.elements.interfaces.t, com.google.android.libraries.elements.interfaces.cl, com.google.android.libraries.elements.interfaces.bb, java.util.Map, com.google.android.libraries.elements.interfaces.ag, boolean, boolean, boolean, boolean):java.lang.CharSequence");
    }

    /* renamed from: h */
    static void m39591h(C6411u uVar, @C6118b C68074bj bjVar, @C6118b C21313t tVar, @C6118b C21296cl clVar, @C6118b C21319z zVar, @C6118b C21259bb bbVar, @C6118b Map map, @C6118b C21237ag agVar, @C6118b boolean z, @C6118b boolean z2, @C6118b boolean z3, @C6118b boolean z4, @C6118b boolean z5, C6281fx fxVar, C6281fx fxVar2, C6281fx fxVar3, C6281fx fxVar4) {
        C6411u uVar2 = uVar;
        C21319z zVar2 = zVar;
        C21259bb bbVar2 = bbVar;
        fxVar.f18496a = new AtomicReference(bjVar.mo60197i());
        fxVar2.f18496a = new AtomicReference(bjVar.mo60198j());
        C21319z zVar3 = zVar;
        C21313t tVar2 = tVar;
        C21296cl clVar2 = clVar;
        C21259bb bbVar3 = bbVar;
        Map map2 = map;
        C21237ag agVar2 = agVar;
        boolean z6 = z;
        boolean z7 = z3;
        boolean z8 = z4;
        boolean z9 = z5;
        fxVar3.f18496a = new AtomicReference(m39590g(zVar3, uVar2.f19009b, C21359t.m40382h(bjVar.mo60197i(), zVar2, bbVar2), tVar2, clVar2, bbVar3, map2, agVar2, z6, z7, z8, z9));
        C21319z zVar4 = zVar;
        fxVar4.f18496a = new AtomicReference(m39590g(zVar4, uVar2.f19009b, C21359t.m40382h(bjVar.mo60198j(), zVar2, bbVar2), tVar2, clVar2, bbVar3, map2, agVar2, z6, z7, z8, z9));
        if (z && z2) {
            C21366j.m40408a(uVar2.f19009b);
        }
    }

    /* renamed from: i */
    static void m39592i(SpannableString spannableString, Object obj, int i, int i2) {
        int min = i < 0 ? 0 : Math.min(i, spannableString.length());
        int length = i2 <= 0 ? spannableString.length() : Math.min(i2 + min, spannableString.length());
        if (min != length) {
            spannableString.setSpan(obj, min, length, 18);
        }
    }

    /* renamed from: j */
    static void m39593j(@C6118b C21237ag agVar, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4) {
        agVar.mo26205a();
        atomicReference.lazySet((Object) null);
        atomicReference2.lazySet((Object) null);
        atomicReference3.lazySet((Object) null);
        atomicReference4.lazySet((Object) null);
    }

    /* renamed from: k */
    private static int m39594k(Context context, int i) {
        if (Build.VERSION.SDK_INT < 31) {
            return i;
        }
        int i2 = context.getResources().getConfiguration().fontWeightAdjustment;
        if (i2 != Integer.MAX_VALUE) {
            i += i2;
        }
        return C60757n.m92742c(i, 1, 1000);
    }

    /* renamed from: l */
    private static int m39595l(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (i = context.getResources().getConfiguration().fontWeightAdjustment) != Integer.MAX_VALUE) {
            return i;
        }
        return 0;
    }
}
