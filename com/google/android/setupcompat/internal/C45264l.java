package com.google.android.setupcompat.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.setupcompat.C45237a;

/* renamed from: com.google.android.setupcompat.internal.l */
/* compiled from: PG */
final class C45264l implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C45267o f118237a;

    public C45264l(C45267o oVar) {
        this.f118237a = oVar;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f118237a.mo49152b(new C45265m(7, (C45237a) null));
    }

    public final void onNullBinding(ComponentName componentName) {
        this.f118237a.mo49152b(new C45265m(6, (C45237a) null));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x000b
            com.google.android.setupcompat.b.b r5 = com.google.android.setupcompat.internal.C45267o.f118240a
            java.lang.String r0 = "Binder is null when onServiceConnected was called!"
            r5.mo49115e(r0)
            r5 = 5
            goto L_0x000c
        L_0x000b:
            r5 = 4
        L_0x000c:
            com.google.android.setupcompat.internal.o r0 = r4.f118237a
            com.google.android.setupcompat.internal.m r1 = new com.google.android.setupcompat.internal.m
            if (r6 != 0) goto L_0x0014
            r6 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r2 = "com.google.android.setupcompat.ISetupCompatService"
            android.os.IInterface r2 = r6.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.setupcompat.C45237a
            if (r3 == 0) goto L_0x0022
            r6 = r2
            com.google.android.setupcompat.a r6 = (com.google.android.setupcompat.C45237a) r6
            goto L_0x0028
        L_0x0022:
            com.google.android.setupcompat.a r2 = new com.google.android.setupcompat.a
            r2.<init>(r6)
            r6 = r2
        L_0x0028:
            r1.<init>(r5, r6)
            r0.mo49152b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupcompat.internal.C45264l.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f118237a.mo49152b(new C45265m(5, (C45237a) null));
    }
}
