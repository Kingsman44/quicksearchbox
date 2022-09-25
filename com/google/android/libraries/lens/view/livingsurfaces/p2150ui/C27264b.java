package com.google.android.libraries.lens.view.livingsurfaces.p2150ui;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.p287f.C5592i;
import com.bumptech.glide.p291h.C5622i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.ui.b */
/* compiled from: PG */
public final class C27264b {

    /* renamed from: a */
    public static final C59071e f74573a = C59071e.m91332i("com.google.android.libraries.lens.view.livingsurfaces.ui.b");

    /* renamed from: b */
    public final Drawable f74574b;

    /* renamed from: c */
    private final C47449e f74575c;

    /* renamed from: d */
    private final PlanarGleamAttributionView f74576d;

    public C27264b(C47449e eVar, PlanarGleamAttributionView planarGleamAttributionView) {
        this.f74575c = eVar;
        this.f74576d = planarGleamAttributionView;
        this.f74574b = planarGleamAttributionView.getContext().getDrawable(R.drawable.ic_no_logo);
    }

    /* renamed from: a */
    public final void mo32792a(WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        if (windowInsets != null && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f74576d.getLayoutParams();
            layoutParams.topMargin = displayCutout.getSafeInsetTop() + layoutParams.topMargin;
            this.f74576d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public final void mo32793b() {
        this.f74576d.animate().alpha(1.0f).setDuration(250);
    }

    /* renamed from: c */
    public final void mo32794c(String str, String str2) {
        this.f74576d.setText(str);
        this.f74576d.setAlpha(0.0f);
        if (C58837ba.m90859h(str2)) {
            this.f74576d.mo28945lq(this.f74574b);
            mo32793b();
            return;
        }
        C6007z zVar = (C6007z) ((C6007z) this.f74575c.mo51286a().mo11870h(Uri.parse(str2)).mo11961N((int) this.f74576d.getResources().getDimension(R.dimen.planar_gleam_attribution_icon_size))).mo11986w();
        zVar.mo12455s(new C27263a(this, this.f74576d, str2), (C5592i) null, zVar, C5622i.f16959a);
    }
}
