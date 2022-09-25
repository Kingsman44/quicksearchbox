package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52496tx;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.m */
/* compiled from: PG */
public final class C11189m {

    /* renamed from: b */
    private static final C59071e f36590b = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.m");

    /* renamed from: a */
    public C51953ff f36591a;

    /* renamed from: c */
    private final C52507uh f36592c;

    public C11189m(C51953ff ffVar, C52507uh uhVar) {
        this.f36591a = ffVar;
        this.f36592c = uhVar;
    }

    /* renamed from: a */
    public static C51953ff m26517a(C51953ff ffVar) {
        C51030du duVar;
        C58833ax g = C11222q.m26610g("location", ffVar);
        if (!g.mo56113h()) {
            return ffVar;
        }
        C51941eu euVar = (C51941eu) g.mo56107c();
        if (euVar.f136277e == 6) {
            duVar = (C51030du) euVar.f136278f;
        } else {
            duVar = C51030du.f132868g;
        }
        C51030du d = m26519d(duVar);
        C51937eq eqVar = (C51937eq) ((C51941eu) g.mo56107c()).toBuilder();
        C51021dl dlVar = (C51021dl) d.toBuilder();
        dlVar.copyOnWrite();
        C51030du duVar2 = (C51030du) dlVar.instance;
        duVar2.f132874e = null;
        duVar2.f132870a &= -17;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        C51030du duVar3 = (C51030du) dlVar.build();
        duVar3.getClass();
        euVar2.f136278f = duVar3;
        euVar2.f136277e = 6;
        return C11222q.m26609f((C51941eu) eqVar.build(), C58836b.f156633a, ffVar);
    }

    /* renamed from: c */
    public static boolean m26518c(C52490tr trVar) {
        C52496tx txVar;
        if (!trVar.f137800d.equals("location_picker")) {
            return false;
        }
        if (trVar.f137798b == 7) {
            txVar = (C52496tx) trVar.f137799c;
        } else {
            txVar = C52496tx.f137813c;
        }
        return (txVar.f137815a & 1) != 0;
    }

