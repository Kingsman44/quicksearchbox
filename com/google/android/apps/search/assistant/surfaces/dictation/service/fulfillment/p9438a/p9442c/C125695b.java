package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c;

import com.google.assistant.p3897e.p3917i.p3919b.C51641d;
import com.google.assistant.p3897e.p3917i.p3919b.p3920a.C51638a;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.b */
/* compiled from: PG */
public final class C125695b {
    /* renamed from: b */
    public static final C52232kc m205680b(MessageLite messageLite) {
        C51641d a = C51638a.m86260a(messageLite.getDefaultInstanceForType());
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        String str = a.f134569b;
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        str.getClass();
        kcVar.f137064a |= 1;
        kcVar.f137065b = str;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        String str2 = a.f134570c;
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        str2.getClass();
        kaVar.f137059a |= 1;
        kaVar.f137060b = str2;
        C63088z byteString = messageLite.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        C62942bv build = kbVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…       )\n        .build()");
        return (C52232kc) build;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107086a(com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125694a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.a r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125694a) r0
            int r1 = r0.f346431d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346431d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.a r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.c.a
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f346429b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346431d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r12 = r0.f346428a
            p5462h.C69714l.m101134b(r13)
            goto L_0x0040
        L_0x0029:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0031:
            p5462h.C69714l.m101134b(r13)
            com.google.common.util.concurrent.cx r13 = r12.f346477b
            r0.f346428a = r12
            r0.f346431d = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0210
        L_0x0040:
            java.util.List r13 = (java.util.List) r13
            com.google.assistant.f.c.f r13 = com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125312a.m205251a(r13)
            r0 = r12
            com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c) r0
            com.google.android.apps.gsa.nga.api.a.bj r1 = r0.f346478c
            com.google.android.apps.gsa.nga.api.a.af r1 = r1.a
            if (r1 != 0) goto L_0x0051
            com.google.android.apps.gsa.nga.api.a.af r1 = com.google.android.apps.gsa.nga.api.a.af.w
        L_0x0051:
            java.lang.String r1 = r1.e
            java.lang.String r2 = "orationContext.keyboardC…uration.foregroundPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.assistant.e.i.a.n r2 = com.google.assistant.p3897e.p3917i.p3918a.C51581n.f134439b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.i.a.m r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51554m) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.protobuf.a.b r6 = new com.google.protobuf.a.b
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.i.a.n r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51581n) r7
            com.google.protobuf.cq r7 = r7.f134441a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            java.lang.String r8 = "_builder.getAppActionsInfoList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r6.<init>(r7)
            com.google.assistant.e.i.a.p r6 = com.google.assistant.p3897e.p3917i.p3918a.C51626p.f134543e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.i.a.o r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51608o) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r5)
            com.google.assistant.e.i.a.r r7 = com.google.assistant.p3897e.p3917i.p3918a.C51628r.f134549b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.i.a.q r7 = (com.google.assistant.p3897e.p3917i.p3918a.C51627q) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r5)
            com.google.protobuf.a.b r8 = new com.google.protobuf.a.b
            com.google.protobuf.bv r9 = r7.instance
            com.google.assistant.e.i.a.r r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51628r) r9
            com.google.protobuf.cq r9 = r9.f134551a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.String r10 = "_builder.getActionsList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            r8.<init>(r9)
            com.google.protobuf.cq r13 = r13.f138613a
            java.lang.String r8 = "appActionsContext.actionsList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r8)
            java.lang.String r8 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r8)
            r7.mo53666a(r13)
            com.google.protobuf.bv r13 = r7.build()
            java.lang.String r7 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.assistant.e.i.a.r r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51628r) r13
            java.lang.String r8 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r8)
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.assistant.e.i.a.p r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51626p) r9
            r13.getClass()
            r9.f134547c = r13
            int r13 = r9.f134545a
            r13 = r13 | 2
            r9.f134545a = r13
            com.google.assistant.e.i.a.t r13 = com.google.assistant.p3897e.p3917i.p3918a.C51630t.f134552d
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.i.a.s r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51629s) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r5)
            com.google.assistant.e.c.c.ev r9 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.c.c.es r9 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r4)
            com.google.assistant.e.c.c.f r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            r9.mo53516c(r1)
            com.google.assistant.e.c.c.ev r1 = r9.mo53514a()
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r8)
            r13.copyOnWrite()
            com.google.protobuf.bv r9 = r13.instance
            com.google.assistant.e.i.a.t r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51630t) r9
            r1.getClass()
            r9.f134555b = r1
            int r1 = r9.f134554a
            r1 = r1 | r3
            r9.f134554a = r1
            com.google.protobuf.bv r13 = r13.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.assistant.e.i.a.t r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51630t) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r8)
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.assistant.e.i.a.p r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51626p) r1
            r13.getClass()
            r1.f134546b = r13
            int r13 = r1.f134545a
            r13 = r13 | r3
            r1.f134545a = r13
            com.google.protobuf.bv r13 = r6.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.assistant.e.i.a.p r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51626p) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r8)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.assistant.e.i.a.n r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51581n) r1
            r13.getClass()
            r1.mo53645a()
            com.google.protobuf.cq r1 = r1.f134441a
            r1.add(r13)
            com.google.protobuf.bv r13 = r2.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            com.google.assistant.e.i.a.n r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51581n) r13
            com.google.assistant.e.i.a.fn r1 = com.google.assistant.p3897e.p3917i.p3918a.C51379fn.f133814i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.i.a.fk r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51376fk) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.assistant.e.i.a.fj r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.assistant.af.b.b r2 = com.google.assistant.p3795af.p3798b.C48777b.f126217f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.af.b.a r2 = (com.google.assistant.p3795af.p3798b.C48776a) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.assistant.af.b.b r4 = (com.google.assistant.p3795af.p3798b.C48777b) r4
            r4.f126219a = r3
            boolean r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9445c.C125709a.m205699b(r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.af.b.b r5 = (com.google.assistant.p3795af.p3798b.C48777b) r5
            r5.f126220b = r4
            boolean r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9445c.C125709a.m205698a(r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.af.b.b r5 = (com.google.assistant.p3795af.p3798b.C48777b) r5
            r5.f126221c = r4
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.s r4 = r0.f346479d
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.s r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125930s.FULL
            if (r4 != r5) goto L_0x01a3
            r4 = 1
            goto L_0x01a4
        L_0x01a3:
            r4 = 0
        L_0x01a4:
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.af.b.b r5 = (com.google.assistant.p3795af.p3798b.C48777b) r5
            r5.f126222d = r4
            java.lang.String r4 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            com.google.common.b.ij r12 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126321bb.f347989f
            com.google.android.apps.gsa.nga.api.a.bj r0 = r0.f346478c
            com.google.android.apps.gsa.nga.api.a.af r0 = r0.a
            if (r0 != 0) goto L_0x01bc
            com.google.android.apps.gsa.nga.api.a.af r0 = com.google.android.apps.gsa.nga.api.a.af.w
        L_0x01bc:
            java.lang.String r0 = r0.e
            boolean r12 = r12.contains(r0)
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.af.b.b r0 = (com.google.assistant.p3795af.p3798b.C48777b) r0
            r12 = r12 ^ r3
            r0.f126223e = r12
            com.google.protobuf.bv r12 = r2.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            com.google.assistant.af.b.b r12 = (com.google.assistant.p3795af.p3798b.C48777b) r12
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            com.google.assistant.e.i.a.fk r0 = r1.f133806a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.assistant.e.i.a.fn r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51379fn) r0
            r12.getClass()
            r0.f133822g = r12
            int r12 = r0.f133816a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r0.f133816a = r12
            com.google.assistant.e.i.a.fn r12 = r1.mo53607a()
            com.google.assistant.e.j.ex r0 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.ew r0 = (com.google.assistant.p3897e.p3921j.C52090ew) r0
            com.google.assistant.e.j.kc r12 = m205680b(r12)
            r0.mo53792e(r12)
            com.google.assistant.e.j.kc r12 = m205680b(r13)
            r0.mo53792e(r12)
            com.google.protobuf.bv r12 = r0.build()
            java.lang.String r13 = "newBuilder()\n        .ad…Params))\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            return r12
        L_0x0210:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9442c.C125695b.mo107086a(com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.c, h.c.g):java.lang.Object");
    }
}
