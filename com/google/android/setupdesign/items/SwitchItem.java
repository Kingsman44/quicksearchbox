package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public SwitchItem() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo49244b() {
        return R.layout.sud_items_switch;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118398q);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
