package com.google.android.libraries.web.contrib.fullscreen.internal;

import android.view.View;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43909d;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.web.contrib.fullscreen.internal.b */
/* compiled from: PG */
public final class C43560b implements C44107h, C43949z {

    /* renamed from: a */
    public C43558a f113736a;

    /* renamed from: b */
    public Supplier f113737b;

    /* renamed from: c */
    public final int f113738c = 1;

    /* renamed from: d */
    private Runnable f113739d;

    public C43560b(C43948y yVar) {
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final void mo46529b(C43904a aVar) {
        if (mo46623g()) {
            mo46622f(true);
        }
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        C43909d.m77519a(aVar).mo46923q(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }

    /* renamed from: e */
    public final void mo46621e(Supplier supplier, Runnable runnable) {
        if (mo46623g()) {
            mo46622f(true);
        }
        this.f113739d = runnable;
        this.f113737b = supplier;
        C43558a aVar = this.f113736a;
        if (aVar != null) {
            aVar.mo46620h((View) supplier.get());
        }
    }

    /* renamed from: f */
    public final void mo46622f(boolean z) {
        Runnable runnable;
        if (mo46623g()) {
            if (z && (runnable = this.f113739d) != null) {
                runnable.run();
            }
            this.f113739d = null;
            this.f113737b = null;
            C43558a aVar = this.f113736a;
            if (aVar != null) {
                aVar.mo46619g();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo46623g() {
        return this.f113739d != null;
    }
}
