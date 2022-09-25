package com.google.android.libraries.notifications.p2294i.p2295a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;

/* renamed from: com.google.android.libraries.notifications.i.a.a */
/* compiled from: PG */
public final class C30018a {

    /* renamed from: a */
    private final C30021d f81238a;

    /* renamed from: b */
    private final C30026i f81239b;

    public C30018a(C30021d dVar, C30026i iVar) {
        this.f81238a = dVar;
        this.f81239b = iVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5 = r0.f81255c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0034 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo35342a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.libraries.p1623at.p1632e.C19559g.m37303b()     // Catch:{ all -> 0x0038 }
            com.google.android.libraries.notifications.i.a.i r0 = r4.f81239b     // Catch:{ all -> 0x0038 }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0038 }
            r1 = r1 ^ 1
            java.lang.String r2 = "Account name must not be empty."
            com.google.common.base.C58838bb.m90869d(r1, r2)     // Catch:{ all -> 0x0038 }
            com.google.android.libraries.notifications.data.n r1 = r0.f81254b     // Catch:{ m -> 0x0034 }
            com.google.android.libraries.notifications.data.k r1 = r1.mo35088b(r5)     // Catch:{ m -> 0x0034 }
            com.google.android.libraries.notifications.f r2 = r1.mo35002b()     // Catch:{ all -> 0x0038 }
            com.google.android.libraries.notifications.f r3 = com.google.android.libraries.notifications.C29986f.UNREGISTERED     // Catch:{ all -> 0x0038 }
            if (r2 == r3) goto L_0x0030
            com.google.android.libraries.notifications.f r3 = com.google.android.libraries.notifications.C29986f.PENDING_UNREGISTRATION     // Catch:{ all -> 0x0038 }
            if (r2 != r3) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            com.google.android.libraries.notifications.e.a.a.c r2 = r0.f81256d     // Catch:{ all -> 0x0038 }
            r2.mo35135a(r5, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.libraries.notifications.e.h.a r5 = r0.f81253a     // Catch:{ all -> 0x0038 }
            r5.mo35210e(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return
        L_0x0030:
            com.google.common.base.ax r5 = r0.f81255c     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return
        L_0x0034:
            com.google.common.base.ax r5 = r0.f81255c     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return
        L_0x0038:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2294i.p2295a.C30018a.mo35342a(java.lang.String):void");
    }

    /* renamed from: b */
    public final synchronized void mo35343b(String str) {
        mo35344c(str, C55540at.COLLABORATOR_API_CALL);
    }

    /* renamed from: c */
    public final synchronized void mo35344c(String str, C55540at atVar) {
        C19559g.m37303b();
        this.f81238a.mo35346a(str, false, atVar);
    }
}
