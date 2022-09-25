package com.google.android.libraries.componentview.components.base.p1688b;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.componentview.components.base.b.j */
/* compiled from: PG */
final class C20040j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Bitmap f56178a;

    /* renamed from: b */
    final /* synthetic */ C20041k f56179b;

    public C20040j(C20041k kVar, Bitmap bitmap) {
        this.f56179b = kVar;
        this.f56178a = bitmap;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C20601ca caVar = this.f56179b.f56181b;
        C20614e eVar = new C20614e();
        eVar.mo25535e(C19742a.IMAGE_FETCH_ERROR);
        eVar.f57821a = th;
        caVar.mo25487b(eVar.mo25531a());
        C20041k kVar = this.f56179b;
        C20040j.super.setImageDrawable(new BitmapDrawable(kVar.f56180a.getResources(), this.f56178a));
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C20040j.super.setImageDrawable((BitmapDrawable) obj);
    }
}
