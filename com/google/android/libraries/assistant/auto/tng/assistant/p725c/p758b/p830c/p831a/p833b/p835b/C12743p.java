package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import com.google.android.libraries.assistant.auto.tng.p1098n.p1100b.C15465a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1324b.C16844j;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35894aw;
import com.google.android.libraries.search.assistant.performer.deviceactions.C35897az;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.p */
/* compiled from: PG */
public final class C12743p extends C22538o {

    /* renamed from: b */
    private static final C59071e f39867b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.p");

    /* renamed from: a */
    public final C69464a f39868a;

    /* renamed from: c */
    private final Executor f39869c;

    /* renamed from: d */
    private final C16844j f39870d;

    /* renamed from: e */
    private final C35894aw f39871e;

    /* renamed from: f */
    private final boolean f39872f;

    public C12743p(C15465a aVar, C35897az azVar, Executor executor, C69464a aVar2, C16844j jVar, boolean z) {
        this.f39869c = executor;
        this.f39868a = aVar2;
        this.f39870d = jVar;
        this.f39872f = z;
        this.f39871e = azVar.mo39877a(aVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r13, com.google.android.libraries.gsa.conversation.clientop.C22434e r14) {
        /*
            r12 = this;
            com.google.assistant.e.j.dw r14 = r13.f135938d
            if (r14 != 0) goto L_0x0006
            com.google.assistant.e.j.dw r14 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x0006:
            com.google.assistant.e.j.fu r0 = com.google.assistant.p3897e.p3921j.C52115fu.f136753n
            com.google.protobuf.eb r0 = r0.getParserForType()
            java.lang.String r1 = "modify_setting_args"
            j$.util.Optional r14 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12875h.m29134b(r14, r1, r0)
            java.lang.String r0 = "device.MODIFY_SETTING"
            java.lang.String r1 = r13.f135936b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x019a
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0024
            goto L_0x019a
        L_0x0024:
            java.lang.Object r14 = r14.get()
            com.google.assistant.e.j.fu r14 = (com.google.assistant.p3897e.p3921j.C52115fu) r14
            java.lang.String r0 = r14.f136760f
            int r1 = r0.hashCode()
            java.lang.String r2 = "test_drive_record_consent"
            java.lang.String r3 = "test_drive_vehicle_speed"
            java.lang.String r4 = "test_drive_transcript"
            java.lang.String r5 = "test_drive_fan_speed"
            java.lang.String r6 = "test_drive_query_counter"
            java.lang.String r7 = "test_drive_window_state"
            java.lang.String r8 = "test_drive_ac_state"
            r9 = 0
            r10 = 2
            r11 = 1
            switch(r1) {
                case -1539704682: goto L_0x0075;
                case -1221315356: goto L_0x006d;
                case -285764509: goto L_0x0065;
                case -269616647: goto L_0x005d;
                case 347983256: goto L_0x0055;
                case 460761170: goto L_0x004d;
                case 777914126: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x007d
        L_0x0045:
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007d
            r0 = 0
            goto L_0x007e
        L_0x004d:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007d
            r0 = 2
            goto L_0x007e
        L_0x0055:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x007d
            r0 = 6
            goto L_0x007e
        L_0x005d:
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x007d
            r0 = 3
            goto L_0x007e
        L_0x0065:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x007d
            r0 = 5
            goto L_0x007e
        L_0x006d:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x007d
            r0 = 1
            goto L_0x007e
        L_0x0075:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x007d
            r0 = 4
            goto L_0x007e
        L_0x007d:
            r0 = -1
        L_0x007e:
            switch(r0) {
                case 0: goto L_0x0088;
                case 1: goto L_0x0088;
                case 2: goto L_0x0088;
                case 3: goto L_0x0088;
                case 4: goto L_0x0088;
                case 5: goto L_0x0088;
                case 6: goto L_0x0088;
                default: goto L_0x0081;
            }
        L_0x0081:
            com.google.android.libraries.search.assistant.performer.deviceactions.aw r14 = r12.f39871e
            com.google.common.util.concurrent.cx r13 = r14.mo20766a(r13)
            return r13
        L_0x0088:
            boolean r13 = r12.f39872f
            if (r13 == 0) goto L_0x0193
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60866ct.f164955a
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b5
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            int r0 = r14.f136757c
            int r0 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r0)
            if (r0 != 0) goto L_0x00a1
            goto L_0x00a4
        L_0x00a1:
            if (r0 != r10) goto L_0x00a4
            r9 = 1
        L_0x00a4:
            long r0 = r14.f136763i
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.c r2 = new com.google.android.libraries.assistant.auto.tng.v.b.c
            r2.<init>(r13, r9, r0)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r2, r13)
            goto L_0x0183
        L_0x00b5:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00da
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            int r14 = r14.f136757c
            int r14 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14)
            if (r14 != 0) goto L_0x00c8
            goto L_0x00cb
        L_0x00c8:
            if (r14 != r10) goto L_0x00cb
            r9 = 1
        L_0x00cb:
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.e r0 = new com.google.android.libraries.assistant.auto.tng.v.b.e
            r0.<init>(r9)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r0, r13)
            goto L_0x0183
        L_0x00da:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f6
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            double r0 = r14.f136758d
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.h r2 = new com.google.android.libraries.assistant.auto.tng.v.b.h
            int r0 = (int) r0
            r2.<init>(r0)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r2, r13)
            goto L_0x0183
        L_0x00f6:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0112
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            double r0 = r14.f136758d
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.a r2 = new com.google.android.libraries.assistant.auto.tng.v.b.a
            int r0 = (int) r0
            r2.<init>(r0)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r2, r13)
            goto L_0x0183
        L_0x0112:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0136
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            int r14 = r14.f136757c
            int r14 = com.google.assistant.p3897e.p3921j.C52112fr.m86508b(r14)
            if (r14 != 0) goto L_0x0125
            goto L_0x0128
        L_0x0125:
            if (r14 != r10) goto L_0x0128
            r9 = 1
        L_0x0128:
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.i r0 = new com.google.android.libraries.assistant.auto.tng.v.b.i
            r0.<init>(r9)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r0, r13)
            goto L_0x0183
        L_0x0136:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0151
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            double r0 = r14.f136758d
            com.google.android.libraries.storage.protostore.ab r14 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.g r2 = new com.google.android.libraries.assistant.auto.tng.v.b.g
            int r0 = (int) r0
            r2.<init>(r0)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r14.mo46039a(r2, r13)
            goto L_0x0183
        L_0x0151:
            java.lang.String r0 = r14.f136760f
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x016b
            com.google.android.libraries.assistant.auto.tng.v.b.j r13 = r12.f39870d
            java.lang.String r14 = r14.f136767m
            com.google.android.libraries.storage.protostore.ab r0 = r13.f49304a
            com.google.android.libraries.assistant.auto.tng.v.b.b r1 = new com.google.android.libraries.assistant.auto.tng.v.b.b
            r1.<init>(r14)
            com.google.common.util.concurrent.db r13 = r13.f49305b
            com.google.common.util.concurrent.cx r13 = r0.mo46039a(r1, r13)
            goto L_0x0183
        L_0x016b:
            com.google.common.f.e r0 = f39867b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 44423(0xad87, float:6.225E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "Unexpected Client op id: %s"
            java.lang.String r14 = r14.f136760f
            r0.mo56389s(r1, r14)
        L_0x0183:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.o r14 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.o
            r14.<init>(r12)
            java.util.concurrent.Executor r0 = r12.f39869c
            com.google.common.base.ah r14 = com.google.apps.tiktok.tracing.C47810es.m84963c(r14)
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60922j.m93044g(r13, r14, r0)
            goto L_0x0199
        L_0x0193:
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39969d
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
        L_0x0199:
            return r13
        L_0x019a:
            com.google.common.f.e r13 = f39867b
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r14 = "Invalid device.MODIFY_SETTING client op"
            r0 = 44424(0xad88, float:6.2251E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r0)).mo56386p(r14)
            com.google.assistant.e.j.ec r13 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a.f39966a
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b.C12743p.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
