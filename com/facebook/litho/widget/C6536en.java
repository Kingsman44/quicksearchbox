package com.facebook.litho.widget;

import com.facebook.litho.p334j.C6399b;
import com.facebook.litho.p334j.C6400c;

/* renamed from: com.facebook.litho.widget.en */
/* compiled from: PG */
public final class C6536en extends C6441b {

    /* renamed from: a */
    private final C6399b f19460a;

    /* renamed from: b */
    private final C6400c f19461b;

    /* renamed from: c */
    private final boolean f19462c;

    /* renamed from: d */
    private int f19463d;

    public C6536en(C6535em emVar) {
        super(emVar);
        this.f19460a = emVar.f19456b;
        this.f19461b = emVar.f19457c;
        boolean z = emVar.f19458d;
        this.f19462c = z;
        if (z) {
            this.f19463d = emVar.f19459e;
        }
    }

    /* renamed from: b */
    public final int mo13520b() {
        return this.f19463d;
    }

    /* renamed from: e */
    public final C6399b mo13523e() {
        return this.f19460a;
    }

    /* renamed from: f */
    public final C6400c mo13524f() {
        return this.f19461b;
    }

    /* renamed from: j */
    public final void mo13528j(int i) {
        if (!this.f19462c) {
            this.f19463d = i;
            return;
        }
        throw new UnsupportedOperationException("Cannot override custom view type.");
    }

    /* renamed from: k */
    public final boolean mo13529k() {
        return this.f19462c;
    }

    /* renamed from: o */
    public final boolean mo13533o() {
        return true;
    }

    /* renamed from: s */
    public final String mo13577s() {
        int i = this.f19463d;
        return "View (viewType=" + i + ")";
    }
}
