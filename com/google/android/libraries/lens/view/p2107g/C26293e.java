package com.google.android.libraries.lens.view.p2107g;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.C5516b;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5593j;
import com.bumptech.glide.p287f.p289b.C5580d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25496ab;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.apps.tiktok.media.C47449e;

/* renamed from: com.google.android.libraries.lens.view.g.e */
/* compiled from: PG */
public final class C26293e implements C25496ab {

    /* renamed from: a */
    private final C26290b f71447a;

    /* renamed from: b */
    private final C47449e f71448b;

    /* renamed from: c */
    private int f71449c = 0;

    public C26293e(C26290b bVar, C47449e eVar) {
        this.f71447a = bVar;
        this.f71448b = eVar;
    }

    /* renamed from: e */
    public final void mo31496e(ImageView imageView, Bitmap bitmap) {
        if (this.f71449c != bitmap.hashCode()) {
            C6007z b = this.f71448b.mo51286a().mo11868f(bitmap).mo11982o(C5593j.m14517a(new C26292d()));
            C5516b bVar = new C5516b();
            bVar.mo11893b(C5580d.f16875b);
            b.mo12452n(bVar).mo12454r(imageView);
            imageView.setVisibility(0);
            this.f71449c = bitmap.hashCode();
        }
    }

    /* renamed from: kW */
    public final /* synthetic */ void mo30520kW(C25533p pVar) {
    }

    /* renamed from: kX */
    public final /* synthetic */ void mo30521kX(boolean z) {
    }

    /* renamed from: kY */
    public final void mo30522kY(C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        ImageView imageView = (ImageView) this.f71447a.requireView().findViewById(R.id.blurry_background);
        if (!acVar2.mo30525b() || pVar == null) {
            imageView.setVisibility(8);
            this.f71448b.mo51286a().mo11876n(imageView);
            this.f71449c = 0;
            return;
        }
        C25523f fVar = (C25523f) pVar;
        if (fVar.f69504b.mo56113h()) {
            mo31496e(imageView, (Bitmap) fVar.f69504b.mo56107c());
        } else {
            pVar.mo30588g(new C26291c(this, imageView));
        }
    }

    /* renamed from: kZ */
    public final /* synthetic */ void mo30523kZ() {
    }
}
