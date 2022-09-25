package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6080a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.l.c.r;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76575as;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6087h.p6088a.C76900d;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.a.e */
/* compiled from: PG */
final class C76802e extends C76900d {
    public C76802e(r rVar, C22871g gVar) {
        super(rVar, gVar);
    }

    /* renamed from: e */
    public static String m123406e(String str) {
        return str.equals("pi") ? "π" : str;
    }

    /* renamed from: f */
    private static C58485gu m123407f(C76590bg bgVar) {
        return (C58485gu) Collection.EL.stream(bgVar.mo72262d("term")).map(C76801d.f212201a).collect(C58370cn.f155946a);
    }

    /* renamed from: g */
    private static Boolean m123408g(C76590bg bgVar) {
        return (Boolean) bgVar.mo72265g(C76575as.f211814a, "is_inverse").orElse(false);
    }

    /* renamed from: h */
    private static String m123409h(C76590bg bgVar) {
        return (String) bgVar.mo72265g(C76564ah.f211801a, "function").orElse(BuildConfig.FLAVOR);
    }

    /* renamed from: i */
    private static String m123410i(C76590bg bgVar) {
        return m123406e((String) bgVar.mo72265g(C76564ah.f211801a, "term").orElse(BuildConfig.FLAVOR));
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.CALC_EXPRESSION));
        h.mo72277g("Calculate_expression", C90126fx.f251247fH);
        h.mo72244c(C58485gu.m89846n("Calculate_expression"));
        ((C76541a) h).f211766c = 40003;
        return h.mo72276f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C58485gu mo72332c() {
        return C58485gu.m89846n(82917);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo72333d(com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg r11) {
        /*
            r10 = this;
            java.lang.String r0 = "Expression"
            j$.util.Optional r0 = r11.mo72266h(r0)
            boolean r1 = r0.isPresent()
            r2 = 2
            if (r1 == 0) goto L_0x0029
            com.google.android.apps.gsa.nga.engine.o.c.bg r11 = new com.google.android.apps.gsa.nga.engine.o.c.bg
            java.lang.Object r0 = r0.get()
            com.google.knowledge.a.a.h r0 = (com.google.knowledge.p4661a.p4662a.C61746h) r0
            com.google.knowledge.a.a.j r0 = r0.f166797e
            if (r0 != 0) goto L_0x001b
            com.google.knowledge.a.a.j r0 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x001b:
            int r1 = r0.f166802a
            if (r1 != r2) goto L_0x0024
            java.lang.Object r0 = r0.f166803b
            com.google.knowledge.a.a.n r0 = (com.google.knowledge.p4661a.p4662a.C61752n) r0
            goto L_0x0026
        L_0x0024:
            com.google.knowledge.a.a.n r0 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x0026:
            r11.<init>(r0)
        L_0x0029:
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r3 = "type"
            r4 = 0
            r1[r4] = r3
            com.google.android.apps.gsa.nga.engine.o.c.ah r3 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r1 = r11.mo72265g(r3, r1)
            java.lang.String r3 = ""
            java.lang.Object r1 = r1.orElse(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x004a
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            return r11
        L_0x004a:
            int r5 = r1.hashCode()
            r6 = 3
            java.lang.String r7 = "percentage"
            r8 = -1
            switch(r5) {
                case -1327307099: goto L_0x0090;
                case -921832806: goto L_0x0088;
                case -509396822: goto L_0x007e;
                case 106858757: goto L_0x0074;
                case 159568266: goto L_0x006a;
                case 1331491320: goto L_0x0060;
                case 1380938712: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x009a
        L_0x0056:
            java.lang.String r5 = "function"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 5
            goto L_0x009b
        L_0x0060:
            java.lang.String r5 = "arithmetic_conversation"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 1
            goto L_0x009b
        L_0x006a:
            java.lang.String r5 = "function_conversation"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 0
            goto L_0x009b
        L_0x0074:
            java.lang.String r5 = "power"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 4
            goto L_0x009b
        L_0x007e:
            java.lang.String r5 = "arithmetic"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 6
            goto L_0x009b
        L_0x0088:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x009a
            r1 = 2
            goto L_0x009b
        L_0x0090:
            java.lang.String r5 = "factorial"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x009a
            r1 = 3
            goto L_0x009b
        L_0x009a:
            r1 = -1
        L_0x009b:
            java.lang.String r5 = "sqrt"
            java.lang.String r9 = "operator"
            switch(r1) {
                case 0: goto L_0x02f4;
                case 1: goto L_0x02ab;
                case 2: goto L_0x020e;
                case 3: goto L_0x01c6;
                case 4: goto L_0x0181;
                case 5: goto L_0x00a7;
                case 6: goto L_0x00a7;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            return r11
        L_0x00a7:
            com.google.common.b.gu r1 = m123407f(r11)
            java.lang.String[] r6 = new java.lang.String[r0]
            r6[r4] = r9
            com.google.common.b.gu r6 = r11.mo72262d(r6)
            int r7 = r6.size()
            int r9 = r1.size()
            int r9 = r9 + r8
            if (r7 == r9) goto L_0x00e0
            int r7 = r6.size()
            j$.util.stream.IntStream r7 = p3186j$.util.stream.IntStream.CC.range(r4, r7)
            com.google.android.apps.gsa.nga.engine.o.e.b.a.a r9 = com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6080a.C76798a.f212197a
            j$.util.stream.IntStream r7 = r7.filter(r9)
            p3186j$.util.Objects.requireNonNull(r6)
            com.google.android.apps.gsa.nga.engine.o.e.b.a.b r9 = new com.google.android.apps.gsa.nga.engine.o.e.b.a.b
            r9.<init>(r6)
            j$.util.stream.Stream r6 = r7.mapToObj(r9)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r6 = r6.collect(r7)
            com.google.common.b.gu r6 = (com.google.common.p4522b.C58485gu) r6
        L_0x00e0:
            int r7 = r6.size()
            int r9 = r1.size()
            int r9 = r9 + r8
            if (r7 == r9) goto L_0x00f7
            r6.size()
            r1.size()
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x0180
        L_0x00f7:
            int r7 = r6.size()
            j$.util.stream.IntStream r7 = p3186j$.util.stream.IntStream.CC.range(r4, r7)
            com.google.android.apps.gsa.nga.engine.o.e.b.a.c r8 = new com.google.android.apps.gsa.nga.engine.o.e.b.a.c
            r8.<init>(r1, r6)
            j$.util.stream.Stream r6 = r7.mapToObj(r8)
            j$.util.stream.Collector r7 = p3186j$.util.stream.Collectors.joining(r3)
            java.lang.Object r6 = r6.collect(r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90131l(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r6.concat(r1)
            java.lang.String r6 = m123409h(r11)
            java.lang.Boolean r11 = m123408g(r11)
            boolean r11 = r11.booleanValue()
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x0176
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0154
            if (r11 == 0) goto L_0x0149
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r4] = r1
            java.lang.String r0 = "(%s)^2"
            java.lang.String r1 = java.lang.String.format(r0, r11)
            goto L_0x0176
        L_0x0149:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r4] = r1
            java.lang.String r0 = "√%s"
            java.lang.String r1 = java.lang.String.format(r0, r11)
            goto L_0x0176
        L_0x0154:
            if (r0 == r11) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            java.lang.String r3 = "⁻¹"
        L_0x0159:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r5 = "%s"
            r11.<init>(r5)
            r11.append(r3)
            java.lang.String r3 = "(%s)"
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r6
            r2[r0] = r1
            java.lang.String r1 = java.lang.String.format(r11, r2)
        L_0x0176:
            com.google.android.libraries.assistant.g.c.d.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r11, r1)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x0180:
            return r11
        L_0x0181:
            com.google.common.b.gu r11 = m123407f(r11)
            r11.isEmpty()
            int r1 = r11.size()
            if (r1 != r0) goto L_0x01a7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r11 = r11.get(r4)
            r0[r4] = r11
            java.lang.String r11 = "^%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            goto L_0x01c5
        L_0x01a7:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r2 = r11.get(r4)
            r1[r4] = r2
            java.lang.Object r11 = r11.get(r0)
            r1[r0] = r11
            java.lang.String r11 = "%s^%s"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x01c5:
            return r11
        L_0x01c6:
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "term"
            r1[r4] = r2
            j$.util.Optional r1 = r11.mo72272n(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x01f3
            java.lang.String r11 = m123410i(r11)
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x01e5
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x020d
        L_0x01e5:
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x01ee }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x01ee }
            goto L_0x01f9
        L_0x01ee:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x020d
        L_0x01f3:
            java.lang.Object r11 = r1.get()
            java.lang.Integer r11 = (java.lang.Integer) r11
        L_0x01f9:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r11
            java.lang.String r11 = "%d!"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x020d:
            return r11
        L_0x020e:
            java.lang.String r1 = m123410i(r11)
            java.lang.String[] r3 = new java.lang.String[r0]
            r3[r4] = r7
            com.google.android.apps.gsa.nga.engine.o.c.ah r5 = com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah.f211801a
            j$.util.Optional r3 = r11.mo72265g(r5, r3)
            java.lang.String[] r5 = new java.lang.String[r0]
            r5[r4] = r9
            com.google.common.b.gu r11 = r11.mo72262d(r5)
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0230
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x02aa
        L_0x0230:
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0244
            int r5 = r11.size()
            if (r5 == r2) goto L_0x0244
            r11.size()
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x02aa
        L_0x0244:
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L_0x0290
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0271
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r4] = r1
            java.lang.Object r11 = r11.get(r4)
            r5[r0] = r11
            java.lang.Object r11 = r3.get()
            r5[r2] = r11
            java.lang.String r11 = "%s %s %s%%"
            java.lang.String r11 = java.lang.String.format(r11, r5)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            goto L_0x02aa
        L_0x0271:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r11 = r11.get(r4)
            r1[r4] = r11
            java.lang.Object r11 = r3.get()
            r1[r0] = r11
            java.lang.String r11 = "%s %s%%"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            goto L_0x02aa
        L_0x0290:
            java.lang.Object[] r11 = new java.lang.Object[r2]
            r11[r4] = r1
            java.lang.Object r1 = r3.get()
            r11[r0] = r1
            java.lang.String r0 = "%s * %s%%"
            java.lang.String r11 = java.lang.String.format(r0, r11)
            com.google.android.libraries.assistant.g.c.d.a r0 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r0, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x02aa:
            return r11
        L_0x02ab:
            java.lang.String[] r1 = new java.lang.String[r0]
            r1[r4] = r9
            com.google.common.b.gu r1 = r11.mo72262d(r1)
            int r2 = r1.size()
            if (r2 == r0) goto L_0x02c1
            r1.size()
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x02f3
        L_0x02c1:
            java.lang.Object r0 = r1.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r11 = m123410i(r11)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x02ef
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x02d8
            goto L_0x02ef
        L_0x02d8:
            com.google.android.libraries.assistant.g.c.d.a r1 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r0.concat(r11)
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r1, r11)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            goto L_0x02f3
        L_0x02ef:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
        L_0x02f3:
            return r11
        L_0x02f4:
            java.lang.String r1 = m123409h(r11)
            java.lang.Boolean r11 = m123408g(r11)
            boolean r11 = r11.booleanValue()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x030b
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x0336
        L_0x030b:
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x0322
            if (r11 == 0) goto L_0x0320
            com.google.android.libraries.assistant.g.c.d.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17961a.f51423a
            java.lang.String r0 = "^2"
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r11, r0)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
            goto L_0x0336
        L_0x0320:
            java.lang.String r1 = "√"
        L_0x0322:
            com.google.android.libraries.assistant.g.c.d.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1491a.p1492a.C17962b.f51424a
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r1
            java.lang.String r1 = "%s("
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.google.android.libraries.assistant.g.c.b.a r11 = com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a.m35256b(r11, r0)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x0336:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6080a.C76802e.mo72333d(com.google.android.apps.gsa.nga.engine.o.c.bg):j$.util.Optional");
    }
}
