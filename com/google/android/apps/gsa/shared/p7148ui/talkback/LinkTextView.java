package com.google.android.apps.gsa.shared.p7148ui.talkback;

import android.content.Context;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.setupdesign.p3552a.C45284a;

@ProguardMustNotDelete
/* renamed from: com.google.android.apps.gsa.shared.ui.talkback.LinkTextView */
/* compiled from: PG */
public class LinkTextView extends TextView {

    /* renamed from: a */
    private C45284a f253740a;

    public LinkTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if ((charSequence instanceof Spanned) && ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length > 0) {
            setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C45284a aVar = new C45284a();
        this.f253740a = aVar;
        C2043bi.m5526T(this, aVar);
    }
}
