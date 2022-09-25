package androidx.p060c;

import androidx.p060c.p061a.C0970b;
import androidx.p060c.p061a.C0971c;
import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.c.m */
/* compiled from: PG */
public class C0983m {

    /* renamed from: a */
    public final C0970b f3111a;

    /* renamed from: b */
    public int f3112b;

    /* renamed from: c */
    private final int f3113c;

    /* renamed from: d */
    private final C0971c f3114d;

    /* renamed from: e */
    private int f3115e;

    /* renamed from: f */
    private int f3116f;

    /* renamed from: g */
    private int f3117g;

    /* renamed from: h */
    private int f3118h;

    /* renamed from: i */
    private int f3119i;

    /* renamed from: a */
    private final int m2954a(Object obj, Object obj2) {
        int b = mo3688b(obj, obj2);
        if (b >= 0) {
            return b;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo3688b(Object obj, Object obj2) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(obj2, "value");
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Object mo3689c(Object obj) {
        C69664n.m101061g(obj, "key");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r0 = mo3689c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r1 = r5.f3111a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r5.f3116f++;
        r2 = r5.f3114d.mo3599a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r5.f3114d.mo3599a(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r5.f3112b += m2954a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r2 == null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        mo3693g(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        mo3694h(r5.f3113c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r2;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3690d(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r0)
            androidx.c.a.b r0 = r5.f3111a
            monitor-enter(r0)
            androidx.c.a.c r1 = r5.f3114d     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r2)     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap r1 = r1.f3087a     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x001f
            int r6 = r5.f3118h     // Catch:{ all -> 0x0060 }
            int r6 = r6 + 1
            r5.f3118h = r6     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            return r1
        L_0x001f:
            int r1 = r5.f3119i     // Catch:{ all -> 0x0060 }
            int r1 = r1 + 1
            r5.f3119i = r1     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            java.lang.Object r0 = r5.mo3689c(r6)
            if (r0 != 0) goto L_0x002e
            r6 = 0
            return r6
        L_0x002e:
            androidx.c.a.b r1 = r5.f3111a
            monitor-enter(r1)
            int r2 = r5.f3116f     // Catch:{ all -> 0x005d }
            int r2 = r2 + 1
            r5.f3116f = r2     // Catch:{ all -> 0x005d }
            androidx.c.a.c r2 = r5.f3114d     // Catch:{ all -> 0x005d }
            java.lang.Object r2 = r2.mo3599a(r6, r0)     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x0045
            androidx.c.a.c r3 = r5.f3114d     // Catch:{ all -> 0x005d }
            r3.mo3599a(r6, r2)     // Catch:{ all -> 0x005d }
            goto L_0x004e
        L_0x0045:
            int r3 = r5.f3112b     // Catch:{ all -> 0x005d }
            int r4 = r5.m2954a(r6, r0)     // Catch:{ all -> 0x005d }
            int r3 = r3 + r4
            r5.f3112b = r3     // Catch:{ all -> 0x005d }
        L_0x004e:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0057
            r1 = 0
            r5.mo3693g(r1, r6, r0, r2)
            r0 = r2
            goto L_0x005c
        L_0x0057:
            int r6 = r5.f3113c
            r5.mo3694h(r6)
        L_0x005c:
            return r0
        L_0x005d:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060c.C0983m.mo3690d(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final Object mo3691e(Object obj, Object obj2) {
        Object a;
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(obj2, "value");
        synchronized (this.f3111a) {
            this.f3115e++;
            this.f3112b += m2954a(obj, obj2);
            a = this.f3114d.mo3599a(obj, obj2);
            if (a != null) {
                this.f3112b -= m2954a(obj, a);
            }
        }
        if (a != null) {
            mo3693g(false, obj, a, obj2);
        }
        mo3694h(this.f3113c);
        return a;
    }

    /* renamed from: f */
    public final Map mo3692f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f3111a) {
            for (Map.Entry entry : this.f3114d.mo3601c()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo3693g(boolean z, Object obj, Object obj2, Object obj3) {
        C69664n.m101061g(obj, "key");
        C69664n.m101061g(obj2, "oldValue");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3694h(int r6) {
        /*
            r5 = this;
        L_0x0000:
            androidx.c.a.b r0 = r5.f3111a
            monitor-enter(r0)
            int r1 = r5.f3112b     // Catch:{ all -> 0x0060 }
            if (r1 < 0) goto L_0x0058
            androidx.c.a.c r1 = r5.f3114d     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap r1 = r1.f3087a     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0015
            int r1 = r5.f3112b     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0058
        L_0x0015:
            int r1 = r5.f3112b     // Catch:{ all -> 0x0060 }
            if (r1 <= r6) goto L_0x0056
            androidx.c.a.c r1 = r5.f3114d     // Catch:{ all -> 0x0060 }
            java.util.LinkedHashMap r1 = r1.f3087a     // Catch:{ all -> 0x0060 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x0024
            goto L_0x0056
        L_0x0024:
            androidx.c.a.c r1 = r5.f3114d     // Catch:{ all -> 0x0060 }
            java.util.Set r1 = r1.mo3601c()     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = p5462h.p5463a.C69540x.m100820B(r1)     // Catch:{ all -> 0x0060 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x0034
            monitor-exit(r0)
            return
        L_0x0034:
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0060 }
            androidx.c.a.c r3 = r5.f3114d     // Catch:{ all -> 0x0060 }
            r3.mo3600b(r2)     // Catch:{ all -> 0x0060 }
            int r3 = r5.f3112b     // Catch:{ all -> 0x0060 }
            int r4 = r5.m2954a(r2, r1)     // Catch:{ all -> 0x0060 }
            int r3 = r3 - r4
            r5.f3112b = r3     // Catch:{ all -> 0x0060 }
            int r3 = r5.f3117g     // Catch:{ all -> 0x0060 }
            r4 = 1
            int r3 = r3 + r4
            r5.f3117g = r3     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            r0 = 0
            r5.mo3693g(r4, r2, r1, r0)
            goto L_0x0000
        L_0x0056:
            monitor-exit(r0)
            return
        L_0x0058:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0060 }
            r1.<init>(r6)     // Catch:{ all -> 0x0060 }
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r6 = move-exception
            monitor-exit(r0)
            goto L_0x0064
        L_0x0063:
            throw r6
        L_0x0064:
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p060c.C0983m.mo3694h(int):void");
    }

    /* renamed from: i */
    public final void mo3695i(Object obj) {
        Object b;
        C69664n.m101061g(obj, "key");
        synchronized (this.f3111a) {
            b = this.f3114d.mo3600b(obj);
            if (b != null) {
                this.f3112b -= m2954a(obj, b);
            }
        }
        if (b != null) {
            mo3693g(false, obj, b, (Object) null);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f3111a) {
            int i = this.f3118h;
            int i2 = this.f3119i + i;
            str = "LruCache[maxSize=" + this.f3113c + ",hits=" + this.f3118h + ",misses=" + this.f3119i + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public C0983m(int i) {
        this.f3113c = i;
        if (i > 0) {
            this.f3114d = new C0971c((byte[]) null);
            this.f3111a = new C0970b();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
