package com.google.android.libraries.lens.view.p2065ai;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.lens.view.ai.g */
/* compiled from: PG */
final class C25169g {
    /* renamed from: a */
    static ImageView m46530a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) layoutInflater.inflate(R.layout.overlay_button, viewGroup, false);
        imageView.addOnLayoutChangeListener(new C25168f(imageView));
        return imageView;
    }
}
