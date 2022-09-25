package com.google.android.apps.gsa.speech.utils.p7317ui;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;

/* renamed from: com.google.android.apps.gsa.speech.utils.ui.d */
/* compiled from: PG */
public final class C92658d {
    /* renamed from: a */
    public static void m152614a(SpannableStringBuilder spannableStringBuilder, String str, ClickableSpan clickableSpan) {
        int indexOf = spannableStringBuilder.toString().indexOf(str);
        spannableStringBuilder.setSpan(clickableSpan, indexOf, str.length() + indexOf, 33);
    }
}
