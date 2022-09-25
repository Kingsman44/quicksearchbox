package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33109e;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.assistant.p3897e.p3917i.p3918a.C51254ax;
import com.google.assistant.p3897e.p3917i.p3918a.C51460in;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60887da;
import com.google.p4152bb.p4153a.C55421x;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.t */
/* compiled from: PG */
public final class C33046t implements C33109e {

    /* renamed from: a */
    public static final C59071e f88489a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.t");

    /* renamed from: b */
    public C33144e f88490b;

    /* renamed from: c */
    public int f88491c = 7;

    /* renamed from: d */
    private final C60887da f88492d;

    /* renamed from: e */
    private final C60950i f88493e;

    public C33046t(C60887da daVar, C60950i iVar) {
        this.f88492d = daVar;
        this.f88493e = iVar;
    }

    /* renamed from: c */
    private static C55421x m61323c(C52091ex exVar) {
        Optional d = C33119g.m61468d(exVar);
        Optional e = C33119g.m61469e(exVar);
        C55421x xVar = C55421x.UNKNOWN_ACTION;
        if (!d.isPresent() || (((C51254ax) d.get()).f133436a & 1) == 0) {
            return (!e.isPresent() || (((C51460in) e.get()).f134054a & 1) == 0) ? xVar : C55421x.GENERIC_SEND_MESSAGE;
        }
        return C55421x.PHONE_CALL_CONTACT;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v77, resolved type: com.google.common.b.gu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v81, resolved type: com.google.common.b.gu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0376  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo38500a(android.content.Context r32, com.google.assistant.p3897e.p3921j.C52070ec r33, com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d r34) {
        /*
            r31 = this;
            r7 = r31
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r0 = r34.mo38533b()
            r7.f88490b = r0
            com.google.android.libraries.search.assistant.fluidactions.b.d r5 = r34.mo38532a()
            r1 = r33
            com.google.assistant.e.j.eb r0 = r1.f136655c
            if (r0 != 0) goto L_0x0014
            com.google.assistant.e.j.eb r0 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x0014:
            com.google.protobuf.cq r0 = r0.f136650a
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r2 = r0.hasNext()
            java.lang.String r3 = "ContactLookupFeatureClientOpResultProcessor"
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r0.next()
            com.google.assistant.e.j.kc r2 = (com.google.assistant.p3897e.p3921j.C52232kc) r2
            java.lang.String r4 = r2.f137065b
            java.lang.String r6 = "person_result"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x001a
            com.google.assistant.e.j.ka r4 = r2.f137066c
            if (r4 != 0) goto L_0x0038
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0038:
            java.lang.String r6 = "assistant.api.dialog_state.values.Person"
            java.lang.String r4 = r4.f137060b
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x001a
            com.google.assistant.e.j.ka r0 = r2.f137066c     // Catch:{ ct -> 0x0057 }
            if (r0 != 0) goto L_0x0048
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0057 }
        L_0x0048:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0057 }
            com.google.assistant.e.j.ade r2 = com.google.assistant.p3897e.p3921j.ade.f134877h     // Catch:{ ct -> 0x0057 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (com.google.protobuf.C63088z) r0)     // Catch:{ ct -> 0x0057 }
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0     // Catch:{ ct -> 0x0057 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x0057 }
            goto L_0x0074
        L_0x0057:
            r0 = move-exception
            com.google.common.f.e r2 = f88489a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r3)
            java.lang.String r4 = "Incompatible person proto implementations."
            r6 = 50724(0xc624, float:7.108E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r6)).mo56386p(r4)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0074
        L_0x0070:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0074:
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61313d(r33)
            com.google.assistant.e.j.ex r4 = r34.mo38534c()
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61468d(r4)
            com.google.assistant.e.j.ex r6 = r34.mo38534c()
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61469e(r6)
            boolean r8 = r0.isPresent()
            if (r8 != 0) goto L_0x0097
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x0097:
            boolean r4 = r4.isPresent()
            if (r4 != 0) goto L_0x00ad
            boolean r4 = r6.isPresent()
            if (r4 == 0) goto L_0x00a4
            goto L_0x00ad
        L_0x00a4:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00ad:
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x00c7
            java.lang.Object r4 = r2.get()
            com.google.assistant.e.j.pf r4 = (com.google.assistant.p3897e.p3921j.C52370pf) r4
            boolean r4 = r4.f137430d
            if (r4 != 0) goto L_0x00be
            goto L_0x00c7
        L_0x00be:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x00c7:
            com.google.assistant.e.j.ex r4 = r34.mo38534c()
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61468d(r4)
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61469e(r4)
            com.google.assistant.e.i.a.gn r8 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
            boolean r9 = r6.isPresent()
            r10 = 1
            if (r9 == 0) goto L_0x00f4
            java.lang.Object r9 = r6.get()
            com.google.assistant.e.i.a.ax r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51254ax) r9
            int r9 = r9.f133436a
            r9 = r9 & r10
            if (r9 == 0) goto L_0x00f4
            java.lang.Object r4 = r6.get()
            com.google.assistant.e.i.a.ax r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51254ax) r4
            com.google.assistant.e.i.a.gn r4 = r4.f133437b
            if (r4 != 0) goto L_0x0113
            com.google.assistant.e.i.a.gn r4 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
            goto L_0x0113
        L_0x00f4:
            boolean r6 = r4.isPresent()
            if (r6 == 0) goto L_0x0112
            java.lang.Object r6 = r4.get()
            com.google.assistant.e.i.a.in r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51460in) r6
            int r6 = r6.f134054a
            r6 = r6 & r10
            if (r6 == 0) goto L_0x0112
            java.lang.Object r4 = r4.get()
            com.google.assistant.e.i.a.in r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51460in) r4
            com.google.assistant.e.i.a.gn r4 = r4.f134055b
            if (r4 != 0) goto L_0x0113
            com.google.assistant.e.i.a.gn r4 = com.google.assistant.p3897e.p3917i.p3918a.C51406gn.f133887s
            goto L_0x0113
        L_0x0112:
            r4 = r8
        L_0x0113:
            r6 = 7
            r7.f88491c = r6
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33033g.m61299a(r4)
            boolean r9 = r8.isPresent()
            r11 = 2
            if (r9 == 0) goto L_0x0149
            java.lang.Object r8 = r8.get()
            com.google.assistant.e.i.a.av r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r8
            int r8 = r8.f133429a
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0149
            com.google.common.f.e r8 = f88489a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r3)
            java.lang.String r9 = "Set EndPointType to PHONE_NUMBER..."
            r12 = 50740(0xc634, float:7.1102E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r12)).mo56386p(r9)
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r8 = r7.f88490b
            r8.getClass()
            r8.mo38548a(r6)
            r7.f88491c = r11
        L_0x0149:
            j$.util.Optional r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61277h(r4)
            boolean r9 = r8.isPresent()
            r12 = 8
            r13 = 4
            if (r9 == 0) goto L_0x01c3
            java.lang.Object r8 = r8.get()
            com.google.assistant.e.i.a.il r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r8
            int r9 = r8.f134045a
            r9 = r9 & 32
            if (r9 == 0) goto L_0x01c3
            com.google.assistant.e.j.nk r8 = r8.f134051g
            if (r8 != 0) goto L_0x0168
            com.google.assistant.e.j.nk r8 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
        L_0x0168:
            java.lang.String r9 = r8.f137334g
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01c3
            com.google.assistant.e.j.pj r9 = r8.f137331d
            if (r9 != 0) goto L_0x0176
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0176:
            int r9 = r9.f137437b
            if (r9 != r10) goto L_0x017c
            r14 = 1
            goto L_0x01b9
        L_0x017c:
            com.google.assistant.e.j.pj r8 = r8.f137331d
            if (r8 != 0) goto L_0x0183
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0184
        L_0x0183:
            r9 = r8
        L_0x0184:
            int r9 = r9.f137437b
            r14 = 6
            if (r9 != r14) goto L_0x018a
            goto L_0x01b9
        L_0x018a:
            if (r8 != 0) goto L_0x018f
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x0190
        L_0x018f:
            r9 = r8
        L_0x0190:
            int r9 = r9.f137437b
            if (r9 != r13) goto L_0x0196
            r14 = 4
            goto L_0x01b9
        L_0x0196:
            if (r8 != 0) goto L_0x019b
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x019c
        L_0x019b:
            r9 = r8
        L_0x019c:
            int r9 = r9.f137437b
            if (r9 != r11) goto L_0x01a2
            r14 = 2
            goto L_0x01b9
        L_0x01a2:
            if (r8 != 0) goto L_0x01a7
            com.google.assistant.e.j.pj r9 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
            goto L_0x01a8
        L_0x01a7:
            r9 = r8
        L_0x01a8:
            int r9 = r9.f137437b
            r14 = 3
            if (r9 != r14) goto L_0x01ae
            goto L_0x01b9
        L_0x01ae:
            if (r8 != 0) goto L_0x01b2
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x01b2:
            int r8 = r8.f137437b
            r14 = 5
            if (r8 != r14) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r14 = 7
        L_0x01b9:
            r7.f88491c = r14
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r8 = r7.f88490b
            r8.getClass()
            r8.mo38548a(r12)
        L_0x01c3:
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.j.ade r0 = (com.google.assistant.p3897e.p3921j.ade) r0
            com.google.protobuf.cq r0 = r0.f134885g
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.p r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33042p.f88481a
            j$.util.stream.Stream r0 = r0.map(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r0 = r0.collect(r8)
            com.google.common.b.gu r0 = (com.google.common.p4522b.C58485gu) r0
            com.google.common.b.gu r8 = com.google.common.p4522b.C58485gu.m89845m()
            boolean r9 = r5.mo38387q()
            if (r9 == 0) goto L_0x024b
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            j$.util.Optional r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61313d(r33)
            boolean r9 = r1.isPresent()
            if (r9 == 0) goto L_0x0225
            java.lang.Object r9 = r1.get()
            com.google.assistant.e.j.pf r9 = (com.google.assistant.p3897e.p3921j.C52370pf) r9
            com.google.assistant.e.j.pn r9 = r9.f137427a
            if (r9 == 0) goto L_0x0225
            java.lang.Object r9 = r1.get()
            com.google.assistant.e.j.pf r9 = (com.google.assistant.p3897e.p3921j.C52370pf) r9
            com.google.assistant.e.j.pn r9 = r9.f137427a
            if (r9 != 0) goto L_0x0209
            com.google.assistant.e.j.pn r9 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0209:
            int r9 = r9.f137446a
            r9 = r9 & r10
            if (r9 == 0) goto L_0x0225
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.j.pf r1 = (com.google.assistant.p3897e.p3921j.C52370pf) r1
            com.google.assistant.e.j.pn r1 = r1.f137427a
            if (r1 != 0) goto L_0x021a
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x021a:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x0220
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0220:
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x0229
        L_0x0225:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x0229:
            boolean r9 = r1.isPresent()
            if (r9 == 0) goto L_0x026c
            java.lang.Object r1 = r1.get()
            com.google.assistant.e.j.ade r1 = (com.google.assistant.p3897e.p3921j.ade) r1
            com.google.protobuf.cq r1 = r1.f134885g
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.p r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33042p.f88481a
            j$.util.stream.Stream r1 = r1.map(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r8)
            r8 = r1
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
            goto L_0x026c
        L_0x024b:
            com.google.assistant.e.j.pn r1 = r4.f133895g
            if (r1 != 0) goto L_0x0251
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0251:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x0257
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0257:
            com.google.protobuf.cq r1 = r1.f134885g
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.p r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33042p.f88481a
            j$.util.stream.Stream r1 = r1.map(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r8)
            r8 = r1
            com.google.common.b.gu r8 = (com.google.common.p4522b.C58485gu) r8
        L_0x026c:
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            r1.mo55396h(r8)
            int r9 = r0.size()
            r15 = 0
            r16 = 0
        L_0x027a:
            if (r15 >= r9) goto L_0x05c6
            java.lang.Object r17 = r0.get(r15)
            r6 = r17
            com.google.assistant.e.j.yp r6 = (com.google.assistant.p3897e.p3921j.C52623yp) r6
            int r13 = r8.size()
            r12 = 0
            r19 = 0
        L_0x028b:
            if (r12 >= r13) goto L_0x0590
            java.lang.Object r20 = r8.get(r12)
            r11 = r20
            com.google.assistant.e.j.yp r11 = (com.google.assistant.p3897e.p3921j.C52623yp) r11
            com.google.protobuf.cq r10 = r6.f138166c
            com.google.protobuf.cq r14 = r11.f138166c
            boolean r22 = r10.isEmpty()
            if (r22 != 0) goto L_0x0571
            boolean r22 = r14.isEmpty()
            if (r22 == 0) goto L_0x02b4
            r22 = r0
            r27 = r8
            r28 = r9
            r30 = r13
            r0 = 0
            r17 = 4
            r18 = 8
            goto L_0x057e
        L_0x02b4:
            r22 = r0
            r0 = 0
            java.lang.Object r10 = r10.get(r0)
            com.google.assistant.e.j.yn r10 = (com.google.assistant.p3897e.p3921j.C52621yn) r10
            java.lang.String r10 = r10.f138158c
            java.lang.Object r14 = r14.get(r0)
            com.google.assistant.e.j.yn r14 = (com.google.assistant.p3897e.p3921j.C52621yn) r14
            java.lang.String r0 = r14.f138158c
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            if (r14 != 0) goto L_0x0564
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0564
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x02db
            goto L_0x0564
        L_0x02db:
            com.google.protobuf.cq r0 = r6.f138169f
            com.google.protobuf.cq r10 = r11.f138169f
            java.util.Iterator r0 = r0.iterator()
        L_0x02e3:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0412
            java.lang.Object r14 = r0.next()
            com.google.assistant.e.j.yv r14 = (com.google.assistant.p3897e.p3921j.C52629yv) r14
            java.util.Iterator r23 = r10.iterator()
            r24 = 0
        L_0x02f5:
            boolean r25 = r23.hasNext()
            if (r25 == 0) goto L_0x03ef
            java.lang.Object r25 = r23.next()
            r26 = r0
            r0 = r25
            com.google.assistant.e.j.yv r0 = (com.google.assistant.p3897e.p3921j.C52629yv) r0
            boolean r25 = r5.mo38387q()
            r20 = 1
            r25 = r25 ^ 1
            r27 = r8
            int r8 = r14.f138182a
            r21 = 2
            r8 = r8 & 2
            if (r8 == 0) goto L_0x031f
            int r8 = r0.f138182a
            r8 = r8 & 2
            if (r8 == 0) goto L_0x031f
            r8 = 1
            goto L_0x0320
        L_0x031f:
            r8 = 0
        L_0x0320:
            if (r8 == 0) goto L_0x0332
            r28 = r9
            java.lang.String r9 = r14.f138184c
            r29 = r10
            java.lang.String r10 = r0.f138184c
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0336
            r9 = 1
            goto L_0x0337
        L_0x0332:
            r28 = r9
            r29 = r10
        L_0x0336:
            r9 = 0
        L_0x0337:
            int r10 = r14.f138182a
            r18 = 8
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0353
            int r10 = r0.f138182a
            r10 = r10 & 8
            if (r10 == 0) goto L_0x0353
            java.lang.String r10 = r14.f138186e
            r30 = r13
            java.lang.String r13 = r0.f138186e
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x0355
            r10 = 1
            goto L_0x0356
        L_0x0353:
            r30 = r13
        L_0x0355:
            r10 = 0
        L_0x0356:
            int r13 = r14.f138182a
            r17 = 4
            r13 = r13 & 4
            if (r13 == 0) goto L_0x03de
            int r13 = r0.f138182a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x03de
            java.lang.String r13 = r14.f138185d
            java.lang.String r7 = r0.f138185d
            boolean r7 = r13.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x03de
            if (r8 == 0) goto L_0x03de
            if (r9 != 0) goto L_0x0374
            if (r10 == 0) goto L_0x03de
        L_0x0374:
            if (r25 == 0) goto L_0x03dc
            com.google.assistant.e.j.yr r7 = r14.f138183b
            if (r7 != 0) goto L_0x037c
            com.google.assistant.e.j.yr r7 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x037c:
            com.google.assistant.e.j.yd r7 = r7.f138174c
            if (r7 != 0) goto L_0x0382
            com.google.assistant.e.j.yd r7 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x0382:
            com.google.protobuf.cq r7 = r7.f138137a
            com.google.assistant.e.j.yr r0 = r0.f138183b
            if (r0 != 0) goto L_0x038a
            com.google.assistant.e.j.yr r0 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x038a:
            com.google.assistant.e.j.yd r0 = r0.f138174c
            if (r0 != 0) goto L_0x0390
            com.google.assistant.e.j.yd r0 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x0390:
            com.google.protobuf.cq r0 = r0.f138137a
            java.util.Iterator r7 = r7.iterator()
        L_0x0396:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x03dc
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.yz r8 = (com.google.assistant.p3897e.p3921j.C52633yz) r8
            java.util.Iterator r9 = r0.iterator()
            r10 = 0
        L_0x03a7:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x03d4
            java.lang.Object r13 = r9.next()
            com.google.assistant.e.j.yz r13 = (com.google.assistant.p3897e.p3921j.C52633yz) r13
            r25 = r0
            int r0 = r8.f138194a
            r21 = 2
            r0 = r0 & 2
            if (r0 == 0) goto L_0x03d1
            int r0 = r13.f138194a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x03d1
            java.lang.String r0 = r8.f138196c
            java.lang.String r13 = r13.f138196c
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x03d1
            r0 = r25
            r10 = 1
            goto L_0x03a7
        L_0x03d1:
            r0 = r25
            goto L_0x03a7
        L_0x03d4:
            r25 = r0
            if (r10 != 0) goto L_0x03d9
            goto L_0x03de
        L_0x03d9:
            r0 = r25
            goto L_0x0396
        L_0x03dc:
            r0 = 1
            goto L_0x03df
        L_0x03de:
            r0 = 0
        L_0x03df:
            r24 = r0 | r24
            r7 = r31
            r0 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r13 = r30
            goto L_0x02f5
        L_0x03ef:
            r26 = r0
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r13
            r18 = 8
            if (r24 != 0) goto L_0x0404
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = 0
            r17 = 4
            goto L_0x057e
        L_0x0404:
            r7 = r31
            r0 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r13 = r30
            goto L_0x02e3
        L_0x0412:
            r27 = r8
            r28 = r9
            r30 = r13
            r18 = 8
            com.google.assistant.e.j.yt r0 = r6.f138165b
            if (r0 != 0) goto L_0x0420
            com.google.assistant.e.j.yt r0 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x0420:
            com.google.protobuf.cq r0 = r0.f138179b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x055e
            com.google.assistant.e.j.yt r0 = r6.f138165b
            if (r0 != 0) goto L_0x042e
            com.google.assistant.e.j.yt r0 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x042e:
            com.google.protobuf.cq r0 = r0.f138179b
            r7 = 0
            java.lang.Object r0 = r0.get(r7)
            com.google.assistant.e.j.yj r0 = (com.google.assistant.p3897e.p3921j.C52617yj) r0
            com.google.protobuf.cq r0 = r0.f138148a
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x055e
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo38379i()
            boolean r0 = r5.mo38379i()
            if (r0 == 0) goto L_0x055b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.protobuf.cq r7 = r6.f138169f
            java.util.Iterator r7 = r7.iterator()
        L_0x0455:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0473
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.yv r8 = (com.google.assistant.p3897e.p3921j.C52629yv) r8
            com.google.assistant.e.j.yr r8 = r8.f138183b
            if (r8 != 0) goto L_0x0467
            com.google.assistant.e.j.yr r8 = com.google.assistant.p3897e.p3921j.C52625yr.f138170e
        L_0x0467:
            com.google.assistant.e.j.yd r8 = r8.f138174c
            if (r8 != 0) goto L_0x046d
            com.google.assistant.e.j.yd r8 = com.google.assistant.p3897e.p3921j.C52611yd.f138135b
        L_0x046d:
            com.google.protobuf.cq r8 = r8.f138137a
            r0.addAll(r8)
            goto L_0x0455
        L_0x0473:
            com.google.assistant.e.j.yt r7 = r6.f138165b
            if (r7 != 0) goto L_0x0479
            com.google.assistant.e.j.yt r7 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x0479:
            com.google.protobuf.cq r7 = r7.f138179b
            java.util.Iterator r7 = r7.iterator()
        L_0x047f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0491
            java.lang.Object r8 = r7.next()
            com.google.assistant.e.j.yj r8 = (com.google.assistant.p3897e.p3921j.C52617yj) r8
            com.google.protobuf.cq r8 = r8.f138148a
            r0.addAll(r8)
            goto L_0x047f
        L_0x0491:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.google.assistant.e.j.yt r8 = r11.f138165b
            if (r8 != 0) goto L_0x049c
            com.google.assistant.e.j.yt r8 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
        L_0x049c:
            com.google.protobuf.cq r8 = r8.f138179b
            java.util.Iterator r8 = r8.iterator()
        L_0x04a2:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04b4
            java.lang.Object r9 = r8.next()
            com.google.assistant.e.j.yj r9 = (com.google.assistant.p3897e.p3921j.C52617yj) r9
            com.google.protobuf.cq r9 = r9.f138148a
            r7.addAll(r9)
            goto L_0x04a2
        L_0x04b4:
            int r8 = r0.size()
            r9 = 0
        L_0x04b9:
            if (r9 >= r8) goto L_0x0558
            java.lang.Object r10 = r0.get(r9)
            com.google.assistant.e.j.yz r10 = (com.google.assistant.p3897e.p3921j.C52633yz) r10
            int r11 = r10.f138194a
            r13 = 4
            r11 = r11 & r13
            if (r11 == 0) goto L_0x0546
            int r11 = r7.size()
            r14 = 0
        L_0x04cc:
            if (r14 >= r11) goto L_0x055b
            java.lang.Object r17 = r7.get(r14)
            r23 = r0
            r0 = r17
            com.google.assistant.e.j.yz r0 = (com.google.assistant.p3897e.p3921j.C52633yz) r0
            r24 = r7
            int r7 = r10.f138194a
            r7 = r7 & r13
            if (r7 != 0) goto L_0x04e3
            r25 = r8
            r7 = 0
            goto L_0x04e6
        L_0x04e3:
            r25 = r8
            r7 = 1
        L_0x04e6:
            int r8 = r0.f138194a
            r8 = r8 & r13
            if (r8 != 0) goto L_0x04ed
            r13 = 0
            goto L_0x04ee
        L_0x04ed:
            r13 = 1
        L_0x04ee:
            if (r7 != r13) goto L_0x04f2
            r7 = 1
            goto L_0x04f3
        L_0x04f2:
            r7 = 0
        L_0x04f3:
            if (r8 == 0) goto L_0x0537
            com.google.assistant.e.j.yf r7 = r10.f138197d
            if (r7 != 0) goto L_0x04fb
            com.google.assistant.e.j.yf r7 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x04fb:
            com.google.assistant.e.j.yf r0 = r0.f138197d
            if (r0 != 0) goto L_0x0501
            com.google.assistant.e.j.yf r0 = com.google.assistant.p3897e.p3921j.C52613yf.f138138f
        L_0x0501:
            int r8 = r7.f138140a
            r13 = 1
            r8 = r8 & r13
            if (r8 == 0) goto L_0x0518
            int r8 = r0.f138140a
            r8 = r8 & r13
            if (r8 == 0) goto L_0x0518
            java.lang.String r8 = r7.f138141b
            java.lang.String r13 = r0.f138141b
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0518
            r8 = 1
            goto L_0x0519
        L_0x0518:
            r8 = 0
        L_0x0519:
            int r13 = r7.f138140a
            r17 = 4
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0535
            int r13 = r0.f138140a
            r13 = r13 & 4
            if (r13 == 0) goto L_0x0535
            java.lang.String r7 = r7.f138143d
            java.lang.String r0 = r0.f138143d
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0535
            if (r8 == 0) goto L_0x0535
            r7 = 1
            goto L_0x0539
        L_0x0535:
            r7 = 0
            goto L_0x0539
        L_0x0537:
            r17 = 4
        L_0x0539:
            int r14 = r14 + 1
            if (r7 == 0) goto L_0x053e
            goto L_0x054e
        L_0x053e:
            r0 = r23
            r7 = r24
            r8 = r25
            r13 = 4
            goto L_0x04cc
        L_0x0546:
            r23 = r0
            r24 = r7
            r25 = r8
            r17 = 4
        L_0x054e:
            int r9 = r9 + 1
            r0 = r23
            r7 = r24
            r8 = r25
            goto L_0x04b9
        L_0x0558:
            r17 = 4
            goto L_0x0562
        L_0x055b:
            r17 = 4
            goto L_0x057d
        L_0x055e:
            r17 = 4
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0562:
            r0 = 1
            goto L_0x057e
        L_0x0564:
            r27 = r8
            r28 = r9
            r30 = r13
            r17 = 4
            r18 = 8
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x057d
        L_0x0571:
            r22 = r0
            r27 = r8
            r28 = r9
            r30 = r13
            r17 = 4
            r18 = 8
        L_0x057d:
            r0 = 0
        L_0x057e:
            r19 = r0 | r19
            int r12 = r12 + 1
            r0 = r22
            r8 = r27
            r9 = r28
            r13 = r30
            r10 = 1
            r11 = 2
            r7 = r31
            goto L_0x028b
        L_0x0590:
            r22 = r0
            r27 = r8
            r28 = r9
            r17 = 4
            r18 = 8
            if (r19 != 0) goto L_0x05b4
            com.google.common.f.e r0 = f88489a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r7, r3)
            java.lang.String r7 = "person is unknown"
            r8 = 50719(0xc61f, float:7.1072E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56386p(r7)
            r1.mo55395g(r6)
            r16 = 1
        L_0x05b4:
            int r15 = r15 + 1
            r0 = r22
            r8 = r27
            r9 = r28
            r6 = 7
            r10 = 1
            r11 = 2
            r12 = 8
            r13 = 4
            r7 = r31
            goto L_0x027a
        L_0x05c6:
            if (r16 != 0) goto L_0x05e7
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r0 = r34.mo38533b()
            r1 = 2
            r0.mo38548a(r1)
            com.google.assistant.e.j.ex r2 = r34.mo38534c()
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            r1 = r31
            r3 = r4
            r4 = r5
            r5 = r32
            j$.util.Optional r0 = r1.mo38508b(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        L_0x05e7:
            boolean r0 = r5.mo38381k()
            if (r0 == 0) goto L_0x0738
            boolean r0 = r2.isPresent()
            if (r0 == 0) goto L_0x0738
            r7 = r31
            int r0 = r7.f88491c
            if (r0 == 0) goto L_0x0736
            r6 = 7
            if (r0 == r6) goto L_0x073a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.gu r0 = r1.mo55394f()
            java.lang.Object r1 = r2.get()
            com.google.assistant.e.j.pf r1 = (com.google.assistant.p3897e.p3921j.C52370pf) r1
            com.google.assistant.e.j.pn r1 = r1.f137427a
            if (r1 != 0) goto L_0x060e
            com.google.assistant.e.j.pn r1 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x060e:
            com.google.assistant.e.j.ade r1 = r1.f137449d
            if (r1 != 0) goto L_0x0614
            com.google.assistant.e.j.ade r1 = com.google.assistant.p3897e.p3921j.ade.f134877h
        L_0x0614:
            java.lang.String r1 = r1.f134883e
            com.google.common.v.i r1 = r7.f88493e
            java.lang.String r3 = r4.f133905q
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0660
            java.util.Locale r3 = java.util.Locale.US
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = "fa-contactlookup"
            r9 = 0
            r6[r9] = r8
            j$.time.Instant r1 = r1.mo57444a()
            long r8 = r1.toEpochMilli()
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r8 = 1
            r6[r8] = r1
            java.lang.String r1 = "%s-%d"
            java.lang.String r1 = java.lang.String.format(r3, r1, r6)
            com.google.protobuf.bn r3 = r4.toBuilder()
            com.google.assistant.e.i.a.fy r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51390fy) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.i.a.gn r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r6
            r1.getClass()
            int r8 = r6.f133889a
            r9 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r9
            r6.f133889a = r8
            r6.f133905q = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.assistant.e.i.a.gn r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51406gn) r1
            goto L_0x0661
        L_0x0660:
            r1 = r4
        L_0x0661:
            java.lang.String r1 = r1.f133905q
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.pf r2 = (com.google.assistant.p3897e.p3921j.C52370pf) r2
            com.google.assistant.e.j.ex r3 = r34.mo38534c()
            m61323c(r3)
            com.google.android.libraries.search.assistant.fluidactions.d.c.c r3 = new com.google.android.libraries.search.assistant.fluidactions.d.c.c
            r3.<init>()
            java.lang.String r6 = ""
            r3.f88675b = r6
            r3.f88676c = r6
            r3.f88677d = r6
            r3.f88678e = r6
            if (r1 == 0) goto L_0x072e
            r3.f88674a = r1
            com.google.common.b.gp r1 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.assistant.e.j.pn r6 = r2.f137427a
            if (r6 != 0) goto L_0x068e
            com.google.assistant.e.j.pn r8 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
            goto L_0x068f
        L_0x068e:
            r8 = r6
        L_0x068f:
            int r8 = r8.f137446a
            r8 = r8 & 16
            if (r8 == 0) goto L_0x06b4
            if (r6 != 0) goto L_0x0699
            com.google.assistant.e.j.pn r6 = com.google.assistant.p3897e.p3921j.C52378pn.f137444j
        L_0x0699:
            com.google.assistant.e.c.c.gh r2 = r6.f137451f
            if (r2 != 0) goto L_0x069f
            com.google.assistant.e.c.c.gh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x069f:
            int r6 = r2.f133012b
            r8 = 1
            if (r6 != r8) goto L_0x06a9
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x06ab
        L_0x06a9:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x06ab:
            java.lang.String r2 = r2.f132944b
            r1.mo55395g(r2)
            r1.mo55394f()
            goto L_0x06ce
        L_0x06b4:
            com.google.protobuf.cq r2 = r2.f137428b
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.h r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33034h.f88466a
            j$.util.stream.Stream r2 = r2.map(r6)
            j$.util.stream.Collector r6 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r6)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r1.mo55396h(r2)
            r1.mo55394f()
        L_0x06ce:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.k r6 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.k
            r6.<init>(r7, r3)
            com.google.common.util.concurrent.da r8 = r7.f88492d
            com.google.common.util.concurrent.s r6 = com.google.apps.tiktok.tracing.C47810es.m84966f(r6)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93045h(r2, r6, r8)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.l r6 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.l
            r6.<init>(r7, r3, r0, r1)
            com.google.common.util.concurrent.da r0 = r7.f88492d
            com.google.common.util.concurrent.s r6 = com.google.apps.tiktok.tracing.C47810es.m84966f(r6)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r2, r6, r0)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.m r2 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.m
            r2.<init>(r7, r3, r1)
            com.google.common.util.concurrent.da r1 = r7.f88492d
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r0, r2, r1)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.n r1 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.n
            r1.<init>(r7, r3)
            com.google.common.util.concurrent.da r2 = r7.f88492d
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r2)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.q r8 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.q
            r1 = r8
            r2 = r31
            r3 = r34
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.common.util.concurrent.da r1 = r7.f88492d
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r8)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93044g(r0, r2, r1)
            return r0
        L_0x072e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null sessionId"
            r0.<init>(r1)
            throw r0
        L_0x0736:
            r0 = 0
            throw r0
        L_0x0738:
            r7 = r31
        L_0x073a:
            com.google.common.f.e r0 = f88489a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            java.lang.String r1 = "Failed to disambiguate contact (AUM not enabled), fallback to server"
            r2 = 50717(0xc61d, float:7.107E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33046t.mo38500a(android.content.Context, com.google.assistant.e.j.ec, com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.d):com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: type inference failed for: r5v93, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r5v96, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0301, code lost:
        if (r6 != false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01df, code lost:
        if (r4 == com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE) goto L_0x01e1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x075d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p3186j$.util.Optional mo38508b(com.google.assistant.p3897e.p3921j.C52091ex r17, com.google.assistant.p3897e.p3917i.p3918a.C51406gn r18, com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d r19, android.content.Context r20, p3186j$.util.Optional r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            com.google.bb.a.x r2 = m61323c(r17)
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            com.google.assistant.e.j.e.fc r4 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
            int r5 = r1.f133889a
            r6 = 4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0027
            com.google.assistant.e.j.e.ff r4 = r1.f133892d
            if (r4 != 0) goto L_0x001d
            com.google.assistant.e.j.e.ff r4 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x001d:
            int r4 = r4.f136324h
            com.google.assistant.e.j.e.fc r4 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.m86447a(r4)
            if (r4 != 0) goto L_0x0027
            com.google.assistant.e.j.e.fc r4 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_DEFAULT
        L_0x0027:
            int r5 = r1.f133889a
            r7 = 2
            r5 = r5 & r7
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x00d5
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33033g.m61299a(r18)
            com.google.assistant.e.j.e.hb r10 = r1.f133891c
            if (r10 != 0) goto L_0x0039
            com.google.assistant.e.j.e.hb r10 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x0039:
            boolean r11 = r21.isPresent()
            if (r11 == 0) goto L_0x00c6
            java.lang.String r11 = r10.f136479b
            java.lang.Object r12 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r12 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r12
            java.lang.String r12 = r12.mo38540a()
            boolean r11 = r11.contains(r12)
            if (r11 != 0) goto L_0x00c6
            int r11 = r1.f133889a
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x007e
            com.google.protobuf.bn r5 = r10.toBuilder()
            com.google.assistant.e.j.e.gu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51995gu) r5
            com.google.assistant.e.i.a.gc r10 = r1.f133900l
            if (r10 != 0) goto L_0x0063
            com.google.assistant.e.i.a.gc r10 = com.google.assistant.p3897e.p3917i.p3918a.C51395gc.f133843d
        L_0x0063:
            java.lang.String r10 = r10.f133846b
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.assistant.e.j.e.hb r11 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r11
            r10.getClass()
            int r12 = r11.f136478a
            r12 = r12 | r9
            r11.f136478a = r12
            r11.f136479b = r10
            com.google.protobuf.bv r5 = r5.build()
            r10 = r5
            com.google.assistant.e.j.e.hb r10 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r10
            goto L_0x00c6
        L_0x007e:
            boolean r11 = r5.isPresent()
            if (r11 == 0) goto L_0x00c6
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.i.a.av r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r5
            int r5 = r5.f133429a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x00c6
            com.google.protobuf.bn r5 = r10.toBuilder()
            com.google.assistant.e.j.e.gu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51995gu) r5
            android.content.res.Resources r10 = r20.getResources()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Object r12 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r12 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r12
            java.lang.String r12 = r12.mo38540a()
            r11[r8] = r12
            r12 = 2132085213(0x7f1509dd, float:1.9810618E38)
            java.lang.String r10 = r10.getString(r12, r11)
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.assistant.e.j.e.hb r11 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r11
            r10.getClass()
            int r12 = r11.f136478a
            r12 = r12 | r9
            r11.f136478a = r12
            r11.f136479b = r10
            com.google.protobuf.bv r5 = r5.build()
            r10 = r5
            com.google.assistant.e.j.e.hb r10 = (com.google.assistant.p3897e.p3921j.p3926e.C52003hb) r10
        L_0x00c6:
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61452k(r10)
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61456o(r5, r4)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r10, r5)
        L_0x00d5:
            int r5 = r1.f133889a
            r5 = r5 & r9
            java.lang.String r10 = "ContactLookupFeatureClientOpResultProcessor"
            if (r5 == 0) goto L_0x014a
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33033g.m61299a(r18)
            com.google.assistant.e.j.e.hb r11 = r1.f133891c
            if (r11 != 0) goto L_0x00e6
            com.google.assistant.e.j.e.hb r11 = com.google.assistant.p3897e.p3921j.p3926e.C52003hb.f136476i
        L_0x00e6:
            int r12 = r1.f133889a
            r12 = r12 & r7
            if (r12 == 0) goto L_0x011b
            boolean r12 = r21.isPresent()
            if (r12 == 0) goto L_0x011b
            java.lang.String r11 = r11.f136479b
            java.lang.Object r12 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r12 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r12
            java.lang.String r12 = r12.mo38540a()
            boolean r11 = r11.contains(r12)
            if (r11 != 0) goto L_0x011b
            int r11 = r1.f133889a
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x010a
            goto L_0x014a
        L_0x010a:
            boolean r11 = r5.isPresent()
            if (r11 == 0) goto L_0x011b
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.i.a.av r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r5
            int r5 = r5.f133429a
            r5 = r5 & r9
            if (r5 != 0) goto L_0x014a
        L_0x011b:
            int r5 = r1.f133889a
            r5 = r5 & r9
            if (r5 == 0) goto L_0x014a
            com.google.common.f.e r5 = f88489a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r11, r10)
            java.lang.String r11 = "created client op TtsOutput"
            r12 = 50737(0xc631, float:7.1098E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r12)).mo56386p(r11)
            com.google.assistant.e.j.aos r5 = r1.f133890b
            if (r5 != 0) goto L_0x0139
            com.google.assistant.e.j.aos r5 = com.google.assistant.p3897e.p3921j.aos.f135519e
        L_0x0139:
            java.lang.String r11 = "speech_output_args"
            java.lang.String r12 = "assistant.api.client_op.SpeechOutputArgs"
            java.lang.String r13 = "tts.OUTPUT"
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r13, r5, r11, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r11, r5)
        L_0x014a:
            int r5 = r1.f133889a
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0177
            com.google.common.f.e r5 = f88489a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r11, r10)
            java.lang.String r11 = "created client op ShowNativeForm"
            r12 = 50733(0xc62d, float:7.1092E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r12)).mo56386p(r11)
            com.google.assistant.e.j.e.ff r5 = r1.f133892d
            if (r5 != 0) goto L_0x0168
            com.google.assistant.e.j.e.ff r5 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
        L_0x0168:
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r5)
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61456o(r5, r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r5, r4)
        L_0x0177:
            int r4 = r1.f133889a
            r4 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x01a7
            com.google.common.f.e r4 = f88489a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            java.lang.String r5 = "created client op RequestPermission"
            r11 = 50732(0xc62c, float:7.109E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r5)
            com.google.assistant.e.j.rt r4 = r1.f133903o
            if (r4 != 0) goto L_0x0196
            com.google.assistant.e.j.rt r4 = com.google.assistant.p3897e.p3921j.C52438rt.f137645h
        L_0x0196:
            java.lang.String r5 = "device_request_permission_args"
            java.lang.String r11 = "assistant.api.client_op.DeviceRequestPermissionArgs"
            java.lang.String r12 = "device.REQUEST_PERMISSION"
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r12, r4, r5, r11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r5, r4)
        L_0x01a7:
            java.util.Collection r4 = r3.mo54949B()
            java.util.Iterator r4 = r4.iterator()
        L_0x01af:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ee
            java.lang.Object r5 = r4.next()
            com.google.assistant.e.j.dy r5 = (com.google.assistant.p3897e.p3921j.C51809dy) r5
            java.lang.String r5 = r5.f135936b
            java.lang.String r11 = "ui.SHOW_NATIVE_FORM"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L_0x01af
            int r4 = r1.f133894f
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r4)
            if (r4 != 0) goto L_0x01cf
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x01cf:
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            if (r4 == r5) goto L_0x01e1
            int r4 = r1.f133894f
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r4)
            if (r4 != 0) goto L_0x01dd
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x01dd:
            com.google.assistant.e.i.a.gi r5 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE
            if (r4 != r5) goto L_0x01ee
        L_0x01e1:
            com.google.assistant.e.j.e.o r4 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61448g(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r5, r4)
        L_0x01ee:
            int r4 = r1.f133889a
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0219
            com.google.common.f.e r4 = f88489a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            java.lang.String r5 = "StartDictationArgs is present."
            r11 = 50736(0xc630, float:7.1096E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r11)).mo56386p(r5)
            com.google.protos.f.b.b.a.n r4 = r1.f133906r
            if (r4 != 0) goto L_0x020e
            com.google.protos.f.b.b.a.n r4 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n
        L_0x020e:
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61453l(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r3.mo54920x(r5, r4)
        L_0x0219:
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61277h(r18)
            boolean r5 = r4.isPresent()
            r12 = 10
            r13 = 6
            if (r5 == 0) goto L_0x04db
            java.lang.Object r5 = r4.get()
            com.google.assistant.e.i.a.il r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r5
            int r5 = r5.f134045a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x04db
            java.lang.Object r4 = r4.get()
            com.google.assistant.e.i.a.il r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51458il) r4
            com.google.assistant.e.j.nk r4 = r4.f134051g
            if (r4 != 0) goto L_0x023e
            com.google.assistant.e.j.nk r4 = com.google.assistant.p3897e.p3921j.C52321nk.f137326j
        L_0x023e:
            boolean r5 = r21.isPresent()
            if (r5 == 0) goto L_0x0251
            boolean r5 = r19.mo38381k()
            if (r5 != 0) goto L_0x0251
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            goto L_0x072a
        L_0x0251:
            com.google.common.f.e r5 = f88489a
            com.google.common.f.x r14 = r5.mo56224b()
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r15, r10)
            java.lang.String r15 = "chat_message.SEND ClientOp args is present"
            r6 = 50754(0xc642, float:7.1122E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r6)).mo56386p(r15)
            java.lang.String r6 = r4.f137334g
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0284
            int r6 = r4.f137328a
            if (r6 != r12) goto L_0x0271
            goto L_0x0284
        L_0x0271:
            com.google.common.f.x r4 = r5.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            java.lang.String r5 = "Not creating client op chat_message.SEND, text string was empty"
            r6 = 50756(0xc644, float:7.1124E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            goto L_0x04db
        L_0x0284:
            boolean r6 = r21.isPresent()
            if (r6 == 0) goto L_0x049b
            java.lang.Object r6 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r6 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r6
            java.lang.String r6 = r6.mo38541b()
            int r14 = r0.f88491c
            int r15 = r14 + -1
            if (r14 == 0) goto L_0x0499
            r14 = 5
            java.lang.String r12 = ""
            if (r15 == 0) goto L_0x02e3
            if (r15 == r9) goto L_0x02c4
            if (r15 == r14) goto L_0x02a5
            goto L_0x0305
        L_0x02a5:
            com.google.assistant.e.j.pj r15 = r4.f137331d
            if (r15 != 0) goto L_0x02ab
            com.google.assistant.e.j.pj r15 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02ab:
            int r15 = r15.f137437b
            if (r15 != r13) goto L_0x0305
            com.google.assistant.e.j.pj r15 = r4.f137331d
            if (r15 != 0) goto L_0x02b5
            com.google.assistant.e.j.pj r15 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02b5:
            int r8 = r15.f137437b
            if (r8 != r13) goto L_0x02be
            java.lang.Object r8 = r15.f137438c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x02bf
        L_0x02be:
            r8 = r12
        L_0x02bf:
            boolean r6 = com.google.common.base.C58890d.m90990e(r8, r6)
            goto L_0x0301
        L_0x02c4:
            com.google.assistant.e.j.pj r8 = r4.f137331d
            if (r8 != 0) goto L_0x02ca
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02ca:
            int r8 = r8.f137437b
            if (r8 != r7) goto L_0x0305
            com.google.assistant.e.j.pj r8 = r4.f137331d
            if (r8 != 0) goto L_0x02d4
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02d4:
            int r15 = r8.f137437b
            if (r15 != r7) goto L_0x02dd
            java.lang.Object r8 = r8.f137438c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x02de
        L_0x02dd:
            r8 = r12
        L_0x02de:
            boolean r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61318i(r8, r6)
            goto L_0x0301
        L_0x02e3:
            com.google.assistant.e.j.pj r8 = r4.f137331d
            if (r8 != 0) goto L_0x02e9
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02e9:
            int r8 = r8.f137437b
            if (r8 != r9) goto L_0x0305
            com.google.assistant.e.j.pj r8 = r4.f137331d
            if (r8 != 0) goto L_0x02f3
            com.google.assistant.e.j.pj r8 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x02f3:
            int r15 = r8.f137437b
            if (r15 != r9) goto L_0x02fc
            java.lang.Object r8 = r8.f137438c
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x02fd
        L_0x02fc:
            r8 = r12
        L_0x02fd:
            boolean r6 = r8.equals(r6)
        L_0x0301:
            if (r6 == 0) goto L_0x0305
            goto L_0x049b
        L_0x0305:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r6 = r0.f88490b
            r6.getClass()
            r6.mo38548a(r14)
            java.lang.Object r6 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r6 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r6
            com.google.protobuf.bn r8 = r4.toBuilder()
            com.google.assistant.e.j.my r8 = (com.google.assistant.p3897e.p3921j.C52308my) r8
            com.google.assistant.e.j.pj r15 = r4.f137330c
            if (r15 == 0) goto L_0x0326
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.nk r11 = (com.google.assistant.p3897e.p3921j.C52321nk) r11
            r11.f137330c = r15
        L_0x0326:
            com.google.assistant.e.c.c.gh r11 = r4.f137333f
            if (r11 == 0) goto L_0x03c4
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.assistant.e.c.c.gg r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r11
            java.lang.String r15 = r6.mo38543d()
            java.lang.String r7 = "com.google.android.googlequicksearchbox.sms"
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0374
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            int r15 = r7.f133012b
            if (r15 != r9) goto L_0x0349
            java.lang.Object r7 = r7.f133013c
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            goto L_0x034b
        L_0x0349:
            com.google.assistant.e.c.c.ev r7 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x034b:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.c.c.es r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r15 = r7.instance
            com.google.assistant.e.c.c.ev r15 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r15
            int r13 = r15.f132943a
            r13 = r13 | r9
            r15.f132943a = r13
            r15.f132944b = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.gh r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r12
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r7.getClass()
            r12.f133013c = r7
            r12.f133012b = r9
            goto L_0x03b2
        L_0x0374:
            com.google.protobuf.bv r7 = r11.instance
            com.google.assistant.e.c.c.gh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r7
            int r12 = r7.f133012b
            if (r12 != r9) goto L_0x0381
            java.lang.Object r7 = r7.f133013c
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            goto L_0x0383
        L_0x0381:
            com.google.assistant.e.c.c.ev r7 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0383:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.c.c.es r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r7
            java.lang.String r12 = r6.mo38543d()
            r7.copyOnWrite()
            com.google.protobuf.bv r13 = r7.instance
            com.google.assistant.e.c.c.ev r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r13
            r12.getClass()
            int r15 = r13.f132943a
            r15 = r15 | r9
            r13.f132943a = r15
            r13.f132944b = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.gh r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r12
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r7.getClass()
            r12.f133013c = r7
            r12.f133012b = r9
        L_0x03b2:
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.nk r7 = (com.google.assistant.p3897e.p3921j.C52321nk) r7
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.c.c.gh r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r11
            r11.getClass()
            r7.f137333f = r11
        L_0x03c4:
            java.lang.String r7 = r4.f137334g
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.nk r11 = (com.google.assistant.p3897e.p3921j.C52321nk) r11
            r7.getClass()
            r11.f137334g = r7
            int r7 = r0.f88491c
            int r11 = r7 + -1
            if (r7 == 0) goto L_0x0497
            if (r11 == 0) goto L_0x0455
            if (r11 == r9) goto L_0x0423
            if (r11 == r14) goto L_0x03f1
            com.google.common.f.x r6 = r5.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r10)
            java.lang.String r7 = "Unknown endPointType."
            r11 = 50710(0xc616, float:7.106E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r11)).mo56386p(r7)
            goto L_0x0485
        L_0x03f1:
            com.google.assistant.e.j.pj r7 = r4.f137331d
            if (r7 != 0) goto L_0x03f7
            com.google.assistant.e.j.pj r7 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x03f7:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.j.pi r7 = (com.google.assistant.p3897e.p3921j.C52373pi) r7
            java.lang.String r6 = r6.mo38541b()
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.assistant.e.j.pj r11 = (com.google.assistant.p3897e.p3921j.C52374pj) r11
            r6.getClass()
            r12 = 6
            r11.f137437b = r12
            r11.f137438c = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.pj r7 = (com.google.assistant.p3897e.p3921j.C52374pj) r7
            r7.getClass()
            r6.f137331d = r7
            goto L_0x0485
        L_0x0423:
            com.google.assistant.e.j.pj r7 = r4.f137331d
            if (r7 != 0) goto L_0x0429
            com.google.assistant.e.j.pj r7 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x0429:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.j.pi r7 = (com.google.assistant.p3897e.p3921j.C52373pi) r7
            java.lang.String r6 = r6.mo38541b()
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.assistant.e.j.pj r11 = (com.google.assistant.p3897e.p3921j.C52374pj) r11
            r6.getClass()
            r12 = 2
            r11.f137437b = r12
            r11.f137438c = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.pj r7 = (com.google.assistant.p3897e.p3921j.C52374pj) r7
            r7.getClass()
            r6.f137331d = r7
            goto L_0x0485
        L_0x0455:
            com.google.assistant.e.j.pj r7 = r4.f137331d
            if (r7 != 0) goto L_0x045b
            com.google.assistant.e.j.pj r7 = com.google.assistant.p3897e.p3921j.C52374pj.f137434e
        L_0x045b:
            com.google.protobuf.bn r7 = r7.toBuilder()
            com.google.assistant.e.j.pi r7 = (com.google.assistant.p3897e.p3921j.C52373pi) r7
            java.lang.String r6 = r6.mo38541b()
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.assistant.e.j.pj r11 = (com.google.assistant.p3897e.p3921j.C52374pj) r11
            r6.getClass()
            r11.f137437b = r9
            r11.f137438c = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.pj r7 = (com.google.assistant.p3897e.p3921j.C52374pj) r7
            r7.getClass()
            r6.f137331d = r7
        L_0x0485:
            boolean r4 = r4.f137335h
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.nk r6 = (com.google.assistant.p3897e.p3921j.C52321nk) r6
            r6.f137335h = r4
            com.google.protobuf.bv r4 = r8.build()
            com.google.assistant.e.j.nk r4 = (com.google.assistant.p3897e.p3921j.C52321nk) r4
            goto L_0x04a4
        L_0x0497:
            r4 = 0
            throw r4
        L_0x0499:
            r4 = 0
            throw r4
        L_0x049b:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r6 = r0.f88490b
            r6.getClass()
            r7 = 6
            r6.mo38548a(r7)
        L_0x04a4:
            boolean r6 = r21.isPresent()
            if (r6 == 0) goto L_0x04bd
            if (r2 == 0) goto L_0x04bd
            boolean r6 = r19.mo38381k()
            if (r6 == 0) goto L_0x04bd
            com.google.bj.c.e.f r6 = com.google.p4184bj.p4193c.p4200e.C55998f.UNKNOWN
            java.lang.Object r6 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r6 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r6
            r6.mo38544e()
        L_0x04bd:
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61450i(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.mo54920x(r7, r4)
            com.google.common.f.x r4 = r5.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r10)
            java.lang.String r5 = "Created client op chat_message.SEND"
            r7 = 50755(0xc643, float:7.1123E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r5)
            goto L_0x04dc
        L_0x04db:
            r6 = 0
        L_0x04dc:
            int r4 = r1.f133889a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x04f3
            com.google.assistant.e.j.zt r4 = r1.f133893e
            if (r4 != 0) goto L_0x04e8
            com.google.assistant.e.j.zt r4 = com.google.assistant.p3897e.p3921j.C52654zt.f138233e
        L_0x04e8:
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61449h(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3.mo54920x(r5, r4)
        L_0x04f3:
            j$.util.Optional r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33033g.m61299a(r18)
            boolean r5 = r4.isPresent()
            if (r5 != 0) goto L_0x04ff
            goto L_0x0679
        L_0x04ff:
            java.lang.Object r5 = r4.get()
            com.google.assistant.e.i.a.av r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r5
            java.lang.Object r4 = r4.get()
            com.google.assistant.e.i.a.av r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r4
            int r4 = r4.f133429a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x063e
            com.google.common.f.e r4 = f88489a
            com.google.common.f.x r7 = r4.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r10)
            java.lang.String r8 = "Call ClientOp args is present"
            r11 = 50729(0xc629, float:7.1086E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r11)).mo56386p(r8)
            com.google.assistant.e.j.mf r5 = r5.f133430b
            if (r5 != 0) goto L_0x0529
            com.google.assistant.e.j.mf r5 = com.google.assistant.p3897e.p3921j.C52289mf.f137258j
        L_0x0529:
            boolean r7 = r21.isPresent()
            if (r7 == 0) goto L_0x05ff
            java.lang.String r7 = r5.f137262c
            java.lang.Object r8 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r8 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r8
            java.lang.String r8 = r8.mo38541b()
            boolean r7 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33036j.m61318i(r7, r8)
            if (r7 != 0) goto L_0x05ff
            com.google.common.f.x r7 = r4.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r10)
            java.lang.String r8 = "Update CallArgs to apply AUM resolved results."
            r11 = 50731(0xc62b, float:7.1089E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r11)).mo56386p(r8)
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r7 = r0.f88490b
            r7.getClass()
            r8 = 3
            r7.mo38548a(r8)
            java.lang.Object r7 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r7 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r7
            com.google.assistant.e.j.mf r8 = com.google.assistant.p3897e.p3921j.C52289mf.f137258j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.mc r8 = (com.google.assistant.p3897e.p3921j.C52286mc) r8
            java.lang.String r7 = r7.mo38541b()
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.mf r11 = (com.google.assistant.p3897e.p3921j.C52289mf) r11
            r7.getClass()
            r11.f137262c = r7
            int r7 = r0.f88491c
            switch(r7) {
                case 1: goto L_0x0593;
                case 2: goto L_0x0590;
                case 3: goto L_0x058d;
                case 4: goto L_0x058a;
                case 5: goto L_0x0587;
                case 6: goto L_0x0584;
                case 7: goto L_0x0581;
                default: goto L_0x057e;
            }
        L_0x057e:
            java.lang.String r11 = "null"
            goto L_0x0595
        L_0x0581:
            java.lang.String r11 = "EMPTY"
            goto L_0x0595
        L_0x0584:
            java.lang.String r11 = "APP_UNIQUE_ID"
            goto L_0x0595
        L_0x0587:
            java.lang.String r11 = "GAIA_ID"
            goto L_0x0595
        L_0x058a:
            java.lang.String r11 = "DEVICE_ID"
            goto L_0x0595
        L_0x058d:
            java.lang.String r11 = "USERNAME"
            goto L_0x0595
        L_0x0590:
            java.lang.String r11 = "PHONE_NUMBER"
            goto L_0x0595
        L_0x0593:
            java.lang.String r11 = "EMAIL"
        L_0x0595:
            if (r7 == 0) goto L_0x05fd
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.e.j.mf r7 = (com.google.assistant.p3897e.p3921j.C52289mf) r7
            r7.f137263d = r11
            boolean r7 = r5.f137268i
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.mf r11 = (com.google.assistant.p3897e.p3921j.C52289mf) r11
            r11.f137268i = r7
            boolean r7 = r5.f137265f
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.mf r11 = (com.google.assistant.p3897e.p3921j.C52289mf) r11
            r11.f137265f = r7
            boolean r7 = r5.f137264e
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.j.mf r11 = (com.google.assistant.p3897e.p3921j.C52289mf) r11
            r11.f137264e = r7
            int r7 = r5.f137260a
            r11 = 6
            if (r7 != r11) goto L_0x05d9
            java.lang.Object r5 = r5.f137261b
            com.google.assistant.e.c.c.gh r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r5
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.mf r6 = (com.google.assistant.p3897e.p3921j.C52289mf) r6
            r5.getClass()
            r6.f137261b = r5
            r6.f137260a = r11
            goto L_0x05f6
        L_0x05d9:
            r11 = 10
            if (r7 != r11) goto L_0x05e6
            java.lang.Object r5 = r5.f137261b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x05e7
        L_0x05e6:
            r5 = 0
        L_0x05e7:
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.assistant.e.j.mf r6 = (com.google.assistant.p3897e.p3921j.C52289mf) r6
            r6.f137260a = r11
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r6.f137261b = r5
        L_0x05f6:
            com.google.protobuf.bv r5 = r8.build()
            com.google.assistant.e.j.mf r5 = (com.google.assistant.p3897e.p3921j.C52289mf) r5
            goto L_0x0608
        L_0x05fd:
            r5 = 0
            throw r5
        L_0x05ff:
            com.google.android.libraries.search.assistant.fluidactions.d.c.e r6 = r0.f88490b
            r6.getClass()
            r7 = 4
            r6.mo38548a(r7)
        L_0x0608:
            boolean r6 = r21.isPresent()
            if (r6 == 0) goto L_0x0621
            if (r2 == 0) goto L_0x0621
            boolean r2 = r19.mo38381k()
            if (r2 == 0) goto L_0x0621
            com.google.bj.c.e.f r2 = com.google.p4184bj.p4193c.p4200e.C55998f.UNKNOWN
            java.lang.Object r2 = r21.get()
            com.google.android.libraries.search.assistant.fluidactions.d.c.b r2 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33141b) r2
            r2.mo38544e()
        L_0x0621:
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61442a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3.mo54920x(r5, r2)
            com.google.common.f.x r2 = r4.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r10)
            java.lang.String r4 = "created client op call.Call"
            r5 = 50730(0xc62a, float:7.1088E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0679
        L_0x063e:
            int r2 = r5.f133429a
            r4 = 2
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0679
            com.google.common.f.e r2 = f88489a
            com.google.common.f.x r4 = r2.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r6, r10)
            java.lang.String r6 = "VideoCall ClientOp args is present"
            r7 = 50727(0xc627, float:7.1084E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r6)
            com.google.assistant.e.j.apn r4 = r5.f133431c
            if (r4 != 0) goto L_0x065d
            com.google.assistant.e.j.apn r4 = com.google.assistant.p3897e.p3921j.apn.f135563g
        L_0x065d:
            com.google.assistant.e.j.dy r4 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61455n(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3.mo54920x(r5, r4)
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r10)
            java.lang.String r4 = "Creating client op VideoCall"
            r5 = 50728(0xc628, float:7.1085E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
        L_0x0679:
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33033g.m61299a(r18)
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x06f6
            java.lang.Object r4 = r2.get()
            com.google.assistant.e.i.a.av r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r4
            int r4 = r4.f133429a
            r5 = 4
            r4 = r4 & r5
            if (r4 == 0) goto L_0x06f6
            boolean r4 = r19.mo38385o()
            if (r4 != 0) goto L_0x0696
            goto L_0x06af
        L_0x0696:
            boolean r4 = r21.isPresent()
            if (r4 == 0) goto L_0x06b5
            com.google.common.f.e r2 = f88489a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r10)
            java.lang.String r3 = "Does not support applying AUM result to provider.OPEN ClientOp"
            r4 = 50753(0xc641, float:7.112E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x06af:
            com.google.common.b.bb r3 = new com.google.common.b.bb
            r3.<init>()
            goto L_0x072a
        L_0x06b5:
            com.google.common.f.e r4 = f88489a
            com.google.common.f.x r5 = r4.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r10)
            java.lang.String r6 = "provider.OPEN ClientOp args is present"
            r7 = 50751(0xc63f, float:7.1117E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.i.a.av r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51252av) r2
            com.google.assistant.e.j.ada r2 = r2.f133432d
            if (r2 != 0) goto L_0x06d4
            com.google.assistant.e.j.ada r2 = com.google.assistant.p3897e.p3921j.ada.f134865f
        L_0x06d4:
            java.lang.String r5 = "open_provider_args"
            java.lang.String r6 = "assistant.api.client_op.OpenProviderArgs"
            java.lang.String r7 = "provider.OPEN"
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61446e(r7, r2, r5, r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3.mo54920x(r5, r2)
            com.google.common.f.x r2 = r4.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r10)
            java.lang.String r4 = "Creating client op provider.OPEN"
            r5 = 50752(0xc640, float:7.1119E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
        L_0x06f6:
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33027bv.m61277h(r18)
            boolean r2 = r2.isPresent()
            if (r2 != 0) goto L_0x0713
            int r2 = r1.f133889a
            r4 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0713
            com.google.assistant.e.j.dy r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61447f()
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.mo54920x(r4, r2)
        L_0x0713:
            java.util.Collection r2 = r3.mo54949B()
            java.util.Iterator r2 = r2.iterator()
        L_0x071b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x072a
            java.lang.Object r4 = r2.next()
            com.google.assistant.e.j.dy r4 = (com.google.assistant.p3897e.p3921j.C51809dy) r4
            java.lang.String r4 = r4.f135936b
            goto L_0x071b
        L_0x072a:
            boolean r2 = r3.mo54954G()
            if (r2 != 0) goto L_0x075d
            int r2 = r1.f133894f
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r2)
            if (r2 != 0) goto L_0x073a
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x073a:
            com.google.assistant.e.i.a.gi r4 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.FULFILLMENT
            if (r2 == r4) goto L_0x0750
            int r1 = r1.f133894f
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.m86175a(r1)
            if (r1 != 0) goto L_0x0748
            com.google.assistant.e.i.a.gi r1 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.CONTROLLER_STATE_UNKNOWN
        L_0x0748:
            com.google.assistant.e.i.a.gi r2 = com.google.assistant.p3897e.p3917i.p3918a.C51401gi.TERMINATE
            if (r1 != r2) goto L_0x074d
            goto L_0x0750
        L_0x074d:
            r1 = r17
            goto L_0x0754
        L_0x0750:
            com.google.assistant.e.j.ex r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61465a(r17)
        L_0x0754:
            com.google.assistant.e.j.en r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61460a(r3, r1)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            return r1
        L_0x075d:
            com.google.common.f.e r1 = f88489a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r10)
            java.lang.String r2 = "FA failed to fulfill ContactLookup on-device."
            r3 = 50723(0xc623, float:7.1078E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a.C33046t.mo38508b(com.google.assistant.e.j.ex, com.google.assistant.e.i.a.gn, com.google.android.libraries.search.assistant.fluidactions.b.d, android.content.Context, j$.util.Optional):j$.util.Optional");
    }
}
