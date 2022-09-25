package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.material.timepicker.n */
/* compiled from: PG */
final class C44990n implements InputFilter {

    /* renamed from: a */
    private final int f117576a;

    public C44990n(int i) {
        this.f117576a = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f117576a) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
