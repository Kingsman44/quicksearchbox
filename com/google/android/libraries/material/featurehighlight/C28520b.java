package com.google.android.libraries.material.featurehighlight;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.FragmentManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.material.featurehighlight.b */
/* compiled from: PG */
public final class C28520b {

    /* renamed from: a */
    private final ViewFinder f77477a;

    /* renamed from: b */
    private final CharSequence f77478b;

    /* renamed from: c */
    private final int f77479c;

    /* renamed from: d */
    private final ColorStateList f77480d;

    /* renamed from: e */
    private final int f77481e;

    /* renamed from: f */
    private final CharSequence f77482f;

    /* renamed from: g */
    private final int f77483g;

    /* renamed from: h */
    private final ColorStateList f77484h;

    /* renamed from: i */
    private final int f77485i;

    /* renamed from: j */
    private final CharSequence f77486j;

    /* renamed from: k */
    private final int f77487k;

    /* renamed from: l */
    private final ColorStateList f77488l;

    /* renamed from: m */
    private final ColorStateList f77489m;

    /* renamed from: n */
    private final int f77490n;

    /* renamed from: o */
    private final int f77491o;

    /* renamed from: p */
    private final int f77492p;

    /* renamed from: q */
    private final float f77493q;

    /* renamed from: r */
    private final String f77494r;

    /* renamed from: s */
    private final int f77495s;

    /* renamed from: t */
    private final int f77496t;

    /* renamed from: u */
    private final long f77497u;

    /* renamed from: v */
    private final boolean f77498v;

    /* renamed from: w */
    private final CharSequence f77499w;

    /* renamed from: x */
    private final C28518ai f77500x;

    /* renamed from: y */
    private final C28531m f77501y;

    public C28520b(ViewFinder viewFinder, CharSequence charSequence, int i, ColorStateList colorStateList, int i2, CharSequence charSequence2, int i3, ColorStateList colorStateList2, int i4, CharSequence charSequence3, int i5, ColorStateList colorStateList3, ColorStateList colorStateList4, int i6, int i7, int i8, float f, String str, int i9, int i10, long j, boolean z, CharSequence charSequence4, C28518ai aiVar, C28531m mVar) {
        this.f77477a = viewFinder;
        this.f77478b = charSequence;
        this.f77479c = i;
        this.f77480d = colorStateList;
        this.f77481e = i2;
        this.f77482f = charSequence2;
        this.f77483g = i3;
        this.f77484h = colorStateList2;
        this.f77485i = i4;
        this.f77486j = charSequence3;
        this.f77487k = i5;
        this.f77488l = colorStateList3;
        this.f77489m = colorStateList4;
        this.f77490n = i6;
        this.f77491o = i7;
        this.f77492p = i8;
        this.f77493q = f;
        this.f77494r = str;
        this.f77495s = i9;
        this.f77496t = i10;
        this.f77497u = j;
        this.f77498v = z;
        this.f77499w = charSequence4;
        this.f77500x = aiVar;
        this.f77501y = mVar;
    }

