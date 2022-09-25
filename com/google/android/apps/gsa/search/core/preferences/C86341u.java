package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.p6986aj.C89185d;
import com.google.android.apps.gsa.shared.p6986aj.C89186e;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C63088z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.u */
/* compiled from: PG */
public final class C86341u implements C86337q {

    /* renamed from: a */
    final /* synthetic */ C86346z f233435a;

    /* renamed from: b */
    private final Object f233436b = new Object();

    /* renamed from: c */
    private Map f233437c = new HashMap();

    /* renamed from: d */
    private boolean f233438d;

    public C86341u(C86346z zVar) {
        this.f233435a = zVar;
    }

    /* renamed from: a */
    public final void mo80066a() {
        synchronized (this.f233436b) {
            this.f233438d = true;
        }
    }

    public final void apply() {
        mo80086l(false);
    }

    /* renamed from: b */
    public final void mo80067b(String str, boolean z) {
        mo80085k(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo80068c(String str, byte[] bArr) {
        if (bArr == null) {
            mo80075j(str);
        } else {
            mo80085k(str, C63088z.m96139A(bArr));
        }
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        mo80066a();
        return this;
    }

    public final boolean commit() {
        return mo80086l(true);
    }

    /* renamed from: d */
    public final void mo80069d(String str, float f) {
        mo80085k(str, Float.valueOf(f));
    }

    /* renamed from: e */
    public final void mo80070e(String str, int i) {
        mo80085k(str, Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo80071f(String str, int[] iArr) {
        if (iArr == null) {
            mo80075j(str);
        } else {
            mo80085k(str, C60757n.m92749j((int[]) iArr.clone()));
        }
    }

    /* renamed from: g */
    public final void mo80072g(String str, long j) {
        mo80085k(str, Long.valueOf(j));
    }

    /* renamed from: h */
    public final void mo80073h(String str, String str2) {
        if (str2 == null) {
            mo80075j(str);
        } else {
            mo80085k(str, str2);
        }
    }

    /* renamed from: i */
    public final void mo80074i(String str, Set set) {
        if (set == null) {
            mo80075j(str);
        } else {
            mo80085k(str, new HashSet(set));
        }
    }

    /* renamed from: j */
    public final void mo80075j(String str) {
        mo80085k(str, this.f233435a.f233451f);
    }

    /* renamed from: k */
    public final void mo80085k(String str, Object obj) {
        synchronized (this.f233436b) {
            this.f233437c.put(str, obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010c  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo80086l(boolean r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.search.core.preferences.z r0 = r14.f233435a
            java.lang.Object r0 = r0.f233450e
            monitor-enter(r0)
            com.google.android.apps.gsa.search.core.preferences.z r1 = r14.f233435a     // Catch:{ all -> 0x0161 }
            java.util.Map r2 = r1.f233453h     // Catch:{ all -> 0x0161 }
            com.google.android.apps.gsa.search.core.preferences.x r1 = r1.f233456k     // Catch:{ all -> 0x0161 }
            if (r1 == 0) goto L_0x0017
            java.util.Map r1 = r1.f233443b     // Catch:{ all -> 0x0161 }
            if (r1 != r2) goto L_0x0017
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0161 }
            r1.<init>(r2)     // Catch:{ all -> 0x0161 }
            r2 = r1
        L_0x0017:
            java.lang.Object r1 = r14.f233436b     // Catch:{ all -> 0x0161 }
            monitor-enter(r1)     // Catch:{ all -> 0x0161 }
            boolean r3 = r14.f233438d     // Catch:{ all -> 0x015e }
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0065
            java.util.Map r3 = r14.f233437c     // Catch:{ all -> 0x015e }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.search.core.preferences.z r7 = r14.f233435a     // Catch:{ all -> 0x015e }
            com.google.common.base.bc r7 = r7.f233452g     // Catch:{ all -> 0x015e }
            com.google.common.p4522b.C58557jl.m90145z(r3, r7)     // Catch:{ all -> 0x015e }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0046
            java.util.Map r3 = r14.f233437c     // Catch:{ all -> 0x015e }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.preferences.z r3 = r14.f233435a     // Catch:{ all -> 0x015e }
            boolean r3 = r3.f233454i     // Catch:{ all -> 0x015e }
            if (r3 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r3 = r5
            r7 = 0
            goto L_0x0062
        L_0x0046:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x015e }
            java.util.Map r3 = r14.f233437c     // Catch:{ all -> 0x015e }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x015e }
            r2.<init>(r3)     // Catch:{ all -> 0x015e }
            java.util.Map r3 = r14.f233437c     // Catch:{ all -> 0x015e }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x015e }
            r7.<init>()     // Catch:{ all -> 0x015e }
            r14.f233437c = r7     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.search.core.preferences.z r7 = r14.f233435a     // Catch:{ all -> 0x015e }
            r7.f233454i = r6     // Catch:{ all -> 0x015e }
            r7 = 1
            r13 = r3
            r3 = r2
            r2 = r13
        L_0x0062:
            r14.f233438d = r4     // Catch:{ all -> 0x015e }
            goto L_0x00cc
        L_0x0065:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x015e }
            r3.<init>()     // Catch:{ all -> 0x015e }
            java.util.Map r7 = r14.f233437c     // Catch:{ all -> 0x015e }
            java.util.Set r7 = r7.entrySet()     // Catch:{ all -> 0x015e }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x015e }
        L_0x0074:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x015e }
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x015e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x015e }
            java.lang.Object r9 = r8.getKey()     // Catch:{ all -> 0x015e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x015e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x015e }
            java.lang.Object r10 = r2.get(r9)     // Catch:{ all -> 0x015e }
            com.google.android.apps.gsa.search.core.preferences.z r11 = r14.f233435a     // Catch:{ all -> 0x015e }
            boolean r12 = r11.f233454i     // Catch:{ all -> 0x015e }
            if (r12 == 0) goto L_0x00a5
            java.lang.Object r11 = r11.f233451f     // Catch:{ all -> 0x015e }
            if (r8 != r11) goto L_0x00a5
            boolean r8 = r2.containsKey(r9)     // Catch:{ all -> 0x015e }
            if (r8 == 0) goto L_0x0074
            r2.remove(r9)     // Catch:{ all -> 0x015e }
            r3.add(r9)     // Catch:{ all -> 0x015e }
            goto L_0x0074
        L_0x00a5:
            boolean r11 = r2.containsKey(r9)     // Catch:{ all -> 0x015e }
            if (r11 == 0) goto L_0x00bb
            if (r8 != 0) goto L_0x00b3
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x015e }
            if (r11 != 0) goto L_0x00bb
        L_0x00b3:
            if (r8 == 0) goto L_0x0074
            boolean r10 = r8.equals(r10)     // Catch:{ all -> 0x015e }
            if (r10 != 0) goto L_0x0074
        L_0x00bb:
            r2.put(r9, r8)     // Catch:{ all -> 0x015e }
            r3.add(r9)     // Catch:{ all -> 0x015e }
            goto L_0x0074
        L_0x00c2:
            java.util.Map r7 = r14.f233437c     // Catch:{ all -> 0x015e }
            r7.clear()     // Catch:{ all -> 0x015e }
            boolean r7 = r3.isEmpty()     // Catch:{ all -> 0x015e }
            r7 = r7 ^ r6
        L_0x00cc:
            monitor-exit(r1)     // Catch:{ all -> 0x015e }
            if (r3 == 0) goto L_0x00e9
            boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x0161 }
            if (r1 != 0) goto L_0x00e9
            com.google.android.apps.gsa.search.core.preferences.z r1 = r14.f233435a     // Catch:{ all -> 0x0161 }
            java.util.Set r1 = r1.f233455j     // Catch:{ all -> 0x0161 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0161 }
            if (r1 != 0) goto L_0x00e9
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0161 }
            com.google.android.apps.gsa.search.core.preferences.z r8 = r14.f233435a     // Catch:{ all -> 0x0161 }
            java.util.Set r8 = r8.f233455j     // Catch:{ all -> 0x0161 }
            r1.<init>(r8)     // Catch:{ all -> 0x0161 }
            goto L_0x00ea
        L_0x00e9:
            r1 = r5
        L_0x00ea:
            if (r7 == 0) goto L_0x0109
            com.google.android.apps.gsa.search.core.preferences.z r7 = r14.f233435a     // Catch:{ all -> 0x0161 }
            com.google.android.apps.gsa.search.core.preferences.x r8 = r7.f233456k     // Catch:{ all -> 0x0161 }
            if (r8 != 0) goto L_0x00f4
            r9 = 1
            goto L_0x00f5
        L_0x00f4:
            r9 = 0
        L_0x00f5:
            if (r8 == 0) goto L_0x00fd
            java.util.Map r8 = r8.f233443b     // Catch:{ all -> 0x0161 }
            java.util.Map r10 = r7.f233453h     // Catch:{ all -> 0x0161 }
            if (r8 != r10) goto L_0x0104
        L_0x00fd:
            com.google.android.apps.gsa.search.core.preferences.x r8 = new com.google.android.apps.gsa.search.core.preferences.x     // Catch:{ all -> 0x0161 }
            r8.<init>()     // Catch:{ all -> 0x0161 }
            r7.f233456k = r8     // Catch:{ all -> 0x0161 }
        L_0x0104:
            com.google.android.apps.gsa.search.core.preferences.z r7 = r14.f233435a     // Catch:{ all -> 0x0161 }
            r7.f233453h = r2     // Catch:{ all -> 0x0161 }
            goto L_0x010a
        L_0x0109:
            r9 = 0
        L_0x010a:
            if (r15 == 0) goto L_0x0134
            com.google.android.apps.gsa.search.core.preferences.z r15 = r14.f233435a     // Catch:{ all -> 0x0161 }
            com.google.android.apps.gsa.search.core.preferences.x r5 = r15.f233456k     // Catch:{ all -> 0x0161 }
            int r15 = r15.f233457l     // Catch:{ all -> 0x0161 }
            if (r15 == 0) goto L_0x0134
            com.google.common.f.e r15 = com.google.android.apps.gsa.search.core.preferences.C86346z.f233446a     // Catch:{ all -> 0x0161 }
            com.google.common.f.x r15 = r15.mo56226d()     // Catch:{ all -> 0x0161 }
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15     // Catch:{ all -> 0x0161 }
            java.lang.Throwable r2 = new java.lang.Throwable     // Catch:{ all -> 0x0161 }
            r2.<init>()     // Catch:{ all -> 0x0161 }
            com.google.common.f.x r15 = r15.mo56382g(r2)     // Catch:{ all -> 0x0161 }
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15     // Catch:{ all -> 0x0161 }
            r2 = 8314(0x207a, float:1.165E-41)
            com.google.common.f.x r15 = r15.mo56372aa(r2)     // Catch:{ all -> 0x0161 }
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "potential deadlock: commit while delayWrites"
            r15.mo56386p(r2)     // Catch:{ all -> 0x0161 }
        L_0x0134:
            monitor-exit(r0)     // Catch:{ all -> 0x0161 }
            if (r9 == 0) goto L_0x0143
            com.google.android.apps.gsa.search.core.preferences.z r15 = r14.f233435a
            java.util.concurrent.Executor r0 = r15.f233449d
            com.google.android.apps.gsa.search.core.preferences.y r2 = new com.google.android.apps.gsa.search.core.preferences.y
            r2.<init>(r15)
            r0.execute(r2)
        L_0x0143:
            if (r1 == 0) goto L_0x014a
            com.google.android.apps.gsa.search.core.preferences.z r15 = r14.f233435a
            r15.mo80102h(r1, r3)
        L_0x014a:
            if (r5 == 0) goto L_0x015c
            java.util.concurrent.CountDownLatch r15 = r5.f233442a     // Catch:{ InterruptedException -> 0x0154 }
            r15.await()     // Catch:{ InterruptedException -> 0x0154 }
            boolean r4 = r5.f233444c     // Catch:{ InterruptedException -> 0x0154 }
            goto L_0x015d
        L_0x0154:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            r15.interrupt()
            goto L_0x015d
        L_0x015c:
            r4 = 1
        L_0x015d:
            return r4
        L_0x015e:
            r15 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x015e }
            throw r15     // Catch:{ all -> 0x0161 }
        L_0x0161:
            r15 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0161 }
            goto L_0x0165
        L_0x0164:
            throw r15
        L_0x0165:
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86341u.mo80086l(boolean):boolean");
    }

    /* renamed from: m */
    public final void mo80087m(C89185d dVar) {
        Map c = C89186e.m145058c(dVar);
        synchronized (this.f233436b) {
            this.f233437c.putAll(c);
        }
    }

    public final /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        mo80085k(str, Boolean.valueOf(z));
        return this;
    }

    public final /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        mo80085k(str, Float.valueOf(f));
        return this;
    }

    public final /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        mo80085k(str, Integer.valueOf(i));
        return this;
    }

    public final /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        mo80085k(str, Long.valueOf(j));
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        mo80073h(str, str2);
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        mo80074i(str, set);
        return this;
    }

    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        mo80075j(str);
        return this;
    }
}
