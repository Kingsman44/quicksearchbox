package com.google.android.gms.wearable.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.p445a.C8850c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.bn */
/* compiled from: PG */
final class C146456bn {

    /* renamed from: a */
    private final Map f395654a = new HashMap();

    /* renamed from: a */
    public final void mo123255a(C146499dc dcVar, C143825n nVar, Object obj, C146503dg dgVar) {
        synchronized (this.f395654a) {
            if (this.f395654a.get(obj) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String obj2 = obj.toString();
                    Log.v("WearableClient", "duplicate listener: " + obj2);
                }
                ((C146486cq) nVar).mo117682i(new Status(1, 4001, (String) null, (PendingIntent) null, (ConnectionResult) null));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String obj3 = obj.toString();
                Log.v("WearableClient", "new listener: " + obj3);
            }
            this.f395654a.put(obj, dgVar);
            try {
                ((C146452bj) dcVar.mo119451G()).mo123252e(new C146454bl(this.f395654a, obj, nVar), new AddListenerRequest(dgVar));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    String obj4 = obj.toString();
                    Log.d("WearableClient", "addListener failed, removing listener: " + obj4);
                }
                this.f395654a.remove(obj);
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final void mo123257c(C146499dc dcVar, C143825n nVar, Object obj) {
        synchronized (this.f395654a) {
            C146503dg dgVar = (C146503dg) this.f395654a.remove(obj);
            if (dgVar == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String obj2 = obj.toString();
                    Log.v("WearableClient", "remove Listener unknown: " + obj2);
                }
                ((C146485cp) nVar).mo117682i(new Status(1, 4002, (String) null, (PendingIntent) null, (ConnectionResult) null));
                return;
            }
            dgVar.mo123291a();
            if (Log.isLoggable("WearableClient", 2)) {
                String obj3 = obj.toString();
                Log.v("WearableClient", "service.removeListener: " + obj3);
            }
            C146452bj bjVar = (C146452bj) dcVar.mo119451G();
            C146455bm bmVar = new C146455bm(this.f395654a, obj, nVar);
            RemoveListenerRequest removeListenerRequest = new RemoveListenerRequest(dgVar);
            Parcel gA = bjVar.mo17260gA();
            C8850c.m23499h(gA, bmVar);
            C8850c.m23497f(gA, removeListenerRequest);
            bjVar.mo17262he(17, gA);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = java.lang.String.valueOf(r3.getKey());
        r4 = java.lang.String.valueOf(r4);
        android.util.Log.w("WearableClient", "onPostInitHandler: Didn't add: " + r3 + "/" + r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0078 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo123256b(android.os.IBinder r10) {
        /*
            r9 = this;
            java.util.Map r0 = r9.f395654a
            monitor-enter(r0)
            if (r10 != 0) goto L_0x0007
            r10 = 0
            goto L_0x001b
        L_0x0007:
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)     // Catch:{ all -> 0x00a5 }
            boolean r2 = r1 instanceof com.google.android.gms.wearable.internal.C146452bj     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x0015
            r10 = r1
            com.google.android.gms.wearable.internal.bj r10 = (com.google.android.gms.wearable.internal.C146452bj) r10     // Catch:{ all -> 0x00a5 }
            goto L_0x001b
        L_0x0015:
            com.google.android.gms.wearable.internal.bj r1 = new com.google.android.gms.wearable.internal.bj     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            r10 = r1
        L_0x001b:
            com.google.android.gms.wearable.internal.cw r1 = new com.google.android.gms.wearable.internal.cw     // Catch:{ all -> 0x00a5 }
            r1.<init>()     // Catch:{ all -> 0x00a5 }
            java.util.Map r2 = r9.f395654a     // Catch:{ all -> 0x00a5 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x002a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a5 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.wearable.internal.dg r4 = (com.google.android.gms.wearable.internal.C146503dg) r4     // Catch:{ all -> 0x00a5 }
            com.google.android.gms.wearable.internal.AddListenerRequest r5 = new com.google.android.gms.wearable.internal.AddListenerRequest     // Catch:{ RemoteException -> 0x0078 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0078 }
            r10.mo123252e(r1, r5)     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r5 = "WearableClient"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ RemoteException -> 0x0078 }
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r3.getKey()     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x0078 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0078 }
            r7.<init>()     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r8 = "onPostInitHandler: added: "
            r7.append(r8)     // Catch:{ RemoteException -> 0x0078 }
            r7.append(r5)     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r5 = "/"
            r7.append(r5)     // Catch:{ RemoteException -> 0x0078 }
            r7.append(r6)     // Catch:{ RemoteException -> 0x0078 }
            java.lang.String r5 = "WearableClient"
            java.lang.String r6 = r7.toString()     // Catch:{ RemoteException -> 0x0078 }
            android.util.Log.d(r5, r6)     // Catch:{ RemoteException -> 0x0078 }
            goto L_0x002a
        L_0x0078:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r6 = "onPostInitHandler: Didn't add: "
            r5.append(r6)     // Catch:{ all -> 0x00a5 }
            r5.append(r3)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "/"
            r5.append(r3)     // Catch:{ all -> 0x00a5 }
            r5.append(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "WearableClient"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00a5 }
            android.util.Log.w(r3, r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x002a
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            return
        L_0x00a5:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a8:
            throw r10
        L_0x00a9:
            goto L_0x00a8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C146456bn.mo123256b(android.os.IBinder):void");
    }
}
