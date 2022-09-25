package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80786fg;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.material.chip.Chip;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.b */
/* compiled from: PG */
final class C81696b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C80786fg f223435a;

    /* renamed from: b */
    final /* synthetic */ Chip f223436b;

    /* renamed from: c */
    final /* synthetic */ C81697c f223437c;

    public C81696b(C81697c cVar, C80786fg fgVar, Chip chip) {
        this.f223437c = cVar;
        this.f223435a = fgVar;
        this.f223436b = chip;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C81697c.f223438a.mo56226d()).mo56382g(th)).mo56372aa(6189)).mo56386p("Failed to load chip icon.");
        this.f223436b.mo47694q((Drawable) null);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (this.f223435a.mo74401b() == 3) {
            drawable.setTintList(this.f223437c.f223439b);
        }
        this.f223436b.mo47694q(drawable);
    }
}