    /* renamed from: d */
    private static C51030du m26519d(C51030du duVar) {
        C51021dl dlVar = (C51021dl) duVar.toBuilder();
        dlVar.copyOnWrite();
        ((C51030du) dlVar.instance).f132875f = C51030du.emptyProtobufList();
        dlVar.mo53501b((List) Collection.EL.stream(duVar.f132875f).map(C11187k.f36588a).collect(Collectors.toList()));
        return (C51030du) dlVar.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: com.google.assistant.e.j.ka} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.assistant.p3897e.p3921j.p3926e.C51953ff mo19615b() {
        /*
            r12 = this;
            com.google.assistant.e.j.uh r0 = r12.f36592c
            com.google.protobuf.cq r0 = r0.f137840a
            int r0 = r0.size()
            r1 = 1
            if (r0 == r1) goto L_0x000e
            com.google.assistant.e.j.e.ff r0 = r12.f36591a
            return r0
        L_0x000e:
            com.google.assistant.e.j.uh r0 = r12.f36592c
            com.google.protobuf.cq r0 = r0.f137840a
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90133n(r0)
            com.google.assistant.e.j.tr r0 = (com.google.assistant.p3897e.p3921j.C52490tr) r0
            boolean r2 = r0.f137802f
            if (r2 != 0) goto L_0x001f
            com.google.assistant.e.j.e.ff r0 = r12.f36591a
            return r0
        L_0x001f:
            java.lang.String r2 = "sub_location_cancel_field"
            com.google.assistant.e.j.e.ff r3 = r12.f36591a
            boolean r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11169be.m26480m(r2, r3, r0)
            if (r2 == 0) goto L_0x0033
            com.google.assistant.e.j.e.ff r0 = r12.f36591a
            com.google.assistant.e.j.e.ff r0 = m26517a(r0)
            r12.f36591a = r0
            goto L_0x0251
        L_0x0033:
            boolean r2 = m26518c(r0)
            if (r2 == 0) goto L_0x0251
            int r2 = r0.f137798b
            r3 = 7
            if (r2 != r3) goto L_0x0043
            java.lang.Object r0 = r0.f137799c
            com.google.assistant.e.j.tx r0 = (com.google.assistant.p3897e.p3921j.C52496tx) r0
            goto L_0x0045
        L_0x0043:
            com.google.assistant.e.j.tx r0 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
        L_0x0045:
            com.google.assistant.e.j.vo r0 = r0.f137816b
            if (r0 != 0) goto L_0x004b
            com.google.assistant.e.j.vo r0 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x004b:
            java.lang.String r2 = "location"
            com.google.assistant.e.j.e.ff r3 = r12.f36591a
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r2, r3)
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x0251
            java.lang.Object r3 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r3
            int r4 = r3.f136277e
            r5 = 6
            if (r4 != r5) goto L_0x0069
            java.lang.Object r3 = r3.f136278f
            com.google.assistant.e.c.c.du r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r3
            goto L_0x006b
        L_0x0069:
            com.google.assistant.e.c.c.du r3 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x006b:
            com.google.assistant.e.c.c.du r3 = m26519d(r3)
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.e.j.ka r6 = (com.google.assistant.p3897e.p3921j.C52230ka) r6
            int r7 = r6.f137059a
            r7 = r7 | r1
            r6.f137059a = r7
            java.lang.String r7 = "assistant.api.client_input.LocationSelectionContent"
            r6.f137060b = r7
            com.google.assistant.e.j.tx r6 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.tw r6 = (com.google.assistant.p3897e.p3921j.C52495tw) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.tx r7 = (com.google.assistant.p3897e.p3921j.C52496tx) r7
            r0.getClass()
            r7.f137816b = r0
            int r8 = r7.f137815a
            r8 = r8 | r1
            r7.f137815a = r8
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.tx r6 = (com.google.assistant.p3897e.p3921j.C52496tx) r6
            com.google.protobuf.z r6 = r6.toByteString()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.assistant.e.j.ka r7 = (com.google.assistant.p3897e.p3921j.C52230ka) r7
            r6.getClass()
            int r8 = r7.f137059a
            r9 = 2
            r8 = r8 | r9
            r7.f137059a = r8
            r7.f137061c = r6
            com.google.protobuf.bv r4 = r4.build()
            com.google.assistant.e.j.ka r4 = (com.google.assistant.p3897e.p3921j.C52230ka) r4
            java.lang.String r6 = "location_selection"
            android.util.Pair r4 = android.util.Pair.create(r6, r4)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89846n(r4)
            com.google.assistant.e.c.c.dr r7 = com.google.assistant.p3897e.p3902c.p3907c.C51027dr.f132852m
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.c.c.do r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51024do) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.c.c.dr r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r8
            int r10 = r8.f132854a
            r10 = r10 | r1
            r8.f132854a = r10
            r8.f132859f = r1
            com.google.assistant.e.j.vk r8 = r0.f137912c
            if (r8 != 0) goto L_0x00e8
            com.google.assistant.e.j.vk r8 = com.google.assistant.p3897e.p3921j.C52537vk.f137903c
        L_0x00e8:
            java.lang.String r8 = r8.f137906b
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.assistant.e.c.c.dr r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r10
            r8.getClass()
            r10.f132855b = r9
            r10.f132856c = r8
            java.lang.String r0 = r0.f137911b
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.c.c.dr r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r8
            r0.getClass()
            int r10 = r8.f132854a
            r10 = r10 | 16
            r8.f132854a = r10
            r8.f132861h = r0
            com.google.assistant.e.c.c.dg r0 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.df r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51015df) r0
            com.google.assistant.e.j.du r8 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.ds r8 = (com.google.assistant.p3897e.p3921j.C51803ds) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.j.du r10 = (com.google.assistant.p3897e.p3921j.C51805du) r10
            int r11 = r10.f135926a
            r1 = r1 | r11
            r10.f135926a = r1
            java.lang.String r1 = "ui.FORM_INPUT"
            r10.f135927b = r1
            r1 = 0
            com.google.common.b.sm r4 = r4.listIterator(r1)
        L_0x0131:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0149
            java.lang.Object r10 = r4.next()
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r11 = r10.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.second
            com.google.assistant.e.j.ka r10 = (com.google.assistant.p3897e.p3921j.C52230ka) r10
            r8.mo53729a(r11, r10)
            goto L_0x0131
        L_0x0149:
            com.google.protobuf.bv r4 = r8.build()
            com.google.assistant.e.j.du r4 = (com.google.assistant.p3897e.p3921j.C51805du) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.assistant.e.c.c.dg r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r8
            r4.getClass()
            r8.f132833e = r4
            int r4 = r8.f132829a
            r4 = r4 | 8
            r8.f132829a = r4
            r7.copyOnWrite()
            com.google.protobuf.bv r4 = r7.instance
            com.google.assistant.e.c.c.dr r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r0
            r0.getClass()
            r4.f132858e = r0
            r0 = 4
            r4.f132857d = r0
            com.google.protobuf.bv r4 = r7.build()
            com.google.assistant.e.c.c.dr r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r4
        L_0x017c:
            com.google.protobuf.cq r7 = r3.f132875f
            int r7 = r7.size()
            if (r1 >= r7) goto L_0x01e7
            com.google.protobuf.cq r7 = r3.f132875f
            java.lang.Object r7 = r7.get(r1)
            com.google.assistant.e.c.c.dr r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r7
            int r8 = r7.f132857d
            if (r8 != r0) goto L_0x0195
            java.lang.Object r7 = r7.f132858e
            com.google.assistant.e.c.c.dg r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r7
            goto L_0x0197
        L_0x0195:
            com.google.assistant.e.c.c.dg r7 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0197:
            com.google.assistant.e.j.du r7 = r7.f132833e
            if (r7 != 0) goto L_0x019d
            com.google.assistant.e.j.du r7 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x019d:
            com.google.protobuf.dn r8 = r7.f135929d
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x01e4
            com.google.assistant.e.j.ka r8 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.dn r7 = r7.f135929d
            boolean r10 = r7.containsKey(r6)
            if (r10 == 0) goto L_0x01b6
            java.lang.Object r7 = r7.get(r6)
            r8 = r7
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8
        L_0x01b6:
            com.google.protobuf.z r7 = r8.f137061c     // Catch:{ ct -> 0x01d6 }
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01d6 }
            com.google.assistant.e.j.tx r10 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c     // Catch:{ ct -> 0x01d6 }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r10, (com.google.protobuf.C63088z) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ ct -> 0x01d6 }
            com.google.assistant.e.j.tx r7 = (com.google.assistant.p3897e.p3921j.C52496tx) r7     // Catch:{ ct -> 0x01d6 }
            com.google.assistant.e.j.vo r7 = r7.f137816b     // Catch:{ ct -> 0x01d6 }
            if (r7 != 0) goto L_0x01ca
            com.google.assistant.e.j.vo r7 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f     // Catch:{ ct -> 0x01d6 }
        L_0x01ca:
            int r7 = r7.f137914e     // Catch:{ ct -> 0x01d6 }
            int r7 = com.google.assistant.p3897e.p3921j.C52540vn.m86645a(r7)     // Catch:{ ct -> 0x01d6 }
            if (r7 != 0) goto L_0x01d3
            goto L_0x01e4
        L_0x01d3:
            if (r7 != r9) goto L_0x01e4
            goto L_0x01e8
        L_0x01d6:
            com.google.common.f.e r7 = f36590b
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "getCustomLocationItemIndex: Could not extract location selection from ClientInput param."
            r10 = 43076(0xa844, float:6.0362E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56386p(r8)
        L_0x01e4:
            int r1 = r1 + 1
            goto L_0x017c
        L_0x01e7:
            r1 = -1
        L_0x01e8:
            if (r1 >= 0) goto L_0x01fa
            com.google.protobuf.bn r0 = r3.toBuilder()
            com.google.assistant.e.c.c.dl r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51021dl) r0
            r0.mo53502c(r4)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.du r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r0
            goto L_0x0209
        L_0x01fa:
            com.google.protobuf.bn r0 = r3.toBuilder()
            com.google.assistant.e.c.c.dl r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51021dl) r0
            r0.mo53505f(r1, r4)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.du r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r0
        L_0x0209:
            java.lang.Object r1 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.assistant.e.j.e.eq r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r1
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.assistant.e.c.c.dl r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51021dl) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.c.c.du r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r2
            r4.getClass()
            r2.f132874e = r4
            int r3 = r2.f132870a
            r3 = r3 | 16
            r2.f132870a = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.du r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r0
            r0.getClass()
            r2.f136278f = r0
            r2.f136277e = r5
            com.google.protobuf.bv r0 = r1.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.assistant.e.j.e.ff r1 = r12.f36591a
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            com.google.assistant.e.j.e.ff r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26609f(r0, r2, r1)
            r12.f36591a = r0
        L_0x0251:
            com.google.assistant.e.j.e.ff r0 = r12.f36591a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11189m.mo19615b():com.google.assistant.e.j.e.ff");
    }
}
