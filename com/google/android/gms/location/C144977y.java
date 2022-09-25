package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.location.internal.C144946x;

/* renamed from: com.google.android.gms.location.y */
/* compiled from: PG */
public final class C144977y implements C143798cs, C144946x {

    /* renamed from: a */
    public C143784ce f391946a;

    /* renamed from: b */
    public boolean f391947b = true;

    /* renamed from: c */
    public final /* synthetic */ C144978z f391948c;

    public C144977y(C144978z zVar, C143784ce ceVar) {
        this.f391948c = zVar;
        this.f391946a = ceVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo117678a(java.lang.Object r13, java.lang.Object r14) {
        /*
            r12 = this;
            com.google.android.gms.location.internal.ag r13 = (com.google.android.gms.location.internal.C144918ag) r13
            monitor-enter(r12)
            com.google.android.gms.common.api.internal.ce r0 = r12.f391946a     // Catch:{ all -> 0x0090 }
            com.google.android.gms.common.api.internal.cc r0 = r0.f389806b     // Catch:{ all -> 0x0090 }
            boolean r1 = r12.f391947b     // Catch:{ all -> 0x0090 }
            com.google.android.gms.common.api.internal.ce r2 = r12.f391946a     // Catch:{ all -> 0x0090 }
            r3 = 0
            r2.f389805a = r3     // Catch:{ all -> 0x0090 }
            r2.f389806b = r3     // Catch:{ all -> 0x0090 }
            monitor-exit(r12)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0020
            r13 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            com.google.android.gms.tasks.af r14 = (com.google.android.gms.tasks.C146010af) r14
            com.google.android.gms.tasks.aj r14 = r14.f394698a
            r14.mo122508v(r13)
            return
        L_0x0020:
            androidx.c.n r2 = r13.f391882a
            monitor-enter(r2)
            androidx.c.n r4 = r13.f391882a     // Catch:{ all -> 0x008d }
            java.lang.Object r0 = r4.remove(r0)     // Catch:{ all -> 0x008d }
            r7 = r0
            com.google.android.gms.location.internal.ae r7 = (com.google.android.gms.location.internal.C144916ae) r7     // Catch:{ all -> 0x008d }
            if (r7 != 0) goto L_0x0039
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.af r14 = (com.google.android.gms.tasks.C146010af) r14     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.aj r14 = r14.f394698a     // Catch:{ all -> 0x008d }
            r14.mo122508v(r13)     // Catch:{ all -> 0x008d }
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            return
        L_0x0039:
            com.google.android.gms.location.internal.x r0 = r7.f391880a     // Catch:{ all -> 0x008d }
            com.google.android.gms.common.api.internal.ce r0 = r0.mo120448b()     // Catch:{ all -> 0x008d }
            r0.f389805a = r3     // Catch:{ all -> 0x008d }
            r0.f389806b = r3     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0082
            com.google.android.gms.common.Feature r0 = com.google.android.gms.location.C144956q.f391917j     // Catch:{ all -> 0x008d }
            boolean r0 = r13.mo120420q(r0)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0064
            android.os.IInterface r13 = r13.mo119451G()     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.h r13 = (com.google.android.gms.location.internal.C144930h) r13     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.LocationReceiver r0 = com.google.android.gms.location.internal.LocationReceiver.m235511b(r3, r7, r3)     // Catch:{ all -> 0x008d }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.r r3 = new com.google.android.gms.location.internal.r     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.af r14 = (com.google.android.gms.tasks.C146010af) r14     // Catch:{ all -> 0x008d }
            r3.<init>(r1, r14)     // Catch:{ all -> 0x008d }
            r13.mo120443n(r0, r3)     // Catch:{ all -> 0x008d }
            goto L_0x008b
        L_0x0064:
            android.os.IInterface r13 = r13.mo119451G()     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.h r13 = (com.google.android.gms.location.internal.C144930h) r13     // Catch:{ all -> 0x008d }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.t r10 = new com.google.android.gms.location.internal.t     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.af r14 = (com.google.android.gms.tasks.C146010af) r14     // Catch:{ all -> 0x008d }
            r10.<init>(r0, r14)     // Catch:{ all -> 0x008d }
            com.google.android.gms.location.internal.LocationRequestUpdateData r14 = new com.google.android.gms.location.internal.LocationRequestUpdateData     // Catch:{ all -> 0x008d }
            r5 = 2
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008d }
            r13.mo120444o(r14)     // Catch:{ all -> 0x008d }
            goto L_0x008b
        L_0x0082:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.af r14 = (com.google.android.gms.tasks.C146010af) r14     // Catch:{ all -> 0x008d }
            com.google.android.gms.tasks.aj r14 = r14.f394698a     // Catch:{ all -> 0x008d }
            r14.mo122508v(r13)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            throw r13
        L_0x0090:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0090 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.C144977y.mo117678a(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: b */
    public final synchronized C143784ce mo120448b() {
        return this.f391946a;
    }

    /* renamed from: c */
    public final synchronized void mo120449c(C143784ce ceVar) {
        C143784ce ceVar2 = this.f391946a;
        if (ceVar2 != ceVar) {
            ceVar2.f389805a = null;
            ceVar2.f389806b = null;
            this.f391946a = ceVar;
        }
    }
}
