package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.d.a.a */
/* compiled from: PG */
public final /* synthetic */ class C76668a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C76669b f211926a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f211927b;

    /* renamed from: c */
    public final /* synthetic */ Optional f211928c;

    /* renamed from: d */
    public final /* synthetic */ Optional f211929d;

    public /* synthetic */ C76668a(C76669b bVar, C74965n nVar, Optional optional, Optional optional2) {
        this.f211926a = bVar;
        this.f211927b = nVar;
        this.f211928c = optional;
        this.f211929d = optional2;
    }

    /* JADX WARNING: type inference failed for: r3v10, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r3v25, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.nga.engine.o.d.d.a.b r0 = r10.f211926a
            com.google.android.apps.gsa.nga.engine.am.u.n r1 = r10.f211927b
            j$.util.Optional r2 = r10.f211928c
            j$.util.Optional r3 = r10.f211929d
            com.google.android.apps.gsa.x.c r11 = (com.google.android.apps.gsa.p8883x.C118826c) r11
            com.google.android.libraries.gsa.conversation.h.w r11 = new com.google.android.libraries.gsa.conversation.h.w
            r11.<init>()
            com.google.android.apps.gsa.shared.util.v.g r4 = r0.f211935f
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248068b
            boolean r4 = r4.mo85405j(r5)
            if (r4 == 0) goto L_0x00fd
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r3 = r3.get()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            com.google.android.apps.gsa.nga.engine.s.e r4 = r0.f211930a
            com.google.assistant.e.j.ex r4 = r4.mo72873a()
            java.util.Iterator r3 = r3.iterator()
        L_0x002f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00f8
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.j.ep r5 = (com.google.assistant.p3897e.p3921j.C52083ep) r5
            int r6 = r5.f136692b
            r7 = 3
            if (r6 != r7) goto L_0x0045
            java.lang.Object r6 = r5.f136693c
            com.google.assistant.e.j.ek r6 = (com.google.assistant.p3897e.p3921j.C52078ek) r6
            goto L_0x0047
        L_0x0045:
            com.google.assistant.e.j.ek r6 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0047:
            int r6 = r6.f136674b
            if (r6 != r7) goto L_0x002f
            int r6 = r5.f136692b
            if (r6 != r7) goto L_0x0054
            java.lang.Object r5 = r5.f136693c
            com.google.assistant.e.j.ek r5 = (com.google.assistant.p3897e.p3921j.C52078ek) r5
            goto L_0x0056
        L_0x0054:
            com.google.assistant.e.j.ek r5 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0056:
            int r6 = r5.f136674b
            if (r6 != r7) goto L_0x005f
            java.lang.Object r5 = r5.f136675c
            com.google.assistant.e.j.ec r5 = (com.google.assistant.p3897e.p3921j.C52070ec) r5
            goto L_0x0061
        L_0x005f:
            com.google.assistant.e.j.ec r5 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0061:
            com.google.assistant.e.j.eb r5 = r5.f136655c
            if (r5 != 0) goto L_0x0067
            com.google.assistant.e.j.eb r5 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x0067:
            com.google.protobuf.ba r6 = new com.google.protobuf.ba
            r6.<init>()
            com.google.protobuf.bt r7 = com.google.assistant.p3795af.p3796a.p3797a.C48775a.f126216h
            r6.mo58832e(r7)
            com.google.protobuf.cq r5 = r5.f136650a
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b5
            java.lang.Object r7 = r5.next()
            com.google.assistant.e.j.kc r7 = (com.google.assistant.p3897e.p3921j.C52232kc) r7
            java.lang.String r8 = "app_control_result"
            java.lang.String r9 = r7.f137065b
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0077
            com.google.assistant.e.j.ka r5 = r7.f137066c     // Catch:{ ct -> 0x00a2 }
            if (r5 != 0) goto L_0x0093
            com.google.assistant.e.j.ka r5 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00a2 }
        L_0x0093:
            com.google.protobuf.z r5 = r5.f137061c     // Catch:{ ct -> 0x00a2 }
            com.google.assistant.e.j.ai r7 = com.google.assistant.p3897e.p3921j.C51677ai.f135125a     // Catch:{ ct -> 0x00a2 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (com.google.protobuf.C63088z) r5, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x00a2 }
            com.google.assistant.e.j.ai r5 = (com.google.assistant.p3897e.p3921j.C51677ai) r5     // Catch:{ ct -> 0x00a2 }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ ct -> 0x00a2 }
            goto L_0x00b9
        L_0x00a2:
            r5 = move-exception
            com.google.common.f.a.d r6 = com.google.android.apps.gsa.nga.engine.p5994c.p5995a.p5997b.C75316g.f209787a
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "Parsing AppControl ClientOpResult failed"
            r8 = 2848(0xb20, float:3.991E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56382g(r5)).mo56372aa(r8)).mo56386p(r7)
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            goto L_0x00b9
        L_0x00b5:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
        L_0x00b9:
            boolean r6 = r5.isPresent()
            if (r6 == 0) goto L_0x002f
            java.lang.Object r3 = r5.get()
            com.google.assistant.e.j.ai r3 = (com.google.assistant.p3897e.p3921j.C51677ai) r3
            com.google.protobuf.bt r5 = com.google.assistant.p3795af.p3796a.p3797a.C48775a.f126216h
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r3.mo58887l(r5)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r3 = r3.mo58854l(r6)
            if (r3 != 0) goto L_0x00db
            java.lang.Object r3 = r5.f169969b
            goto L_0x00df
        L_0x00db:
            java.lang.Object r3 = r5.mo58889c(r3)
        L_0x00df:
            com.google.assistant.f.c.f r3 = (com.google.assistant.p3931f.p3939c.C52829f) r3
            com.google.protobuf.bn r4 = r4.toBuilder()
            com.google.assistant.e.j.ew r4 = (com.google.assistant.p3897e.p3921j.C52090ew) r4
            com.google.android.apps.gsa.nga.shared.c.a r5 = com.google.android.apps.gsa.nga.shared.p6335c.C81018a.f222071j
            com.google.android.apps.gsa.nga.engine.c.a.b.f r6 = new com.google.android.apps.gsa.nga.engine.c.a.b.f
            r6.<init>(r3)
            r5.mo74803c(r4, r6)
            com.google.protobuf.bv r3 = r4.build()
            r4 = r3
            com.google.assistant.e.j.ex r4 = (com.google.assistant.p3897e.p3921j.C52091ex) r4
        L_0x00f8:
            r11.mo27876c(r4)
            goto L_0x0198
        L_0x00fd:
            com.google.android.apps.gsa.nga.engine.c.a.b.g r3 = r0.f211936g
            j$.util.Optional r4 = r0.f211932c
            com.google.android.apps.gsa.nga.engine.s.e r5 = r0.f211930a
            com.google.assistant.e.j.ex r5 = r5.mo72873a()
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x010f
            goto L_0x0195
        L_0x010f:
            java.lang.Object r6 = r4.get()
            com.google.android.apps.gsa.nga.engine.c.a.a r6 = (com.google.android.apps.gsa.nga.engine.p5994c.p5995a.C75310a) r6
            com.google.android.apps.gsa.nga.shared.x.h r6 = r6.mo71656c()
            java.lang.Object r6 = r6.mo76657c()
            j$.util.Optional r6 = (p3186j$.util.Optional) r6
            com.google.android.apps.gsa.nga.engine.c.a.b.b r7 = com.google.android.apps.gsa.nga.engine.c.a.b.b.a
            j$.util.Optional r7 = r6.flatMap(r7)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x012c
            goto L_0x0195
        L_0x012c:
            com.google.assistant.e.i.a.r r8 = com.google.assistant.p3897e.p3917i.p3918a.C51628r.f134549b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.i.a.q r8 = (com.google.assistant.p3897e.p3917i.p3918a.C51627q) r8
            com.google.android.apps.gsa.nga.engine.c.a.b.c r9 = com.google.android.apps.gsa.nga.engine.c.a.b.c.a
            j$.util.Optional r6 = r6.map(r9)
            com.google.android.apps.gsa.nga.engine.c.a.b.d r9 = new com.google.android.apps.gsa.nga.engine.c.a.b.d
            r9.<init>(r8)
            r6.ifPresent(r9)
            com.google.assistant.e.i.a.w r6 = com.google.assistant.p3897e.p3917i.p3918a.C51633w.f134558c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.i.a.u r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51631u) r6
            com.google.android.apps.gsa.shared.util.v.g r3 = r3.f209788b
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90019by.f248079m
            boolean r3 = r3.mo85405j(r9)
            if (r3 == 0) goto L_0x016c
            java.lang.Object r3 = r4.get()
            com.google.android.apps.gsa.nga.engine.c.a.a r3 = (com.google.android.apps.gsa.nga.engine.p5994c.p5995a.C75310a) r3
            com.google.android.apps.gsa.nga.shared.x.h r3 = r3.mo71657d()
            java.lang.Object r3 = r3.mo76657c()
            j$.util.Optional r3 = (p3186j$.util.Optional) r3
            com.google.android.apps.gsa.nga.engine.c.a.b.e r4 = new com.google.android.apps.gsa.nga.engine.c.a.b.e
            r4.<init>(r6, r7)
            r3.ifPresent(r4)
        L_0x016c:
            java.lang.Object r3 = r7.get()
            java.lang.String r3 = (java.lang.String) r3
            com.google.protobuf.bv r4 = r8.build()
            com.google.assistant.e.i.a.r r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51628r) r4
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.i.a.w r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51633w) r6
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.j.ew r5 = (com.google.assistant.p3897e.p3921j.C52090ew) r5
            com.google.android.apps.gsa.nga.shared.c.a r7 = com.google.android.apps.gsa.nga.shared.p6335c.C81018a.f222071j
            com.google.android.apps.gsa.nga.engine.c.a.b.a r8 = new com.google.android.apps.gsa.nga.engine.c.a.b.a
            r8.<init>(r3, r4, r6)
            r7.mo74803c(r5, r8)
            com.google.protobuf.bv r3 = r5.build()
            r5 = r3
            com.google.assistant.e.j.ex r5 = (com.google.assistant.p3897e.p3921j.C52091ex) r5
        L_0x0195:
            r11.mo27876c(r5)
        L_0x0198:
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x01b0
            com.google.android.apps.gsa.nga.engine.ai.k r3 = r0.f211931b
            java.util.Locale r4 = r0.f211933d
            j$.util.Optional r5 = r1.mo71338m()
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.nga.engine.recognition.ad r2 = (com.google.android.apps.gsa.nga.engine.recognition.C77551ad) r2
            r3.c(r11, r4, r5, r2)
            goto L_0x01c7
        L_0x01b0:
            com.google.android.apps.gsa.nga.engine.ai.k r2 = r0.f211931b
            java.util.Locale r3 = r0.f211933d
            j$.util.Optional r4 = r1.mo71338m()
            com.google.android.apps.gsa.nga.engine.ai.u r2 = r2.a
            com.google.assistant.e.i.a.cs r2 = r2.a(r3, r4)
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.i.a.dw r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r2
            r11.mo27878e(r2)
        L_0x01c7:
            com.google.android.apps.gsa.nga.engine.ai.k r2 = r0.f211931b
            r2.a(r11, r1)
            com.google.android.apps.gsa.nga.engine.ai.k r2 = r0.f211931b
            r2.d(r11)
            com.google.android.apps.gsa.nga.engine.ai.k r2 = r0.f211931b
            com.google.android.apps.gsa.nga.engine.s.h r0 = r0.f211934e
            com.google.android.apps.gsa.nga.shared.v.io r1 = r1.mo71336k()
            com.google.common.v.i r2 = r2.b
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            java.lang.String r4 = ""
            com.google.assistant.e.i.a.ko r0 = com.google.android.apps.gsa.nga.engine.understanding.p6236c.C79028k.m126975d(r0, r4, r1, r2, r3)
            r11.mo27878e(r0)
            com.google.assistant.e.j.ex r11 = r11.mo27874a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6067d.p6068a.C76668a.apply(java.lang.Object):java.lang.Object");
    }
}
