package com.google.android.libraries.lens.view.gallery.p2109b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.gallery.b.g */
/* compiled from: PG */
final class C26327g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ FrameLayout f71562a;

    public C26327g(FrameLayout frameLayout) {
        this.f71562a = frameLayout;
    }

    public final void onAnimationStart(Animator animator) {
        C26329i.m48598a(this.f71562a);
        ((ImageView) this.f71562a.findViewById(R.id.lens_gallery_picker_button_m2_thumbnail)).setImageResource(R.drawable.lens_gallery_picker_button_m2_thumbnail);
    }
}
