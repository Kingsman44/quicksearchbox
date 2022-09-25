package com.google.android.libraries.notifications.p2268e.p2279f.p2280a;

import android.text.TextUtils;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2265b.C29780d;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2268e.p2271b.C29839c;
import com.google.android.libraries.notifications.p2268e.p2279f.C29851a;
import com.google.android.libraries.notifications.p2268e.p2285i.p2286a.C29932c;
import com.google.android.libraries.notifications.p2268e.p2287j.C29958i;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.notifications.e.f.a.d */
/* compiled from: PG */
final class C29855d implements C29851a {

    /* renamed from: a */
    public final C29852a f80939a;

    /* renamed from: b */
    private final C29783b f80940b;

    /* renamed from: c */
    private final C29857f f80941c;

    /* renamed from: d */
    private final C29859h f80942d;

    public C29855d(C29783b bVar, C29852a aVar, C29857f fVar, C29859h hVar) {
        this.f80940b = bVar;
        this.f80939a = aVar;
        this.f80941c = fVar;
        this.f80942d = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m55270c(com.google.android.libraries.notifications.data.C29820k r21, java.util.List r22, com.google.android.libraries.notifications.C30007h r23, com.google.android.libraries.notifications.p2268e.p2271b.C29839c r24, boolean r25) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            java.lang.String r10 = "Retrying in scheduled notification receiver, caused by:"
            java.lang.String r11 = "OnNotificationReceivedHandler"
            java.lang.String r12 = "ChimeReceiver"
            boolean r0 = r23.mo35312f()
            if (r0 == 0) goto L_0x0021
            com.google.android.libraries.notifications.e.f.a.a r1 = r8.f80939a
            r7 = 0
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r1.mo35178a(r2, r3, r4, r5, r6, r7)
            return
        L_0x0021:
            com.google.android.libraries.notifications.e.f.a.f r13 = r8.f80941c
            long r0 = r23.mo35310c()
            r15 = 0
            if (r22 == 0) goto L_0x0032
            boolean r2 = r22.isEmpty()
            if (r2 != 0) goto L_0x0032
            r2 = 1
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            com.google.common.base.C58838bb.m90868c(r2)
            r16 = 0
            if (r9 == 0) goto L_0x0040
            java.lang.String r2 = r21.mo35009h()
            r6 = r2
            goto L_0x0042
        L_0x0040:
            r6 = r16
        L_0x0042:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r2 = "com.google.android.libraries.notifications.ACCOUNT_NAME"
            r5.putString(r2, r6)
            r7 = r24
            java.lang.Long r2 = r7.f80893a
            long r2 = r2.longValue()
            java.lang.String r4 = "com.google.android.libraries.notifications.DELIVERED_TIMESTAMP"
            r5.putLong(r4, r2)
            java.lang.String r2 = "com.google.android.libraries.notifications.MUTE_NOTIFICATION"
            r4 = r25
            r5.putInt(r2, r4)
            java.lang.String r2 = "com.google.android.libraries.notifications.IS_LOCAL_NOTIFICATION"
            r5.putInt(r2, r15)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r22.iterator()
        L_0x006e:
            boolean r17 = r2.hasNext()
            r14 = 5
            if (r17 == 0) goto L_0x008e
            java.lang.Object r17 = r2.next()
            com.google.bf.b.a.a.af r17 = (com.google.p4160bf.p4164b.p4165a.p4166a.C55526af) r17
            com.google.android.libraries.notifications.data.q r15 = r13.f80943a
            r18 = r2
            byte[] r2 = r17.toByteArray()
            com.google.android.libraries.notifications.data.p r2 = r15.mo35096a(r6, r14, r2)
            r3.add(r2)
            r2 = r18
            r15 = 0
            goto L_0x006e
        L_0x008e:
            com.google.android.libraries.notifications.k.e r2 = r13.f80944b     // Catch:{ a -> 0x00a4 }
            r15 = 5
            r18 = 6000(0x1770, double:2.9644E-320)
            long r18 = r0 + r18
            r1 = r2
            r2 = r21
            r14 = r3
            r3 = r15
            r4 = r13
            r15 = r6
            r6 = r18
            r1.mo35371c(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x00a2 }
            goto L_0x00ba
        L_0x00a2:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a4:
            r0 = move-exception
            r14 = r3
            r15 = r6
        L_0x00a7:
            java.lang.String r1 = "Unable to schedule task for notification received event."
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55795g(r11, r0, r1, r3)
            com.google.android.libraries.notifications.data.q r0 = r13.f80943a
            r0.mo35099d(r15, r14)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r14 = r3
        L_0x00ba:
            boolean r0 = r23.mo35312f()
            if (r0 != 0) goto L_0x00cc
            long r0 = r23.mo35310c()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            return
        L_0x00cc:
            com.google.android.libraries.notifications.c.b r0 = r8.f80940b
            com.google.android.libraries.notifications.e.f.a.c r13 = new com.google.android.libraries.notifications.e.f.a.c
            r1 = r13
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx r0 = r0.mo34979a(r13)
            java.lang.String r1 = "Blocking until operation is finished."
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r12, r1, r3)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r1 = 1
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            long r4 = r23.mo35310c()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r3[r2] = r1     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.lang.String r1 = " - Maximum blocked time: %d ms."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r12, r1, r3)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            long r3 = r23.mo35310c()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r3 = 0
            r2[r3] = r1     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.lang.String r1 = " - Total available time: %d ms."
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r12, r1, r2)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            long r1 = r23.mo35310c()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r0.get(r1, r3)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            boolean r0 = r14.isEmpty()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            if (r0 != 0) goto L_0x015a
            com.google.android.libraries.notifications.e.f.a.f r0 = r8.f80941c     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            boolean r1 = r14.isEmpty()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            if (r1 == 0) goto L_0x0129
            goto L_0x015a
        L_0x0129:
            if (r9 == 0) goto L_0x012f
            java.lang.String r16 = r21.mo35009h()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
        L_0x012f:
            r1 = r16
            com.google.android.libraries.notifications.data.q r2 = r0.f80943a     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r2.mo35099d(r1, r14)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            com.google.android.libraries.notifications.data.q r2 = r0.f80943a     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r3 = 5
            java.util.List r1 = r2.mo35097b(r1, r3)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            boolean r1 = r1.isEmpty()     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            if (r1 == 0) goto L_0x015a
            com.google.android.libraries.notifications.k.e r0 = r0.f80944b     // Catch:{ a -> 0x0149 }
            r0.mo35369a(r9, r3)     // Catch:{ a -> 0x0149 }
            return
        L_0x0149:
            r0 = move-exception
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            r3 = 0
            r1[r3] = r2     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
            java.lang.String r2 = "Unable to cancel tasks with jobId: [%d]"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r11, r0, r2, r1)     // Catch:{ InterruptedException -> 0x0165, TimeoutException -> 0x015d, ExecutionException -> 0x015b }
        L_0x015a:
            return
        L_0x015b:
            r0 = move-exception
            goto L_0x015e
        L_0x015d:
            r0 = move-exception
        L_0x015e:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r12, r0, r10, r1)
            return
        L_0x0165:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r12, r0, r10, r1)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2268e.p2279f.p2280a.C29855d.m55270c(com.google.android.libraries.notifications.data.k, java.util.List, com.google.android.libraries.notifications.h, com.google.android.libraries.notifications.e.b.c, boolean):void");
    }

    /* renamed from: a */
    public final void mo35176a(C29820k kVar, List list, C30007h hVar, C29839c cVar, boolean z) {
        m55270c(kVar, list, hVar, cVar, z);
    }

    /* renamed from: b */
    public final void mo35177b(C29780d dVar) {
        C29859h hVar = this.f80942d;
        if (!dVar.mo34968h().isEmpty()) {
            if (dVar.mo34971j() == 1) {
                if (((Map) hVar.f80950c.mo27525b()).containsKey(Integer.valueOf(dVar.mo34960a()))) {
                    ((C29958i) ((Map) hVar.f80950c.mo27525b()).get(Integer.valueOf(dVar.mo34960a()))).mo35229a(dVar);
                } else {
                    C30058b.m55789a("SystemTrayUserEventHelper", "No handler installed for system tray events of type %s", Integer.valueOf(dVar.mo34960a()));
                }
            }
            ArrayList arrayList = new ArrayList(dVar.mo34968h().size());
            for (int i = 0; i < dVar.mo34968h().size(); i++) {
                arrayList.add(((C29827r) dVar.mo34968h().get(i)).mo35063j());
            }
            hVar.f80949b.mo35173b(dVar.mo34962c(), arrayList, dVar.mo34966f(), dVar.mo34971j(), dVar.mo34972k());
            if (dVar.mo34971j() != 4 && !C55564bq.f146602f.equals(dVar.mo34966f())) {
                if (dVar.mo34962c() != null) {
                    C29932c cVar = hVar.f80951d;
                    cVar.f81058a.mo35208c(dVar.mo34962c(), dVar.mo34966f(), dVar.mo34967g(), dVar.mo34971j(), C29827r.m55148u(dVar.mo34968h()));
                    return;
                }
                for (C29827r rVar : dVar.mo34968h()) {
                    if (!TextUtils.isEmpty(rVar.mo35065l())) {
                        hVar.f80948a.mo35194i(rVar.mo35065l(), dVar.mo34966f());
                    }
                }
            }
        }
    }
}
