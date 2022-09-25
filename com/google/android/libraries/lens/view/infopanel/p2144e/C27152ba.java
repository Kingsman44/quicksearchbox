package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import java.util.regex.Pattern;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.ba */
/* compiled from: PG */
final class C27152ba implements InputFilter {

    /* renamed from: a */
    private final Pattern f74188a = Pattern.compile("^(\\d{0,9})?(\\.\\d{0,2})?$");

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.f74188a.matcher(TextUtils.concat(new CharSequence[]{spanned.subSequence(0, i3), charSequence.subSequence(i, i2), spanned.subSequence(i4, spanned.length())})).matches()) {
            return BuildConfig.FLAVOR;
        }
        return null;
    }
}
