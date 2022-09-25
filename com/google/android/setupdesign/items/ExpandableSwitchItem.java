package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    /* renamed from: a */
    public boolean f118400a = false;

    public ExpandableSwitchItem() {
        new C45320a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo49244b() {
        return R.layout.sud_items_expandable_switch;
    }

    /* renamed from: c */
    public final void mo49245c(boolean z) {
        if (this.f118400a != z) {
            this.f118400a = z;
            mo49242a(0);
        }
    }

    public final void onClick(View view) {
        mo49245c(!this.f118400a);
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C45320a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118386e);
        obtainStyledAttributes.getText(0);
        obtainStyledAttributes.getText(1);
        obtainStyledAttributes.getInt(7, 48);
        obtainStyledAttributes.recycle();
    }
}
