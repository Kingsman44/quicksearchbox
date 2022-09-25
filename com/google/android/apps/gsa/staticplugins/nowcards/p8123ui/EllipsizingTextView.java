package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.util.AttributeSet;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.EllipsizingTextView */
/* compiled from: PG */
public class EllipsizingTextView extends AppCompatTextView {
    public EllipsizingTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setEllipsize(TextUtils.TruncateAt.END);
    }
}
