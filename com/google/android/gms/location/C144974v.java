package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.C143798cs;

/* renamed from: com.google.android.gms.location.v */
/* compiled from: PG */
public final /* synthetic */ class C144974v implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C144977y f391942a;

    /* renamed from: b */
    public final /* synthetic */ LocationRequest f391943b;

    public /* synthetic */ C144974v(C144977y yVar, LocationRequest locationRequest) {
        this.f391942a = yVar;
        this.f391943b = locationRequest;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117678a(java.lang.Object r19, java.lang.Object r20) {
        /*
            r18 = this;
            r1 = r18
            com.google.android.gms.location.y r0 = r1.f391942a
            com.google.android.gms.location.LocationRequest r2 = r1.f391943b
            r3 = r19
            com.google.android.gms.location.internal.ag r3 = (com.google.android.gms.location.internal.C144918ag) r3
            com.google.android.gms.common.api.internal.ce r4 = r0.mo120448b()
            com.google.android.gms.common.api.internal.cc r5 = r4.f389806b
            java.lang.Object r5 = p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.gms.common.api.internal.cc r5 = (com.google.android.gms.common.api.internal.C143782cc) r5
            com.google.android.gms.common.Feature r6 = com.google.android.gms.location.C144956q.f391917j
            boolean r6 = r3.mo120420q(r6)
            androidx.c.n r7 = r3.f391882a
            monitor-enter(r7)
            androidx.c.n r8 = r3.f391882a     // Catch:{ all -> 0x0090 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.ae r8 = (com.google.android.gms.location.internal.C144916ae) r8     // Catch:{ all -> 0x0090 }
            r9 = 0
            if (r8 == 0) goto L_0x0035
            if (r6 == 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            com.google.android.gms.location.internal.x r0 = r8.f391880a     // Catch:{ all -> 0x0090 }
            r0.mo120449c(r4)     // Catch:{ all -> 0x0090 }
            r13 = r8
            r8 = r9
            goto L_0x0040
        L_0x0035:
            com.google.android.gms.location.internal.ae r4 = new com.google.android.gms.location.internal.ae     // Catch:{ all -> 0x0090 }
            r4.<init>(r0)     // Catch:{ all -> 0x0090 }
            androidx.c.n r0 = r3.f391882a     // Catch:{ all -> 0x0090 }
            r0.put(r5, r4)     // Catch:{ all -> 0x0090 }
            r13 = r4
        L_0x0040:
            android.content.Context r0 = r3.f390156t     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = r5.mo119232a()     // Catch:{ all -> 0x0090 }
            if (r6 == 0) goto L_0x005f
            android.os.IInterface r3 = r3.mo119451G()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.h r3 = (com.google.android.gms.location.internal.C144930h) r3     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.LocationReceiver r0 = com.google.android.gms.location.internal.LocationReceiver.m235511b(r8, r13, r0)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.r r4 = new com.google.android.gms.location.internal.r     // Catch:{ all -> 0x0090 }
            r5 = r20
            com.google.android.gms.tasks.af r5 = (com.google.android.gms.tasks.C146010af) r5     // Catch:{ all -> 0x0090 }
            r4.<init>(r9, r5)     // Catch:{ all -> 0x0090 }
            r3.mo120438i(r0, r2, r4)     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x005f:
            android.os.IInterface r3 = r3.mo119451G()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.h r3 = (com.google.android.gms.location.internal.C144930h) r3     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.au r4 = new com.google.android.gms.location.au     // Catch:{ all -> 0x0090 }
            r4.<init>(r2)     // Catch:{ all -> 0x0090 }
            r4.mo120386d(r9)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.LocationRequest r2 = r4.mo120383a()     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.LocationRequestInternal r12 = com.google.android.gms.location.internal.LocationRequestInternal.m235512a(r2)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.u r2 = new com.google.android.gms.location.internal.u     // Catch:{ all -> 0x0090 }
            r4 = r20
            com.google.android.gms.tasks.af r4 = (com.google.android.gms.tasks.C146010af) r4     // Catch:{ all -> 0x0090 }
            r2.<init>(r4, r13)     // Catch:{ all -> 0x0090 }
            com.google.android.gms.location.internal.LocationRequestUpdateData r4 = new com.google.android.gms.location.internal.LocationRequestUpdateData     // Catch:{ all -> 0x0090 }
            r11 = 1
            r14 = 0
            r15 = 0
            r10 = r4
            r16 = r2
            r17 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0090 }
            r3.mo120444o(r4)     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r7)     // Catch:{ all -> 0x0090 }
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0090 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.C144974v.mo117678a(java.lang.Object, java.lang.Object):void");
    }
}
