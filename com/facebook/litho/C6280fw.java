package com.facebook.litho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.litho.fw */
/* compiled from: PG */
public final class C6280fw {

    /* renamed from: a */
    public Map f18539a;

    /* renamed from: b */
    public Map f18540b;

    /* renamed from: c */
    public Map f18541c;

    /* renamed from: d */
    public Map f18542d;

    /* renamed from: e */
    public Map f18543e;

    /* renamed from: f */
    public HashSet f18544f;

    /* renamed from: g */
    public Map f18545g;

    public C6280fw() {
    }

    /* renamed from: n */
    private static List m16840n(List list) {
        ArrayList arrayList = new ArrayList(list == null ? 4 : list.size());
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: o */
    private static void m16841o(String str, C6278fu fuVar, Map map) {
        List list = (List) map.get(str);
        if (list == null) {
            list = m16840n((List) null);
            map.put(str, list);
        }
        list.add(fuVar);
    }

    /* renamed from: p */
    private final synchronized void m16842p() {
        if (this.f18540b == null) {
            this.f18540b = new HashMap(4);
        }
    }

    /* renamed from: q */
    private final synchronized void m16843q() {
        if (this.f18539a == null) {
            this.f18539a = new HashMap(4);
        }
        if (this.f18542d == null) {
            this.f18542d = new HashMap(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Map mo13276a() {
        return this.f18542d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Map mo13277b() {
        return this.f18540b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized Map mo13278c() {
        return this.f18541c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized Map mo13279d() {
        return this.f18539a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized Map mo13280e() {
        return this.f18543e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized Set mo13281f() {
        HashSet hashSet;
        hashSet = new HashSet();
        Map map = this.f18542d;
        if (map != null) {
            hashSet.addAll(map.keySet());
        }
        Map map2 = this.f18539a;
        if (map2 != null) {
            hashSet.addAll(map2.keySet());
        }
        return hashSet;
    }

    /* renamed from: g */
    public final void mo13282g(Map map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                mo13286k();
                this.f18543e.clear();
                this.f18543e.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public final void mo13283h(Map map) {
        if (map != null && !map.isEmpty()) {
            synchronized (this) {
                mo13285j();
                this.f18541c.putAll(map);
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo13284i() {
        if (this.f18544f == null) {
            this.f18544f = new HashSet();
        }
    }

    /* renamed from: j */
    public final synchronized void mo13285j() {
        if (this.f18541c == null) {
            this.f18541c = new HashMap();
        }
    }

    /* renamed from: k */
    public final synchronized void mo13286k() {
        if (this.f18543e == null) {
            this.f18543e = new HashMap(4);
        }
    }

    /* renamed from: l */
    public final synchronized void mo13287l(String str, C6278fu fuVar, boolean z) {
        m16843q();
        m16841o(str, fuVar, this.f18539a);
        if (z) {
            m16842p();
            m16841o(str, fuVar, this.f18540b);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13288m() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f18539a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000f:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6280fw.mo13288m():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6280fw(com.facebook.litho.C6280fw r8) {
        /*
            r7 = this;
            r7.<init>()
            if (r8 != 0) goto L_0x0006
            return
        L_0x0006:
            monitor-enter(r7)
            java.util.Map r0 = r8.mo13279d()     // Catch:{ all -> 0x00ce }
            java.util.Map r1 = r8.mo13277b()     // Catch:{ all -> 0x00ce }
            java.util.Map r2 = r8.mo13276a()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x001b
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0025
        L_0x001b:
            if (r2 == 0) goto L_0x00b3
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r3 == 0) goto L_0x0025
            goto L_0x00b3
        L_0x0025:
            r7.m16843q()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x0050
            java.util.Set r3 = r0.keySet()     // Catch:{ all -> 0x004e }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x004e }
        L_0x0032:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x004e }
            java.util.Map r5 = r7.f18539a     // Catch:{ all -> 0x004e }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x004e }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x004e }
            java.util.List r6 = m16840n(r6)     // Catch:{ all -> 0x004e }
            r5.put(r4, r6)     // Catch:{ all -> 0x004e }
            goto L_0x0032
        L_0x004e:
            r8 = move-exception
            goto L_0x00b2
        L_0x0050:
            if (r1 == 0) goto L_0x0086
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0059
            goto L_0x0086
        L_0x0059:
            r7.m16842p()     // Catch:{ all -> 0x004e }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x004e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004e }
        L_0x0064:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x004e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x004e }
            java.util.Map r3 = r7.f18540b     // Catch:{ all -> 0x004e }
            java.lang.Object r4 = r1.getKey()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x004e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x004e }
            java.util.List r1 = m16840n(r1)     // Catch:{ all -> 0x004e }
            r3.put(r4, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0064
        L_0x0086:
            if (r2 == 0) goto L_0x00b3
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x004e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004e }
        L_0x0090:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x00b3
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x004e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x004e }
            java.util.Map r2 = r7.f18542d     // Catch:{ all -> 0x004e }
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x004e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x004e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x004e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x004e }
            java.util.List r1 = m16840n(r1)     // Catch:{ all -> 0x004e }
            r2.put(r3, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0090
        L_0x00b2:
            throw r8     // Catch:{ all -> 0x00ce }
        L_0x00b3:
            java.util.Map r0 = r8.mo13280e()     // Catch:{ all -> 0x00ce }
            r7.mo13282g(r0)     // Catch:{ all -> 0x00ce }
            java.util.Map r0 = r8.mo13278c()     // Catch:{ all -> 0x00ce }
            r7.mo13283h(r0)     // Catch:{ all -> 0x00ce }
            java.util.Map r8 = r8.f18545g     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00cc
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00ce }
            r0.<init>(r8)     // Catch:{ all -> 0x00ce }
            r7.f18545g = r0     // Catch:{ all -> 0x00ce }
        L_0x00cc:
            monitor-exit(r7)     // Catch:{ all -> 0x00ce }
            return
        L_0x00ce:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00ce }
            goto L_0x00d2
        L_0x00d1:
            throw r8
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6280fw.<init>(com.facebook.litho.fw):void");
    }
}
