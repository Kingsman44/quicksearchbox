package com.facebook.litho.widget;

import com.facebook.litho.p334j.C6399b;
import com.facebook.litho.p334j.C6400c;

/* renamed from: com.facebook.litho.widget.em */
/* compiled from: PG */
public final class C6535em extends C6414a {

    /* renamed from: b */
    public C6399b f19456b;

    /* renamed from: c */
    public C6400c f19457c;

    /* renamed from: d */
    public boolean f19458d = false;

    /* renamed from: e */
    public int f19459e = 0;

    /* renamed from: e */
    public final C6536en mo13617e() {
        if (this.f19457c != null && this.f19456b != null) {
            return new C6536en(this);
        }
        throw new IllegalStateException("Both viewCreator and viewBinder must be provided.");
    }

    /* renamed from: f */
    public final void mo13618f(int i) {
        this.f19458d = true;
        this.f19459e = i;
    }
}
