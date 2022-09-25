package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class ExpanderView extends ImageButton {

    /* renamed from: a */
    private static final int[] f393810a = {16842920};

    /* renamed from: b */
    private boolean f393811b;

    /* renamed from: c */
    private String f393812c;

    /* renamed from: d */
    private String f393813d;

    public ExpanderView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private final void m236729b(Context context) {
        Resources resources = context.getResources();
        this.f393812c = resources.getString(R.string.show_account_list);
        this.f393813d = resources.getString(R.string.hide_account_list);
    }

    /* renamed from: a */
    public final void mo121665a(boolean z) {
        String str;
        this.f393811b = z;
        if (z) {
            str = this.f393813d;
        } else {
            str = this.f393812c;
        }
        setContentDescription(str);
        refreshDrawableState();
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f393811b) {
            mergeDrawableStates(onCreateDrawableState, f393810a);
        }
        return onCreateDrawableState;
    }

    public ExpanderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236729b(context);
    }

    public ExpanderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m236729b(context);
    }
}
