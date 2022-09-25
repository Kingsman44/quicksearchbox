package com.google.android.gms.car.p10750a.p10751a;

import androidx.p060c.C0977g;
import com.google.common.base.C58852bp;
import com.google.common.base.C58881cr;
import java.util.Map;

/* renamed from: com.google.android.gms.car.a.a.az */
/* compiled from: PG */
public final class C143002az {

    /* renamed from: a */
    private final Map f388041a = new C0977g();

    /* renamed from: b */
    private final Map f388042b = new C0977g();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Object mo117942a(Class cls, C143001ay ayVar) {
        Object cast = cls.cast(this.f388041a.get(cls));
        if (cast != null) {
            return cast;
        }
        Object a = ayVar.mo117922a();
        Map map = this.f388041a;
        a.getClass();
        map.put(cls, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized Object mo117943b(Class cls, String str, C143001ay ayVar) {
        Object obj;
        Map map = (Map) this.f388042b.get(cls);
        if (map != null) {
            obj = cls.cast(map.get(str));
        } else {
            map = new C0977g();
            this.f388042b.put(cls, map);
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        Object a = ayVar.mo117922a();
        a.getClass();
        map.put(str, a);
        return a;
    }

    /* renamed from: c */
    public final synchronized Object mo117944c(Class cls, C58881cr crVar) {
        Object cast = cls.cast(this.f388041a.get(cls));
        if (cast != null) {
            return cast;
        }
        Object a = crVar.mo6453a();
        Map map = this.f388041a;
        a.getClass();
        map.put(cls, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo117945d(Class cls) {
        this.f388041a.remove(cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo117946e(Class cls, C58852bp bpVar) {
        Object cast = cls.cast(this.f388041a.remove(cls));
        if (cast != null) {
            bpVar.mo40846a(cast);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void mo117947f(Class cls) {
        this.f388042b.remove(cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized void mo117948g(Class cls, C58852bp bpVar) {
        Map map = (Map) this.f388042b.remove(cls);
        if (map != null) {
            for (Object cast : map.values()) {
                bpVar.mo40846a(cls.cast(cast));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo117949h(java.lang.Class r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List r5 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x0037 }
            java.util.Map r0 = r3.f388041a     // Catch:{ all -> 0x0037 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0037 }
            boolean r0 = r0.removeAll(r5)     // Catch:{ all -> 0x0037 }
            java.util.Map r1 = r3.f388042b     // Catch:{ all -> 0x0037 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0037 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x002d
            java.util.Collection r2 = r1.values()     // Catch:{ all -> 0x0037 }
            boolean r5 = r2.removeAll(r5)     // Catch:{ all -> 0x0037 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x002e
            java.util.Map r1 = r3.f388042b     // Catch:{ all -> 0x0037 }
            r1.remove(r4)     // Catch:{ all -> 0x0037 }
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r0 != 0) goto L_0x0035
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            monitor-exit(r3)
            return
        L_0x0035:
            monitor-exit(r3)
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.p10750a.p10751a.C143002az.mo117949h(java.lang.Class, java.lang.Object):void");
    }
}
