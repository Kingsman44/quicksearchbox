package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.a */
/* compiled from: PG */
public final class C141497a {

    /* renamed from: a */
    public String f384087a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f384088b;

    /* renamed from: c */
    public int f384089c;

    /* renamed from: d */
    private final PhonemeView f384090d;

    /* renamed from: e */
    private SpannableString f384091e = new SpannableString(BuildConfig.FLAVOR);

    public C141497a(PhonemeView phonemeView) {
        this.f384090d = phonemeView;
    }

    /* renamed from: a */
    public final void mo116517a(boolean z) {
        if (z) {
            this.f384090d.setCompoundDrawablesRelativeWithIntrinsicBounds((int) R.drawable.pronunciationlearning_stop_tts_icon, 0, 0, 0);
        } else {
            this.f384090d.setCompoundDrawablesRelativeWithIntrinsicBounds((int) R.drawable.pronunciationlearning_start_tts_icon, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public final void mo116518b(CharSequence charSequence, String str) {
        this.f384087a = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f384091e);
        spannableStringBuilder.append(charSequence, 0, charSequence.length());
        this.f384090d.setText(spannableStringBuilder);
    }

    /* renamed from: c */
    public final void mo116519c(String str) {
        SpannableString spannableString = new SpannableString(str);
        this.f384091e = spannableString;
        spannableString.setSpan(new RelativeSizeSpan(0.6f), 0, this.f384091e.length(), 0);
        this.f384091e.setSpan(new ForegroundColorSpan(C1878d.m5128a(this.f384090d.getContext(), R.color.agsa_color_on_background_variant)), 0, this.f384091e.length(), 0);
    }
}
