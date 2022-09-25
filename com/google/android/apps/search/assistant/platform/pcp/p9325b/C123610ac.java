package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.app.KeyguardManager;
import android.database.Cursor;
import android.media.AudioManager;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123743bj;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123771ck;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123791t;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124030b;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124041m;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124043o;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.storage.p3315b.C42838ax;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3803ag.p3809c.C48935ai;
import com.google.assistant.p3803ag.p3809c.C48938al;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48994cn;
import com.google.assistant.p3994s.p3995a.C53131cn;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53424nj;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Optional;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71208ar;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71209as;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.ac */
/* compiled from: PG */
public final class C123610ac {

    /* renamed from: a */
    public static final C59071e f341528a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.b.ac");

    /* renamed from: b */
    public static final C31164au f341529b = C31164au.m58092b("PcpV1GetProactiveContent_");

    /* renamed from: c */
    public final C21370a f341530c;

    /* renamed from: d */
    private final boolean f341531d;

    /* renamed from: e */
    private final C124100bz f341532e;

    /* renamed from: f */
    private final C124032d f341533f;

    /* renamed from: g */
    private final C124043o f341534g;

    public C123610ac(C21370a aVar, C124100bz bzVar, C124032d dVar, C124043o oVar, boolean z) {
        this.f341530c = aVar;
        this.f341531d = z;
        this.f341532e = bzVar;
        this.f341533f = dVar;
        this.f341534g = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018f  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk m202927o(android.database.Cursor r9, com.google.android.apps.search.assistant.platform.pcp.p9329f.C123731ay r10) {
        /*
            java.lang.String r0 = "CLIENT_DATA_TYPE"
            int r0 = r9.getColumnIndexOrThrow(r0)
            int r0 = r9.getInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124089bo.m203514b(r1)
            int r2 = r1.intValue()
            java.lang.String r1 = "CLIENT_DATA_ID"
            int r1 = r9.getColumnIndexOrThrow(r1)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r3 = "no_data_from_source"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0033
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r1
            com.google.android.apps.search.assistant.platform.pcp.f.bk r9 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202972f(r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0033:
            java.lang.String r3 = "data_content_hash"
            int r3 = r9.getColumnIndex(r3)
            com.google.android.apps.search.assistant.platform.pcp.f.cl r4 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl.f341902h
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.ck r4 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123771ck) r4
            boolean r5 = r9.isNull(r3)
            if (r5 != 0) goto L_0x0060
            byte[] r3 = r9.getBlob(r3)
            com.google.protobuf.z r3 = com.google.protobuf.C63088z.m96139A(r3)
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.apps.search.assistant.platform.pcp.f.az r10 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az) r10
            com.google.android.apps.search.assistant.platform.pcp.f.az r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123732az.f341771d
            int r5 = r10.f341773a
            r5 = r5 | 4
            r10.f341773a = r5
            r10.f341775c = r3
        L_0x0060:
            java.lang.String r10 = "ve_id"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            r5 = 1
            if (r3 != 0) goto L_0x007f
            int r10 = r9.getInt(r10)
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r3
            int r6 = r3.f341904a
            r6 = r6 | r5
            r3.f341904a = r6
            r3.f341905b = r10
        L_0x007f:
            java.lang.String r10 = "impression_repression"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            r6 = 2
            if (r3 != 0) goto L_0x00a3
            int r10 = r9.getInt(r10)
            if (r10 != r6) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r5 = 0
        L_0x0094:
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r10 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r10
            int r3 = r10.f341904a
            r3 = r3 | 8
            r10.f341904a = r3
            r10.f341908e = r5
        L_0x00a3:
            java.lang.String r10 = "eucd_metadata"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            if (r3 != 0) goto L_0x00d1
            byte[] r10 = r9.getBlob(r10)
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()
            com.google.assistant.s.a.nj r5 = com.google.assistant.p3994s.p3995a.C53424nj.f140199d
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r10, (com.google.protobuf.C62921ba) r3)
            com.google.assistant.s.a.nj r10 = (com.google.assistant.p3994s.p3995a.C53424nj) r10
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r3
            r10.getClass()
            r3.f341907d = r10
            int r10 = r3.f341904a
            r10 = r10 | 4
            r3.f341904a = r10
        L_0x00d1:
            java.lang.String r10 = "feature_tree_ref"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            if (r3 != 0) goto L_0x00fe
            byte[] r10 = r9.getBlob(r10)
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()
            com.google.protos.ai.b.j r5 = com.google.protos.p4816ai.p4818b.C63204j.f170749e
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r10, (com.google.protobuf.C62921ba) r3)
            com.google.protos.ai.b.j r10 = (com.google.protos.p4816ai.p4818b.C63204j) r10
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r3
            r10.getClass()
            r3.f341906c = r10
            int r10 = r3.f341904a
            r10 = r10 | r6
            r3.f341904a = r10
        L_0x00fe:
            java.lang.String r10 = "like_question_configuration"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            r5 = 0
            if (r3 != 0) goto L_0x0148
            byte[] r10 = r9.getBlob(r10)
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()
            com.google.assistant.s.a.cn r7 = com.google.assistant.p3994s.p3995a.C53131cn.f139246c
            com.google.protobuf.bv r10 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r10, (com.google.protobuf.C62921ba) r3)
            com.google.assistant.s.a.cn r10 = (com.google.assistant.p3994s.p3995a.C53131cn) r10
            if (r10 == 0) goto L_0x0136
            int r3 = r10.f139248a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x0136
            java.lang.String r10 = r10.f139249b
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r3
            r10.getClass()
            int r6 = r3.f341904a
            r6 = r6 | 16
            r3.f341904a = r6
            r3.f341909f = r10
        L_0x0136:
            java.lang.String r10 = "as_target_deep_link_id"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            if (r3 != 0) goto L_0x0148
            java.lang.String r10 = r9.getString(r10)
            r6 = r10
            goto L_0x0149
        L_0x0148:
            r6 = r5
        L_0x0149:
            java.lang.String r10 = "rendered_element"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            if (r3 != 0) goto L_0x016c
            byte[] r10 = r9.getBlob(r10)
            com.google.protobuf.z r10 = com.google.protobuf.C63088z.m96139A(r10)
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.android.apps.search.assistant.platform.pcp.f.cl r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r3
            int r7 = r3.f341904a
            r7 = r7 | 32
            r3.f341904a = r7
            r3.f341910g = r10
        L_0x016c:
            java.lang.String r10 = "input_suggestion"
            int r10 = r9.getColumnIndex(r10)
            boolean r3 = r9.isNull(r10)
            r7 = 0
            if (r3 != 0) goto L_0x018f
            byte[] r10 = r9.getBlob(r10)
            java.lang.String r3 = "last_update_timestamp"
            int r3 = r9.getColumnIndex(r3)
            boolean r5 = r9.isNull(r3)
            if (r5 != 0) goto L_0x0190
            long r7 = r9.getLong(r3)
            goto L_0x0190
        L_0x018f:
            r10 = r5
        L_0x0190:
            com.google.protobuf.bv r9 = r4.build()     // Catch:{ ct -> 0x019e }
            r5 = r9
            com.google.android.apps.search.assistant.platform.pcp.f.cl r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl) r5     // Catch:{ ct -> 0x019e }
            r3 = r1
            r4 = r10
            com.google.android.apps.search.assistant.platform.pcp.f.bk r9 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123612ae.m202972f(r2, r3, r4, r5, r6, r7)     // Catch:{ ct -> 0x019e }
            return r9
        L_0x019e:
            r9 = move-exception
            com.google.common.f.e r10 = f341528a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "PCP.Database"
            r10.mo56378ag(r2, r3)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            com.google.common.f.x r9 = r10.mo56382g(r9)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r10 = 35170(0x8962, float:4.9284E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r10)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r10 = "Error converting DataType %s DataId %s for ProactiveData"
            r9.mo56395y(r10, r0, r1)
            com.google.android.apps.search.assistant.platform.pcp.f.bk r9 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk.f341804l
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9325b.C123610ac.m202927o(android.database.Cursor, com.google.android.apps.search.assistant.platform.pcp.f.ay):com.google.android.apps.search.assistant.platform.pcp.f.bk");
    }

    /* renamed from: a */
    public final C123744bk mo106057a(Cursor cursor, C53306j jVar, C123731ay ayVar, C71208ar arVar) {
        String str;
        int i;
        Cursor cursor2 = cursor;
        C123731ay ayVar2 = ayVar;
        if (cursor2.isNull(cursor2.getColumnIndexOrThrow("SHARED_DATA_ID"))) {
            str = cursor2.getString(cursor2.getColumnIndexOrThrow("CLIENT_DATA_ID"));
        } else {
            str = cursor2.getString(cursor2.getColumnIndexOrThrow("SHARED_DATA_ID"));
        }
        if (cursor2.isNull(cursor2.getColumnIndexOrThrow("SHARED_DATA_TYPE"))) {
            i = cursor2.getInt(cursor2.getColumnIndexOrThrow("CLIENT_DATA_TYPE"));
        } else {
            i = cursor2.getInt(cursor2.getColumnIndexOrThrow("SHARED_DATA_TYPE"));
        }
        int i2 = i;
        int intValue = C124089bo.m203514b(Integer.valueOf(i2)).intValue();
        String str2 = jVar.f139793X + "-" + i2 + "-" + str;
        arVar.copyOnWrite();
        C71209as asVar = (C71209as) arVar.instance;
        C71209as asVar2 = C71209as.f190080g;
        C62971cq cqVar = asVar.f190088f;
        if (!cqVar.mo58948c()) {
            asVar.f190088f = C62942bv.mutableCopy(cqVar);
        }
        asVar.f190088f.add(str2);
        if (!str.equals("no_data_from_source")) {
            byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("data_content"));
            int columnIndex = cursor2.getColumnIndex("hash_tag");
            if (!cursor2.isNull(columnIndex)) {
                C63088z A = C63088z.m96139A(cursor2.getBlob(columnIndex));
                ayVar.copyOnWrite();
                C123732az azVar = (C123732az) ayVar2.instance;
                C123732az azVar2 = C123732az.f341771d;
                azVar.f341773a |= 1;
                azVar.f341774b = A;
            }
            int columnIndex2 = cursor2.getColumnIndex("data_content_hash");
            C123771ck ckVar = (C123771ck) C123772cl.f341902h.createBuilder();
            try {
                String str3 = null;
                if (!cursor2.isNull(columnIndex2)) {
                    C63088z A2 = C63088z.m96139A(cursor2.getBlob(columnIndex2));
                    ayVar.copyOnWrite();
                    C123732az azVar3 = (C123732az) ayVar2.instance;
                    C123732az azVar4 = C123732az.f341771d;
                    azVar3.f341773a |= 4;
                    azVar3.f341775c = A2;
                    int columnIndex3 = cursor2.getColumnIndex("ve_id");
                    if (!cursor2.isNull(columnIndex3)) {
                        int i3 = cursor2.getInt(columnIndex3);
                        ckVar.copyOnWrite();
                        C123772cl clVar = (C123772cl) ckVar.instance;
                        clVar.f341904a |= 1;
                        clVar.f341905b = i3;
                    }
                    int columnIndex4 = cursor2.getColumnIndex("impression_repression");
                    if (!cursor2.isNull(columnIndex4)) {
                        boolean z = cursor2.getInt(columnIndex4) == 2;
                        ckVar.copyOnWrite();
                        C123772cl clVar2 = (C123772cl) ckVar.instance;
                        clVar2.f341904a |= 8;
                        clVar2.f341908e = z;
                    }
                    int columnIndex5 = cursor2.getColumnIndex("eucd_metadata");
                    if (!cursor2.isNull(columnIndex5)) {
                        C53424nj njVar = (C53424nj) C62942bv.parseFrom((C62942bv) C53424nj.f140199d, cursor2.getBlob(columnIndex5), C62921ba.m95368a());
                        ckVar.copyOnWrite();
                        C123772cl clVar3 = (C123772cl) ckVar.instance;
                        njVar.getClass();
                        clVar3.f341907d = njVar;
                        clVar3.f341904a |= 4;
                    }
                    int columnIndex6 = cursor2.getColumnIndex("feature_tree_ref");
                    if (!cursor2.isNull(columnIndex6)) {
                        C63204j jVar2 = (C63204j) C62942bv.parseFrom((C62942bv) C63204j.f170749e, cursor2.getBlob(columnIndex6), C62921ba.m95368a());
                        ckVar.copyOnWrite();
                        C123772cl clVar4 = (C123772cl) ckVar.instance;
                        jVar2.getClass();
                        clVar4.f341906c = jVar2;
                        clVar4.f341904a |= 2;
                    }
                    int columnIndex7 = cursor2.getColumnIndex("like_question_configuration");
                    if (!cursor2.isNull(columnIndex7)) {
                        C53131cn cnVar = (C53131cn) C62942bv.parseFrom((C62942bv) C53131cn.f139246c, cursor2.getBlob(columnIndex7), C62921ba.m95368a());
                        if (!(cnVar == null || (cnVar.f139248a & 2) == 0)) {
                            String str4 = cnVar.f139249b;
                            ckVar.copyOnWrite();
                            C123772cl clVar5 = (C123772cl) ckVar.instance;
                            str4.getClass();
                            clVar5.f341904a |= 16;
                            clVar5.f341909f = str4;
                        }
                    }
                    int columnIndex8 = cursor2.getColumnIndex("as_target_deep_link_id");
                    if (!cursor2.isNull(columnIndex8)) {
                        str3 = cursor2.getString(columnIndex8);
                    }
                    int columnIndex9 = cursor2.getColumnIndex("rendered_element");
                    if (!cursor2.isNull(columnIndex9)) {
                        C63088z A3 = C63088z.m96139A(cursor2.getBlob(columnIndex9));
                        ckVar.copyOnWrite();
                        C123772cl clVar6 = (C123772cl) ckVar.instance;
                        clVar6.f341904a |= 32;
                        clVar6.f341910g = A3;
                    }
                }
                String str5 = str3;
                int columnIndex10 = cursor2.getColumnIndex("input_suggestion");
                byte[] blob2 = !cursor2.isNull(columnIndex10) ? cursor2.getBlob(columnIndex10) : blob;
                int columnIndex11 = cursor2.getColumnIndex("last_update_timestamp");
                return C123612ae.m202972f(intValue, str, blob2, (C123772cl) ckVar.build(), str5, !cursor2.isNull(columnIndex11) ? cursor2.getLong(columnIndex11) : 0);
            } catch (C62974ct e) {
                throw new IllegalArgumentException(String.format("Failed to parse protocol buffer to dataType %s dataId %s", new Object[]{Integer.valueOf(i2), str}), e);
            }
        } else if (this.f341531d) {
            C123743bj bjVar = (C123743bj) C123744bk.f341804l.createBuilder();
            bjVar.copyOnWrite();
            C123744bk bkVar = (C123744bk) bjVar.instance;
            bkVar.f341806a |= 4;
            bkVar.f341812g = "no_data_from_source";
            bjVar.copyOnWrite();
            C123744bk bkVar2 = (C123744bk) bjVar.instance;
            bkVar2.f341806a |= 1;
            bkVar2.f341810e = intValue;
            return (C123744bk) bjVar.build();
        } else {
            C59104x d = f341528a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.Database");
            C59052c cVar = (C59052c) d;
            cVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_GET_EMPTY_DATA_ID_FROM_DB_VALUE));
            ((C59052c) cVar.mo56372aa(35171)).mo56387q("Found empty data with dataType %s", i2);
            return C123744bk.f341804l;
        }
    }

    /* renamed from: b */
    public final C60870cx mo106058b(C42850e eVar, C53306j jVar, List list) {
        C42838ax axVar = new C42838ax("LastClientDataQuery");
        axVar.f112125a.append("(client_type = ?");
        axVar.f112126b.add(String.valueOf(jVar.f139793X));
        axVar.f112125a.append(" AND data_type IN (?");
        if (!list.isEmpty()) {
            axVar.f112126b.add(String.valueOf(list.get(0)));
        }
        for (int i = 1; i < ((C58724pq) list).f156474d; i++) {
            axVar.f112125a.append(", ?");
            axVar.f112126b.add(String.valueOf(list.get(i)));
        }
        axVar.f112125a.append("))");
        return eVar.mo45938b(new C123648y(axVar));
    }

    /* renamed from: c */
    public final C60870cx mo106059c(C42850e eVar, AccountId accountId) {
        ArrayList arrayList = new ArrayList();
        if (accountId != null) {
            arrayList.add(C123611ad.m202949h());
            arrayList.add(C123611ad.m202946e());
            arrayList.add(C123611ad.m202948g());
        } else {
            arrayList.add(C123611ad.m202947f());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(eVar.mo45937a(new C123643t((C42839ay) arrayList.get(i))));
        }
        C60870cx o = C60856cj.m92906o(arrayList2);
        return C47638k.m84753d(o).mo51520a(new C123644u(accountId, o), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo106060d(C42850e eVar, C53306j jVar, Optional optional) {
        C59104x b = f341528a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.Database");
        ((C59052c) ((C59052c) b).mo56372aa(35172)).mo56354G("#getLastReturnedProactiveData for client type %s and proactive data type %s", jVar, optional);
        C42840az o = C123611ad.m202956o(jVar);
        if (optional.isPresent() && !((List) optional.get()).isEmpty()) {
            o.f112130a.append(" AND data_type IN (?");
            o.f112131b.add(Long.valueOf((long) ((Integer) ((List) optional.get()).get(0)).intValue()));
            for (int i = 1; i < ((List) optional.get()).size(); i++) {
                o.f112130a.append(", ?");
                o.f112131b.add(Long.valueOf((long) ((Integer) ((List) optional.get()).get(i)).intValue()));
            }
            o.f112130a.append(")");
        }
        return eVar.mo45937a(new C123640q(o));
    }

    /* renamed from: e */
    public final C60870cx mo106061e(C42850e eVar, C53306j jVar, C123777f fVar, List list, boolean z) {
        return eVar.mo45937a(new C123647x(this, list, jVar, z, fVar));
    }

    /* renamed from: f */
    public final C60870cx mo106062f(C42850e eVar, C53306j jVar, C123777f fVar, List list) {
        return eVar.mo45937a(new C123634k(this, list, jVar, fVar));
    }

    /* renamed from: g */
    public final C60870cx mo106063g(C42850e eVar, C53306j jVar, C123777f fVar, List list) {
        return eVar.mo45937a(new C123635l(this, list, jVar, fVar));
    }

    /* renamed from: h */
    public final C60870cx mo106064h(C42850e eVar, C53306j jVar, C123777f fVar, List list, boolean z) {
        return eVar.mo45937a(new C123608aa(this, z, list, jVar, fVar));
    }

    /* renamed from: i */
    public final C60870cx mo106065i(C42850e eVar, int i, List list) {
        C42840az n = C123611ad.m202955n(i);
        if (!list.isEmpty()) {
            n.f112130a.append(" AND data_id IN(?");
            n.f112131b.add((String) list.get(0));
            for (int i2 = 1; i2 < ((C58724pq) list).f156474d; i2++) {
                n.f112130a.append(", ?");
                n.f112131b.add((String) list.get(i2));
            }
            n.f112130a.append(")");
        }
        return eVar.mo45937a(new C123642s(n));
    }

    /* renamed from: j */
    public final C60870cx mo106066j(C42850e eVar, C53306j jVar, Map map) {
        C59104x b = f341528a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.Database");
        ((C59052c) ((C59052c) b).mo56372aa(35173)).mo56386p("#putNewReturnedDataQuery");
        C58480gp e = C58485gu.m89837e();
        for (Map.Entry entry : map.entrySet()) {
            C59104x b2 = f341528a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "PCP.Database");
            ((C59052c) ((C59052c) b2).mo56372aa(35174)).mo56389s("data.getValue() %s", entry.getValue());
            e.mo55395g(eVar.mo45938b(new C123637n(this, jVar, entry)));
        }
        return C47638k.m84752c(e.mo55394f()).mo51520a(C123638o.f341569a, C60826bg.f164896a);
    }

    /* renamed from: k */
    public final C60870cx mo106067k(C42850e eVar, C53306j jVar, int i, String str, long j) {
        long j2 = j;
        C42850e eVar2 = eVar;
        return eVar.mo45937a(new C123649z(this, C123611ad.m202959r(jVar, i, str, j2, this.f341530c.mo26870b()), C123611ad.m202954m(jVar, i, str), j2, jVar, i, str));
    }

    /* renamed from: l */
    public final C60870cx mo106068l(C42850e eVar, C53306j jVar, int i, String str, boolean z) {
        return eVar.mo45938b(new C123609ab(C123611ad.m202960s(jVar, i, str, z)));
    }

    /* renamed from: m */
    public final boolean mo106069m(Cursor cursor, C123777f fVar) {
        C48938al alVar;
        C48935ai aiVar;
        C48994cn cnVar;
        Object obj;
        Cursor cursor2 = cursor;
        C123777f fVar2 = fVar;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("filtering_context_conditions");
        if (columnIndexOrThrow != -1) {
            try {
                byte[] blob = cursor2.getBlob(columnIndexOrThrow);
                if (blob != null && blob.length > 0) {
                    C48952az azVar = (C48952az) C62942bv.parseFrom((C62942bv) C48952az.f126657c, blob, C62921ba.m95368a());
                    C124032d dVar = this.f341533f;
                    C124043o oVar = this.f341534g;
                    C58526ih ihVar = new C58526ih();
                    C124043o.m203464a(azVar, ihVar);
                    C58528ij f = ihVar.mo55486f();
                    C58833ax axVar = C58836b.f156633a;
                    C58800sl lA = f.iterator();
                    C58833ax axVar2 = axVar;
                    C58833ax axVar3 = axVar2;
                    C58833ax axVar4 = axVar3;
                    C58833ax axVar5 = axVar4;
                    C58833ax axVar6 = axVar5;
                    while (lA.hasNext()) {
                        C124041m mVar = C124041m.TIME;
                        int ordinal = ((C124041m) lA.next()).ordinal();
                        if (ordinal == 0) {
                            axVar2 = C58833ax.m90834k(Instant.ofEpochMilli(oVar.f342618b.mo26870b()));
                        } else if (ordinal == 1) {
                            AudioManager audioManager = (AudioManager) oVar.f342619c.getSystemService("audio");
                            if (audioManager == null) {
                                ((C58970a) ((C58970a) oVar.f342617a.mo56225c()).mo56372aa(35383)).mo56386p("AudioManager is null.");
                                alVar = C48938al.UNKNOWN_WIRED_HEADPHONE_STATUS;
                            } else if (audioManager.isWiredHeadsetOn()) {
                                alVar = C48938al.PLUGGED;
                            } else {
                                alVar = C48938al.UNPLUGGED;
                            }
                            axVar3 = C58833ax.m90834k(alVar);
                        } else if (ordinal == 2) {
                            AudioManager audioManager2 = (AudioManager) oVar.f342619c.getSystemService("audio");
                            if (audioManager2 == null) {
                                ((C58970a) ((C58970a) oVar.f342617a.mo56225c()).mo56372aa(35382)).mo56386p("AudioManager is null.");
                                aiVar = C48935ai.UNKNOWN_BLUETOOTH_A2DP_STATUS;
                            } else if (audioManager2.isBluetoothA2dpOn()) {
                                aiVar = C48935ai.BLUETOOTH_A2DP_ON;
                            } else {
                                aiVar = C48935ai.BLUETOOTH_A2DP_OFF;
                            }
                            axVar4 = C58833ax.m90834k(aiVar);
                        } else if (ordinal == 3) {
                            KeyguardManager keyguardManager = (KeyguardManager) oVar.f342619c.getSystemService("keyguard");
                            if (keyguardManager == null) {
                                ((C58970a) ((C58970a) oVar.f342617a.mo56225c()).mo56372aa(35384)).mo56386p("KeyguardManager is null.");
                                cnVar = C48994cn.UNSPECIFIED_STATE;
                            } else if (keyguardManager.isDeviceLocked()) {
                                cnVar = C48994cn.PHONE_LOCKED;
                            } else {
                                cnVar = C48994cn.PHONE_UNLOCKED;
                            }
                            axVar5 = C58833ax.m90834k(cnVar);
                        } else if (ordinal == 4) {
                            C62940bt r7 = C62942bv.checkIsLite(C123733b.f341777e);
                            fVar2.mo58887l(r7);
                            if (!fVar2.f169962ag.mo58857o(r7.f169971d)) {
                                axVar6 = C58836b.f156633a;
                            } else {
                                C62940bt r72 = C62942bv.checkIsLite(C123733b.f341777e);
                                fVar2.mo58887l(r72);
                                Object l = fVar2.f169962ag.mo58854l(r72.f169971d);
                                if (l == null) {
                                    obj = r72.f169969b;
                                } else {
                                    obj = r72.mo58889c(l);
                                }
                                C123733b bVar = (C123733b) obj;
                                if ((bVar.f341779a & 1) != 0) {
                                    C123791t tVar = bVar.f341780b;
                                    if (tVar == null) {
                                        tVar = C123791t.f341978d;
                                    }
                                    axVar6 = C58833ax.m90834k(tVar);
                                } else {
                                    axVar6 = C58836b.f156633a;
                                }
                            }
                        }
                    }
                    if (!dVar.mo106244a(azVar, new C124030b(axVar2, axVar, axVar, axVar, axVar, axVar, axVar3, axVar4, axVar5, axVar6, axVar))) {
                        return true;
                    }
                    return false;
                }
            } catch (C62974ct e) {
                C59104x d = f341528a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PCP.Database");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(35183)).mo56386p("Error convering filtering condition");
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo106070n(C42847bf bfVar, int i, String str, MessageLite messageLite, byte[] bArr) {
        bfVar.mo45931c("SharedProactiveData", C123611ad.m202943b(i, str, messageLite, bArr, new byte[0], this.f341530c.mo26870b()), 5);
        this.f341532e.mo106284c(i);
    }
}
