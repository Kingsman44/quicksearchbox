package com.google.apps.tiktok.tracing;

import android.os.SystemClock;
import android.os.Trace;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.apps.tiktok.tracing.fm */
/* compiled from: PG */
public final class C47831fm {

    /* renamed from: a */
    public static final WeakHashMap f123851a = new WeakHashMap();

    /* renamed from: b */
    public static final ThreadLocal f123852b = new C47830fl();

    /* renamed from: c */
    public static final Deque f123853c = new ArrayDeque();

    /* renamed from: d */
    public static final Deque f123854d = new ArrayDeque();

    /* renamed from: e */
    public static final Object f123855e = new Object();

    /* renamed from: f */
    public static final Runnable f123856f = C47828fj.f123849a;

    /* renamed from: g */
    public static int f123857g;

    /* renamed from: h */
    public static int f123858h = 0;

    /* renamed from: i */
    public static C47572bw f123859i;

    /* renamed from: com.google.apps.tiktok.tracing.fm$a */
    /* compiled from: PG */
    final class C47832a {
        /* renamed from: a */
        public static boolean m85032a() {
            return Trace.isEnabled();
        }
    }

    /* renamed from: A */
    private static void m85003A(C47572bw bwVar) {
        if (bwVar.mo51366a() != null) {
            m85003A(bwVar.mo51366a());
        }
        m85031z(bwVar.mo51367b());
    }

    /* renamed from: B */
    private static void m85004B(C47572bw bwVar) {
        Trace.endSection();
        if (bwVar.mo51366a() != null) {
            m85004B(bwVar.mo51366a());
        }
    }

    /* renamed from: C */
    private static void m85005C(C47572bw bwVar, C47572bw bwVar2) {
        if (bwVar != null) {
            if (bwVar2 != null) {
                if (bwVar.mo51366a() == bwVar2) {
                    Trace.endSection();
                    return;
                } else if (bwVar == bwVar2.mo51366a()) {
                    m85031z(bwVar2.mo51367b());
                    return;
                }
            }
            m85004B(bwVar);
        }
        if (bwVar2 != null) {
            m85003A(bwVar2);
        }
    }

    /* renamed from: a */
    public static C47558bi m85006a(String str) {
        return m85025t(str, C47562bm.f123426a, true);
    }

    /* renamed from: b */
    public static C47558bi m85007b(String str, C47563bn bnVar) {
        return m85025t(str, bnVar, true);
    }

    /* renamed from: c */
    public static C47559bj m85008c(C47560bk bkVar) {
        C47559bj d = C47559bj.m84647d(2);
        for (C47572bw d2 = m85009d(); d2 != null; d2 = d2.mo51366a()) {
            d = d2.mo51394g(bkVar);
            if (d.mo51421c() - 1 == 0) {
                break;
            }
        }
        return d;
    }

    /* renamed from: d */
    public static C47572bw m85009d() {
        return ((C47833fn) f123852b.get()).f123862c;
    }

    /* renamed from: e */
    static C47572bw m85010e() {
        return (C47572bw) f123854d.peek();
    }

    /* renamed from: f */
    public static C47572bw m85011f() {
        C47572bw d = m85009d();
        return d == null ? new C47528an() : d;
    }

    /* renamed from: g */
    public static C47572bw m85012g() {
        C47572bw bwVar = f123859i;
        if (bwVar == null) {
            return null;
        }
        f123859i = null;
        return bwVar;
    }

    /* renamed from: h */
    public static C47572bw m85013h(C47572bw bwVar) {
        return m85014i((C47833fn) f123852b.get(), bwVar);
    }

