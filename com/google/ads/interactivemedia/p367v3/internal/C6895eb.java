package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eb */
/* compiled from: PG */
final class C6895eb extends C6810ay {

    /* renamed from: b */
    private final int f21960b;

    /* renamed from: c */
    private final int f21961c;

    /* renamed from: d */
    private final int[] f21962d;

    /* renamed from: e */
    private final int[] f21963e;

    /* renamed from: f */
    private final C6912es[] f21964f;

    /* renamed from: g */
    private final Object[] f21965g;

    /* renamed from: h */
    private final HashMap f21966h = new HashMap();

    public C6895eb(Collection collection, C7357ve veVar) {
        super(veVar);
        int size = collection.size();
        this.f21962d = new int[size];
        this.f21963e = new int[size];
        this.f21964f = new C6912es[size];
        this.f21965g = new Object[size];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C6879dm dmVar = (C6879dm) it.next();
            this.f21964f[i3] = dmVar.mo15551b();
            this.f21963e[i3] = i;
            this.f21962d[i3] = i2;
            i += this.f21964f[i3].mo15780s();
            i2 += this.f21964f[i3].mo15781t();
            this.f21965g[i3] = dmVar.mo15550a();
            this.f21966h.put(this.f21965g[i3], Integer.valueOf(i3));
            i3++;
        }
        this.f21960b = i;
        this.f21961c = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo15483k(int i) {
        return aeu.m18522am(this.f21962d, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo15484l(int i) {
        return aeu.m18522am(this.f21963e, i + 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo15485m(Object obj) {
        Integer num = (Integer) this.f21966h.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C6912es mo15486n(int i) {
        return this.f21964f[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final int mo15487o(int i) {
        return this.f21962d[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo15488p(int i) {
        return this.f21963e[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15489q(int i) {
        return this.f21965g[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final List mo15779r() {
        return Arrays.asList(this.f21964f);
    }

    /* renamed from: s */
    public final int mo15780s() {
        return this.f21960b;
    }

    /* renamed from: t */
    public final int mo15781t() {
        return this.f21961c;
    }
}
