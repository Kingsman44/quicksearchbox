package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abr */
/* compiled from: PG */
public abstract class abr implements abx {

    /* renamed from: a */
    private final boolean f20211a;

    /* renamed from: b */
    private final ArrayList f20212b = new ArrayList(1);

    /* renamed from: c */
    private int f20213c;

    /* renamed from: d */
    private acb f20214d;

    protected abr(boolean z) {
        this.f20211a = z;
    }

    /* renamed from: b */
    public final void mo14402b(adh adh) {
        ary.m19467t(adh);
        if (!this.f20212b.contains(adh)) {
            this.f20212b.add(adh);
            this.f20213c++;
        }
    }

    /* renamed from: e */
    public Map mo14403e() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo14404g(acb acb) {
        for (int i = 0; i < this.f20213c; i++) {
            ((adh) this.f20212b.get(i)).mo14448i();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo14405h(acb acb) {
        this.f20214d = acb;
        for (int i = 0; i < this.f20213c; i++) {
            ((adh) this.f20212b.get(i)).mo14449j(acb, this.f20211a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14406i(int i) {
        acb acb = this.f20214d;
        int i2 = aeu.f20466a;
        for (int i3 = 0; i3 < this.f20213c; i3++) {
            ((adh) this.f20212b.get(i3)).mo14446g(acb, this.f20211a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo14407j() {
        acb acb = this.f20214d;
        int i = aeu.f20466a;
        for (int i2 = 0; i2 < this.f20213c; i2++) {
            ((adh) this.f20212b.get(i2)).mo14447h(acb, this.f20211a);
        }
        this.f20214d = null;
    }
}
