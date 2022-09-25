package com.google.android.apps.gsa.staticplugins.collectpin.pinentry;

import android.content.Context;
import android.content.res.Resources;
import android.os.PersistableBundle;
import android.support.p033v7.widget.C0508af;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.collectpin.C98491e;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58911u;

/* compiled from: PG */
public class PinEntryView extends C0508af {

    /* renamed from: a */
    public int f275046a = 4;

    /* renamed from: b */
    public C98491e f275047b;

    /* renamed from: c */
    private final float f275048c;

    /* renamed from: d */
    private final int f275049d;

    /* renamed from: e */
    private final int f275050e;

    /* renamed from: f */
    private final float f275051f;

    /* renamed from: g */
    private final float f275052g;

    public PinEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f275049d = C1878d.m5128a(context, R.color.ui_pinentry_default_color);
        this.f275050e = C1878d.m5128a(context, R.color.ui_pinentry_default_highlightColor);
        this.f275051f = resources.getDimension(R.dimen.ui_pinentry_circle_default_strokeWidth);
        this.f275052g = resources.getDimension(R.dimen.ui_pinentry_circle_default_spacing);
        this.f275048c = resources.getDimension(R.dimen.ui_pinentry_circle_default_circleSize);
    }

    /* renamed from: b */
    public final String mo91146b() {
        Editable text = getText();
        return C58911u.f156751b.mo56196q(text != null ? text.toString() : BuildConfig.FLAVOR);
    }

    /* renamed from: c */
    public final void mo91147c(String str) {
        int length = str.length();
        int i = this.f275046a;
        String substring = length > i ? str.substring(0, i) : str;
        int i2 = this.f275046a;
        if (length < i2) {
            substring = String.format("%1$-" + i2 + C59002s.f156871a, new Object[]{str});
        }
        SpannableString spannableString = new SpannableString(substring);
        int i3 = 0;
        while (i3 < substring.length()) {
            int i4 = i3 + 1;
            spannableString.setSpan(new C98499a(this.f275048c, this.f275049d, this.f275050e, this.f275051f, this.f275052g), i3, i4, 18);
            i3 = i4;
        }
        spannableString.setSpan(new TtsSpan("android.type.verbatim", PersistableBundle.EMPTY), 0, spannableString.length(), 33);
        setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setEnabled(z);
        setInputType(true != z ? 0 : 2);
        int selectionStart = getSelectionStart();
        mo91147c(mo91146b());
        setSelection(selectionStart);
    }
}
