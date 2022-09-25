package com.google.android.libraries.lens.view.onboarding;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.lens.view.onboarding.av */
/* compiled from: PG */
public final /* synthetic */ class C27489av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TextView f75168a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f75169b;

    /* renamed from: c */
    public final /* synthetic */ Drawable f75170c;

    /* renamed from: d */
    public final /* synthetic */ SpannableString f75171d;

    /* renamed from: e */
    public final /* synthetic */ int f75172e;

    /* renamed from: f */
    public final /* synthetic */ int f75173f;

    /* renamed from: g */
    public final /* synthetic */ TextView f75174g;

    public /* synthetic */ C27489av(TextView textView, Drawable drawable, Drawable drawable2, SpannableString spannableString, int i, int i2, TextView textView2) {
        this.f75168a = textView;
        this.f75169b = drawable;
        this.f75170c = drawable2;
        this.f75171d = spannableString;
        this.f75172e = i;
        this.f75173f = i2;
        this.f75174g = textView2;
    }

    public final void onClick(View view) {
        TextView textView = this.f75168a;
        Drawable drawable = this.f75169b;
        Drawable drawable2 = this.f75170c;
        SpannableString spannableString = this.f75171d;
        int i = this.f75172e;
        int i2 = this.f75173f;
        TextView textView2 = this.f75174g;
        int visibility = textView.getVisibility();
        textView.setVisibility(visibility == 8 ? 0 : 8);
        if (visibility != 8) {
            drawable = drawable2;
        }
        spannableString.setSpan(new C27492ay(drawable, i), i2 - 1, i2, 0);
        textView2.setText(spannableString);
    }
}
