package com.google.ads.interactivemedia.p367v3.internal;

import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.arm */
/* compiled from: PG */
final class arm extends arn {

    /* renamed from: a */
    final transient int f21453a;

    /* renamed from: b */
    final transient int f21454b;

    /* renamed from: c */
    final /* synthetic */ arn f21455c;

    public arm(arn arn, int i, int i2) {
        this.f21455c = arn;
        this.f21453a = i;
        this.f21454b = i2;
    }

    /* renamed from: b */
    public final Object[] mo15272b() {
        return this.f21455c.mo15272b();
    }

    /* renamed from: c */
    public final int mo15273c() {
        return this.f21455c.mo15273c() + this.f21453a;
    }

    /* renamed from: d */
    public final int mo15276d() {
        return this.f21455c.mo15273c() + this.f21453a + this.f21454b;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return true;
    }

    public final Object get(int i) {
        aqd.m19281i(i, this.f21454b);
        return this.f21455c.get(i + this.f21453a);
    }

    /* renamed from: h */
    public final arn mo15291h(int i, int i2) {
        aqd.m19280h(i, i2, this.f21454b);
        arn arn = this.f21455c;
        int i3 = this.f21453a;
        return arn.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f21454b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
