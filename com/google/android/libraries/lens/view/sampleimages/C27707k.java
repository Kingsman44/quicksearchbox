package com.google.android.libraries.lens.view.sampleimages;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2052ac.C24974a;

/* renamed from: com.google.android.libraries.lens.view.sampleimages.k */
/* compiled from: PG */
public final class C27707k {

    /* renamed from: a */
    public final C27701e f75649a;

    /* renamed from: b */
    public final C27711o f75650b;

    /* renamed from: c */
    public boolean f75651c;

    /* renamed from: d */
    private final C24974a f75652d;

    public C27707k(String str, C27701e eVar, C27711o oVar, C24974a aVar) {
        this.f75649a = eVar;
        this.f75650b = oVar;
        this.f75651c = Boolean.parseBoolean(str);
        this.f75652d = aVar;
    }

    /* renamed from: a */
    public final void mo33186a(View view) {
        Button button = (Button) view.findViewById(R.id.sample_images_post_result_dialog_open_gallery_button);
        Button button2 = (Button) view.findViewById(R.id.sample_images_post_result_dialog_open_settings_button);
        if (this.f75651c) {
            button.setVisibility(8);
            button2.setVisibility(0);
            return;
        }
        button.setVisibility(0);
        button2.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo33187b(View view) {
        int i = (C24974a.m46225a(this.f75652d.f68122a) || this.f75649a.getContext().getResources().getConfiguration().orientation != 2) ? 0 : 1;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.sample_images_post_result_dialog_buttons);
        linearLayout.setOrientation(i ^ 1);
        for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
            View childAt = linearLayout.getChildAt(i2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            layoutParams.width = 1 != i ? -1 : 0;
            layoutParams.weight = 1 != i ? 0.0f : 1.0f;
            childAt.setLayoutParams(layoutParams);
        }
        View findViewById = linearLayout.findViewById(R.id.sample_images_post_result_dialog_dismiss_button);
        linearLayout.removeView(findViewById);
        if (i != 0) {
            linearLayout.addView(findViewById, 0);
        } else {
            linearLayout.addView(findViewById);
        }
    }
}
