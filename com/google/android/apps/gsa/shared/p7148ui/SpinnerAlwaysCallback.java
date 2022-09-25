package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/* renamed from: com.google.android.apps.gsa.shared.ui.SpinnerAlwaysCallback */
/* compiled from: PG */
public class SpinnerAlwaysCallback extends Spinner {

    /* renamed from: a */
    public C90635ak f253362a;

    public SpinnerAlwaysCallback(Context context) {
        super(context);
    }

    public final void setSelection(int i) {
        getSelectedItemPosition();
        super.setSelection(i);
    }

    public SpinnerAlwaysCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpinnerAlwaysCallback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
