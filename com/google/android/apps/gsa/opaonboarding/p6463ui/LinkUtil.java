package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.LinkUtil */
/* compiled from: PG */
public final class LinkUtil {

    /* renamed from: com.google.android.apps.gsa.opaonboarding.ui.LinkUtil$URLSpanNoUnderline */
    /* compiled from: PG */
    class URLSpanNoUnderline extends URLSpan {
        public URLSpanNoUnderline(String str) {
            super(str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: a */
    public static CharSequence m133791a(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(charSequence);
        m133793c(spannableString);
        return spannableString;
    }

    /* renamed from: b */
    public static CharSequence m133792b(String str) {
        Spannable spannable = (Spannable) Html.fromHtml(str);
        m133793c(spannable);
        return spannable;
    }

    /* renamed from: c */
    private static void m133793c(Spannable spannable) {
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            int spanFlags = spannable.getSpanFlags(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, spanFlags);
        }
    }
}
