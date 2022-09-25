package com.google.android.libraries.lens.view.filters.translation;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.support.p033v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.translation.tooltip.C26223d;
import com.google.android.libraries.lens.view.filters.translation.tooltip.TranslationTooltipView;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cy */
/* compiled from: PG */
public final class C26114cy {

    /* renamed from: a */
    public static final Locale f70953a = new Locale("auto");

    /* renamed from: b */
    public final Resources f70954b;

    /* renamed from: c */
    public final C26217r f70955c;

    /* renamed from: d */
    public final LinearLayout f70956d;

    /* renamed from: e */
    public final MaterialButton f70957e;

    /* renamed from: f */
    public final MaterialButton f70958f;

    /* renamed from: g */
    public final MaterialButton f70959g;

    /* renamed from: h */
    public final MaterialButton f70960h;

    /* renamed from: i */
    public final SwitchCompat f70961i;

    /* renamed from: j */
    public final TextView f70962j;

    /* renamed from: k */
    public final View f70963k;

    /* renamed from: l */
    public final ImageView f70964l;

    /* renamed from: m */
    public boolean f70965m;

    /* renamed from: n */
    public boolean f70966n;

    /* renamed from: o */
    public TranslationTooltipView f70967o;

    /* renamed from: p */
    private final ViewGroup f70968p;

    /* renamed from: q */
    private final ViewGroup f70969q;

    /* renamed from: r */
    private final ViewStub f70970r;

    /* renamed from: s */
    private final GradientDrawable f70971s;

    /* renamed from: com.google.android.libraries.lens.view.filters.translation.cy$a */
    /* compiled from: PG */
    public final class C26115a implements C47388b {
    }

    public C26114cy(View view, C26217r rVar) {
        this.f70955c = rVar;
        this.f70954b = view.getResources();
        this.f70968p = (ViewGroup) view.findViewById(R.id.translation_filter_settings);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.language_picker_background_container);
        this.f70969q = viewGroup;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.language_picker_chip);
        this.f70956d = linearLayout;
        this.f70957e = (MaterialButton) view.findViewById(R.id.source_language_button);
        this.f70958f = (MaterialButton) view.findViewById(R.id.source_language_button_large);
        this.f70959g = (MaterialButton) view.findViewById(R.id.target_language_button);
        this.f70960h = (MaterialButton) view.findViewById(R.id.target_language_button_large);
        this.f70962j = (TextView) view.findViewById(R.id.partial_translate_show_original_switch_label);
        this.f70963k = view.findViewById(R.id.partial_translate_show_original_switch_gap_view);
        SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.partial_translate_show_original_switch);
        this.f70961i = switchCompat;
        this.f70970r = (ViewStub) view.findViewById(R.id.partial_translate_tooltip_placeholder);
        this.f70964l = (ImageView) view.findViewById(R.id.translation_options_caret);
        GradientDrawable gradientDrawable = (GradientDrawable) view.getContext().getDrawable(R.drawable.language_picker_chip_background);
        gradientDrawable.getClass();
        this.f70971s = gradientDrawable;
        switchCompat.addOnLayoutChangeListener(new C26110cu(this));
        m48186i(viewGroup);
        m48186i(linearLayout);
    }

    /* renamed from: a */
    public static ColorStateList m48185a(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{i, i2});
    }

    /* renamed from: i */
    private static void m48186i(ViewGroup viewGroup) {
        viewGroup.getLayoutTransition().enableTransitionType(4);
    }

    /* renamed from: b */
    public final MaterialButton mo31299b() {
        return this.f70965m ? this.f70958f : this.f70957e;
    }

    /* renamed from: c */
    public final MaterialButton mo31300c() {
        return this.f70965m ? this.f70960h : this.f70959g;
    }

    /* renamed from: d */
    public final void mo31301d() {
        SwitchCompat switchCompat = this.f70961i;
        if (switchCompat != null) {
            switchCompat.setVisibility(8);
            this.f70962j.setVisibility(8);
            this.f70963k.setVisibility(8);
            this.f70964l.animate().rotation(0.0f).setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: e */
    public final void mo31302e() {
        if (this.f70968p.getVisibility() != 8) {
            this.f70968p.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo31303f() {
        if (this.f70968p.getVisibility() != 0) {
            this.f70968p.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void mo31304g(View view) {
        int paddingTop = this.f70956d.getPaddingTop();
        int measuredHeight = view.getMeasuredHeight();
        this.f70971s.setCornerRadius(((float) ((paddingTop + measuredHeight) + this.f70956d.getPaddingBottom())) / 2.0f);
        this.f70969q.setBackground(this.f70971s);
    }

    /* renamed from: h */
    public final void mo31305h(boolean z) {
        if (!this.f70966n) {
            return;
        }
        if (z) {
            if (this.f70967o == null) {
                ViewStub viewStub = this.f70970r;
                viewStub.setLayoutResource(R.layout.lens_translate_tooltip);
                this.f70967o = (TranslationTooltipView) viewStub.inflate();
            }
            C26223d d = this.f70967o.mo17754z();
            if (d.f71263a.getVisibility() != 0) {
                d.f71263a.setVisibility(0);
                d.f71263a.setAlpha(0.0f);
                d.f71263a.animate().alpha(1.0f).setDuration((long) d.f71264b).setListener((Animator.AnimatorListener) null);
                return;
            }
            return;
        }
        TranslationTooltipView translationTooltipView = this.f70967o;
        if (translationTooltipView != null) {
            translationTooltipView.mo17754z().mo31443a((Runnable) null);
        }
    }
}
