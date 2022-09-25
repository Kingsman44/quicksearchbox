package com.google.android.apps.search.transcription.p10679ui;

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

/* renamed from: com.google.android.apps.search.transcription.ui.g */
/* compiled from: PG */
final class C141940g {

    /* renamed from: a */
    public final SpannableStringBuilder f385166a;

    /* renamed from: b */
    public final BreakIterator f385167b = BreakIterator.getWordInstance(Locale.getDefault());

    /* renamed from: c */
    public final ForegroundColorSpan f385168c;

    /* renamed from: d */
    public int f385169d;

    /* renamed from: e */
    public int f385170e;

    /* renamed from: f */
    private final TextPaint f385171f;

    public C141940g(Context context, TextPaint textPaint) {
        this.f385168c = new ForegroundColorSpan(C1878d.m5128a(context, R.color.google_grey500));
        this.f385166a = new SpannableStringBuilder();
        this.f385171f = textPaint;
    }

    /* renamed from: a */
    public final Layout mo116915a(String str) {
        return StaticLayout.Builder.obtain(str, 0, str.length(), this.f385171f, this.f385170e).build();
    }
}
