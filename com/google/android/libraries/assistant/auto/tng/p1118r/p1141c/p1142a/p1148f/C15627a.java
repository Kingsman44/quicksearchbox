package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.f.a */
/* compiled from: PG */
public final /* synthetic */ class C15627a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C15628b f46723a;

    /* renamed from: b */
    public final /* synthetic */ C15666r f46724b;

    public /* synthetic */ C15627a(C15628b bVar, C15666r rVar) {
        this.f46723a = bVar;
        this.f46724b = rVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r14 = this;
            com.google.android.libraries.assistant.auto.tng.r.c.a.f.b r0 = r14.f46723a
            com.google.android.libraries.assistant.auto.tng.r.c.b.r r1 = r14.f46724b
            g.a.a r0 = r0.f46726b
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "MediaControlFulfiller"
            if (r0 != 0) goto L_0x002b
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Media control is not enabled on AAE."
            r2 = 46229(0xb495, float:6.478E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x01a8
        L_0x002b:
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r0 = r1.mo22476b()
            int r0 = r0.mo22462b()
            int r3 = r0 + -1
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "media.STOP"
            java.lang.String r4 = "media.PAUSE"
            java.lang.String r5 = "media.RESUME"
            java.lang.String r6 = ""
            java.lang.String r7 = "media.PREVIOUS"
            java.lang.String r8 = "media.NEXT"
            if (r3 == 0) goto L_0x0132
            r9 = 2
            r10 = 1
            if (r3 == r10) goto L_0x008a
            if (r3 == r9) goto L_0x004f
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x01a8
        L_0x004f:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Handling media control fulfillment through conversation delta"
            r2 = 46227(0xb493, float:6.4778E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.assistant.e.e.a.j r0 = com.google.assistant.p3897e.p3910e.p3911a.C51195j.f133264n
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.e.a.e r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51190e) r0
            com.google.assistant.e.j.en r1 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.e.a.j r2 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r2
            r1.getClass()
            r2.f133275j = r1
            int r1 = r2.f133266a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.f133266a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.e.a.j r0 = (com.google.assistant.p3897e.p3910e.p3911a.C51195j) r0
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x01a8
        L_0x008a:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r11, r2)
            java.lang.String r11 = "Handling media control fulfillment through intent query"
            r12 = 46226(0xb492, float:6.4776E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r12)).mo56386p(r11)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r1 = r1.mo22476b()
            com.google.knowledge.a.a.n r1 = r1.mo22470d()
            java.lang.String r3 = r1.f166811b
            int r11 = r3.hashCode()
            r12 = 4
            r13 = 3
            switch(r11) {
                case -1090849647: goto L_0x00d9;
                case -365932152: goto L_0x00cf;
                case 515454733: goto L_0x00c5;
                case 799095313: goto L_0x00bb;
                case 870216797: goto L_0x00b1;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            goto L_0x00e3
        L_0x00b1:
            java.lang.String r11 = "StopPlayback"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00e3
            r3 = 4
            goto L_0x00e4
        L_0x00bb:
            java.lang.String r11 = "PausePlayback"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00e3
            r3 = 3
            goto L_0x00e4
        L_0x00c5:
            java.lang.String r11 = "PreviousMedia"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00e3
            r3 = 1
            goto L_0x00e4
        L_0x00cf:
            java.lang.String r11 = "ResumePlayback"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00e3
            r3 = 2
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r11 = "NextMedia"
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00e3
            r3 = 0
            goto L_0x00e4
        L_0x00e3:
            r3 = -1
        L_0x00e4:
            if (r3 == 0) goto L_0x0122
            if (r3 == r10) goto L_0x011d
            if (r3 == r9) goto L_0x0118
            if (r3 == r13) goto L_0x0113
            if (r3 == r12) goto L_0x010e
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r2 = 46224(0xb490, float:6.4774E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r2 = "IntentQuery is not related to media control or is not supported: %s"
            java.lang.String r1 = r1.f166811b
            r0.mo56389s(r2, r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x0126
        L_0x010e:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0126
        L_0x0113:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x0126
        L_0x0118:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0126
        L_0x011d:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x0126
        L_0x0122:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r8)
        L_0x0126:
            java.lang.Object r0 = r0.mo56109e(r6)
            java.lang.String r0 = (java.lang.String) r0
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.m32368b(r0)
            goto L_0x01a8
        L_0x0132:
            com.google.common.f.e r3 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r9, r2)
            java.lang.String r9 = "Handling media control fulfillment through analyzer response"
            r10 = 46228(0xb494, float:6.4779E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r9)
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r1 = r1.mo22476b()
            com.google.protos.an.f r1 = r1.mo22461a()
            com.google.protobuf.bt r3 = com.google.protos.p4850an.p4855d.p4858c.C63498af.f171735f
            java.lang.Object r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15669a.m32464c(r1, r3)
            com.google.protos.an.d.c.af r1 = (com.google.protos.p4850an.p4855d.p4858c.C63498af) r1
            if (r1 == 0) goto L_0x01a6
            com.google.common.base.b r3 = com.google.common.base.C58836b.f156633a
            int r9 = r1.f171737a
            r10 = r9 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L_0x0164
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r8)
            goto L_0x019b
        L_0x0164:
            r8 = r9 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x016d
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r7)
            goto L_0x019b
        L_0x016d:
            r7 = r9 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0176
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x019b
        L_0x0176:
            r5 = r9 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x017f
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r4)
            goto L_0x019b
        L_0x017f:
            r4 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0188
            com.google.common.base.ax r3 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x019b
        L_0x0188:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.f46725a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r4, r2)
            java.lang.String r2 = "MediaAction is not related to media control or is not supported: %s"
            r4 = 46225(0xb491, float:6.4775E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r2, r1)
        L_0x019b:
            java.lang.Object r0 = r3.mo56109e(r6)
            java.lang.String r0 = (java.lang.String) r0
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15628b.m32368b(r0)
            goto L_0x01a8
        L_0x01a6:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x01a8:
            return r0
        L_0x01a9:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1148f.C15627a.call():java.lang.Object");
    }
}
