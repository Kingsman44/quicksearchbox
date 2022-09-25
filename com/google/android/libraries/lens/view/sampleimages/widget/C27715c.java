package com.google.android.libraries.lens.view.sampleimages.widget;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.common.RoundedImageView;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.media.C47449e;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.widget.c */
/* compiled from: PG */
public final class C27715c {

    /* renamed from: a */
    public final C47274n f75672a;

    /* renamed from: b */
    public final C47449e f75673b;

    /* renamed from: c */
    public final RoundedImageView f75674c;

    /* renamed from: d */
    private final RoundedImageView f75675d;

    public C27715c(SampleImageCard sampleImageCard, C47274n nVar, C47449e eVar, TypedArray typedArray) {
        LayoutInflater.from(nVar).inflate(R.layout.sample_image_card, sampleImageCard);
        this.f75672a = nVar;
        this.f75673b = eVar;
        RoundedImageView roundedImageView = (RoundedImageView) sampleImageCard.findViewById(R.id.sample_image_card_image);
        roundedImageView.getClass();
        this.f75674c = roundedImageView;
        RoundedImageView roundedImageView2 = (RoundedImageView) sampleImageCard.findViewById(R.id.sample_image_card_scrim);
        roundedImageView2.getClass();
        this.f75675d = roundedImageView2;
        TextView textView = (TextView) sampleImageCard.findViewById(R.id.sample_image_card_text);
        textView.getClass();
        if (typedArray != null) {
            int[] iArr = C27713a.f75670a;
            textView.setText(typedArray.getString(0));
        }
    }

    /* renamed from: a */
    public final void mo33197a(float f, float f2, float f3, float f4) {
        this.f75674c.mo17754z().mo30897a(f, f2, f3, f4);
        this.f75675d.mo17754z().mo30897a(0.0f, 0.0f, f3, f4);
    }
}
