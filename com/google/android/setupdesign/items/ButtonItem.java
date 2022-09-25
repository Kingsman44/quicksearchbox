package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public ButtonItem() {
    }

    public final void onClick(View view) {
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118384c);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getText(3);
        obtainStyledAttributes.getResourceId(0, R.style.SudButtonItem);
        obtainStyledAttributes.recycle();
    }
}
