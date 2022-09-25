package com.google.android.apps.gsa.staticplugins.settings.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.C3998ax;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ImagePreference extends Preference {

    /* renamed from: a */
    private final int f325674a;

    /* renamed from: b */
    private final int f325675b;

    /* renamed from: c */
    private final int f325676c;

    /* renamed from: d */
    private final boolean f325677d;

    /* renamed from: e */
    private int f325678e;

    /* renamed from: f */
    private final String f325679f;

    /* renamed from: g */
    private final String f325680g;

    /* renamed from: h */
    private int f325681h;

    public ImagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C117325a.f325683a, 0, 0);
        this.f325678e = obtainStyledAttributes.getResourceId(6, 0);
        this.f325679f = obtainStyledAttributes.getString(4);
        this.f325680g = obtainStyledAttributes.getString(1);
        this.f325681h = obtainStyledAttributes.getColor(0, -16777216);
        this.f325674a = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.f325675b = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f325676c = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f325677d = obtainStyledAttributes.getBoolean(7, false);
        obtainStyledAttributes.recycle();
        this.f12718D = R.layout.assistant_android_settings_image_preference;
    }

    /* renamed from: a */
    public final void mo8313a(C3998ax axVar) {
        super.mo8313a(axVar);
        ImageView imageView = (ImageView) axVar.mo8435a(R.id.assistant_android_settings_image_preference_image);
        int i = this.f325678e;
        if (i != 0) {
            imageView.setImageResource(i);
        }
        if (this.f325674a != 0) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.f325674a;
            imageView.setLayoutParams(layoutParams);
        }
        int i2 = 0;
        if (this.f325679f != null) {
            imageView.setImportantForAccessibility(0);
            imageView.setContentDescription(this.f325679f);
        }
        if (this.f325680g != null) {
            TextView textView = (TextView) axVar.mo8435a(R.id.assistant_android_settings_image_preference_caption);
            textView.setText(this.f325680g);
            textView.setTextColor(this.f325681h);
            int i3 = this.f325675b;
            if (i3 != 0) {
                textView.setTextSize(0, (float) i3);
            }
            if (this.f325676c != 0) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                layoutParams2.setMargins(0, 0, 0, this.f325676c);
                textView.setLayoutParams(layoutParams2);
            }
        }
        ImageView imageView2 = (ImageView) axVar.mo8435a(R.id.assistant_android_settings_image_preference_caption_icon);
        if (true != this.f325677d) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
    }
}
