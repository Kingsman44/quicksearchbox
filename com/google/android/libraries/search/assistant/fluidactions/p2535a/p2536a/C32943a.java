package com.google.android.libraries.search.assistant.fluidactions.p2535a.p2536a;

import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32953f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52345oh;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.adu;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.a.a.a */
/* compiled from: PG */
public final class C32943a implements C32942a {

    /* renamed from: a */
    private final C47770dh f88259a;

    /* renamed from: b */
    private final C32953f f88260b;

    public C32943a(C47770dh dhVar, C32953f fVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(fVar, "freeFormCallback");
        this.f88259a = dhVar;
        this.f88260b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m60956d(java.lang.String r2, com.google.assistant.p3897e.p3921j.C52078ek r3) {
        /*
            r1 = this;
            boolean r0 = p5462h.p5483m.C69764m.m101229h(r2)
            if (r0 == 0) goto L_0x000c
            com.google.android.libraries.search.assistant.fluidactions.b.f r2 = r1.f88260b
            r2.mo38396b(r3)
            return
        L_0x000c:
            java.util.WeakHashMap r0 = com.google.apps.tiktok.tracing.C47831fm.f123851a     // Catch:{ IllegalStateException -> 0x0014 }
            com.google.android.libraries.search.assistant.fluidactions.b.f r0 = r1.f88260b     // Catch:{ IllegalStateException -> 0x0014 }
            r0.mo38396b(r3)     // Catch:{ IllegalStateException -> 0x0014 }
            return
        L_0x0014:
            com.google.apps.tiktok.tracing.dh r0 = r1.f88259a
            com.google.apps.tiktok.tracing.ax r2 = r0.mo51613c(r2)
            com.google.android.libraries.search.assistant.fluidactions.b.f r0 = r1.f88260b     // Catch:{ all -> 0x0024 }
            r0.mo38396b(r3)     // Catch:{ all -> 0x0024 }
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            return
        L_0x0024:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2535a.p2536a.C32943a.m60956d(java.lang.String, com.google.assistant.e.j.ek):void");
    }

    /* renamed from: e */
    private static final C52078ek m60957e(C51805du duVar) {
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        C69664n.m101060f(ejVar, "newBuilder()");
        C69664n.m101061g(ejVar, "builder");
        C69664n.m101061g(duVar, "value");
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        C62942bv build = ejVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C52078ek) build;
    }

    /* renamed from: f */
    private static final C52078ek m60958f(C52492tt ttVar, C51805du duVar) {
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        C69664n.m101060f(jzVar, "newBuilder()");
        adu a = C69664n.m101061g(jzVar, "builder");
        a.mo53678c("assistant.api.client_input.FormInput");
        C63088z byteString = ttVar.toByteString();
        C69664n.m101060f(byteString, "formInput.toByteString()");
        a.mo53677b(byteString);
        C52230ka a2 = a.mo53676a();
        C62934bn builder = duVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C52345oh a3 = C69664n.m101061g((C51803ds) builder, "builder");
        a3.mo53832b("ui.FORM_INPUT");
        a3.mo53834d();
        a3.mo53833c("form_input", a2);
        return m60957e(a3.mo53831a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38364a(java.lang.String r18, com.google.assistant.p3897e.p3921j.C52492tt r19, com.google.assistant.p3897e.p3902c.p3907c.C51016dg r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.lang.String r4 = "formInput"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.lang.String r4 = "interactiveElement"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            com.google.assistant.e.j.du r4 = r3.f132833e
            if (r4 != 0) goto L_0x0018
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0018:
            java.lang.String r5 = "interactiveElement.clientInput"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r5 = "intent_update_input"
            if (r3 != 0) goto L_0x0028
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0025:
            r6 = 0
            goto L_0x05e3
        L_0x0028:
            int r7 = r3.f132829a
            r8 = 8
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0080
            com.google.assistant.e.j.du r7 = r3.f132833e
            if (r7 != 0) goto L_0x0035
            com.google.assistant.e.j.du r7 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0035:
            java.lang.String r7 = r7.f135927b
            java.lang.String r9 = "asst_input.INTENT_UPDATE"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0040
            goto L_0x0080
        L_0x0040:
            com.google.assistant.e.j.du r3 = r3.f132833e     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            if (r3 != 0) goto L_0x0046
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ ct | IllegalArgumentException -> 0x006d }
        L_0x0046:
            com.google.protobuf.dn r3 = r3.f135929d     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            boolean r7 = r3.containsKey(r5)     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            if (r7 == 0) goto L_0x0067
            java.lang.Object r3 = r3.get(r5)     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.protobuf.z r3 = r3.f137061c     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.assistant.e.j.hf r9 = com.google.assistant.p3897e.p3921j.C52154hf.f136854c     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (com.google.protobuf.C63088z) r3, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            com.google.assistant.e.j.hf r3 = (com.google.assistant.p3897e.p3921j.C52154hf) r3     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            goto L_0x0084
        L_0x0067:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            r3.<init>()     // Catch:{ ct | IllegalArgumentException -> 0x006d }
            throw r3     // Catch:{ ct | IllegalArgumentException -> 0x006d }
        L_0x006d:
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.f88262a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r7 = "Failed to extract IntentUpdateInput due to invalid ClientInput param."
            r9 = 50654(0xc5de, float:7.0981E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r9)).mo56386p(r7)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0084
        L_0x0080:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0084:
            boolean r7 = r3.isEmpty()
            if (r7 == 0) goto L_0x008f
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x008f:
            java.lang.Object r3 = r3.get()
            com.google.assistant.e.j.hf r3 = (com.google.assistant.p3897e.p3921j.C52154hf) r3
            com.google.assistant.e.j.uh r7 = r2.f137807c
            if (r7 != 0) goto L_0x009b
            com.google.assistant.e.j.uh r7 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
        L_0x009b:
            com.google.protobuf.cq r7 = r7.f137840a
            int r7 = r7.size()
            r9 = 0
            r10 = 1
            if (r7 != 0) goto L_0x00b8
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.f88262a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r11 = "Failed to convert FormInput to IntentUpdateInput. FormFieldContent is not present."
            r12 = 50653(0xc5dd, float:7.098E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r12)).mo56386p(r11)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x00eb
        L_0x00b8:
            com.google.assistant.e.j.uh r7 = r2.f137807c
            if (r7 != 0) goto L_0x00be
            com.google.assistant.e.j.uh r7 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
        L_0x00be:
            com.google.protobuf.cq r7 = r7.f137840a
            int r7 = r7.size()
            if (r7 <= r10) goto L_0x00d9
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.f88262a
            com.google.common.f.x r7 = r7.mo56226d()
            java.lang.String r11 = "Failed to convert FormInput to IntentUpdateInput. More than one FormFieldContent."
            r12 = 50652(0xc5dc, float:7.0979E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r12)).mo56386p(r11)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            goto L_0x00eb
        L_0x00d9:
            com.google.assistant.e.j.uh r7 = r2.f137807c
            if (r7 != 0) goto L_0x00df
            com.google.assistant.e.j.uh r7 = com.google.assistant.p3897e.p3921j.C52507uh.f137838b
        L_0x00df:
            com.google.protobuf.cq r7 = r7.f137840a
            java.lang.Object r7 = r7.get(r9)
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
        L_0x00eb:
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L_0x00f7
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x00f7:
            java.lang.Object r11 = r7.get()
            com.google.assistant.e.j.tr r11 = (com.google.assistant.p3897e.p3921j.C52490tr) r11
            com.google.assistant.e.j.tq r12 = com.google.assistant.p3897e.p3921j.C52489tq.EDITABLE_TEXT_CONTENT
            java.lang.Object r7 = r7.get()
            com.google.assistant.e.j.tr r7 = (com.google.assistant.p3897e.p3921j.C52490tr) r7
            int r7 = r7.f137798b
            com.google.assistant.e.j.tq r7 = com.google.assistant.p3897e.p3921j.C52489tq.m86641a(r7)
            int r7 = r7.ordinal()
            r12 = 3
            if (r7 == 0) goto L_0x058b
            r13 = 5
            r14 = 2
            if (r7 == r14) goto L_0x0503
            r6 = 4
            if (r7 == r12) goto L_0x0473
            r12 = 7
            if (r7 == r6) goto L_0x03aa
            if (r7 == r13) goto L_0x02f5
            if (r7 == r12) goto L_0x01c8
            if (r7 == r8) goto L_0x013c
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2536a.C32944b.f88261a
            com.google.common.f.x r3 = r3.mo56226d()
            int r6 = r11.f137798b
            com.google.assistant.e.j.tq r6 = com.google.assistant.p3897e.p3921j.C52489tq.m86641a(r6)
            r7 = 50650(0xc5da, float:7.0976E-41)
            java.lang.String r8 = "Unsupported FieldContentCase: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56389s(r8, r6)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x013c:
            int r7 = r11.f137798b
            r9 = 12
            if (r7 != r9) goto L_0x0147
            java.lang.Object r7 = r11.f137799c
            com.google.assistant.e.j.tm r7 = (com.google.assistant.p3897e.p3921j.C52485tm) r7
            goto L_0x0149
        L_0x0147:
            com.google.assistant.e.j.tm r7 = com.google.assistant.p3897e.p3921j.C52485tm.f137770c
        L_0x0149:
            int r9 = r7.f137772a
            r9 = r9 & r10
            if (r9 == 0) goto L_0x01c2
            com.google.assistant.e.j.so r7 = r7.f137773b
            if (r7 != 0) goto L_0x0154
            com.google.assistant.e.j.so r7 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0154:
            com.google.protos.an.b.k r9 = com.google.protos.p4850an.p4853b.C63367k.f171252c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.protos.an.b.j r9 = (com.google.protos.p4850an.p4853b.C63366j) r9
            com.google.protos.an.b.x r11 = com.google.protos.p4850an.p4853b.C63380x.f171276d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protos.an.b.w r11 = (com.google.protos.p4850an.p4853b.C63379w) r11
            long r12 = r7.f137717b
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.protos.an.b.x r7 = (com.google.protos.p4850an.p4853b.C63380x) r7
            int r15 = r7.f171278a
            r15 = r15 | r10
            r7.f171278a = r15
            double r12 = (double) r12
            r7.f171279b = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.protos.an.b.x r7 = (com.google.protos.p4850an.p4853b.C63380x) r7
            r7.f171280c = r6
            int r6 = r7.f171278a
            r6 = r6 | r14
            r7.f171278a = r6
            com.google.protobuf.bv r6 = r11.build()
            com.google.protos.an.b.x r6 = (com.google.protos.p4850an.p4853b.C63380x) r6
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.protos.an.b.k r7 = (com.google.protos.p4850an.p4853b.C63367k) r7
            r6.getClass()
            r7.f171255b = r6
            int r6 = r7.f171254a
            r6 = r6 | r10
            r7.f171254a = r6
            com.google.protobuf.bv r6 = r9.build()
            com.google.protos.an.b.k r6 = (com.google.protos.p4850an.p4853b.C63367k) r6
            com.google.knowledge.a.a.j r7 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.a.a.i r7 = (com.google.knowledge.p4661a.p4662a.C61747i) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r9 = r7.instance
            com.google.knowledge.a.a.j r9 = (com.google.knowledge.p4661a.p4662a.C61748j) r9
            r6.getClass()
            r9.f166803b = r6
            r9.f166802a = r8
            com.google.protobuf.bv r6 = r7.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x01c2:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x01c8:
            int r7 = r11.f137798b
            r9 = 11
            if (r7 != r9) goto L_0x01d3
            java.lang.Object r7 = r11.f137799c
            com.google.assistant.e.j.uf r7 = (com.google.assistant.p3897e.p3921j.C52505uf) r7
            goto L_0x01d5
        L_0x01d3:
            com.google.assistant.e.j.uf r7 = com.google.assistant.p3897e.p3921j.C52505uf.f137834c
        L_0x01d5:
            int r9 = r7.f137836a
            r9 = r9 & r10
            if (r9 == 0) goto L_0x02ef
            com.google.assistant.e.j.qf r7 = r7.f137837b
            if (r7 != 0) goto L_0x01e0
            com.google.assistant.e.j.qf r7 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x01e0:
            com.google.knowledge.a.a.j r9 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.knowledge.a.a.i r9 = (com.google.knowledge.p4661a.p4662a.C61747i) r9
            com.google.protos.an.b.d r11 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protos.an.b.c r11 = (com.google.protos.p4850an.p4853b.C63359c) r11
            com.google.protos.an.b.o r16 = com.google.protos.p4850an.p4853b.C63371o.f171261g
            com.google.protobuf.bn r16 = r16.createBuilder()
            r15 = r16
            com.google.protos.an.b.n r15 = (com.google.protos.p4850an.p4853b.C63370n) r15
            com.google.protobuf.ch r13 = r7.f137496d
            int r13 = r13.size()
            if (r13 != r12) goto L_0x0221
            r15.copyOnWrite()
            com.google.protobuf.bv r7 = r15.instance
            com.google.protos.an.b.o r7 = (com.google.protos.p4850an.p4853b.C63371o) r7
            int r8 = r7.f171263a
            r8 = r8 | r10
            r7.f171263a = r8
            r7.f171264b = r10
            r15.copyOnWrite()
            com.google.protobuf.bv r7 = r15.instance
            com.google.protos.an.b.o r7 = (com.google.protos.p4850an.p4853b.C63371o) r7
            r7.f171268f = r12
            int r8 = r7.f171263a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.f171263a = r8
            goto L_0x02a8
        L_0x0221:
            com.google.protobuf.ch r13 = r7.f137496d
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x02a8
            com.google.protobuf.ch r13 = r7.f137498f
            int r13 = r13.size()
            if (r13 != 0) goto L_0x02a8
            r15.copyOnWrite()
            com.google.protobuf.bv r13 = r15.instance
            com.google.protos.an.b.o r13 = (com.google.protos.p4850an.p4853b.C63371o) r13
            int r12 = r13.f171263a
            r12 = r12 | r10
            r13.f171263a = r12
            r13.f171264b = r10
            r15.copyOnWrite()
            com.google.protobuf.bv r12 = r15.instance
            com.google.protos.an.b.o r12 = (com.google.protos.p4850an.p4853b.C63371o) r12
            r12.f171268f = r8
            int r13 = r12.f171263a
            r13 = r13 | 128(0x80, float:1.794E-43)
            r12.f171263a = r13
            com.google.protobuf.ch r7 = r7.f137496d
            java.util.Iterator r7 = r7.iterator()
        L_0x0254:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x02a8
            java.lang.Object r12 = r7.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            com.google.protos.an.b.b r13 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.protos.an.b.a r13 = (com.google.protos.p4850an.p4853b.C63357a) r13
            switch(r12) {
                case 0: goto L_0x0289;
                case 1: goto L_0x0287;
                case 2: goto L_0x028a;
                case 3: goto L_0x0285;
                case 4: goto L_0x0283;
                case 5: goto L_0x0281;
                case 6: goto L_0x027e;
                default: goto L_0x026f;
            }
        L_0x026f:
            com.google.common.f.e r12 = com.google.android.libraries.search.assistant.fluidactions.p2554e.C33145a.f88685a
            com.google.common.f.x r12 = r12.mo56225c()
            java.lang.String r8 = "The weekDay in the recurrence weekly pattern is out of the range of 0-6."
            r6 = 51192(0xc7f8, float:7.1735E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r12).mo56372aa(r6)).mo56386p(r8)
            goto L_0x0287
        L_0x027e:
            r6 = 8
            goto L_0x028a
        L_0x0281:
            r6 = 7
            goto L_0x028a
        L_0x0283:
            r6 = 6
            goto L_0x028a
        L_0x0285:
            r6 = 5
            goto L_0x028a
        L_0x0287:
            r6 = 3
            goto L_0x028a
        L_0x0289:
            r6 = 2
        L_0x028a:
            r13.copyOnWrite()
            com.google.protobuf.bv r8 = r13.instance
            com.google.protos.an.b.b r8 = (com.google.protos.p4850an.p4853b.C63358b) r8
            int r6 = r6 + -1
            r8.f171227j = r6
            int r6 = r8.f171218a
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r8.f171218a = r6
            com.google.protobuf.bv r6 = r13.build()
            com.google.protos.an.b.b r6 = (com.google.protos.p4850an.p4853b.C63358b) r6
            r15.mo59210a(r6)
            r6 = 4
            r8 = 8
            goto L_0x0254
        L_0x02a8:
            com.google.protobuf.bv r6 = r15.build()
            com.google.protos.an.b.o r6 = (com.google.protos.p4850an.p4853b.C63371o) r6
            r11.copyOnWrite()
            com.google.protobuf.bv r7 = r11.instance
            com.google.protos.an.b.d r7 = (com.google.protos.p4850an.p4853b.C63360d) r7
            r6.getClass()
            r7.f171235d = r6
            int r6 = r7.f171232a
            r6 = r6 | r14
            r7.f171232a = r6
            r11.copyOnWrite()
            com.google.protobuf.bv r6 = r11.instance
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            r6.f171236e = r10
            int r7 = r6.f171232a
            r7 = r7 | 64
            r6.f171232a = r7
            com.google.protobuf.bv r6 = r11.build()
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            r9.copyOnWrite()
            com.google.protobuf.bv r7 = r9.instance
            com.google.knowledge.a.a.j r7 = (com.google.knowledge.p4661a.p4662a.C61748j) r7
            r6.getClass()
            r7.f166803b = r6
            r6 = 4
            r7.f166802a = r6
            com.google.protobuf.bv r6 = r9.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x02ef:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x02f5:
            int r6 = r11.f137798b
            r7 = 8
            if (r6 != r7) goto L_0x0300
            java.lang.Object r6 = r11.f137799c
            com.google.assistant.e.j.tg r6 = (com.google.assistant.p3897e.p3921j.C52479tg) r6
            goto L_0x0302
        L_0x0300:
            com.google.assistant.e.j.tg r6 = com.google.assistant.p3897e.p3921j.C52479tg.f137757d
        L_0x0302:
            int r7 = r6.f137759a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x03a4
            com.google.assistant.e.j.adm r6 = r6.f137760b
            if (r6 != 0) goto L_0x030d
            com.google.assistant.e.j.adm r6 = com.google.assistant.p3897e.p3921j.adm.f134889h
        L_0x030d:
            com.google.assistant.e.j.yp r7 = r6.f134892b
            if (r7 != 0) goto L_0x0313
            com.google.assistant.e.j.yp r7 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0313:
            com.google.protobuf.cq r7 = r7.f138166c
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x032f
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2536a.C32944b.f88261a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r6 = "No name for selected person"
            r7 = 50649(0xc5d9, float:7.0974E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r6)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x032f:
            com.google.assistant.e.j.yp r7 = r6.f134892b
            if (r7 != 0) goto L_0x0335
            com.google.assistant.e.j.yp r7 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
        L_0x0335:
            com.google.protobuf.cq r7 = r7.f138166c
            com.google.assistant.e.j.ade r8 = com.google.assistant.p3897e.p3921j.ade.f134877h
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.add r8 = (com.google.assistant.p3897e.p3921j.add) r8
            java.lang.Object r11 = r7.get(r9)
            com.google.assistant.e.j.yn r11 = (com.google.assistant.p3897e.p3921j.C52621yn) r11
            java.lang.String r11 = r11.f138158c
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.assistant.e.j.ade r12 = (com.google.assistant.p3897e.p3921j.ade) r12
            r11.getClass()
            int r13 = r12.f134879a
            r14 = 8
            r13 = r13 | r14
            r12.f134879a = r13
            r12.f134883e = r11
            java.lang.Object r7 = r7.get(r9)
            com.google.assistant.e.j.yn r7 = (com.google.assistant.p3897e.p3921j.C52621yn) r7
            java.lang.String r7 = r7.f138158c
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.e.j.ade r9 = (com.google.assistant.p3897e.p3921j.ade) r9
            r7.getClass()
            int r11 = r9.f134879a
            r10 = r10 | r11
            r9.f134879a = r10
            r9.f134880b = r7
            r8.mo53673a(r6)
            com.google.protobuf.bv r6 = r8.build()
            com.google.assistant.e.j.ade r6 = (com.google.assistant.p3897e.p3921j.ade) r6
            com.google.protos.an.d.g.b r6 = com.google.android.libraries.search.assistant.fluidactions.p2554e.C33169y.m61531e(r6)
            com.google.knowledge.a.a.j r7 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.a.a.i r7 = (com.google.knowledge.p4661a.p4662a.C61747i) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.knowledge.a.a.j r8 = (com.google.knowledge.p4661a.p4662a.C61748j) r8
            r6.getClass()
            r8.f166803b = r6
            r6 = 9
            r8.f166802a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x03a4:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x03aa:
            int r6 = r11.f137798b
            r7 = 7
            if (r6 != r7) goto L_0x03b4
            java.lang.Object r6 = r11.f137799c
            com.google.assistant.e.j.tx r6 = (com.google.assistant.p3897e.p3921j.C52496tx) r6
            goto L_0x03b6
        L_0x03b4:
            com.google.assistant.e.j.tx r6 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c
        L_0x03b6:
            int r7 = r6.f137815a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x046d
            com.google.assistant.e.j.vo r6 = r6.f137816b
            if (r6 != 0) goto L_0x03c1
            com.google.assistant.e.j.vo r6 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x03c1:
            com.google.assistant.e.j.vk r7 = r6.f137912c
            if (r7 != 0) goto L_0x03c7
            com.google.assistant.e.j.vk r7 = com.google.assistant.p3897e.p3921j.C52537vk.f137903c
        L_0x03c7:
            java.lang.String r7 = r7.f137906b
            java.lang.String r6 = r6.f137911b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = " "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.google.protos.an.c.ai r7 = com.google.protos.p4850an.p4854c.C63408ai.f171351e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.an.c.ah r7 = (com.google.protos.p4850an.p4854c.C63407ah) r7
            com.google.protos.an.c.ac r8 = com.google.protos.p4850an.p4854c.C63402ac.f171336b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.protos.an.c.ab r8 = (com.google.protos.p4850an.p4854c.C63401ab) r8
            com.google.protos.an.c.ak r11 = com.google.protos.p4850an.p4854c.C63410ak.f171362e
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.protos.an.c.aj r11 = (com.google.protos.p4850an.p4854c.C63409aj) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.protos.an.c.ak r12 = (com.google.protos.p4850an.p4854c.C63410ak) r12
            r12.f171366c = r9
            int r9 = r12.f171364a
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r12.f171364a = r9
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.protos.an.c.ak r9 = (com.google.protos.p4850an.p4854c.C63410ak) r9
            int r12 = r9.f171364a
            r12 = r12 | 1024(0x400, float:1.435E-42)
            r9.f171364a = r12
            r9.f171365b = r6
            com.google.protobuf.bv r6 = r11.build()
            com.google.protos.an.c.ak r6 = (com.google.protos.p4850an.p4854c.C63410ak) r6
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.protos.an.c.ac r9 = (com.google.protos.p4850an.p4854c.C63402ac) r9
            r6.getClass()
            r9.mo59212a()
            com.google.protobuf.cq r9 = r9.f171338a
            r9.add(r6)
            com.google.protobuf.bv r6 = r8.build()
            com.google.protos.an.c.ac r6 = (com.google.protos.p4850an.p4854c.C63402ac) r6
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.protos.an.c.ai r8 = (com.google.protos.p4850an.p4854c.C63408ai) r8
            r6.getClass()
            r8.f171354b = r6
            int r6 = r8.f171353a
            r6 = r6 | r10
            r8.f171353a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.protos.an.c.ai r6 = (com.google.protos.p4850an.p4854c.C63408ai) r6
            com.google.knowledge.a.a.j r7 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.a.a.i r7 = (com.google.knowledge.p4661a.p4662a.C61747i) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.knowledge.a.a.j r8 = (com.google.knowledge.p4661a.p4662a.C61748j) r8
            r6.getClass()
            r8.f166803b = r6
            r6 = 5
            r8.f166802a = r6
            com.google.protobuf.bv r6 = r7.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x046d:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x0473:
            int r6 = r11.f137798b
            r7 = 6
            if (r6 != r7) goto L_0x047d
            java.lang.Object r6 = r11.f137799c
            com.google.assistant.e.j.ti r6 = (com.google.assistant.p3897e.p3921j.C52481ti) r6
            goto L_0x047f
        L_0x047d:
            com.google.assistant.e.j.ti r6 = com.google.assistant.p3897e.p3921j.C52481ti.f137762c
        L_0x047f:
            int r7 = r6.f137764a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x04fd
            com.google.assistant.e.j.qb r6 = r6.f137765b
            if (r6 != 0) goto L_0x048a
            com.google.assistant.e.j.qb r6 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x048a:
            com.google.protos.an.b.d r7 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.an.b.c r7 = (com.google.protos.p4850an.p4853b.C63359c) r7
            com.google.protos.an.b.b r8 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.protos.an.b.a r8 = (com.google.protos.p4850an.p4853b.C63357a) r8
            int r9 = r6.f137482b
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.protos.an.b.b r11 = (com.google.protos.p4850an.p4853b.C63358b) r11
            int r12 = r11.f171218a
            r12 = r12 | r10
            r11.f171218a = r12
            r11.f171219b = r9
            int r9 = r6.f137483c
            int r9 = com.google.protos.p4850an.p4853b.C63378v.m96231a(r9)
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.protos.an.b.b r11 = (com.google.protos.p4850an.p4853b.C63358b) r11
            int r12 = r9 + -1
            if (r9 == 0) goto L_0x04fb
            r11.f171220c = r12
            int r9 = r11.f171218a
            r9 = r9 | r14
            r11.f171218a = r9
            int r6 = r6.f137484d
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.protos.an.b.b r9 = (com.google.protos.p4850an.p4853b.C63358b) r9
            int r11 = r9.f171218a
            r12 = 4
            r11 = r11 | r12
            r9.f171218a = r11
            r9.f171221d = r6
            com.google.protobuf.bv r6 = r8.build()
            com.google.protos.an.b.b r6 = (com.google.protos.p4850an.p4853b.C63358b) r6
            r7.mo59207b(r6)
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            r6.f171236e = r10
            int r8 = r6.f171232a
            r8 = r8 | 64
            r6.f171232a = r8
            com.google.protobuf.bv r6 = r7.build()
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            com.google.knowledge.a.a.j r6 = com.google.android.libraries.search.assistant.fluidactions.p2554e.C33145a.m61512a(r6)
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x04fb:
            r3 = 0
            throw r3
        L_0x04fd:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x0503:
            int r6 = r11.f137798b
            r7 = 5
            if (r6 != r7) goto L_0x050d
            java.lang.Object r6 = r11.f137799c
            com.google.assistant.e.j.uj r6 = (com.google.assistant.p3897e.p3921j.C52509uj) r6
            goto L_0x050f
        L_0x050d:
            com.google.assistant.e.j.uj r6 = com.google.assistant.p3897e.p3921j.C52509uj.f137841c
        L_0x050f:
            int r7 = r6.f137843a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x0585
            com.google.assistant.e.j.ql r6 = r6.f137844b
            if (r6 != 0) goto L_0x051a
            com.google.assistant.e.j.ql r6 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x051a:
            com.google.protos.an.b.d r7 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.an.b.c r7 = (com.google.protos.p4850an.p4853b.C63359c) r7
            com.google.protos.an.b.b r8 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.protos.an.b.a r8 = (com.google.protos.p4850an.p4853b.C63357a) r8
            int r9 = r6.f137515b
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.protos.an.b.b r11 = (com.google.protos.p4850an.p4853b.C63358b) r11
            int r12 = r11.f171218a
            r12 = r12 | 16
            r11.f171218a = r12
            r11.f171222e = r9
            int r9 = r6.f137516c
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.protos.an.b.b r11 = (com.google.protos.p4850an.p4853b.C63358b) r11
            int r12 = r11.f171218a
            r12 = r12 | 32
            r11.f171218a = r12
            r11.f171223f = r9
            int r6 = r6.f137517d
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.protos.an.b.b r9 = (com.google.protos.p4850an.p4853b.C63358b) r9
            int r11 = r9.f171218a
            r11 = r11 | 64
            r9.f171218a = r11
            r9.f171224g = r6
            com.google.protobuf.bv r6 = r8.build()
            com.google.protos.an.b.b r6 = (com.google.protos.p4850an.p4853b.C63358b) r6
            r7.mo59207b(r6)
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            r6.f171236e = r10
            int r8 = r6.f171232a
            r8 = r8 | 64
            r6.f171232a = r8
            com.google.protobuf.bv r6 = r7.build()
            com.google.protos.an.b.d r6 = (com.google.protos.p4850an.p4853b.C63360d) r6
            com.google.knowledge.a.a.j r6 = com.google.android.libraries.search.assistant.fluidactions.p2554e.C33145a.m61512a(r6)
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x0585:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x058b:
            int r6 = r11.f137798b
            r7 = 3
            if (r6 != r7) goto L_0x0595
            java.lang.Object r6 = r11.f137799c
            com.google.assistant.e.j.to r6 = (com.google.assistant.p3897e.p3921j.C52487to) r6
            goto L_0x0597
        L_0x0595:
            com.google.assistant.e.j.to r6 = com.google.assistant.p3897e.p3921j.C52487to.f137774c
        L_0x0597:
            int r7 = r6.f137776a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x05dd
            java.lang.String r6 = r6.f137777b
            com.google.knowledge.a.a.j r7 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.knowledge.a.a.i r7 = (com.google.knowledge.p4661a.p4662a.C61747i) r7
            com.google.knowledge.a.a.t r8 = com.google.knowledge.p4661a.p4662a.C61758t.f166824c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.knowledge.a.a.s r8 = (com.google.knowledge.p4661a.p4662a.C61757s) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.knowledge.a.a.t r9 = (com.google.knowledge.p4661a.p4662a.C61758t) r9
            r6.getClass()
            r9.f166826a = r10
            r9.f166827b = r6
            r7.copyOnWrite()
            com.google.protobuf.bv r6 = r7.instance
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            com.google.protobuf.bv r8 = r8.build()
            com.google.knowledge.a.a.t r8 = (com.google.knowledge.p4661a.p4662a.C61758t) r8
            r8.getClass()
            r6.f166803b = r8
            r8 = 3
            r6.f166802a = r8
            com.google.protobuf.bv r6 = r7.build()
            com.google.knowledge.a.a.j r6 = (com.google.knowledge.p4661a.p4662a.C61748j) r6
            j$.util.Optional r3 = com.google.android.libraries.search.assistant.fluidactions.p2535a.p2537b.C32945a.m60962a(r3, r6)
            goto L_0x0025
        L_0x05dd:
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0025
        L_0x05e3:
            java.lang.Object r3 = r3.orElse(r6)
            com.google.assistant.e.j.hf r3 = (com.google.assistant.p3897e.p3921j.C52154hf) r3
            if (r3 == 0) goto L_0x0632
            com.google.protobuf.bn r2 = r4.toBuilder()
            java.lang.String r4 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.assistant.e.j.ds r2 = (com.google.assistant.p3897e.p3921j.C51803ds) r2
            com.google.assistant.e.j.oh r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo53834d()
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            com.google.assistant.e.j.adu r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            java.lang.String r6 = "assistant.api.client_input.IntentUpdateInput"
            r4.mo53678c(r6)
            com.google.protobuf.z r3 = r3.toByteString()
            java.lang.String r6 = "intentUpdateInput.toByteString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r6)
            r4.mo53677b(r3)
            com.google.assistant.e.j.ka r3 = r4.mo53676a()
            r2.mo53833c(r5, r3)
            com.google.assistant.e.j.du r2 = r2.mo53831a()
            com.google.assistant.e.j.ek r2 = m60957e(r2)
            r0.m60956d(r1, r2)
            return
        L_0x0632:
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x064d
            java.lang.String r3 = r4.f135927b
            java.lang.String r5 = "ui.FORM_INPUT"
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r3, r5)
            if (r3 == 0) goto L_0x0645
            goto L_0x064d
        L_0x0645:
            com.google.assistant.e.j.ek r2 = m60957e(r4)
            r0.m60956d(r1, r2)
            return
        L_0x064d:
            com.google.assistant.e.j.ek r2 = m60958f(r2, r4)
            r0.m60956d(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2535a.p2536a.C32943a.mo38364a(java.lang.String, com.google.assistant.e.j.tt, com.google.assistant.e.c.c.dg):void");
    }

    /* renamed from: b */
    public final void mo38365b(String str, C51805du duVar) {
        C69664n.m101061g(duVar, "clientInput");
        C52078ek e = m60957e(duVar);
        String str2 = duVar.f135927b;
        m60956d(str, e);
    }

    /* renamed from: c */
    public final void mo38366c(String str, C52492tt ttVar) {
        C69664n.m101061g(ttVar, "formInput");
        C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
        C69664n.m101060f(dsVar, "newBuilder()");
        m60956d(str, m60958f(ttVar, C69664n.m101061g(dsVar, "builder").mo53831a()));
    }
}
