package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.shared;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.shared.a */
/* compiled from: PG */
public final class C106819a extends LinearLayout {
    public C106819a(Context context) {
        super(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(R.layout.aa_generic_card, this);
        setMinimumHeight(getContext().getResources().getDimensionPixelSize(R.dimen.aa_generic_tile_minimum_height));
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.aa_generic_tile_padding);
        mo95680b().setPaddingRelative(dimensionPixelSize, dimensionPixelSize, getContext().getResources().getDimensionPixelSize(R.dimen.aa_generic_tile_chevron_end_padding), 0);
        ImageView imageView = (ImageView) mo95680b().findViewById(R.id.aa_icon);
        imageView.getClass();
        imageView.setVisibility(8);
        ImageView imageView2 = (ImageView) mo95680b().findViewById(R.id.aa_generic_chevron);
        imageView2.getClass();
        imageView2.setVisibility(8);
        setBackground(context.getResources().getDrawable(R.drawable.aa_generic_chip_container_no_ripples, context.getTheme()));
    }

    /* renamed from: a */
    public final int mo95679a() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.aa_generic_tile_padding);
    }

    /* renamed from: b */
    public final ViewGroup mo95680b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.aa_generic_card_header_row);
        viewGroup.getClass();
        return viewGroup;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TextView textView = (TextView) findViewById(R.id.generic_card_view_more_row);
        textView.getClass();
        setPaddingRelative(0, 0, 0, textView.getVisibility() == 8 ? mo95679a() : 0);
        super.onMeasure(i, i2);
    }
}
