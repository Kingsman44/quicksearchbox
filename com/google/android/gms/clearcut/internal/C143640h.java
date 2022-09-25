package com.google.android.gms.clearcut.internal;

import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143824m;

/* renamed from: com.google.android.gms.clearcut.internal.h */
/* compiled from: PG */
final class C143640h extends C143824m {

    /* renamed from: a */
    final /* synthetic */ C143641i f389446a;

    /* renamed from: d */
    private final C143657j f389447d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143640h(C143641i iVar, C143657j jVar, C143851w wVar) {
        super(C143658k.f389476c, wVar);
        this.f389446a = iVar;
        this.f389447d = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C143711ad mo117683c(Status status) {
        return status;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo117682i(Object obj) {
        super.mo119112p((C143711ad) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: com.google.android.libraries.phenotype.client.aj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: com.google.android.libraries.phenotype.client.af} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: com.google.android.libraries.phenotype.client.af} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: com.google.android.libraries.phenotype.client.af} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: com.google.android.libraries.phenotype.client.af} */
    /* JADX WARNING: type inference failed for: r5v16, types: [com.google.android.libraries.phenotype.client.aj] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x017c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x00bb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117681h(com.google.android.gms.clearcut.internal.C143642j r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.String r2 = "ClearcutLoggerApiImpl"
            com.google.android.gms.clearcut.internal.g r0 = new com.google.android.gms.clearcut.internal.g
            r0.<init>(r1)
            com.google.android.gms.clearcut.j r3 = r1.f389447d     // Catch:{ RuntimeException -> 0x021a }
            com.google.android.gms.clearcut.k r4 = r3.f389459a     // Catch:{ RuntimeException -> 0x021a }
            java.util.List r4 = r4.f389486m     // Catch:{ RuntimeException -> 0x021a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x021a }
        L_0x0013:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x021a }
            if (r5 == 0) goto L_0x0023
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x021a }
            com.google.android.gms.clearcut.i r5 = (com.google.android.gms.clearcut.C143632i) r5     // Catch:{ RuntimeException -> 0x021a }
            r5.mo37364a(r3)     // Catch:{ RuntimeException -> 0x021a }
            goto L_0x0013
        L_0x0023:
            java.util.List r4 = com.google.android.gms.clearcut.C143658k.f389479f     // Catch:{ RuntimeException -> 0x021a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RuntimeException -> 0x021a }
        L_0x0029:
            boolean r5 = r4.hasNext()     // Catch:{ RuntimeException -> 0x021a }
            if (r5 == 0) goto L_0x0039
            java.lang.Object r5 = r4.next()     // Catch:{ RuntimeException -> 0x021a }
            com.google.android.gms.clearcut.i r5 = (com.google.android.gms.clearcut.C143632i) r5     // Catch:{ RuntimeException -> 0x021a }
            r5.mo37364a(r3)     // Catch:{ RuntimeException -> 0x021a }
            goto L_0x0029
        L_0x0039:
            com.google.android.gms.clearcut.k r4 = r3.f389459a
            com.google.android.gms.clearcut.ab r4 = r4.f389485l
            java.lang.String r5 = r3.f389471m
            com.google.cm.a.c.a.a.a r6 = r3.f389461c
            com.google.protobuf.bv r6 = r6.instance
            com.google.cm.a.c.a.a.b r6 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b) r6
            int r6 = r6.f155464d
            r7 = 0
            if (r5 == 0) goto L_0x0050
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L_0x0051
        L_0x0050:
            r5 = r7
        L_0x0051:
            r7 = 1
            if (r5 != 0) goto L_0x005a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x00b7
        L_0x005a:
            r8 = r4
            com.google.android.gms.clearcut.internal.v r8 = (com.google.android.gms.clearcut.internal.C143654v) r8
            android.content.Context r8 = r8.f389458f
            if (r8 != 0) goto L_0x0066
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x0092
        L_0x0066:
            j$.util.concurrent.ConcurrentHashMap r8 = com.google.android.gms.clearcut.internal.C143654v.f389455c
            java.lang.Object r8 = r8.get(r5)
            com.google.android.libraries.phenotype.client.aj r8 = (com.google.android.libraries.phenotype.client.C31654aj) r8
            if (r8 != 0) goto L_0x008a
            com.google.android.libraries.phenotype.client.ah r10 = com.google.android.gms.clearcut.internal.C143654v.f389454b
            com.google.cm.a.c.a.a.l r12 = com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58160l.f155495b
            com.google.android.gms.clearcut.internal.u r14 = com.google.android.gms.clearcut.internal.C143653u.f389452a
            com.google.android.libraries.phenotype.client.af r8 = new com.google.android.libraries.phenotype.client.af
            r13 = 0
            r9 = r8
            r11 = r5
            r9.<init>(r10, r11, r12, r13, r14)
            j$.util.concurrent.ConcurrentHashMap r9 = com.google.android.gms.clearcut.internal.C143654v.f389455c
            java.lang.Object r5 = r9.putIfAbsent(r5, r8)
            com.google.android.libraries.phenotype.client.aj r5 = (com.google.android.libraries.phenotype.client.C31654aj) r5
            if (r5 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r8 = r5
        L_0x008a:
            java.lang.Object r5 = r8.mo37303b()
            com.google.cm.a.c.a.a.l r5 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58160l) r5
            com.google.protobuf.cq r5 = r5.f155497a
        L_0x0092:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x009b:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00b6
            java.lang.Object r9 = r5.next()
            com.google.cm.a.c.a.a.k r9 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58159k) r9
            int r10 = r9.f155490a
            r10 = r10 & r7
            if (r10 == 0) goto L_0x00b2
            int r10 = r9.f155491b
            if (r10 == 0) goto L_0x00b2
            if (r10 != r6) goto L_0x009b
        L_0x00b2:
            r8.add(r9)
            goto L_0x009b
        L_0x00b6:
            r5 = r8
        L_0x00b7:
            java.util.Iterator r5 = r5.iterator()
        L_0x00bb:
            boolean r6 = r5.hasNext()
            r8 = 0
            if (r6 == 0) goto L_0x0182
            java.lang.Object r6 = r5.next()
            com.google.cm.a.c.a.a.k r6 = (com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58159k) r6
            java.lang.String r9 = r6.f155492c
            r10 = r4
            com.google.android.gms.clearcut.internal.v r10 = (com.google.android.gms.clearcut.internal.C143654v) r10
            android.content.Context r10 = r10.f389458f
            boolean r11 = com.google.android.libraries.directboot.C20674d.m38855d(r10)
            r12 = 0
            if (r11 == 0) goto L_0x00d9
        L_0x00d7:
            r10 = r12
            goto L_0x011d
        L_0x00d9:
            java.lang.Long r11 = com.google.android.gms.clearcut.internal.C143654v.f389457e
            if (r11 != 0) goto L_0x0117
            if (r10 == 0) goto L_0x00d7
            java.lang.Boolean r11 = com.google.android.gms.clearcut.internal.C143654v.f389456d
            if (r11 != 0) goto L_0x00fa
            com.google.android.gms.common.e.c r11 = com.google.android.gms.common.p10782e.C143873c.f389983a
            com.google.android.gms.common.e.b r11 = r11.mo119351a(r10)
            android.content.Context r11 = r11.f389982a
            java.lang.String r14 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r11 = r11.checkCallingOrSelfPermission(r14)
            if (r11 != 0) goto L_0x00f4
            r8 = 1
        L_0x00f4:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            com.google.android.gms.clearcut.internal.C143654v.f389456d = r8
        L_0x00fa:
            java.lang.Boolean r8 = com.google.android.gms.clearcut.internal.C143654v.f389456d
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0111
            android.content.ContentResolver r8 = r10.getContentResolver()
            long r10 = com.google.android.p10905k.C146606e.m238845g(r8, r12)
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            com.google.android.gms.clearcut.internal.C143654v.f389457e = r8
            goto L_0x0117
        L_0x0111:
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            com.google.android.gms.clearcut.internal.C143654v.f389457e = r8
        L_0x0117:
            java.lang.Long r8 = com.google.android.gms.clearcut.internal.C143654v.f389457e
            long r10 = r8.longValue()
        L_0x011d:
            r8 = 8
            if (r9 == 0) goto L_0x0144
            boolean r14 = r9.isEmpty()
            if (r14 == 0) goto L_0x0128
            goto L_0x0144
        L_0x0128:
            java.nio.charset.Charset r14 = com.google.android.gms.clearcut.internal.C143654v.f389453a
            byte[] r9 = r9.getBytes(r14)
            int r14 = r9.length
            int r14 = r14 + r8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r14)
            r8.put(r9)
            r8.putLong(r10)
            byte[] r8 = r8.array()
            int r9 = r8.length
            long r8 = com.google.android.gms.clearcut.internal.C143644l.m233348a(r8, r9)
            goto L_0x0155
        L_0x0144:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            java.nio.ByteBuffer r8 = r8.putLong(r10)
            byte[] r8 = r8.array()
            int r9 = r8.length
            long r8 = com.google.android.gms.clearcut.internal.C143644l.m233348a(r8, r9)
        L_0x0155:
            long r10 = r6.f155493d
            long r14 = r6.f155494e
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00bb
            int r6 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x00bb
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0167
            long r8 = r8 % r14
            goto L_0x0178
        L_0x0167:
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r16 = r12 % r14
            r18 = 1
            long r16 = r16 + r18
            long r8 = r8 & r12
            long r8 = r8 % r14
            long r16 = r16 + r8
            long r8 = r16 % r14
        L_0x0178:
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x00bb
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f389615a
            r1.mo119112p(r0)
            return
        L_0x0182:
            com.google.android.gms.clearcut.LogEventParcelable r3 = com.google.android.gms.clearcut.internal.C143641i.m233331d(r3)
            if (r3 != 0) goto L_0x0199
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r10 = 1
            r11 = 10
            java.lang.String r12 = "MessageProducer"
            r13 = 0
            r14 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            r1.mo119276l(r0)
            return
        L_0x0199:
            android.os.IInterface r4 = r21.mo119451G()     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            com.google.android.gms.clearcut.internal.r r4 = (com.google.android.gms.clearcut.internal.C143650r) r4     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            android.os.Parcel r5 = r4.mo17260gA()     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            com.google.android.p445a.C8850c.m23499h(r5, r0)     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            com.google.android.p445a.C8850c.m23497f(r5, r3)     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            r4.mo17263hf(r7, r5)     // Catch:{ TransactionTooLargeException -> 0x01f6, RemoteException -> 0x01cc, RuntimeException -> 0x01ca }
            com.google.android.gms.clearcut.internal.i r0 = r1.f389446a
            com.google.common.base.cr r0 = r0.f389448a
            java.lang.Object r0 = r0.mo6453a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01c9
            com.google.android.gms.clearcut.internal.i r0 = r1.f389446a
            com.google.android.gms.clearcut.internal.t r2 = com.google.android.gms.clearcut.internal.C143652t.m233362b()
            com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable r2 = r2.mo118986a()
            r0.mo118977e(r2)
        L_0x01c9:
            return
        L_0x01ca:
            r0 = move-exception
            goto L_0x01cd
        L_0x01cc:
            r0 = move-exception
        L_0x01cd:
            java.lang.String r4 = "logEvent exception"
            android.util.Log.w(r2, r4, r0)
            com.google.android.gms.clearcut.internal.i r2 = r1.f389446a
            com.google.common.base.cr r2 = r2.f389448a
            java.lang.Object r2 = r2.mo6453a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01e3
            goto L_0x01f5
        L_0x01e3:
            com.google.android.gms.clearcut.internal.t r2 = com.google.android.gms.clearcut.internal.C143652t.m233362b()
            com.google.android.gms.clearcut.internal.LogErrorParcelable r4 = new com.google.android.gms.clearcut.internal.LogErrorParcelable
            com.google.android.gms.clearcut.internal.PlayLoggerContext r3 = r3.f389394a
            java.lang.String r3 = r3.f389436f
            r5 = 1003(0x3eb, float:1.406E-42)
            r4.<init>(r3, r5, r7)
            r2.mo118987c(r4)
        L_0x01f5:
            throw r0
        L_0x01f6:
            r0 = move-exception
            java.lang.String r4 = "Log event caused a TransactionTooLargeException"
            android.util.Log.e(r2, r4, r0)
            com.google.android.gms.clearcut.internal.LogErrorParcelable r0 = new com.google.android.gms.clearcut.internal.LogErrorParcelable
            com.google.android.gms.clearcut.internal.PlayLoggerContext r2 = r3.f389394a
            java.lang.String r2 = r2.f389436f
            r3 = 31004(0x791c, float:4.3446E-41)
            r0.<init>(r2, r3, r7)
            com.google.android.gms.clearcut.internal.i r2 = r1.f389446a
            com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable r3 = new com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable
            com.google.android.gms.clearcut.internal.LogErrorParcelable[] r4 = new com.google.android.gms.clearcut.internal.LogErrorParcelable[r7]
            r4[r8] = r0
            java.util.List r0 = java.util.Arrays.asList(r4)
            r3.<init>(r0)
            r2.mo118977e(r3)
            return
        L_0x021a:
            r0 = move-exception
            java.lang.String r3 = "derived ClearcutLogger.EventModifier "
            android.util.Log.e(r2, r3, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r5 = 1
            r6 = 10
            java.lang.String r7 = "EventModifier"
            r8 = 0
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r1.mo119276l(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.internal.C143640h.mo117681h(com.google.android.gms.clearcut.internal.j):void");
    }
}
