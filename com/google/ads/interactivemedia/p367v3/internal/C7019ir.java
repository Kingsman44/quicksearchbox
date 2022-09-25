package com.google.ads.interactivemedia.p367v3.internal;

import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ir */
/* compiled from: PG */
public class C7019ir {

    /* renamed from: a */
    private int f22495a;

    /* renamed from: a */
    public void mo16030a() {
        this.f22495a = 0;
    }

    /* renamed from: b */
    public final boolean mo16031b() {
        return mo16037h(LinearLayoutManager.INVALID_OFFSET);
    }

    /* renamed from: c */
    public final boolean mo16032c() {
        return mo16037h(4);
    }

    /* renamed from: d */
    public final boolean mo16033d() {
        return mo16037h(1);
    }

    /* renamed from: e */
    public final boolean mo16034e() {
        return mo16037h(268435456);
    }

    /* renamed from: f */
    public final void mo16035f(int i) {
        this.f22495a = i;
    }

    /* renamed from: g */
    public final void mo16036g(int i) {
        this.f22495a = i | this.f22495a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo16037h(int i) {
        return (this.f22495a & i) == i;
    }
}
