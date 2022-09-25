package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.td */
/* compiled from: PG */
final class C7302td extends C6810ay {

    /* renamed from: b */
    private final int f23796b;

    /* renamed from: c */
    private final int f23797c;

    /* renamed from: d */
    private final int[] f23798d;

    /* renamed from: e */
    private final int[] f23799e;

    /* renamed from: f */
    private final C6912es[] f23800f;

    /* renamed from: g */
    private final Object[] f23801g;

    /* renamed from: h */
    private final HashMap f23802h = new HashMap();

    public C7302td(Collection collection, C7357ve veVar) {
        super(veVar);
        int size = collection.size();
        this.f23798d = new int[size];
        this.f23799e = new int[size];
        this.f23800f = new C6912es[size];
        this.f23801g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C7305tg tgVar = (C7305tg) it.next();
            this.f23800f[i3] = tgVar.f23803a.mo16539C();
            this.f23799e[i3] = i;
            this.f23798d[i3] = i2;
            i += this.f23800f[i3].mo15780s();
            i2 += this.f23800f[i3].mo15781t();
            Object[] objArr = this.f23801g;
            Object obj = tgVar.f23804b;
            objArr[i3] = obj;
            this.f23802h.put(obj, Integer.valueOf(i3));
            i3++;
        }
        this.f23796b = i;
        this.f23797c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo15483k(int i) {
        return aeu.m18522am(this.f23798d, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo15484l(int i) {
        return aeu.m18522am(this.f23799e, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo15485m(Object obj) {
        Integer num = (Integer) this.f23802h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C6912es mo15486n(int i) {
        return this.f23800f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo15487o(int i) {
        return this.f23798d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo15488p(int i) {
        return this.f23799e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15489q(int i) {
        return this.f23801g[i];
    }

    /* renamed from: s */
    public final int mo15780s() {
        return this.f23796b;
    }

    /* renamed from: t */
    public final int mo15781t() {
        return this.f23797c;
    }
}