    /* renamed from: a */
    public final void mo34065a(C0167am amVar) {
        amVar.getClass();
        if (!amVar.isFinishing()) {
            ViewFinder viewFinder = this.f77477a;
            CharSequence charSequence = this.f77478b;
            int i = this.f77479c;
            ColorStateList colorStateList = this.f77480d;
            int i2 = this.f77481e;
            CharSequence charSequence2 = this.f77482f;
            int i3 = this.f77483g;
            ColorStateList colorStateList2 = this.f77484h;
            int i4 = this.f77485i;
            CharSequence charSequence3 = this.f77486j;
            int i5 = this.f77487k;
            ColorStateList colorStateList3 = this.f77488l;
            ColorStateList colorStateList4 = this.f77489m;
            int i6 = this.f77490n;
            int i7 = this.f77491o;
            int i8 = this.f77492p;
            float f = this.f77493q;
            String str = this.f77494r;
            int i9 = this.f77495s;
            int i10 = i6;
            int i11 = this.f77496t;
            long j = this.f77497u;
            boolean z = this.f77498v;
            CharSequence charSequence4 = this.f77499w;
            C28518ai aiVar = this.f77500x;
            C28531m mVar = this.f77501y;
            Bundle bundle = new Bundle();
            bundle.putParcelable("fh_view_finder", viewFinder);
            bundle.putInt("fh_target_view_tint_color", 0);
            bundle.putInt("fh_confining_view_id", 16908290);
            bundle.putCharSequence("fh_header_text", charSequence);
            bundle.putInt("fh_header_text_size_res", 0);
            bundle.putInt("fh_header_text_appearance", i);
            bundle.putParcelable("fh_header_text_color", colorStateList);
            bundle.putInt("fh_header_text_alignment", i2);
            bundle.putCharSequence("fh_body_text", charSequence2);
            bundle.putInt("fh_body_text_size_res", 0);
            bundle.putInt("fh_body_text_appearance", i3);
            bundle.putParcelable("fh_body_text_color", colorStateList2);
            bundle.putInt("fh_body_text_alignment", i4);
            bundle.putCharSequence("fh_dismiss_action_text", charSequence3);
            bundle.putInt("fh_dismiss_action_text_appearance", i5);
            bundle.putParcelable("fh_dismiss_action_text_color", colorStateList3);
            bundle.putParcelable("fh_dismiss_action_ripple_color", colorStateList4);
            FragmentManager fragmentManager = null;
            bundle.putParcelable("fh_dismiss_action_stroke_color", (Parcelable) null);
            bundle.putInt("fh_dismiss_action_text_alignment", i10);
            bundle.putInt("fh_dismiss_action_button_alignment", 1);
            bundle.putInt("fh_outer_color", i7);
            bundle.putInt("fh_pulse_inner_color", 0);
            bundle.putInt("fh_pulse_outer_color", 0);
            bundle.putInt("fh_scrim_color", i8);
            bundle.putInt("fh_target_text_color", 0);
            bundle.putInt("fh_target_drawable", 0);
            bundle.putInt("fh_target_drawable_color", 0);
            bundle.putBoolean("fh_target_shadow_enabled", false);
            bundle.putFloat("fh_target_scale", f);
            bundle.putString("fh_callback_id", str);
            bundle.putString("fh_task_tag", (String) null);
            bundle.putInt("fh_vertical_offset_res", i9);
            bundle.putInt("fh_horizontal_offset_res", i11);
            bundle.putInt("fh_center_threshold_res", 0);
            bundle.putBoolean("fh_task_complete_on_tap", true);
            bundle.putLong("fh_duration", j);
            bundle.putBoolean("fh_pin_to_closest_vertical_edge", false);
            bundle.putBoolean("fh_swipe_to_dismiss_enabled", z);
            bundle.putBoolean("fh_tap_to_dismiss_enabled", true);
            bundle.putInt("fh_text_vertical_gravity_hint", 0);
            bundle.putCharSequence("fh_content_description", charSequence4);
            bundle.putSerializable("fh_pulse_animation_type", aiVar);
            bundle.putSerializable("fh_feature_highlight_style", mVar);
            bundle.putInt("fh_theme_overlay", 0);
            C28530l lVar = new C28530l();
            lVar.setArguments(bundle);
            FragmentManager jw = amVar.mo545jw();
            if (!lVar.isAdded()) {
                lVar.f77539h = 1;
                C0154a aVar = new C0154a(jw);
                View findViewById = amVar.findViewById(R.id.featurehighlight_view);
                C28530l lVar2 = findViewById instanceof C28512ac ? (C28530l) findViewById.getTag(R.id.featurehighlight_view_tag_fragment) : null;
                if (lVar2 != null) {
                    fragmentManager = lVar2.getFragmentManager();
                }
                if (!(lVar2 == null || fragmentManager == null)) {
                    if (fragmentManager == jw) {
                        aVar.mo516m(lVar2);
                    } else {
                        C0154a aVar2 = new C0154a(fragmentManager);
                        aVar2.mo516m(lVar2);
                        aVar2.mo505b(false);
                        fragmentManager.mo467ah();
                    }
                }
                aVar.mo685r(lVar, "com.google.android.libraries.material.featurehighlight.FeatureHighlightFragment");
                aVar.mo505b(true);
            }
        }
    }
}
