package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.core.C42354o;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60908dv;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69299g;

/* renamed from: com.google.android.libraries.social.populous.v */
/* compiled from: PG */
public final class C42708v {

    /* renamed from: a */
    private static final AtomicReference f111930a = new AtomicReference((Object) null);

    /* renamed from: b */
    private final Map f111931b = new HashMap();

    /* renamed from: c */
    private final Map f111932c = new HashMap();

    /* renamed from: d */
    private ExecutorService f111933d;

    static {
        TimeUnit.MINUTES.toMillis(5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.libraries.social.populous.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.android.libraries.social.populous.C42708v m75431a() {
        /*
            java.lang.Class<com.google.android.libraries.social.populous.v> r0 = com.google.android.libraries.social.populous.C42708v.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = f111930a     // Catch:{ all -> 0x002f }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x002f }
            com.google.android.libraries.social.populous.v r2 = (com.google.android.libraries.social.populous.C42708v) r2     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x002a
            com.google.android.libraries.social.populous.v r2 = new com.google.android.libraries.social.populous.v     // Catch:{ all -> 0x002f }
            r2.<init>()     // Catch:{ all -> 0x002f }
        L_0x0012:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x001b
            monitor-exit(r0)
            return r2
        L_0x001b:
            java.lang.Object r3 = r1.get()     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicReference r1 = f111930a     // Catch:{ all -> 0x002f }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002f }
            r2 = r1
            com.google.android.libraries.social.populous.v r2 = (com.google.android.libraries.social.populous.C42708v) r2     // Catch:{ all -> 0x002f }
        L_0x002a:
            r2.getClass()
            monitor-exit(r0)
            return r2
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0033
        L_0x0032:
            throw r1
        L_0x0033:
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.C42708v.m75431a():com.google.android.libraries.social.populous.v");
    }

    /* renamed from: d */
    private final synchronized void m75432d(String str) {
        C60870cx cxVar = (C60870cx) this.f111932c.get(str);
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f111932c.remove(str);
        }
    }

    /* renamed from: e */
    private final synchronized void m75433e(String str) {
        m75432d(str);
    }

    /* renamed from: b */
    public final synchronized C58881cr mo45808b(String str, C58881cr crVar) {
        C58881cr crVar2;
        crVar2 = (C58881cr) this.f111931b.get(str);
        if (crVar2 == null) {
            crVar2 = C58886cw.m90973a(crVar);
            this.f111931b.put(str, crVar2);
        } else {
            m75433e(str);
        }
        return crVar2;
    }

    /* renamed from: c */
    public final synchronized ExecutorService mo45809c() {
        ExecutorService executorService = this.f111933d;
        if (executorService != null) {
            return executorService;
        }
        long a = C69299g.f185427a.mo6453a().mo60966a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("AutocompleteBackground-%d");
        C42354o a2 = C42354o.m74607a(C60757n.m92748i(a), timeUnit, C60908dv.m93015a(dvVar));
        this.f111933d = a2;
        return a2;
    }
}
