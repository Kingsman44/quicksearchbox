package com.google.android.apps.search.podcasts.widgets.p10622d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.core.widget.C2134u;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.d.a */
/* compiled from: PG */
public final class C141219a {
    /* renamed from: a */
    public static final void m229227a(TextView textView, Context context) {
        C69664n.m101061g(textView, "textView");
        C69664n.m101061g(context, "context");
        Drawable drawable = context.getDrawable(R.drawable.podcasts_explicit_label);
        C69664n.m101058d(drawable);
        drawable.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.podcasts_explicit_label_padded_width), context.getResources().getDimensionPixelSize(R.dimen.podcasts_explicit_label_height));
        drawable.setTint(context.getColor(R.color.google_orange500));
        C2134u.m5912d(textView, (Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    /* renamed from: b */
    public static final void m229228b(TextView textView, Context context) {
        C69664n.m101061g(textView, "textView");
        C69664n.m101061g(context, "context");
        Drawable drawable = context.getDrawable(R.drawable.podcasts_explicit_label_large);
        C69664n.m101058d(drawable);
        drawable.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.podcasts_explicit_label_padded_width_large), context.getResources().getDimensionPixelSize(R.dimen.podcasts_explicit_label_height_large));
        drawable.setTint(context.getColor(R.color.google_orange500));
        String obj = textView.getText().toString();
        ImageSpan imageSpan = new ImageSpan(drawable, 1);
        String string = context.getString(R.string.podcasts_explicit_content_label);
        C69664n.m101060f(string, "context.getString(R.stri…s_explicit_content_label)");
        SpannableString spannableString = new SpannableString(obj + " " + string);
        spannableString.setSpan(imageSpan, obj.length(), obj.length() + 1 + string.length(), 33);
        textView.setText(spannableString);
    }

    /* renamed from: c */
    public static final void m229229c(TextView textView) {
        C69664n.m101061g(textView, "textView");
        C2134u.m5912d(textView, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
