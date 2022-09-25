package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ct */
/* compiled from: PG */
final class C126840ct {

    /* renamed from: a */
    public final SpannableStringBuilder f349304a;

    /* renamed from: b */
    public final BreakIterator f349305b = BreakIterator.getWordInstance(Locale.getDefault());

    /* renamed from: c */
    public final ForegroundColorSpan f349306c;

    /* renamed from: d */
    public int f349307d;

    /* renamed from: e */
    public int f349308e;

    /* renamed from: f */
    private final TextPaint f349309f;

    public C126840ct(Context context, TextPaint textPaint) {
        this.f349306c = new ForegroundColorSpan(C1878d.m5128a(context, R.color.google_grey500));
        this.f349304a = new SpannableStringBuilder();
        this.f349309f = textPaint;
    }

    /* renamed from: a */
    public final Layout mo107827a(String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), this.f349309f, this.f349308e).build();
    }
}
