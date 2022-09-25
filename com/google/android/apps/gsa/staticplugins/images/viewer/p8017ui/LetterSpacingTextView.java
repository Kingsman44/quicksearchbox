package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.LetterSpacingTextView */
/* compiled from: PG */
public class LetterSpacingTextView extends TextView {
    public LetterSpacingTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo93091a() {
        setLetterSpacing(0.1f);
        setAllCaps(true);
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!TextUtils.isEmpty(charSequence)) {
            super.setText(charSequence, bufferType);
        }
    }

    public LetterSpacingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterSpacingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
