package com.bumptech.glide.p287f.p288a;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p291h.C5632s;

/* renamed from: com.bumptech.glide.f.a.c */
/* compiled from: PG */
public abstract class C5561c implements C5572n {

    /* renamed from: a */
    private final int f16841a;

    /* renamed from: b */
    private final int f16842b;

    /* renamed from: c */
    public C5588e f16843c;

    public C5561c(int i, int i2) {
        if (C5632s.m14622o(i, i2)) {
            this.f16841a = i;
            this.f16842b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    /* renamed from: a */
    public void mo11859a(Drawable drawable) {
    }

    /* renamed from: d */
    public final C5588e mo11990d() {
        return this.f16843c;
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        mVar.mo12006g(this.f16841a, this.f16842b);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
    }

    /* renamed from: h */
    public final void mo11993h(C5588e eVar) {
        this.f16843c = eVar;
    }

    /* renamed from: p */
    public final void mo11881p() {
    }

    /* renamed from: q */
    public final void mo11882q() {
    }

    /* renamed from: r */
    public final void mo11883r() {
    }
}
