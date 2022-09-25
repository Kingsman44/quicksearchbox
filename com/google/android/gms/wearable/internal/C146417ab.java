package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.C146528k;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: com.google.android.gms.wearable.internal.ab */
/* compiled from: PG */
final class C146417ab extends C146509i {

    /* renamed from: a */
    final /* synthetic */ PutDataRequest f395640a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146417ab(C143851w wVar, PutDataRequest putDataRequest) {
        super(wVar);
        this.f395640a = putDataRequest;
    }

    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146418ac(status, (C146528k) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0202  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo117681h(com.google.android.gms.common.api.C143717b r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            com.google.android.gms.wearable.internal.dc r0 = (com.google.android.gms.wearable.internal.C146499dc) r0
            com.google.android.gms.wearable.PutDataRequest r2 = r1.f395640a
            java.util.Map r3 = r2.mo123078c()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.wearable.Asset r4 = (com.google.android.gms.wearable.Asset) r4
            byte[] r5 = r4.f395461a
            if (r5 != 0) goto L_0x0014
            java.lang.String r5 = r4.f395462b
            if (r5 != 0) goto L_0x0014
            android.os.ParcelFileDescriptor r5 = r4.f395463c
            if (r5 != 0) goto L_0x0014
            android.net.Uri r5 = r4.f395464d
            if (r5 == 0) goto L_0x0037
            goto L_0x0014
        L_0x0037:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            android.net.Uri r2 = r2.f395479a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Put for "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " contains invalid asset: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2)
            throw r0
        L_0x005d:
            android.net.Uri r3 = r2.f395479a
            com.google.android.gms.wearable.PutDataRequest r3 = com.google.android.gms.wearable.PutDataRequest.m238329b(r3)
            byte[] r4 = r2.f395481c
            r3.f395481c = r4
            long r4 = r2.f395482d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0071
            r3.f395482d = r6
        L_0x0071:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Map r5 = r2.mo123078c()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0082:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0211
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            com.google.android.gms.wearable.Asset r7 = (com.google.android.gms.wearable.Asset) r7
            byte[] r8 = r7.f395461a
            r9 = 0
            java.lang.String r10 = "WearableClient"
            if (r8 == 0) goto L_0x0115
            android.os.ParcelFileDescriptor[] r8 = android.os.ParcelFileDescriptor.createPipe()     // Catch:{ IOException -> 0x00ff }
            r11 = 3
            boolean r11 = android.util.Log.isLoggable(r10, r11)
            r12 = 1
            if (r11 == 0) goto L_0x00d8
            java.lang.String r11 = java.lang.String.valueOf(r7)
            r13 = r8[r9]
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r14 = r8[r12]
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r12 = "processAssets: replacing data with FD in asset: "
            r15.<init>(r12)
            r15.append(r11)
            java.lang.String r11 = " read:"
            r15.append(r11)
            r15.append(r13)
            java.lang.String r11 = " write:"
            r15.append(r11)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            android.util.Log.d(r10, r11)
        L_0x00d8:
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r9 = r8[r9]
            com.google.android.gms.wearable.Asset r9 = com.google.android.gms.wearable.Asset.m238325a(r9)
            r3.mo123079d(r6, r9)
            r6 = 1
            r6 = r8[r6]
            byte[] r7 = r7.f395461a
            java.util.concurrent.FutureTask r8 = new java.util.concurrent.FutureTask
            com.google.android.gms.wearable.internal.db r9 = new com.google.android.gms.wearable.internal.db
            r9.<init>(r6, r7)
            r8.<init>(r9)
            r4.add(r8)
            java.util.concurrent.ExecutorService r6 = r0.f395681a
            r6.submit(r8)
            goto L_0x0082
        L_0x00ff:
            r0 = move-exception
            r3 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "Unable to create ParcelFileDescriptor for asset in request: "
            java.lang.String r2 = r4.concat(r2)
            r0.<init>(r2, r3)
            throw r0
        L_0x0115:
            android.net.Uri r8 = r7.f395464d
            r11 = 4005(0xfa5, float:5.612E-42)
            r12 = 0
            if (r8 == 0) goto L_0x015a
            android.content.Context r8 = r0.f390156t     // Catch:{ FileNotFoundException -> 0x0139 }
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0139 }
            android.net.Uri r9 = r7.f395464d     // Catch:{ FileNotFoundException -> 0x0139 }
            java.lang.String r13 = "r"
            android.os.ParcelFileDescriptor r8 = r8.openFileDescriptor(r9, r13)     // Catch:{ FileNotFoundException -> 0x0139 }
            com.google.android.gms.wearable.Asset r8 = com.google.android.gms.wearable.Asset.m238325a(r8)     // Catch:{ FileNotFoundException -> 0x0139 }
            java.lang.Object r6 = r6.getKey()     // Catch:{ FileNotFoundException -> 0x0139 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ FileNotFoundException -> 0x0139 }
            r3.mo123079d(r6, r8)     // Catch:{ FileNotFoundException -> 0x0139 }
            goto L_0x0082
        L_0x0139:
            com.google.android.gms.wearable.internal.cx r0 = new com.google.android.gms.wearable.internal.cx
            r0.<init>(r1, r4)
            com.google.android.gms.wearable.internal.PutDataResponse r2 = new com.google.android.gms.wearable.internal.PutDataResponse
            r2.<init>(r11, r12)
            r0.mo123182e(r2)
            android.net.Uri r0 = r7.f395464d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Couldn't resolve asset URI: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.w(r10, r0)
            return
        L_0x015a:
            android.os.ParcelFileDescriptor r8 = r7.f395463c
            if (r8 == 0) goto L_0x0206
            java.io.File r13 = r0.f395685e     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r14 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
            r14.<init>(r8)     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
            r13.mkdirs()     // Catch:{ all -> 0x01c1 }
            java.lang.String r8 = "asset"
            java.lang.String r15 = ".tmp"
            java.io.File r8 = java.io.File.createTempFile(r8, r15, r13)     // Catch:{ all -> 0x01c1 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x01af, all -> 0x01ac }
            r13.<init>(r8)     // Catch:{ IOException -> 0x01af, all -> 0x01ac }
            r15 = 10240(0x2800, float:1.4349E-41)
            byte[] r15 = new byte[r15]     // Catch:{ IOException -> 0x01aa }
        L_0x0179:
            int r11 = r14.read(r15)     // Catch:{ IOException -> 0x01aa }
            if (r11 >= 0) goto L_0x01a4
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r14)     // Catch:{ all -> 0x01c1 }
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r13)     // Catch:{ all -> 0x01c1 }
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r14)     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
            r9 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r9 = android.os.ParcelFileDescriptor.open(r8, r9)     // Catch:{ IOException -> 0x01a2 }
            com.google.android.gms.wearable.Asset r9 = com.google.android.gms.wearable.Asset.m238325a(r9)     // Catch:{ IOException -> 0x01a2 }
            java.lang.Object r6 = r6.getKey()     // Catch:{ IOException -> 0x01a2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x01a2 }
            r3.mo123079d(r6, r9)     // Catch:{ IOException -> 0x01a2 }
            if (r8 == 0) goto L_0x0082
            r8.delete()
            goto L_0x0082
        L_0x01a2:
            r0 = move-exception
            goto L_0x01ca
        L_0x01a4:
            r13.write(r15, r9, r11)     // Catch:{ IOException -> 0x01aa }
            goto L_0x0179
        L_0x01a8:
            r0 = move-exception
            goto L_0x01b7
        L_0x01aa:
            r0 = move-exception
            goto L_0x01b1
        L_0x01ac:
            r0 = move-exception
            r13 = r12
            goto L_0x01b7
        L_0x01af:
            r0 = move-exception
            r13 = r12
        L_0x01b1:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x01a8 }
            r2.<init>(r0)     // Catch:{ all -> 0x01a8 }
            throw r2     // Catch:{ all -> 0x01a8 }
        L_0x01b7:
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r14)     // Catch:{ all -> 0x01c1 }
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r13)     // Catch:{ all -> 0x01c1 }
            r8.delete()     // Catch:{ all -> 0x01c1 }
            throw r0     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r0 = move-exception
            com.google.android.gms.wearable.p10888a.C146395a.m238332a(r14)     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
            throw r0     // Catch:{ IOException -> 0x01c8, all -> 0x01c6 }
        L_0x01c6:
            r0 = move-exception
            goto L_0x0200
        L_0x01c8:
            r0 = move-exception
            r8 = r12
        L_0x01ca:
            java.lang.String r2 = "DataItem asset copy failed"
            android.util.Log.w(r10, r2, r0)     // Catch:{ all -> 0x01fe }
            com.google.android.gms.wearable.internal.cx r0 = new com.google.android.gms.wearable.internal.cx     // Catch:{ all -> 0x01fe }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x01fe }
            com.google.android.gms.wearable.internal.PutDataResponse r2 = new com.google.android.gms.wearable.internal.PutDataResponse     // Catch:{ all -> 0x01fe }
            r3 = 4005(0xfa5, float:5.612E-42)
            r2.<init>(r3, r12)     // Catch:{ all -> 0x01fe }
            r0.mo123182e(r2)     // Catch:{ all -> 0x01fe }
            android.os.ParcelFileDescriptor r0 = r7.f395463c     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r3 = "Couldn't asset from a file descriptor: "
            r2.append(r3)     // Catch:{ all -> 0x01fe }
            r2.append(r0)     // Catch:{ all -> 0x01fe }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.w(r10, r0)     // Catch:{ all -> 0x01fe }
            if (r8 == 0) goto L_0x01fd
            r8.delete()
        L_0x01fd:
            return
        L_0x01fe:
            r0 = move-exception
            r12 = r8
        L_0x0200:
            if (r12 == 0) goto L_0x0205
            r12.delete()
        L_0x0205:
            throw r0
        L_0x0206:
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r3.mo123079d(r6, r7)
            goto L_0x0082
        L_0x0211:
            android.os.IInterface r0 = r0.mo119451G()
            com.google.android.gms.wearable.internal.bj r0 = (com.google.android.gms.wearable.internal.C146452bj) r0
            com.google.android.gms.wearable.internal.cx r2 = new com.google.android.gms.wearable.internal.cx
            r2.<init>(r1, r4)
            android.os.Parcel r4 = r0.mo17260gA()
            com.google.android.p445a.C8850c.m23499h(r4, r2)
            com.google.android.p445a.C8850c.m23497f(r4, r3)
            r2 = 6
            r0.mo17262he(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C146417ab.mo117681h(com.google.android.gms.common.api.b):void");
    }
}
