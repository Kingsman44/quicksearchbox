package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.graphics.drawable.Drawable;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.android.libraries.gsa.p1876k.C22872h;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cv */
/* compiled from: PG */
final class C93598cv extends C90953s {

    /* renamed from: a */
    final /* synthetic */ boolean f261311a;

    /* renamed from: b */
    final /* synthetic */ boolean f261312b;

    /* renamed from: c */
    final /* synthetic */ boolean f261313c;

    /* renamed from: d */
    final /* synthetic */ ModularActionCardUnlabeledFooter f261314d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93598cv(ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter, boolean z, boolean z2, boolean z3) {
        super("MACUFooter");
        this.f261314d = modularActionCardUnlabeledFooter;
        this.f261311a = z;
        this.f261312b = z2;
        this.f261313c = z3;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo76757c(Object obj) {
        C22872h.m42743c(C0826b.class);
        this.f261314d.f261082a.setImageDrawable((Drawable) obj);
        TintableImageButton tintableImageButton = this.f261314d.f261082a;
        boolean z = false;
        if (this.f261311a && this.f261312b) {
            z = true;
        }
        tintableImageButton.setEnabled(z);
        ModularActionCardUnlabeledFooter modularActionCardUnlabeledFooter = this.f261314d;
        modularActionCardUnlabeledFooter.f261082a.mo87918a(modularActionCardUnlabeledFooter.mo87901f(this.f261313c, this.f261311a));
    }
}
