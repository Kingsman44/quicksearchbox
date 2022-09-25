package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.r */
/* compiled from: PG */
public final class C91942r {
    /* renamed from: a */
    public static final CharSequence m150865a(CharSequence charSequence, Context context, boolean z, int i, int i2) {
        String upperCase = charSequence.toString().toUpperCase(context.getResources().getConfiguration().locale);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(upperCase);
        if (z) {
            spannableStringBuilder.setSpan(new C91943s(context, i2, i), 0, upperCase.length(), 17);
        } else {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), 0, upperCase.length(), 17);
        }
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, upperCase.length(), 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.card_badge_size)), 0, upperCase.length(), 17);
        spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif-condensed"), 0, upperCase.length(), 17);
        return spannableStringBuilder;
    }
}
