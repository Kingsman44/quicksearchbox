package com.google.android.libraries.lens.view.filters.carousel;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.p033v7.widget.C0673gh;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.filters.carousel.g */
/* compiled from: PG */
public final class C25951g extends C0673gh {

    /* renamed from: a */
    final TextView f70530a;

    /* renamed from: b */
    public final ViewStub f70531b = ((ViewStub) this.itemView.findViewById(R.id.filter_recommendation_stub));

    /* renamed from: c */
    public final int f70532c;

    /* renamed from: d */
    public final int f70533d;

    /* renamed from: e */
    public final Drawable f70534e;

    /* renamed from: f */
    public final LayerDrawable f70535f;

    /* renamed from: g */
    public final GradientDrawable f70536g;

    /* renamed from: h */
    public Animator f70537h;

    public C25951g(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.findViewById(R.id.filter_name);
        this.f70530a = textView;
        Context context = textView.getContext();
        this.f70532c = context.getColor(R.color.filter_name_text_selected);
        this.f70533d = context.getColor(R.color.filter_name_text_unselected);
        Drawable drawable = context.getDrawable(R.drawable.filter_carousel_item_bg_white);
        drawable.getClass();
        this.f70534e = drawable;
        LayerDrawable layerDrawable = (LayerDrawable) context.getDrawable(R.drawable.filter_carousel_item_bg);
        layerDrawable.getClass();
        this.f70535f = layerDrawable;
        GradientDrawable gradientDrawable = (GradientDrawable) layerDrawable.getDrawable(0);
        gradientDrawable.getClass();
        this.f70536g = gradientDrawable;
    }
}
