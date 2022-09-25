package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.al */
/* compiled from: PG */
public final class C138633al {

    /* renamed from: a */
    private static final Pattern f377032a = Pattern.compile("<(/?b)>");

    /* renamed from: b */
    private static final MetricAffectingSpan f377033b = new C138632ak();

    /* renamed from: c */
    private final Context f377034c;

    /* renamed from: d */
    private final boolean f377035d;

    public C138633al(Context context, boolean z) {
        this.f377034c = context;
        this.f377035d = z;
    }

    /* renamed from: a */
    static CharSequence m225149a(String str) {
        return f377032a.matcher(str).replaceAll(BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    private final void m225150c(SpannableStringBuilder spannableStringBuilder, String str, boolean z) {
        if (!str.isEmpty()) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(str);
            boolean z2 = this.f377035d;
            int i = true != z2 ? R.color.agsa_color_custom_suggestion_on_surface : R.color.googleapp_pixel_suggestion_text;
            int i2 = true != z2 ? R.color.agsa_color_custom_suggestion_on_surface_variant : R.color.googleapp_pixel_suggestion_secondary_text;
            Resources resources = this.f377034c.getResources();
            if (true != z) {
                i = i2;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(resources.getColor(i)), length, spannableStringBuilder.length(), 0);
            spannableStringBuilder.setSpan(f377033b, length, spannableStringBuilder.length(), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Spanned mo114441b(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Matcher matcher = f377032a.matcher(str);
        int i = 0;
        boolean z = false;
        while (matcher.find()) {
            m225150c(spannableStringBuilder, str.substring(i, matcher.start()), z);
            i = matcher.end();
            z = !z;
        }
        m225150c(spannableStringBuilder, str.substring(i), z);
        return spannableStringBuilder;
    }
}