    /* renamed from: i */
    public static C47572bw m85014i(C47833fn fnVar, C47572bw bwVar) {
        C47572bw bwVar2 = fnVar.f123862c;
        if (bwVar2 == bwVar) {
            return bwVar;
        }
        if (bwVar2 == null) {
            fnVar.f123861b = C47832a.m85032a();
        }
        if (fnVar.f123861b) {
            m85005C(bwVar2, bwVar);
        }
        if ((bwVar != null && bwVar.mo51398k()) || (bwVar2 != null && bwVar2.mo51398k())) {
            int currentThreadTimeMillis = (int) SystemClock.currentThreadTimeMillis();
            int i = currentThreadTimeMillis - fnVar.f123864e;
            if (i > 0 && bwVar2 != null && bwVar2.mo51398k()) {
                bwVar2.mo51396i(i);
            }
            fnVar.f123864e = currentThreadTimeMillis;
        }
        fnVar.f123862c = bwVar;
        C47835fp fpVar = fnVar.f123863d;
        if (fpVar != null) {
            fpVar.f123867a = bwVar;
        }
        return bwVar2;
    }

    /* renamed from: j */
    public static String m85015j() {
        C47572bw d = m85009d();
        if (d == null) {
            return "<no trace>";
        }
        return m85016k(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        r15 = r6.f123443c.f123437d;
        r4 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        if (r15.containsKey(r4) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r6.f123443c.f123437d.put(r4, new com.google.apps.tiktok.tracing.C47565bp(r8, 1073741824));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r14 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bf, code lost:
        r14.f123436c = r6.f123443c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
        if (r14 == null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        r14.f123436c = r6.f123443c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d3, code lost:
        r6.f123444d = r8;
        r6.f123445e++;
        r6.mo51431b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ce, code lost:
        if (r6.mo51432c(r12, r13, r14, (r14 + r13) - r12) != false) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02b5 A[RETURN] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m85016k(com.google.apps.tiktok.tracing.C47572bw r16) {
        /*
            r2 = 0
            r3 = 0
            r1 = r16
        L_0x0004:
            if (r1 == 0) goto L_0x001a
            int r2 = r2 + 1
            java.lang.String r4 = r1.mo51367b()
            int r4 = r4.length()
            int r3 = r3 + r4
            com.google.apps.tiktok.tracing.bw r1 = r1.mo51366a()
            if (r1 == 0) goto L_0x0004
            int r3 = r3 + 4
            goto L_0x0004
        L_0x001a:
            r1 = 250(0xfa, float:3.5E-43)
            r4 = 4
            java.lang.String r5 = " -> "
            if (r2 <= r1) goto L_0x02b6
            java.lang.String[] r1 = new java.lang.String[r2]
            int r6 = r2 + -1
            r7 = r16
        L_0x0027:
            if (r6 < 0) goto L_0x0036
            java.lang.String r8 = r7.mo51367b()
            r1[r6] = r8
            com.google.apps.tiktok.tracing.bw r7 = r7.mo51366a()
            int r6 = r6 + -1
            goto L_0x0027
        L_0x0036:
            com.google.common.b.gz r6 = new com.google.common.b.gz
            r6.<init>(r4)
            com.google.common.b.ij r7 = com.google.common.p4522b.C58528ij.m90008H(r1)
            com.google.common.b.sl r7 = r7.iterator()
            r8 = 0
        L_0x0044:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0059
            int r9 = r8 + 1
            java.lang.Object r10 = r7.next()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.mo55429h(r10, r8)
            r8 = r9
            goto L_0x0044
        L_0x0059:
            r7 = 1
            com.google.common.b.hd r6 = r6.mo55427f(r7)
            r8 = r6
            com.google.common.b.pv r8 = (com.google.common.p4522b.C58729pv) r8
            int r9 = r8.f156487c
            int r10 = r2 >> 2
            if (r9 <= r10) goto L_0x006a
        L_0x0067:
            r11 = 0
            goto L_0x024f
        L_0x006a:
            int r9 = r2 + 1
            int[] r12 = new int[r9]
            r13 = 0
        L_0x006f:
            if (r13 >= r2) goto L_0x0082
            r14 = r1[r13]
            java.lang.Object r14 = r6.get(r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r12[r13] = r14
            int r13 = r13 + 1
            goto L_0x006f
        L_0x0082:
            int r6 = r8.f156487c
            r12[r2] = r6
            com.google.apps.tiktok.tracing.br r6 = new com.google.apps.tiktok.tracing.br
            r6.<init>(r12)
            r8 = 0
        L_0x008c:
            r12 = -1
            if (r8 >= r9) goto L_0x0176
            int r13 = r6.f123446f
            int r13 = r13 + r7
            r6.f123446f = r13
            int[] r13 = r6.f123441a
            r13 = r13[r8]
        L_0x0098:
            r14 = 0
        L_0x0099:
            int r15 = r6.f123446f
            if (r15 <= 0) goto L_0x0171
            int r15 = r6.f123445e
            r11 = 1073741824(0x40000000, float:2.0)
            if (r15 != 0) goto L_0x00df
            com.google.apps.tiktok.tracing.bp r15 = r6.f123443c
            java.util.Map r15 = r15.f123437d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            boolean r15 = r15.containsKey(r4)
            if (r15 != 0) goto L_0x00cd
            com.google.apps.tiktok.tracing.bp r15 = new com.google.apps.tiktok.tracing.bp
            r15.<init>(r8, r11)
            com.google.apps.tiktok.tracing.bp r11 = r6.f123443c
            java.util.Map r11 = r11.f123437d
            r11.put(r4, r15)
            if (r14 == 0) goto L_0x00c3
            com.google.apps.tiktok.tracing.bp r4 = r6.f123443c
            r14.f123436c = r4
        L_0x00c3:
            int r4 = r6.f123446f
            int r4 = r4 + r12
            r6.f123446f = r4
            r6.mo51430a()
            r4 = 4
            goto L_0x0098
        L_0x00cd:
            if (r14 == 0) goto L_0x00d3
            com.google.apps.tiktok.tracing.bp r4 = r6.f123443c
            r14.f123436c = r4
        L_0x00d3:
            r6.f123444d = r8
            int r4 = r6.f123445e
            int r4 = r4 + r7
            r6.f123445e = r4
            r6.mo51431b()
            goto L_0x0171
        L_0x00df:
            int[] r4 = r6.f123441a
            com.google.apps.tiktok.tracing.bp r15 = r6.f123443c
            java.util.Map r15 = r15.f123437d
            int r0 = r6.f123444d
            r0 = r4[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r15.get(r0)
            com.google.apps.tiktok.tracing.bp r0 = (com.google.apps.tiktok.tracing.C47565bp) r0
            int r0 = r0.f123434a
            int r15 = r6.f123445e
            int r0 = r0 + r15
            r0 = r4[r0]
            if (r0 != r13) goto L_0x010a
            if (r14 == 0) goto L_0x0102
            com.google.apps.tiktok.tracing.bp r0 = r6.f123443c
            r14.f123436c = r0
        L_0x0102:
            int r15 = r15 + 1
            r6.f123445e = r15
            r6.mo51431b()
            goto L_0x0171
        L_0x010a:
            com.google.apps.tiktok.tracing.bp r0 = r6.f123443c
            java.util.Map r0 = r0.f123437d
            int[] r4 = r6.f123441a
            int r15 = r6.f123444d
            r4 = r4[r15]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.get(r4)
            com.google.apps.tiktok.tracing.bp r0 = (com.google.apps.tiktok.tracing.C47565bp) r0
            com.google.apps.tiktok.tracing.bp r4 = new com.google.apps.tiktok.tracing.bp
            int r15 = r0.f123434a
            int r11 = r6.f123445e
            int r11 = r11 + r15
            int r11 = r11 + r12
            r4.<init>(r15, r11)
            com.google.apps.tiktok.tracing.bp r11 = r6.f123443c
            java.util.Map r11 = r11.f123437d
            int[] r15 = r6.f123441a
            int r12 = r6.f123444d
            r12 = r15[r12]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.put(r12, r4)
            java.util.Map r11 = r4.f123437d
            int[] r12 = r6.f123441a
            int r15 = r4.f123435b
            int r15 = r15 + r7
            r12 = r12[r15]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.put(r12, r0)
            int r11 = r4.f123435b
            int r11 = r11 + r7
            r0.f123434a = r11
            if (r14 == 0) goto L_0x0153
            r14.f123436c = r4
        L_0x0153:
            com.google.apps.tiktok.tracing.bp r0 = new com.google.apps.tiktok.tracing.bp
            r11 = 1073741824(0x40000000, float:2.0)
            r0.<init>(r8, r11)
            java.util.Map r11 = r4.f123437d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.put(r12, r0)
            int r0 = r6.f123446f
            r11 = -1
            int r0 = r0 + r11
            r6.f123446f = r0
            r6.mo51430a()
            r14 = r4
            r4 = 4
            r12 = -1
            goto L_0x0099
        L_0x0171:
            int r8 = r8 + 1
            r4 = 4
            goto L_0x008c
        L_0x0176:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            com.google.apps.tiktok.tracing.bo r4 = new com.google.apps.tiktok.tracing.bo
            com.google.apps.tiktok.tracing.bp r8 = r6.f123442b
            r9 = -1
            r11 = 0
            r4.<init>(r8, r11, r9, r9)
            r0.push(r4)
        L_0x0187:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L_0x01f2
            java.lang.Object r8 = r0.pop()
            com.google.apps.tiktok.tracing.bo r8 = (com.google.apps.tiktok.tracing.C47564bo) r8
            com.google.apps.tiktok.tracing.bp r9 = r8.f123433d
            java.util.Map r9 = r9.f123437d
            java.util.Collection r9 = r9.values()
            java.util.Iterator r9 = r9.iterator()
        L_0x019f:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0187
            java.lang.Object r11 = r9.next()
            com.google.apps.tiktok.tracing.bp r11 = (com.google.apps.tiktok.tracing.C47565bp) r11
            int r12 = r8.f123431b
            int r13 = r8.f123432c
            int r14 = r11.f123434a
            int r15 = r11.f123435b
            boolean r12 = r6.mo51432c(r12, r13, r14, r15)
            if (r12 != 0) goto L_0x01db
            java.util.Map r12 = r11.f123437d
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x01d1
            int r12 = r8.f123431b
            int r13 = r8.f123432c
            int r14 = r11.f123434a
            int r15 = r14 + r13
            int r15 = r15 - r12
            boolean r12 = r6.mo51432c(r12, r13, r14, r15)
            if (r12 == 0) goto L_0x01d1
            goto L_0x01db
        L_0x01d1:
            com.google.apps.tiktok.tracing.bo r12 = new com.google.apps.tiktok.tracing.bo
            int r13 = r11.f123434a
            int r14 = r11.f123435b
            r12.<init>(r11, r7, r13, r14)
            goto L_0x01e7
        L_0x01db:
            com.google.apps.tiktok.tracing.bo r12 = new com.google.apps.tiktok.tracing.bo
            int r13 = r8.f123430a
            int r13 = r13 + r7
            int r14 = r8.f123431b
            int r15 = r8.f123432c
            r12.<init>(r11, r13, r14, r15)
        L_0x01e7:
            int r11 = r4.f123430a
            int r13 = r12.f123430a
            if (r11 >= r13) goto L_0x01ee
            r4 = r12
        L_0x01ee:
            r0.push(r12)
            goto L_0x019f
        L_0x01f2:
            int[] r0 = r6.f123441a
            int r0 = r0.length
            int r8 = r4.f123432c
            int r8 = r8 + r7
            int r0 = java.lang.Math.min(r0, r8)
            com.google.apps.tiktok.tracing.bp r8 = r6.f123442b
            r9 = 0
        L_0x01ff:
            int[] r11 = r6.f123441a
            int r12 = r4.f123431b
            int r13 = r0 - r12
            int r13 = r9 % r13
            int r12 = r12 + r13
            r11 = r11[r12]
            java.util.Map r8 = r8.f123437d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r8 = r8.get(r11)
            com.google.apps.tiktok.tracing.bp r8 = (com.google.apps.tiktok.tracing.C47565bp) r8
            if (r8 != 0) goto L_0x0219
            goto L_0x0237
        L_0x0219:
            int r11 = r8.f123434a
        L_0x021b:
            int r12 = r8.f123435b
            int r12 = r12 + r7
            if (r11 >= r12) goto L_0x01ff
            int[] r12 = r6.f123441a
            int r13 = r12.length
            if (r11 >= r13) goto L_0x01ff
            int r13 = r4.f123431b
            int r14 = r0 - r13
            int r14 = r9 % r14
            int r13 = r13 + r14
            r13 = r12[r13]
            r12 = r12[r11]
            if (r13 != r12) goto L_0x0237
            int r9 = r9 + 1
            int r11 = r11 + 1
            goto L_0x021b
        L_0x0237:
            com.google.apps.tiktok.tracing.bq r6 = new com.google.apps.tiktok.tracing.bq
            int r4 = r4.f123431b
            int r8 = r0 - r4
            int r9 = r9 / r8
            r6.<init>(r4, r0, r9)
            int r0 = r6.f123440c
            int r4 = r6.f123439b
            int r8 = r6.f123438a
            int r4 = r4 - r8
            int r0 = r0 * r4
            if (r0 >= r10) goto L_0x024e
            goto L_0x0067
        L_0x024e:
            r11 = r6
        L_0x024f:
            java.lang.String r0 = ""
            if (r11 != 0) goto L_0x0254
            goto L_0x02ae
        L_0x0254:
            int r4 = r11.f123439b
            int r6 = r11.f123438a
            int r4 = r4 - r6
            int r8 = r11.f123440c
            int r4 = r4 * r8
            if (r6 <= 0) goto L_0x0270
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            java.lang.String r6 = android.text.TextUtils.join(r5, r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r6.concat(r5)
            goto L_0x0271
        L_0x0270:
            r6 = r0
        L_0x0271:
            int r8 = r11.f123438a
            int r8 = r8 + r4
            if (r8 >= r2) goto L_0x0286
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r1, r8, r2)
            java.lang.String r0 = android.text.TextUtils.join(r5, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r5.concat(r0)
        L_0x0286:
            java.util.Locale r2 = java.util.Locale.US
            r4 = 4
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r4 = 0
            r8[r4] = r6
            int r4 = r11.f123438a
            int r6 = r11.f123439b
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r4, r6)
            java.lang.String r1 = android.text.TextUtils.join(r5, r1)
            r8[r7] = r1
            int r1 = r11.f123440c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r8[r4] = r1
            r1 = 3
            r8[r1] = r0
            java.lang.String r0 = "%s{%s}x%d%s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r8)
        L_0x02ae:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x02b5
            goto L_0x02b6
        L_0x02b5:
            return r0
        L_0x02b6:
            char[] r0 = new char[r3]
            r1 = r16
        L_0x02ba:
            if (r1 == 0) goto L_0x02da
            java.lang.String r2 = r1.mo51367b()
            int r4 = r2.length()
            int r3 = r3 - r4
            int r4 = r2.length()
            r6 = 0
            r2.getChars(r6, r4, r0, r3)
            com.google.apps.tiktok.tracing.bw r1 = r1.mo51366a()
            if (r1 == 0) goto L_0x02ba
            int r3 = r3 + -4
            r2 = 4
            r5.getChars(r6, r2, r0, r3)
            goto L_0x02ba
        L_0x02da:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47831fm.m85016k(com.google.apps.tiktok.tracing.bw):java.lang.String");
    }

    /* renamed from: l */
    static Map m85017l() {
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = f123851a;
        synchronized (weakHashMap) {
            for (Map.Entry entry : weakHashMap.entrySet()) {
                C47572bw bwVar = ((C47833fn) entry.getValue()).f123862c;
                if (bwVar != null) {
                    hashMap.put((Thread) entry.getKey(), bwVar);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: n */
    public static void m85019n() {
        int i = f123857g;
        int i2 = i - 1;
        f123857g = i2;
        if (i2 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        } else if (f123858h == i) {
            C58838bb.m90884s(!f123854d.isEmpty(), "current async trace should not be null");
            m85013h((C47572bw) null);
            f123858h = 0;
        }
    }

    /* renamed from: o */
    public static void m85020o() {
        f123859i = m85009d();
        C19559g.m37302a().post(C47829fk.f123850a);
    }

    /* renamed from: p */
    static boolean m85021p(C47833fn fnVar, C47572bw bwVar) {
        C47537aw awVar = (C47537aw) bwVar;
        C58838bb.m90866a(awVar.f123379b, "isSynchronousChild should not be called if the trace has been closed on its creation thread.");
        C47835fp fpVar = fnVar.f123863d;
        boolean z = fpVar != null;
        return !(!z && ((C47537aw) awVar.f123378a).f123379b != awVar.f123379b) && !(z && fpVar.f123868b == awVar.f123378a);
    }

    /* renamed from: q */
    public static void m85022q() {
        C47572bw e;
        f123857g++;
        if (f123858h == 0) {
            C47833fn fnVar = (C47833fn) f123852b.get();
            if (fnVar.f123862c == null && (e = m85010e()) != null) {
                m85014i(fnVar, e);
                f123858h = f123857g;
            }
        }
    }

    /* renamed from: r */
    public static void m85023r() {
        C47572bw e;
        f123857g++;
        if (f123858h == 0) {
            C47833fn fnVar = (C47833fn) f123852b.get();
            if (fnVar.f123862c == null && (e = m85010e()) != null) {
                m85014i(fnVar, e);
                f123858h = f123857g;
            }
        }
    }

    /* renamed from: s */
    public static C47558bi m85024s(String str) {
        return m85025t(str, C47562bm.f123426a, true);
    }

    /* renamed from: t */
    public static C47558bi m85025t(String str, C47563bn bnVar, boolean z) {
        C47572bw bwVar;
        C47833fn fnVar = (C47833fn) f123852b.get();
        C47572bw bwVar2 = fnVar.f123862c;
        if (bwVar2 == null) {
            bwVar = new C47529ao(str, bnVar, z);
        } else if (bwVar2 instanceof C47864x) {
            bwVar = ((C47864x) bwVar2).mo51392e(str, bnVar, z);
        } else {
            bwVar = bwVar2.mo51395h(str, bnVar, fnVar);
        }
        m85014i(fnVar, bwVar);
        return new C47558bi(bwVar);
    }

    /* renamed from: u */
    public static List m85026u() {
        C58480gp e = C58485gu.m89837e();
        for (C47572bw d = m85009d(); d != null; d = d.mo51366a()) {
            e.mo55395g(d.mo51367b());
        }
        return C58597ky.m90216g(e.mo55394f());
    }

    /* renamed from: v */
    public static boolean m85027v() {
        return m85009d() != null;
    }

    /* renamed from: w */
    public static C47573bx m85028w() {
        C47833fn fnVar = (C47833fn) f123852b.get();
        if (!fnVar.f123860a) {
            return C47826fh.f123847a;
        }
        Object obj = fnVar.f123862c;
        if (obj == null) {
            obj = new C47528an();
        }
        f123853c.add(obj);
        C19559g.m37302a().post(f123856f);
        return C47827fi.f123848a;
    }

    /* renamed from: x */
    public static boolean m85029x() {
        C47572bw e = m85010e();
        if (e == null || (e instanceof C47864x)) {
            return false;
        }
        m85022q();
        return true;
    }

    /* renamed from: y */
    public static C47538ax m85030y(C47538ax axVar) {
        return m85013h((C47572bw) axVar);
    }

    /* renamed from: z */
    private static void m85031z(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* renamed from: m */
    static void m85018m(C47572bw bwVar) {
        bwVar.getClass();
        C47833fn fnVar = (C47833fn) f123852b.get();
        C47572bw bwVar2 = fnVar.f123862c;
        C58838bb.m90867b(bwVar2, "Tried to end span %s, but there was no active span", bwVar.mo51367b());
        C58838bb.m90890y(bwVar == bwVar2, "Tried to end span %s, but that span is not the current span. The current span is %s.", bwVar.mo51367b(), bwVar2.mo51367b());
        m85014i(fnVar, bwVar2.mo51366a());
    }
}
