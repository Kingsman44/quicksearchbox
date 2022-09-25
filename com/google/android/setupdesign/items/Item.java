package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class Item extends AbstractItem {
    public Item() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo49244b() {
        return R.layout.sud_items_default;
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118394m);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.getText(4);
        obtainStyledAttributes.getText(5);
        obtainStyledAttributes.getText(6);
        obtainStyledAttributes.getResourceId(2, mo49244b());
        obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.getInt(7, 16);
        obtainStyledAttributes.recycle();
    }
}
