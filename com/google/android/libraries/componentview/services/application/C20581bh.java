package com.google.android.libraries.componentview.services.application;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.p293a.C5673ap;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1675a.p1677b.C19744c;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.libraries.componentview.services.application.bh */
/* compiled from: PG */
public final class C20581bh implements C5592i {

    /* renamed from: a */
    private final String f57766a;

    /* renamed from: b */
    private final SettableFuture f57767b;

    /* renamed from: c */
    private final C20601ca f57768c;

    public C20581bh(String str, SettableFuture settableFuture, C20601ca caVar) {
        this.f57766a = str;
        this.f57767b = settableFuture;
        this.f57768c = caVar;
    }

    /* renamed from: a */
    public final boolean mo11905a(C5673ap apVar, Object obj, C5572n nVar, boolean z) {
        if (apVar != null) {
            String str = this.f57766a;
            C20520h.m38497b(6, "GlideImageLoader", apVar, str != null ? "Glide load failed for ".concat(str) : "Glide load failed", C19742a.IMAGE_LOADING_ERROR, this.f57768c, null);
            apVar.mo12169b("GlideImageLoader");
        }
        this.f57767b.mo57357o(new RuntimeException("Glide load failed "));
        return true;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo11906b(Object obj, Object obj2, C5572n nVar, C5637a aVar, boolean z) {
        Drawable drawable = (Drawable) obj;
        this.f57767b.mo57356n(new C19744c());
        return false;
    }
}
