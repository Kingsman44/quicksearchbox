package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10290f;

import android.widget.ImageView;
import androidx.p198v.p199a.p200a.C4244c;
import androidx.p198v.p199a.p200a.C4250i;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.f.b */
/* compiled from: PG */
public final class C135780b {

    /* renamed from: a */
    public final C4250i f369850a;

    /* renamed from: b */
    public final ImageView f369851b;

    /* renamed from: c */
    public final C4244c f369852c = new C135779a(this);

    /* renamed from: d */
    public boolean f369853d = false;

    public C135780b(ImageView imageView, C4250i iVar) {
        this.f369851b = imageView;
        this.f369850a = iVar;
        imageView.setImageDrawable(iVar);
    }

    /* renamed from: a */
    public final void mo112556a() {
        if (this.f369853d) {
            this.f369853d = false;
            this.f369851b.setVisibility(8);
            this.f369850a.mo8963c(this.f369852c);
            this.f369850a.stop();
        }
    }
}
