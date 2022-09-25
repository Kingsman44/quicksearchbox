package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124109ch;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4541l.C59326i;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57003m;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57004n;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57016h;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.h */
/* compiled from: PG */
public final class C123910h implements C123911i {

    /* renamed from: a */
    public static final C59071e f342257a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.h");

    /* renamed from: e */
    private static final C58528ij f342258e = C58528ij.m90011K(C57016h.FLIGHT_STATUS, C57016h.RENDERABLE_FLIGHT_STATUS);

    /* renamed from: b */
    public final Context f342259b;

    /* renamed from: c */
    public final Optional f342260c;

    /* renamed from: d */
    public final C124109ch f342261d;

    /* renamed from: f */
    private final Executor f342262f;

    /* renamed from: g */
    private final boolean f342263g;

    public C123910h(Context context, Optional optional, Executor executor, boolean z, C124109ch chVar) {
        this.f342259b = context;
        this.f342260c = optional;
        this.f342262f = executor;
        this.f342261d = chVar;
        this.f342263g = z;
    }

    /* renamed from: d */
    static byte[] m203208d(MessageLite messageLite) {
        C59326i iVar = C59326i.f157517e;
        byte[] byteArray = messageLite.toByteArray();
        return iVar.mo56837l(byteArray, byteArray.length).getBytes(Charset.defaultCharset());
    }

    /* renamed from: e */
    private static C57004n m203209e(Intent intent) {
        byte[] h = m203212h(intent);
        if (h == null) {
            return C57004n.f152167g;
        }
        try {
            return (C57004n) ((C57003m) ((C57003m) C57004n.f152167g.createBuilder()).mergeFrom(h, C62921ba.m95368a())).build();
        } catch (C62974ct e) {
            throw new IllegalStateException("Bad push message received over GCM", e);
        }
    }

