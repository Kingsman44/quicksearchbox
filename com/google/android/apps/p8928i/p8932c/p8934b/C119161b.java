package com.google.android.apps.p8928i.p8932c.p8934b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.android.apps.i.c.b.b */
/* compiled from: PG */
final class C119161b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C119162c f332333a;

    public C119161b(C119162c cVar) {
        this.f332333a = cVar;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (!this.f332333a.f332337c.isDone() || !(this.f332333a.f332337c.value instanceof C60873d.C60875b)) {
            this.f332333a.f332337c.mo57357o(new C119160a("Duo ClientApi service disconnected before providing a value."));
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            com.google.android.apps.i.c.b.c r3 = r2.f332333a     // Catch:{ Exception -> 0x0043 }
            com.google.common.util.concurrent.SettableFuture r3 = r3.f332337c     // Catch:{ Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0008
            r4 = 0
            goto L_0x001c
        L_0x0008:
            java.lang.String r0 = "com.google.android.apps.tachyon.clientapi.IClientApiService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ Exception -> 0x0043 }
            boolean r1 = r0 instanceof com.google.android.apps.p8928i.p8931b.C119149a     // Catch:{ Exception -> 0x0043 }
            if (r1 == 0) goto L_0x0016
            r4 = r0
            com.google.android.apps.i.b.a r4 = (com.google.android.apps.p8928i.p8931b.C119149a) r4     // Catch:{ Exception -> 0x0043 }
            goto L_0x001c
        L_0x0016:
            com.google.android.apps.i.b.a r0 = new com.google.android.apps.i.b.a     // Catch:{ Exception -> 0x0043 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0043 }
            r4 = r0
        L_0x001c:
            android.os.Parcel r0 = r4.mo17260gA()     // Catch:{ Exception -> 0x0043 }
            r1 = 1
            android.os.Parcel r4 = r4.mo17261gT(r1, r0)     // Catch:{ Exception -> 0x0043 }
            byte[] r0 = r4.createByteArray()     // Catch:{ Exception -> 0x0043 }
            r4.recycle()     // Catch:{ Exception -> 0x0043 }
            com.google.r.a.a.a.d r4 = com.google.p5177r.p5178a.p5179a.p5180a.C66276d.f180244c     // Catch:{ Exception -> 0x0043 }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r0)     // Catch:{ Exception -> 0x0043 }
            com.google.r.a.a.a.d r4 = (com.google.p5177r.p5178a.p5179a.p5180a.C66276d) r4     // Catch:{ Exception -> 0x0043 }
            r3.mo57356n(r4)     // Catch:{ Exception -> 0x0043 }
            com.google.android.apps.i.c.b.c r3 = r2.f332333a
            android.content.Context r4 = r3.f332336b
            android.content.ServiceConnection r3 = r3.f332338d
        L_0x003d:
            r4.unbindService(r3)
            return
        L_0x0041:
            r3 = move-exception
            goto L_0x0052
        L_0x0043:
            r3 = move-exception
            com.google.android.apps.i.c.b.c r4 = r2.f332333a     // Catch:{ all -> 0x0041 }
            com.google.common.util.concurrent.SettableFuture r4 = r4.f332337c     // Catch:{ all -> 0x0041 }
            r4.mo57357o(r3)     // Catch:{ all -> 0x0041 }
            com.google.android.apps.i.c.b.c r3 = r2.f332333a
            android.content.Context r4 = r3.f332336b
            android.content.ServiceConnection r3 = r3.f332338d
            goto L_0x003d
        L_0x0052:
            com.google.android.apps.i.c.b.c r4 = r2.f332333a
            android.content.Context r0 = r4.f332336b
            android.content.ServiceConnection r4 = r4.f332338d
            r0.unbindService(r4)
            goto L_0x005d
        L_0x005c:
            throw r3
        L_0x005d:
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.p8928i.p8932c.p8934b.C119161b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
