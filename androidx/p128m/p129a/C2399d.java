package androidx.p128m.p129a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* renamed from: androidx.m.a.d */
/* compiled from: PG */
public final class C2399d {

    /* renamed from: d */
    private static final Object f6626d = new Object();

    /* renamed from: e */
    private static C2399d f6627e;

    /* renamed from: a */
    public final Context f6628a;

    /* renamed from: b */
    public final HashMap f6629b = new HashMap();

    /* renamed from: c */
    public final ArrayList f6630c = new ArrayList();

    /* renamed from: f */
    private final HashMap f6631f = new HashMap();

    /* renamed from: g */
    private final Handler f6632g;

    private C2399d(Context context) {
        this.f6628a = context;
        this.f6632g = new C2396a(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static C2399d m6419a(Context context) {
        C2399d dVar;
        synchronized (f6626d) {
            if (f6627e == null) {
                f6627e = new C2399d(context.getApplicationContext());
            }
            dVar = f6627e;
        }
        return dVar;
    }

    /* renamed from: b */
    public final void mo5803b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f6629b) {
            C2398c cVar = new C2398c(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) this.f6629b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f6629b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) this.f6631f.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f6631f.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo5804c(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f6629b) {
            ArrayList arrayList = (ArrayList) this.f6629b.remove(broadcastReceiver);
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C2398c cVar = (C2398c) arrayList.get(size);
                        cVar.f6625d = true;
                        for (int i = 0; i < cVar.f6622a.countActions(); i++) {
                            String action = cVar.f6622a.getAction(i);
                            ArrayList arrayList2 = (ArrayList) this.f6631f.get(action);
                            if (arrayList2 != null) {
                                int size2 = arrayList2.size();
                                while (true) {
                                    size2--;
                                    if (size2 < 0) {
                                        break;
                                    }
                                    C2398c cVar2 = (C2398c) arrayList2.get(size2);
                                    if (cVar2.f6623b == broadcastReceiver) {
                                        cVar2.f6625d = true;
                                        arrayList2.remove(size2);
                                    }
                                }
                                if (arrayList2.size() <= 0) {
                                    this.f6631f.remove(action);
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0165, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5805d(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "Action list: "
            java.lang.String r3 = "Resolving type "
            java.util.HashMap r4 = r1.f6629b
            monitor-enter(r4)
            java.lang.String r12 = r23.getAction()     // Catch:{ all -> 0x0169 }
            android.content.Context r5 = r1.f6628a     // Catch:{ all -> 0x0169 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0169 }
            java.lang.String r13 = r0.resolveTypeIfNeeded(r5)     // Catch:{ all -> 0x0169 }
            android.net.Uri r14 = r23.getData()     // Catch:{ all -> 0x0169 }
            java.lang.String r15 = r23.getScheme()     // Catch:{ all -> 0x0169 }
            java.util.Set r16 = r23.getCategories()     // Catch:{ all -> 0x0169 }
            int r5 = r23.getFlags()     // Catch:{ all -> 0x0169 }
            r5 = r5 & 8
            r11 = 0
            r10 = 1
            if (r5 == 0) goto L_0x0032
            r17 = 1
            goto L_0x0034
        L_0x0032:
            r17 = 0
        L_0x0034:
            if (r17 == 0) goto L_0x0057
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r5.<init>(r3)     // Catch:{ all -> 0x0169 }
            r5.append(r13)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = " scheme "
            r5.append(r3)     // Catch:{ all -> 0x0169 }
            r5.append(r15)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = " of intent "
            r5.append(r3)     // Catch:{ all -> 0x0169 }
            r5.append(r0)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r3, r5)     // Catch:{ all -> 0x0169 }
        L_0x0057:
            java.util.HashMap r3 = r1.f6631f     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = r23.getAction()     // Catch:{ all -> 0x0169 }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0169 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0169 }
            if (r3 == 0) goto L_0x0166
            r5 = 0
            if (r17 == 0) goto L_0x0079
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>(r2)     // Catch:{ all -> 0x0169 }
            r6.append(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r2 = "LocalBroadcastManager"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r2, r6)     // Catch:{ all -> 0x0169 }
        L_0x0079:
            r2 = r5
            r9 = 0
        L_0x007b:
            int r5 = r3.size()     // Catch:{ all -> 0x0169 }
            if (r9 >= r5) goto L_0x0137
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x0169 }
            r8 = r5
            androidx.m.a.c r8 = (androidx.p128m.p129a.C2398c) r8     // Catch:{ all -> 0x0169 }
            if (r17 == 0) goto L_0x00a2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r5.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = "Matching against filter "
            r5.append(r6)     // Catch:{ all -> 0x0169 }
            android.content.IntentFilter r6 = r8.f6622a     // Catch:{ all -> 0x0169 }
            r5.append(r6)     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = "LocalBroadcastManager"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r6, r5)     // Catch:{ all -> 0x0169 }
        L_0x00a2:
            boolean r5 = r8.f6624c     // Catch:{ all -> 0x0169 }
            if (r5 == 0) goto L_0x00b8
            if (r17 == 0) goto L_0x00af
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.String r6 = "  Filter's target already added"
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0169 }
        L_0x00af:
            r19 = r3
            r20 = r9
            r21 = r12
            r12 = 1
            goto L_0x012d
        L_0x00b8:
            android.content.IntentFilter r5 = r8.f6622a     // Catch:{ all -> 0x0169 }
            java.lang.String r18 = "LocalBroadcastManager"
            r6 = r12
            r7 = r13
            r19 = r3
            r3 = r8
            r8 = r15
            r20 = r9
            r9 = r14
            r21 = r12
            r12 = 1
            r10 = r16
            r11 = r18
            int r5 = r5.match(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0169 }
            if (r5 < 0) goto L_0x00fb
            if (r17 == 0) goto L_0x00ee
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r6.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r7 = "  Filter matched!  match=0x"
            r6.append(r7)     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0169 }
            r6.append(r5)     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0169 }
        L_0x00ee:
            if (r2 != 0) goto L_0x00f5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0169 }
            r2.<init>()     // Catch:{ all -> 0x0169 }
        L_0x00f5:
            r2.add(r3)     // Catch:{ all -> 0x0169 }
            r3.f6624c = r12     // Catch:{ all -> 0x0169 }
            goto L_0x012d
        L_0x00fb:
            if (r17 == 0) goto L_0x012d
            r3 = -4
            if (r5 == r3) goto L_0x0115
            r3 = -3
            if (r5 == r3) goto L_0x0112
            r3 = -2
            if (r5 == r3) goto L_0x010f
            r3 = -1
            if (r5 == r3) goto L_0x010c
            java.lang.String r3 = "unknown reason"
            goto L_0x0117
        L_0x010c:
            java.lang.String r3 = "type"
            goto L_0x0117
        L_0x010f:
            java.lang.String r3 = "data"
            goto L_0x0117
        L_0x0112:
            java.lang.String r3 = "action"
            goto L_0x0117
        L_0x0115:
            java.lang.String r3 = "category"
        L_0x0117:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r5.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch:{ all -> 0x0169 }
            r5.append(r3)     // Catch:{ all -> 0x0169 }
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0169 }
            android.util.Log.v(r3, r5)     // Catch:{ all -> 0x0169 }
        L_0x012d:
            int r9 = r20 + 1
            r3 = r19
            r12 = r21
            r10 = 1
            r11 = 0
            goto L_0x007b
        L_0x0137:
            r12 = 1
            if (r2 == 0) goto L_0x0166
            r11 = 0
        L_0x013b:
            int r3 = r2.size()     // Catch:{ all -> 0x0169 }
            if (r11 >= r3) goto L_0x014d
            java.lang.Object r3 = r2.get(r11)     // Catch:{ all -> 0x0169 }
            androidx.m.a.c r3 = (androidx.p128m.p129a.C2398c) r3     // Catch:{ all -> 0x0169 }
            r5 = 0
            r3.f6624c = r5     // Catch:{ all -> 0x0169 }
            int r11 = r11 + 1
            goto L_0x013b
        L_0x014d:
            java.util.ArrayList r3 = r1.f6630c     // Catch:{ all -> 0x0169 }
            androidx.m.a.b r5 = new androidx.m.a.b     // Catch:{ all -> 0x0169 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0169 }
            r3.add(r5)     // Catch:{ all -> 0x0169 }
            android.os.Handler r0 = r1.f6632g     // Catch:{ all -> 0x0169 }
            boolean r0 = r0.hasMessages(r12)     // Catch:{ all -> 0x0169 }
            if (r0 != 0) goto L_0x0164
            android.os.Handler r0 = r1.f6632g     // Catch:{ all -> 0x0169 }
            r0.sendEmptyMessage(r12)     // Catch:{ all -> 0x0169 }
        L_0x0164:
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            return r12
        L_0x0166:
            r5 = 0
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            return r5
        L_0x0169:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0169 }
            goto L_0x016d
        L_0x016c:
            throw r0
        L_0x016d:
            goto L_0x016c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p128m.p129a.C2399d.mo5805d(android.content.Intent):boolean");
    }
}
