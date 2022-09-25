package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.C44520p;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.aq */
/* compiled from: PG */
final class C9904aq implements C44520p {

    /* renamed from: a */
    final /* synthetic */ ImageView f33964a;

    /* renamed from: b */
    final /* synthetic */ TextView f33965b;

    /* renamed from: c */
    final /* synthetic */ TextView f33966c;

    public C9904aq(ImageView imageView, TextView textView, TextView textView2) {
        this.f33964a = imageView;
        this.f33965b = textView;
        this.f33966c = textView2;
    }

    /* renamed from: a */
    public final void mo18107a(AppBarLayout appBarLayout, int i) {
        if (appBarLayout.mo47400j() + i == 0) {
            this.f33964a.setVisibility(0);
            this.f33965b.setVisibility(0);
            this.f33966c.setVisibility(0);
            return;
        }
        this.f33964a.setVisibility(8);
        this.f33965b.setVisibility(8);
        this.f33966c.setVisibility(8);
    }
}
