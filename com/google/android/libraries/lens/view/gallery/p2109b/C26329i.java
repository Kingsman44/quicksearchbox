package com.google.android.libraries.lens.view.gallery.p2109b;

import android.animation.ObjectAnimator;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gallery.data.C26393l;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.gallery.b.i */
/* compiled from: PG */
public final class C26329i {

    /* renamed from: a */
    public final C26322b f71564a;

    /* renamed from: b */
    public final C26393l f71565b;

    /* renamed from: c */
    public final C47449e f71566c;

    /* renamed from: d */
    public final C28443m f71567d;

    /* renamed from: e */
    public final C25504aj f71568e;

    /* renamed from: f */
    public final C28306ab f71569f;

    /* renamed from: g */
    public final C28310af f71570g;

    /* renamed from: h */
    public final C25752a f71571h;

    /* renamed from: i */
    public final C47770dh f71572i;

    /* renamed from: j */
    public final C25225bd f71573j;

    /* renamed from: k */
    public ObjectAnimator f71574k;

    /* renamed from: l */
    public boolean f71575l;

    /* renamed from: com.google.android.libraries.lens.view.gallery.b.i$a */
    /* compiled from: PG */
    public final class C26330a implements C47388b {
    }

    public C26329i(C26322b bVar, C26393l lVar, C28443m mVar, C47449e eVar, C25504aj ajVar, C28306ab abVar, C28310af afVar, C25752a aVar, C47770dh dhVar, C25225bd bdVar) {
        this.f71564a = bVar;
        this.f71565b = lVar;
        this.f71567d = mVar;
        this.f71566c = eVar;
        this.f71568e = ajVar;
        this.f71569f = abVar;
        this.f71570g = afVar;
        this.f71571h = aVar;
        this.f71572i = dhVar;
        this.f71573j = bdVar;
    }

    /* renamed from: a */
    public static void m48598a(FrameLayout frameLayout) {
        frameLayout.removeAllViews();
        LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.lens_gallery_picker_rounded_rect_button, frameLayout);
    }
}
