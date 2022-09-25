package androidx.media;

import android.os.IBinder;

/* renamed from: androidx.media.ae */
/* compiled from: PG */
final class C2407ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f6657a;

    /* renamed from: b */
    final /* synthetic */ IBinder f6658b;

    /* renamed from: c */
    final /* synthetic */ C2413ak f6659c;

    /* renamed from: d */
    final /* synthetic */ C2414al f6660d;

    public C2407ae(C2413ak akVar, C2414al alVar, String str, IBinder iBinder) {
        this.f6659c = akVar;
        this.f6660d = alVar;
        this.f6657a = str;
        this.f6658b = iBinder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            androidx.media.al r0 = r9.f6660d
            android.os.Messenger r0 = r0.f6682a
            android.os.IBinder r0 = r0.getBinder()
            androidx.media.ak r1 = r9.f6659c
            androidx.media.an r1 = r1.f6681a
            androidx.c.g r1 = r1.f6687c
            java.lang.Object r0 = r1.get(r0)
            androidx.media.m r0 = (androidx.media.C2436m) r0
            java.lang.String r1 = "MBServiceCompat"
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = r9.f6657a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "removeSubscription for callback that isn't registered id="
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.w(r1, r0)
            return
        L_0x0028:
            java.lang.String r2 = r9.f6657a
            android.os.IBinder r3 = r9.f6658b
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x003b
            java.util.HashMap r0 = r0.f6722d     // Catch:{ all -> 0x0085 }
            java.lang.Object r0 = r0.remove(r2)     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0039
            goto L_0x006a
        L_0x0039:
            r4 = 0
            goto L_0x006a
        L_0x003b:
            java.util.HashMap r6 = r0.f6722d     // Catch:{ all -> 0x0085 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0085 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0039
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0085 }
        L_0x0049:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0085 }
            if (r8 == 0) goto L_0x005e
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0085 }
            androidx.core.i.e r8 = (androidx.core.p097i.C1970e) r8     // Catch:{ all -> 0x0085 }
            java.lang.Object r8 = r8.f5888a     // Catch:{ all -> 0x0085 }
            if (r3 != r8) goto L_0x0049
            r7.remove()     // Catch:{ all -> 0x0085 }
            r5 = 1
            goto L_0x0049
        L_0x005e:
            int r3 = r6.size()     // Catch:{ all -> 0x0085 }
            if (r3 != 0) goto L_0x0069
            java.util.HashMap r0 = r0.f6722d     // Catch:{ all -> 0x0085 }
            r0.remove(r2)     // Catch:{ all -> 0x0085 }
        L_0x0069:
            r4 = r5
        L_0x006a:
            if (r4 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "removeSubscription called for "
            r0.<init>(r2)
            java.lang.String r2 = r9.f6657a
            r0.append(r2)
            java.lang.String r2 = " which is not subscribed"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
        L_0x0084:
            return
        L_0x0085:
            r0 = move-exception
            goto L_0x0088
        L_0x0087:
            throw r0
        L_0x0088:
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.C2407ae.run():void");
    }
}
