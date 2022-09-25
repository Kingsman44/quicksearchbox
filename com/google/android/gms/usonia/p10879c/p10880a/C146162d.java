package com.google.android.gms.usonia.p10879c.p10880a;

import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.directory.C146209c;
import com.google.android.gms.usonia.p10879c.C146167c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: com.google.android.gms.usonia.c.a.d */
/* compiled from: PG */
final class C146162d extends C146209c {

    /* renamed from: a */
    private static final C59071e f394927a = C59071e.m91332i("com.google.android.gms.usonia.c.a.d");

    /* renamed from: b */
    private final Map f394928b = new HashMap();

    /* renamed from: c */
    private final Map f394929c = new HashMap();

    /* renamed from: d */
    private int f394930d = 0;

    /* renamed from: g */
    private final synchronized PeerAddress[] m238074g(String str) {
        HashSet hashSet = (HashSet) this.f394928b.get(str);
        if (hashSet == null) {
            return new PeerAddress[0];
        }
        return (PeerAddress[]) hashSet.toArray(new PeerAddress[0]);
    }

    /* renamed from: a */
    public final void mo25090a(String str, PeerAddress peerAddress) {
        synchronized (this) {
            if (!this.f394928b.containsKey(str)) {
                this.f394928b.put(str, new HashSet());
            }
            ((HashSet) this.f394928b.get(str)).add(peerAddress);
        }
        ((C59052c) ((C59052c) f394927a.mo56224b()).mo56372aa(42067)).mo56354G("%s now provides %s.", peerAddress.mo122618a(), str);
        HashMap hashMap = (HashMap) this.f394929c.get(str);
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C146167c) entry.getKey()).mo106359a(new PeerAddress[]{peerAddress}, new PeerAddress[0]);
                C58833ax axVar = (C58833ax) entry.getValue();
                if (axVar.mo56113h()) {
                    C146163e eVar = (C146163e) axVar.mo56107c();
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r2 >= r0) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r7[r2].mo106359a(new com.google.android.gms.usonia.PeerAddress[0], new com.google.android.gms.usonia.PeerAddress[]{r8});
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r7 = mo122729f(r7);
        r0 = r7.length;
        r2 = 0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25091b(java.lang.String r7, com.google.android.gms.usonia.PeerAddress r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f394928b     // Catch:{ all -> 0x004a }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0025
            com.google.common.f.e r0 = f394927a     // Catch:{ all -> 0x004a }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x004a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x004a }
            r1 = 42068(0xa454, float:5.895E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x004a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "%s went offline, but we aren't watching %s"
            java.lang.String r8 = r8.mo122618a()     // Catch:{ all -> 0x004a }
            r0.mo56354G(r1, r8, r7)     // Catch:{ all -> 0x004a }
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            return
        L_0x0025:
            java.util.Map r0 = r6.f394928b     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x004a }
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x004a }
            r0.remove(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            com.google.android.gms.usonia.c.c[] r7 = r6.mo122729f(r7)
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L_0x0038:
            if (r2 >= r0) goto L_0x0049
            r3 = r7[r2]
            com.google.android.gms.usonia.PeerAddress[] r4 = new com.google.android.gms.usonia.PeerAddress[r1]
            r5 = 1
            com.google.android.gms.usonia.PeerAddress[] r5 = new com.google.android.gms.usonia.PeerAddress[r5]
            r5[r1] = r8
            r3.mo106359a(r4, r5)
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0049:
            return
        L_0x004a:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004d:
            throw r7
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.usonia.p10879c.p10880a.C146162d.mo25091b(java.lang.String, com.google.android.gms.usonia.PeerAddress):void");
    }

    /* renamed from: c */
    public final synchronized int mo122726c() {
        return this.f394930d;
    }

    /* renamed from: d */
    public final synchronized void mo122727d(String str, C146167c cVar, C58833ax axVar) {
        if (!this.f394929c.containsKey(str)) {
            this.f394929c.put(str, new HashMap());
        }
        if (!((HashMap) this.f394929c.get(str)).containsKey(cVar)) {
            ((HashMap) this.f394929c.get(str)).put(cVar, axVar);
            this.f394930d++;
            if (m238074g(str).length > 0) {
                cVar.mo106359a(m238074g(str), new PeerAddress[0]);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Attempted to add the same observer for the same service name twice");
    }

    /* renamed from: e */
    public final synchronized void mo122728e(String str, C146167c cVar) {
        if (!this.f394929c.containsKey(str)) {
            throw new IllegalArgumentException("Requested to remove observer for " + str + " but it isn't being observed.");
        } else if (((HashMap) this.f394929c.get(str)).remove(cVar) != null) {
            this.f394930d--;
        } else {
            throw new IllegalArgumentException("Requested to remove observer " + String.valueOf(cVar) + " from " + str + "but it isn't registered.");
        }
    }

    /* renamed from: f */
    public final synchronized C146167c[] mo122729f(String str) {
        Map map = (Map) this.f394929c.get(str);
        if (map == null) {
            return new C146167c[0];
        }
        return (C146167c[]) map.keySet().toArray(new C146167c[0]);
    }
}
