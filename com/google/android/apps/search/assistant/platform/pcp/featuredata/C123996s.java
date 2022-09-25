package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import android.content.ContentValues;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.s */
/* compiled from: PG */
public final /* synthetic */ class C123996s implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C124003z f342469a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f342470b;

    /* renamed from: c */
    public final /* synthetic */ Optional f342471c;

    /* renamed from: d */
    public final /* synthetic */ String f342472d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f342473e;

    /* renamed from: f */
    public final /* synthetic */ AccountId f342474f;

    /* renamed from: g */
    public final /* synthetic */ long f342475g;

    /* renamed from: h */
    public final /* synthetic */ C58480gp f342476h;

    /* renamed from: i */
    public final /* synthetic */ ContentValues f342477i;

    public /* synthetic */ C123996s(C124003z zVar, C58485gu guVar, Optional optional, String str, byte[] bArr, AccountId accountId, long j, C58480gp gpVar, ContentValues contentValues) {
        this.f342469a = zVar;
        this.f342470b = guVar;
        this.f342471c = optional;
        this.f342472d = str;
        this.f342473e = bArr;
        this.f342474f = accountId;
        this.f342475g = j;
        this.f342476h = gpVar;
        this.f342477i = contentValues;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b8, code lost:
        if (r1 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011a, code lost:
        if (r1 != null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        if (r1 != null) goto L_0x011c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x010a A[Catch:{ all -> 0x0198, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0133 A[Catch:{ all -> 0x0198, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x014e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45928a(com.google.android.libraries.storage.p3315b.C42847bf r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            com.google.android.apps.search.assistant.platform.pcp.featuredata.z r10 = r1.f342469a
            com.google.common.b.gu r11 = r1.f342470b
            j$.util.Optional r12 = r1.f342471c
            java.lang.String r13 = r1.f342472d
            byte[] r14 = r1.f342473e
            com.google.apps.tiktok.account.AccountId r15 = r1.f342474f
            long r7 = r1.f342475g
            com.google.common.b.gp r9 = r1.f342476h
            android.content.ContentValues r6 = r1.f342477i
            int r5 = r11.size()
            r16 = 0
            r4 = 0
        L_0x001d:
            if (r4 >= r5) goto L_0x01d9
            java.lang.Object r2 = r11.get(r4)
            com.google.assistant.s.a.j r2 = (com.google.assistant.p3994s.p3995a.C53306j) r2
            boolean r3 = r12.isPresent()
            if (r3 == 0) goto L_0x01b4
            java.lang.Object r3 = r12.get()
            com.google.assistant.ag.c.az r3 = (com.google.assistant.p3803ag.p3809c.C48952az) r3
            int r1 = r2.f139793X
            r17 = r4
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96139A(r14)
            r18 = r5
            com.google.android.libraries.storage.b.az r5 = new com.google.android.libraries.storage.b.az
            r5.<init>()
            r19 = r6
            java.lang.StringBuilder r6 = r5.f112130a
            r20 = r7
            java.lang.String r7 = "SELECT SharedProactiveData.data_id, SharedProactiveData.data_type, hash_tag, display_validity FROM SharedProactiveData LEFT JOIN ClientProactiveData ON (SharedProactiveData.data_id = ClientProactiveData.data_id AND SharedProactiveData.data_type = ClientProactiveData.data_type) WHERE "
            r6.append(r7)
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = "SharedProactiveData.data_id = ? "
            r6.append(r7)
            java.util.ArrayList r6 = r5.f112131b
            r6.add(r13)
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = " AND SharedProactiveData.data_type = ? "
            r6.append(r7)
            r6 = 100006(0x186a6, double:4.94095E-319)
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            java.util.ArrayList r6 = r5.f112131b
            r6.add(r8)
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = " AND ClientProactiveData.client_type = ? "
            r6.append(r7)
            long r6 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.ArrayList r6 = r5.f112131b
            r6.add(r1)
            com.google.android.libraries.storage.b.ay r1 = r5.mo45920a()
            android.database.Cursor r1 = r0.mo45932d(r1)
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x01a6 }
            r6 = 1
            if (r5 == 0) goto L_0x00b8
            java.lang.String r5 = "hash_tag"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x01a6 }
            byte[] r5 = r1.getBlob(r5)     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "display_validity"
            int r7 = r1.getColumnIndex(r7)     // Catch:{ all -> 0x01a6 }
            int r7 = r1.getInt(r7)     // Catch:{ all -> 0x01a6 }
            if (r5 != 0) goto L_0x00a3
            if (r1 == 0) goto L_0x00bd
            goto L_0x00ba
        L_0x00a3:
            com.google.protobuf.z r5 = com.google.protobuf.C63088z.m96139A(r5)     // Catch:{ all -> 0x01a6 }
            boolean r4 = r5.equals(r4)     // Catch:{ all -> 0x01a6 }
            if (r4 != 0) goto L_0x00b1
            if (r7 != r6) goto L_0x00b1
            r4 = 1
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            if (r1 == 0) goto L_0x00be
            r1.close()
            goto L_0x00be
        L_0x00b8:
            if (r1 == 0) goto L_0x00bd
        L_0x00ba:
            r1.close()
        L_0x00bd:
            r4 = 1
        L_0x00be:
            com.google.android.libraries.storage.b.az r1 = new com.google.android.libraries.storage.b.az
            r1.<init>()
            java.lang.StringBuilder r5 = r1.f112130a
            java.lang.String r7 = "SELECT data_id, data_type, client_type, contextual_triggering_condition FROM ClientProactiveData WHERE "
            r5.append(r7)
            java.lang.StringBuilder r5 = r1.f112130a
            java.lang.String r7 = "data_id = ? "
            r5.append(r7)
            java.util.ArrayList r5 = r1.f112131b
            r5.add(r13)
            java.lang.StringBuilder r5 = r1.f112130a
            java.lang.String r7 = " AND client_type = ? "
            r5.append(r7)
            int r5 = r2.f139793X
            long r7 = (long) r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.util.ArrayList r7 = r1.f112131b
            r7.add(r5)
            java.lang.StringBuilder r5 = r1.f112130a
            java.lang.String r7 = " AND data_type = ? "
            r5.append(r7)
            r7 = 100006(0x186a6, double:4.94095E-319)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            java.util.ArrayList r7 = r1.f112131b
            r7.add(r5)
            com.google.android.libraries.storage.b.ay r1 = r1.mo45920a()
            android.database.Cursor r1 = r0.mo45932d(r1)
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x0198 }
            if (r5 == 0) goto L_0x0133
            java.lang.String r5 = "contextual_triggering_condition"
            int r5 = r1.getColumnIndex(r5)     // Catch:{ all -> 0x0198 }
            byte[] r5 = r1.getBlob(r5)     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x0120
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x013a
        L_0x011c:
            r1.close()
            goto L_0x013a
        L_0x0120:
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0198 }
            com.google.assistant.ag.c.az r8 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c     // Catch:{ all -> 0x0198 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r5, (com.google.protobuf.C62921ba) r7)     // Catch:{ all -> 0x0198 }
            com.google.assistant.ag.c.az r5 = (com.google.assistant.p3803ag.p3809c.C48952az) r5     // Catch:{ all -> 0x0198 }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x013a
            goto L_0x011c
        L_0x0133:
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0198 }
            if (r1 == 0) goto L_0x013a
            goto L_0x011c
        L_0x013a:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x014e
            com.google.assistant.s.a.j r1 = com.google.assistant.p3994s.p3995a.C53306j.BLUECHIP_SMARTSPACE_TNG
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0171
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r1 = r10.f342499e
            r1.mo109883S()
            goto L_0x0171
        L_0x014e:
            java.lang.Object r1 = r5.get()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0171
            boolean r1 = r10.f342495a
            if (r1 == 0) goto L_0x0168
            if (r4 == 0) goto L_0x0168
            com.google.android.apps.search.assistant.platform.pcp.api.t r1 = r10.f342498d
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r2)
            r3 = 0
            r1.mo106055b(r2, r6, r3)
        L_0x0168:
            r22 = r19
            r19 = r20
            r21 = r10
            r10 = r9
            goto L_0x01ca
        L_0x0171:
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r15)
            int r4 = r2.f139793X
            r5 = 100006(0x186a6, float:1.40138E-40)
            com.google.android.apps.search.assistant.platform.pcp.validity.r r1 = com.google.android.apps.search.assistant.platform.pcp.validity.C124169r.m203613h(r1, r13, r5, r4, r3)
            r4 = 100006(0x186a6, float:1.40138E-40)
            r6 = 0
            r5 = r3
            r3 = r13
            r7 = r19
            r22 = r7
            r19 = r20
            r7 = r19
            r21 = r10
            r10 = r9
            r9 = r24
            com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203548b(r2, r3, r4, r5, r6, r7, r9)
            r10.mo55395g(r1)
            goto L_0x01ca
        L_0x0198:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x01a5
            r1.close()     // Catch:{ all -> 0x01a0 }
            goto L_0x01a5
        L_0x01a0:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.search.assistant.platform.pcp.featuredata.C123993p.m203362a(r2, r1)
        L_0x01a5:
            throw r2
        L_0x01a6:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto L_0x01b3
            r1.close()     // Catch:{ all -> 0x01ae }
            goto L_0x01b3
        L_0x01ae:
            r0 = move-exception
            r1 = r0
            com.google.android.apps.search.assistant.platform.pcp.featuredata.C123993p.m203362a(r2, r1)
        L_0x01b3:
            throw r2
        L_0x01b4:
            r17 = r4
            r18 = r5
            r22 = r6
            r19 = r7
            r21 = r10
            r10 = r9
            r4 = 100006(0x186a6, float:1.40138E-40)
            r5 = 0
            r6 = 1
            r3 = r13
            r9 = r24
            com.google.android.apps.search.assistant.platform.pcp.p9339i.C124124j.m203548b(r2, r3, r4, r5, r6, r7, r9)
        L_0x01ca:
            int r4 = r17 + 1
            r1 = r23
            r9 = r10
            r5 = r18
            r7 = r19
            r10 = r21
            r6 = r22
            goto L_0x001d
        L_0x01d9:
            r22 = r6
            java.lang.String r1 = "SharedProactiveData"
            r2 = 5
            r3 = r22
            r0.mo45931c(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.C123996s.mo45928a(com.google.android.libraries.storage.b.bf):void");
    }
}
