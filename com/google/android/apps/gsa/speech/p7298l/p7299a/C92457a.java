package com.google.android.apps.gsa.speech.p7298l.p7299a;

import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.speech.p5208h.C66660e;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.speech.l.a.a */
/* compiled from: PG */
public final /* synthetic */ class C92457a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f257892a;

    /* renamed from: b */
    public final /* synthetic */ C52090ew f257893b;

    /* renamed from: c */
    public final /* synthetic */ C52079el f257894c;

    /* renamed from: d */
    public final /* synthetic */ C66660e f257895d;

    public /* synthetic */ C92457a(List list, C52090ew ewVar, C52079el elVar, C66660e eVar) {
        this.f257892a = list;
        this.f257893b = ewVar;
        this.f257894c = elVar;
        this.f257895d = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            java.util.List r0 = r11.f257892a
            com.google.assistant.e.j.ew r1 = r11.f257893b
            com.google.assistant.e.j.el r2 = r11.f257894c
            com.google.speech.h.e r3 = r11.f257895d
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r4 = ""
        L_0x000e:
            boolean r5 = r0.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x005e
            java.lang.Object r5 = r0.next()
            com.google.common.util.concurrent.cx r5 = (com.google.common.util.concurrent.C60870cx) r5
            boolean r7 = r5.isCancelled()
            if (r7 != 0) goto L_0x000e
            java.lang.Object r5 = com.google.common.util.concurrent.C60856cj.m92909r(r5)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L_0x002d
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x000e
        L_0x002d:
            boolean r7 = r5 instanceof com.google.assistant.p3897e.p3921j.C52232kc
            if (r7 == 0) goto L_0x000e
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5
            java.lang.String r7 = r5.f137065b
            if (r5 == 0) goto L_0x000e
        L_0x0039:
            com.google.protobuf.bv r7 = r1.instance
            com.google.assistant.e.j.ex r7 = (com.google.assistant.p3897e.p3921j.C52091ex) r7
            com.google.protobuf.cq r7 = r7.f136712a
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x005a
            com.google.assistant.e.j.kc r7 = r1.mo53789b(r6)
            java.lang.String r7 = r7.f137065b
            java.lang.String r8 = r5.f137065b
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0057
            r1.mo53795h(r6, r5)
            goto L_0x000e
        L_0x0057:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x005a:
            r1.mo53792e(r5)
            goto L_0x000e
        L_0x005e:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0143
        L_0x0064:
            com.google.protobuf.bv r0 = r1.instance
            com.google.assistant.e.j.ex r0 = (com.google.assistant.p3897e.p3921j.C52091ex) r0
            com.google.protobuf.cq r0 = r0.f136712a
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x0143
            com.google.assistant.e.j.kc r0 = r1.mo53789b(r6)
            java.lang.String r5 = r0.f137065b
            java.lang.String r7 = "asst.device.properties"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x013f
            com.google.assistant.e.j.ka r5 = r0.f137066c
            if (r5 != 0) goto L_0x0084
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0084:
            java.lang.String r5 = r5.f137060b
            java.lang.String r8 = "assistant.api.params.DeviceProperties"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x013f
            com.google.assistant.e.j.ka r0 = r0.f137066c     // Catch:{ ct -> 0x0127 }
            if (r0 != 0) goto L_0x0094
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0127 }
        L_0x0094:
            com.google.protobuf.z r0 = r0.f137061c     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.i.a.dw r9 = com.google.assistant.p3897e.p3917i.p3918a.C51334dw.f133658ab     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.i.a.cs r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51303cs) r0     // Catch:{ ct -> 0x0127 }
            r0.copyOnWrite()     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r5 = r0.instance     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.i.a.dw r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r5     // Catch:{ ct -> 0x0127 }
            r4.getClass()     // Catch:{ ct -> 0x0127 }
            int r9 = r5.f133685a     // Catch:{ ct -> 0x0127 }
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r9 = r9 | r10
            r5.f133685a = r9     // Catch:{ ct -> 0x0127 }
            r5.f133709w = r4     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.i.a.dw r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r0     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.kc r5 = com.google.assistant.p3897e.p3921j.C52232kc.f137062d     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.kb r5 = (com.google.assistant.p3897e.p3921j.C52231kb) r5     // Catch:{ ct -> 0x0127 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r9 = r5.instance     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.kc r9 = (com.google.assistant.p3897e.p3921j.C52232kc) r9     // Catch:{ ct -> 0x0127 }
            int r10 = r9.f137064a     // Catch:{ ct -> 0x0127 }
            r10 = r10 | 1
            r9.f137064a = r10     // Catch:{ ct -> 0x0127 }
            r9.f137065b = r7     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.ka r7 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.jz r7 = (com.google.assistant.p3897e.p3921j.C52228jz) r7     // Catch:{ ct -> 0x0127 }
            r7.copyOnWrite()     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.ka r9 = (com.google.assistant.p3897e.p3921j.C52230ka) r9     // Catch:{ ct -> 0x0127 }
            int r10 = r9.f137059a     // Catch:{ ct -> 0x0127 }
            r10 = r10 | 1
            r9.f137059a = r10     // Catch:{ ct -> 0x0127 }
            r9.f137060b = r8     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.z r0 = r0.toByteString()     // Catch:{ ct -> 0x0127 }
            r7.copyOnWrite()     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.ka r8 = (com.google.assistant.p3897e.p3921j.C52230ka) r8     // Catch:{ ct -> 0x0127 }
            r0.getClass()     // Catch:{ ct -> 0x0127 }
            int r9 = r8.f137059a     // Catch:{ ct -> 0x0127 }
            r9 = r9 | 2
            r8.f137059a = r9     // Catch:{ ct -> 0x0127 }
            r8.f137061c = r0     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.ka r0 = (com.google.assistant.p3897e.p3921j.C52230ka) r0     // Catch:{ ct -> 0x0127 }
            r5.copyOnWrite()     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.kc r7 = (com.google.assistant.p3897e.p3921j.C52232kc) r7     // Catch:{ ct -> 0x0127 }
            r0.getClass()     // Catch:{ ct -> 0x0127 }
            r7.f137066c = r0     // Catch:{ ct -> 0x0127 }
            int r0 = r7.f137064a     // Catch:{ ct -> 0x0127 }
            r0 = r0 | 2
            r7.f137064a = r0     // Catch:{ ct -> 0x0127 }
            com.google.protobuf.bv r0 = r5.build()     // Catch:{ ct -> 0x0127 }
            com.google.assistant.e.j.kc r0 = (com.google.assistant.p3897e.p3921j.C52232kc) r0     // Catch:{ ct -> 0x0127 }
            r1.mo53795h(r6, r0)     // Catch:{ ct -> 0x0127 }
            goto L_0x013f
        L_0x0127:
            com.google.common.f.e r0 = com.google.android.apps.gsa.speech.p7298l.p7299a.C92459c.f257897a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "AsstInputParamsBldr"
            r0.mo56378ag(r5, r7)
            java.lang.String r5 = "ConvDeltaReq"
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "Cannot extract DeviceProperties from ConversationDelta."
            r9 = 12821(0x3215, float:1.7966E-41)
            android.databinding.C0118a.m109q(r0, r8, r9, r5, r7)
        L_0x013f:
            int r6 = r6 + 1
            goto L_0x0064
        L_0x0143:
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ex r1 = (com.google.assistant.p3897e.p3921j.C52091ex) r1
            com.google.assistant.e.j.en r4 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
            r1.getClass()
            r0.f136685e = r1
            int r1 = r0.f136681a
            r1 = r1 | 16
            r0.f136681a = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.speech.h.f r0 = (com.google.speech.p5208h.C66672f) r0
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.en r1 = (com.google.assistant.p3897e.p3921j.C52081en) r1
            com.google.speech.h.f r2 = com.google.speech.p5208h.C66672f.f181366c
            r1.getClass()
            r0.f181370b = r1
            int r1 = r0.f181369a
            r1 = r1 | 2
            r0.f181369a = r1
            com.google.protobuf.bv r0 = r3.build()
            com.google.speech.h.f r0 = (com.google.speech.p5208h.C66672f) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.speech.p7298l.p7299a.C92457a.call():java.lang.Object");
    }
}
