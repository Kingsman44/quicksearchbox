package androidx.media;

import android.os.Bundle;

/* renamed from: androidx.media.h */
/* compiled from: PG */
final class C2431h extends C2449z {

    /* renamed from: a */
    final /* synthetic */ C2436m f6710a;

    /* renamed from: b */
    final /* synthetic */ String f6711b;

    /* renamed from: c */
    final /* synthetic */ Bundle f6712c;

    /* renamed from: d */
    final /* synthetic */ C2416an f6713d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2431h(C2416an anVar, Object obj, C2436m mVar, String str, Bundle bundle) {
        super(obj);
        this.f6713d = anVar;
        this.f6710a = mVar;
        this.f6711b = str;
        this.f6712c = bundle;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo5853a(java.lang.Object r7) {
        /*
            r6 = this;
            androidx.media.an r0 = r6.f6713d
            androidx.c.g r0 = r0.f6687c
            androidx.media.m r1 = r6.f6710a
            androidx.media.al r1 = r1.f6725g
            android.os.Messenger r1 = r1.f6682a
            android.os.IBinder r1 = r1.getBinder()
            java.lang.Object r0 = r0.get(r1)
            androidx.media.m r1 = r6.f6710a
            java.lang.String r2 = "MBServiceCompat"
            if (r0 == r1) goto L_0x003c
            boolean r7 = androidx.media.C2416an.f6685a
            if (r7 == 0) goto L_0x003b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Not sending onLoadChildren result for connection that has been disconnected. pkg="
            r7.<init>(r0)
            androidx.media.m r0 = r6.f6710a
            java.lang.String r0 = r0.f6719a
            r7.append(r0)
            java.lang.String r0 = " id="
            r7.append(r0)
            java.lang.String r0 = r6.f6711b
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r2, r7)
        L_0x003b:
            return
        L_0x003c:
            int r0 = r6.f6745h
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0048
            android.os.Bundle r0 = r6.f6712c
            java.util.List r7 = androidx.media.C2416an.m6440d(r7, r0)
        L_0x0048:
            androidx.media.m r0 = r6.f6710a     // Catch:{ RemoteException -> 0x007e }
            androidx.media.al r0 = r0.f6725g     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r1 = r6.f6711b     // Catch:{ RemoteException -> 0x007e }
            android.os.Bundle r3 = r6.f6712c     // Catch:{ RemoteException -> 0x007e }
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x007e }
            r4.<init>()     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r5 = "data_media_item_id"
            r4.putString(r5, r1)     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r1 = "data_options"
            r4.putBundle(r1, r3)     // Catch:{ RemoteException -> 0x007e }
            java.lang.String r1 = "data_notify_children_changed_options"
            r3 = 0
            r4.putBundle(r1, r3)     // Catch:{ RemoteException -> 0x007e }
            if (r7 == 0) goto L_0x0079
            java.lang.String r1 = "data_media_item_list"
            boolean r3 = r7 instanceof java.util.ArrayList     // Catch:{ RemoteException -> 0x007e }
            if (r3 == 0) goto L_0x0070
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ RemoteException -> 0x007e }
            goto L_0x0076
        L_0x0070:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x007e }
            r3.<init>(r7)     // Catch:{ RemoteException -> 0x007e }
            r7 = r3
        L_0x0076:
            r4.putParcelableArrayList(r1, r7)     // Catch:{ RemoteException -> 0x007e }
        L_0x0079:
            r7 = 3
            r0.mo5826a(r7, r4)     // Catch:{ RemoteException -> 0x007e }
            return
        L_0x007e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Calling onLoadChildren() failed for id="
            r7.<init>(r0)
            java.lang.String r0 = r6.f6711b
            r7.append(r0)
            java.lang.String r0 = " package="
            r7.append(r0)
            androidx.media.m r0 = r6.f6710a
            java.lang.String r0 = r0.f6719a
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.C2431h.mo5853a(java.lang.Object):void");
    }
}
