package com.google.android.apps.gsa.p8839t.p8847h;

import android.content.Context;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48927aa;
import com.google.assistant.p3803ag.p3809c.C48932af;
import com.google.assistant.p3803ag.p3809c.C48933ag;
import com.google.assistant.p3803ag.p3809c.C48939am;
import com.google.assistant.p3803ag.p3809c.C48949aw;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48966bm;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.t.h.y */
/* compiled from: PG */
public final class C118449y {

    /* renamed from: a */
    private final C58974d f328779a;

    /* renamed from: b */
    private final Context f328780b;

    /* renamed from: c */
    private final C124032d f328781c;

    /* renamed from: d */
    private final C21370a f328782d;

    public C118449y(C83564a aVar, C124032d dVar, C21370a aVar2, Context context) {
        this.f328780b = context;
        this.f328781c = dVar;
        this.f328782d = aVar2;
        this.f328779a = aVar.mo76900a("PCP.EventDataConverter");
    }

    /* renamed from: b */
    private static void m196647b(C48951ay ayVar, C58526ih ihVar) {
        for (C48952az c : ayVar.f126656a) {
            m196648c(c, ihVar);
        }
    }

    /* renamed from: c */
    private static void m196648c(C48952az azVar, C58526ih ihVar) {
        C48971br brVar;
        C48939am amVar;
        C48932af afVar;
        C48951ay ayVar;
        C48951ay ayVar2;
        C48952az azVar2;
        C118447w wVar = C118447w.TIME;
        int i = azVar.f126659a;
        int b = C48949aw.m85320b(i);
        int i2 = b - 1;
        if (b == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                brVar = (C48971br) azVar.f126660b;
            } else {
                brVar = C48971br.f126689d;
            }
            int i3 = brVar.f126691a;
            int a = C48966bm.m85328a(i3);
            int i4 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i4 == 0 || i4 == 1) {
                ihVar.mo55373c(C118447w.TIME);
            } else if (i4 == 8) {
                ihVar.mo55373c(C118447w.PHONE_LOCK_STATE);
            } else if (i4 == 10) {
                if (i3 == 13) {
                    amVar = (C48939am) brVar.f126692b;
                } else {
                    amVar = C48939am.f126628c;
                }
                int a2 = C48933ag.m85310a(amVar.f126630a);
                int i5 = a2 - 1;
                if (a2 == 0) {
                    throw null;
                } else if (i5 == 0) {
                    ihVar.mo55373c(C118447w.WIRED_HEADPHONES_STATE);
                } else if (i5 == 1) {
                    ihVar.mo55373c(C118447w.BLUETOOTH_A2DP_STATE);
                }
            } else if (i4 == 11) {
                if (i3 == 14) {
                    afVar = (C48932af) brVar.f126692b;
                } else {
                    afVar = C48932af.f126610e;
                }
                int a3 = C48927aa.m85308a(afVar.f126614c);
                int i6 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                } else if (i6 == 0) {
                    ihVar.mo55373c(C118447w.INSTALLED_APPS);
                } else if (i6 == 1) {
                    ihVar.mo55373c(C118447w.FOREGROUND_APP);
                }
            }
        } else if (i2 == 1) {
            if (i == 2) {
                ayVar = (C48951ay) azVar.f126660b;
            } else {
                ayVar = C48951ay.f126654b;
            }
            m196647b(ayVar, ihVar);
        } else if (i2 == 2) {
            if (i == 3) {
                ayVar2 = (C48951ay) azVar.f126660b;
            } else {
                ayVar2 = C48951ay.f126654b;
            }
            m196647b(ayVar2, ihVar);
        } else if (i2 == 3) {
            if (i == 4) {
                azVar2 = (C48952az) azVar.f126660b;
            } else {
                azVar2 = C48952az.f126657c;
            }
            m196648c(azVar2, ihVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r6.copyOnWrite();
        r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r6.instance;
        r7.getClass();
        r0.f341813h = r7;
        r0.f341807b |= 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm mo103703a(com.google.android.apps.gsa.p8839t.p8845f.C118365g r19, com.google.assistant.p3994s.p3995a.C53306j r20, com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.protobuf.cq r4 = r0.f328544a
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.gsa.t.h.v r5 = com.google.android.apps.gsa.p8839t.p8847h.C118446v.f328771a
            j$.util.stream.Stream r4 = r4.map(r5)
            j$.util.stream.Collector r5 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r4 = r4.collect(r5)
            java.util.List r4 = (java.util.List) r4
            com.google.common.b.ih r5 = new com.google.common.b.ih
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0027:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0037
            java.lang.Object r6 = r4.next()
            com.google.assistant.ag.c.az r6 = (com.google.assistant.p3803ag.p3809c.C48952az) r6
            m196648c(r6, r5)
            goto L_0x0027
        L_0x0037:
            com.google.common.b.ij r4 = r5.mo55486f()
            com.google.common.base.b r16 = com.google.common.base.C58836b.f156633a
            com.google.common.b.sl r4 = r4.iterator()
            r6 = r16
            r12 = r6
            r13 = r12
            r14 = r13
            r15 = r14
        L_0x0047:
            boolean r5 = r4.hasNext()
            java.lang.String r11 = "PCP.EventDataConverter"
            r10 = 1
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r4.next()
            com.google.android.apps.gsa.t.h.w r5 = (com.google.android.apps.gsa.p8839t.p8847h.C118447w) r5
            com.google.android.apps.gsa.t.h.w r7 = com.google.android.apps.gsa.p8839t.p8847h.C118447w.TIME
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0141
            java.lang.String r7 = "AudioManager is null."
            java.lang.String r8 = "audio"
            if (r5 == r10) goto L_0x0113
            r9 = 2
            if (r5 == r9) goto L_0x00e5
            r7 = 3
            if (r5 == r7) goto L_0x00b3
            r7 = 4
            if (r5 == r7) goto L_0x006e
            goto L_0x0047
        L_0x006e:
            com.google.protobuf.bt r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b.f341777e
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r2.mo58887l(r5)
            com.google.protobuf.bf r7 = r2.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r7.mo58857o(r5)
            if (r5 != 0) goto L_0x0084
            com.google.common.base.b r15 = com.google.common.base.C58836b.f156633a
            goto L_0x0047
        L_0x0084:
            com.google.protobuf.bt r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b.f341777e
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r2.mo58887l(r5)
            com.google.protobuf.bf r7 = r2.f169962ag
            com.google.protobuf.bs r8 = r5.f169971d
            java.lang.Object r7 = r7.mo58854l(r8)
            if (r7 != 0) goto L_0x009a
            java.lang.Object r5 = r5.f169969b
            goto L_0x009e
        L_0x009a:
            java.lang.Object r5 = r5.mo58889c(r7)
        L_0x009e:
            com.google.android.apps.search.assistant.platform.pcp.f.b r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b) r5
            int r7 = r5.f341779a
            r7 = r7 & r10
            if (r7 == 0) goto L_0x00b0
            com.google.android.apps.search.assistant.platform.pcp.f.t r5 = r5.f341780b
            if (r5 != 0) goto L_0x00ab
            com.google.android.apps.search.assistant.platform.pcp.f.t r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t.f341978d
        L_0x00ab:
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0047
        L_0x00b0:
            com.google.common.base.b r15 = com.google.common.base.C58836b.f156633a
            goto L_0x0047
        L_0x00b3:
            android.content.Context r5 = r1.f328780b
            java.lang.String r7 = "keyguard"
            java.lang.Object r5 = r5.getSystemService(r7)
            android.app.KeyguardManager r5 = (android.app.KeyguardManager) r5
            if (r5 != 0) goto L_0x00d4
            com.google.common.f.a.d r5 = r1.f328779a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r11)
            java.lang.String r7 = "KeyguardManager is null."
            r8 = 6968(0x1b38, float:9.764E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r8)).mo56386p(r7)
            com.google.assistant.ag.c.cn r5 = com.google.assistant.p3803ag.p3809c.C48994cn.UNSPECIFIED_STATE
            goto L_0x00df
        L_0x00d4:
            boolean r5 = r5.isDeviceLocked()
            if (r5 == 0) goto L_0x00dd
            com.google.assistant.ag.c.cn r5 = com.google.assistant.p3803ag.p3809c.C48994cn.PHONE_LOCKED
            goto L_0x00df
        L_0x00dd:
            com.google.assistant.ag.c.cn r5 = com.google.assistant.p3803ag.p3809c.C48994cn.PHONE_UNLOCKED
        L_0x00df:
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0047
        L_0x00e5:
            android.content.Context r5 = r1.f328780b
            java.lang.Object r5 = r5.getSystemService(r8)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 != 0) goto L_0x0102
            com.google.common.f.a.d r5 = r1.f328779a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r11)
            r8 = 6966(0x1b36, float:9.761E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r8)).mo56386p(r7)
            com.google.assistant.ag.c.ai r5 = com.google.assistant.p3803ag.p3809c.C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS
            goto L_0x010d
        L_0x0102:
            boolean r5 = r5.isBluetoothA2dpOn()
            if (r5 == 0) goto L_0x010b
            com.google.assistant.ag.c.ai r5 = com.google.assistant.p3803ag.p3809c.C48935ai.BLUETOOTH_A2DP_ON
            goto L_0x010d
        L_0x010b:
            com.google.assistant.ag.c.ai r5 = com.google.assistant.p3803ag.p3809c.C48935ai.BLUETOOTH_A2DP_OFF
        L_0x010d:
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0047
        L_0x0113:
            android.content.Context r5 = r1.f328780b
            java.lang.Object r5 = r5.getSystemService(r8)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 != 0) goto L_0x0130
            com.google.common.f.a.d r5 = r1.f328779a
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r8, r11)
            r8 = 6967(0x1b37, float:9.763E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r5).mo56372aa(r8)).mo56386p(r7)
            com.google.assistant.ag.c.al r5 = com.google.assistant.p3803ag.p3809c.C48938al.UNKNOWN_WIRED_HEADPHONE_STATUS
            goto L_0x013b
        L_0x0130:
            boolean r5 = r5.isWiredHeadsetOn()
            if (r5 == 0) goto L_0x0139
            com.google.assistant.ag.c.al r5 = com.google.assistant.p3803ag.p3809c.C48938al.PLUGGED
            goto L_0x013b
        L_0x0139:
            com.google.assistant.ag.c.al r5 = com.google.assistant.p3803ag.p3809c.C48938al.UNPLUGGED
        L_0x013b:
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0047
        L_0x0141:
            com.google.android.libraries.f.a r5 = r1.f328782d
            long r5 = r5.mo26870b()
            j$.time.Instant r5 = p3186j$.time.Instant.ofEpochMilli(r5)
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r5)
            goto L_0x0047
        L_0x0151:
            com.google.android.apps.gsa.t.h.a r2 = new com.google.android.apps.gsa.t.h.a
            r5 = r2
            r7 = r16
            r8 = r16
            r9 = r16
            r4 = 1
            r10 = r16
            r17 = r11
            r11 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.protobuf.cq r0 = r0.f328544a
            java.util.Iterator r5 = r0.iterator()
        L_0x016a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0246
            java.lang.Object r0 = r5.next()
            com.google.android.apps.gsa.t.f.e r0 = (com.google.android.apps.gsa.p8839t.p8845f.C118363e) r0
            int r6 = r0.f328534a
            r7 = 1048576(0x100000, float:1.469368E-39)
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0193
            com.google.android.apps.search.assistant.platform.pcp.h.d r6 = r1.f328781c
            com.google.assistant.ag.c.az r7 = r0.f328540g
            if (r7 != 0) goto L_0x0185
            com.google.assistant.ag.c.az r7 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
        L_0x0185:
            boolean r6 = r6.mo106244a(r7, r2)
            if (r6 != 0) goto L_0x0193
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r9 = r20
        L_0x018f:
            r8 = r17
            goto L_0x023f
        L_0x0193:
            com.google.android.apps.search.assistant.platform.pcp.f.bk r6 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk.f341804l
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.bj r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj) r6
            com.google.protobuf.bn r6 = r0.toBuilder()     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.gsa.t.f.d r6 = (com.google.android.apps.gsa.p8839t.p8845f.C118362d) r6     // Catch:{ ct -> 0x0226 }
            r6.copyOnWrite()     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.gsa.t.f.e r7 = (com.google.android.apps.gsa.p8839t.p8845f.C118363e) r7     // Catch:{ ct -> 0x0226 }
            r8 = 0
            r7.f328540g = r8     // Catch:{ ct -> 0x0226 }
            int r8 = r7.f328534a     // Catch:{ ct -> 0x0226 }
            r9 = -1048577(0xffffffffffefffff, float:NaN)
            r8 = r8 & r9
            r7.f328534a = r8     // Catch:{ ct -> 0x0226 }
            r6.copyOnWrite()     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.bv r7 = r6.instance     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.gsa.t.f.e r7 = (com.google.android.apps.gsa.p8839t.p8845f.C118363e) r7     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.cq r8 = com.google.android.apps.gsa.p8839t.p8845f.C118363e.emptyProtobufList()     // Catch:{ ct -> 0x0226 }
            r7.f328539f = r8     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.bv r6 = r6.build()     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.gsa.t.f.e r6 = (com.google.android.apps.gsa.p8839t.p8845f.C118363e) r6     // Catch:{ ct -> 0x0226 }
            byte[] r6 = r6.toByteArray()     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.search.assistant.platform.pcp.f.bk r8 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk.f341804l     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r6, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.search.assistant.platform.pcp.f.bk r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r6     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.bn r6 = r6.toBuilder()     // Catch:{ ct -> 0x0226 }
            com.google.android.apps.search.assistant.platform.pcp.f.bj r6 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj) r6     // Catch:{ ct -> 0x0226 }
            com.google.protobuf.cq r0 = r0.f328539f     // Catch:{ ct -> 0x0226 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ct -> 0x0226 }
        L_0x01e2:
            boolean r7 = r0.hasNext()     // Catch:{ ct -> 0x0226 }
            if (r7 == 0) goto L_0x0216
            java.lang.Object r7 = r0.next()     // Catch:{ ct -> 0x0226 }
            com.google.assistant.s.a.nl r7 = (com.google.assistant.p3994s.p3995a.C53426nl) r7     // Catch:{ ct -> 0x0226 }
            int r8 = r7.f140207a     // Catch:{ ct -> 0x0226 }
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0213
            int r8 = r7.f140213g     // Catch:{ ct -> 0x0226 }
            com.google.assistant.s.a.j r8 = com.google.assistant.p3994s.p3995a.C53306j.m86809a(r8)     // Catch:{ ct -> 0x0226 }
            if (r8 != 0) goto L_0x01fd
            com.google.assistant.s.a.j r8 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN     // Catch:{ ct -> 0x0226 }
        L_0x01fd:
            r9 = r20
            if (r8 != r9) goto L_0x01e2
            r6.copyOnWrite()     // Catch:{ ct -> 0x0224 }
            com.google.protobuf.bv r0 = r6.instance     // Catch:{ ct -> 0x0224 }
            com.google.android.apps.search.assistant.platform.pcp.f.bk r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r0     // Catch:{ ct -> 0x0224 }
            r7.getClass()     // Catch:{ ct -> 0x0224 }
            r0.f341813h = r7     // Catch:{ ct -> 0x0224 }
            int r7 = r0.f341807b     // Catch:{ ct -> 0x0224 }
            r7 = r7 | r4
            r0.f341807b = r7     // Catch:{ ct -> 0x0224 }
            goto L_0x0218
        L_0x0213:
            r9 = r20
            goto L_0x01e2
        L_0x0216:
            r9 = r20
        L_0x0218:
            com.google.protobuf.bv r0 = r6.build()     // Catch:{ ct -> 0x0224 }
            com.google.android.apps.search.assistant.platform.pcp.f.bk r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r0     // Catch:{ ct -> 0x0224 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ ct -> 0x0224 }
            goto L_0x018f
        L_0x0224:
            r0 = move-exception
            goto L_0x0229
        L_0x0226:
            r0 = move-exception
            r9 = r20
        L_0x0229:
            com.google.common.f.a.d r6 = r1.f328779a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8 = r17
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "Catch InvalidProtocolBufferException"
            r10 = 6969(0x1b39, float:9.766E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56382g(r0)).mo56372aa(r10)).mo56386p(r7)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x023f:
            r3.mo55395g(r0)
            r17 = r8
            goto L_0x016a
        L_0x0246:
            com.google.android.apps.search.assistant.platform.pcp.f.bm r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm.f341818b
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.bl r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl) r0
            com.google.common.b.gu r2 = r3.mo55394f()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.t.h.t r3 = com.google.android.apps.gsa.p8839t.p8847h.C118444t.f328769a
            j$.util.stream.Stream r2 = r2.filter(r3)
            com.google.android.apps.gsa.t.h.u r3 = com.google.android.apps.gsa.p8839t.p8847h.C118445u.f328770a
            j$.util.stream.Stream r2 = r2.map(r3)
            j$.util.stream.Collector r3 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r3)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0.mo106124a(r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.assistant.platform.pcp.f.bm r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p8839t.p8847h.C118449y.mo103703a(com.google.android.apps.gsa.t.f.g, com.google.assistant.s.a.j, com.google.android.apps.search.assistant.platform.pcp.f.f):com.google.android.apps.search.assistant.platform.pcp.f.bm");
    }
}