    /* renamed from: f */
    private static Boolean m203210f(Intent intent) {
        String str;
        if (intent == null || !"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            str = BuildConfig.FLAVOR;
        } else {
            str = intent.getStringExtra("message_type");
            if (str == null) {
                str = "gcm";
            }
        }
        if (!"gcm".equals(str)) {
            C59104x d = f342257a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.GcmManager");
            ((C59052c) ((C59052c) d).mo56372aa(35198)).mo56386p("Invalid GCM push message type.");
            return false;
        } else if (m203212h(intent) != null) {
            return true;
        } else {
            C59104x d2 = f342257a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.GcmManager");
            ((C59052c) ((C59052c) d2).mo56372aa(35197)).mo56386p("GCM push is empty or missing raw_data_key.");
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005e */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m203211g(com.google.p4283bv.p4345d.p4350b.p4352b.C57004n r7) {
        /*
            boolean r0 = r7.f152170b
            if (r0 != 0) goto L_0x0018
            int r0 = r7.f152171c
            int r0 = com.google.p4283bv.p4345d.p4350b.p4352b.C57002l.m88252a(r0)
            if (r0 != 0) goto L_0x000d
            goto L_0x0011
        L_0x000d:
            r1 = 2
            if (r0 != r1) goto L_0x0011
            goto L_0x0018
        L_0x0011:
            com.google.protobuf.z r7 = r7.f152172d
            byte[] r7 = r7.mo59174N()
            return r7
        L_0x0018:
            com.google.protobuf.z r7 = r7.f152172d
            byte[] r7 = r7.mo59174N()
            com.google.protobuf.y r0 = com.google.protobuf.C63088z.m96150v()
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x005f }
            com.google.protobuf.z r7 = com.google.protobuf.C63088z.m96139A(r7)     // Catch:{ IOException -> 0x005f }
            java.io.InputStream r7 = r7.mo59041m()     // Catch:{ IOException -> 0x005f }
            r1.<init>(r7)     // Catch:{ IOException -> 0x005f }
            r7 = 1024(0x400, float:1.435E-42)
            r2 = 0
            byte[] r3 = new byte[r7]     // Catch:{ all -> 0x0042 }
        L_0x0034:
            int r4 = r1.read(r3, r2, r7)     // Catch:{ all -> 0x0042 }
            if (r4 <= 0) goto L_0x003e
            r0.write(r3, r2, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x0034
        L_0x003e:
            r1.close()     // Catch:{ IOException -> 0x005f }
            goto L_0x0075
        L_0x0042:
            r7 = move-exception
            r1.close()     // Catch:{ all -> 0x0047 }
            goto L_0x005e
        L_0x0047:
            r1 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x005e }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x005e }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x005e }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x005e }
            r3[r2] = r1     // Catch:{ Exception -> 0x005e }
            r4.invoke(r7, r3)     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            throw r7     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            r7 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124119e.f342803a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "PCP.GZipProto"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "GZIP decompress failure"
            r3 = 35385(0x8a39, float:4.9585E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r7)).mo56372aa(r3)).mo56386p(r2)
        L_0x0075:
            com.google.protobuf.z r7 = r0.mo59165b()
            byte[] r7 = r7.mo59174N()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r0 = r7.length
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C123910h.m203211g(com.google.bv.d.b.b.n):byte[]");
    }

    /* renamed from: h */
    private static byte[] m203212h(Intent intent) {
        if (!intent.hasExtra("rawData") || intent.getByteArrayExtra("rawData") == null) {
            return null;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("rawData");
        byteArrayExtra.getClass();
        return C63088z.m96139A(byteArrayExtra).mo59174N();
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0236 A[Catch:{ ct -> 0x032d }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x023a A[Catch:{ ct -> 0x032d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo106161a(android.content.Intent r20, com.google.apps.tiktok.account.AccountId r21) {
        /*
            r19 = this;
            r8 = r19
            r0 = r21
            java.lang.String r9 = "PCP.GcmManager"
            java.lang.Boolean r1 = m203210f(r20)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0013
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        L_0x0013:
            com.google.bv.d.b.b.n r1 = m203209e(r20)
            byte[] r1 = m203211g(r1)
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x032d }
            com.google.bv.d.b.c.i r3 = com.google.p4283bv.p4345d.p4350b.p4353c.C57017i.f152204o     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r1, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x032d }
            com.google.bv.d.b.c.i r1 = (com.google.p4283bv.p4345d.p4350b.p4353c.C57017i) r1     // Catch:{ ct -> 0x032d }
            int r2 = r1.f152207b     // Catch:{ ct -> 0x032d }
            com.google.bv.d.b.c.h r2 = com.google.p4283bv.p4345d.p4350b.p4353c.C57016h.m88253a(r2)     // Catch:{ ct -> 0x032d }
            com.google.bv.d.b.c.h r3 = com.google.p4283bv.p4345d.p4350b.p4353c.C57016h.WEATHER_CONDITION     // Catch:{ ct -> 0x032d }
            r4 = 4
            r10 = 2
            r11 = 1
            if (r2 != r3) goto L_0x01ea
            int r2 = r1.f152207b     // Catch:{ ct -> 0x032d }
            if (r2 != r10) goto L_0x003d
            java.lang.Object r1 = r1.f152208c     // Catch:{ ct -> 0x032d }
            com.google.ai.b.zm r1 = (com.google.p375ai.p378b.C8207zm) r1     // Catch:{ ct -> 0x032d }
            goto L_0x003f
        L_0x003d:
            com.google.ai.b.zm r1 = com.google.p375ai.p378b.C8207zm.f28820n     // Catch:{ ct -> 0x032d }
        L_0x003f:
            int r2 = r1.f28822a     // Catch:{ ct -> 0x032d }
            r3 = r2 & 1
            if (r3 == 0) goto L_0x019f
            r3 = r2 & 2
            if (r3 == 0) goto L_0x019f
            r3 = r2 & 4
            if (r3 == 0) goto L_0x019f
            r2 = r2 & 16
            if (r2 == 0) goto L_0x019f
            int r2 = r1.f28823b     // Catch:{ ct -> 0x032d }
            java.lang.String r3 = r1.f28824c     // Catch:{ ct -> 0x032d }
            java.lang.String r3 = r1.f28825d     // Catch:{ ct -> 0x032d }
            java.lang.String r5 = r1.f28826e     // Catch:{ ct -> 0x032d }
            boolean r6 = r1.f28827f     // Catch:{ ct -> 0x032d }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r7 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gc r7 = (com.google.assistant.p3994s.p3995a.C53228gc) r7     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gg r12 = com.google.assistant.p3994s.p3995a.C53232gg.GCM_PUSH     // Catch:{ ct -> 0x032d }
            r7.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r13 = r7.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r13 = (com.google.assistant.p3994s.p3995a.C53245gt) r13     // Catch:{ ct -> 0x032d }
            int r12 = r12.f139522g     // Catch:{ ct -> 0x032d }
            r13.f139568b = r12     // Catch:{ ct -> 0x032d }
            int r12 = r13.f139567a     // Catch:{ ct -> 0x032d }
            r12 = r12 | r11
            r13.f139567a = r12     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.ge r12 = com.google.assistant.p3994s.p3995a.C53230ge.f139503j     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gd r12 = (com.google.assistant.p3994s.p3995a.C53229gd) r12     // Catch:{ ct -> 0x032d }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ ct -> 0x032d }
            r12.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.ge r13 = (com.google.assistant.p3994s.p3995a.C53230ge) r13     // Catch:{ ct -> 0x032d }
            r2.getClass()     // Catch:{ ct -> 0x032d }
            int r14 = r13.f139505a     // Catch:{ ct -> 0x032d }
            r14 = r14 | r10
            r13.f139505a = r14     // Catch:{ ct -> 0x032d }
            r13.f139507c = r2     // Catch:{ ct -> 0x032d }
            r12.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r2 = r12.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2     // Catch:{ ct -> 0x032d }
            r3.getClass()     // Catch:{ ct -> 0x032d }
            int r13 = r2.f139505a     // Catch:{ ct -> 0x032d }
            r13 = r13 | 64
            r2.f139505a = r13     // Catch:{ ct -> 0x032d }
            r2.f139512h = r3     // Catch:{ ct -> 0x032d }
            r12.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r2 = r12.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2     // Catch:{ ct -> 0x032d }
            r5.getClass()     // Catch:{ ct -> 0x032d }
            int r3 = r2.f139505a     // Catch:{ ct -> 0x032d }
            r3 = r3 | r11
            r2.f139505a = r3     // Catch:{ ct -> 0x032d }
            r2.f139506b = r5     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r2 = r12.build()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.ge r2 = (com.google.assistant.p3994s.p3995a.C53230ge) r2     // Catch:{ ct -> 0x032d }
            r7.mo53966b(r2)     // Catch:{ ct -> 0x032d }
            r7.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r2 = r7.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r2 = (com.google.assistant.p3994s.p3995a.C53245gt) r2     // Catch:{ ct -> 0x032d }
            int r3 = r2.f139567a     // Catch:{ ct -> 0x032d }
            r3 = r3 | 32
            r2.f139567a = r3     // Catch:{ ct -> 0x032d }
            r2.f139574h = r6     // Catch:{ ct -> 0x032d }
            int r2 = r1.f28822a     // Catch:{ ct -> 0x032d }
            r2 = r2 & 32
            if (r2 != 0) goto L_0x00e1
            com.google.protobuf.bv r1 = r7.build()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ ct -> 0x032d }
            goto L_0x01a7
        L_0x00e1:
            com.google.ai.b.zl r1 = r1.f28828g     // Catch:{ ct -> 0x032d }
            if (r1 != 0) goto L_0x00e7
            com.google.ai.b.zl r1 = com.google.p375ai.p378b.C8206zl.f28815c     // Catch:{ ct -> 0x032d }
        L_0x00e7:
            java.lang.String r2 = r1.f28817a     // Catch:{ ct -> 0x032d }
            boolean r2 = r2.isEmpty()     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x0194
            com.google.ai.b.zk r2 = r1.f28818b     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x00f5
            com.google.ai.b.zk r2 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
        L_0x00f5:
            com.google.ai.b.zj r2 = r2.f28813b     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x00fb
            com.google.ai.b.zj r2 = com.google.p375ai.p378b.C8204zj.f28806b     // Catch:{ ct -> 0x032d }
        L_0x00fb:
            java.lang.String r2 = r2.f28808a     // Catch:{ ct -> 0x032d }
            boolean r2 = r2.isEmpty()     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x0194
            com.google.ai.b.zk r2 = r1.f28818b     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x0109
            com.google.ai.b.zk r2 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
        L_0x0109:
            java.lang.String r2 = r2.f28812a     // Catch:{ ct -> 0x032d }
            boolean r2 = r2.isEmpty()     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x0194
            com.google.assistant.s.a.gm r2 = com.google.assistant.p3994s.p3995a.C53238gm.f139535e     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gl r2 = (com.google.assistant.p3994s.p3995a.C53237gl) r2     // Catch:{ ct -> 0x032d }
            java.lang.String r3 = r1.f28817a     // Catch:{ ct -> 0x032d }
            r2.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gm r5 = (com.google.assistant.p3994s.p3995a.C53238gm) r5     // Catch:{ ct -> 0x032d }
            r3.getClass()     // Catch:{ ct -> 0x032d }
            int r6 = r5.f139537a     // Catch:{ ct -> 0x032d }
            r6 = r6 | r11
            r5.f139537a = r6     // Catch:{ ct -> 0x032d }
            r5.f139538b = r3     // Catch:{ ct -> 0x032d }
            com.google.ai.b.zk r3 = r1.f28818b     // Catch:{ ct -> 0x032d }
            if (r3 != 0) goto L_0x0132
            com.google.ai.b.zk r3 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
        L_0x0132:
            com.google.ai.b.zj r3 = r3.f28813b     // Catch:{ ct -> 0x032d }
            if (r3 != 0) goto L_0x0138
            com.google.ai.b.zj r3 = com.google.p375ai.p378b.C8204zj.f28806b     // Catch:{ ct -> 0x032d }
        L_0x0138:
            java.lang.String r3 = r3.f28808a     // Catch:{ ct -> 0x032d }
            r2.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gm r5 = (com.google.assistant.p3994s.p3995a.C53238gm) r5     // Catch:{ ct -> 0x032d }
            r3.getClass()     // Catch:{ ct -> 0x032d }
            int r6 = r5.f139537a     // Catch:{ ct -> 0x032d }
            r6 = r6 | r10
            r5.f139537a = r6     // Catch:{ ct -> 0x032d }
            r5.f139539c = r3     // Catch:{ ct -> 0x032d }
            com.google.ai.b.zk r3 = r1.f28818b     // Catch:{ ct -> 0x032d }
            if (r3 != 0) goto L_0x0151
            com.google.ai.b.zk r3 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
        L_0x0151:
            java.lang.String r3 = r3.f28812a     // Catch:{ ct -> 0x032d }
            r2.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gm r5 = (com.google.assistant.p3994s.p3995a.C53238gm) r5     // Catch:{ ct -> 0x032d }
            r3.getClass()     // Catch:{ ct -> 0x032d }
            int r6 = r5.f139537a     // Catch:{ ct -> 0x032d }
            r4 = r4 | r6
            r5.f139537a = r4     // Catch:{ ct -> 0x032d }
            r5.f139540d = r3     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gm r2 = (com.google.assistant.p3994s.p3995a.C53238gm) r2     // Catch:{ ct -> 0x032d }
            r7.copyOnWrite()     // Catch:{ ct -> 0x032d }
            com.google.protobuf.bv r3 = r7.instance     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r3 = (com.google.assistant.p3994s.p3995a.C53245gt) r3     // Catch:{ ct -> 0x032d }
            r2.getClass()     // Catch:{ ct -> 0x032d }
            r3.f139578l = r2     // Catch:{ ct -> 0x032d }
            int r2 = r3.f139567a     // Catch:{ ct -> 0x032d }
            r2 = r2 | 512(0x200, float:7.175E-43)
            r3.f139567a = r2     // Catch:{ ct -> 0x032d }
            java.lang.String r2 = r1.f28817a     // Catch:{ ct -> 0x032d }
            com.google.ai.b.zk r1 = r1.f28818b     // Catch:{ ct -> 0x032d }
            if (r1 != 0) goto L_0x0185
            com.google.ai.b.zk r2 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
            goto L_0x0186
        L_0x0185:
            r2 = r1
        L_0x0186:
            com.google.ai.b.zj r2 = r2.f28813b     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x018c
            com.google.ai.b.zj r2 = com.google.p375ai.p378b.C8204zj.f28806b     // Catch:{ ct -> 0x032d }
        L_0x018c:
            java.lang.String r2 = r2.f28808a     // Catch:{ ct -> 0x032d }
            if (r1 != 0) goto L_0x0192
            com.google.ai.b.zk r1 = com.google.p375ai.p378b.C8205zk.f28810c     // Catch:{ ct -> 0x032d }
        L_0x0192:
            java.lang.String r1 = r1.f28812a     // Catch:{ ct -> 0x032d }
        L_0x0194:
            com.google.protobuf.bv r1 = r7.build()     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.gt r1 = (com.google.assistant.p3994s.p3995a.C53245gt) r1     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ ct -> 0x032d }
            goto L_0x01a7
        L_0x019f:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x032d }
            int r1 = r1.f28822a     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x032d }
        L_0x01a7:
            boolean r2 = r1.isEmpty()     // Catch:{ ct -> 0x032d }
            if (r2 == 0) goto L_0x01b0
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ ct -> 0x032d }
            return r0
        L_0x01b0:
            java.lang.Object r1 = r1.get()     // Catch:{ ct -> 0x032d }
            r4 = r1
            com.google.assistant.s.a.gt r4 = (com.google.assistant.p3994s.p3995a.C53245gt) r4     // Catch:{ ct -> 0x032d }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ ct -> 0x032d }
            r7.<init>()     // Catch:{ ct -> 0x032d }
            com.google.common.b.gp r10 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x032d }
            android.content.Context r1 = r8.f342259b     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.b.b r3 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r0)     // Catch:{ ct -> 0x032d }
            com.google.android.libraries.storage.b.e r11 = r3.f341550b     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.a r12 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.a     // Catch:{ ct -> 0x032d }
            r1 = r12
            r2 = r19
            r5 = r21
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r0 = r11.mo45938b(r12)     // Catch:{ ct -> 0x032d }
            r7.add(r0)     // Catch:{ ct -> 0x032d }
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r7)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.b r1 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.b     // Catch:{ ct -> 0x032d }
            r1.<init>(r8, r10)     // Catch:{ ct -> 0x032d }
            java.util.concurrent.Executor r2 = r8.f342262f     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r0 = r0.mo51521b(r1, r2)     // Catch:{ ct -> 0x032d }
            return r0
        L_0x01ea:
            com.google.common.b.ij r2 = f342258e     // Catch:{ ct -> 0x032d }
            int r3 = r1.f152207b     // Catch:{ ct -> 0x032d }
            com.google.bv.d.b.c.h r3 = com.google.p4283bv.p4345d.p4350b.p4353c.C57016h.m88253a(r3)     // Catch:{ ct -> 0x032d }
            boolean r2 = r2.contains(r3)     // Catch:{ ct -> 0x032d }
            if (r2 == 0) goto L_0x0341
            com.google.common.b.gu r1 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131656f.m214099a(r1)     // Catch:{ ct -> 0x032d }
            boolean r2 = r1.isEmpty()     // Catch:{ ct -> 0x032d }
            r12 = 0
            if (r2 != 0) goto L_0x022a
            java.lang.Object r2 = r1.get(r12)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.gsa.opa.smartspace.ak r2 = (com.google.android.apps.gsa.opa.smartspace.C83739ak) r2     // Catch:{ ct -> 0x032d }
            com.google.android.apps.gsa.opa.smartspace.aj r2 = r2.f228233b     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x020f
            com.google.android.apps.gsa.opa.smartspace.aj r2 = com.google.android.apps.gsa.opa.smartspace.C83738aj.f228226c     // Catch:{ ct -> 0x032d }
        L_0x020f:
            int r2 = r2.f228228a     // Catch:{ ct -> 0x032d }
            if (r2 != r4) goto L_0x022a
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.g r2 = com.google.android.apps.search.assistant.platform.pcp.featuredata.C123909g.f342256a     // Catch:{ ct -> 0x032d }
            j$.util.stream.Stream r1 = r1.map(r2)     // Catch:{ ct -> 0x032d }
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ ct -> 0x032d }
            java.lang.Object r1 = r1.collect(r2)     // Catch:{ ct -> 0x032d }
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)     // Catch:{ ct -> 0x032d }
            goto L_0x0230
        L_0x022a:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = p3186j$.util.Optional.empty()     // Catch:{ ct -> 0x032d }
        L_0x0230:
            boolean r2 = r1.isEmpty()     // Catch:{ ct -> 0x032d }
            if (r2 == 0) goto L_0x023a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ ct -> 0x032d }
            goto L_0x032c
        L_0x023a:
            java.lang.Object r1 = r1.get()     // Catch:{ ct -> 0x032d }
            r13 = r1
            com.google.common.b.gu r13 = (com.google.common.p4522b.C58485gu) r13     // Catch:{ ct -> 0x032d }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ ct -> 0x032d }
            r14.<init>()     // Catch:{ ct -> 0x032d }
            com.google.common.b.gp r15 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x032d }
            android.content.Context r1 = r8.f342259b     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.b.b r7 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r0)     // Catch:{ ct -> 0x032d }
            int r6 = r13.size()     // Catch:{ ct -> 0x032d }
            r5 = 0
        L_0x0255:
            if (r5 >= r6) goto L_0x02d0
            java.lang.Object r1 = r13.get(r5)     // Catch:{ ct -> 0x032d }
            r4 = r1
            com.google.assistant.s.a.es r4 = (com.google.assistant.p3994s.p3995a.C53190es) r4     // Catch:{ ct -> 0x032d }
            java.lang.String r1 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131655e.m214096e(r4)     // Catch:{ ct -> 0x032d }
            j$.util.Optional r1 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131656f.m214100b(r1)     // Catch:{ ct -> 0x032d }
            boolean r2 = r1.isPresent()     // Catch:{ ct -> 0x032d }
            if (r2 != 0) goto L_0x0286
            com.google.common.f.e r1 = f342257a     // Catch:{ ct -> 0x032d }
            com.google.common.f.x r1 = r1.mo56226d()     // Catch:{ ct -> 0x032d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x032d }
            r1.mo56378ag(r2, r9)     // Catch:{ ct -> 0x032d }
            java.lang.String r2 = "No departure time is flight status data, drop the update"
            r3 = 35192(0x8978, float:4.9314E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)     // Catch:{ ct -> 0x032d }
            r17 = r5
            r18 = r6
            r16 = r7
            goto L_0x02c7
        L_0x0286:
            java.lang.Object r1 = r1.get()     // Catch:{ ct -> 0x032d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ct -> 0x032d }
            long r1 = r1.longValue()     // Catch:{ ct -> 0x032d }
            j$.time.Instant r3 = p3186j$.time.Instant.ofEpochMilli(r1)     // Catch:{ ct -> 0x032d }
            com.google.common.f.e r1 = f342257a     // Catch:{ ct -> 0x032d }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ ct -> 0x032d }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x032d }
            r1.mo56378ag(r2, r9)     // Catch:{ ct -> 0x032d }
            java.lang.String r2 = "build flight with start time: %s"
            r11 = 35191(0x8977, float:4.9313E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r11)).mo56389s(r2, r3)     // Catch:{ ct -> 0x032d }
            com.google.android.libraries.storage.b.e r11 = r7.f341550b     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.c r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.c     // Catch:{ ct -> 0x032d }
            r1 = r2
            r12 = r2
            r2 = r19
            r16 = r3
            r3 = r7
            r17 = r5
            r5 = r21
            r18 = r6
            r6 = r16
            r16 = r7
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r1 = r11.mo45938b(r12)     // Catch:{ ct -> 0x032d }
            r14.add(r1)     // Catch:{ ct -> 0x032d }
        L_0x02c7:
            int r5 = r17 + 1
            r7 = r16
            r6 = r18
            r11 = 1
            r12 = 0
            goto L_0x0255
        L_0x02d0:
            com.google.apps.tiktok.tracing.contrib.b.j r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84752c(r14)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.d r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.d     // Catch:{ ct -> 0x032d }
            r2.<init>(r8, r15)     // Catch:{ ct -> 0x032d }
            java.util.concurrent.Executor r3 = r8.f342262f     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r1 = r1.mo51521b(r2, r3)     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.j r3 = com.google.assistant.p3994s.p3995a.C53306j.BLUECHIP_SMARTSPACE_TNG     // Catch:{ ct -> 0x032d }
            com.google.assistant.s.a.k r2 = com.google.assistant.p3994s.p3995a.C53333k.FLIGHT     // Catch:{ ct -> 0x032d }
            com.google.common.b.qy r4 = new com.google.common.b.qy     // Catch:{ ct -> 0x032d }
            r4.<init>(r2)     // Catch:{ ct -> 0x032d }
            android.content.Context r2 = r8.f342259b     // Catch:{ ct -> 0x032d }
            java.lang.Class<com.google.android.apps.search.assistant.platform.pcp.g.j$a> r5 = com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j.C124014a.class
            java.lang.Object r0 = com.google.apps.tiktok.inject.C47245e.m84045a(r2, r5, r0)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.g.j$a r0 = (com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j.C124014a) r0     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.g.j r2 = r0.mo106230Z()     // Catch:{ ct -> 0x032d }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r4)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.f r4 = com.google.android.apps.search.assistant.platform.pcp.featuredata.C123908f.f342255a     // Catch:{ ct -> 0x032d }
            j$.util.stream.Stream r0 = r0.map(r4)     // Catch:{ ct -> 0x032d }
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ ct -> 0x032d }
            java.lang.Object r0 = r0.collect(r4)     // Catch:{ ct -> 0x032d }
            com.google.common.b.ij r0 = (com.google.common.p4522b.C58528ij) r0     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.f.bv r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv.f341837o     // Catch:{ ct -> 0x032d }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ ct -> 0x032d }
            r6 = 0
            com.google.android.apps.search.assistant.platform.pcp.f.f r7 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f.f341922a     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r0 = r2.mo106229b(r3, r4, r5, r6, r7)     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r10]     // Catch:{ ct -> 0x032d }
            r3 = 0
            r2[r3] = r1     // Catch:{ ct -> 0x032d }
            r3 = 1
            r2[r3] = r0     // Catch:{ ct -> 0x032d }
            com.google.apps.tiktok.tracing.contrib.b.j r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r2)     // Catch:{ ct -> 0x032d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.e r3 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.e     // Catch:{ ct -> 0x032d }
            r3.<init>(r1, r0)     // Catch:{ ct -> 0x032d }
            java.util.concurrent.Executor r0 = r8.f342262f     // Catch:{ ct -> 0x032d }
            com.google.common.util.concurrent.cx r0 = r2.mo51521b(r3, r0)     // Catch:{ ct -> 0x032d }
        L_0x032c:
            return r0
        L_0x032d:
            r0 = move-exception
            com.google.common.f.e r1 = f342257a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r9)
            java.lang.String r2 = "Failed parsing GCM push message."
            r3 = 35190(0x8976, float:4.9312E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
        L_0x0341:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C123910h.mo106161a(android.content.Intent, com.google.apps.tiktok.account.AccountId):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final boolean mo106162b(Intent intent) {
        if (!m203210f(intent).booleanValue()) {
            return false;
        }
        try {
            if (!f342258e.contains(C57016h.m88253a(((C57017i) C62942bv.parseFrom((C62942bv) C57017i.f152204o, m203211g(m203209e(intent)), C62921ba.m95368a())).f152207b)) || !this.f342263g) {
                return false;
            }
            return true;
        } catch (C62974ct e) {
            C59104x d = f342257a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.GcmManager");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(35199)).mo56386p("Failed parsing GCM push message for flights tng check.");
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo106163c(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (!m203210f(intent).booleanValue()) {
            return false;
        }
        C57004n e = m203209e(intent);
        byte[] g = m203211g(e);
        if (e.f152173e.contains(5)) {
            return false;
        }
        try {
            if (C57016h.m88253a(((C57017i) C62942bv.parseFrom((C62942bv) C57017i.f152204o, g, C62921ba.m95368a())).f152207b) == C57016h.WEATHER_CONDITION) {
                return true;
            }
            return false;
        } catch (C62974ct e2) {
            C59104x d = f342257a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.GcmManager");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(35201)).mo56386p("Failed parsing GCM push message.");
            return false;
        }
    }
}
